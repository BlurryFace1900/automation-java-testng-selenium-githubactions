package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class homepage {
	
	private WebDriver driver;
	private ExtentTest test;
	
	@FindBy(xpath="(//p)[1]")
	WebElement disclaimer;
	
	@FindBy(xpath = "(//a[contains(text(),'Sign In')])[2]")
	WebElement signinlink;
	
	@FindBy(xpath = "(//a[contains(text(),'Create an Account')])[2]")
	WebElement createanaccountlink;

	
	public homepage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
	}
	
	public void verifyDisclaimer() {
		String disclaimerText = "This is a demo store to test your test automaiton scripts. No orders will be fulfilled. If you are facing any issue, email us at hello@softwaretestingboard.com.";
		assertEquals(disclaimerText, disclaimer.getText());
	}
	
	public void verifySignInLink() {
		assertTrue(signinlink.isDisplayed());
		assertTrue(signinlink.isEnabled());
		signinlink.click();
	}
	
//	public void signInLinkClick() {
//		signinlink.click();
//	}
	
	public void verifyCreateAnAccountLink() {
		assertTrue(createanaccountlink.isDisplayed());
		assertTrue(createanaccountlink.isEnabled());
		createanaccountlink.click();
	}
	
//	public void createAnAccountLinkClick() {
//		createanaccountlink.click();
//	}
}
