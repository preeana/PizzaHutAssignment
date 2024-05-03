package Hooks;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import Base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class HooksTest extends Base{

	
	public WebDriver driver;
	
    @Before
    public void setup() throws IOException, InterruptedException {
   	 System.out.println("Launch the browser");
    }
    
    @After
    public void tearDown() {
   	 System.out.println("Close the browser");
   	}
}