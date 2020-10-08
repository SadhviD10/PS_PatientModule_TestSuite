package com.studio.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PatientLoginStepDef extends StepDefinitionInit {

	@And("^I verify that i navigated to Login page of patient$")
	public void i_verify_that_i_navigated_to_login_page_of_patient() throws Throwable {
		Assert.assertTrue(patientLoginPO.verify_FieldOnPage121("ForgotPasswordPatient"));
	}

	@Then("^I verify that 2 different tabs are present Login and SignUp tab$")
	public void i_verify_that_2_different_tabs_are_present_login_and_signup_tab() throws Throwable {
		Assert.assertTrue(patientLoginPO.verify_DifferentTabs());
	}

	@Then("^I verify that Email fields is present$")
    public void i_verify_that_email_fields_is_present() throws Throwable {
		Assert.assertTrue(patientLoginPO.verify_FieldOnPage121("EmailIDField")); 
    }

    @And("^I verify that Password field is present$")
    public void i_verify_that_password_field_is_present() throws Throwable {
    	Assert.assertTrue(patientLoginPO.verify_FieldOnPage121("PasswordField")); 
    }
    
    @Then("^I verify that i am able to enter in Email1 field$")
    public void i_verify_that_i_am_able_to_enter_in_email1_field() throws Throwable {
    	Assert.assertTrue(patientLoginPO.verify_enterInEmailField("EmailIDField"));
    }
    
    @Then("^I verify that i am able to enter in Password1 field$")
    public void i_verify_that_i_am_able_to_enter_in_password1_field() throws Throwable {
    	Assert.assertTrue(patientLoginPO.verify_enterInEmailField("PasswordField"));
    }
    
    @Then("^I verify that LoginBtn is disabled initially$")
    public void i_verify_that_loginbtn_is_disabled_initially() throws Throwable {
        Assert.assertFalse(patientLoginPO.verify_LoginBtnDisable());
    }
    
    @Then("^I verify that Forgot Password link is present$")
    public void i_verify_that_forgot_password_link_is_present() throws Throwable {
       Assert.assertTrue(patientLoginPO.verify_FieldOnPage121("ForgotPasswordPatient")); 
    }

    @When("^I enter \"([^\"]*)\" in Email1$")
    public void i_enter_something_in_email1(String email) throws Throwable {
    	patientLoginPO.enter_Email(email);
    }

    @When("^I enter \"([^\"]*)\" in Password1$")
    public void i_enter_something_in_password1(String password) throws Throwable {
    	patientLoginPO.enter_Password(password); 
    }

    @Then("^I verify that I get error message$")
    public void i_verify_that_i_get_error_message() throws Throwable {
    	Assert.assertTrue(patientLoginPO.verify_errorMsgForInvalidEmail());
    }
    
    @And("^I verify that Login button is Enable1$")
    public void i_verify_that_login_button_is_enable1() throws Throwable {
    	Assert.assertTrue(patientLoginPO.verify_LoginBtnEnable1());
    }
    
    @Then("^I verify that I get error message for Invalid credentials$")
    public void i_verify_that_i_get_error_message_for_invalid_credentials() throws Throwable {
    	Assert.assertTrue(patientLoginPO.verify_errorForInvalidLogin());
    }

    @And("^I click on Login buttonq$")
    public void i_click_on_login_buttonq() throws Throwable {
    	//Thread.sleep(1000);
    	Assert.assertTrue(patientLoginPO.click_LoginBtn1());
    }
    
    @When("^I Click on SigNUp tab$")
    public void i_click_on_signup_tab() throws Throwable {
    	Thread.sleep(1000);
    	patientLoginPO.click_OnTab("SignUp");
    }

    @When("^I Click on Login tab again$")
    public void i_click_on_login_tab_again() throws Throwable {
    	Thread.sleep(1000);
    	patientLoginPO.click_OnTab("LoginTab");
    }

    @Then("^I verify that error message is not present$")
    public void i_verify_that_error_message_is_not_present() throws Throwable {
    	Assert.assertFalse(patientLoginPO.verify_ErrorNotPresent());
    }
    
    @Then("^I verify that I am able to login to Application$")
    public void i_verify_that_i_am_able_to_login_to_application() throws Throwable {
    	session.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Assert.assertTrue(patientLoginPO.verify_FieldOnPage121("LoginText"));
    }

    @When("^I click on logout button$")
    public void i_click_on_logout_button() throws Throwable {
    	session.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        patientLoginPO.click_Logout12();
    }

    @Then("^I verify that I am able to logout from the application$")
    public void i_verify_that_i_am_able_to_logout_from_the_application() throws Throwable {
    	Assert.assertTrue(patientLoginPO.verify_FieldOnPage121("ForgotPasswordPatient"));
    }
    

    @And("^I verify that I am on Dashboard of Patient portal$")
    public void i_verify_that_i_am_on_dashboard_of_patient_portal() throws Throwable {
    	Assert.assertTrue(patientLoginPO.verify_FieldOnPage121("LoginText"));
    }

}
