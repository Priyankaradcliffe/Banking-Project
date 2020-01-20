package banking_Project_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin_Roles_Runner {

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

		//Click Roles
		TC3.Admin_Roles_btn.click();
		Thread.sleep(2000);
		
		//Admin Roles Object Creation
		Admin_Roles TC4= new Admin_Roles(driver);
		
		TC4.Admin_NewRole_Creation("TellerPR", "Teller", "E");
		
		//driver.switchTo().alert().accept();
		Keywords key=new Keywords(driver);
		key.Verify_AlertText_Presented("Role Already existed");
		
		
	}

}
