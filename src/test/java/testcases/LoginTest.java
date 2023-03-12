package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass{

    @Test
    
    public void LogiFailureTest() throws InterruptedException{

   	 LoginPage login=new LoginPage();
   	 
   	 //new LoginPage(); --- Object
   	 //login --- Object Reference
   	 login.LoginFunction("test234@gmail.com", "Raghu!299");
   	
   	 WebElement ErrorMsg=driver.findElement(By.id("msg_box"));

   	 String ActualMsg=ErrorMsg.getText();
   	 
   	 System.out.println(ActualMsg);
   	 
   	 String ExpMsg = "The email or password you have entered is invalid.";

   	 Assert.assertEquals(ActualMsg, ExpMsg);
   	 }

    
    

   	 @Test
   	 public void LoginSuccessTest() throws InterruptedException{
   		 LoginPage login1=new LoginPage();
   		 login1.LoginFunction("test@gmail.com", "Raghu1234");
   	 }
   	 
   	 

   	 @Test
   	 public void LoginTest12() throws InterruptedException{
   		 LoginPage login2=new LoginPage();
   		 login2.LoginFunction("Myemail@gmail.com", "Prasad1234");
   	 }
    
    
}
