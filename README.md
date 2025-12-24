# Selenium Java Automation Framework

A structured **UI Automation Testing Framework** built using **Java**, **Selenium WebDriver**, **TestNG**, **Cucumber (BDD)**, **Page Object Model (POM)**, and **PageFactory**.

This framework follows **real-world automation practices** with a strong focus on **clean architecture**, **reusability**, and **scalability**.  
Along with automation concepts, the project also includes **Java fundamentals** and **OOP concepts** to strengthen core programming knowledge.

---

## Credits

This project is inspired and guided by tutorials from **LetCode by Koushik**.  
Thanks to Koushik for explaining **automation concepts** in a clear and practical way.

---

## 📁 Project Structure

- `src/main/java/com.basics` – Core Java basics and learning scripts  
- `src/main/java/com.collections` – Java collections practice and examples  
- `src/main/java/com.exceptions` – Exception handling demos  
- `src/main/java/com.interfaceandabstract` – OOPs practice (Interfaces and Abstract Classes)  
- `src/main/java/com.selenium` – Selenium practice scripts and basic scenarios  
- `src/main/java/com.base` – Base test setup and configuration  
- `src/main/java/com.pages` – Page Object Model classes using PageFactory  
- `src/main/java/com.utilities` – Utility classes (like Excel data handling)  
- `src/test/java/com.tests` – TestNG test classes  
- `src/test/java/com.stepdefinitions` – Cucumber step definitions  
- `src/test/java/com.runners` – Cucumber runner classes  
- `src/test/java/com.hooks` – Hooks for setup and teardown in Cucumber  
- `data/` – Excel test data files  
- `drivers/` – WebDriver executables like ChromeDriver and GeckoDriver  
- `captures/` – Screenshots or recorded test evidence  
- `test-output/` – TestNG generated reports  
- `target/` – Maven-generated compiled files and reports  
- `pom.xml` – Maven build and dependency configuration  
- `testng.xml` – TestNG test suite definition  
- `groups.xml` – TestNG group configurations  
- `paramtr.xml` – TestNG parameterized test definitions  
- `testngPar.xml` – TestNG parallel test execution  
 

---

## Tech Stack

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven**
- **Cucumber (BDD)**
- **POM & PageFactory**

---

## Features Implemented

- **Base class** for browser setup and teardown  
- **Page Object Model** with **PageFactory**  
- **Excel data-driven testing**  
- **TestNG** execution and grouping  
- **Cucumber BDD** implementation  
- **Clean and scalable framework**

---

## How to Run the Project

1. **Clone** the repository.
2. **Open** the project in **IntelliJ IDEA** or **Eclipse**.
3. Make sure **Java** and **Maven** are installed.
4. Run the command: mvn clean install
5. To run tests:
- Run **testng.xml** for TestNG execution  
- Run a **Cucumber Runner class** for BDD execution
6. View reports in:
- **test-output/**  
- **target/**


