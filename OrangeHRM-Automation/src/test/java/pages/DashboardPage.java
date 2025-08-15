package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    By profileIcon = By.className("oxd-userdropdown-name");
    By logoutButton = By.xpath("//a[text()='Logout']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDashboardVisible() {
        return driver.getCurrentUrl().contains("dashboard");
    }

    public void logout() {
        driver.findElement(profileIcon).click();
        driver.findElement(logoutButton).click();
    }
}
