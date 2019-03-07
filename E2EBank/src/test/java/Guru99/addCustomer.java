package Guru99;

import Resources.base;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.mainPage;



public class addCustomer extends base {
	@Test
	
	public void basePageNavigation() throws IOException //gets driver from basepage
	{
		driver=initializeDriver();
		driver.get("http://www.demo.guru99.com/V4/manager/addcustomerpage.php/");
		
		addCustomer a=new addCustomer(driver);
	}

}