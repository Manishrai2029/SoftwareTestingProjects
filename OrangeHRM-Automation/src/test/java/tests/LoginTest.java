package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.ExcelUtils;
import utilities.ExtentReportManager;
import utilities.ScreenshotUtils;

import java.io.IOException;
import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    ExtentReports report;
    ExtentTest logger;

    @BeforeClass
    public void setupReport() {
        report = ExtentReportManager.getReportInstance();
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void loginDataDrivenTest() throws IOException, InterruptedException {
        ExcelUtils.setExcelFile("testdata/LoginData.xlsx");
        int rows = ExcelUtils.getRowCount();

        for (int i = 1; i <= rows; i++) {
            String username = ExcelUtils.getCellData(i, 0);
            String password = ExcelUtils.getCellData(i, 1);

            logger = report.createTest("Login Test with: " + username + "/" + password);

            LoginPage loginPage = new LoginPage(driver);
            loginPage.login(username, password);
            Thread.sleep(2000);

            DashboardPage dashboard = new DashboardPage(driver);

            if (username.equals("Admin") && password.equals("admin123")) {
                Assert.assertTrue(dashboard.isDashboardVisible(), "Login should succeed");
                logger.pass("Login successful with valid credentials.");
                dashboard.logout();
            } else {
                Assert.assertFalse(driver.getCurrentUrl().contains("dashboard"), "Login should fail");
                logger.pass("Login failed with invalid credentials as expected.");
            }

            String screenshotPath = ScreenshotUtils.takeScreenshot(driver, "LoginTest_" + i);
            logger.addScreenCaptureFromPath(screenshotPath);
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @AfterClass
    public void flushReport() {
        report.flush();
    }
}
