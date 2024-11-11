package Xpath_Mastery;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Concept {

	public static void main(String[] args) {
		
		//Vimp Question ----How to count total no. of links and text of those links present on a webpage?
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();  	//launch the chrome browser
		
		driver.manage().window().maximize();   // maximize the browser window
		driver.manage().deleteAllCookies();	  //delete all the cookies
			
		driver.get("https://www.amazon.in/");		//Insert the url into browser
		
		//1. Get the total number of links present on webpage
		//2. Get the text of each link on the webpage
		
		
		//1. Get the total number of links present on webpage
		//As links are represented by <a> html tag so,
		
		List <WebElement> linkslist=driver.findElements(By.tagName("a")); //this will give all links and then store in List datastructre and links are WebElements

		//now print the total count of list
		System.out.println(linkslist.size());			//size() method is used to get the size of linklist which is List data structure
		
		//2.Get the text of each link on the webpage
		for(int i=0; i<linkslist.size(); i++)		//for loop is used to iterate over all links present in linkslist List
			
		{
		String text_link=linkslist.get(i).getText();  //get(i) is used to get the each link & getText is used to get the text of link and return typr is string
		System.out.println(text_link);                //This will iterate and print the text of each link
		
		//if links gives output as blank then those links don't have text
		}
	}

}
