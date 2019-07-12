package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FacebookCompletedXpath {
	@Test
	public void complete() throws InterruptedException{
		System.setProperty("webdriver.ie.driver","C:\\Users\\mdjal\\Documents\\GitHub\\Macys\\drivers\\IEDriverServer.exe"); 
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		String ab=driver.getTitle();
		
		System.out.println(ab);

//		String part1="//*[@id='js_0']/ul/li[";
//		String part2="]/a";
//		for(int i=1;i<=31;i++){
//		String Completedpath=part1+i+part2;
//		System.out.println(driver.findElement(By.xpath(Completedpath)).getText());
//		}
		
		driver.close();
	
	}
}
