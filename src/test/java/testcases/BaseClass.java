package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    public static WebDriver driver;

    @BeforeMethod
    public void SetUp(){
    //launch application
   	 //System.setProperty("webdriver.gecko.driver", "C://Users//lenovo//Desktop//Trainings//Selenium//Drivers//geckodriver-v0.31.0-win64//geckodriver.exe");
   	 //System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
   	 driver=new ChromeDriver();
   	 driver.get("https://www.simplilearn.com/");
   	 driver.manage().window().maximize();
   	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void QuitBrowser(){
    driver.quit();
    }
    
}
