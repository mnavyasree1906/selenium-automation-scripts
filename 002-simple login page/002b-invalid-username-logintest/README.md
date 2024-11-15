# Login Test - Invalid Username

This repository contains a Selenium WebDriver script for testing the login functionality on a sample login page with an invalid username input. The purpose of this test is to verify that the application correctly handles login attempts with invalid credentials by displaying an appropriate error message.

## Prerequisites

1. **Java**: Make sure Java is installed on your system.
2. **Selenium WebDriver**: Install the Selenium WebDriver library in your Java project.
3. **ChromeDriver**: Download and add the ChromeDriver executable to your system PATH, as this test uses Google Chrome as the browser.

## Project Structure

This project has the following structure:
- **`src/programs/InvalidUsernameLoginTest.java`**: The main Java file containing the Selenium WebDriver script.
- **`README.md`**: This file, providing an overview and instructions.

## Code Explanation

Below is a step-by-step breakdown of the `InvalidUsernameLoginTest.java` file.

### Code Walkthrough

1. **Launch Browser**: The script starts by launching a new instance of Google Chrome, which will be used to interact with the login page.

```java
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
```

2. Navigate to Login Page: The script opens the login page URL where the login test will be performed.

```java
driver.get("https://practicetestautomation.com/practice-test-login/");
```
3. Enter Login Credentials:
- Username: An invalid username ("students12") is entered in the username field.
- Password: A valid password ("Password123") is entered in the password field.
```java
WebElement usernameField = driver.findElement(By.id("username"));
usernameField.sendKeys("students12");

WebElement passwordField = driver.findElement(By.id("password"));
passwordField.sendKeys("Password123");
```
4. Submit Login Form: After entering credentials, the script clicks the "Submit" button to attempt logging in.
```java
WebElement submitButton = driver.findElement(By.id("submit"));
submitButton.click();
```
5. Verify Error Message:
- The script waits for the error message element to become visible, confirming the login attempt has been processed.
- It then retrieves the error message text and checks if it matches the expected message ("Your username is invalid!").
```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));

String actualErrorMessage = errorMessage.getText();
String expectedErrorMessage = "Your username is invalid!";

if (actualErrorMessage.contains(expectedErrorMessage)) {
    System.out.println("Enter correct username: " + actualErrorMessage);
} else {
    System.out.println("Test Failed: " + actualErrorMessage);
}
```
6. Close Browser: The browser is closed after the test, regardless of the outcome, to free up system resources.
```java
driver.quit();
```
#### Expected Outcome
The test checks whether an invalid username results in an appropriate error message. When the script runs:
- It should display a message on the console indicating the expected error message ("Your username is invalid!").
- If the error message does not match, the test will print "Test Failed" to indicate an issue.

![image](https://github.com/user-attachments/assets/31bc3c5c-5a43-4370-ab95-a0a02d7f6fc6)

![image](https://github.com/user-attachments/assets/643f0292-9b17-474f-97e3-f74dc7f3f146)

---
