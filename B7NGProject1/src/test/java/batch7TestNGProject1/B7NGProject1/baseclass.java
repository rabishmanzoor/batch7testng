package batch7TestNGProject1.B7NGProject1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseclass {
	
	public WebDriver driver;

	  @BeforeMethod (alwaysRun = true)
	  @Parameters({"brow"})
	  public void beforeMethod(String brow) throws InterruptedException, IOException {
		  System.out.println("This is before test, we will open browser here");
		  
		  
		  String browser= brow;
		  
		  if(browser.contains("Chrome")) 
		  {  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\mavenbatch7\\drivers\\chromedriver.exe");   
		  driver = new ChromeDriver();    // Opening chrome broser
		  }
		  
		  else if (browser.contains("Firefox"))
		  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\eclipse-workspace\\mavenbatch7\\drivers\\geckodriver.exe");   
		  driver = new FirefoxDriver();
		  }
		  
		  else
		  {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\eclipse-workspace\\mavenbatch7\\drivers\\msedgedriver.exe");   
		  driver = new EdgeDriver();
		  }
		    
		    driver.get("https://www.facebook.com/");  // Navigate to Website
		    driver.manage().window().maximize();
		    Thread.sleep(5000);
		    shots_withdate();
		    Thread.sleep(5000);
	  }
	  
	  
	  @AfterMethod (alwaysRun = true)
	  public void afterMethod() {
		  System.out.println("This is after test, we will close browser here");
		  driver.close();
	  }
	  
	 
	  public void shots() throws IOException {
	 File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(cap, new File("C:\\Users\\user\\eclipse-workspace\\B7NGProject1\\pictures\\1.png"));
	  }
	  
	  
	  public void shots_withargs(String name) throws IOException {
	 File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(cap, new File("C:\\Users\\user\\eclipse-workspace\\B7NGProject1\\pictures\\"+name+".png"));
	  }
	  
	  public void shots_withdate() throws IOException {
		  Date dt = new Date();
		String name_dt=  dt.toString().replace(" ", "_").replace(":", "_");
	 File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(cap, new File("C:\\Users\\user\\eclipse-workspace\\B7NGProject1\\pictures\\"+name_dt+".png"));
	  }
 

}
