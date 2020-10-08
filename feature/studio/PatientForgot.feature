Feature: Covering Patient Forgot Password Page Scenarios

  @ForgotPassword_001     @patient   @Smoke
  Scenario: To verify User Redirect to Forgot password screen if click on Forgot password
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  
  @ForgotPassword_002     @patient   @Smoke
  Scenario: To verify User redirect back to Login when user click on Back To Login button
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  When I click on Back to login
  And I verify that i navigate to Login page of patient
  
  @ForgotPassword_003     @patient   @Smoke
  Scenario: To verify Email field is displayed Forgot password page
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  And I verify that Email Field1 is present
  
  @ForgotPassword_004     @patient   @Smoke
  Scenario: To verify Send Password button remain disable if Email is not entered
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  And I verify that SendPassword button1 is disable
  
  @ForgotPassword_005  @patient  
  Scenario: To verify Send Password button remain disable and validation message is displayed if user enter invalid Email
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  When I enter "abcd" in Email
  And I verify that SendPassword button1 is disable
  
  @ForgotPassword_006    @patient   @Smoke
  Scenario: To verify Send Password button become enable if user enter valid Email
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  When I enter "admin@gmail.com" in Email
  And I verify that SendPassword button Enable
  
  @ForgotPassword_007     @patient   @Smoke
  Scenario: To verify Send Password button is clickable or not for first time
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  When I enter "admin@gmail.com" in Email
  And I verify that SendButton is clickable
  
  @ForgotPassword_008  @patient  
  Scenario: To verify with non-registered Email user should get valid message of "User Not Registered" or not
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  When I enter "adminyhujjd@gmail.com" in Email
  When I click on Send button
  Then I verify that error message for invalid email gets displayed
  
  @ForgotPassword_009     @patient   @Smoke
  Scenario: To verify User redirect to Reset Password screen when click on Send Password button
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  When I enter "Patient.studiotest@gmail.com" in Email
  When I click on Send button
  Then I verify that i navigated to Reset screen
  
  @ForgotPassword_010_011    @patient   @Smoke
  Scenario: To verify User receives Email when click on Send Password button
  And I verify that i navigate to Login page of patient
  Then I verify that i receive mail for reseting password
  Then I verify mail body of the mail
  
  @ForgotPassword_012     @patient   @Smoke
  Scenario: To verify Reset Password screen contains below fields 1. Email 2. Reset Code 3. New Password
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  When I enter "admin@gmail.com" in Email
  When I click on Send button
  Then I verify that i navigated to Reset screen
  And I verify All Fields are present
  
  @ForgotPassword_013  @patient
  Scenario: To verify User should not be able to Edit Email under Email field of Reset Password screen
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  When I enter "admin@gmail.com" in Email
  When I click on Send button
  Then I verify that i navigated to Reset screen
  And I verify that i am not able to edit Email Field
  
  @ForgotPassword_014  @patient 
  Scenario: To verify Whether user gets Email for reset code more than once a day
  And I verify that i navigate to Login page of patient
  Then I verify that I get mail more than once for reset code
  
  @ForgotPassword_015  @patient 
  Scenario: To verify Reset password should remain disable if user fail to enter in Reset code
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  When I enter "dummy@gmail.com" in Email
  When I click on Send button
  Then I verify that i navigated to Reset screen
  When I enter "123456" in Password_Field
  And I verify that Reset_Password button is disable
  
  @ForgotPassword_016  @patient 
  Scenario: To verify Reset password should remain disable if user fail to enter in Password
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  When I enter "dummy@gmail.com" in Email
  When I click on Send button
  Then I verify that i navigated to Reset screen
  When I enter "123456" in ResetCode_Field
  And I verify that Reset_Password button is disable
  
  @ForgotPassword_017  @patient 
  Scenario: To verify User should get error message if user enter incorrect Reset code and click on Reset password
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  When I enter "dummy@gmail.com" in Email
  When I click on Send button
  Then I verify that i navigated to Reset screen
  When I enter "123456" in Password_Field
  When I enter "123456" in ResetCode_Field
  And I click on Reset button1
  Then I verify that i get error message for invalid reset code and password
  
  @ForgotPassword_018  @patient 
  Scenario: To verify Reset code field should accept only numeric digits
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  When I enter "dummy@gmail.com" in Email
  When I click on Send button
  Then I verify that i navigated to Reset screen
  Then I verify that i am not able to enter alphanumeric value in Reset code field
  
  @ForgotPassword_019      @patient   @Smoke
  Scenario: To verify user should get Confirmation message after successfully reseting password
  And I verify that i navigate to Login page of patient
  When I click on Forgot password button
  Then I verify that i navigate to Forgot password page
  When I enter "Patient.studiotest@gmail.com" in Email
  When I click on Send button
  Then I verify that i navigated to Reset screen
  When I enter "Test@123" in Password_Field
  When I enter in ResetCode_Field1
  And I click on Reset button1
  And I verify that i navigate to Dashboard1 of patient
  When I click on logout2 button
  And I verify that i navigate to Login page of patient