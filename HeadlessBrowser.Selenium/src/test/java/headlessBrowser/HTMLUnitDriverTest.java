package headlessBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HTMLUnitDriverTest 
{
	
	@Test
	public void headLessBrowser() 
	{
      // System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Geckodriver\\geckodriver.exe\\");
      WebDriver driver= new HtmlUnitDriver();
       driver.get("https://www.facebook.com/");
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().deleteAllCookies();
       System.out.println("Title of the web page is " +driver.getTitle());
       driver.close();
	}
}
