package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//developing method for all our test cases
public class base {
	public WebDriver driver; //key word public so driver can be accessed outside class 
	public Properties prop;
public WebDriver initializeDriver() throws IOException  //defined webdriver globally
{
Properties prop= new Properties(); 
FileInputStream fis= new FileInputStream("//Users//akaashswarup//E2EBank//src//main//java//Resources//data.properties");//file path

prop.load(fis);
String browserName=prop.getProperty("browser");//gets browser from our property file
if(browserName.equals("chrome"))// don't use ==
{System.setProperty("webdriver.chrome.driver", "/Users/akaashswarup/Desktop/Bin/chromedriver");
 driver=new ChromeDriver();		
}
else if(browserName.equals("firefox"))
{
	//firefox code
}
else if (browserName.equals("IE"))
{
	//IE code
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
}
}


