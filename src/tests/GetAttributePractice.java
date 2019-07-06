package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;

public class GetAttributePractice extends Config {

	@Test
	public void imageCheckUsingGetAttribute(){
		driver.findElement(By.id("footerFlag")).getAttribute("src");
	}
	
	
	
	
}
