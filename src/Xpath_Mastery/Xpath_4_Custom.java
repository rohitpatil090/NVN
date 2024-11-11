package Xpath_Mastery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_4_Custom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();  	//launch the chrome browser
		
		driver.manage().window().maximize();   // maximize the browser window
		driver.manage().deleteAllCookies();	  //delete all the cookies
			
		driver.get("https://www.amazon.in/");		//Insert the url into browser
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone");  //used xpath by attribute here
		
								//or
		
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("Iphone");  //xpath used by using contains method
		
		//in contains method we don't use '=' sign  instead we seperate the attribute and it's value by comma inside bracket enclosed in square bracket
		
		
		//some webelements are dynamic in nature suppose id attribute
		//id=test_ab_123
		//id=test_sd_45
		//id=test_hg_10
		//So here id value changes every time page refreshed ,then that time we can use contains method
		
		//input[contains(@id,'test_')]   ------------------------here dynamic part.i.e. part after '_' is not used
		
		//<-------------------------------------------------------------->
		
		//Another method to handle the dynamic element is 'starts-with'
		//consider above e.g of id
		//every id attribute starts with 'test_'  , so we can use it as xpath as follow:
		
		//input[starts-with(@id,'test_')]
		
		//<--------------------------------------------------------------->
		//Another method to handle the dynamic element is 'ends-with'
		//consider e.g of id
		
		//id=54616_test_i
		//id=9498dfd6_test_i
		//id=54gd6_test_i
		
		//every id attribute ends with 'test_i'  , so we can use it as xpath as follow:
				
		//input[ends-with(@id,'_test_i')]     //here we can use contains methos also but not starts-with methos as that part is dynamic
		
		//Always check pattern first then choose the relevant method
		
		
		

	}

}
