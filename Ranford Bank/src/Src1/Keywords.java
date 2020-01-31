package banking_Project_Admin;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Keywords {

	
	WebDriver driver;
	SimpleDateFormat df;
	Date d;
	String time;
	
	public Keywords(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	
	/*
	 * Keyword:-->Close Alert
	 * Author:-->
	 * Created on:-->
	 * Reviewed By;-->
	 * Last updated date:-->
	 * 
	 */
	public boolean Is_AlertPresented()
	{
		boolean flag;
		try {
			driver.switchTo().alert();
			
		    flag=true;
		} catch (NoAlertPresentException e) {
			flag=false;
			System.out.println(e.getMessage());
		}
		
		return flag;
	}
	
	
	/*
	 * Keyword:-->Close Alert
	 * Author:-->
	 * Created on:-->
	 * Reviewed By;-->
	 * Last updated date:-->
	 * 
	 */
	public boolean Verify_AlertText_Presented(String Exp_alert_text) throws Exception
	{
		boolean flag;
		if(Is_AlertPresented())
		{
			String Act_alert_text=driver.switchTo().alert().getText();
			flag=Act_alert_text.contains(Exp_alert_text);
			//driver.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println(flag);

		}
		else
		{
			System.out.println("Alert not presented");
			flag=false;
		}
		
		return flag;
		
		
	}
	
	/*
	 * Keyword:-->Verify Page URL 
	 * Author:-->
	 * Created on:-->
	 * Reviewed By;-->
	 * Last updated date:-->
	 * 
	 */
	public boolean Verify_Page_URL(String Exp_URL) 
	
	{
		boolean flag1;
		

			String Act_URL=driver.getCurrentUrl();
			flag1=Act_URL.contains(Exp_URL);
			
			System.out.println(flag1);

		
		if(flag1= true)
		{
			System.out.println("Same URL");
		}
		
		else
		{
			System.out.println("WRONG URL");
			flag1=false;
		}
		return flag1;
		
	}
	
	/*
	 * Keyword:-->PAge Verification using Title
	 * Author:-->
	 * Created on:-->
	 * Reviewed By;-->
	 * Last updated date:-->
	 * 
	 */
	
	public boolean Verify_Page_Title(String Exp_Page_Title) 
	
	{
		boolean flag2;
		

			String Act_Page_Title=driver.getTitle();
			flag2= Act_Page_Title.contains(Exp_Page_Title);
			
			System.out.println(flag2);

		
		if(flag2= true)
		{
			System.out.println("Same Title");
		}
		
		else
		{
			System.out.println("Wrong Title");
			flag2=false;
		}
		return flag2;
		
	}
	
	/*
	 * Keyword:-->Screen Capture Using Time Stamp
	 * Author:-->
	 * Created on:-->
	 * Reviewed By;-->
	 * Last updated date:-->
	 * 
	 */
	
	
	public void Excel_ScreenCapture_TimeStamp() throws Exception
	{
		
			//creating simple date format
			 df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
			 
			//get system default date
			 d=new Date();
			//Convert system date using default format
			time =df.format(d);
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("X:\\R Priyanka Workspace\\Selenium Workspace\\Screens\\"+time+"TargetImage.png"));
			
		}
	
	/*
	 * Keyword:-->CaptureScreen_When_Alert_Presented
	 * Author:-->Priyanka R
	 * Created on:-->
	 * Reviewed By;-->
	 * Last updated date:-->
	 * 
	 */
	
	public void CaptureScreen_When_Alert_Presented(String path) throws Exception
	
	{
			//Create object fo robot class
			Robot robot=new Robot();
			
			//Get Screen dimension
			Dimension screen_size=Toolkit.getDefaultToolkit().getScreenSize();
			//Create screen using robot class
			BufferedImage image=robot.createScreenCapture(new Rectangle(screen_size));
			
			//Target file location to dump image
			//="X:\\R Priyanka Workspace\\Selenium Workspace\\Screens\\image1.png";
			
			File filepath=new File(path);
			
			//Write image into local system
			ImageIO.write(image, "PNG", filepath);
	}
	
	/*
	 * Keyword:-->Alert Handle
	 * Author:-->Priyanka R
	 * Created on:-->
	 * Reviewed By;-->
	 * Last updated date:-->
	 * 
	 */
	public void Alert_Handle() throws Exception
	{
		if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
		{
			
			//Switching to alert and captured alert controls to referral variable
			String Alert_text=driver.switchTo().alert().getText();
			
			//Capture text presented at alert
	
			System.out.println(Alert_text);
			Thread.sleep(2000);
			//Accept alert window
			driver.switchTo().alert().accept();
		}
		else
			System.out.println("Alert not presented at webpage");
		
		
		
		

	}

	 /* Keyword:--> Click Update Inside Webtable on expected Branch record
	 */
	public void WebTable_Click_Update_Btn(String table_Xpath,String branchname,int Rownum, int Cellnum) throws Exception
	{
		boolean flag=false;
		boolean flag1=false;
		int x=0;
		do {
			WebElement Table;
			Table=driver.findElement(By.xpath(table_Xpath));
			
			WebElement Last_Row;
			Last_Row=Table.findElements(By.tagName("tr")).get(Rownum);
			
			List<WebElement> Pagelinks;
			Pagelinks=Last_Row.findElements(By.tagName("a"));
			
			int Link_Count;
			Link_Count=Pagelinks.size();
			System.out.println(Link_Count);
			
			for (int i = x; i <= Link_Count-2; i++) 
			{
				//Find list of rows under each row
				List<WebElement> Rows=Table.findElements(By.tagName("tr"));
				int Rows_size=Rows.size();
				
				System.out.println("List of rows at each page is => " +Rows_size);
				
				//iterate for number of rows
				for (int j = 1; j <=5; j++)
				{
					//Find list of cells under each row
					List<WebElement> Cells=Rows.get(j).findElements(By.tagName("td"));
					int Cell_size=Cells.size();
					
					//System.out.println("List of cells at each page is => " +Cell_size);
					
					//iterate for number of cells
					for (int k = 0; k < Cell_size; k++) 
					{
						String EachCell_Text=Cells.get(k).getText();
						
						if (EachCell_Text.equals(branchname)) 
						{
							Cells.get(Cellnum).findElement(By.tagName("a")).click();
							Thread.sleep(1000);
							
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
	
				//Restore Table details to avoid staleElement reference exception
				Table=driver.findElement(By.xpath(table_Xpath));
				Last_Row=Table.findElements(By.tagName("tr")).get(Rownum);
				Pagelinks=Last_Row.findElements(By.tagName("a"));
		
			}
			if(flag1==true)
			{
				break;
			}
			
		
			String Next;
			Next=Pagelinks.get(Link_Count-1).getText();
			
			if(Next.equals("..."))
			{
				flag=true;
				Pagelinks.get(Link_Count-1).click();
				
			}
			
			if (!Next.equals("..."))
			{
				flag=false;	
			}
			
		} while (flag);
	}


/*
 * keyword:--> Verify Expected Record Available
 */

	public boolean Verify_Webtable_Record_Available(String table_Xpath,int Rownum, String branchname ) throws Exception
	{
		boolean flag=false;
		boolean flag1=false;
		int x=0;
		do {
			WebElement Table;
			Table=driver.findElement(By.xpath(table_Xpath));
			
			WebElement Last_Row;
			Last_Row=Table.findElements(By.tagName("tr")).get(Rownum);
			
			List<WebElement> Pagelinks;
			Pagelinks=Last_Row.findElements(By.tagName("a"));
			
			int Link_Count;
			Link_Count=Pagelinks.size();
			System.out.println(Link_Count);
			
			for (int i = x; i <= Link_Count-2; i++) 
			{
				//Find list of rows under each row
				List<WebElement> Rows=Table.findElements(By.tagName("tr"));
				int Rows_size=Rows.size();
				
				System.out.println("List of rows at each page is => " +Rows_size);
				
				//iterate for number of rows
				for (int j = 1; j <=5; j++)
				{
					//Find list of cells under each row
					List<WebElement> Cells=Rows.get(j).findElements(By.tagName("td"));
					int Cell_size=Cells.size();
					
					//System.out.println("List of cells at each page is => " +Cell_size);
					
					//iterate for number of cells
					for (int k = 0; k < Cell_size; k++) 
					{
						String EachCell_Text=Cells.get(k).getText();
						
						if (EachCell_Text.equals(branchname)) 
						{
							
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
				
				//Restore Table details to avoid staleElement reference exception
				Table=driver.findElement(By.xpath(table_Xpath));
				Last_Row=Table.findElements(By.tagName("tr")).get(Rownum);
				Pagelinks=Last_Row.findElements(By.tagName("a"));
		
			}
			if(flag1==true)
			{
				break;
			}
		
			
	
			String Next;
			Next=Pagelinks.get(Link_Count-1).getText();
			
			if(Next.equals("..."))
			{
				flag=true;
				Pagelinks.get(Link_Count-1).click();
				
			}
			
			if (!Next.equals("..."))
			{
				flag=false;	
			}
			
		} while (flag);
		
		
		return flag1;
	}

}
	




