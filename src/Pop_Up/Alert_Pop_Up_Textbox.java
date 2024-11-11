package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Pop_Up_Textbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();  	//launch the chrome browser
		
		driver.manage().window().maximize();   // maximize the browser window
		driver.manage().deleteAllCookies();	  //delete all the cookies
			
		driver.get("https://demoqa.com/alerts");		//Insert the url into browser
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();			//to switch to alert window and return type is alert
		
		String alert_msg=alert.getText();				//to get the text value of alert msg
		System.out.println(alert_msg);					//print the alert
		
		alert.sendKeys("Rohit Patil");								//
		Thread.sleep(2000);
		
		//alert.accept();												//clicks on OK to accept the alert
		//driver.close();

	}

}
