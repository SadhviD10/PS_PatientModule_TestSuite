package com.studio.home.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;
import com.studio.automation.framework.TestSession;
import com.studio.qe.automation.framework.pagefactory.MobileWebViewPage;
import com.studio.utils.PropFileHandler;

public class PatientSignUpPO extends MobileWebViewPage {

	public PatientSignUpPO(TestSession session) throws Exception {
		super(session, "Applications/studio/PatientSignUp");
	}

	/**
	 * Used to verify Fields on page
	 * 
	 * @param element
	 * @return
	 */

	public boolean verify_FieldOnPage121(String element) {
		WebDriverWait wait = new WebDriverWait(session.driver, 30);

		WebElement status = wait.until(ExpectedConditions.visibilityOf(element(element)));
		return status.isDisplayed();
	}
	
	/**
	 *  used to click on element
	 * @param element
	 */
	
	public void click_OnTab(String element) {
		element(element).click();
		
	}
	
	/** 
	 * used to verify fields on Signup page
	 * @return
	 */
	
	public boolean verify_FieldsOnSignUpPage() {
		boolean status=false;
		
		if((element("FirstName").isDisplayed()) && (element("LastName").isDisplayed()) && (element("PhoneNumber").isDisplayed()) && (element("Email").isDisplayed()) &&
				(element("CreatePassword").isDisplayed()) ) {
			status=true;
		}else {
			status=false;
		}
		return status;
	}
	
	/**
	 *  used to verify Signup is disable
	 * @return
	 */
	
	public boolean verify_SignUpDisable() {
		boolean status=false;
		
		if(element("SignUpBtn").isEnabled()) {
			status=false;
		}else {
			status=true;
		}
		
		return status;
	}
	
	/**
	 *  used to verify Signup is enable
	 * @return
	 */
	
	public boolean verify_SignUpEnable() {
		boolean status=false;
		
		if(element("SignUpBtn").isEnabled()) {
			status=true;
		}else {
			status=false;
		}
		
		return status;
	}
	
	/** 
	 * Used to enter in Fields
	 * @param element
	 * @param Name
	 * @return
	 */
	
	public boolean verify_EnterInField(String element, String Name) {
		boolean status=false;
		
		element(element).sendKeys(Name);
		String name=element(element).getAttribute("value");
		System.out.println(Name+ ":is the name");
		System.out.println(name+ ":is the value");
		if(name.contains(Name)) {
			status=true;
		}else {
			status=false;
		}
		
		return status;
	}
	
	public boolean enter_InEmailFieldOfSignUp() {
		boolean status=false;
		Faker faker = new Faker();

		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String Email=firstName.toLowerCase() + "." + lastName.toLowerCase() + "@gmail.com";
		System.out.println("Email is:" +Email);
		
		element("Email").sendKeys(Email);
		String name=element("Email").getAttribute("value");
		if(name.contains(Email)) {
			status=true;
		}else {
			status=false;
		}
	//	PropFileHandler.writeToFile("EmailSign", Email);
		return status;
	}
	
	/** 
	 * used to verify enter Invalid data in fields
	 * @param element
	 * @param Name
	 * @return
	 * @throws InterruptedException
	 */
	
	public boolean verify_EnterInvalidField(String element, String Name) throws InterruptedException {
		boolean status=false;
		
		element(element).sendKeys(Name);
		String name=element(element).getAttribute("value");
		
		if(name.equals(Name)) {
			status=false;
		}else {
			status=true;
		}
		
		element(element).clear();
		Thread.sleep(2000);
		return status;
	}
	
	/** 
	 * Used to verify error message for invalid email
	 * @return
	 * @throws InterruptedException
	 */
	
	public boolean verify_errorMsgOnInvalidEmail() throws InterruptedException {
		boolean status=false;
		
		element("Email").sendKeys("Dalton@gmail");
		Thread.sleep(1000);
		element("PasswordFormat").click();
		
		if(element("ErrorMSgOnInvalidEmail").isDisplayed()) {
			status=true;
		}else {
			status=false;
		}
		
		return status;
	}
	
	/**
	 *  used to enter in webelement
	 * @param element
	 * @param Name
	 */
	
	public void enter_inFields(String element, String Name) {
		element(element).sendKeys(Name);
	}
	
	/**
	 *  used to enter and verify invalid Password
	 * @param password
	 * @return
	 * @throws InterruptedException
	 */
	
	public boolean verify_InvalidPassword(String password) throws InterruptedException {
		boolean status=false;
		
		element("CreatePassword").sendKeys(password);
		Thread.sleep(1000);
		Actions action=new Actions(session.driver);
		action.moveToElement(element("SignUpBtn")).click().build().perform();
		
		Thread.sleep(3000);
		
		if(element("ErrorMsg").isDisplayed()) {
			status=true;
		}else {
			status=false;
		}
		element("CreatePassword").clear();
		Thread.sleep(2000);
		
		return status;
	}
	
	/**
	 *  Used to click on SignUp button
	 */
	
	public void click_SignUpBtn() {
		Actions action=new Actions(session.driver);
		action.moveToElement(element("SignUpBtn")).click().build().perform();
	}
	
	/** 
	 * used to logout from application
	 * @throws InterruptedException
	 */
	
	public void click_Logout12() throws InterruptedException {
		Actions action=new Actions(session.driver);
   	    action.moveToElement(element("Dashboard")).click().build().perform();		
		Thread.sleep(2000);
		action.moveToElement(element("Logout")).click().build().perform();		
	}


}
