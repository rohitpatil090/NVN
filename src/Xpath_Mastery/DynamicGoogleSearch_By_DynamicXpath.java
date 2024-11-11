package Xpath_Mastery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogleSearch_By_DynamicXpath {

	public static void main(String[] args) {
		//How to search on google dynamically using dynamic Xpath 
		
		//Sometimes when we enter some text into google search bar then it shows multiple options which matches with that word like
		//if we enter into search bar 'Testing' tyhen it shows multiple options which matches with word 'Testing' like
		//Testing Jobs, Testing Tools, Testing Interview Questions......etc and here is not same it may change next time so index of options is dynamic
		//And we want to select specific Option from that without hardcoding that value or option into the code

		//Another e.g of this Search the products into Amazon Search bar e.g Iphone then options are Iphone7, Iphone Cover,Iphone12 like this
		
		//So how to handle this kind of scenario
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();  	//launch the chrome browser
		
		driver.manage().window().maximize();   // maximize the browser window
		driver.manage().deleteAllCookies();	  //delete all the cookies
			
		driver.get("https://www.google.com/");		//Insert the url into browser
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @title='Search']")).sendKeys("Testing");
		
		//driver.findElements(By.xpath("//ul[@role='listbox']"));
	}

}
