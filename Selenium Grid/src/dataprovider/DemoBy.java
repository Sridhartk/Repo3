package dataprovider;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class DemoBy {

	static {
		System.setProperty("www.chrome.driver","./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.112.128:8080/crm/HomePage.do");
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).clear();
		Thread.sleep(2000);
	    driver.findElement(new ByAll(By.id("userName"),By.name("j_username"),By.xpath(".//input[@type='text']"))).sendKeys("rashmi@dell.com");
		Thread.sleep(2000);
	    driver.findElement(By.name("j_password")).clear();
		Thread.sleep(2000);
	    driver.findElement(new ByIdOrName("passWord")).sendKeys("123456");
		
		Thread.sleep(2000);
		driver.findElement(new ByChained(By.xpath("(.//td[@align='left'])[16]"),(By.xpath(".//input[@title='Sign In']")))).click();
		
		
		driver.close();
	}
}
