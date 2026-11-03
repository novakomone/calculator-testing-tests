# Calculator Unit Testing — TestNG

## Project Overview

This project contains automated unit tests for the EPAM Calculator library.

The tests verify arithmetic operations, mathematical functions, trigonometric functions, and number validation.

## Technologies

- Java 17
- TestNG 7.10.2
- Maven
- Maven Surefire Plugin 3.2.5
- EPAM Calculator 1.0

## Test Organization

The project contains 11 test classes organized into four TestNG groups:

- `arithmetic`
- `math`
- `trigonometry`
- `validation`

Test data is provided using TestNG `@DataProvider` annotations.

The test suite supports parallel execution of test classes using four threads.

## Running Tests

Install the Calculator library in the local Maven repository before running the tests.

Execute the test suite from the project root:

```bash
mvn clean test
```

## Test Execution Results

| Metric | Result |
|---|---:|
| Total tests | 59 |
| Passed | 52 |
| Failed | 7 |
| Errors | 0 |
| Skipped | 0 |

## Known Defects

**DEF-001 — Incorrect cosine calculation**

The `cos()` method returns incorrect values. For example, `cos(0)` returns `0.0` instead of `1.0`.

Affected class: `CosTest`.

**DEF-002 — Incorrect cotangent calculation**

The `ctg()` method returns incorrect values. For example, `ctg(π/4)` returns approximately `0.655794` instead of `1.0`.

Affected class: `CtgTest`.

## Conclusion

The test suite executes successfully, including parallel execution. Seven assertions fail because of observed defects in the Calculator library.

Maven reports `BUILD FAILURE` because the tests correctly detect these discrepancies.