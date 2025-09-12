# BDD Automation Framework

This repository contains a Behavior-Driven Development (BDD) automation framework built using Cucumber, Selenium, and TestNG. The framework is designed to test the functionalities of a public domain website.

## Project Structure

```
(Cucumber Framework)
├── README.md (Documentation: framework overview, setup instructions)
├── pom.xml (Maven: manage essential dependencies for Cucumber, Selenium, TestNG)
├── testng.xml (TestNG: define and manage execution flow)
├── src
│   ├── main
│   │   └── java (Placeholder for app-specific utility classes, if needed)
│   └── test
│       ├── java
│       │   ├── base (Reusable base classes for setup/teardown)
│       │   │   └── BaseClass.java (Handles WebDriver setup/management)
│       │   ├── pages (Page Object Model classes)
│       │   │   └── HomePage.java (Encapsulates locators and actions specific to HomePage)
│       │   ├── steps (Step Definitions bridging feature files to POM actions)
│       │   │   ├── HomeSteps.java (Step Definitions for HomePage scenarios)
│       │   │   └── CommonSteps.java (Reusable step definitions shared across features)
│       │   └── utils (Utility classes to support your framework)
│       │       ├── DriverFactory.java (Centralized WebDriver initialization and management)
│       │       └── ConfigReader.java (Properties reader for environment setup)
│       ├── resources
│       │   ├── features (Feature files written in Gherkin syntax)
│       │   │   └── HomePage.feature (Scenarios tied to HomePage user stories)
│       │   ├── config (Environment or project-specific settings)
│       │   │   └── config.properties (Stores details like browser, base URL)
│       │   ├── log (Dynamic logs to trace test execution)
│       │   │   └── (Log files auto generated at runtime)
│       │   └── runners (Cucumber Test Runners)
│       │       └── TestRunner.java (Executes defined feature file scenarios)
├── target (Generated directory containing reports, build artifacts)
```

## Setup Instructions

1. Clone the repository.
2. Import the project into your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
3. Update the `config.properties` file with the required configurations (e.g., browser type, base URL).
4. Run the `TestRunner.java` file to execute the test cases.

## Dependencies

The `pom.xml` file includes the following dependencies:
- Cucumber
- Selenium
- TestNG
- Maven Surefire Plugin

## Execution

To execute the test cases, run the `TestRunner.java` file or use the Maven command:
```
mvn test
```

## Reporting

Test execution reports are generated in the `target` directory. Open the `cucumber-reports.html` file to view the detailed test report.
