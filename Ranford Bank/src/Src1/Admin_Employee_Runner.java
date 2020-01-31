package banking_Project_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin_Employee_Runner {

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
		Thread.sleep(2000);
		
		//driver.switchTo().alert().accept();
		
		//KEYWORDS OBJ CREATION
		Keywords key=new Keywords(driver);
		
		//Click Employee Button 
		TC3.Admin_Employee_btn.click();
		Thread.sleep(2000);
		
		//verify Page URL
		key.Verify_Page_URL("http://192.168.1.97/ebank2/Admin_Emp_details.aspx");
		
		//verify Page Title
		key.Verify_Page_Title("Admin_Emp_details");
		
		//Admin Employee Object Creation
		Admin_Employee TC5= new Admin_Employee(driver);
		
		TC5.Admin_NewEmployee_Creation("Priyanka12","Mq123", "TellerPriyankaa", "Priyanka1232" );
		
		
		key.Verify_AlertText_Presented("Employer Already Existed...Try again");	
		
		}

}
