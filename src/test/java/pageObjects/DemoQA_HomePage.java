package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DemoQA_HomePage extends BasePage {

	public DemoQA_HomePage(WebDriver driver) {
		super(driver);
	}
	
	// Initializing the webElement using FindBy Annotation	
	@FindBy(xpath="//a[contains(text(),'Form(Text')]")
	WebElement form;
	
	@FindBy(how = How.XPATH, using="//a[contains(text(),'Frames Demo Page')]")
	WebElement frameDemo;
	
	@FindBy(how = How.XPATH, using="//a[contains(text(),'Simple Login Page with Validations')]")
	WebElement loginPage;
	
	@FindBy(xpath="//a[contains(text(),'Window Handling Demo Page')]")
	WebElement windowHandlingDemo;
	
	@FindBy(xpath="//a[contains(text(),'Alert box and Buttons Demo Page')]")
	WebElement alertBoxDemo;
	
	@FindBy(xpath="//*[text()='Drag and Drop Demo Page']")
	WebElement dragAndDropDemo;
	
	@FindBy(xpath="//*[text()='Waits Demo Page']")
	WebElement waitsDemo;
	
	@FindBy(xpath="//*[text()='File Upload Demo Page']")
	WebElement fileUploadDemo;
	
	// Action Method
	public void clickOnForm() {
		form.click();		
	}
	
	public void clickOnFramesDemo() {
		frameDemo.click();
	}
	
	public void clickOnLoginDemo() {
		loginPage.click();
	}
	
	public void clickOnWindowHandlingDemo() {
		windowHandlingDemo.click();
	}
	
	protected void clickOnAlertBoxDemo() {
		windowHandlingDemo.click();
	}
	
	protected void clickOnDragAndDropDemo() {
		dragAndDropDemo.click();
	}
	
	protected void clickOnWaitsDemo() {
		waitsDemo.click();
	}
	
	protected void clickOnFileUploadDemo() {
		fileUploadDemo.click();
	}
	

}
