package dataprovider;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;
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

public class BarcodeDemo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test
	public void Barcode() throws IOException, NotFoundException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://barcode.tec-it.com/en/Code128?data=AutomateBarcode");
		
		String barcodeurl = driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println("Barcode URl is " + barcodeurl);
		
		URL barurl=new URL(barcodeurl);
		BufferedImage bufferimage=ImageIO.read(barurl);
		
		
		
		LuminanceSource luminancesource= new BufferedImageLuminanceSource(bufferimage);
		BinaryBitmap binarybitmap=new BinaryBitmap(new HybridBinarizer(luminancesource));
		
	 Result result = new MultiFormatReader().decode(binarybitmap);
		
		System.out.println(result.getText());
		driver.close();
	}

}
