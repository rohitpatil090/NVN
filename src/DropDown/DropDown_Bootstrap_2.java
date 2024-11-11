package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_Bootstrap_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookie
		
		driver.get("https://getbootstrap.com/docs/5.2/components/dropdowns/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[text()='Primary'])[1]")).click();
		Thread.sleep(3000);
		
		List <WebElement> list=driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//li//a"));
		Thread.sleep(2000);
		
		int size=list.size();
		System.out.println(size);
		
		for(int i=0; i<size; i++)
		{
			list.get(i).getText();
			if(list.get(i).getText().equals("Another action"));
			list.get(i).click();
		}

	}
		//incomplete
}
