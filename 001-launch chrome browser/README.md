# Launch Chrome Browser

This repository contains Selenium scripts to automate various browser actions using Java. Each program demonstrates key functionalities and methods in Selenium WebDriver, aimed at helping users understand browser automation.

## Package: `programs`

The `programs` package contains Selenium scripts, each designed to perform specific actions in a web browser. Below is a description of the `OpenChrome` class, which demonstrates basic browser operations.

---

### Class: `OpenChrome`

The `OpenChrome` class provides an example of how to automate actions in a Chrome browser using Selenium WebDriver. It includes methods to launch a browser, navigate to URLs, manage windows and tabs, and retrieve page information.

#### Key Operations

1. **Launch Chrome Browser**:
   - Initializes a new instance of `ChromeDriver`, which opens a blank Chrome browser.

2. **Open a URL**:
   - Uses `driver.get("https://google.com");` to navigate to Google.

3. **Maximize Browser Window**:
   - Maximizes the browser window using `driver.manage().window().maximize();`.

4. **Retrieve Page Information**:
   - `getTitle()` retrieves the current page title.
   - `getCurrentUrl()` fetches the absolute URL of the current page.
   - `getPageSource()` gets the source code of the current page.
   - `getWindowHandle()` retrieves the current window’s ID.

5. **Open New Tabs and Windows**:
   - `driver.switchTo().newWindow(WindowType.TAB);` opens a new tab.
   - `driver.switchTo().newWindow(WindowType.WINDOW);` opens a new window.
   - Each tab or window navigates to a different URL (e.g., Facebook and LinkedIn).

6. **Fetch All Window IDs**:
   - `getWindowHandles()` retrieves a set of all window IDs, useful for switching between windows.

7. **Close the Browser**:
   - `driver.close()` closes the current window.
   - `driver.quit()` closes all browser windows associated with the WebDriver instance.

#### Code

```java
package programs;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://google.com");
        driver.manage().window().maximize();
        
        String currPgTitle = driver.getTitle();
        System.out.println("Current page title is: " + currPgTitle);
        
        String absUrl = driver.getCurrentUrl();
        System.out.println("Current page absolute url is: " + absUrl);
        
        String src = driver.getPageSource();
        
        String pwid = driver.getWindowHandle();
        System.out.println("Current window id is: " + pwid);
        
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://facebook.com");
        
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://linkedin.com");
        
        Set<String> handles = driver.getWindowHandles();
        System.out.println("All windows ids are: " + handles);
        System.out.println("Number of window ids: " + handles.size());
        
        driver.quit();
    }
}

```

---
