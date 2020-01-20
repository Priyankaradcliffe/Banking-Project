package banking_Project_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Admin_Branches_Runner {

	public static void main(String[] args) throws Exception 
	{
			String path = "X:\\R Priyanka Workspace\\Selenium Workspace\\Browser Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);

			
			//Launch chrome browser with help of webdriver interface
			WebDriver driver=new ChromeDriver();
			
			//Load webpage to browser window
			driver.get("http://192.168.1.97/ebank2/home.aspx");
			driver.manage().window().maximize();
			
			//Create object for Admin login testcase class
			Admin_Login_Testcase TC= new Admin_Login_Testcase(driver);
			
			//Admin Login
			TC.Admin_login("Admin", "Admin");
			Thread.sleep(2000);

			//Admin page object Creation
			Admin_Page TC3= new Admin_Page(driver);
			
			//Click Branches
			TC3.Admin_Branches_btn.click();
			Thread.sleep(2000);
			
			//Admin Branches Object Creation
			Admin_Branches TC4= new Admin_Branches(driver);
			
			
			
			//=======================SEARCH AND CLEAR========================//
			
			//* Country Search
			//new Select(TC4.Country_Search).selectByVisibleText("INDIA");
			//Thread.sleep(2000);
			
			//State Search
			//new Select(TC4.State_Search).selectByVisibleText("Andhra Pradesh");
			//Thread.sleep(2000);
			
			//City Search
			//new Select(TC4.City_Search).selectByVisibleText("secundarabad");
			//Thread.sleep(2000);

			//TC4.Search_btn.click();
			//TC4.Clear_btn.click();
			
			//==========================NEW BRANCH CREATION======================//
			
			//Admin New branch Button click
			TC4.New_Branch_btn.click();
			Thread.sleep(2000);
			
			Admin_NewBranch_TestCase TC5= new Admin_NewBranch_TestCase(driver);
			
			//Admin Branch Name
			TC5.Admin_NewBranch_Creation("Priyanka1232","Chaitanyapuri1", "DSNR1", "Dsnr2", "DSNR3", "12345", "INDIA", "Andhra Pradesh", "secundarabad");
			

			
	}

}
