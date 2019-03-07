package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	public WebDriver driver;
	
	By username=By.cssSelector("input[name=uid]"); //send keys 
	By password= By.cssSelector("input[name=password]");// send keys
	By button=By.cssSelector("input[name=btnLogin]"); //click
	
	
	public loginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public WebElement enterUn()//we are sending web element
	{
		return driver.findElement(username);
	}
	public WebElement enterPW()
	{
		return driver.findElement(password);
	}
	public WebElement pushB()
	{
		return driver.findElement(button);
	}
}
