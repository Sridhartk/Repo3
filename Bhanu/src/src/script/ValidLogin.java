package src.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Page.EnterTimeTrackPage;
import src.Page.*;

import src.generic.*;
//valid login
public class ValidLogin extends src.generic.BaseTest{

	@Test(priority=1)
	public void testValidLogin()
	{
		String un=src.generic.XL.getData(XL_PATH,"ValidLogin",1,0);
		String pw=src.generic.XL.getData(XL_PATH,"ValidLogin",1,1);
		String title=src.generic.XL.getData(XL_PATH,"ValidLogin",1,2);
		//Enter valid user name
		src.Page.LoginPage lp=new src.Page.LoginPage(driver);
		lp.setUserName(un);
		//Enter valid password
		lp.setPwd(pw);
		//click login button
		lp.clickLogin();
		//verify home page is displayed
//		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
//		e.verifyPageisDiplayed(driver, ETO, title);
		//lp.VerifyErrMsgDisplayed();
	}

}
