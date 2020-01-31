package banking_Project_Admin;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_data_From_Excel 
	{

	public static void main(String[] args) throws Exception 
	{
		String path = "X:\\R Priyanka Workspace\\Selenium Workspace\\Browser Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		
		//Launch chrome browser with help of webdriver interface
		WebDriver driver=new ChromeDriver();

		//Load webpage to browser window
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Admin_With_Excel TC= new Admin_With_Excel(driver);
		
		TC.Excel_Admin_Login();
		
		TC.Excel_New_Branch_Creation();
		
		TC.Excel_New_Role_Creation();
		
		TC.Excel_New_Employee_Creation();

		//TC.Excel_New_Employee_Creation();

	
	  
	 
	}

}
