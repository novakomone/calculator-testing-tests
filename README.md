# Calculator Unit Testing — TestNG & Allure

## Project Overview

This project contains automated unit tests for the EPAM Calculator 1.0 library.

The tests verify arithmetic operations, mathematical functions, trigonometric functions, and number validation.

The project demonstrates unit testing with TestNG, data-driven testing, test groups, parallel execution, and Allure reporting.

## Technologies

- Java 17
- TestNG 7.10.2
- Maven
- Maven Surefire Plugin 3.2.5
- Allure TestNG 2.29.1
- Allure Maven Plugin 2.12.0
- EPAM Calculator 1.0
- IntelliJ IDEA

## Test Organization

The project contains 12 test classes, each responsible for testing one Calculator method.

| Test Class | Method |
|---|---|
| SumTest | sum() |
| SubTest | sub() |
| MultTest | mult() |
| DivTest | div() |
| PowTest | pow() |
| SqrtTest | sqrt() |
| TgTest | tg() |
| CtgTest | ctg() |
| CosTest | cos() |
| SinTest | sin() |
| IsPositiveTest | isPositive() |
| IsNegativeTest | isNegative() |

The tests are organized into four TestNG groups:

- `arithmetic`
- `math`
- `trigonometry`
- `validation`

Test data is provided using TestNG `@DataProvider` annotations.

Test setup and cleanup use TestNG lifecycle annotations, including `@BeforeMethod` and `@AfterMethod`.

The `testng.xml` configuration supports parallel execution of test classes using four threads.

## Running Tests

### Prerequisites

- Java 17
- Maven
- EPAM Calculator 1.0 library installed in the local Maven repository

The Calculator JAR is referenced as a Maven dependency.

### Execute Tests

Run the complete test suite from the project root:

```bash
mvn clean test
```

Alternatively, run the `testng.xml` configuration directly in IntelliJ IDEA.

The suite includes grouped tests and parallel execution.

## Test Execution Results

Results from the complete TestNG suite:

| Metric | Result |
|---|---:|
| Total tests | 63 |
| Passed | 53 |
| Failed | 10 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 84.12% |

The failed assertions indicate observed discrepancies between expected and actual results returned by the Calculator library.

Maven reports `BUILD FAILURE` when test assertions fail. This is expected behavior for the current test execution.

## Known Defects

### DEF-001 — Incorrect Cosine Calculation

The `cos()` method returns incorrect values for some inputs.

Example:

- Input: `0`
- Expected: `1.0`
- Actual: `0.0`

Affected test class: `CosTest`.

### DEF-002 — Incorrect Cotangent Calculation

The `ctg()` method returns incorrect values for some inputs.

Example:

- Input: `π/4`
- Expected: approximately `1.0`
- Actual: approximately `0.655794`

Affected test class: `CtgTest`.

### DEF-003 — Incorrect Tangent Calculation

The `tg()` method returns incorrect values for some inputs.

Examples include incorrect results for negative angles and angles where the expected tangent is zero.

Affected test class: `TgTest`.

These defects are based on observed test failures and should be investigated in the Calculator library implementation.

## Allure Reporting

The project integrates Allure with TestNG to generate detailed test execution reports.

Allure provides:

- Test execution statistics
- Passed and failed test results
- Test suite organization
- Assertion failure details
- Test execution duration

### Generate Allure Report

After running the tests, execute:

```bash
mvn allure:report
```

### Open Allure Report

```bash
mvn allure:serve
```

Allure results are configured to be stored in:

`target/allure-results`

The report can be viewed in a web browser.

## Test Execution Evidence

Screenshots of test execution results are available in the `screenshots/` directory.

The evidence includes:

- Allure Overview dashboard
- TestNG execution results in IntelliJ IDEA
- Examples of failed assertions

## Conclusion

The project demonstrates automated unit testing of the EPAM Calculator library using TestNG and Maven.

It includes 12 test classes, data-driven testing, test groups, parallel execution, and Allure reporting.

The complete suite executes 63 test cases, with 53 passing and 10 failing due to observed calculation discrepancies.

The test results and reports provide evidence of the detected issues.