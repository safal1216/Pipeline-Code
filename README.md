# Automation Framework

This repository contains a BDD-based automation framework for testing web applications. The framework is built using Cucumber, Selenium, and TestNG, and follows the Page Object Model (POM) design pattern.

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
3. Update the `config.properties` file with the required configurations (e.g., browser, base URL).
4. Run the `TestRunner.java` file to execute the tests.

## Dependencies

The `pom.xml` file includes the following dependencies:
- Cucumber
- Selenium
- TestNG
- Maven Surefire Plugin

## Contribution

Feel free to fork the repository and submit pull requests for any enhancements or bug fixes.
