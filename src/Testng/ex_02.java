package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex_02 {
	@Test
	public void Tc1() {
		Reporter.log("running tC1");
	}
	@Test(enabled=true)
	public void tc2() {
		Reporter.log("tc2 running ");
	}
	
	@Test(invocationCount=3)
	public void Tc3() {
		Reporter.log("running tC3");
	}
	
	@Test(priority=1)
	public void Tc4() {
		Reporter.log("running tC4");
	}
	@Test(enabled=false)
	public void Tc5() {
		Reporter.log("running tC5");
	}
	
	
	
	
	
	

}
