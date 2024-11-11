package Xpath_Mastery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//inspect and find the xpath in find textbox using ctrl+f
	
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();   
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc123@gmail.com");		//tagname[@any property type='value']
		/*
		driver.navigate().back();
		
		//for link;-
		
		driver.findElement(By.xpath("//a[text()='New Releases']")).click();				//text is function so don't use @, use text()
		
		//even we can use contains method
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'New Releases')]")).click();		//recommended
		
		*/
		//when multiple web elements with same properties are available then use 'and' condition
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//span[@class='nav-line-2 nav-progressive-content' and @id='glow-ingress-line2']")).click();
		
		driver.navigate().back();
	}

}
