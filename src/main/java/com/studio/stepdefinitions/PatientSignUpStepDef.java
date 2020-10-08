package com.studio.stepdefinitions;

import org.junit.Assert;

import com.studio.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PatientSignUpStepDef extends StepDefinitionInit {

	@When("^I click on SignUp Tab$")
    public void i_click_on_signup_tab() throws Throwable {
		patientSignUpPO.click_OnTab("SignUp");
    }

    @Then("^I verify that i navigated to SignUp page$")
    public void i_verify_that_i_navigated_to_signup_page() throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_FieldOnPage121("FirstName"));
    }

    @And("^I verify that i navigated to Login page of Patient2$")
    public void i_verify_that_i_navigated_to_login_page_of_patient2() throws Throwable {
        Assert.assertTrue(patientSignUpPO.verify_FieldOnPage121("Forgot_Password"));
    }
    
    @Then("^I verify that all the fieldds are present$")
    public void i_verify_that_all_the_fieldds_are_present() throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_FieldsOnSignUpPage()); 
    }
    
    @And("^I verify that SignUp button is Disable initially$")
    public void i_verify_that_signup_button_is_disable_initially() throws Throwable {
    	Assert.assertFalse(patientSignUpPO.verify_SignUpDisable());
    }
    
    @And("^I verify that I am able to enter in First Name$")
    public void i_verify_that_i_am_able_to_enter_in_first_name() throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_EnterInField("FirstName", "Dalton"));
    }
    
    @And("^I verify that I am able to enter in Last Name$")
    public void i_verify_that_i_am_able_to_enter_in_last_name() throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_EnterInField("LastName", "Dalton"));
    }
    
    @And("^I verify that I am able to enter in Email Field$")
    public void i_verify_that_i_am_able_to_enter_in_email_field() throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_EnterInField("Email", "Dalton@gmail.com"));
    }
    
    @And("^I verify that I am able to enter in PhoneNumber$")
    public void i_verify_that_i_am_able_to_enter_in_phonenumber() throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_EnterInField("PhoneNumber", "987 605 4325"));
    }
    
    @And("^I verify that I am able to enter in create Password field$")
    public void i_verify_that_i_am_able_to_enter_in_create_password_field() throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_EnterInField("CreatePassword", "Test@1234"));
    }
    
    @And("^I verify that I am not able to enter invalid FirstName$")
    public void i_verify_that_i_am_not_able_to_enter_invalid_firstname() throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_EnterInvalidField("FirstName", "Dalton   @#@$#@*(NU@E   jdiw2j"));
    }   

    @And("^I verify that I am not able to enter invalid LastName$")
    public void i_verify_that_i_am_not_able_to_enter_invalid_lastname() throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_EnterInvalidField("LastName", "Dalton   @#@$#@*(NU@E   jdiw2j"));
    }
    
    @And("^I verify that i am not able to enter more than 10 digits in phone field$")
    public void i_verify_that_i_am_not_able_to_enter_more_than_10_digits_in_phone_field() throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_EnterInvalidField("PhoneNumber", "435234789608"));
    }

    @And("^I verify that i am not able to enter alphabets in phone field$")
    public void i_verify_that_i_am_not_able_to_enter_alphabets_in_phone_field() throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_EnterInvalidField("PhoneNumber", "ABcdsuekjdd"));
    }
    
    @And("^I verify that i am getting error message for invalid Email$")
    public void i_verify_that_i_am_getting_error_message_for_invalid_email() throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_errorMsgOnInvalidEmail());
    }

    @When("^I enter in FirstName$")
    public void i_enter_in_firstname() throws Throwable {
    	String FirstName=PropFileHandler.readProperty("FirstNameSign");
    	patientSignUpPO.enter_inFields("FirstName", FirstName);
    }

    @When("^I enter in LastName$")
    public void i_enter_in_lastname() throws Throwable {
    	String LastName=PropFileHandler.readProperty("LastNameSign");
    	patientSignUpPO.enter_inFields("LastName", LastName);
    }

    @When("^I enter in Email12$")
    public void i_enter_in_email12() throws Throwable {
    //	String Email=PropFileHandler.readProperty("EmailSign");
    	patientSignUpPO.enter_InEmailFieldOfSignUp();
    }

    @When("^I enter in PhoneNumber$")
    public void i_enter_in_phonenumber() throws Throwable {
    	String PhoneNumber=PropFileHandler.readProperty("PhoneSign");
    	patientSignUpPO.enter_inFields("PhoneNumber", PhoneNumber);
    }

    @And("^I verify that when enter \"([^\"]*)\" in PhoneNumber1 i get error message$")
    public void i_verify_that_when_enter_something_in_phonenumber1_i_get_error_message(String password) throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_InvalidPassword(password));
    }

    @And("^I verify that when enter \"([^\"]*)\" in PhoneNumber2 i get error message$")
    public void i_verify_that_when_enter_something_in_phonenumber2_i_get_error_message(String password) throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_InvalidPassword(password));
    }

    @And("^I verify that when enter \"([^\"]*)\" in PhoneNumber3 i get error message$")
    public void i_verify_that_when_enter_something_in_phonenumber3_i_get_error_message(String password) throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_InvalidPassword(password));
    }
    

    @When("^I enter \"([^\"]*)\" in Email4$")
    public void i_enter_something_in_email4(String email) throws Throwable {
    	patientSignUpPO.enter_inFields("Email", email);
    }
    
    @When("^I enter \"([^\"]*)\" in CreatePassword$")
    public void i_enter_something_in_createpassword(String password) throws Throwable {
    	patientSignUpPO.enter_inFields("CreatePassword", password);
    }

    @And("^I verify that i navigated to Dashboard of Patient portal after click on SignUp$")
    public void i_verify_that_i_navigated_to_dashboard_of_patient_portal_after_click_on_signup() throws Throwable {
    	Assert.assertTrue(patientSignUpPO.verify_FieldOnPage121("PatientToolsTExt"));
    }
    
    @When("^I click on SignUp button$")
    public void i_click_on_signup_button() throws Throwable {
    	patientSignUpPO.click_SignUpBtn();
    }
    
    @When("^I click on logout1_button$")
    public void i_click_on_logout1button() throws Throwable {
    	patientSignUpPO.click_Logout12();
    }
}
