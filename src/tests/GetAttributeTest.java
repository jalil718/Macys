package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAttributeTest {

	@Test
	public void imageVerification(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jetblue.com/");
		driver.manage().window().maximize();
		
		WebElement img= driver.findElement(By.xpath("/html/body/jb-app/jb-header/jb-header-desktop/div[2]/div/div/div/jb-logo/a/img"));
	
		String src= img.getAttribute("src");
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
}






