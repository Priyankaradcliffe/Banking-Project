package banking_Project_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Admin_NewBranch_TestCase {

	WebDriver driver;
	Admin_Branches A_Branches;
		
	public Admin_NewBranch_TestCase(WebDriver driver)
	{
		
		this.driver=driver;
		A_Branches = new Admin_Branches(driver);
				
	}
	
	public void Admin_NewBranch_Creation(String BName, String Add1, String Add2, String Add3, String Area, String Zip, String Country, String State, String City) throws Exception
	{
	
		
		A_Branches.Branch_Name_EB.clear();
		A_Branches.Branch_Name_EB.sendKeys(BName);
		Thread.sleep(2000);
		

		A_Branches.Address1_EB.click();
		A_Branches.Address1_EB.sendKeys(Add1);
		Thread.sleep(2000);

		A_Branches.Address2_EB.click();
		A_Branches.Address2_EB.sendKeys(Add2);
		Thread.sleep(2000);

		A_Branches.Address3_EB.click();
		A_Branches.Address3_EB.sendKeys(Add3);
		Thread.sleep(2000);

		A_Branches.Area_EB.clear();
		A_Branches.Area_EB.sendKeys(Area);
		Thread.sleep(2000);

		A_Branches.Zipcode_EB.clear();
		A_Branches.Zipcode_EB.sendKeys(Zip);
		Thread.sleep(2000);

		new Select(A_Branches.Country_Dropdown).selectByVisibleText(Country);
		Thread.sleep(2000);

		new Select(A_Branches.State_Dropdown).selectByVisibleText(State);
		Thread.sleep(2000);

		new Select(A_Branches.City_Dropdown).selectByVisibleText(City);
		Thread.sleep(2000);
		
		A_Branches.NewBranch_Submit_btn.click();
		Thread.sleep(2000);
		
		
		
		driver.switchTo().alert().accept();
		
		
		
		



	}
}
