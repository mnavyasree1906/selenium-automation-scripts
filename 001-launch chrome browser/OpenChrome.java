package programs;

   import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
   import org.openqa.selenium.chrome.ChromeDriver;
   

public class OpenChrome {

	public static void main(String[] args) {
		// This will launch the empty chrome brower
		WebDriver driver=new ChromeDriver();
		
		// To open the url use get(String url);
		driver.get("https://google.com");
		
		//maximize the browser(Method chaining)
		driver.manage().window().maximize();
		
		//fetch the browser current page title--use getTitle() return String
		//datatype Variablename=objectref.returntypenonststicmethod();
		 String currPgTitle=driver.getTitle();
		 System.out.println("current page title is: "+currPgTitle);
		 
		 // fetch the absolute url using getCurrentUrl() returns String
		 //datatype variablename=objectref.returntypenonststicmethos();
		 String absUrl=driver.getCurrentUrl();
		 System.out.println("Current page absolute url is:"+absUrl);
		 
		 //fetch the source code of the current page using getPageSource() return String
		 String src=driver.getPageSource();
		 
		 //fetch the current window id using getWindowHandle() return String
		 String pwid=driver.getWindowHandle();
		 System.out.println("current window id is:"+pwid);
		 
		 //open new tab
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://facebook.com");
		 
		 
		 //open new window
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 driver.navigate().to("https://linkedin.com");
		 
		 //fetch all window ids using getWindowHandles() returns Set<String>
		 Set<String>handles=driver.getWindowHandles();
		 System.out.println("all windows ids are:"+handles);
		 System.out.println("Number of window ids:"+handles.size());
		 
		 //close the browser using close() --- current window will be closed
		 //driver.close();
		 //quit() --> it will close all the associated windows with the driver
		 driver.quit();
		 
		 
	}

}
	
