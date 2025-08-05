package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleLoginPage extends BasePage {
	protected SimpleLoginPage(WebDriver driver) {
		super(driver);
	}
	
	// Initializing the webElement using FindBy Annotation
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Show Password']")
	WebElement showpassword;
	
	@FindBy(xpath="//span[text()='Forgot Username and Password?']")
	WebElement forgotUsernamePassword;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement login;
	
	// Action Method
	protected void setUsername(String user) {
		username.sendKeys(user);
	}
	
	protected void setPassword(String passwd) {
		password.sendKeys(passwd);
	}
	
	protected void clickShowPassword() {
		showpassword.click();
	}
	
	protected void clickLogin() {
		login.click();
	}

}
