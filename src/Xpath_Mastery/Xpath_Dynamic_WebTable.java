package Xpath_Mastery;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Dynamic_WebTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");

		WebDriver driver = new ChromeDriver(); // launch the chrome

		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookie
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");		//insert the url
		
//		This method is useful for handling the dynamic web table
//		In this method we used xpath dynamically to handle the dynamic web element...check the xpath
		
		driver.findElement(By.xpath("//strong[contains(text(),'India')]/parent::td//preceding-sibling::td//input[@class='hasVisited']")).click();
		
		System.out.println("Test is passed");
		
		

		
	}

}
