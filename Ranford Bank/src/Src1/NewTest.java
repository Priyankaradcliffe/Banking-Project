package banking_Project_Admin;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class NewTest 
{
	 String driver_path= "X:\\R Priyanka Workspace\\Selenium Workspace\\Browser Drivers\\chromedriver.exe";
	 String Reports_path= "X:\\R Priyanka Workspace\\Selenium Workspace\\Extent Reports\\report1.html";
	 String Screen_path= "X:\\R Priyanka Workspace\\Selenium Workspace\\Screens\\";
	 WebDriver driver =null;
	 ExtentReports report;
	 ExtentTest test;
	 String URL ="http://192.168.1.97/ebank2/home.aspx";
	 Keywords key;
	 
	 
	 @Test(priority = 0)
	 public void Ranford_HomePage()
	 {
		 
		if(driver.getTitle().equals("MINDQ RANFORD BANK"))
			{
			 	test.log(LogStatus.PASS, "Expected RHP title presented");
			 
			 }
			  
		 else
		  {
			  test.log(LogStatus.SKIP, "Precondition failed, Ranford Home page can not be displayed");

		  }
	 }
		
	@Test(priority = 1, dependsOnMethods= "Ranford_HomePage")
	public void Admin_login()
	{
		Admin_With_Excel Admin= new Admin_With_Excel(driver);
		Admin.Excel_Admin_Login();
		 
		if(driver.getTitle().equals("RANFORD BANK"))
		{
			test.log(LogStatus.INFO, "Expected Admin Page title presented");
				 
		}
				  
		 else
		  {
			  test.log(LogStatus.FAIL, "Precondition failed, Admin page can not be displayed");
	  
		  }
	 }
	  
	  @Test(priority = 2, dependsOnMethods= "Admin_login")
	  public void New_branch_creation() throws Exception
	  {
		  if(driver.getTitle().equals("RANFORD BANK"))
		  {			
				Admin_Page Branchbtn = new Admin_Page(driver); 
				Branchbtn.Admin_Home_btn.click();
				Thread.sleep(500);
				Branchbtn.Admin_Branches_btn.click();
				test.log(LogStatus.INFO, "Expected Branch button clicked");
		  
				if(driver.getCurrentUrl().contains("http://192.168.1.97/ebank2/admin_banker_master.aspx"))
				{
					test.log(LogStatus.INFO, "Expected Branches URL verified and Branches page Displayed");
					  
					Admin_Branches newbranch = new Admin_Branches(driver);
					newbranch.New_Branch_btn.click();
					  
					if(driver.getCurrentUrl().contains("http://192.168.1.97/ebank2/admin_banker_master.aspx"))
					{
						test.log(LogStatus.INFO, "Expected New Branch Page Displayed");
						  
						Admin_With_Excel Branch = new Admin_With_Excel(driver);
						Branch.Excel_New_Branch_Creation();
						  key = new Keywords(driver);
						  key.Verify_AlertText_Presented("Branch name already Exist");

  
						
					}
					else
					{
						test.log(LogStatus.FAIL, "Expected New Branch Page can not be displayed");
		
					}
					 
				 }
				 else
				 {
					 test.log(LogStatus.FAIL, "Expected Branches Page can not be displayed");
		
				 }
				
		  }
		  else
		  {
			  test.log(LogStatus.FAIL, "Branch button can't be clicked");
	
	      }
	  }
	 
	  @Test(priority = 3, dependsOnMethods= "Admin_login")
	  public void New_Role_creation() throws Exception
	  {
	  if(driver.getCurrentUrl().contains("http://192.168.1.97/ebank2/admin_banker_master.aspx"))
	  {			
			Admin_Page Rolesbtn = new Admin_Page(driver); 
			Rolesbtn.Admin_Home_btn.click();
			Rolesbtn.Admin_Roles_btn.click();
			test.log(LogStatus.INFO, "Expected Role button clicked");
			
			if(driver.getCurrentUrl().contains("http://192.168.1.97/ebank2/Admin_Roles_details.aspx"))
			{
				test.log(LogStatus.INFO, "Expected Roles URL verified and Roles page Displayed");
				  
				Admin_Roles newrole = new Admin_Roles(driver);
				newrole.New_Role_btn.click();

	  
				if(driver.getTitle().equals("Admin_Roles_details"))
				{
					test.log(LogStatus.INFO, "Expected New Role Page Title Verified");
		  
					Admin_With_Excel Role = new Admin_With_Excel(driver);
					Role.Excel_New_Role_Creation();
					
				}
					
				else
				{
					test.log(LogStatus.FAIL, "Expected New Roles Page title can not beverifief");
	
				}
				 
			 }
			 else
			 {
				 test.log(LogStatus.FAIL, "Expected Roles Page can not be displayed");
	
			 }
			
	  }
	  else
	  {
		  test.log(LogStatus.FAIL, "Roles button can't be clicked");

      }
	  }
	  @Test(priority = 4, dependsOnMethods= "Admin_login")
	  public void New_Employee_creation() throws Exception
	  {
	  if(driver.getCurrentUrl().contains("http://192.168.1.97/ebank2/Admin_Roles_details.aspx"))
	  {			
			Admin_Page Empbtn = new Admin_Page(driver); 
			Empbtn.Admin_Home_btn.click();
			Empbtn.Admin_Employee_btn.click();
			test.log(LogStatus.INFO, "Expected Employee button clicked");
			
			if(driver.getCurrentUrl().contains("http://192.168.1.97/ebank2/Admin_Emp_details.aspx"))
			{
				test.log(LogStatus.INFO, "Expected Employee URL verified and Employee page Displayed");
				
				Admin_Employee newemp= new Admin_Employee(driver);
				newemp.New_Employee_btn.click();
				

	  
				if(driver.getTitle().equals("Admin_Emp_details"))
				{
					test.log(LogStatus.INFO, "Expected New Employee Page Title Verified");
		  
					Admin_With_Excel Emp = new Admin_With_Excel(driver);
					Emp.Excel_New_Employee_Creation();
					
				}
					
				else
				{
					test.log(LogStatus.FAIL, "Expected New Employee Page title can not beverifief");
	
				}
				 
			 }
			 else
			 {
				 test.log(LogStatus.FAIL, "Expected Employee Page can not be displayed");
	
			 }
			
	  }
	  else
	  {
		  test.log(LogStatus.FAIL, "Employee button can't be clicked");

      }
	  }
	  
	  @BeforeMethod
	  public void beforeMethod(Method method) 
	  {
		  test=report.startTest(method.getName());

	  }
	
	  @AfterMethod
	  public void afterMethod(Method method) throws Exception 
	  {
		  key = new Keywords(driver);
		  
		  key.CaptureScreen_When_Alert_Presented(Screen_path+method.getName()+"Image.PNG");
		  
		  //Capture Screen
		  test.log(LogStatus.INFO, test.addScreenCapture(Screen_path+method.getName()+"Image.PNG"));
		  Thread.sleep(1000);
		  key.Alert_Handle();
		  
		 
		  report.endTest(test);
	  }
	
	  @BeforeClass
	  public void beforeClass() 
	  {
		  report = new ExtentReports(Reports_path, true);
		  System.setProperty("webdriver.chrome.driver", driver_path);
		  driver = new ChromeDriver();
		  driver.get(URL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	  }
	
	  @AfterClass
	  public void afterClass() throws Exception 
	  {
		  Thread.sleep(10000);
		  driver.close();
		  report.flush();
  
	  }

}
