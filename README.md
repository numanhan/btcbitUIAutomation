# BTCBit UI Automation

This project is a UI automation project developed using Selenium, Java, and Cucumber. The project is managed with Maven and can be executed using the `mvn clean test` command.

## Technologies Used

- **Selenium**: A tool for web automation.
- **Java**: Programming language.
- **Cucumber**: A test automation framework for Behavior-Driven Development (BDD).
- **Maven**: Project management and build tool.

## Prerequisites

Before running the project, ensure you have the following installed on your system:

- **Java JDK 11 or higher**: [Download Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **Maven**: [Download Maven](https://maven.apache.org/download.cgi)
- **Git**: [Download Git](https://git-scm.com/downloads)

## Installation

Follow the steps below to set up and run the project on your local machine.

### 1. Clone the Repository

Clone the project repository to your local machine:

```bash
git clone https://github.com/numanhan/btcbitUIAutomation.git
cd btcbitUIAutomation
```
### 2. Install Dependencies 
Download the project dependencies using Maven:
```bash
mvn clean install
```
### 3. Run the Tests
Execute the tests using the following command:
```bash
mvn clean test
```
This command will run the Cucumber test scenarios and display the results in the console.

### 4. View Test Reports
After the tests are completed, the reports will be generated in the target/cucumber-reports directory. You can review these reports to analyze the test results.

## Project Structure
The project is structured as follows:
```
btcbitUIAutomation/
├── src/
│   ├── main/
│   │   └── java/                # Main application code (if any)
│   └── test/
│       ├── java/                # Test code and step definitions
│       │   ├── runners/         # Test runners
│       │   ├── stepdefs/        # Step definitions for Cucumber scenarios
│       │   └── utils/           # Utility classes (e.g., drivers, helpers)
│       └── resources/           # Resource files
│           ├── features/        # Cucumber feature files
│           └── config/          # Configuration files (e.g., properties)
├── target/                      # Compiled classes and test reports
├── pom.xml                      # Maven configuration file
└── README.md                    # Project documentation
```
### Key Files and Directories

- src/test/java/runners/: Contains the test runner classes (e.g., TestRunner.java).
- src/test/java/stepdefs/: Contains the step definitions for Cucumber scenarios.
- src/test/resources/features/: Contains the .feature files that define the test scenarios.
- pom.xml: Contains Maven dependencies and project configuration.

## Contributing
If you would like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes.
4. Push your branch and submit a pull request.
5. We welcome all contributions!


---

### Explanation of the Project Structure

- **`src/test/java/runners/`**: This directory contains the test runner classes (e.g., `TestRunner.java`), which are responsible for executing the Cucumber tests.
- **`src/test/java/stepdefs/`**: This directory contains the step definitions that map the Gherkin steps in the `.feature` files to Java code.
- **`src/test/resources/features/`**: This directory contains the `.feature` files, which define the test scenarios in Gherkin syntax.
- **`pom.xml`**: This file contains the Maven dependencies and project configuration.

---

### GitHub Actions Configuration

To add GitHub Actions for automated testing, follow these steps:

1. Create a `.github/workflows` directory in the root of your project.
2. Add a `ci.yml` file with the following content:

#### `ci.yml`

```yaml
name: CI Pipeline

on:
  push:
    branches:
      - master
  pull_request:
    branches:
      - master

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - name: Checkout code
        uses: actions/checkout@v3

      - name: Set up JDK 11
        uses: actions/setup-java@v3
        with:
          java-version: '11'
          distribution: 'temurin'

      - name: Cache Maven packages
        uses: actions/cache@v3
        with:
          path: ~/.m2/repository
          key: ${{ runner.os }}-m2-${{ hashFiles('**/pom.xml') }}
          restore-keys: |
            ${{ runner.os }}-m2-

      - name: Build and test with Maven
        run: mvn clean test
