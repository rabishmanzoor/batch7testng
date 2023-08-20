package batch7TestNGProject1.B7NGProject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTest extends baseclass {

  
  @Test (groups = {"Regression"})
  public void fbtextTestCase() throws InterruptedException, IOException {
	  System.out.println("This is test1");
	  
	  Properties prop= new Properties();
	  FileInputStream fin=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\B7NGProject1\\savedvalues.properties");    
	  prop.load(fin);
	  
	String Emailid=  prop.getProperty("Email");
	String passtxt=  prop.getProperty("Pass");

	  HomePOM ob = new HomePOM(driver);
	  ob.enterEmail(Emailid);
	  Thread.sleep(5000);
	  ob.enterPass(passtxt);
	  shots_withdate();
	  Thread.sleep(5000);
  }
  
  @Test (groups = {"Smoke"})
  public void fbtextTestCase2() throws InterruptedException, IOException {
	  System.out.println("This is test1");

	  HomePOM ob = new HomePOM(driver);
	  ob.enterEmail("def@yahoo.com");
	  Thread.sleep(5000);
	  ob.enterPass("nnnnnnnnnn");
	  shots_withdate();
	  Thread.sleep(5000);
  }
  

  

  


}

