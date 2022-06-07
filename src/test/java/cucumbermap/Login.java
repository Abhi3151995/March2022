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
	
	@When ("^user open url as \"(.*)\"$")
	public void openApp(String url)
	{
		   Object[] input1=new Object[1];
	         input1[0]=url;
	         SeleniumOperation3.openApplication(input1);
	}
	
	@When ("^user enters \"(.*)\" as username$")
	
	public void user_enters_as_username(String uname)
	{
		Object[] input2=new Object[2];
		input2[0]="//*[@id='txtuId']";
		input2[1]=uname;
		Hashtable<String,Object>input2op=SeleniumOperation3.sendKeys(input2);
		HTMLReportGenerator.StepDetails(input2op.get("STATUS").toString(),"user enters \"(.*)\" as username",input2op.get("MASSAGE").toString());
		
	}
	@When ("^user enters \"(.*)\" as password$")
	public void user_enters_as_password(String pass)
	{
		Object[] input3=new Object[2];
		input3[0]="//*[@id='txtPword']";
		input3[1]=pass;
		Hashtable<String,Object>input3op=SeleniumOperation3.sendKeys(input3);
		HTMLReportGenerator.StepDetails(input3op.get("STATUS").toString(),"user enters \"(.*)\" as password",input3op.get("MASSAGE").toString());
		
	}
	
	@When ("^user click on Login button$")
	public void user_click_on_Login_button()
	{
		Object[] input4=new Object[1];
		input4[0]="//*[@id='login']";
		Hashtable<String,Object>input4op=SeleniumOperation3.click(input4);
		HTMLReportGenerator.StepDetails(input4op.get("STATUS").toString(),"user click on Login button",input4op.get("MASSAGE").toString());
		
	}
	
	@Then ("^user is on \"(.*)\" main page and get msg aswecome to Admin$")
	public void user_is_on_main_page_and_get_as_msg_Welcome_to_Admin(String Name)
	{
		Object[] login=new Object[2];
		login[0]="//*[text()='Admin']";
		login[1]=Name;
		Hashtable<String,Object>loginop=SeleniumOperation3.vallidation(login);
		HTMLReportGenerator.StepDetails(loginop.get("STATUS").toString(),"user is on \"(.*)\" main page and get msg aswecome to Admin",loginop.get("MASSAGE").toString());
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}