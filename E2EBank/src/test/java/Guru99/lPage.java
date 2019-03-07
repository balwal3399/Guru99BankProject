package Guru99;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.base;
import junit.framework.Assert;
import pageObject.loginPage;

public class lPage extends base {//all methods in base we can call it by using extends(inheritance) 
	
	@Test
	
	public void basePageNavigation() throws IOException //gets driver from basepage
	{
	driver=initializeDriver();
	driver.get("http://www.demo.guru99.com/V4/");
	
	loginPage l=new loginPage(driver);
	l.enterUn().sendKeys("mngr182550");
	l.enterPW().sendKeys("hYhEmEz");
	l.pushB().click();
	
	WebElement msg=driver.findElement(By.xpath("//h2[@class='barone']"));
	String text=msg.getText();
	Assert.assertTrue(msg.isDisplayed());

	
}
}