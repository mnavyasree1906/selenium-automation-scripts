# Empty Username and Password Login Test :

The `EmptyUsernamePasswordLoginTest` script verifies that an error message is displayed when a user attempts to log in without entering a username or password. The script simulates a login attempt with both fields left empty, checks for an error message, and validates the result.

### Code Breakdown

#### 1. Driver Setup
```java
   WebDriver driver = new ChromeDriver();
```
Initializes a new instance of Chrome browser using the Selenium WebDriver.

#### 2. Open Login Page
```java
driver.get("https://practicetestautomation.com/practice-test-login/");
driver.manage().window().maximize();
```
Opens the login page and maximizes the browser window.

#### 3. Leave Username and Password Empty
```java
WebElement usernameField = driver.findElement(By.id("username"));
WebElement passwordField = driver.findElement(By.id("password"));
```
Locates the username and password input fields by their IDs, but does not input any data, leaving them empty.

#### 4. Submit Login Form
```java
WebElement submitButton = driver.findElement(By.id("submit"));
submitButton.click();
```
Finds the "Submit" button and clicks it to initiate the login attempt.

#### 5. Wait for Error Message
```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));
```
Implements an explicit wait, allowing the script to pause until an error message appears, indicating that the login attempt failed due to empty fields.

#### 6. Verify Error Message
```java
String actualErrorMessage = errorMessage.getText();
String expectedErrorMessage = "Please enter username and password!";

if (actualErrorMessage.contains(expectedErrorMessage)) {
    System.out.println("Test Passed: " + actualErrorMessage);
} else {
    System.out.println("Test Failed: " + actualErrorMessage);
}
```
Retrieves the error message text from the page and compares it to the expected message "Please enter username and password!". If the message matches, the test passes and prints "Test Passed"; otherwise, it prints "Test Failed."

#### 7. Clean Up
```java
driver.quit();
```
Closes the browser window and ends the WebDriver session to free up resources.

#### Output:
![image](https://github.com/user-attachments/assets/c4355216-ee0d-46f1-bba0-39b2043d438c)

![image](https://github.com/user-attachments/assets/bbb410fa-b27b-4b88-ad5a-c44c1dfdd5ae)

---
