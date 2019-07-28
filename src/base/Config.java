package base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.WebDriverFunctions;

public class Config extends WebDriverFunctions {
	
	String chromeProfilePath = "/home/(user)/.config/google-chrome/Profile3/";

	@BeforeMethod
	public void beforeTestStart(){
		
		ChromeOptions chromeProfile = new ChromeOptions();
		chromeProfile.addArguments("chrome.switches", "--disable-extensions");
		chromeProfile.addArguments("user-data-dir=" + chromeProfilePath);
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver= new ChromeDriver(chromeProfile);
		driver.get("https://www.macys.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void tearDown(ITestResult result){

		// Here will compare if test is failing then only it will enter into if condition
		if(ITestResult.FAILURE==result.getStatus())	{
			try {
				// Create refernce of TakesScreenshot
				TakesScreenshot ts=(TakesScreenshot)driver;

				// Call method to capture screenshot
				File source=ts.getScreenshotAs(OutputType.FILE);

				// Copy files to specific location here it will save all screenshot in our project home directory and
				// result.getName() will return name of test case so that screenshot name will be same
			//	 FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\screenShots\\"+screenshotName+".png"));
				FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"\\Screenshot\\"+result.getName()+".png"));

				System.out.println("Screenshot taken");
			} 
			catch (Exception e)
			{

				System.out.println("Exception while taking screenshot "+e.getMessage());
			} 


		}

		driver.close();



	}




}
