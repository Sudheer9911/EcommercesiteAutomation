/**
 * 
 */
package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

/**
 * @author SUDHEER
 *
 */
public class Browserdriver {

	/**
	 * @param args
	 */
	
	WebDriver all_broswer;
	@Parameters("browser")
	@Test
	public void openbrowser(String browsername)
	{
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\SudheerAll\\Selenium 3.9.1\\chromedriver.exe");
		all_broswer =new ChromeDriver();
		}
		
		
		if (browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\SudheerAll\\Selenium 3.9.1\\geckodriver.exe");
			all_broswer=new FirefoxDriver();
			System.out.println("exiting firefox method");
		}
		
		/*if (browsername.equalsIgnoreCase("internetexplorer"));
		{
			System.setProperty("webdriver.ie.driver", "C:\\SudheerAll\\Selenium 3.9.1\\IEDriverServer.exe");
			all_broswer=new InternetExplorerDriver();
		} */
		
		System.out.println("tesitng is in maximize the window");
		all_broswer.manage().window().maximize();
		System.out.println("tesitng is in progress");
		all_broswer.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		System.out.println("tesitng is in naviget to url");
	}
	
	public void closebroser()
	{
		all_broswer.close();
		
	}

}
