package com.studio.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PatientForgotStepDef extends StepDefinitionInit {

	@When("^I click on Forgot password button$")
    public void i_click_on_forgot_password_button() throws Throwable {
		patientForgotPO.click_ForgotPassword();
    }

    @Then("^I verify that i navigate to Forgot password page$")
    public void i_verify_that_i_navigate_to_forgot_password_page() throws Throwable {
    	Assert.assertTrue(patientForgotPO.verify_FieldOnPage121("BackToLogin"));
    }

    @And("^I verify that i navigate to Login page of patient$")
    public void i_verify_that_i_navigate_to_login_page_of_patient() throws Throwable {
    	session.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	Assert.assertTrue(patientForgotPO.verify_FieldOnPage121("Forgot_Password"));
    }
    
    @When("^I click on Back to login$")
    public void i_click_on_back_to_login() throws Throwable {
    	patientForgotPO.click_BackToLogin();
    }
    
    @And("^I verify that Email Field1 is present$")
    public void i_verify_that_email_field1_is_present() throws Throwable {
    	Assert.assertTrue(patientForgotPO.verify_FieldOnPage121("EmailField"));
    }
    
    @And("^I verify that SendPassword button1 is disable$")
    public void i_verify_that_sendpassword_button1_is_disable() throws Throwable {
        Assert.assertFalse(patientForgotPO.verify_SendButtonDisable());
    }
    
    @When("^I enter \"([^\"]*)\" in Email$")
    public void i_enter_something_in_email(String email) throws Throwable {
    	patientForgotPO.enter_Email(email);
    }
    
    @And("^I verify that SendPassword button Enable$")
    public void i_verify_that_sendpassword_button_enable() throws Throwable {
    	Assert.assertTrue(patientForgotPO.verify_SendButtonEnable());
    }
    
    @And("^I verify that SendButton is clickable$")
    public void i_verify_that_sendbutton_is_clickable() throws Throwable {
    	Assert.assertTrue(patientForgotPO.verify_SendPasswordClickable());
    }
    
    @Then("^I verify that error message for invalid email gets displayed$")
    public void i_verify_that_error_message_for_invalid_email_gets_displayed() throws Throwable {
    	Assert.assertTrue(patientForgotPO.verify_ErrorForNonRegisteredMsg());  
    }

    @When("^I click on Send button$")
    public void i_click_on_send_button() throws Throwable {
    	patientForgotPO.click_SendPassword();
    }
    
    @Then("^I verify that i navigated to Reset screen$")
    public void i_verify_that_i_navigated_to_reset_screen() throws Throwable {
    	Assert.assertTrue(patientForgotPO.verify_FieldOnPage121("ResetButton"));
    }
    
    @Then("^I verify that i receive mail for reseting password$")
    public void i_verify_that_i_receive_mail_for_reseting_password() throws Throwable {
    	Assert.assertTrue(patientForgotPO.verify_EmailForResetCode());
    }
    
    @Then("^I verify mail body of the mail$")
    public void i_verify_mail_body_of_the_mail() throws Throwable {
    	Assert.assertTrue(patientForgotPO.verify_MailBody());
    }
    
    @And("^I verify All Fields are present$")
    public void i_verify_all_fields_are_present() throws Throwable {
    	Assert.assertTrue(patientForgotPO.verifyFieldOnResetScreen());
    }
    
    @And("^I verify that i am not able to edit Email Field$")
    public void i_verify_that_i_am_not_able_to_edit_email_field() throws Throwable {
    	Assert.assertTrue(patientForgotPO.verify_EmailFieldEditable());
    }

    @Then("^I verify that I get mail more than once for reset code$")
    public void i_verify_that_i_get_mail_more_than_once_for_reset_code() throws Throwable {
    	Assert.assertTrue(patientForgotPO.verify_ResetMailMoreThanOnce());
    }
    
    @When("^I enter \"([^\"]*)\" in Password_Field$")
    public void i_enter_something_in_passwordfield(String password) throws Throwable {
    	patientForgotPO.enter_NewPassword(password); 
    }

    @And("^I verify that Reset_Password button is disable$")
    public void i_verify_that_resetpassword_button_is_disable() throws Throwable {
    	Assert.assertFalse(patientForgotPO.verify_ResetButtonDisable());
    }
    
    @When("^I enter \"([^\"]*)\" in ResetCode_Field$")
    public void i_enter_something_in_resetcodefield(String code) throws Throwable {
    	patientForgotPO.enter_ResetCode(code);
    }
    
    @Then("^I verify that i get error message for invalid reset code and password$")
    public void i_verify_that_i_get_error_message_for_invalid_reset_code_and_password() throws Throwable {
    	Assert.assertTrue(patientForgotPO.verify_ErrorMsgOnResetScreen());
    }

    @And("^I click on Reset button1$")
    public void i_click_on_reset_button1() throws Throwable {
    	Assert.assertTrue(patientForgotPO.click_ResetButton());
    }
    
    @Then("^I verify that i am not able to enter alphanumeric value in Reset code field$")
    public void i_verify_that_i_am_not_able_to_enter_alphanumeric_value_in_reset_code_field() throws Throwable {
    	Assert.assertTrue(patientForgotPO.verify_ResetFieldAcceptAlphabets());
    }

    @When("^I enter in ResetCode_Field1$")
    public void i_enter_in_resetcodefield1() throws Throwable {
       patientForgotPO.enter_ResetFromMail();
    }
    

    @And("^I verify that i navigate to Dashboard1 of patient$")
    public void i_verify_that_i_navigate_to_dashboard1_of_patient() throws Throwable {
    	Assert.assertTrue(patientForgotPO.verify_FieldOnPage121("PatientToolsTExt1"));
    }
    
    @When("^I click on logout2 button$")
    public void i_click_on_logout2_button() throws Throwable {
    	patientForgotPO.click_Logout12();
    }

}
