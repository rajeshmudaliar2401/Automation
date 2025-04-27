## Steps to Reproduce

1. Clone the repository:
    ```bash
    git clone (https://github.com/rajeshmudaliar2401/Automation.git)
    ```
2. Install IntelliJ IDEA
 - Go to https://www.jetbrains.com/idea/download
 - Choose Community Edition (free) or Ultimate (paid, more features)
- Download and install it like any normal software
- Launch IntelliJ after installation

3. Open or Import Your Project in IntelliJ
- Open IntelliJ
- File → Open... → Select the root folder of your automation project
- IntelliJ will detect build tools like Maven or Gradle and prompt you to import – click Yes

4. Set Up Project SDK (Java)
- Go to File → Project Structure
- Under Project Settings > Project, set Project SDK to your installed Java version (if none, click Add SDK and select JDK)
- Click Apply and OK
- If you don’t have Java installed, download it from: https://adoptopenjdk.net

5. Wait for Dependencies to Load
- If your project uses Maven (pom.xml) or Gradle (build.gradle):
- IntelliJ will automatically start downloading the required dependencies.
- You can check the progress in the bottom status bar.

6. Run Automation Test Cases
- Depending on your framework:
- If you're using TestNG or JUnit:
- Go to your test class (e.g., LoginTest.java)
- Right-click inside the class → Click Run 'LoginTest'
- IntelliJ will run the test and show results in the Run window


