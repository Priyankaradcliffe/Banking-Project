package banking_Project_Admin;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Keywords {

	WebDriver driver;
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
			driver.switchTo().alert().accept();
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
	
}

