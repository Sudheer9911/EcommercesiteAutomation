/**
 * 
 */
package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import browserfactory.Browserdriver;

/**
 * @author SUDHEER
 *
 */
public class Createaccountpage {
	
	WebDriver all_broswer;
	Browserdriver driver=new Browserdriver();
	
	
	//Create a New account : Register object ids
		/*By username1=By.id("email_create");
		By submitcreateanaccount =By.id("SubmitCreate");
		@FindBy(id="email_create")WebElement username2;*/
		@FindBy(how=How.ID,using="email_create") WebElement username1;
		@FindBy(how=How.ID,using="SubmitCreate") WebElement submitcreateanaccount;
		
		// Already Registered : Login object ids
		
		@FindBy(how=How.ID,using="email") WebElement login_username;
		@FindBy(how=How.ID,using="passwd") WebElement login_password;
		@FindBy(how=How.ID,using="SubmitLogin")WebElement login_submit;
				
		//By login_username=By.id("email");
		//By login_password=By.id("passwd");
	//	By login_submit=By.id("SubmitLogin");
		
		//create a constructor - we will call below constructor from the test case.
		
		/*public Createaccountpage(WebDriver all_broswerss)
		{
			//below code will call webdriver.
			this.driver=all_broswerss;
			
		}
		*/
		//create methods
		public void login_registerd_user()
		{
			System.out.println("login started");
			all_broswer.findElement((By) login_username).sendKeys("sudhe_r009@yahoo.co.in");
			all_broswer.findElement((By) login_password).sendKeys("Test@999");
			all_broswer.findElement((By) login_submit).click();
			System.out.println("tet case 2 executed with submit clicked");
			
		}
		
		/*public void enterusername()
		{
			System.out.println("with out domain for case 1");
			all_broswer.findElement(username1).sendKeys("sudhe_r009");
			System.out.println("user id opened");
			
		}
		public void clickcreateaccountbutton()
		{
			System.out.println("with  domain for case 2");
			all_broswer.findElement(submitcreateanaccount).click();
		}*/
		
				
		}
		
		//

	
