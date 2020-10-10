Feature: Covering Patient SignUp Page Scenarios

  @SignUp_001_002_003_004_005_006_007_008   @patient  @Smoke   @PSignUp
  Scenario: To verify User is redirected to SignUp Tab if clicked on Sign up under Login page
  And I verify that i navigated to Login page of Patient2
  When I click on SignUp Tab
  Then I verify that i navigated to SignUp page
  Then I verify that all the fieldds are present
  And I verify that SignUp button is Disable initially
  And I verify that I am able to enter in First Name
  And I verify that I am able to enter in Last Name
  And I verify that I am able to enter in Email Field
  And I verify that I am able to enter in PhoneNumber
  And I verify that I am able to enter in create Password field
  
  @SignUp_009 @patient  @PSignUp
  Scenario: To verify User get Validation error message for invalid First Name
  And I verify that i navigated to Login page of Patient2
  When I click on SignUp Tab
  Then I verify that i navigated to SignUp page
  And I verify that I am not able to enter invalid FirstName
  
  @SignUp_010 @patient   @PSignUp
  Scenario: To verify User get Validation error message for invalid Last Name
  And I verify that i navigated to Login page of Patient2
  When I click on SignUp Tab
  Then I verify that i navigated to SignUp page
  And I verify that I am not able to enter invalid LastName
  
  @SignUp_011 @patient   @PSignUp
  Scenario: To verify User is able to Enter Only numerics 10 digit in Phone number Field
  And I verify that i navigated to Login page of Patient2
  When I click on SignUp Tab
  Then I verify that i navigated to SignUp page
  And I verify that i am not able to enter more than 10 digits in phone field
  And I verify that i am not able to enter alphabets in phone field
  
  @SignUp_012 @patient  @PSignUp
  Scenario: To verify User Should get Validation error message for invalid Email
  And I verify that i navigated to Login page of Patient2
  When I click on SignUp Tab
  Then I verify that i navigated to SignUp page
  And I verify that i am getting error message for invalid Email
  
  @SignUp_013 @patient  @PSignUp
  Scenario: To verify User should get error for Invalid Password format
  And I verify that i navigated to Login page of Patient2
  When I click on SignUp Tab
  Then I verify that i navigated to SignUp page
  When I enter in FirstName
  When I enter in LastName
  When I enter in Email12
  When I enter in PhoneNumber
  And I verify that when enter "12345" in PhoneNumber1 i get error message
  And I verify that when enter "abcd123" in PhoneNumber2 i get error message
  And I verify that when enter "Abc1" in PhoneNumber3 i get error message
  
  @SignUp_014    @patient  @Smoke  @PSignUp
  Scenario: To verify User should get a message if user is trying to SignUp with Already Existing Email
  And I verify that i navigated to Login page of Patient2
  When I click on SignUp Tab
  Then I verify that i navigated to SignUp page
  When I enter in FirstName
  When I enter in LastName
  When I enter "vasu.dwivedi10@gmail.com" in Email4
  When I enter in PhoneNumber
  And I verify that when enter "Test@123" in PhoneNumber1 i get error message
  
  @SignUp_015    @patient  @Smoke  @PSignUp
  Scenario: To verify user Get redirected to Dashboard of Patient after Successful SignUp process
  And I verify that i navigated to Login page of Patient2
  When I click on SignUp Tab
  Then I verify that i navigated to SignUp page
  When I enter in FirstName
  When I enter in LastName
  When I enter in Email12
  When I enter in PhoneNumber
  When I enter "Test@12345" in CreatePassword
  When I click on SignUp button
  And I verify that i navigated to Dashboard of Patient portal after click on SignUp
  When I click on logout1_button
  And I verify that i navigated to Login page of Patient2