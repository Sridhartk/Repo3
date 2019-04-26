package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	
		@FindBy(id="Username")
		private WebElement unTB;
		
		@FindBy(name="passWord")
		private WebElement pwTB;
		
		@FindBy(xpath="//div[text()='Login ']")
		public WebElement loginBTN;
		
		public SigninPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void setUserName(String un)
		{
			unTB.sendKeys(un);
		}
		
		public void setPwd(String pw)
		{
			pwTB.sendKeys(pw);
		}
		public void clickLogin()
		{
			loginBTN.click();
		}
		
		
}
