package banking_Project_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Admin_Employee {

	public Admin_Employee(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
							//*********************************//
	//-------------------------------Admin Employee Link---------------------------------------//
	//Author: R Priyanka


	//Admin New Employee Button
	@FindBy(id= "BtnNew")
	public WebElement New_Employee_btn;
	
	// NEW Role ENTRY
	
	//Admin Employee Name EB
	@FindBy(id= "txtUname")
	public WebElement Employee_Name_EB;
	
	
	//Admin Employee Login Password EB
	@FindBy(id= "txtLpwd")
	public WebElement Employee_Login_PW_EB ;
	
	//Admin Employee Role Type Dropdown
	@FindBy(id= "lst_Roles")
	public WebElement Employee_Role_Type_Dropdown;
	
	//Admin Employee Branch Name Dropdown
	@FindBy(id= "lst_Branch")
	public WebElement Employee_Branch_Name_Dropdown;

	//Admin New Employee Submit button;
	@FindBy(id= "BtnSubmit")
	public WebElement NewEmployee_Submit_btn;
	
	//Admin New Employee Reset Button
	@FindBy(id= "btnreset")
	public WebElement NewEmployee_Reset_btn;
	
	//Admin New Employee Cancel Button
	@FindBy(id= "btnCancel")
	public WebElement NewEmployee_Cancel_btn;
	
	//Admin New Employee Creation Method

	public void Admin_NewEmployee_Creation(String Ename, String EPW, String ERtype,String EBName ) throws Exception
	
	{
		New_Employee_btn.click();
		Thread.sleep(2000);
		
		Employee_Name_EB.clear();
		Employee_Name_EB.sendKeys(Ename);
		Thread.sleep(2000);
		
		
		Employee_Login_PW_EB.clear();
		Employee_Login_PW_EB.sendKeys(EPW);
		
		new Select(Employee_Role_Type_Dropdown).selectByVisibleText(ERtype);
		Thread.sleep(2000);
		
		new Select(Employee_Branch_Name_Dropdown).selectByVisibleText(EBName);
		Thread.sleep(2000);
		
		NewEmployee_Submit_btn.click();
		Thread.sleep(2000);
	}
}
