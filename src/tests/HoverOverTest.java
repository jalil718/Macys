package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.Config;

public class HoverOverTest extends Config {
	
	@Test
	public void hoverOTest() throws IOException{
		WebElement element = driver.findElement(By.xpath("//*[@id='social-icons-list']/li[1]/a/span"));
		 
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
 
        driver.findElement(By.linkText("iPads")).click();
        
       
        
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("./Screenshot/Test.png"));
        System.out.println("Screenshot taken");
        

 	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
