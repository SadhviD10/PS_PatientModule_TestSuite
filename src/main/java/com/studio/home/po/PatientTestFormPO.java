package com.studio.home.po;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.studio.automation.framework.TestSession;
import com.studio.helper.GMailFetch;
import com.studio.qe.automation.framework.pagefactory.MobileWebViewPage;

public class PatientTestFormPO extends MobileWebViewPage {

	public PatientTestFormPO(TestSession session) throws Exception {
		super(session, "Applications/studio/PatientTestForm");
	}

	/**
	 * Used to verify Fields on page
	 * 
	 * @param element
	 * @return
	 */

	public boolean verify_FieldOnPage(String element) {
		WebDriverWait wait = new WebDriverWait(session.driver, 30);

		WebElement status = wait.until(ExpectedConditions.visibilityOf(element(element)));
		return status.isDisplayed();
	}

	/**
	 * used to enter in Email
	 * 
	 * @param email
	 */

	public void enter_Email(String email) {
		element("EmailIDField").sendKeys(email);
	}

	/**
	 * Used to enter in Password
	 * 
	 * @param password
	 */

	public void enter_Password(String password) {
		element("PasswordField").sendKeys(password);
	}

	/**
	 * used to click on Login button
	 * 
	 * @return
	 */

	public boolean click_LoginBtn1() {
		boolean status = false;
		Actions action = new Actions(session.driver);
		if (element("Login").isEnabled()) {
			action.moveToElement(element("Login")).click().build().perform();
			status = true;
		} else {
			status = false;
		}
		return status;
	}

	public boolean verify_TestFormQA() throws InterruptedException {
		boolean status = false;

		List<WebElement> forms = elements("FormList");
		System.out.println("forms size is:" + forms.size());

		for (int i = 0; i < forms.size(); i++) {
			WebElement element = forms.get(i);
			String text = element.getText();
			System.out.println("form name is:" + text);
			if (text.equals("Test Form - QA")) {
				System.out.println("Test form QA is present in the form list");
				element.click();
				Thread.sleep(2000);
				status = true;
				break;
			} else {
				status = false;
			}
		}
		return status;
	}

	public boolean verify_RightArrowdisabled() throws InterruptedException {
		boolean status = false;

		if (element("FirstPage_RightArrow").isEnabled()) {
			System.out.println("right arrow enabled");
			Actions action = new Actions(session.driver);
			action.moveToElement(element("FirstPage_RightArrow")).click().build().perform();
			Thread.sleep(2000);
			// if(element("MandatoryField_Msg").isDisplayed()) {
			// System.out.println("right arrow enabled but mandatory msg displayed");
			// status=true;
			if (element("SecondPage_sectionText").isDisplayed()) {
				status = true;
				System.out.println("2nd Page opens and mandatory fields filled");
				Actions action1 = new Actions(session.driver);
				action1.moveToElement(element("LeftArrow_SecondPage")).click().build().perform();
				Thread.sleep(1000);
			} else {
				System.out.println("right arrow enabled and mandatory msg not displayed");
				status = false;
			}
		} else {
			System.out.println("right arrow disabled");
			status = true;
		}
		return status;
	}

	/**
	 * Used to enter in Fields
	 * 
	 * @param element
	 * @param Name
	 * @return
	 * @throws InterruptedException
	 */

	public boolean verify_EnterInField(String element, String Name) throws InterruptedException {
		boolean status = false;
		element(element).clear();
		Thread.sleep(1000);
		element(element).sendKeys(Name);
		String name = element(element).getAttribute("value");
		element("PatientInfo_SectionText").click();
		Thread.sleep(3000);
		System.out.println(Name + ":is the name");
		System.out.println(name + ":is the value");
		if (name.equals(Name)) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}
	
	public boolean verify_EnterInField1(String element, String Name) throws InterruptedException {
		boolean status = false;
		element(element).clear();
		Thread.sleep(1000);
		element(element).sendKeys(Name);
		String name = element(element).getAttribute("value");
		element("EmailNewTextLabel").click();
		Thread.sleep(3000);
		System.out.println(Name + ":is the name");
		System.out.println(name + ":is the value");
		if (name.equals(Name)) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}
	
	public boolean verify_EnterInField2(String element, String Name) throws InterruptedException {
		boolean status = false;
		element(element).clear();
		Thread.sleep(1000);
		element(element).sendKeys(Name);
		String name = element(element).getAttribute("value");
		element("SelectATest_SectionText").click();
		Thread.sleep(3000);
		System.out.println(Name + ":is the name");
		System.out.println(name + ":is the value");
		if (name.equals(Name)) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}
	
	public boolean verify_EnterInField3(String element, String Name) throws InterruptedException {
		boolean status = false;
		element(element).clear();
		Thread.sleep(1000);
		element(element).sendKeys(Name);
		String name = element(element).getAttribute("value");
		element("SecondPage_sectionText").click();
		Thread.sleep(3000);
		System.out.println(Name + ":is the name");
		System.out.println(name + ":is the value");
		if (name.equals(Name)) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}
	
	public boolean verify_EnterInField4(String element, String Name) throws InterruptedException {
		boolean status = false;
		Actions action=new Actions(session.driver);
		action.click(element(element)).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		element(element).sendKeys(Name);
		String name = element(element).getAttribute("value");
		element("InsuranceNameText").click();
		Thread.sleep(3000);
		System.out.println(Name + ":is the name");
		System.out.println(name + ":is the value");
		if (name.equals(Name)) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}

	/***
	 * Used to verify I am able to type DOB
	 * 
	 * @return
	 * @throws InterruptedException
	 */

	public boolean verify_EnterDOB(String DOB) throws ParseException, InterruptedException {
		boolean status = false;
		element("DOBField").clear();
		Thread.sleep(1000);
		// SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yyyy");
		// SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd");
		// String DOB2 = sdf2.format(sdf1.parse(DOB));

		element("DOBField").sendKeys(DOB);
		element("PatientInfo_SectionText").click();
		Thread.sleep(3000);
		String DOB1 = element("DOBField").getAttribute("value");
		System.out.println("DOB is:" + DOB);
		System.out.println("DOB1 is:" + DOB1);

		if (DOB.equals(DOB1)) {
			status = true;
		} else {
			status = false;
		}

		return status;
	}

	/**
	 * Used to select Gender Checkbox
	 * 
	 * @param element
	 * @return
	 * @throws InterruptedException
	 */

	public boolean select_GenderRadioBtn(String element) throws InterruptedException {
		boolean status = false;
		Thread.sleep(2000);
		if (element(element).isDisplayed()) {
			Actions action = new Actions(session.driver);
			action.moveToElement(element(element)).click().build().perform();
			status = true;
		} else {
			status = false;
		}
		Thread.sleep(2000);
		return status;
	}

	/**
	 * used to verify other field is displayed if other gender is selected or not
	 * 
	 * @return
	 * @throws InterruptedException
	 */

	public boolean selectOtherField_Displayed() throws InterruptedException {
		boolean status = false;
		Thread.sleep(2000);

		Actions action = new Actions(session.driver);
		action.moveToElement(element("Gender_Other")).click().build().perform();
		Thread.sleep(3000);
		if (element("OtherFieldText").isDisplayed()) {
			status = true;
		} else {
			status = false;
		}
		Thread.sleep(2000);
		return status;
	}

	/**
	 * used to verify other field is displayed if other gender is selected or not
	 * 
	 * @return
	 * @throws InterruptedException
	 */

	public boolean selectOtherField_Disabled(String element) throws InterruptedException {
		boolean status = false;
		Thread.sleep(2000);

		Actions action = new Actions(session.driver);
		action.moveToElement(element(element)).click().build().perform();
		Thread.sleep(3000);
		if (element("OtherFieldText").isEnabled()) {
			status = false;
		} else {
			status = true;
		}
		Thread.sleep(2000);
		return status;
	}

	public boolean enter_ValidSocialSecurity() throws InterruptedException {
		boolean status = false;
		element("SocialSecurity").clear();
		Thread.sleep(1000);
		String ss1 = "345-56-8765";
		element("SocialSecurity").sendKeys(ss1);
		String ss = element("SocialSecurity").getAttribute("value");
		element("SocialTextLabel").click();
		Thread.sleep(3000);		
		System.out.println("ss1:" + ss1);
		System.out.println("ss:" + ss);
		if (ss.equals(ss1)) {
			status = true;
		} else {
			status = false;
		}

		return status;
	}

	public boolean enter_InValidSocialSecurity() throws InterruptedException {
		boolean status = false;

		element("SocialSecurity").clear();
		Thread.sleep(1000);
		String ss1 = "345-fa-8nsp";
		element("SocialSecurity").sendKeys(ss1);
		String ss = element("SocialSecurity").getAttribute("value");
		System.out.println("ss1:" + ss1);
		System.out.println("ss:" + ss);
		if (ss.equals(ss1)) {
			element("SSNClick").click();
			Thread.sleep(1000);
			if (element("ErrorForInvalidSSN").isDisplayed()) {
				status = true;
			} else {
				status = false;
			}
		} else {
			status = false;
		}

		return status;
	}

	public boolean enter_ValidPhoneNumber() throws InterruptedException {
		boolean status = false;
		element("BestPhoneField").clear();
		Thread.sleep(1000);
		String ss1 = "345 568 8765";
		element("BestPhoneField").sendKeys(ss1);
		element("SocialTextLabel").click();
		Thread.sleep(3000);
		String ss = element("BestPhoneField").getAttribute("value");
		System.out.println("ss1:" + ss1);
		System.out.println("ss:" + ss);
		if (ss.equals(ss1)) {
			status = true;
		} else {
			status = false;
		}

		return status;
	}

	public boolean enter_InvalidPhone() throws InterruptedException {
		boolean status = false;
		element("BestPhoneField").clear();
		Thread.sleep(1000);
		String ss1 = "345 568";
		element("BestPhoneField").sendKeys(ss1);
		String ss = element("BestPhoneField").getAttribute("value");
		System.out.println("ss1:" + ss1);
		System.out.println("ss:" + ss);
		if (ss.equals(ss1)) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}

	public boolean select_StateFromDropdown() throws InterruptedException {
		boolean status = false;
		//(element("SelectStateDropdown_selected").isDisplayed()) ||
		if ( element("SelectState").isDisplayed()) {
			// System.out.println("state is selected from the list");
			element("SelectState").click();
			List<WebElement> statelist1 = elements("DropdownOptions_State");
			// System.out.println("Number of states in list2:" +statelist1.size());
			for (int i = 1; i < 2; i++) {
				WebElement state1 = statelist1.get(i);
				state1.click();
				Thread.sleep(5000);
				status = true;
			}
		} else {
			System.out.println("state dropdown not clickable");
			status = false;
		}
		return status;
	}

	public boolean select_ATestOption(String element) throws InterruptedException {
		boolean status = false;

		Actions action = new Actions(session.driver);
		// action.moveToElement(element(element)).click().build().perform();

		if (element(element).isDisplayed()) {
			action.moveToElement(element(element)).click().build().perform();
			status = true;
		} else {
			status = false;
		}
		Thread.sleep(2000);
		return status;
	}

	public void click_Button12(String element) throws InterruptedException {
		// ((JavascriptExecutor)
		// session.driver).executeScript("arguments[0].scrollIntoView();",element(element));
		Thread.sleep(1000);
		Actions action = new Actions(session.driver);
		action.moveToElement(element(element)).click().build().perform();
		Thread.sleep(6000);
	}

	public void clear_FieldValue(String element) throws InterruptedException, AWTException {
//		Robot robot = new Robot();
//		element(element).click();
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_A);
//		Thread.sleep(1000);
//
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(1000);
//		robot.keyRelease(KeyEvent.VK_A);
//		Thread.sleep(1000);
//
//		robot.keyPress(KeyEvent.VK_DELETE);
//		Thread.sleep(1000);
//		robot.keyRelease(KeyEvent.VK_DELETE);
//		Thread.sleep(1000);
		Actions action=new Actions(session.driver);
		action.click(element(element)).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
	}

	public boolean errorMsg_ForMnadtoryFields(String element) throws InterruptedException {
		boolean status = false;
		Thread.sleep(2000);
		List<WebElement> errorList=elements(element);
		for(int i=0;i<errorList.size();i++) {
		   WebElement error=errorList.get(i);
		 if (error.isDisplayed()) {
			status = true;
			break;
		} else {
			status = false;
		}
	}

		return status;
	}

	public boolean verify_TestFormClearOrNot() {
		boolean status = false;

		if (element("FirstNameField").equals("Dalton")) {
			status = false;
		} else {
			status = true;
		}

		return status;
	}

	public boolean verify_SecondPageNotOpened() throws InterruptedException {
		boolean status = false;
		if (element("SecondPage_sectionText").isDisplayed()) {
			status = false;
		} else {
			status = true;
			Thread.sleep(1000);
			Actions action1 = new Actions(session.driver);
			action1.moveToElement(element("LeftArrow_SecondPage")).click().build().perform();
			Thread.sleep(1000);
		}
		return status;
	}

	public boolean verify_SecondPageSucess() throws InterruptedException {
		boolean status = false;
		Thread.sleep(1000);
		if (element("SecondPage_sectionText").isDisplayed()) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}

	public boolean verify_RelationToPatientDropdown() throws InterruptedException {
		boolean status = false;

		List<WebElement> relation = elements("SecondPage_RelationToPatient");
		relation.get(2).click();
		System.out.println("clicked for one");
		Thread.sleep(2000);

		List<WebElement> relationlist = elements("DropDownOpt_RelationPat");
		if (element("DropDownOpt_RelationPat").isDisplayed()) {
			for (int i = 1; i < 2; i++) {
				relationlist.get(i).click();
				System.out.println("clicked for two");
				Thread.sleep(1000);
				status = true;
			}
		} else {
			System.out.println("clicked for four");
			status = false;
		}
		Thread.sleep(6000);
		return status;
	}
	
	public void click_Arrow(int num) {
		List<WebElement> element=elements("RightArrow_FirstPage");
		WebElement arrow=element.get(num);
		
		Actions action = new Actions(session.driver);
		action.moveToElement(arrow).click().build().perform();
	}
	
	public boolean verify_TextNameFieldAcceptSpaces(String element) throws InterruptedException {
		boolean status=false;
		String space="          ";
		
		element(element).clear();
		Thread.sleep(1000);
		element(element).sendKeys(space);
		element("PrimaryInsuranceText").click();
		Thread.sleep(1000);
		String spaceValue=element(element).getAttribute("value");
		
		if(spaceValue.equals(space)) {
			status=false;
		}else {
			status=true;
		}		
		return status;
	}
	
	public boolean upload_Image(String element, String file) throws InterruptedException, AWTException {
		boolean status=false;
		
		
//		Actions action = new Actions(session.driver);
//		action.moveToElement(element(element)).sendKeys(file).build().perform();
		
		element(element).sendKeys(file);
		Thread.sleep(8000);
//		 Robot robo = new Robot();
//
//		  StringSelection ss = new StringSelection(file);
//		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//		  Thread.sleep(2000);
//
//		  robo.keyPress(KeyEvent.VK_CONTROL);
//		  robo.keyPress(KeyEvent.VK_V);
//		  Thread.sleep(1000);
//		  robo.keyRelease(KeyEvent.VK_V);
//		  robo.keyRelease(KeyEvent.VK_CONTROL);
//		  Thread.sleep(1000);
//		  robo.keyPress(KeyEvent.VK_ENTER);
//		  robo.keyRelease(KeyEvent.VK_ENTER);
//		  Thread.sleep(8000);

		if(element("Savetext").isDisplayed()) {
			status=true;
		}else {
			status=false;
		}
		return status;
	}
	
	public boolean verify_stateDropdown() {
		boolean status=false;
		
		if((element("SelectState").isDisplayed()) | (element("SelectStateDropdown_selected").isDisplayed())) {
			status=true;
		}else {
			status=false;
		}
		
		return status;
	}
	
	public boolean verify_MailFormSuccessfulFormSubmit() {
		boolean status = false;

		HashMap<String, String> hm = GMailFetch
				.getGmailData("subject:Seed Doctor Office. LLC has received your paperwork");
		boolean exist = GMailFetch.isMailExist("Seed Doctor Office. LLC has received your paperwork");

		if (exist) {
			String body = hm.get("body");
			System.out.println(body);
			status = true;
		} else {
			status = false;
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
