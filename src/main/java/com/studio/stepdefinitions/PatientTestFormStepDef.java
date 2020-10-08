package com.studio.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.studio.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PatientTestFormStepDef extends StepDefinitionInit {

	@When("^I enter \"([^\"]*)\" inEmail_Field$")
	public void i_enter_something_inemailfield(String email) throws Throwable {
		patientTestFormPO.enter_Email(email);
	}

	@When("^I enter \"([^\"]*)\" inPassword_Field$")
	public void i_enter_something_inpasswordfield(String password) throws Throwable {
		patientTestFormPO.enter_Password(password);
	}

	@Then("^I verify that I navigated to Dashboard Page Of Patient$")
	public void i_verify_that_i_navigated_to_dashboard_page_of_patient() throws Throwable {
		Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("LoginText"));
	}

	@And("^I verify that I am on LoginPage of Patient1$")
	public void i_verify_that_i_am_on_loginpage_of_patient1() throws Throwable {
		Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("ForgotPasswordPatient"));
	}

	@And("^I click on Login_Btn$")
	public void i_click_on_loginbtn() throws Throwable {
		Assert.assertTrue(patientTestFormPO.click_LoginBtn1());
	}

	@And("^I verify that TestFormQA is present in Form List and I click on it$")
	public void i_verify_that_testformqa_is_present_in_form_list_and_i_click_on_it() throws Throwable {
		Assert.assertTrue(patientTestFormPO.verify_TestFormQA());
	}

	@And("^I verify that TestFormQA is opened$")
	public void i_verify_that_testformqa_is_opened() throws Throwable {
		session.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("FirstNameField"));
	}
	
	@And("^I verify that Current Page and Total Number of pages are displayed on top of first page$")
    public void i_verify_that_current_page_and_total_number_of_pages_are_displayed_on_top_of_first_page() throws Throwable {
		Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("FirstPage_TotalPageNumber"));
    }

    @And("^I verify that First Page Title is displayed$")
    public void i_verify_that_first_page_title_is_displayed() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("FirstPage_FirstPageTitle"));
    }

    @And("^I verify that Second Page title is displayed on first page$")
    public void i_verify_that_second_page_title_is_displayed_on_first_page() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("FirstPage_SecondPageTitle"));
    }

    @And("^I verify that Patient Information section text is visible$")
    public void i_verify_that_patient_information_section_text_is_visible() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("PatientInfo_SectionText"));
    }

    @And("^I verify that Select a Test Section text is visible$")
    public void i_verify_that_select_a_test_section_text_is_visible() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("SelectATest_SectionText"));
    }
    
    @And("^I verify that Nextpgae Button is present at bottom$")
    public void i_verify_that_nextpgae_button_is_present_at_bottom() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("NextPageBtn"));
    }
    
    @Then("^I verify that right arrow is enabled if all mandatory fields are filled$")
    public void i_verify_that_right_arrow_is_enabled_if_all_mandatory_fields_are_filled() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_RightArrowdisabled());
    }

    @And("^I verify that Left and Right arrow are present$")
    public void i_verify_that_left_and_right_arrow_are_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("FirstPage_RightArrow"));
    }
    
    @And("^I verify that First Name field is present$")
    public void i_verify_that_first_name_field_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("FirstNameField"));
    }

    @And("^I verify that Last Name Field is present$")
    public void i_verify_that_last_name_field_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("LastNameField"));
    }

    @And("^I verify that DOB field is present$")
    public void i_verify_that_dob_field_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("DOBField"));
    }

    @And("^I verify that GenderMale Check box is present$")
    public void i_verify_that_gendermale_check_box_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("Gender_Male"));
    }
    
    @And("^I verify that GenderFemale Check box is present$")
    public void i_verify_that_genderfemale_check_box_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("Gender_Female"));
    }
    
    @And("^I verify that GenderOther Check box is present$")
    public void i_verify_that_genderother_check_box_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("Gender_Other"));
    }

    @And("^I verify that Social Security Field is present$")
    public void i_verify_that_social_security_field_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("SocialSecurity"));
    }

    @And("^I verify thatBest Phone field is present$")
    public void i_verify_thatbest_phone_field_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("BestPhoneField"));
    }

    @And("^I verify that State dropdown field is present$")
    public void i_verify_that_state_dropdown_field_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("StateLabelText"));
    }

    @And("^I verify that EmailField1 is present$")
    public void i_verify_that_emailfield1_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("EmailID"));
    }

    @And("^I verify that Upload Licence button is present$")
    public void i_verify_that_upload_licence_button_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("FileUpload"));
    }
    
    @And("^I verify that Nucleic Acid test checkbox is present$")
    public void i_verify_that_nucleic_acid_test_checkbox_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("SelectTest_NucleicAcid"));
    }

    @And("^I verify that Sarc test checkbox is present$")
    public void i_verify_that_sarc_test_checkbox_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("SelectTest_Sarc"));
    }

    @And("^I verify that serology test checkbox is present$")
    public void i_verify_that_serology_test_checkbox_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("SelectTest_Serology"));
    }
    
    @Then("^I verify that I am able to enter in FirstNameField$")
    public void i_verify_that_i_am_able_to_enter_in_firstnamefield() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField("FirstNameField", "Dalton"));
    }

    @Then("^I verify that I am able to enter in LastNameField$")
    public void i_verify_that_i_am_able_to_enter_in_lastnamefield() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField("LastNameField", "Dalton"));
    }
    
    @And("^I verify that I am able to enter in DOB field$")
    public void i_verify_that_i_am_able_to_enter_in_dob_field() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterDOB("10/21/20"));
    }
    
    @And("^I verify that I am able to select Male gender radio button$")
    public void i_verify_that_i_am_able_to_select_male_gender_radio_button() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.select_GenderRadioBtn("Gender_Male"));
    }

    @And("^I verify that I am able to select Female gender radio button$")
    public void i_verify_that_i_am_able_to_select_female_gender_radio_button() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.select_GenderRadioBtn("Gender_Female"));
    }

    @And("^I verify that I am able to select Other gender radio button$")
    public void i_verify_that_i_am_able_to_select_other_gender_radio_button() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.select_GenderRadioBtn("Gender_Other"));
    }
    
    @And("^I verify that Other field is displayed if selected Other Gender$")
    public void i_verify_that_other_field_is_displayed_if_selected_other_gender() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.selectOtherField_Displayed());
    }
    
    @And("^I verify that i am able to enter in Social security number$")
    public void i_verify_that_i_am_able_to_enter_in_social_security_number() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.enter_ValidSocialSecurity());
    }
    
    @And("^I verify that validation msg for invalid SSN displayed$")
    public void i_verify_that_validation_msg_for_invalid_ssn_displayed() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.enter_InValidSocialSecurity());
    }
    
    @And("^I verify that i am able to enter valid phone number$")
    public void i_verify_that_i_am_able_to_enter_valid_phone_number() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.enter_ValidPhoneNumber());
    }
    
    @And("^I select from the state dropdown$")
    public void i_select_from_the_state_dropdown() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.select_StateFromDropdown());
    }

    @And("^I verify that I am able to enter in email field$")
    public void i_verify_that_i_am_able_to_enter_in_email_field() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField1("EmailID", "dummy@gmail.com"));
    }
    
    @And("^i verify that i am able select Sarc option$")
    public void i_verify_that_i_am_able_select_sarc_option() throws Throwable {
    	Thread.sleep(2000);
    	Assert.assertTrue(patientTestFormPO.select_ATestOption("SelectTest_Sarc"));
    }

    @And("^I verify that i am able to select serology option$")
    public void i_verify_that_i_am_able_to_select_serology_option() throws Throwable {
    	Thread.sleep(2000);
    	Assert.assertTrue(patientTestFormPO.select_ATestOption("SelectTest_Serology")); 
    }

    @And("^I verify that i am able to select Nucleic acid option$")
    public void i_verify_that_i_am_able_to_select_nucleic_acid_option() throws Throwable {
    	Thread.sleep(2000);
    	Assert.assertTrue(patientTestFormPO.select_ATestOption("SelectTest_NucleicAcid"));
    }
    

    @And("^I deselect Sarc option$")
    public void i_deselect_sarc_option() throws Throwable {
    	Thread.sleep(2000);
    	Assert.assertTrue(patientTestFormPO.select_ATestOption("SelectTest_Sarc"));
    }

    @And("^I deselect Nucleic acid option$")
    public void i_deselect_nucleic_acid_option() throws Throwable {
    	Thread.sleep(2000);
    	Assert.assertTrue(patientTestFormPO.select_ATestOption("SelectTest_NucleicAcid"));
    }

    @And("^I deselect serology option$")
    public void i_deselect_serology_option() throws Throwable {
    	Thread.sleep(2000);
    	Assert.assertTrue(patientTestFormPO.select_ATestOption("SelectTest_Serology"));
    }
    
    @When("^I click on Next Page button$")
    public void i_click_on_next_page_button() throws Throwable {
    	Thread.sleep(2000);
       patientTestFormPO.click_Button12("NextPageBtn");
    }

    @Then("^I verify that i am getting error message to fill mandatory fields$")
    public void i_verify_that_i_am_getting_error_message_to_fill_mandatory_fields() throws Throwable {
    	Thread.sleep(2000);
    	Assert.assertTrue(patientTestFormPO.errorMsg_ForMnadtoryFields("MandatoryField_Msg"));
    }

    @And("^I enter In LastName field$")
    public void i_enter_in_lastname_field() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField("LastNameField", "Dalton"));
    }

    @And("^I enter In DOB field$")
    public void i_enter_in_dob_field() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterDOB("10/21/2010"));
    }

    @And("^I select Female gender radio button$")
    public void i_select_female_gender_radio_button() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.select_GenderRadioBtn("Gender_Female"));
    }

    @And("^I enter in Social Security$")
    public void i_enter_in_social_security() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.enter_ValidSocialSecurity());
    }

    @And("^I enter in Phone Number field$")
    public void i_enter_in_phone_number_field() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.enter_ValidPhoneNumber());
    }

    @And("^I enter in Email Field$")
    public void i_enter_in_email_field() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField1("EmailID", "dummy@gmail.com"));
    }
    
    @And("^I enter invalid Email Field$")
    public void i_enter_invalid_email_field() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField1("EmailID", "dummy@gmai"));
    }

    @And("^I select a Test$")
    public void i_select_a_test() throws Throwable {
    	Thread.sleep(2000);
    	Assert.assertTrue(patientTestFormPO.select_ATestOption("SelectTest_NucleicAcid"));
    }
    
    @And("^I deselect a Test$")
    public void i_deselect_a_test() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.select_ATestOption("SelectTest_NucleicAcid"));
    }
    
    @And("^I enter invalid DOB$")
    public void i_enter_invalid_dob() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterDOB("10/21/1"));
    }
    
    @When("^I click on Right arrow button on top$")
    public void i_click_on_right_arrow_button_on_top() throws Throwable {
    	Thread.sleep(1000);
    	patientTestFormPO.click_Button12("FirstPage_RightArrow");
    }
    
    @And("^I enter Invalid Phone Number$")
    public void i_enter_invalid_phone_number() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.enter_InvalidPhone());
    }
    
    @When("^I clear the First name field$")
    public void i_clear_the_first_name_field() throws Throwable {
    	patientTestFormPO.clear_FieldValue("FirstNameField");
    }
    
    @When("^I clear the Last name field$")
    public void i_clear_the_last_name_field() throws Throwable {
    	patientTestFormPO.clear_FieldValue("LastNameField");
    }
    
    @When("^I clear DOB field$")
    public void i_clear_dob_field() throws Throwable {
    	patientTestFormPO.clear_FieldValue("DOBField");
    }
    
    @When("^I clear Email field$")
    public void i_clear_email_field() throws Throwable {
    	patientTestFormPO.clear_FieldValue("EmailID");
    }
    
    @When("^I clear Best Phone field$")
    public void i_clear_best_phone_field() throws Throwable {
    	patientTestFormPO.clear_FieldValue("BestPhoneField");
    }

    @When("^I clear SocialSecurity field$")
    public void i_clear_socialsecurity_field() throws Throwable {
    	patientTestFormPO.clear_FieldValue("SocialSecurity");
    }

    
    @And("^I enter in WhyComeToDoctor Field$")
    public void i_enter_in_whycometodoctor_field() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField("WhyComeToDoctor", "dummy"));
    }
    
    @When("^I click dashboard button$")
    public void i_click_dashboard_button() throws Throwable {
    	patientTestFormPO.click_Button12("DashboardButton");
    }
    
    @And("^I verify that Content under First Name field is empty$")
    public void i_verify_that_content_under_first_name_field_is_empty() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_TestFormClearOrNot()); 
    }

    @And("^I enter the First name field$")
    public void i_enter_the_first_name_field() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField("FirstNameField", "dummy"));
    }

    @And("^I enter invalid Social Security$")
    public void i_enter_invalid_social_security() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.enter_InValidSocialSecurity());
    }
    
    @Then("^I verify that i am not navigated to next page$")
    public void i_verify_that_i_am_not_navigated_to_next_page() throws Throwable {
    	Thread.sleep(2000);
    	Assert.assertTrue(patientTestFormPO.verify_SecondPageNotOpened());
    }
    
    @And("^I enter in WhyComeToDoctor$")
    public void i_enter_in_whycometodoctor() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField2("WhyComeDoctor", "dummy"));
    }
    
    @Then("^I verify that I navigated to next page$")
    public void i_verify_that_i_navigated_to_next_page() throws Throwable {
    	Thread.sleep(1000);
    	Assert.assertTrue(patientTestFormPO.verify_SecondPageSucess());
    }
    
    @And("^I verify that Emergency Contact Section is displayed$")
    public void i_verify_that_emergency_contact_section_is_displayed() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("EmergencyContactSection"));
    }

    @And("^I verify that Office only section text is displayed$")
    public void i_verify_that_office_only_section_text_is_displayed() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("OfficeOnly"));
    }

    @And("^I verify that PAge number and Total number of pages displayed$")
    public void i_verify_that_page_number_and_total_number_of_pages_displayed() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("SecondPage_NumberOfPage"));
    }

    @And("^I verify that Second page title is displayed$")
    public void i_verify_that_second_page_title_is_displayed() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("SecondPageTitle_2"));
    }

    @And("^I verify that third page title is displayed$")
    public void i_verify_that_third_page_title_is_displayed() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("ThirdPageTitle_2"));
    }

    @And("^I verify that Name Field is displayed$")
    public void i_verify_that_name_field_is_displayed() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("SecondPage_Name"));
    }

    @And("^I verify that Phone Field is displayed$")
    public void i_verify_that_phone_field_is_displayed() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("SecondPage_Phone"));
    }

    @And("^I verify that I am able to select from Relation Dropdown$")
    public void i_verify_that_i_am_able_to_select_from_relation_dropdown() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_RelationToPatientDropdown());
    }
    
    @And("^I verify that Office only section is not displayed to patient$")
    public void i_verify_that_office_only_section_is_not_displayed_to_patient() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("OfficeOnlyText_Pat"));
    }
    
    @When("^I click on Previous page Button$")
    public void i_click_on_previous_page_button() throws Throwable {
    	patientTestFormPO.click_Button12("PreviousButton_SecondPage");
    }

    @Then("^I verify that I navigated to First page$")
    public void i_verify_that_i_navigated_to_first_page() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("FirstNameField"));
    }    

    @When("^I click on Left arrow again on top of 2nd Page$")
    public void i_click_on_left_arrow_again_on_top_of_2nd_page() throws Throwable {
    	patientTestFormPO.click_Arrow(0);
    }
    
    @And("^I verify that I am able to enter in Name Field$")
    public void i_verify_that_i_am_able_to_enter_in_name_field() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField3("SecondPage_Name", "dummy"));
    }

    @And("^I verify that I am able to enter in Phone Field$")
    public void i_verify_that_i_am_able_to_enter_in_phone_field() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField3("SecondPage_Phone", "234 345 4567"));
    }    

    @When("^I clear Name field$")
    public void i_clear_name_field() throws Throwable {
    	patientTestFormPO.clear_FieldValue("SecondPage_Name");
    }

    @And("^I enter in PhoneField of page two$")
    public void i_enter_in_phonefield_of_page_two() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField3("SecondPage_Phone", "234 345 4567"));
    }

    @When("^I clear Phone field$")
    public void i_clear_phone_field() throws Throwable {
    	patientTestFormPO.clear_FieldValue("SecondPage_Phone");
    }

    @And("^I enter in NameField of page two$")
    public void i_enter_in_namefield_of_page_two() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField3("SecondPage_Name", "dummy"));
    }
    
    @And("^I enter invalid PhoneField of page two$")
    public void i_enter_invalid_phonefield_of_page_two() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField3("SecondPage_Phone", "234 345"));
    }
    
    @Then("^I verify that i navigated to third page$")
    public void i_verify_that_i_navigated_to_third_page() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("PolicyName"));
    }
    
    @Then("^I verify that I navigated to Second page$")
    public void i_verify_that_i_navigated_to_second_page() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("OfficeOnlyText_Pat"));
    }

    @And("^I verify that i am able to view Third page with total number of page$")
    public void i_verify_that_i_am_able_to_view_third_page_with_total_number_of_page() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("CurrentPageThird_TotalPage"));
    }

    @And("^I verify that i am able to view third page title$")
    public void i_verify_that_i_am_able_to_view_third_page_title() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("ThirdPage_Title"));
    }

    @And("^I verify that Primary Insurance section is present$")
    public void i_verify_that_primary_insurance_section_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("PrimaryInsuranceText"));
    }

    @And("^I verify that Secondary Insurance section is present$")
    public void i_verify_that_secondary_insurance_section_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("SecondaryInsuranceText"));
    }

    @And("^I verify that Policy Holder Name is present$")
    public void i_verify_that_policy_holder_name_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("PolicyHolderName"));
    }

    @And("^I verify that Insurance Name is present$")
    public void i_verify_that_insurance_name_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("InsuranceName"));
    }

    @And("^I verify that Policy DOB is present$")
    public void i_verify_that_policy_dob_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("PolicyDOB"));
    }

    @And("^I verify that Policy ID is present$")
    public void i_verify_that_policy_id_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("PolicyID"));
    }

    @And("^I verify that Policy Name is present$")
    public void i_verify_that_policy_name_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("PolicyName"));
    }

    @And("^I verify that Group Number is present$")
    public void i_verify_that_group_number_is_present() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("GroupNumber"));
    }

    @And("^I verify that spaces are not accepted as valid names under text fields of Test form QA$")
    public void i_verify_that_spaces_are_not_accepted_as_valid_names_under_text_fields_of_test_form_qa() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_TextNameFieldAcceptSpaces("PolicyHolderName"));
    }
    
    @Then("^I verify that i navigated to 4th page of the Form$")
    public void i_verify_that_i_navigated_to_4th_page_of_the_form() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("FourthPage_Checkbox"));
    }
    
    @And("^I enter Policy Holder Name$")
    public void i_enter_policy_holder_name() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField4("PolicyHolderName", "dummy policy"));
    }

    @And("^I Enter PolicyID$")
    public void i_enter_policyid() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_EnterInField4("PolicyID", "23456789"));
    }

    @And("^I upload Insurance frontPage image$")
    public void i_upload_insurance_frontpage_image() throws Throwable {
    	String file=PropFileHandler.readProperty("FileUpload");
    	Assert.assertTrue(patientTestFormPO.upload_Image("UploadFile_Front", file));
    }

    @And("^I upload Insurance LastPage image$")
    public void i_upload_insurance_lastpage_image() throws Throwable {
    	String file=PropFileHandler.readProperty("FileUpload");
    	Assert.assertTrue(patientTestFormPO.upload_Image("UploadFile_Back", file));
    }
    
    @When("^I click on Left arrow again on top of 4th Page$")
    public void i_click_on_left_arrow_again_on_top_of_4th_page() throws Throwable {
    	patientTestFormPO.click_Arrow(0);
    }
    
    @When("^I clear Policy Holder Name$")
    public void i_clear_policy_holder_name() throws Throwable {
    	patientTestFormPO.clear_FieldValue("PolicyHolderName");
    }
    

    @And("^I verify that i am able to view page number with total number of pages$")
    public void i_verify_that_i_am_able_to_view_page_number_with_total_number_of_pages() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("CurrentPageFourth_TotalPage"));
    }

    @And("^I verify that i am able to view page title$")
    public void i_verify_that_i_am_able_to_view_page_title() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("FourthPage_Title"));
    }

    @And("^I verify that i am able to view signature text$")
    public void i_verify_that_i_am_able_to_view_signature_text() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("SignatureText"));
    }

    @And("^I verify that i am able to view Signature checkbox$")
    public void i_verify_that_i_am_able_to_view_signature_checkbox() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("FourthPage_Checkbox"));
    }

    @Then("^I verify that i get error message to fill mandatory fields$")
    public void i_verify_that_i_get_error_message_to_fill_mandatory_fields() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("SigErrorMsg"));
    }
    
    @When("^I checked Signature$")
    public void i_checked_signature() throws Throwable {
    	patientTestFormPO.click_Button12("FourthPage_Checkbox");
    }

    @Then("^I verify that I navigated to fifth page$")
    public void i_verify_that_i_navigated_to_fifth_page() throws Throwable {
    	Thread.sleep(2000);
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("MedicalConditionText"));
    }

    @And("^I verify that Current page number is shown on top of page five$")
    public void i_verify_that_current_page_number_is_shown_on_top_of_page_five() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("CurrentPageFifth_TotalPage"));
    }

    @And("^I verify that current page title is shown on top of page five$")
    public void i_verify_that_current_page_title_is_shown_on_top_of_page_five() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("FiftPage_Title"));
    }

    @And("^I verify that Medical Condition section text is shown on page five$")
    public void i_verify_that_medical_condition_section_text_is_shown_on_page_five() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("MedicalConditionText"));
    }

    @And("^I verify that Allergic and Medical condition text is shown on page five$")
    public void i_verify_that_allergic_and_medical_condition_text_is_shown_on_page_five() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("AllergicAndMedications"));
    }

    @When("^I click on Submit button5$")
    public void i_click_on_submit_button5() throws Throwable {
    	patientTestFormPO.click_Button12("SubmitButton");
    }
    
    @When("^I select other Medical conditions$")
    public void i_select_other_medical_conditions() throws Throwable {
    	patientTestFormPO.click_Button12("OtherCheck");
    }

    @Then("^I verify that Other text field is displayed$")
    public void i_verify_that_other_text_field_is_displayed() throws Throwable {
    	Assert.assertTrue(patientTestFormPO.verify_FieldOnPage("OtherField"));
    }
    
    @When("^I select Diabetes checkbox$")
    public void i_select_diabetes_checkbox() throws Throwable {
    	patientTestFormPO.click_Button12("Diabetes");
    }
    
    @Then("^I verify that  Patient receives confirmation mail for successful form submit$")
    public void i_verify_that_patient_receives_confirmation_mail_for_successful_form_submit() throws Throwable {
    	Thread.sleep(3000);
    	Assert.assertTrue(patientTestFormPO.verify_MailFormSuccessfulFormSubmit());
    }
    
    @When("^I logout from dashboard of patient module$")
    public void i_logout_from_dashboard_of_patient_module() throws Throwable {
    	patientTestFormPO.click_Logout12();
    }
}
