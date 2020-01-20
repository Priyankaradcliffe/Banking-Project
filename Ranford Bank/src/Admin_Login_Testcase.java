package banking_Project_Admin;

import org.openqa.selenium.WebDriver;

public class Admin_Login_Testcase
{
	WebDriver driver;
	RHP rhp;
	
	public Admin_Login_Testcase(WebDriver driver)
	{
		this.driver=driver;
		rhp = new RHP(driver);
	}
	
	public void Admin_login( String PWD, String UID)
	{
		rhp.Admin_User_Name_EB.clear();
		rhp.Admin_User_Name_EB.sendKeys(UID);
		
		rhp.Admin_Password_EB.clear();
		rhp.Admin_Password_EB.sendKeys(PWD);
		
		rhp.Admin_Login_btn.click();
		
	}
	
	public void RHP_links() throws Exception
	{
		Thread.sleep(2000);

		rhp.Header_International_Banking_btn.click();
		Thread.sleep(2000);
		
		rhp.Header_Corporate_Banking_btn.click();
		Thread.sleep(2000);
		
		
		rhp.Header_AboutUs_btn.click();
		Thread.sleep(2000);

		rhp.Home_back_btn.click();
		Thread.sleep(2000);

		rhp.Personal_btn.click();
		Thread.sleep(2000);
		
		rhp.Home_back_btn.click();
		Thread.sleep(2000);
		
		rhp.Corporate_btn.click();
		Thread.sleep(2000);
		
		rhp.Home_back_btn.click();
		Thread.sleep(2000);
								
		rhp.International_btn.click();
		Thread.sleep(2000);

		rhp.Home_back_btn.click();
		Thread.sleep(2000);
								
		/*
		rhp.customerServices_Link.click();
		Thread.sleep(2000);
		
		rhp.Internet_Banking_FAQs_link.click();
		Thread.sleep(2000);
		
		rhp.Privacy_Link.click();
		Thread.sleep(2000);
		
		rhp.Terms_Conditions_Link.click();
		Thread.sleep(2000);

		rhp.Disclaimer_Link.click();
		Thread.sleep(2000);
		
		rhp.Sitemap_Link.click();
		Thread.sleep(2000);
		rhp.Home_back_btn.click();
		
		*/


		
	}
}
