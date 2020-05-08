package com.ibmdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonChrome {

	//mvn test 
	//mvn clean install
	@Test
	public void amazonchrome() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Amazon Page title is ======>>: " + title);
		driver.quit();
	}
	
	@Test
	public void flipkartfirefox() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Flipkart Page title is =====>>: " + title);
		driver.quit();
	}
	
}
