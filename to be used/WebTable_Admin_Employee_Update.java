package banking_Project_Admin;

import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Run_Employee_WebTable {

	 Keywords key;
	 String driver_path= "X:\\R Priyanka Workspace\\Selenium Workspace\\Browser Drivers\\chromedriver.exe";
	 String Reports_path= "X:\\R Priyanka Workspace\\Selenium Workspace\\Extent Reports\\report1.html";
	 String Screen_path= "X:\\R Priyanka Workspace\\Selenium Workspace\\Screens\\";
	 WebDriver driver =null;
	 ExtentReports report;
	 ExtentTest test;
	 String URL ="http://192.168.1.97/ebank2/home.aspx";
		
	  @Test(priority = 0)
	  public void Admin_login() throws Exception  
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
	 
		@Test(priority = 1,dependsOnMethods= "Admin_login")
		public void Update_Employee_Webtable() throws Exception
		{
			Admin_Page Empbtn = new Admin_Page(driver); 
			Thread.sleep(500);
			Empbtn.Admin_Employee_btn.click();	 
		
			Keywords key=new Keywords(driver);
			key.WebTable_Click_Update_Btn("//table[@id='DGBanker']", "harish", 6, 5); //(10page,5440)
			WebTable_Admin_Employee_Update Ubranch=new WebTable_Admin_Employee_Update(driver);
			Ubranch.Employee_Updation("harishhh", "Teller1","Accountant", "a");
		}
		
		@Test(priority = 2,dependsOnMethods= "Update_Employee_Webtable")
		public void verify_Role_Availability_At_WebTable() throws Exception
		{
			Admin_Page Empbtn = new Admin_Page(driver); 
			Thread.sleep(500);
			Empbtn.Admin_Employee_btn.click();	 
			
			Keywords key=new Keywords(driver);
			boolean flag=key.Verify_Webtable_Record_Available("//table[@id='DGBanker']", 6,"harishhh");
			Assert.assertTrue(flag);
			System.out.println("Expected Record has been found at Employee webtable");
	
		}
		
		@Test(priority=3)
		public void Click_Deletion_Employee_Btn_WebTable() throws Exception
		{
			Admin_Page Empbtn = new Admin_Page(driver); 
			Thread.sleep(500);
			Empbtn.Admin_Employee_btn.click();	 
			
			Keywords key=new Keywords(driver);
			key.WebTable_Click_Deletion_Btn("//table[@id='DGBanker']", "ytchgcv",6,6);//15page,2613
			
			System.out.println("Employee name has been deleted successfully");
		
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
		  public void beforeClass() throws Exception 
		  {
			  report = new ExtentReports(Reports_path, true);
			  System.setProperty("webdriver.chrome.driver", driver_path);
			  driver = new ChromeDriver();
			  driver.get(URL);
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  
			 /* //Admin login
			  driver.findElement(By.id("txtuId")).clear();
			  driver.findElement(By.id("txtuId")).sendKeys("Admin");
				
			  //password
			  driver.findElement(By.id("txtPword")).clear();
			  driver.findElement(By.id("txtPword")).sendKeys("Admin");
			
			  //login
			  driver.findElement(By.id("login")).click();
			
			  //branches
			  driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a")).click();
			  Thread.sleep(2000);
			*/
		  }
		
		  @AfterClass
		  public void afterClass() throws Exception 
		  {
			  Thread.sleep(10000);
			  driver.close();
			  report.flush();
	  
		  }

}
