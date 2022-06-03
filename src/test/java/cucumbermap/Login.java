package cucumbermap;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation3;

public class Login
{

	@When ("^user \"(.*)\" browser with exe$")
	public void bLaunch(String bname)
	{
		Object[] input=new Object[1];
        input[0]=bname;
        SeleniumOperation3.browserLaunch(input);
		
	}
	
	@When ("^user open url as$")
	public void openApp(String url)
	{
		   Object[] input1=new Object[1];
	         input1[0]="https://www.flipkart.com/";
	         SeleniumOperation3.openApplication(input1);
		
		
	}
	@When ("^user cancel initial Login window$")
	public void cancelLoginW()
	{  Object[] input2=new Object[1];
    input2[0]="//*[@class='_2KpZ6l _2doB4z']";
    SeleniumOperation3.clickOnElement(input2);
		
	}
	@When ("^user navigate on login button$")
	public void navigateLoginButton()
	{ Object[] input3=new Object[1];
    input3[0]="//*[text()='Login']";
    Hashtable<String,Object>  output3=SeleniumOperation3.mouseOver(input3);
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user navigate on login button$",output3.get("MASSAGE").toString());
	}
	@When ("^user click on Myprofile$")
	public void myProfile() throws InterruptedException
	{    Object[] input4=new Object[1];
    input4[0]="//*[text()='My Profile']";
    Hashtable<String,Object>  output4=SeleniumOperation3.clickOnElement(input4);;
	HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user click on Myprofile$",output4.get("MASSAGE").toString());
		Thread.sleep(5000);
	}
	
	@When ("^user enter \"(.*)\" as username$")
	public void enterUsername(String username)
	{   Object[] input5=new Object[2];
    input5[0]="//*[@class='_2IX_2- VJZDxU']";
    input5[1]=username;
    Hashtable<String,Object>  output5=SeleniumOperation3.sendKeys(input5);
    HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user enter \"(.*)\" as username$",output5.get("MASSAGE").toString());
		
	}
	@When ("^user enter \"(.*)\" as password$")
	public void enterPassword(String password)
	{  Object[] input6=new Object[2];
    input6[0]="//*[@type='password']";
    input6[1]=password;
    Hashtable<String,Object>  output6=SeleniumOperation3.sendKeys(input6);	
    HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"(.*)\" as password$",output6.get("MASSAGE").toString());
	}
	@When ("^user click on Login button$")
	public void clickLoginButton()
	{Object[] input7=new Object[1];
    input7[0]="(//*[text()='Login'])[3]";
    Hashtable<String,Object>  output7=SeleniumOperation3.clickOnElement(input7);
    HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user click on Login button$",output7.get("MASSAGE").toString());
		
	}
	
	@Then ("^Application shows user profile to user$")
	public void valid() throws InterruptedException
	{
	Thread.sleep(5000);
	Object[] input8=new Object[2];
    input8[0]="//*[@class='_1ruvv2']";
    input8[1]="Abhijeet Ramdas Shete";
    Hashtable<String,Object>  output8=SeleniumOperation3.vallidation(input8);
    HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^Application shows user profile to user$",output8.get("MASSAGE").toString());
	
	
	}
}
	
/*	@Then ("^Application shows appropriate error massage$")
	public void invalid()
	{
		Object[] input9=new Object[2];
	    input9[0]="(//*[text()='Login'])[2]";
	    input9[1]="Login";
	    Hashtable<String, Object>  output9=SeleniumOperation3.invalidation(input9);
	    HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^Application shows appropriate error massage$",output9.get("MASSAGE").toString());
		
		
	}
	
	@Then ("^Browser close$")
	public void bClose()
	{
		  Hashtable<String, Object>  output10=SeleniumOperation3.browserClose();
		  HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(),"^Browser close$",output10.get("MASSAGE").toString());
	}
	@When ("^user enters (.+) as username$")
	public void Username(String given)
	{   
	Object[] input10=new Object[2];
    input10[0]="//*[@class='_2IX_2- VJZDxU']";
    input10[1]=given;
    Hashtable<String, Object>  output11=SeleniumOperation3.sendKeys(input10);
    HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(),"^user enters (.+) as username$",output11.get("MASSAGE").toString());
	}
	@When ("^user enters (.+) as password$")
	public void Password(String pass)
	{  
	Object[] input11=new Object[2];
    input11[0]="//*[@type='password']";
    input11[1]=pass;
    Hashtable<String, Object>  output12=SeleniumOperation3.sendKeys(input11);
    HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(),"^user enters (.+) as password$",output12.get("MASSAGE").toString());
	} 
}*/
