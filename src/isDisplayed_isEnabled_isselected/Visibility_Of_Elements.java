package isDisplayed_isEnabled_isselected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visibility_Of_Elements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookie
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(3000);
		
		//1. isDisplayed() returns true if webelement is present on webpage and if not then it returns false
		boolean display=driver.findElement(By.xpath("//button[@name='websubmit']")).isDisplayed();			//returns true
		System.out.println(display);
		System.out.println("Test is passed");
		
		System.out.println("<--------------------------------------------------------------------------------------->");
		
		//2. isEnabled() returns true if webelement is present and enabled on webpage and if not then it returns false
		boolean display_enable=driver.findElement(By.xpath("//button[@name='websubmit']")).isEnabled();			//returns true
		System.out.println(display_enable);
		System.out.println("Test is passed");
		
		System.out.println("<--------------------------------------------------------------------------------------->");
		
		//3. isSelected() returns true if webelement is present and selected on webpage and if not then it returns false
		boolean display_notselected=driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).isSelected();			//returns false
		System.out.println(display_notselected);
		System.out.println("Test is passed");
		
		System.out.println("<--------------------------------------------------------------------------------------->");
		
		//4. isSelected() returns true if webelement is present and selected on webpage and if not then it returns false
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		boolean display_selected=driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).isSelected();			//returns false
		System.out.println(display_selected);
	    System.out.println("Test is passed");
	}

}
