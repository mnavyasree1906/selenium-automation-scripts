# Invalid Password LoginTest: 

The `InvalidPasswordLoginTest` script verifies that the login functionality displays an error message when an invalid password is provided along with a valid username. Here’s a breakdown of how the code functions.

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

#### 3. Enter Valid Username
```java
WebElement usernameField = driver.findElement(By.id("username"));
usernameField.sendKeys("student");
```
Locates the username input field by its ID and enters a valid username (student).

#### 4. Enter Invalid Password
```java
WebElement passwordField = driver.findElement(By.id("password"));
passwordField.sendKeys("Password");
```
Locates the password input field by its ID and inputs an incorrect password (Password instead of Password123).

#### 5. Submit Login Form
```java
WebElement submitButton = driver.findElement(By.id("submit"));
submitButton.click();
```
Finds the "Submit" button and clicks it to initiate the login attempt.

#### 6. Wait for Error Message
```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));
```
Uses an explicit wait to pause the script until the error message appears on the page, indicating that the login attempt failed due to the incorrect password. It waits up to 10 seconds for the message to be visible.

#### 7. Verify Error Message
```java
String actualErrorMessage = errorMessage.getText();
String expectedErrorMessage = "Your password is invalid!";

if (actualErrorMessage.contains(expectedErrorMessage)) {
    System.out.println("Test Passed: " + actualErrorMessage);
} else {
    System.out.println("Test Failed: " + actualErrorMessage);
}
```

Retrieves the error message text and compares it to the expected message "Your password is invalid!". If the actual message contains the expected text, it prints "Test Passed"; otherwise, it prints "Test Failed."
#### 8. Clean Up
```java
driver.quit();
```
Closes the browser window and ends the WebDriver session.
#### Output:
![image](https://github.com/user-attachments/assets/8546c986-e0f7-4ab1-8655-acd30e7a4fed)

![image](https://github.com/user-attachments/assets/4824fb6b-d929-45ba-ad1b-9f454ccbb14f)

---
