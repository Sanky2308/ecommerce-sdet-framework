# E-Commerce SDET Automation Framework

A Java-based QA automation framework built to demonstrate UI automation, API testing, reporting, CI execution, and Docker-based test execution for an e-commerce application.

This project is designed as a professional SDET portfolio project and showcases practical automation skills used in real QA teams.

---

## Tech Stack

| Area | Tool |
|---|---|
| Language | Java 17 |
| Build Tool | Maven |
| Test Runner | TestNG |
| UI Automation | Playwright |
| API Testing | REST Assured |
| Reporting | Allure Reports |
| CI/CD | GitHub Actions |
| Containerization | Docker |
| Configuration | Properties File |

---

## What This Framework Covers

- UI smoke testing using Playwright
- API smoke testing using REST Assured
- Test execution using TestNG
- Configuration management using `config.properties`
- Allure reporting integration
- GitHub Actions CI pipeline
- Docker-based test execution
- Portfolio screenshots for execution proof

---

## Project Structure

```text
ecommerce-sdet-framework
├── .github
│   └── workflows
│       └── ci.yml
├── docs
│   └── screenshots
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── api
│   │   │   ├── config
│   │   │   ├── models
│   │   │   └── pages
│   │   └── resources
│   │       └── config.properties
│   └── test
│       ├── java
│       │   ├── api
│       │   ├── database
│       │   ├── sample
│       │   └── ui
│       └── resources
│           └── testng-full.xml
├── Dockerfile
├── .dockerignore
├── pom.xml
└── README.md
```

---

## Framework Flow

```text
TestNG Suite
    |
    +-- UI Tests      -> Playwright
    |
    +-- API Tests     -> REST Assured
    |
    +-- Smoke Checks  -> Framework sanity validation
    |
    +-- Reporting     -> Allure Results
    |
    +-- CI Execution  -> GitHub Actions
    |
    +-- Docker Run    -> Containerized Maven execution
```

---

## Test Coverage

### UI Test

The Playwright UI smoke test launches Chromium in headless mode, opens the configured application URL, reads the page title, and verifies that the application loads successfully.

### API Test

The REST Assured API smoke test calls the product list endpoint and validates:

- HTTP status code
- Response body content

### Framework Smoke Tests

The project includes lightweight smoke tests to verify that the framework layers execute correctly through TestNG.

---

## How to Run Tests Locally

```bash
mvn clean test
```

Expected result:

```text
BUILD SUCCESS
```

---

## How to Run Tests with Docker

Build the Docker image:

```bash
docker build -t ecommerce-sdet-framework .
```

Run the test suite inside Docker:

```bash
docker run --rm ecommerce-sdet-framework
```

Expected result:

```text
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

---

## Allure Reporting

Run the tests:

```bash
mvn clean test
```

Serve the Allure report:

```bash
allure serve target/allure-results
```

---

## GitHub Actions CI

The framework includes a GitHub Actions workflow that runs automatically on:

- Push to `main`
- Pull request to `main`
- Manual workflow trigger

The workflow performs:

- Repository checkout
- Java setup
- Playwright Chromium installation
- Maven test execution
- Allure results upload
- Surefire reports upload

Workflow file:

```text
.github/workflows/ci.yml
```

---

## Screenshots

Execution proof screenshots are stored under:

```text
docs/screenshots
```

Current proof screenshots include:

- Local test execution
- Docker execution

Recommended additional screenshots:

- Allure report dashboard
- GitHub Actions successful run

---

## Why This Project Matters

This project demonstrates practical QA automation skills across UI testing, API testing, reporting, CI/CD, and containerized execution.

It is suitable for showcasing SDET and QA Automation skills in resumes, LinkedIn profiles, GitHub portfolios, and freelance client proposals.

---

## Author

Sanket Lamba
