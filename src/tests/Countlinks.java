package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Config;

public class Countlinks extends Config {

	@Test
	public void Countinglinks(){
		
	List<WebElement>	xy= driver.findElements(By.tagName("a"));
	
	System.out.println(xy.size());
	for(int i = 0;i<xy.size();i++){
		System.out.println(xy.get(i).getText());
	}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
