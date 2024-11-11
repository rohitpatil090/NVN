package Headless_Browser_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Headless_edge {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\Automation -Selenium Webdriver\\edgedriver_win32\\msedgedriver.exe");
		
		EdgeOptions options=new EdgeOptions();
		
		options.addArguments("window-size-1400,800");
		options.addArguments("headless");
		
		WebDriver driver=new EdgeDriver(options);
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookie
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[@title='See the Voting Information Centre']")).click();
		
		System.out.println(driver.getTitle());
		

	}

}
