package banking_Project_Admin;



import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class Admin_With_Excel

{
	public WebDriver driver;
	public FileInputStream fi;
	public XSSFWorkbook book;
	public XSSFSheet sht;
	public XSSFRow row;
	public String filepath= "X:\\R Priyanka Workspace\\Selenium Workspace\\TEST DATA\\Admin.xlsx";
	public Admin_Page Apage;
	public Admin_Branches Abranches;
	public Admin_NewBranch_TestCase A_Newbranch;
	public Admin_Users Ausers;
	
	public Keywords key;

	
	public Admin_With_Excel(WebDriver driver)
	{
		 this.driver=driver;
		 Apage= new Admin_Page(driver);
		 Abranches=  new Admin_Branches(driver);
		 A_Newbranch = new Admin_NewBranch_TestCase(driver);
		 Ausers =  new Admin_Users(driver);
		 key=new Keywords(driver);
	
	}
	
	

	
	
	public void Excel_Connection(String filepath, String sheetname)
	{
		try 
		{
			fi = new FileInputStream(filepath);
			book = new XSSFWorkbook(fi);
			sht = book.getSheet(sheetname);
			row = sht.getRow(1);
			
		} 
		
		catch (Exception e) 
		
		{
			e.printStackTrace();
		}
		
	}
	
	public void Excel_Admin_Login()
	
	{
		 Excel_Connection(filepath, "Admin_Login");
		 String UID= row.getCell(0).getStringCellValue();
		 String PWD= row.getCell(1).getStringCellValue();
		 
		 RHP admin = new RHP(driver);
		 
		 admin.Admin_User_Name_EB.clear();
		 admin.Admin_User_Name_EB.sendKeys(UID);
		 admin.Admin_Password_EB.clear();
		 admin.Admin_Password_EB.sendKeys(PWD);
		 admin.Admin_Login_btn.click();
		 
	}
	
	public void Excel_New_Branch_Creation() throws Exception
	{
		Excel_Connection(filepath, "New_Branch");
		String B_name= row.getCell(0).getStringCellValue();
		String Add1= row.getCell(1).getStringCellValue();
		String Add2= row.getCell(2).getStringCellValue();
		String Add3= row.getCell(3).getStringCellValue();
		String Area= row.getCell(4).getStringCellValue();
		String Zip= row.getCell(5).getStringCellValue();
		String Country= row.getCell(6).getStringCellValue();
		String State= row.getCell(7).getStringCellValue();
		String City= row.getCell(8).getStringCellValue();
		
	
		//Apage.Admin_Branches_btn.click();
		//Thread.sleep(1000);
		
		//Abranches.New_Branch_btn.click();
		//Thread.sleep(2000);
		
		A_Newbranch.Admin_NewBranch_Creation(B_name, Add1, Add2, Add3, Area, Zip, Country, State, City);
		
		

		
	/*	branch.Branch_Name_EB.clear();
		branch.Branch_Name_EB.sendKeys(Bname);
		
		branch.Address1_EB.clear();
		branch.Address1_EB.sendKeys(Add1);
		
		branch.Address2_EB.clear();
		branch.Address2_EB.sendKeys(Add2);
		
		branch.Address3_EB.clear();
		branch.Address3_EB.sendKeys(Add3);
		
		branch.Area_EB.clear();
		branch.Area_EB.sendKeys(Area);
		
		branch.Zipcode_EB.clear();
		branch.Zipcode_EB.sendKeys(Zip);
		
		new Select(branch.Country_Dropdown).selectByVisibleText(Country);
		Thread.sleep(2000);
		
		new Select(branch.State_Dropdown).selectByVisibleText(State);
		Thread.sleep(2000);
		
		new Select(branch.City_Dropdown).selectByVisibleText(City);
		Thread.sleep(2000);
		
		*/
	}
	
	
	public void Excel_New_Role_Creation() throws Exception
	{
		Excel_Connection(filepath, "New_Role");
		String R_name= row.getCell(0).getStringCellValue();
		String R_Desc= row.getCell(1).getStringCellValue();
		String R_Type= row.getCell(2).getStringCellValue();
	
	
		//Apage.Admin_Roles_btn.click();
		//Thread.sleep(1000);
		 
		Admin_Roles Aroles = new Admin_Roles(driver);
		Aroles.Admin_NewRole_Creation(R_name, R_Desc, R_Type);
		Thread.sleep(1000);
		
		key.Is_AlertPresented();

		

		
	}
	
	
	public void Excel_New_Employee_Creation() throws Exception
	{
		Excel_Connection(filepath, "New_Employee");
		String E_name= row.getCell(0).getStringCellValue();
		String Log_PW= row.getCell(1).getStringCellValue();
		String ERole= row.getCell(2).getStringCellValue();
		String EBranch= row.getCell(3).getStringCellValue();
		
		Apage.Admin_Employee_btn.click();
		Thread.sleep(2000);
		
		Admin_Employee Aemployee= new Admin_Employee(driver);
		 
		Aemployee.Admin_NewEmployee_Creation(E_name, Log_PW, ERole, EBranch);
		Thread.sleep(2000);
		
		
		key.Is_AlertPresented();

	}
	
	public void Excel_New_User_Creation()
	{
		Excel_Connection(filepath, "New_User");
		String Role= row.getCell(0).getStringCellValue();
		String Branch= row.getCell(1).getStringCellValue();
		String CID= row.getCell(2).getStringCellValue();
		String CName= row.getCell(3).getStringCellValue();
		String UName= row.getCell(4).getStringCellValue();
		String Log_Pwd= row.getCell(5).getStringCellValue();
		String Tran_PW= row.getCell(6).getStringCellValue();	
		
	}
	
	
	}
