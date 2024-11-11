package Xpath_Mastery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath_Dynamic_WebTable_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookie
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Actions act=new Actions(driver);          //to perform mouse over actions on web elements 
		
		WebElement Admin=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement Organization=driver.findElement(By.xpath("//a[@id='menu_admin_Organization']"));
		WebElement Locations=driver.findElement(By.xpath("//a[@id='menu_admin_viewLocations']"));
		
		
		act.moveToElement(Admin).moveToElement(Organization).moveToElement(Locations).click().build().perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'HQ - CA, USA')]/parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Texas R&D')]/parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
		
		System.out.println("Test is Passed");
		
		
		
		

	}

}
