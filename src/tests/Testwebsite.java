package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import base.Config;

public class Testwebsite extends Config {

	
@Test
 public void test1() throws IOException{
	System.out.println(driver.findElement(By.xpath("//*[@id='easyBrowsingSVG']")).getText());
	
	 TakesScreenshot ts = (TakesScreenshot)driver;
     File src= ts.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(src, new File("./Screenshot/Test.png"));
     System.out.println("Screenshot taken");

}
	
	
	
}
