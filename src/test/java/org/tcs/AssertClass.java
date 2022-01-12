package org.tcs;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AssertClass {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
	System.setProperty("webdriver.chrome.driver",  
"C:\\Users\\NUCLEUS COMPUTERS\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\FrameWorkjUnit\\latest Chrome Driver\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	String url = driver.getCurrentUrl();
	Assert.assertTrue("Verify Url", url.contains("facebook"));
	

	}
	
    @Test
    public void test1() {
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("Dinesh143");
        
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("dsp123");
	    Assert.assertEquals("Verify PassWord", "dsp123", txtPass.getAttribute("value"));
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
}


