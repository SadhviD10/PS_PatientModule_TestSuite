package com.studio.home.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.studio.automation.framework.TestSession;
import com.studio.qe.automation.framework.pagefactory.MobileWebViewPage;

public class PatientLoginPO extends MobileWebViewPage {

	public PatientLoginPO(TestSession session) throws Exception {
		super(session, "Applications/studio/PatientLogin");
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
	 * Used to verify different tabs
	 * @return
	 */

	public boolean verify_DifferentTabs() {
		boolean status = false;

		if ((element("Login").isDisplayed()) && (element("SignUp").isDisplayed())) {
			status = true;
		} else {
			status = false;
		}

		return status;
	}
	
	/**
	 *  Used to verify enter in fields under Login page
	 * @param element
	 * @return
	 * @throws InterruptedException
	 */

	public boolean verify_enterInEmailField(String element) throws InterruptedException {
		boolean status = false;

		String FieldTextBefore = element(element).getAttribute("value");
		element(element).sendKeys("abcd@abcd");
		Thread.sleep(1000);
		String FieldTextAfter = element(element).getAttribute("value");

		if (FieldTextBefore.equals(FieldTextAfter)) {
			status = false;
		} else {
			status = true;
		}

		return status;
	}
	
	/**
	 *  Used to verify Login button is disable
	 * @return
	 */

	public boolean verify_LoginBtnDisable() {
		boolean status = false;

		if (element("Login").isEnabled()) {
			status = false;
		} else {
			status = true;
		}

		return status;
	}
	
	/** 
	 * used to enter in Email
	 * @param email
	 */

	public void enter_Email(String email) {
		element("EmailIDField").sendKeys(email);
	}

	/**
	 *  Used to enter in Password
	 * @param password
	 */
	
	public void enter_Password(String password) {
		element("PasswordField").sendKeys(password);
	}
	
	/** 
	 * used to verify error messege for invalid email
	 * @return
	 */

	public boolean verify_errorMsgForInvalidEmail() {
		boolean status = false;

		if (element("Error_Msg").isDisplayed()) {
			status = true;
		} else {
			status = false;
		}

		return status;
	}
	
	/**
	 *  used to verify login button enable
	 * @return
	 */

	public boolean verify_LoginBtnEnable1() {
		boolean status = false;

		if (element("Login").isEnabled()) {
			status = true;
		} else {
			status = false;
		}

		return status;
	}
	
	/** 
	 * used to click on Login button
	 * @return
	 */

	public boolean click_LoginBtn1() {
		boolean status = false;
      Actions action=new Actions(session.driver);
		if (element("Login").isEnabled()) {
			action.moveToElement(element("Login")).click().build().perform();
			status = true;
		} else {
			status = false;
		}

		return status;
	}
	
	/** 
	 * used to verify error messege for invalid login
	 * @return
	 */

	public boolean verify_errorForInvalidLogin() {
		boolean status = false;

		if (element("ErrorMsgInvalid").isDisplayed()) {
			status = true;
		} else {
			status = false;
		}

		return status;
	}
	
	/** 
	 * Used to click on tab
	 * @param element
	 */

	public void click_OnTab(String element) {
		element(element).click();
	}
	
	/**
	 *  Used to verify invalid error not present
	 * @return
	 */

	public boolean verify_ErrorNotPresent() {
		boolean status = true;

		if (element("ErrorMsgInvalid").isDisplayed()) {
			status = false;
		} else {
			status = true;
		}

		return status;
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
