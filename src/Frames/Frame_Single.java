package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Single {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookie
		
		driver.get("https://demoqa.com/frames");
		
		//For Single Frame

		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame1);
		Thread.sleep(3000);
		System.out.println("This is frame 1");
		
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		
		WebElement frame2=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frame2);
		Thread.sleep(3000);
		System.out.println("This is frame 2");
		
		driver.switchTo().parentFrame();
		System.out.println("This is parent frame");
		
		
	}

}
