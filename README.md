# 🛠️ Automation QA Training Workspace

This repository contains learning exercises, homework assignments, and automation test suites developed during the **Software Quality Assurance (QA) & Automation** course at [TechAxis](https://techaxis.com.np/) (Kumaripati, Lalitpur, Nepal).

As a living workspace, this project will evolve over time to include more advanced testing practices, patterns, and frameworks.

---

## 📂 Project Modules

At a high level, the workspace is divided into:

*   **`JavaBasics/`**: Focuses on core Java programming fundamentals and Object-Oriented Programming (OOP) principles (Encapsulation, Inheritance, Abstraction, Polymorphism).
*   **`AutomationExercises/`**: A Maven-based test suite containing web UI automation scenarios, locators, and assertions.
    *   **`AutomationTestCases/UsingPOM/`**: Implementation of automation test cases leveraging the **Page Object Model (POM)** architecture and **TestNG** framework:
        *   **`BaseClass.java`**: Handles driver initialization, window maximization, cookies deletion, and teardown.
        *   **`TestCase1/`**: Contains `TestCase1RegisterUser.java` (TestNG test class) and `TestCase1Page.java` (Page Object class encapsulating elements and actions).
        *   **`TestCase2/`**: Contains `TestCase2ValidLogin.java` (TestNG test class) and `TestCase2Page.java` (Page Object class encapsulating elements and actions).

---

## ⚡ Tech Stack

*   **Programming Language:** Java
*   **Web Automation:** Selenium WebDriver
*   **Test Runner:** TestNG
*   **Build Tool:** Maven

---

## 🚀 Getting Started

### Prerequisites
*   Java Development Kit (JDK)
*   Apache Maven
*   Chrome / Brave Browser and Chrome WebDriver

### Running the Automation Tests
Navigate to the automation module directory and execute the TestNG tests:
```bash
cd AutomationExercises
mvn clean test
```

To run only the Page Object Model (POM) test cases:
```bash
cd AutomationExercises
mvn test -Dtest=TestCase1RegisterUser,TestCase2ValidLogin
```