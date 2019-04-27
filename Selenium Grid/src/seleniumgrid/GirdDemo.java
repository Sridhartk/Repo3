package seleniumgrid;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GirdDemo {
	
	@Test
	@Parameters({"node","browser"})
	public void testA( String browser, String node) throws Exception
	{
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		

		dc.setBrowserName(browser);
		URL url=new URL(node);
		WebDriver driver=new RemoteWebDriver(url, dc);
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium gird");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		driver.quit();
		
	}

}
