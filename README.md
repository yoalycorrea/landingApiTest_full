
# landingApiTest_full

Automated API testing project using **Java**, **RestAssured**, **Cucumber**, **JUnit**, and **ExtentReports**.  
This project is designed to test the [NTT Global Services landing page endpoint](https://services.global.ntt/en-us/landing-page/).

---

## 🧪 Tech Stack

- **Java 17+**
- **RestAssured** – for HTTP request testing
- **Cucumber** – for BDD-style scenarios
- **JUnit Platform** – test execution
- **ExtentReports** – reporting and visualization
- **Maven** – build tool
- **IntelliJ IDEA** – development environment

---

## ✅ Features

- Validates response status code of public NTT endpoint
- BDD Feature file with Gherkin syntax
- Step definitions implemented with RestAssured
- Custom Extent Report for visual output

---

## 📁 Project Structure

```
landingApiTest_full/
├── src/
│   ├── main/
│   └── test/
│       ├── java/
│       │   └── com.example.landingapitest/
│       │       ├── cucumber/
│       │       │   ├── LandingNttStepDefs.java
│       │       │   └── LandingNttTestRunner.java
│       │       └── rest/
│       │           └── ExtentReportHooks.java
│       └── resources/
│           └── features/
│               └── LandingNtt.feature
├── pom.xml
```

---

## 🚀 How to Run

```bash
mvn clean verify
```

---

## 📊 Reporting

After execution, open the following file in your browser:

```
target/extent-report/landing-api-report.html
```

> ✔️ This is automatically generated using ExtentReports.

---

