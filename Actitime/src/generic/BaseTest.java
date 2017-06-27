package generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public abstract class BaseTest implements Autoconst
{
	public WebDriver driver;
	@BeforeMethod
	public void precondtn()
	{
		System.setProperty(IE_KEY,IE_VALUE);
		driver=new InternetExplorerDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		
		
	}
	@BeforeMethod
	public static void captureimage(WebDriver driver,String screenshotname) throws IOException
	{
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./Screenshots/"+screenshotname+".png"));
	}
	@AfterMethod
	public void postcondtn()
	{
		driver.quit();
	}
	

}
