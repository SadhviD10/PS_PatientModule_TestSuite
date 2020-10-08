package com.studio.home.po;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.studio.automation.framework.TestSession;
import com.studio.qe.automation.framework.pagefactory.MobileWebViewPage;

public class PatientDashboardProfilePO extends MobileWebViewPage {

	public PatientDashboardProfilePO(TestSession session) throws Exception {
		super(session, "Applications/studio/PatientDashboardProfile");
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
	
	public boolean clickAndVerify_HeaderImage() throws InterruptedException {
		boolean status=false;
		 Actions action=new Actions(session.driver);
		 action.moveToElement(element("HeaderImage")).click().build().perform();
		 Thread.sleep(1000);
		 if(element("SettingBtn").isDisplayed()) {
			 status=true;
		 }else {
			 status=false;
		 }		
		return status;
	}
	
	public void click_Element(String element) {
		element(element).click();
	}
	
	public boolean verify_ListOfForms() {
		boolean status=false;
		List<WebElement> formList=elements("FormList_All");
		
		for(int i=0; i<formList.size(); i++) {
			WebElement form=formList.get(i);
			if(form.isDisplayed()) {
				System.out.println("form" +form.getText()+ "is dispalyed");
				status=true;
			}else {
				System.out.println("form" +form.getText()+ "is not dispalyed");
				status=false;
			}
		}
		
		return status;
	}
	
	public boolean switch_SecondBrowserTab(String URL) throws InterruptedException, AWTException {
		boolean status = false;
		String value=Keys.chord(Keys.CONTROL, Keys.RETURN);		
        element("ProfileLink").sendKeys(value);
		Thread.sleep(1000);
		Set<String> child = session.driver.getWindowHandles();
		int count = child.size();
		System.out.println("Total number of tabs opened are" + count);
		if (count > 1) {
			ArrayList<String> tabs = new ArrayList<>(child);
			session.driver.switchTo().window(tabs.get(1));
			Thread.sleep(1000);
			session.driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			session.driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
			session.driver.get(URL);
			status = true;
		} else {
			status = false;
		}
		Thread.sleep(1000);
		return status;
	}
	
	public void enter_StaffCredential() throws InterruptedException {
		element("EmailAddress_Staff").sendKeys("office-admin@patientstudio.com");
		Thread.sleep(1000);
		element("Password_Staff").sendKeys("1 Super Safe Password!");
		Thread.sleep(1000);
		Actions action=new Actions(session.driver);
		action.moveToElement(element("Login_BtnStaff")).click().build().perform();
		Thread.sleep(1000);
	}
	
	public void enter_FirstNameLstNameEmailChooseForm(String Name1, String Name2) throws InterruptedException {
		Actions action = new Actions(session.driver);
		action.moveToElement(element("SendForm_ButtonStaff")).click().build().perform();
		Thread.sleep(4000);
		session.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		element("FirstNameStaff").sendKeys(Name1);
		Thread.sleep(1000);
		element("LastNameStaff").sendKeys(Name2);
		Thread.sleep(1000);
		element("EmailStaff").sendKeys("Patient.studiotest@gmail.com");
		Thread.sleep(1000);
		element("ChooseFormStaff").click();
		Thread.sleep(2000);
		element("TestFormQAStaff").click();
		Thread.sleep(1000);
		action.moveToElement(element("SendFormButtonOnFormStaff")).click().build().perform();
		Thread.sleep(6000);
	}
	
	public boolean close_BrowserTab() throws InterruptedException {
		boolean status = false;

		Set<String> child = session.driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(child);
		session.driver.close();
		session.driver.switchTo().window(tabs.get(0));
		String Url = session.driver.getCurrentUrl();
		if (Url.contains("https://seed-doctor-office.patients.qa.patientstudio.com")) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}
	
	public boolean verify_newFormUnderDashboard() throws InterruptedException {
		boolean status=false;
		List<WebElement> formList=elements("FormList_All");
		int count_before=formList.size();
		//session.driver.get(URL);	
		session.driver.navigate().refresh();
		session.driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(10000);

		List<WebElement> formList1=elements("FormList_All");
		int count_after=formList1.size();
		System.out.println("number of forms before refreshing:" +count_before);
		System.out.println("number of forms after refreshing:" +count_after);
		if(count_after>count_before) {
			status=true;
		}else {
			status=false;
		}
		
		return status;
	}
	
	public boolean verify_newFormUnderNewProfileDashboard() throws InterruptedException {
		boolean status=false;
		List<WebElement> formList=elements("FormList_All");
		List<WebElement> profileList=elements("Dashboard_ProfileFormsList");
		int countForm_before=formList.size();
		int countProfile_before=profileList.size();
		
		//session.driver.get(URL);	
		session.driver.navigate().refresh();
		session.driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(20000);

		List<WebElement> formList1=elements("FormList_All");
		List<WebElement> profileList1=elements("Dashboard_ProfileFormsList");
		int countForm_after=formList1.size();
		int countProfile_after=profileList1.size();
		System.out.println("number of forms before refreshing:" +countForm_before);
		System.out.println("number of forms after refreshing:" +countForm_after);
		if((countForm_after>countForm_before) && (countProfile_after>countProfile_before)) {
			status=true;
		}else {
			status=false;
		}		
		return status;
	}
	
	public boolean verify_TestFormQA() throws InterruptedException {
		boolean status=false;
		
		List<WebElement> forms=elements("FormList_All");
		System.out.println("forms size is:" +forms.size());
		
		for(int i=0;i<forms.size(); i++) {
			WebElement element=forms.get(i);
			String text=element.getText();
			System.out.println("form name is:" +text);
			if(text.equals("Test Form - QA")) {
				element.click();
				Thread.sleep(2000);
				status=true;
				break;
			}else {
				status=false;
			}
		}
		return status;
	}
	public void enter_FormField(String element,String name) throws InterruptedException {
		element(element).clear();
		Thread.sleep(1000);
		element(element).sendKeys(name);
	}

	public boolean verify_TextFieldContent(String element, String name){
		boolean status=false;
		
		String name1=element(element).getAttribute("value");
		if(name1.equals(name)) {
			status=true;
		}else {
			status=false;
		}
		
		return status;
	}
	
	public boolean verify_contentInTextField(String element, String name) {
		boolean status=false;
		
		String name1=element(element).getAttribute("value");
		
		if(name1.equals(name)) {
			status=true;
		}else {
			status=false;
		}
		
		return status;
	}

	public boolean verify_EditFieldInSetting(String element, String name1) throws InterruptedException {
		boolean status=false;
		
		String name=element(element).getAttribute("value");
		element(element).clear();
		Thread.sleep(1000);
		element(element).sendKeys(name1);
		Thread.sleep(1000);
		element("SettingLastNameText").click();
		Thread.sleep(8000);
		String name2=element(element).getAttribute("value");
		
		if(name2.equals(name)) {
			status=true;
		}else {
			status=false;
			element(element).clear();
			Thread.sleep(1000);
			element(element).sendKeys(name);
			element("SettingLastNameText").click();
			Thread.sleep(8000);
		}
		
		return status;
	}
	
	public boolean verify_EditFieldInSetting1(String element, String name1) throws InterruptedException {
		boolean status=false;
		
		String name=element(element).getAttribute("value");
		element(element).clear();
		Thread.sleep(1000);
		element(element).sendKeys(name1);
		element("SettingLastNameText").click();
		Thread.sleep(6000);
		String name2=element(element).getAttribute("value");
		
		if(name2.equals(name)) {
			status=false;
			element(element).clear();
			element(element).sendKeys(name);
			element("SettingLastNameText").click();
			Thread.sleep(6000);
		}else {
			status=true;
			element(element).clear();
			element(element).sendKeys(name);
			element("SettingLastNameText").click();
			Thread.sleep(6000);			
		}
		
		return status;
	}
	
	public boolean verify_PhoneValidationError() throws InterruptedException {
		boolean status=false;
		String name=element("PhoneField_Setting").getAttribute("value");
		element("PhoneField_Setting").clear();
		Thread.sleep(1000);
		element("PhoneField_Setting").sendKeys("546");
		
		if(element("ValidationMsg_Phone").isDisplayed()) {
			status=true;
			element("PhoneField_Setting").clear();
			element("PhoneField_Setting").sendKeys(name);
			element("SettingLastNameText").click();
			Thread.sleep(6000);
		}else {
			status=false;
			element("PhoneField_Setting").clear();
			element("PhoneField_Setting").sendKeys(name);
			element("SettingLastNameText").click();
			Thread.sleep(6000);			
		}
		
		return status;
	}
}
