package com.day01;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
  @Test
  public void Chromebrowser() {
	  
	  System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
	  System.out.println("chromebrowserlaunch is working on the thread: "+Thread.currentThread().getId());
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  
  }
  
  @Test
  
  public void FirefoxBrowser() {
	  
	  System.setProperty("webdriver.gecko.driver", "./browserdrivers/geckodriver.exe");
	  System.out.println("firefox browser launch is working on the thread :"+Thread.currentThread().getId());
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.google.com/");
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  
  }
}
