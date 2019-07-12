package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import locators.macysLocators;
import values.Values;

public class DropdownPractice {

	macysLocators ab= new macysLocators();
	Values cd= new Values();
	
	@Test
	public void dropdown(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		dropdown(ab.fbDropdownTest,cd.fbDropdownTest);
		
		
	}
	
	
	
	
	
	
	
	
}
