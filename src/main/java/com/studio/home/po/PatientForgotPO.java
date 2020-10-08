package com.studio.home.po;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.studio.automation.framework.TestSession;
import com.studio.helper.GMailDoctorReset;
import com.studio.helper.GMailFetch;
import com.studio.qe.automation.framework.pagefactory.MobileWebViewPage;

public class PatientForgotPO extends MobileWebViewPage {

	public PatientForgotPO(TestSession session) throws Exception {
		super(session, "Applications/studio/PatientForgot");
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
	 * Used to click on Forgot Password Button
	 */
	
	public void click_ForgotPassword() {
		element("Forgot_Password").click();
	}
	
	/**
	 *  Used to click on Back to login button
	 */
	
	public void click_BackToLogin() {
		Actions action=new Actions(session.driver);
		action.moveToElement(element("BackToLogin")).click().build().perform();
	}
	
	/**
	 *  Used to verify Send Button disable
	 * @return
	 */

	public boolean verify_SendButtonDisable() {
		boolean status=false;
		
		if(element("SendPasswordBtn").isEnabled()) {
			status=false;
		}else {
			status=true;
		}		
		return status;
	}
	
	/** 
	 * used to enter in email field
	 * @param email
	 */
	
	public void enter_Email(String email) {
		element("EmailField").sendKeys(email);
	}
	
	/** 
	 * used to verify Send button enable
	 * @return
	 */
	
	public boolean verify_SendButtonEnable() {
        boolean status=false;
		
		if(element("SendPasswordBtn").isEnabled()) {
			status=true;
		}else {
			status=false;
		}
		
		return status;
	}
	
	/** 
	 * Used to verify Send password button is clickable for first time or not
	 * @return
	 * @throws InterruptedException
	 */
	
	public boolean verify_SendPasswordClickable() throws InterruptedException {
        boolean status=false;
		Thread.sleep(2000);
		Actions action =new Actions(session.driver);
		action.moveToElement(element("SendPasswordBtn")).click().build().perform();
		if(element("BackToLogin").isDisplayed()) {
			status=false;
		}else {
			status=true;
		}
		
		return status;
	}
	
	/** 
	 * Used to click on Send password button
	 * @throws InterruptedException
	 */
	
	public void click_SendPassword() throws InterruptedException {
 		Thread.sleep(2000);			 		
 		Actions action =new Actions(session.driver);
 		action.moveToElement(element("SendPasswordBtn")).click().build().perform();
        action.moveToElement(element("SendPasswordBtn")).click().build().perform();
		 Thread.sleep(2000);		 
	}
	
	/** 
	 * Used to verify Error message for non-registered Email
	 * @return
	 */
	
	public boolean verify_ErrorForNonRegisteredMsg(){
		boolean status=false;
		
		if(element("ErrorMsgForNonRegEmail").isDisplayed()) {
			status=true;
		}else {
			status=false;
		}
		
		return status;
	}
	
	/** 
	 * Used to verify Mail for reset code is generated
	 * @return
	 */
	
	public boolean verify_EmailForResetCode() {
		HashMap<String, String> hm = GMailFetch.getGmailData("Your patient portal password reset code");
		boolean exist = GMailFetch.isMailExist("Your patient portal password reset code");
		return exist;
	}
	
	/** 
	 * Used to verify Mailbody for reset code
	 * @return
	 */
	
	public boolean verify_MailBody() {
		boolean status=false;
		HashMap<String, String> hm = GMailFetch.getGmailData("Your patient portal password reset code");
		String body=hm.get("body");
		
		if(body.contains("Your password reset code is")) {
			status=true;
		}else {
			status=false;
		}
		return status;
	}
	
	/** 
	 * Used to verify Fields on Reset screen
	 * @return
	 */
	
	public boolean verifyFieldOnResetScreen() {
		boolean status=false;
		
		if(element("EmailField").isDisplayed() && element("ResetCode").isDisplayed() && element("NewPassword").isDisplayed()) {
			status=true;
		}else {
			status=false;
		}
		
		return status;
	}
	
	/** 
	 * Used to verify Whether Email is editable or not
	 * @return
	 */
	
	public boolean verify_EmailFieldEditable() {
		boolean status=false;
		
		String Email1=element("EmailField").getAttribute("value");
		element("EmailField").clear();
		String Email2=element("EmailField").getAttribute("value");
		
		if(Email1.equals(Email2)) {
			status=true;
		}else {
			status=false;
		}		
		return status;
	}

	 /**
     *  Used to verify whether getting mail more than once in a day
     * @return
     */
    
    public boolean verify_ResetMailMoreThanOnce() throws InterruptedException{
    	boolean status=false;
    	session.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	element("Forgot_Password").click();
    	element("EmailField").sendKeys("Patient.studiotest@gmail.com");
    	Thread.sleep(2000);			 		
 		Actions action =new Actions(session.driver);
 		action.moveToElement(element("SendPasswordBtn")).click().build().perform();
        action.moveToElement(element("SendPasswordBtn")).click().build().perform();
		Thread.sleep(50000);
		HashMap<String, String> hm1 = GMailFetch.getGmailData("Your patient portal password reset code");
    	String code1=hm1.get("body").replaceAll("\\D", "");
    	System.out.println("reset code before:" +code1);
    	
    	Thread.sleep(2000);
    	session.driver.navigate().refresh();
    	session.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	
    	element("EmailField").sendKeys("Patient.studiotest@gmail.com");
    	Thread.sleep(2000);			 		
 		Actions action1 =new Actions(session.driver);
 		action1.moveToElement(element("SendPasswordBtn")).click().build().perform();
        action1.moveToElement(element("SendPasswordBtn")).click().build().perform();
		Thread.sleep(50000);
		HashMap<String, String> hm2 = GMailFetch.getGmailData("Your patient portal password reset code");
    	String code2=hm2.get("body").replaceAll("\\D", "");
    	System.out.println("reset code after:" +code2);
    	
    	if(code1.equals(code2)) {
    		status=false;
    	}else {
    		status=true;
    	}   	
    	return status;    	
    }
    
    /** 
	 * Used to Enter reset code
	 * @return
	 */
	
	public void enter_ResetCode(String email) {
		element("ResetCode").sendKeys(email);
	}
	
	/** 
	 * Used to enter New Password
	 * @return
	 */
	
    public void enter_NewPassword(String password) {
    	element("NewPassword").sendKeys(password);
	}
    
    /** 
	 * Used to verify Whether reset password button is disable or not
	 * @return
	 */
    
    public boolean verify_ResetButtonDisable() {
    	boolean status=false;
    	
    	if(element("ResetButton").isEnabled()) {
    		status=false;
    	}else {
    		status=true;
    	}    	
    	return status;
    }
    
    /** 
	 * Used to verify Whether reset password button is Enable or not
	 * @return
	 */
    
    public boolean verify_ResetButtonEnable() {
    	boolean status=false;
    	
    	if(element("ResetButton").isEnabled()) {
    		status=true;
    	}else {
    		status=false;
    	}    	
    	return status;
    }
    
    /**
     *  Used to click on Reset button
     * @return
     */
    
    public boolean click_ResetButton() {
    	boolean status=false;
    	Actions action =new Actions(session.driver);
 			
    	if(element("ResetButton").isEnabled()) {
    		action.moveToElement(element("ResetButton")).click().build().perform();
    		status=true;
    	}else {
    		status=false;
    	}    	
    	return status;
    }
    
    /**
     *  Used to verify error message on reset screen
     * @return
     */
    
    public boolean verify_ErrorMsgOnResetScreen() {
    	boolean status=false;
    	
    	if(element("ErrorMsgForNonRegEmail").isDisplayed()) {
    		status=true;
    	}else {
    		status=false;
    	}    	
    	return status;
    }
    
    /**
     *  Used to verify reset code field accept alphabets or not
     * @return
     */
	
    public boolean verify_ResetFieldAcceptAlphabets() {
    	boolean status=false;
    	
    	element("ResetCode").sendKeys("abcd1234");
    	
    	if(element("ResetCode").getAttribute("value").equals("abcd1234")) {
    		status=false;
    	}else {
    		status=true;
    	}
    	
    	return status;
    }
    
    /**
     *  Used to Enter Reset code from mail
     * @return
     */
    
    public void enter_ResetFromMail() {
    	HashMap<String, String> hm = GMailFetch.getGmailData("Your patient portal password reset code");
    	String code=hm.get("body").replaceAll("\\D", "");
    	element("ResetCode").sendKeys(code);
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
