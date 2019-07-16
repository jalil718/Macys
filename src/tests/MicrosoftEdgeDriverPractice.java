package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MicrosoftEdgeDriverPractice {
	@Test
	public void MicEd(){
		System.setProperty("webdriver.edge.driver","C:\\Users\\mdjal\\Documents\\GitHub\\Macys\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.getTitle();
	}
	
	
	
	
	
	
	
	
}
