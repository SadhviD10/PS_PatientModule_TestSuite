Feature: Covering Patient Dashboard and Profile Page Scenarios

  @Dash_001_002_003_004_005_017 @patient  @Smoke
  Scenario: To verify User is able to View 2 Sections in SideMain menu of patient dashboard 1. Patient Tools 2. Support
    And I verify that I am on LoginPage1 of Patient1
    When I enter "Patient.studiotest@gmail.com" inEmail1_Field1
    When I enter "Test@123" inPassword1_Field1
    And I click on Login1_Btn1
    Then I verify that I navigated to Dashboard Page Of Patient1
    And I verify that i am able to view Patient Tool sections text
    And I verify that i am able to view Support sections text
    And I verify that i am able to view Dashboard Tab
    And I verify that i am able to view Profile tab
    And I verify that i am able to view Contact office tab
    And I verify that i am able to view Technical Support tab
    And I verify that i am able to view MyAccount link on top right of page
    And I verify that i am able to view Header Image on the top
    And I verify that i am able to view patient Family name on top right
    And I verify that i am able to click on Header Image on top right

  @Dash_006_007 @patient  @Smoke
  Scenario: To verify User is able to Logout from the Application when click on logout button
    Then I verify that I navigated to Dashboard Page Of Patient1
    And I verify that i am able to click on Header Image on top right
    When I click on Setting button
    And I verify that i navigated to Setting page
    And I verify that i am able to click on Header Image on top right
    When I click on Logout button
    And I verify that I am on LoginPage1 of Patient1
    When I enter "Patient.studiotest@gmail.com" inEmail1_Field1
    When I enter "Test@123" inPassword1_Field1
    And I click on Login1_Btn1
    Then I verify that I navigated to Dashboard Page Of Patient1

  @Dash_008_009_010   @patient   @Smoke
  Scenario: To verify User is able to click on Profiles,Dashboard,Contact Office and Technical Support under Patient Tools and support section
    Then I verify that I navigated to Dashboard Page Of Patient1
    When I click on Profile Tab
    And I verify that I am on Profile page
    When I click on Dashboard tab
    Then I verify that I navigated to Dashboard Page Of Patient1
    When I click on Contact Office tab
    Then I verify that i am on Contact office tab
    #When I click on Technical Support
    #Then I verify that i am on Technical support page

  @Dash_011   @patient   @Smoke
  Scenario: To verify User is able to view List of forms under Dashboard
    Then I verify that I navigated to Dashboard Page Of Patient1
    And I verify that i am able to view ist of forms under dashboard

  @Dash_012   @patient   @Smoke
  Scenario: To verify user is able to view new form send by the doctor under Dashboard only after refreshing the page
    Then I verify that I navigated to Dashboard Page Of Patient1
    And I open new Tab on current browser and switch to it with StaffURL
    When I enter Staff credential
    Then I verify that i am on Dashboard of Staff Page
    When I send Form to patient Successfuly
    And I close the current browser and navigate back to patient page
    Then I verify that i am able to view new form under Dashboard

  @Dash_013   @patient   @Smoke
  Scenario: To verify user is able to view forms for new profile under Dashboard after refreshing the page
    Then I verify that I navigated to Dashboard Page Of Patient1
    And I open new Tab on current browser and switch to it with StaffURL
    #When I enter Staff credential
    Then I verify that i am on Dashboard of Staff Page
    When I send Form to new profile Successfuly
    And I close the current browser and navigate back to patient page
    Then I verify that i am able to view new profile and form under dashboard

  @Dash_014_015  @patient
  Scenario: To verify if user is able to open the form from dashboard and details remains saved under the form even if user cancel the form in between
    Then I verify that I navigated to Dashboard Page Of Patient1
    And I verify that i am able to open the form
    When I enter "DummyName" in First Name field of form
    When I click to dashboard
    Then I verify that I navigated to Dashboard Page Of Patient1
    And I verify that i am able to open the form
    Then I verify that i am able to see text "DummyName" in First Name Field
    
    @Dash_018_019   @patient   @Smoke
    Scenario: To verify User can directly navigate to Setting page when click on MyAccount
    Then I verify that I navigated to Dashboard Page Of Patient1
    When I click on MyAccount link
    And I verify that i am able to navigate to MyAccount page
    And I verify that i am able to view Patient name under Setting page
    And I verify that i am able to view EmailField under Setting page
    And I verify that i am able to view PhoneField under Setting page
    And I verify that i am able to view LastName under Setting page
    
    @Dash_020_021_022    @patient   @Smoke
    Scenario: To verify user is able to view EmailID under Email Field,PhoneNumber under Phone Field and Last Name under Last name field
    Then I verify that I navigated to Dashboard Page Of Patient1
    When I click on MyAccount link
    And I verify that i am able to navigate to MyAccount page
    And I verify that i am able to view Patients EmailID in EMail Field
    And I verify that i am able to view Patients PhoneNumber in PhoneNumber Field
    And I verify that i am able to view Patients LastNAme in LastName Field
    
    @Dash_023 @patient
    Scenario: To verify user is not able to edit EmailID under Email field of Setting page
    Then I verify that I navigated to Dashboard Page Of Patient1
    When I click on MyAccount link
    And I verify that i am able to navigate to MyAccount page
    And I verify that i am not able to enter in EmailID field
    
    @Dash_024    @patient   @Smoke
    Scenario: To verify User is able to Edit Phone Number under Account Setting Page
    Then I verify that I navigated to Dashboard Page Of Patient1
    When I click on MyAccount link
    And I verify that i am able to navigate to MyAccount page
    And I verify that i am able to enter in PhoneNumber Field
    
    @Dash_025 @patient
    Scenario: If verify user gets validation message for invalid mobile number
    Then I verify that I navigated to Dashboard Page Of Patient1
    When I click on MyAccount link
    And I verify that i am able to navigate to MyAccount page
    And I verify that i am able to get validation error message for invalid phone
    
    @Dash_026 @patient
    Scenario: To verify user should not be able to Edit his Family Last name
    Then I verify that I navigated to Dashboard Page Of Patient1
    When I click on MyAccount link
    And I verify that i am able to navigate to MyAccount page
    And I verify that i am not able to enter in Family Last Name
    
    @Dash_027     @patient   @Smoke
    Scenario: To Logout from the Patient Profile
    Then I verify that I navigated to Dashboard Page Of Patient1
    And I verify that i am able to click on Header Image on top right
    When I click on Logout button
    And I verify that I am on LoginPage1 of Patient1