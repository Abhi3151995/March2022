package utility;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperation3 
{

public static WebDriver driver=null;

public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();


public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)

{
	try
{
	String bname=(String) inputParameters[0];
	String exe=(String) inputParameters[1];
	
	if(bname.equalsIgnoreCase("Chrome"))
	{
	System.setProperty("webdriver.chrome.driver",exe);
	driver=new ChromeDriver();
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	else if(bname.equalsIgnoreCase("FF"))
	{
	System.setProperty("webdriver.geckodriver.driver",exe);
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MASSAGE", "methodUsed: browserLaunch,Input Given: "+inputParameters[0].toString());
	}
	
catch(Exception e)
	{
	outputParameters.put("STATUS", "FAIL");
	outputParameters.put("MASSAGE", "methodUsed: browserLaunch,Input Given: "+inputParameters[0].toString());
	}
	return outputParameters;
}

	public static Hashtable<String,Object> openApplication(Object[]inputParameters)
	{
	
		try
		{
		String URL=(String) inputParameters[0];
		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MASSAGE", "methodUsed:openApplication,Input Given: "+inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MASSAGE", "methodUsed:openApplication,Input Given: "+inputParameters[0].toString());
		}
		return outputParameters;
	}
	

	public static Hashtable<String,Object> sendKeys(Object[]inputParameters)
	{
		try
		{
		String XPATH=(String) inputParameters[0];
		String VALUE=(String) inputParameters[1];
		WebElement obj=driver.findElement(By.xpath(XPATH));
		obj.clear();
		obj.sendKeys(VALUE);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MASSAGE", "methodUsed:sendKeys,Input Given: " +inputParameters[1].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MASSAGE", "methodUsed:sendKeys,Input Given: " +inputParameters[1].toString());
		}
		return outputParameters;
	} 
	
	public static Hashtable<String,Object> click(Object[]inputParameters)
	
	{
		try{
			
			String XPATH=(String) inputParameters[0];
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			WebElement obj1=driver.findElement(By.xpath(XPATH));
			obj1.click();
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MASSAGE", "methodUsed:click,Input Given: " +inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MASSAGE", "methodUsed:click,Input Given: " +inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> dropDown(Object[]inputParameters)
	
	{
		try{
			String XPATH=(String) inputParameters[0];
			String name= (String) inputParameters[1];
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			Select sel=new Select(driver.findElement(By.xpath(XPATH)));
			sel.selectByVisibleText(name);
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MASSAGE", "methodUsed:dropdown,Input Given: " +inputParameters[0].toString());
			}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MASSAGE", "methodUsed:dropdown,Input Given: " +inputParameters[0].toString());
			}
			return outputParameters;
			
		
	}
	

	public static Hashtable<String,Object> vallidation(Object[]inputParameters)

	{
		try
		{
		String XPATH=(String) inputParameters[0];
		String text=(String) inputParameters[1];
		String actualText=driver.findElement(By.xpath(XPATH)).getText();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	 if(actualText.equalsIgnoreCase(text))
	 {
		 System.out.println("Test case Pass");
	 }
	 else
	 {
		 System.out.println("Test case Fail");
	 }
	 outputParameters.put("STATUS", "PASS");
		outputParameters.put("MASSAGE", "methodUsed:vallidation,Input Given: " +inputParameters[1].toString());
		}
		catch(Exception e)
		{
			 outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MASSAGE", "methodUsed:vallidation,Input Given: " +inputParameters[1].toString());
		}
		return outputParameters;
	}
	



	
}
