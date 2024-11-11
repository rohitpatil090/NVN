package Xpath_Mastery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		driver.manage().window().maximize();
		
		//when there are multiple properties gets matched then we can use previous tag and one of it's property and value below we used div tag and class property
		
driver.findElement(By.xpath("//div[@class='dropdown']//button[@class='btn btn-secondary dropdown-toggle' and @type='button' and @id='dropdownMenuButton']")).click();
		
		//only recommended when multiple properties gets matched
	}

}
