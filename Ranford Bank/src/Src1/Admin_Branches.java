package banking_Project_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Branches {

	public Admin_Branches(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
		
									//**********************//
		//------------------------------- Roles ---------------------------------------//
		//Author: R Priyanka
	
	
		//Admin Roles Country Search
		@FindBy(id= "lst_countryS")
		public WebElement Country_Search;
		
		
		//Admin Branches State Search
		@FindBy(id= "lst_stateS")
		public WebElement State_Search;
				
		//Admin Branches City Search;
		@FindBy(id = "lst_cityS")
		public WebElement City_Search;
		
		//Admin Branches Search button;
		@FindBy(id= "btn_search")
		public WebElement Search_btn;
		
		//Admin Branches Clear Button
		@FindBy(id= "btn_clsearch")
		public WebElement Clear_btn;
		
		//Admin Branches New branch Button
		@FindBy(id= "BtnNewBR")
		public WebElement New_Branch_btn;
		
		
		// NEW BRANCH ENTRY
		
		//Admin Branch Name EB
		@FindBy(id= "txtbName")
		public WebElement Branch_Name_EB;
		
		
		//Admin Branches Address1 EB
		@FindBy(id= "txtAdd1")
		public WebElement Address1_EB ;
				
		//Admin Branches Address2_EB;
		@FindBy(id = "Txtadd2")
		public WebElement Address2_EB ;
		
		//Admin Branches Address3_EB;
		@FindBy(id= "txtadd3")
		public WebElement Address3_EB ;
		
		//Admin Branches Area_EB
		@FindBy(id= "txtArea")
		public WebElement Area_EB ;
		
		//Admin Branches Zipcode_EB
		@FindBy(id= "txtZip")
		public WebElement Zipcode_EB;
		
		//Admin Branches Country Dropdown
		@FindBy(id= "lst_counrtyU")
		public WebElement Country_Dropdown;
		
		
		//Admin Branches State Dropdown
		@FindBy(id= "lst_stateI")
		public WebElement State_Dropdown;
				
		//Admin Branches City Dropdown
		@FindBy(id = "lst_cityI")
		public WebElement City_Dropdown;
		
		//Admin Branches Submit button;
		@FindBy(id= "btn_insert")
		public WebElement NewBranch_Submit_btn;
		
		//Admin Branches Reset Button
		@FindBy(id= "Btn_Reset")
		public WebElement NewBranch_Reset_btn;
		
		//Admin Branches Cancel Button
		@FindBy(id= "Btn_cancel")
		public WebElement NewBranch_Cancel_btn;
		

		 



}
