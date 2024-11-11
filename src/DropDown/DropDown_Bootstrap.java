package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_Bootstrap {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookie
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown-toggle')]")).click();	//clicks on HTML-CSS button
		
		List <WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		
		//line 25 xpath goes from left to right in html code tree and finds multiple elements and stores that in webelement List 
		
		//now find the size of the List so that we can use for loop to iterate for every element
		
		System.out.println(list.size());
		
		//Using for loop to iterate through each element
		
//		for(int i=0; i<list.size(); i++)
//		{
//			list.get(i).getText();						//.get(i) to get the element and .getText() to get the text of i^th element
//			if(list.get(i).getText().equals("Java"))  	//comparing the element text to Java (Here instead of .equals we can use .contains method)
//			{
//				list.get(i).click();					// if comparison returns true then click on element
//				break;									//and wxit the loop
//			}
//		}
//		
		//to select all the webelements from drop down except html and css as they are already selected by default so they will get unselected
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());						//.get(i) to get the element and .getText() to get the text of i^th element		
			list.get(i).click();						
			
		}
		
	}

}
