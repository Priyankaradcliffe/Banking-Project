package ranfordBank;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebTable_Admin_Role_Update {
	

	
	
		public WebTable_Admin_Role_Update(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="txtrNameU")
		public WebElement Role_Name_EB_Update;
		
		@FindBy(id="txtrdescu")
		public WebElement Role_Desc_EB_Update;
		
		@FindBy(id="1stRtype")
		public WebElement Role_Type_DD_Update;
		
		@FindBy(id="btnupdate")
		public WebElement Role_Update_Btn;
		
		
		public void Role_Updation(String RName_Update, String RDesc_Update,String RType_Update) throws Exception
		{
			Role_Name_EB_Update.clear();
			Role_Name_EB_Update.sendKeys(RName_Update);
			Thread.sleep(1000);
			
			Role_Desc_EB_Update.clear();
			Role_Desc_EB_Update.sendKeys(RDesc_Update);
			Thread.sleep(1000);
			
			new Select(Role_Type_DD_Update).selectByVisibleText(RType_Update);
			Thread.sleep(1000);
			
			Role_Update_Btn.click();
			Thread.sleep(1000);
			
		}
		
		

	}

