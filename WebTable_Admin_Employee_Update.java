package banking_Project_Admin;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

	
public class WebTable_Admin_Employee_Update {
	
	
		public WebTable_Admin_Employee_Update(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="txtBnameU")
		public WebElement Employee_Name_EB_Update;
		
		@FindBy(id="txtPwdU")
		public WebElement Login_Pw_EB_Update;
		
		@FindBy(id="lstrolesU")
		public WebElement Employee_Role_DD_Update;
		
		@FindBy(id="lstBidU")
		public WebElement Employee_Branch_DD_Update;
		
		@FindBy(id="BtnUpdate")//BtnUpdate
		public WebElement Employee_Update_Btn;
		
		
		public void Employee_Updation(String EName_Update, String E_PW_Update,String ERole_Update, String EBranch_Update) throws Exception
		{
			Employee_Name_EB_Update.clear();
			Employee_Name_EB_Update.sendKeys(EName_Update);
			Thread.sleep(1000);
			
			Login_Pw_EB_Update.clear();
			Login_Pw_EB_Update.sendKeys(E_PW_Update);
			Thread.sleep(1000);
			
			new Select(Employee_Role_DD_Update).selectByVisibleText(ERole_Update);
			Thread.sleep(1000);
			
			new Select(Employee_Branch_DD_Update).selectByVisibleText(EBranch_Update);
			Thread.sleep(1000);
			
			
			Employee_Update_Btn.click();
			Thread.sleep(1000);
			
		}
		
		
}
