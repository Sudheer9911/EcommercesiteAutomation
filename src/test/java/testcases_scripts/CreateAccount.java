/**
 * 
 */
package testcases_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browserfactory.Browserdriver;
import junit.framework.Assert;
import pageobjects.Createaccountpage;

/**
 * @author SUDHEER
 *
 */
public class CreateAccount 

{
	
	@BeforeTest
	
	public void open_browsers()
	{
		Browserdriver browser=new Browserdriver();
		browser.openbrowser("chrome");
		
	}
	
		/*@Test
		public void testcase1() throws InterruptedException
		{
			System.out.println("testcase 1 opened");
			Createaccountpage createacctobjectids=new Createaccountpage();
			createacctobjectids.enterusername();
			Thread.sleep(10000);
			createacctobjectids.clickcreateaccountbutton();
			Thread.sleep(10000);
						
		}*/
		
		@Test
		public void testcase2() throws InterruptedException
		{
			System.out.println("testcase 222 opened");
			Thread.sleep(20000);	
			Createaccountpage createacctobjectids=new Createaccountpage();
			System.out.println("login object yet to start");
			createacctobjectids.login_registerd_user();
			//createacctobjectids.clickcreateaccountbutton();
			System.out.println("testcase 222 completed");
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
		
		
		
}
