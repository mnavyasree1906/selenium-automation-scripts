# Test login

This script provides a simple automation example for logging into a webpage. 

## Package: `programs`

The `programs` package contains scripts that demonstrate various tasks in Selenium. Below is an overview of the `SimpleLoginPage` class, which automates a simple login process.

---

### Class: `SimpleLoginPage`

The `SimpleLoginPage` class demonstrates how to automate the login process on a sample website using Selenium WebDriver. This script opens a login page, enters a valid username and password, and submits the login form.

#### Key Operations

1. **Launch Chrome Browser**:
   - The script uses `ChromeDriver` to launch an empty Chrome browser.

2. **Navigate to Login Page**:
   - The script navigates to the login page of [Practice Test Automation](https://practicetestautomation.com/practice-test-login/).

3. **Maximize the Browser Window**:
   - The browser window is maximized using `driver.manage().window().maximize();`.

4. **Enter Valid Username and Password**:
   - The script locates the username and password fields using the `findElement` method and enters valid credentials (`student` and `Password123`).

5. **Click the Submit Button**:
   - After entering the credentials, the script clicks the submit button to submit the login form.

6. **Browser Cleanup**:
   - The script includes the option to close the browser after completing the login automation, although the `quit()` method is commented out for now.

#### Code

```java
package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLoginPage {

    public static void main(String[] args) {
        // This will launch the empty chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // Step 1: Open the login page
            driver.get("https://practicetestautomation.com/practice-test-login/");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Step 2: Enter a valid username
            WebElement usernameField = driver.findElement(By.id("username"));
            usernameField.sendKeys("student");

            // Step 3: Enter a valid password
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("Password123");

            // Step 4: Click on the Submit button
            WebElement submitButton = driver.findElement(By.id("submit"));
            submitButton.click();

        } finally {
            // Close the browser
            // driver.quit(); // Uncomment to close the browser
        }
    }
}
```

---
 ### Output:
 ![image](https://github.com/user-attachments/assets/1e1d32e9-8422-4e35-a5a3-04df086e027a)

 ---
