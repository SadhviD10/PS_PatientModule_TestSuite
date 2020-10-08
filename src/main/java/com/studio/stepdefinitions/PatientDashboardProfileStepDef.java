package com.studio.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.github.javafaker.Faker;
import com.studio.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PatientDashboardProfileStepDef extends StepDefinitionInit {
	

    @When("^I enter \"([^\"]*)\" inEmail1_Field1$")
    public void i_enter_something_inemail1field1(String email) throws Throwable {
    	patientDashboardProfilePO.enter_Email(email);
    }

    @When("^I enter \"([^\"]*)\" inPassword1_Field1$")
    public void i_enter_something_inpassword1field1(String password) throws Throwable {
    	patientDashboardProfilePO.enter_Password(password);
    }

    @Then("^I verify that I navigated to Dashboard Page Of Patient1$")
    public void i_verify_that_i_navigated_to_dashboard_page_of_patient1() throws Throwable {
    	 Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("LoginText")); 
    }

    @And("^I verify that I am on LoginPage1 of Patient1$")
    public void i_verify_that_i_am_on_loginpage1_of_patient1() throws Throwable {
        Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("ForgotPasswordPatient"));
    }

    @And("^I click on Login1_Btn1$")
    public void i_click_on_login1btn1() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.click_LoginBtn1());
    }

    @And("^I verify that i am able to view Patient Tool sections text$")
    public void i_verify_that_i_am_able_to_view_patient_tool_sections_text() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("PatientTool"));
    }
    
    @And("^I verify that i am able to view Support sections text$")
    public void i_verify_that_i_am_able_to_view_support_sections_text() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("Support"));
    }
    
    @And("^I verify that i am able to view Dashboard Tab$")
    public void i_verify_that_i_am_able_to_view_dashboard_tab() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("DashboardTab"));
    }

    @And("^I verify that i am able to view Profile tab$")
    public void i_verify_that_i_am_able_to_view_profile_tab() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("PatientTab"));
    }

    @And("^I verify that i am able to view Contact office tab$")
    public void i_verify_that_i_am_able_to_view_contact_office_tab() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("ContactOfcTab"));
    }

    @And("^I verify that i am able to view Technical Support tab$")
    public void i_verify_that_i_am_able_to_view_technical_support_tab() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("TechnicalSupport"));
    }

    @And("^I verify that i am able to view MyAccount link on top right of page$")
    public void i_verify_that_i_am_able_to_view_myaccount_link_on_top_right_of_page() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("MyAccount"));
    }

    @And("^I verify that i am able to view Header Image on the top$")
    public void i_verify_that_i_am_able_to_view_header_image_on_the_top() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("HeaderImage"));
    }

    @And("^I verify that i am able to view patient Family name on top right$")
    public void i_verify_that_i_am_able_to_view_patient_family_name_on_top_right() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("HeaderNameText"));
    }

    @And("^I verify that i am able to click on Header Image on top right$")
    public void i_verify_that_i_am_able_to_click_on_header_image_on_top_right() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.clickAndVerify_HeaderImage());
    }
    
    @When("^I click on Logout button$")
    public void i_click_on_logout_button() throws Throwable {
    	patientDashboardProfilePO.click_Element("LogoutBtn"); 
    }
    
    @When("^I click on Setting button$")
    public void i_click_on_setting_button() throws Throwable {
    	patientDashboardProfilePO.click_Element("SettingBtn"); 
    }
    
    @And("^I verify that i navigated to Setting page$")
    public void i_verify_that_i_navigated_to_setting_page() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("SettingText"));
    }
    
    @When("^I click on Profile Tab$")
    public void i_click_on_profile_tab() throws Throwable {
    	patientDashboardProfilePO.click_Element("PatientTab");
    }

    @When("^I click on Dashboard tab$")
    public void i_click_on_dashboard_tab() throws Throwable {
    	patientDashboardProfilePO.click_Element("DashboardTab");
    }

    @When("^I click on Contact Office tab$")
    public void i_click_on_contact_office_tab() throws Throwable {
    	patientDashboardProfilePO.click_Element("ContactOfcTab");
    }

    @When("^I click on Technical Support$")
    public void i_click_on_technical_support() throws Throwable {
    	patientDashboardProfilePO.click_Element("TechnicalSupport");
    }

    @Then("^I verify that i am on Contact office tab$")
    public void i_verify_that_i_am_on_contact_office_tab() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("AddressText"));
    }

    @Then("^I verify that i am on Technical support page$")
    public void i_verify_that_i_am_on_technical_support_page() throws Throwable {
    	session.driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("TexhnicalSupportText"));
    }

    @And("^I verify that I am on Profile page$")
    public void i_verify_that_i_am_on_profile_page() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("ProfileTabText"));
    }
    
    @And("^I verify that i am able to view ist of forms under dashboard$")
    public void i_verify_that_i_am_able_to_view_ist_of_forms_under_dashboard() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_ListOfForms());
    }
    
    @When("^I enter Staff credential$")
    public void i_enter_staff_credential() throws Throwable {
    	session.driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    	patientDashboardProfilePO.enter_StaffCredential();
    }

    @When("^I send Form to patient Successfuly$")
    public void i_send_form_to_patient_successfuly() throws Throwable {
    	String firstname=PropFileHandler.readProperty("FirstName1");
    	String lastname=PropFileHandler.readProperty("LastName1");
    	patientDashboardProfilePO.enter_FirstNameLstNameEmailChooseForm(firstname, lastname);
    }

    @Then("^I verify that i am on Dashboard of Staff Page$")
    public void i_verify_that_i_am_on_dashboard_of_staff_page() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("SendForm_ButtonStaff"));
    }

    @Then("^I verify that i am able to view new form under Dashboard$")
    public void i_verify_that_i_am_able_to_view_new_form_under_dashboard() throws Throwable {
    	//String URL=PropFileHandler.readProperty("URL_Pat");
    	Assert.assertTrue(patientDashboardProfilePO.verify_newFormUnderDashboard());
    }

    @And("^I open new Tab on current browser and switch to it with StaffURL$")
    public void i_open_new_tab_on_current_browser_and_switch_to_it_with_staffurl() throws Throwable {
    	Thread.sleep(2000);
    	String URL=PropFileHandler.readProperty("URL_Staff");
    	Assert.assertTrue(patientDashboardProfilePO.switch_SecondBrowserTab(URL));
    }

    @And("^I close the current browser and navigate back to patient page$")
    public void i_close_the_current_browser_and_navigate_back_to_patient_page() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.close_BrowserTab());
    }
    
    @When("^I send Form to new profile Successfuly$")
    public void i_send_form_to_new_profile_successfuly() throws Throwable {
    	Faker faker = new Faker();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
    	patientDashboardProfilePO.enter_FirstNameLstNameEmailChooseForm(firstName, lastName);
    }

    @Then("^I verify that i am able to view new profile and form under dashboard$")
    public void i_verify_that_i_am_able_to_view_new_profile_and_form_under_dashboard() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_newFormUnderNewProfileDashboard());
    }
    
    @When("^I enter \"([^\"]*)\" in First Name field of form$")
    public void i_enter_something_in_first_name_field_of_form(String name) throws Throwable {
    	Thread.sleep(4000);
    	patientDashboardProfilePO.enter_FormField("TestForm_FirstName",name);
    }

    @When("^I click to dashboard$")
    public void i_click_to_dashboard() throws Throwable {
    	patientDashboardProfilePO.click_Element("DashboardTab"); 
    }

    @Then("^I verify that i am able to see text \"([^\"]*)\" in First Name Field$")
    public void i_verify_that_i_am_able_to_see_text_something_in_first_name_field(String name) throws Throwable {
    	Thread.sleep(4000);
    	Assert.assertTrue(patientDashboardProfilePO.verify_TextFieldContent("TestForm_FirstName", name)); 
    }

    @And("^I verify that i am able to open the form$")
    public void i_verify_that_i_am_able_to_open_the_form() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_TestFormQA());
    }
    
    @When("^I click on MyAccount link$")
    public void i_click_on_myaccount_link() throws Throwable {
    	patientDashboardProfilePO.click_Element("MyAccount");
    }

    @And("^I verify that i am able to navigate to MyAccount page$")
    public void i_verify_that_i_am_able_to_navigate_to_myaccount_page() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("SettingText"));
    }
    
    @And("^I verify that i am able to view Patient name under Setting page$")
    public void i_verify_that_i_am_able_to_view_patient_name_under_setting_page() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("PatientFamilyNameText"));
    }

    @And("^I verify that i am able to view EmailField under Setting page$")
    public void i_verify_that_i_am_able_to_view_emailfield_under_setting_page() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("EmailField_Setting"));
    }

    @And("^I verify that i am able to view PhoneField under Setting page$")
    public void i_verify_that_i_am_able_to_view_phonefield_under_setting_page() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("PhoneField_Setting"));
    }

    @And("^I verify that i am able to view LastName under Setting page$")
    public void i_verify_that_i_am_able_to_view_lastname_under_setting_page() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_FieldOnPage("LastNameField_Setting"));
    }

    @And("^I verify that i am able to view Patients EmailID in EMail Field$")
    public void i_verify_that_i_am_able_to_view_patients_emailid_in_email_field() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_contentInTextField("EmailField_Setting", "Patient.studiotest@gmail.com"));
    }

    @And("^I verify that i am able to view Patients PhoneNumber in PhoneNumber Field$")
    public void i_verify_that_i_am_able_to_view_patients_phonenumber_in_phonenumber_field() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_contentInTextField("PhoneField_Setting", "512 335 6877"));
    }

    @And("^I verify that i am able to view Patients LastNAme in LastName Field$")
    public void i_verify_that_i_am_able_to_view_patients_lastname_in_lastname_field() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_contentInTextField("LastNameField_Setting", "test"));
    }
    @And("^I verify that i am not able to enter in EmailID field$")
    public void i_verify_that_i_am_not_able_to_enter_in_emailid_field() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_EditFieldInSetting("EmailField_Setting", "admin@email"));
    }
    
    @And("^I verify that i am not able to enter in Family Last Name$")
    public void i_verify_that_i_am_not_able_to_enter_in_family_last_name() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_EditFieldInSetting("LastNameField_Setting", "testing"));
    }
    
    @And("^I verify that i am able to enter in PhoneNumber Field$")
    public void i_verify_that_i_am_able_to_enter_in_phonenumber_field() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_EditFieldInSetting1("PhoneField_Setting", "512 335 6866"));
    }
    
    @And("^I verify that i am able to get validation error message for invalid phone$")
    public void i_verify_that_i_am_able_to_get_validation_error_message_for_invalid_phone() throws Throwable {
    	Assert.assertTrue(patientDashboardProfilePO.verify_PhoneValidationError());
    }

}
