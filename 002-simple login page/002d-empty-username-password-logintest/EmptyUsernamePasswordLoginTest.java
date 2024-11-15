package programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
        
        public class EmptyUsernamePasswordLoginTest { 
  
    	public static void main(String[] args) {
    		// This will launch the empty chrome brower
    		WebDriver driver=new ChromeDriver();
    		

        try {
            // Step 1: Open the login page
            driver.get("https://practicetestautomation.com/practice-test-login/");
            
          //maximize the browser(Method chaining)
    		driver.manage().window().maximize();

            // Step 2: Enter a valid username
            //WebElement usernameField = driver.findElement(By.id("username"));
            
            // Enter invalid user name 
            //usernameField.sendKeys("student");

            // Step 3: Enter a valid password
            //WebElement passwordField = driver.findElement(By.id("password"));
            
            // Enter correct password
            //passwordField.sendKeys("Password");

            // Step 4: Click on the Submit button
            WebElement submitButton = driver.findElement(By.id("submit"));
            submitButton.click();
            
            // Step 5: wait for the error message (assuming the error has an ID of "errorMessage")
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));
            
            // Check if the error message text matches the expected message
            String actualErrorMessage = errorMessage.getText();
            String expectedErrorMessage = "Your username is invalid!";

            if (actualErrorMessage.contains(expectedErrorMessage)) {
                System.out.println("Enter username and password: " + actualErrorMessage);
            } else {
                System.out.println("Test Failed: " + actualErrorMessage);
            }
            

        } finally {
            // Close the browser
           // driver.quit();
        }
    }
}
