package script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import generic.Autoconst;
public class Handledisabledelement implements Autoconst
{
	@Test
	public void EleDisable()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///G:/practice/html/Disabledelement.html");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		String js = "document.getElementById('un').value='tanu'";
		j.executeScript(js);
		//WebElement ele = driver.findElement(By.id("un"));
		/*boolean result = ele.isEnabled();
		if(result==true)
		{
			
			System.out.println("element is enabled");
		}
		else
		{
			System.out.println("element is disabled");
		}*/
	}
	

}
