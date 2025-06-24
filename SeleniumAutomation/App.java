package com.yogesh.SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class App {
	static WebDriver driver= null;
		@Test(priority = 1)
		public void openbrowser() {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
	         driver = new ChromeDriver();
		}
	    @Test(priority = 2)
		public void openFacebook() {
	    	driver.get("https://www.facebook.com");
		}
	    @Test(priority = 3)
	    
		public void login() {
			
		}
	    @Test(priority = 4)
		public void search() {
			
		}
  
}
