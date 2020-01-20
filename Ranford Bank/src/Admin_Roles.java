package banking_Project_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Admin_Roles
{

	public Admin_Roles(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
		
								//*********************************//
		//-------------------------------Admin Roles Link---------------------------------------//
		//Author: R Priyanka
		
		
		//Admin New Role Button
		@FindBy(id= "btnRoles")
		public WebElement New_Role_btn;
		
		// NEW Role ENTRY
		
		//Admin Role Name EB
		@FindBy(id= "txtRname")
		public WebElement Role_Name_EB;
		
		
		//Admin Role Desc EB
		@FindBy(id= "txtRDesc")
		public WebElement Role_Desc_EB ;
		
		//Admin Role Type Dropdown
		@FindBy(id= "lstRtypeN")
		public WebElement Role_Type_Dropdown;
		
		//Admin New Role Submit button;
		@FindBy(id= "btninsert")
		public WebElement NewRole_Submit_btn;
		
		//Admin New Role Reset Button
		@FindBy(id= "Btn_Reset")
		public WebElement NewRole_Reset_btn;
		
		//Admin New Role Cancel Button
		@FindBy(id= "Btn_cancel")
		public WebElement NewRole_Cancel_btn;
		
		

		//Admin_NewRole_Creation Method
		public void Admin_NewRole_Creation(String Rname, String RDesc, String Rtype) throws Exception
		
		{
			New_Role_btn.click();
			Thread.sleep(2000);
			
			Role_Name_EB.clear();
			Role_Name_EB.sendKeys(Rname);
			Thread.sleep(2000);
			
			Role_Desc_EB.clear();
			Role_Desc_EB.sendKeys(RDesc);
			Thread.sleep(2000);
 
			new Select(Role_Type_Dropdown).selectByVisibleText(Rtype);
			Thread.sleep(2000);
			
			NewRole_Submit_btn.click();
			Thread.sleep(2000);
			
		

		}			
}