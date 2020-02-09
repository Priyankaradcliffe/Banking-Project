package banking_Project_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Page 
{

	public Admin_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Admin Page
	 * 
	 * Author: Rapolu Priyanka
	 * 
	 */
	
	//Admin Home Button
	@FindBy(xpath= "//a[@href='adminflow.aspx']")
	public WebElement Admin_Home_btn; 

	//Admin Logout
	@FindBy(xpath= "//a[@href='/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img']")
	public WebElement Admin_logout;
	
			
	//Admin Change Password
	@FindBy(xpath= "//a[@href='change_password.aspx']")
	public WebElement Admin_Change_PW_btn;
	
	//Admin Branches Button
	@FindBy(xpath= "//a[@href='admin_banker_master.aspx']")
	public WebElement Admin_Branches_btn;
	
	//Admin Roles Button
	@FindBy(xpath= "//a[@href='Admin_Roles_details.aspx']")
	public WebElement Admin_Roles_btn;
	
	//Admin Users Button
	@FindBy(xpath= "//a[@href='userdetails.aspx']")
	public WebElement Admin_Users_btn;
	
	//Admin Employee Button
	@FindBy(xpath= "//a[@href='Admin_Emp_details.aspx']")
	public WebElement Admin_Employee_btn;
	
	
}
