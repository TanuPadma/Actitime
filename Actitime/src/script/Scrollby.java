package script;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import generic.Autoconst;
import generic.BaseTest;
public class Scrollby implements Autoconst
{
	public WebDriver driver;
	@Test
	public void scroll() throws IOException, InterruptedException
	{
		System.setProperty(IE_KEY,IE_VALUE);
	  driver=new InternetExplorerDriver();
	  driver.get("https://news.google.co.in/");	
	  BaseTest.captureimage(driver,"googlenews");
	 RemoteWebDriver j=(RemoteWebDriver)driver;
	 for(int i=0;i<=5;i++)
	 {
	  j.executeScript("window.scrollBy(0,500)");
	  Thread.sleep(2000);
	 }
	 
	  
	}
	
	

}
