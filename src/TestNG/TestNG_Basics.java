package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//in interview they will ask how many annotations are there in TestNG?

public class TestNG_Basics {
	// Pre-conditions annotations starting with Be
    @BeforeSuite
    public void setup(){
        System.out.println("@BeforeSuite---setup system property for");
   }
    @BeforeTest
    public void launchBrowser(){
        System.out.println(" @BeforeTest---launch chrome Browser");
    }
    @BeforeClass
    public void login(){
        System.out.println(" @BeforeClass---login to app");
    }
    @BeforeMethod
    public void enterURL(){
        System.out.println("@BeforeMethod---enter URL");
    }
    // test cases -- starting with @Test
    @Test
    public void googleTitleTest(){
        System.out.println("@Test---Google Title Test");
    }
    // post conditions -- starting with @After
    @AfterMethod
    public void logOut(){
        System.out.println("@AfterMethod---logout from app");
    }
    @AfterClass
    public void deleteAllCookies(){
        System.out.println("@AfterClass---deleteAllCookies");
    }
    @AfterTest
    public void closeBrowser(){
        System.out.println("@AfterTest---Close Browser");
    }
    
    @AfterSuite
    public void generateTestReport(){
        System.out.println("@AfterSuite---generateTestReport");
     }
}
