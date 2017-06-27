package script;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import generic.Autoconst;
public class Crossbrowser implements Autoconst
{
	@Test
	@Parameters("Browser")
	public void test1(String browser)
	{
		if(browser.equalsIgnoreCase("FF"))
	
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		driver.quit();	
		
	}
	else if(browser.equalsIgnoreCase("IE"))
	{
		System.setProperty(IE_KEY, IE_VALUE);
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");
		driver.quit();
	}
		
	}
		
		

}
