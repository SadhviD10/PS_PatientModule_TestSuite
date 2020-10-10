Feature: Covering Patient Login Page Scenarios

  @Login_001_002_003_004_005_006_007    @patient   @Smoke  @PLogin
  Scenario: To verify User Redirect to Login page of Patient when enter Patient URL
  And I verify that i navigated to Login page of patient
  Then I verify that 2 different tabs are present Login and SignUp tab
  Then I verify that Email fields is present
  And I verify that Password field is present
  Then I verify that i am able to enter in Email1 field
  Then I verify that i am able to enter in Password1 field
  Then I verify that LoginBtn is disabled initially
  Then I verify that Forgot Password link is present
  
  @Login_008   @patient  @PLogin
  Scenario: To verify Login button is disable and getting validation error message for invalid email if user enter invalid Email and password
  And I verify that i navigated to Login page of patient
  When I enter "admin@admin" in Email1
  When I enter "12345" in Password1
  Then I verify that I get error message
  Then I verify that LoginBtn is disabled initially
  
  @Login_009      @patient   @Smoke  @PLogin
  Scenario: To verify Login Button is enable if user enter valid Email and password
  And I verify that i navigated to Login page of patient
  When I enter "Patient.studiotest@gmail.com" in Email1
  When I enter "Test@123" in Password1
  And I verify that Login button is Enable1
  
  @Login_011 @patient  @PLogin
  Scenario: To verify User is unable to login with valid Email and Invalid password
  And I verify that i navigated to Login page of patient
  When I enter "Patient.studiotest@gmail.com" in Email1
  When I enter "Test" in Password1
  And I click on Login buttonq
  Then I verify that I get error message for Invalid credentials
  
  @Login_012 @patient  @PLogin
  Scenario: To verify User is Unable to login with Invalid Email and valid Password
  And I verify that i navigated to Login page of patient
  When I enter "admin@admin" in Email1
  When I enter "Test@123" in Password1
  And I click on Login buttonq
  Then I verify that I get error message for Invalid credentials
  
  @Login_013      @patient   @Smoke  @PLogin
  Scenario: To verify User is able to login with valid Email and Password
  And I verify that i navigated to Login page of patient
  When I enter "vasu.dwivedi10@gmail.com" in Email1
  When I enter "Test@12345" in Password1
  And I click on Login buttonq
  Then I verify that I am able to login to Application
  
  @Login_014      @patient   @Smoke   @PLogin
  Scenario: To verify Logout from Patient Dashboard
  And I verify that I am on Dashboard of Patient portal
  When I click on logout button
  Then I verify that I am able to logout from the application