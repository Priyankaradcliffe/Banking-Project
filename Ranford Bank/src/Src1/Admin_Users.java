package banking_Project_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Admin_Users {
	

	public  Admin_Users(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);

	}
	

		//*********************************//
	//-------------------------------Admin Employee Link---------------------------------------//
	//Author: R Priyanka
	
	//Admin Users Branch_Search_Dropdown
	@FindBy(id= "lst_branchS")
	public WebElement Users_Branch_Search_Dropdown;
	
	//Admin Users Roles Search Dropdown
	@FindBy(id= "lst_rolesS")
	public WebElement Users_Roles_Search_Dropdown;
	
	//Admin Users Search Button
	@FindBy(id= "btn_search")
	public WebElement Users_Search_Button;
	
	//Admin Users clear Button
	@FindBy(id= "btn_clear")
	public WebElement Users_Clear_Button;

	// NEW User Creation

	//Admin New User Button
	@FindBy(id= "Btnuser")
	public WebElement New_Users_btn;
	
	//Admin User Role Dropdown
	@FindBy(id= "lst_Roles")
	public WebElement User_Role_Dropdown;
	
	//Admin User Branch Dropdown
	@FindBy(id= "lst_Branch")
	public WebElement User_Branch_Dropdown;
	
	//Admin User CustomerID Dropdown
	@FindBy(id= "DrCName")
	public WebElement User_CustomerID_Dropdown;
	
	//Admin User Customer Name EB
	@FindBy(id= "Lbc_name")
	public WebElement User_CustomerName_EB;
	
	//Admin User User Name EB
	@FindBy(id= "txtUname")
	public WebElement User_UserName_EB;
	
	//Admin User Login Password EB
	@FindBy(id= "txtLpwd")
	public WebElement User_LoginPW_EB;
	
	//Admin User Transaction Password EB
	@FindBy(id= "txtTpwd")
	public WebElement User_TransactionPW_EB;
	
	
	//Admin New User Submit button;
	@FindBy(id= "BtnSubmit")
	public WebElement NewUser_Submit_btn;
	
	//Admin New User Reset Button
	@FindBy(id= "btnreset")
	public WebElement NewUser_Reset_btn;
	
	//Admin New User Cancel Button
	@FindBy(id= "btnCancel")
	public WebElement NewUser_Cancel_btn;
	
	//Admin New User Creation Method
	
	public void Admin_NewUser_Creation(String UBSearch, String URSearch, String URDrop, String UBDrop, String UCIDDrop, String UCname, String UUname, String UlogPW, String UTPW) throws Exception
	
	{
		
	//Admin User Branch Search
	new Select(Users_Branch_Search_Dropdown).selectByVisibleText(UBSearch);
	Thread.sleep(2000);
	
	//Admin User Roles Search 
	new Select(Users_Roles_Search_Dropdown).selectByVisibleText(URSearch);
	Thread.sleep(2000);

	//User Search
	Users_Search_Button.click();
	Thread.sleep(2000);
	
	//New User creation
	New_Users_btn.click();
	Thread.sleep(2000);

	new Select(User_Role_Dropdown).selectByVisibleText(URDrop);
	Thread.sleep(2000);
	
	new Select(User_Branch_Dropdown).selectByVisibleText(UBDrop);
	Thread.sleep(2000);
	
	new Select(User_CustomerID_Dropdown).selectByVisibleText(UCIDDrop);
	Thread.sleep(2000);
	
	
	
	
	User_CustomerName_EB.clear();
	User_CustomerName_EB.sendKeys(UCname);
	Thread.sleep(2000);
	
	
	User_UserName_EB.clear();
	User_UserName_EB.sendKeys(UUname);
	
	User_LoginPW_EB.clear();
	User_LoginPW_EB.sendKeys(UlogPW);
	Thread.sleep(2000);
	
	
	User_TransactionPW_EB.clear();
	User_TransactionPW_EB.sendKeys(UTPW);

	
	NewUser_Submit_btn.click();
	Thread.sleep(2000);
	}


}
