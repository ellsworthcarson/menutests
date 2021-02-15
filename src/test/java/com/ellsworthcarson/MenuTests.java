package com.ellsworthcarson;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuTests {
	WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://szhsin.github.io/react-menu/#checkbox");
	}
	
	@Test
	public void testMenu() {
		assertEquals(true,true);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
