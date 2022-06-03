package utility;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumOperation3 
{

public static WebDriver driver=null;
public static Hashtable<String, Object> outputParameters=new Hashtable<String, Object>();


public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)

{ try
{
	String bname=(String) inputParameters[0];
	String exe=(String) inputParameters[1];
	
	if(bname.equalsIgnoreCase("chrome"))
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
	}
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MASSAGE", "methodUsed: browserLaunch,Input Given: " +inputParameters[0].toString());
	}
catch(Exception e)
	{
	outputParameters.put("STATUS", "FAIL");
	outputParameters.put("MASSAGE", "methodUsed: browserLaunch,Input Given: " +inputParameters[0].toString());
	}
	return outputParameters;
}
	public static Hashtable<String,Object> openApplication(Object[]inputParameters)
	{
		String URL=new String();
		try{
		
		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MASSAGE", "methodUsed:openApplication,Input Given: " +inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MASSAGE", "methodUsed:openApplication,Input Given: " +inputParameters[0].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)
	{
		try{
		String XPATH=(String) inputParameters[0];
		((RemoteWebDriver) driver).findElementByXPath(XPATH).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MASSAGE", "methodUsed:clickOnElement,Input Given: " +inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MASSAGE", "methodUsed:clickOnElement,Input Given: " +inputParameters[0].toString());;
		}
		return outputParameters;	
	}
	public static Hashtable<String,Object> mouseOver(Object[]inputParameters)
	{
		try
		{
		String XPATH=(String) inputParameters[0];
		Actions act=new Actions(driver);
		act.moveToElement(((RemoteWebDriver) driver).findElementByXPath(XPATH)).build().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MASSAGE", "methodUsed:mouseOver,Input Given: " +inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MASSAGE", "methodUsed:mouseOver,Input Given: " +inputParameters[0].toString());
		}
		return outputParameters;
		
	}
	public static Hashtable<String,Object> sendKeys(Object[]inputParameters)
	{
		try
		{
		String XPATH=(String) inputParameters[0];
		String VALUE=(String) inputParameters[1];
		((RemoteWebDriver) driver).findElementByXPath(XPATH).sendKeys(VALUE);	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
	
	public static Hashtable<String,Object> vallidation(Object[]inputParameters)

	{
		try
		{
		String XPATH=(String) inputParameters[0];
		String text=(String) inputParameters[1];
		String actualText=driver.findElement(By.xpath(XPATH)).getText();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
	
	public static Hashtable<String,Object> invalidation(Object[]inputParameters)

	{
		try
		{
		String XPATH=(String) inputParameters[0];
		String text=(String) inputParameters[1];
		String actualText=driver.findElement(By.xpath(XPATH)).getText();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 if(actualText.equalsIgnoreCase(text))
	 {
		 System.out.println("Test case Pass");
	 }
	 else
	 {
		 System.out.println("Test case Fail");
	 }
	 outputParameters.put("STATUS", "PASS");
		outputParameters.put("MASSAGE", "methodUsed:invalidation,Input Given: " +inputParameters[1].toString());
		}
		catch(Exception e)
		{
			 outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MASSAGE", "methodUsed:invalidation,Input Given: " +inputParameters[1].toString());
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> browserClose()
	{
		driver.close();
		
		return outputParameters;
	}
	
	
	public static Hashtable<String,Object> main(String[]args)

{
		//Launch Browser
	Object[] input=new Object[2];
	         input[0]="chrome";
	         input[1]="E:\\Automation support\\chromedriver.exe";
	         SeleniumOperation3.browserLaunch(input);
		//Open Application
	         Object[] input1=new Object[1];
	         input1[0]="https://www.flipkart.com/";
	         SeleniumOperation3.openApplication(input1);
    //clickOnElement
	         Object[] input2=new Object[1];
	         input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	         SeleniumOperation3.clickOnElement(input2);
	    //mouseOver
	         Object[] input3=new Object[1];
	         input3[0]="//*[text()='Login']";
	         SeleniumOperation3.mouseOver(input3);
	   //clickOnElement
	         Object[] input4=new Object[1];
	         input4[0]="//*[text()='My Profile']";
	         SeleniumOperation3.clickOnElement(input4);;
	   //sendkeys
	         Object[] input5=new Object[2];
	         input5[0]="//*[@class='_2IX_2- VJZDxU']";
	         input5[1]="9595952980";
	         SeleniumOperation3.sendKeys(input5);
	  //sendkeys
	         Object[] input6=new Object[2];
	         input6[0]="//*[@type='password']";
	         input6[1]="8329046687";
	         SeleniumOperation3.sendKeys(input6);
	   //clickOnElement
	         Object[] input7=new Object[1];
	         input7[0]="(//*[text()='Login'])[3]";
	         SeleniumOperation3.clickOnElement(input7);;
	         
	         return outputParameters;

	
	
	
}


	
}
