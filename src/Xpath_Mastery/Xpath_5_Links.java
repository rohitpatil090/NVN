package Xpath_Mastery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_5_Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();  	//launch the chrome browser
		
		driver.manage().window().maximize();   // maximize the browser window
		driver.manage().deleteAllCookies();	  //delete all the cookies
			
		driver.get("https://www.amazon.in/");		//Insert the url into browser
		
		//xpath for links
		//all the links are represented by <a> html tag
		
		driver.findElement(By.xpath("//a[@class='nav-a  ' and text()='Amazon Pay']")).click();
		//we can use also like this -- //a[@class='nav-a  ' and contains(text(),'Amazon Pay')]
		
		//Absolute Xpath -not recommended only when there is no choice then only use
		//Disadvantages:
			//1.Performance Issue
			//2.Not Reliable
			//3.They can be changed in future if there is change in html code	
	}

}
