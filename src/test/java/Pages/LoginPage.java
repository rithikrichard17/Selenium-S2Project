package Pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {

		//WebDriver driver;

		// Create PageFactory

		@FindBy(linkText = "Log in")
		WebElement Login;

		@FindBy(xpath = "//input[@id='Email']")
		WebElement username;
		
		@FindBy(xpath = "//input[@id='Password']")
		WebElement password;
		
		@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
		WebElement LogIn ;

		public LoginPage(WebDriver driver) {

			PageFactory.initElements(driver, this);
		}

		// Actions

		public void clickOnLogin() {

			Login.click();
		}

		public void EnterUsername(String Username) {

			username.sendKeys(Username);

		}

		public void EnterPassword(String Password) {

			password.sendKeys(Password);
		}

		public void Loginbtn() {
			
		   LogIn.click();
			
		}

	}

