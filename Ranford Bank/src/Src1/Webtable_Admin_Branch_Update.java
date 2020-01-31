package banking_Project_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Webtable_Admin_Branch_Update 
{
	public Webtable_Admin_Branch_Update(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtbnameU")
	public WebElement Branch_Name_EB_Update;
	
	@FindBy(id="txtadd1u")
	public WebElement Branch_Add1_EB_Update;
	
	@FindBy(id="txtadd2u")
	public WebElement Branch_Add2_EB_Update;
	
	@FindBy(id="txtadd3U")
	public WebElement Branch_Add3_EB_Update;
	
	@FindBy(id="txtareaU")
	public WebElement Branch_Area_EB_Update;
	
	@FindBy(id="txtzipu")
	public WebElement Branch_Zip_EB_Update;
	
	@FindBy(id="drlst_countryU")
	public WebElement Branch_Country_LB_Update;
	
	@FindBy(id="lst_stateU")
	public WebElement Branch_State_LB_Update;
	
	@FindBy(id="LST_cityU")
	public WebElement Branch_City_LB_Update;
	
	@FindBy(id="btnupdate")
	public WebElement Branch_Update_Btn;
	
	
	public void Branch_Updation(String BName_Update, String BAdd1_Update,String BAdd2_Update,String BAdd3_Update,String BArea_Update,String BZip_Update,String BCountry_Update,String BState_Update,String BCity_Update) throws Exception
	{
		Branch_Name_EB_Update.clear();
		Branch_Name_EB_Update.sendKeys(BName_Update);
		Thread.sleep(1000);
		
		Branch_Add1_EB_Update.clear();
		Branch_Add1_EB_Update.sendKeys(BAdd1_Update);
		Thread.sleep(1000);
	
		Branch_Add2_EB_Update.clear();
		Branch_Add2_EB_Update.sendKeys(BAdd2_Update);
		Thread.sleep(1000);
		
		Branch_Add3_EB_Update.clear();
		Branch_Add3_EB_Update.sendKeys(BAdd3_Update);
		Thread.sleep(1000);
		
		Branch_Area_EB_Update.clear();
		Branch_Area_EB_Update.sendKeys(BArea_Update);
		Thread.sleep(1000);
		
		Branch_Zip_EB_Update.clear();
		Branch_Zip_EB_Update.sendKeys(BZip_Update);
		Thread.sleep(1000);
		
		new Select(Branch_Country_LB_Update).selectByVisibleText(BCountry_Update);
		Thread.sleep(1000);
		
		new Select(Branch_State_LB_Update).selectByVisibleText(BState_Update);
		Thread.sleep(1000);
		
		new Select(Branch_City_LB_Update).selectByVisibleText(BCity_Update);
		Thread.sleep(1000);
		
		Branch_Update_Btn.click();
		Thread.sleep(1000);
		
	}
	
	

}
