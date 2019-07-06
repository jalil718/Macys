package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;

public class ScreenshotforFailingtest extends Config {
	
	@Test
	public void textCheck(){
		String ab= driver.findElement(By.xpath("//*[@id='stayconnected-social-panel']/div[3]/a/div[2]/span[1]")).getText();
		System.out.println(ab);

	}
	
	
	
	

}
