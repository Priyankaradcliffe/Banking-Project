package banking_Project_Admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Admin_With_Excel

{

	public FileInputStream fi;
	public XSSFWorkbook book;
	public XSSFSheet sht;
	public XSSFRow row;
	public String filepath= "X:\\R Priyanka Workspace\\Selenium Workspace\\TEST DATA\\";
	
	
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void Excel_Admin_Login()
	
	{
		 Excel_Connection(filepath, "Admin_Login");
		 
		 String UID= row.getCell(0).getStringCellValue();
		 String PWD= row.getCell(1).getStringCellValue();
		 
	}
	
	public void Excel_New_Branch_Creation()
	{
		Excel_Connection(filepath, "New_Branch");
		String Bname= row.getCell(0).getStringCellValue();
		String Add1= row.getCell(1).getStringCellValue();
		String Add2= row.getCell(2).getStringCellValue();
		String Add3= row.getCell(3).getStringCellValue();
		String Area= row.getCell(4).getStringCellValue();
		String Zip= row.getCell(5).getStringCellValue();
		String Country= row.getCell(6).getStringCellValue();
		String State= row.getCell(7).getStringCellValue();
		String City= row.getCell(8).getStringCellValue();

		
		System.out.println(Bname);
		System.out.println(Add1);
		System.out.println(Add2);
		System.out.println(Add3);
		System.out.println(Area);
		System.out.println(Zip);
		System.out.println(Country);
		System.out.println(State);
		System.out.println(City);
	
	}
	
	
	public void Excel_New_Role_Creation()
	{
		Excel_Connection(filepath, "New_Role");
		String Rname= row.getCell(0).getStringCellValue();
		String R_Desc= row.getCell(1).getStringCellValue();
		String R_Type= row.getCell(2).getStringCellValue();
		
		

		System.out.println(Rname);
		System.out.println(R_Desc);
		System.out.println(R_Type);
		
	}
	
	
	public void Excel_New_Employee_Creation()
	{
		Excel_Connection(filepath, "New_Employee");
		String Ename= row.getCell(0).getStringCellValue();
		String Log_PW= row.getCell(1).getStringCellValue();
		String ERole= row.getCell(2).getStringCellValue();
		String EBranch= row.getCell(3).getStringCellValue();


		System.out.println(Ename);
		System.out.println(Log_PW);
		System.out.println(ERole);
		System.out.println(EBranch);

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
		

		
		System.out.println(Role);
		System.out.println(Branch);
		System.out.println(CID);
		System.out.println(CName);
		System.out.println(UName);
		System.out.println(Log_Pwd);
		System.out.println(Tran_PW);
		
	}
	
}
