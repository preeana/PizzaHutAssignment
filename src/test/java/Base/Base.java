package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Base {

  
	    WebDriver driver;
	  
	    
	    @SuppressWarnings("deprecation")
		public WebDriver initializeBrowser() throws IOException, InterruptedException {
	   	 
 	 
	   	 
	   	 String browser = "firefox";
	   	 
	   	 if(browser.equals("chrome")) {
	   		 
	   		 WebDriverManager.chromedriver().setup();
	   		 driver = new ChromeDriver();
	   		 
	   	 }else if(browser.equals("firefox")) {
	   		 
	   		 WebDriverManager.firefoxdriver().setup();
	   		 driver = new FirefoxDriver();
	   		 
	   	 }else if(browser.equals("edge")) {
	   		 
	   		 WebDriverManager.edgedriver().setup();
	   		 driver = new EdgeDriver();
	   		 
	   	 }
	   	 
	   	 driver.manage().window().maximize();
	   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	 	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   	//driver = launchPizzaHut();
	   	 return driver;
	   	 
	    }
	    
	    
	    
	    public String generateNewEmailTimeStamp() {
	   	 
	   	 Date date = new Date();
	   	 return date.toString().replace(" ","_").replace(":","_")+"@gmail.com";
	   	 
	    }
	    
	    public String takeScreenshot(String testName,WebDriver driver) throws IOException {
	   	 
	   	 File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   	 String screenshotFilePath = System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png";
	   	 FileUtils.copyFile(srcScreenshot, new File(screenshotFilePath));
	   	 return screenshotFilePath;
	    }

	 }
	    
