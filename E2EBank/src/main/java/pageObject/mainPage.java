package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainPage {
	public WebDriver driver;
	
	By ncustomer= By.xpath("//a[contains(text(),'New Customer')]");
	By name=By.cssSelector("input[name=name]");
	By gender=By.cssSelector("input[value=f]");
	//By dob=//
	
	By address=By.xpath("//textarea[@name='addr']");
	By city= By.cssSelector("input[name=city]");
	By state= By.cssSelector("input[name=state]");
	By pin= By.cssSelector("input[name=pinno]");
	By num= By.cssSelector("input[name=telephoneno]");
	By email= By.cssSelector("input[name=emailid]]");
	By pass= By.cssSelector("type[name=password]]");

	public mainPage(WebDriver driver) {
		
		this.driver=driver;
}
	public WebElement entCust()
	{
		return driver.findElement(ncustomer);
	}
	
	public WebElement entNaam()
	{
		return driver.findElement(name);
	}
	public WebElement entG()
	{
		return driver.findElement(gender);
	}
	public WebElement entAd()
	{
		return driver.findElement(address);
	}
	public WebElement entCity()
	{
		return driver.findElement(city);
	}
	public WebElement entSt()
	{
		return driver.findElement(state);
	}
	public WebElement entP()
	{
		return driver.findElement(pin);
	
	}
	public WebElement entNumber()
	{
		return driver.findElement(num);
	}
	public WebElement entE()
	{
		return driver.findElement(email);
	}
	public WebElement entPa()
	{
		return driver.findElement(pass);
	}
}