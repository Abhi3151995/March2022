package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.HTMLReportGenerator;

public class Hookable {
	
	
	
	@Before
	public void before(Scenario scenario) throws UnknownHostException
	
	

	{
		HTMLReportGenerator.TestSuiteStart("E:\\Report\\bank.html","primusbank");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		System.out.println("........................................Scenario Start...............");
		
	}
	
	@After
	 public void after (Scenario scenario)
	 {
		 System.out.println(".....................................Scenario End.................");
		 HTMLReportGenerator.TestCaseEnd();
		 HTMLReportGenerator.TestSuiteEnd();
	 }
	
	

}
