package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FormDemo extends BasePage {
	
	public FormDemo(WebDriver driver) {
		super(driver);
	}
	
	// Initializing the webElement using FindBy Annotation
	@FindBy(id="fname")
	WebElement fname;
	
	@FindBy(id="lname") 
	WebElement lname;
	
	@FindBy(className="_1427") 
	WebElement email;
	
	@FindBy(id="male") 
	WebElement rmale;
	
	@FindBy(id="fem") 
	WebElement rfemale;
	
	@FindBy(id="oth")	
	WebElement rother;
		
	@FindBy(id="mbl") 
	WebElement mobile;
	
	@FindBy(id="2222") 
	WebElement dob;
	
	@FindBy(id="shby") 
	WebElement sportsHobbie;
	
	@FindBy(id="rhby") 
	WebElement readingHobbies;
	
	@FindBy(id="mhby") 
	WebElement musicHobbies;
	
	@FindBy(xpath="//select[@name='state']") 
	WebElement statedropdown;
	
	@FindBy(id="fruits") 
	WebElement fruitsdropdown;
	
	@FindBy(id="submit")	
	WebElement submitbtn;
	
	@FindBy(id="reset") 
	WebElement reset;	
	
	// Action Method
	public void setFirstName(String fsname) { 
		fname.sendKeys(fsname); 
	}
	
	public void setLastName(String lsname) { 
		lname.sendKeys(lsname); 	
	}
	
	public void setEmail(String eemail) { 
		email.sendKeys(eemail); 
	}
	
	public void selectMaleRadioBtn() { 
		rmale.click(); 
	}
	
	public void selectFemaleRadioBtn() { 
		rfemale.click(); 
	}
	
	public void selectOtherRadioBtn() { 
		rother.click(); 
	}
	
	public void setMobileNumber(String smobile) { 
		mobile.sendKeys(smobile); 
	}
	
	public void setDateOfBirth(String sdob) { 
		dob.sendKeys(sdob); 
	}
	
	public void selectSportsHobbie() {
		sportsHobbie.click();
	}
	
	public void selectReadingHobbie() {
		readingHobbies.click();
	}
	
	public void selectMusicHobbie() {
		musicHobbies.click();
	}
	
	 public void selectState(String state) {
		 Select sdd = new Select(statedropdown);
		 sdd.selectByVisibleText(state);
	}
	
	public void clickSubmitBtn() {
		submitbtn.click();
	}
	
	public void clickResetBtn() {
		reset.click();
	}
	
	public String confirmationMessage() {
		String confirmmsg = driver.switchTo().alert().getText();
		
		return confirmmsg;
		
	}

}
