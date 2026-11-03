# Calculator Unit Testing — TestNG & Allure

## Project Overview

This project contains automated unit tests for the EPAM Calculator library.

The purpose of the project is to validate calculator functionality and demonstrate automated testing practices using Java, TestNG, Maven, and Allure.

The test suite covers arithmetic operations, mathematical functions, trigonometric functions, and number validation.

## Technologies

- Java 17
- TestNG 7.10.2
- Maven
- Maven Surefire Plugin 3.2.5
- Allure TestNG 2.29.1
- Allure Maven Plugin 2.12.0
- EPAM Calculator 1.0

## Test Coverage

The project contains 12 test classes covering the following Calculator methods:

| Category | Methods |
|---|---|
| Arithmetic | `sum()`, `sub()`, `mult()`, `div()` |
| Mathematics | `pow()`, `sqrt()` |
| Trigonometry | `sin()`, `cos()`, `tg()`, `ctg()` |
| Validation | `isPositive()`, `isNegative()` |

Arithmetic tests cover both `long` and `double` method overloads.

The suite includes positive, negative, zero, boundary, and invalid-input scenarios where applicable.

## Test Framework Features

- Separate test classes for individual Calculator methods
- Data-driven testing using TestNG `@DataProvider`
- Test lifecycle management using `@BeforeMethod` and `@AfterMethod` where applicable
- Test grouping by functionality
- Parallel test execution using four threads
- Maven-based test execution
- Allure test reporting

## Project Structure

```text
calculator-testing-tests/
├── libs/
│   └── calculator-1.0.jar
├── src/
│   └── test/
│       ├── java/
│       │   └── com/epam/calculator/tests/
│       │       └── *Test.java
│       └── resources/
│           └── allure.properties
├── screenshots/
├── pom.xml
├── testng.xml
└── README.md
```

## Prerequisites

- JDK 17
- Apache Maven
- IntelliJ IDEA (optional)

## Setup

Clone the repository and navigate to the project directory.

The Calculator library is provided in the `libs/` directory and must be installed in the local Maven repository before running the tests.

```bash
mvn install:install-file -Dfile=libs/calculator-1.0.jar -DgroupId=com.epam.tat -DartifactId=calculator -Dversion=1.0 -Dpackaging=jar
```

## Running Tests

Run the complete test suite:

```bash
mvn clean test
```

Alternatively, execute `testng.xml` directly from IntelliJ IDEA.

The TestNG suite is configured with four functional groups:

- `arithmetic`
- `math`
- `trigonometry`
- `validation`

Parallel execution is configured at the class level using four threads.

## Allure Reporting

The project integrates Allure for detailed test execution reporting.

After executing the tests, generate a report:

```bash
mvn allure:report
```

To generate and open the report in a browser:

```bash
mvn allure:serve
```

Test execution results are stored in:

`target/allure-results`

Allure provides test statistics, execution details, assertion failures, and test suite information.

## Test Results and Known Issues

The test suite validates actual Calculator results against expected behavior.

Some tests may fail due to discrepancies in the Calculator library implementation.

Such failures are intentionally preserved to document unexpected behavior rather than modifying assertions to match incorrect results.

Maven may report `BUILD FAILURE` when test assertions fail.

Detailed execution results and failure information are available in Allure reports.

Screenshots of test executions are available in the `screenshots/` directory.

## Conclusion

This project demonstrates automated unit testing using Java, TestNG, Maven, and Allure.

It provides reusable, data-driven tests, grouped and parallel execution, and detailed reporting to support validation and defect investigation.