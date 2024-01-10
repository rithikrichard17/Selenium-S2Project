package Tests;

	import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.LoginPage;

	@Listeners(ItestListenerClass.class)
	public class LoginTest extends BasePage {

		LoginPage lp;

		@BeforeClass
		public void OpenApp() throws MalformedURLException {

		    OpenBrowser("Chrome");
			lp = new LoginPage(driver);
		}

		
		@Test(priority = '1', dataProvider = "testdata")
		public void LoginPage(String Username, String Password) throws InterruptedException {

			Thread.sleep(2000);
			lp.clickOnLogin();
			Thread.sleep(2000);
			lp.EnterUsername(Username);
			Thread.sleep(2000);
			lp.EnterPassword(Password);
			Thread.sleep(2000);
			lp.Loginbtn();

		}
		
		@DataProvider(name = "testdata")
		public Object[][] datasupplier() throws IOException {

			Object[][] input = Utilities.Xls_DataProvider.getTestData("Sheet1");
			return input;
		}

		@AfterClass
		public void CloseApp() {

			driver.quit();
		}

	}
