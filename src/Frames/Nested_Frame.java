package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookie
		
		driver.get("https://demoqa.com/nestedframes");
		
		//For Single Frame

		WebElement Parent_frame=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(Parent_frame);
		Thread.sleep(3000);
		System.out.println("This is outside parent frame");
		
//		driver.switchTo().parentFrame();
//		Thread.sleep(3000);
		
		WebElement child_frame=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(child_frame);
		Thread.sleep(3000);
		System.out.println("This is child frame");
		
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		System.out.println("This is immediate parent window");
	}

}
