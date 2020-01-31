package banking_Project_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin_runner {

	public static void main(String[] args) throws Exception {
		String path = "X:\\R Priyanka Workspace\\Selenium Workspace\\Browser Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		
		//launch chrome browser with help of webdriver interface
		WebDriver driver=new ChromeDriver();
		
		//Load webpage to browser window
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
		
		//Create object for Admin login testcase class
		Admin_Login_Testcase TC= new Admin_Login_Testcase(driver);
		TC.Admin_login("Admin", "Admin");
		
		//Admin page obj
		Admin_Page TC2= new Admin_Page(driver);
		
		TC2.Admin_Home_btn.click();
		Thread.sleep(2000);
		
		TC2.Admin_Branches_btn.click();
		Thread.sleep(2000);
		//TC2.Admin_Home_btn.click();
		//Thread.sleep(2000);
		
		TC2.Admin_Roles_btn.click();
		Thread.sleep(2000);
		//TC2.Admin_Home_btn.click();
		//Thread.sleep(2000);
		
		TC2.Admin_Users_btn.click();
		Thread.sleep(2000);
		
		//TC3.Admin_Home_btn.click();
		//Thread.sleep(2000);
		
		TC2.Admin_Employee_btn.click();
		Thread.sleep(2000);
		
		//TC2.Admin_Home_btn.click();
		//Thread.sleep(2000);
		
		
				
	}

}
