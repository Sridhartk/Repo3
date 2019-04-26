package script;

import org.testng.annotations.Test;

import Page.SigninPage;
import generic.BaseTest;
import generic.XL;

public class SigninTest {
	public class ValidLogin extends BaseTest{

		@Test(priority=1)
		public void testValidLogin() throws InterruptedException
		{
			String un=XL.getData(XL_PATH,"Signin",1,0);
			String pw=XL.getData(XL_PATH,"Signin",1,1);
			//String title=XL.getData(XL_PATH,"ValidLogin",1,2);
			//Enter valid user name
			Thread.sleep(2000);
			SigninPage lp=new SigninPage(driver);
			lp.setUserName(un);
			//Enter valid password
			lp.setPwd(pw);
			Thread.sleep(2000);
			//click login button
			lp.clickLogin();
			Thread.sleep(3000);
}

}
}