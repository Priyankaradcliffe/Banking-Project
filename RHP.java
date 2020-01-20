package banking_Project_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RHP 
{

	
	public RHP(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
		/*
		 * RHP Page
		 * Author:-->R Priyanka 
		 * 
		 */

		//RHP home button
		@FindBy(xpath= "//a[@href='http://ravinderbasani.com']")
		public WebElement Home_btn;
		
		
		//RHP home button
		@FindBy(xpath= "//a[@href='home.aspx']")
		public WebElement Home_back_btn;
				
		//RHP Header_Personal_Banking_btn;
		@FindBy(xpath= "//a[@href='personal_banking.html']")
		public WebElement Header_Personal_Banking_btn;
		
		//RHP Header_Corporate Banking_btn;
		@FindBy(xpath= "//a[@href='Corporate Banking.html']")
		public WebElement Header_Corporate_Banking_btn;
		
		//RHP Header_International Banking_btn;
		@FindBy(xpath= "//a[@href='International Banking.html']")
		public WebElement Header_International_Banking_btn;
		
		//RHP Header_Aboutus_btn;
		@FindBy(xpath= "//a[@href='aboutus.html']")
		public WebElement Header_AboutUs_btn;
		
					   //*******************//
		//--------------------LINKS-----------------------//
		
		//RHP customerServices
		@FindBy(xpath= "//a[@href='customerServices.html']")
		public WebElement customerServices_Link;
		
		//RHP Internet Banking FAQ's link
		@FindBy(xpath= "//a[@href='faqs.html']")
		public WebElement Internet_Banking_FAQs_link;
		
		//RHP Privacy link;
		@FindBy(xpath= "//a[@href='privacy.html']")
		public WebElement Privacy_Link;
		
		//RHP Terms&conditions link ;
		@FindBy(xpath= "//a[@href='terms&conditions.html']")
		public WebElement Terms_Conditions_Link;
		
		//RHP Disclaimer link;
		@FindBy(xpath= "//a[@href='disclaimer.html']")
		public WebElement Disclaimer_Link;
		
		//RHP Sitemap link;
		@FindBy(xpath= "//a[@href='sitemap.html']")
		public WebElement Sitemap_Link;
		
		
							//*******************//
		//-------------------Customer Login----------------------//
		
		//RHP Personal
		@FindBy(id= "personal")
		public WebElement Personal_btn;
		
		//RHP corporate
		@FindBy(id= "corporate")
		public WebElement Corporate_btn;
		
		//RHP International
		@FindBy(id= "NRI")
		public WebElement International_btn;
		
		
						//*******************//
		//-------------------Admin/Banker Login----------------------//
		
		//RHP Branch Name
		@FindBy(id= "drlist")
		public WebElement Branch_Name_drop;
		
		//RHP Admin User Name
		@FindBy(id= "txtuId")
		public WebElement Admin_User_Name_EB;
		
		//RHP Adnmin Password
		@FindBy(id= "txtPword")
		public WebElement Admin_Password_EB;
		
		//RHP Password
		@FindBy(id= "login")
		public WebElement Admin_Login_btn;
		
}
