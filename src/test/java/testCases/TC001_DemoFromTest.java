package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.DemoQA_HomePage;
import pageObjects.FormDemo;
import testBase.BaseClass;

public class TC001_DemoFromTest extends BaseClass {
	
	String firstName = "Testing";
	String lastName = "Colleges";
	String mobileNumber ="9876543210";
	String dateOfBirth = "12/04/1989";
	String state = "Goa";
	
	String demoFormConfirmationMessage = "You form is submitted! Thank You ...";
	
	@Test
	public void verify_demo_form() {
		DemoQA_HomePage dh = new DemoQA_HomePage(driver);
		dh.clickOnForm();
		
		FormDemo fd = new FormDemo(driver);
		fd.setFirstName(firstName);
		fd.setLastName(lastName);
		fd.selectFemaleRadioBtn();
		fd.setMobileNumber(mobileNumber);
		fd.setDateOfBirth(dateOfBirth);
		fd.selectReadingHobbie();
		fd.selectMusicHobbie();
		fd.selectState(state);
		fd.clickSubmitBtn();
		
		String confirmationMessage = fd.confirmationMessage();
		Assert.assertEquals(confirmationMessage, demoFormConfirmationMessage);
	}

}
