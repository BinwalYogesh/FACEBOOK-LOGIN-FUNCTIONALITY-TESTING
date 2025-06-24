package com.yogesh.SeleniumAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login {
	  @Test(priority = 3)
	    
			public void login() {
				//WebElement webElement = App.driver.findElement(By.id("email"));
				//webElement.sendKeys("");
				//WebElement webElement1 = App.driver.findElement(By.id("pass"));
				//webElement1.sendKeys("QWERT");
		  App.driver.findElement(By.id("email")).sendKeys("a@gmail.com");
		  App.driver.findElement(By.id("pass")).sendKeys("qwert");
		  App.driver.findElement(By.name("login")).click();
			}
}
