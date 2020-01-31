package banking_Project_Admin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Update {


	public static void main(String[] args) throws Exception 
	{
	
		String path="X:\\R Priyanka Workspace\\Selenium Workspace\\Browser Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		
		//admin login
		driver.findElement(By.id("txtuId")).clear();
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		//password
		driver.findElement(By.id("txtPword")).clear();
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		
		//login
		driver.findElement(By.id("login")).click();
		
		//branches
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a")).click();
		Thread.sleep(3000);
	
	
	boolean flag = false;
	boolean flag1= false;
	int x=0;
	
	
	do {
		WebElement Table;
		Table = driver.findElement(By.id("DG_bankdetails"));
		
		//Outer Row
		WebElement LastRow;
		LastRow= Table.findElements(By.tagName("tr")).get(6);
		List<WebElement> Pagelinks;
		Pagelinks= LastRow.findElements(By.tagName("a"));
		
		int Linkcount;
		Linkcount = Pagelinks.size();//Page links size = 10
		System.out.println("linkname==>"+Linkcount);
		
		//Inner loop
		for(int i=x; i<= Linkcount-1; i++)
		{
			
			List<WebElement> Rows= Table.findElements(By.tagName("tr"));
			System.out.println("Number of Rows at Each Page-->"+Rows.size());
			
			//Iterate for Number of rows
			for(int j=1; j<=Rows.size()-2; j++) //Row size= 7
			{
				//Find list of cells under each row
				List<WebElement> Cells= Rows.get(j).findElements(By.tagName("td"));
				//System.out.println("List of Cells at each page is => "+Cells.size());
				for(int k=0; k<Cells.size();k++)
				{
					String EachCellText= Cells.get(k).getText();
					if(EachCellText.equals("reddy123"))
					{
			
						Cells.get(6).findElement(By.tagName("a")).click();
						Thread.sleep(1000);
						
						Webtable_Admin_Branch_Update Update=new Webtable_Admin_Branch_Update(driver);
						Update.Branch_Updation("MQDSNR50124", "Chaittanya", "Puri", "Dsnr", "Dsnr1", "12356", "INDIA", "MAHARASTRA", "MUMBAI");
						
						Keywords Alert=new Keywords(driver);
						Alert.Alert_Handle();
						
						flag1=true;
						break;
					}	
							
				}
				if(flag1==true)
				{
					break;
				}
			}	
			if(flag1==true)
			{
				break;
				
			}
			
		
			Pagelinks.get(i).click();
			Thread.sleep(1000);
			x=1;
			//Restore Table details to avoid Stale Element reference exception
			Table=driver.findElement(By.id("DG_bankdetails"));
			
			LastRow=Table.findElements(By.tagName("tr")).get(6);
			
			Pagelinks=LastRow.findElements(By.tagName("a"));
			
		 }
		if(flag1== true)
		{
			break;
		}
		
		String Next = Pagelinks.get(Linkcount-1).getText();
		
		if(Next.equals("..."))
		{
			flag= true;
			Pagelinks.get(Linkcount-1).click();
		}
		
		if(!Next.equals("..."))
		{
			flag=false;
		}
	}
	while(flag);
	}
}

