package programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class SimpleLoginPage {

    	public static void main(String[] args) {
    		// This will launch the empty chrome brower
    		WebDriver driver=new ChromeDriver();
    		

        try {
            // Step 1: Open the login page
            driver.get("https://practicetestautomation.com/practice-test-login/");
            
          //maximize the browser(Method chaining)
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
            
         // Step 5: Assert for success message
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".has-text-align-center")));
            String messageText = successMessage.getText();
            if (messageText.contains("Congratulations student. You successfully logged in!") || messageText.contains("Logged In Successfully")) {
                System.out.println("Login successful: " + messageText);
            } else {
                System.out.println("Login failed or unexpected result.");
            }
            

        } finally {
            // Close the browser
           // driver.quit();
        }
    }
}
