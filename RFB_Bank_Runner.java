package banking_Project_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RFB_Bank_Runner {

	public static void main(String[] args) throws Exception
	{
		String path = "X:\\R Priyanka Workspace\\Selenium Workspace\\Browser Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		
		//launch chrome browser with help of webdriver interface
		WebDriver driver=new ChromeDriver();
		
		//Load webpage to browser window
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
		
		Admin_Login_Testcase TC1= new Admin_Login_Testcase(driver);

		TC1.RHP_links();
		

		//Create object for Admin login testcase class
		//Admin_Login_Testcase TC= new Admin_Login_Testcase(driver);
		//TC.Admin_login("Admin", "Admin");
		
		
		
		
		
	}

}
