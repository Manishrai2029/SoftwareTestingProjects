# Software Testing Projects

![Java](https://img.shields.io/badge/Code-Java-blue) 
![Selenium](https://img.shields.io/badge/Automation-Selenium-brightgreen) 
![TestNG](https://img.shields.io/badge/Framework-TestNG-orange) 
![Postman](https://img.shields.io/badge/API-Postman-critical) 
![RestAssured](https://img.shields.io/badge/API-RestAssured-yellowgreen)
![ExtentReports](https://img.shields.io/badge/Reports-ExtentReports-blueviolet)

This repository contains my **capstone projects** showcasing expertise in **manual and automation testing** across **web, API, and e-commerce domains**.  
Each project demonstrates structured test planning, modular frameworks, and detailed reporting.

---

## 📂 Project List

<details>
<summary>1. **Orange HRM Automation (HR Domain)**</summary>

- **Description:**  
  Automated **Login** and **Admin > User Management** modules in OrangeHRM.  
  Implemented a **Page Object Model (POM)** framework with data-driven testing.  
  Enhanced validation using TestNG assertions and generated Extent Reports.  

- **Tech Stack:**  
  `Java` `Selenium WebDriver` `TestNG` `Maven` `Apache POI` `Extent Reports`

- **Key Features:**  
  - POM-based modular framework  
  - Data-driven testing with Excel (Apache POI)  
  - Assertion-based validation with TestNG  
  - Screenshots on failure  
  - Detailed Extent Reports  

- **Screenshots:**  
  ![Extent Report Sample](screenshots/orangehrm_extent.png)  
  *(Add actual screenshot in `screenshots/` folder)*

</details>

---

<details>
<summary>2. **API Testing for Contact List Application (Telecom Domain)**</summary>

- **Description:**  
  API testing for [Contact List Application](https://thinking-tester-contact-list.herokuapp.com/).  
  Covered **authentication, user creation, contact addition, updates, and logout flow** using **Postman** and **Rest Assured**.

- **Tech Stack:**  
  `Postman` `Rest Assured` `Chai Assertions`

- **Key Features:**  
  - Automated API test scripts  
  - Validated **status codes**, **headers**, and **payloads**  
  - Detailed test coverage reports  

- **Screenshots:**  
  ![Postman Report](screenshots/api_postman_report.png)  
  *(Add actual screenshot in `screenshots/` folder)*

</details>

---

<details>
<summary>3. **E-Commerce Automation for bstackdemo.com**</summary>

- **Description:**  
  Designed and implemented a **modular POM-based framework** for [bstackdemo.com](https://bstackdemo.com).  
  Automated **Login**, **Product Filtering**, **Cart Verification**, and **Checkout** flows.  
  Integrated **cross-browser testing** and **reporting**.

- **Tech Stack:**  
  `Java` `Selenium WebDriver` `TestNG` `Maven` `Extent Reports`

- **Key Features:**  
  - Modular POM framework  
  - End-to-end functional automation  
  - Cross-browser testing  
  - Enhanced reporting with Extent Reports  

- **Screenshots:**  
  ![E-commerce Test Report](screenshots/bstack_extent.png)  
  *(Add actual screenshot in `screenshots/` folder)*

</details>

---

## 📑 Templates

This repository also includes **standard QA templates** used across all projects.  

### **1. Test Plan**
- Defines **scope**, **objectives**, and **testing approach** for each project.  
- Outlines **test environments**, **tools**, and **resources** required.  
- Includes **entry and exit criteria**, along with a **risk assessment**.  

### **2. Test Cases**
- Contains **detailed step-by-step scenarios** for validating application features.  
- Each case includes **preconditions**, **test steps**, **expected results**, and **status tracking**.  
- Covers **positive, negative, and edge cases** to ensure full functional coverage.  

### **3. Bug Report**
- Standardized format for **logging defects** with clear **severity** and **priority** levels.  
- Captures **issue description**, **steps to reproduce**, **actual vs expected results**, and **attachments** (screenshots/logs).  
- Ensures **traceability** from defects back to test cases and requirements.  

### **4. RTM (Requirement Traceability Matrix)**
- Maps **requirements to test cases** ensuring **complete coverage**.  
- Helps track which requirements are **tested, partially tested, or untested**.  
- Assists in **impact analysis** when requirements change.  

### **5. Test Reports**
- Provides a **summary of test execution** (pass/fail counts, defect density, coverage).  
- Includes **screenshots**, **logs**, and **Extent Report outputs** for better visibility.  
- Shared with stakeholders for **transparent project status updates**.  

### **6. Test Metrics**
- Tracks **KPIs** like defect density, test execution progress, and coverage percentage.  
- Provides insights for **continuous improvement** in testing processes.  
- Helps in **decision-making** for releases and next phases.  

---

## 🤝 Contributing
Feedback and suggestions are welcome! Please feel free to open an issue or submit a pull request.

---

## 📜 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
