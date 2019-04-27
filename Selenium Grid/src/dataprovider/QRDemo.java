package dataprovider;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class QRDemo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void testqrcode() throws IOException, NotFoundException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.qrcode-monkey.com/");
	
	String src = driver.findElement(By.tagName("img")).getAttribute("src");
	System.out.println("The src is " + src);
	
	URL srcurl=new URL(src);
	BufferedImage buffersrc = ImageIO.read(srcurl);
	
	LuminanceSource BILS = new BufferedImageLuminanceSource(buffersrc);
	BinaryBitmap BBM=new BinaryBitmap(new HybridBinarizer(BILS));
	
	Result res = new MultiFormatReader().decode(BBM);
	System.out.println(res.getText());
	
	
	
	}
}
