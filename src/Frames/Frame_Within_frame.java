package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Within_frame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookie
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//For Frame Inside a Frame
		
		driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();    //clicks on switch to option
		
		driver.findElement(By.xpath("//a[contains(text(),'Frames')]")).click();		 //clicks on frames option
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[(text()='Iframe with in an Iframe')]")).click();    //clicks on iframe with in an Iframe
		Thread.sleep(2000);
		
		
		WebElement inside_frame=driver.findElement(By.xpath("//*[@id=\"singleframe\"]"));			//copied xpath by ext plug in
		
		driver.switchTo().frame(inside_frame);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("gsertg87784");
		Thread.sleep(2000);
		
		
		driver.switchTo().parentFrame();
		
		
		
		//incomplete

	}

}
