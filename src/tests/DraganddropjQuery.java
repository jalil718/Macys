package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DraganddropjQuery {

	@Test
	public void draganddrop(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
//		String ab= driver.findElement(By.xpath("//*[@id='content']/p[1]")).getText();
//		System.out.println(ab);
		driver.switchTo().frame(0);
//		String cd= driver.findElement(By.xpath("//*[@id='draggable']")).getText(); 
//		System.out.println(cd);
//		driver.close();
		
		WebElement drag= driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions at= new Actions(driver);
		at.dragAndDrop(drag, drop).build().perform();
		
		driver.close();
		
	}
	
	
	
}
