package banking_Project_Admin;

import org.openqa.selenium.WebDriver;

public class Admin_Page_TestCase
{
	WebDriver driver;
	RHP rhp;
	
	public Admin_Page_TestCase(WebDriver driver)
	{
		this.driver=driver;
		rhp = new RHP(driver);
	}
	
	//Admin Links
	public void Admin_Link()
	{
		}
}
