package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demogrid1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		//dc.setBrowserName("firefox");
		dc.setPlatform(Platform.MAC);
		
		
		ChromeOptions option=new ChromeOptions();
		option.merge(dc);
		
		URL url=new URL("https://192.168.112.1:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url, option);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		/*DesiredCapabilities dc1=new DesiredCapabilities();
		
		dc1.setBrowserName("firefox");
		dc1.setPlatform(Platform.LINUX);
		
		
		FirefoxOptions option1=new FirefoxOptions();
		option1.merge(dc1);
		
		URL url1=new URL("https://192.168.112.1:4444/wd/hub");
		WebDriver driver1=new RemoteWebDriver(url1, option1);
		
		driver1.get("https://www.google.com");
		System.out.println(driver1.getTitle());

*/	}

}
