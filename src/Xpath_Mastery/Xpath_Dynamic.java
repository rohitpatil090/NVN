package Xpath_Mastery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Dynamic {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
			
			//how to customize xpath and click on desired checkbox
			
			driver.findElement(By.xpath("//span[text()='OnePlus']//parent::a//parent::span[@class='a-list-item']")).click();
			
			/*
			 flow is like from child to parent
			  
			 1. first select exact element and write xpath= //span[text()='OnePlus']
			 2. now go to it's parent tag and write //parent tagname :: and use any one of it's property and value of that property = //parent::a[@class='a-link-normal']
			 3.if we want to then we can add one more parent tag and it's property(if matched with multiple web elements only) and  if not then also ok
			 4.sometimes if there are more than one count of same tag like here say a tag the we can use like preceding-sibling::tagname[one of propert]---refer video nvn
			 */
			
			System.out.println("Test is passed");

	}

}
