Feature: Covering Patient TestForm Page Scenarios

  @Test_001_002_003_004_005_006_007    @patient   @Smoke  @PTestForm
  Scenario: To verify User is able to view Test Form QA under Dashboard and is able to click on the form
    And I verify that I am on LoginPage of Patient1
    When I enter "Patient.studiotest@gmail.com" inEmail_Field
    When I enter "Test@123" inPassword_Field
    And I click on Login_Btn
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    And I verify that Current Page and Total Number of pages are displayed on top of first page
    And I verify that First Page Title is displayed
    And I verify that Second Page title is displayed on first page
    And I verify that Patient Information section text is visible
    And I verify that Select a Test Section text is visible
    And I verify that Nextpgae Button is present at bottom
    And I verify that Left and Right arrow are present
    Then I verify that right arrow is enabled if all mandatory fields are filled
    And I verify that First Name field is present
    And I verify that Last Name Field is present
    And I verify that DOB field is present
    And I verify that GenderMale Check box is present
    And I verify that GenderFemale Check box is present
    And I verify that GenderOther Check box is present
    And I verify that Social Security Field is present
    And I verify thatBest Phone field is present
    And I verify that EmailField1 is present
    And I verify that Upload Licence button is present
    And I verify that Nucleic Acid test checkbox is present
    And I verify that Sarc test checkbox is present
    And I verify that serology test checkbox is present

  @Test_000    @patient    @PTestForm
  Scenario: To verify user should not be allowed to redirect to second page if mandatory fields are empty
    # And I verify that I am on LoginPage of Patient1
    #  When I enter "vasu.dwivedi10@gmail.com" inEmail_Field
    #  When I enter "Test@12345" inPassword_Field
    #  And I click on Login_Btn
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that i am getting error message to fill mandatory fields

  @Test_008_009    @patient  @Smoke  @PTestForm
  Scenario: To verify user is able to enter in the First Name,Why comeToDoctor and LastName field
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    Then I verify that I am able to enter in FirstNameField
    Then I verify that I am able to enter in LastNameField
    And I enter in WhyComeToDoctor

  @Test_010    @patient  @Smoke  @PTestForm
  Scenario: To verify user is able to enter DOB in date of birth field
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    And I verify that I am able to enter in DOB field

  @Test_011    @patient  @Smoke  @PTestForm
  Scenario: To verify user is able to select from the Gender
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    And I verify that I am able to select Male gender radio button
    And I verify that I am able to select Female gender radio button

  #And I verify that I am able to select Other gender radio button
   
  @Test_012    @patient  @Smoke  @PTestForm
  Scenario: To verify Other text field is displayed if selected Other radio button from the Gender
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    And I verify that Other field is displayed if selected Other Gender

  @Test_014      @patient  @Smoke   @PTestForm
  Scenario: To verify User is able to Enter Numerics in the social security
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    And I verify that i am able to enter in Social security number

  @Test_015    @patient    @PTestForm
  Scenario: To verify user gets error message if entered invalid social security
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    And I verify that validation msg for invalid SSN displayed

  @Test_016_018     @patient   @Smoke  @PTestForm
  Scenario: To verify user is able to enter in Phone number
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    And I verify that i am able to enter valid phone number
    And I verify that I am able to enter in email field

  @Test_017    @patient  @Smoke   @PTestForm
  Scenario: To verify user is able to select from State dropdown
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    And I select from the state dropdown

  @Test_019    @patient    @PTestForm  @Smoke
  Scenario: To verify user is able to select any option from the Select a Test section
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    And i verify that i am able select Sarc option
    And I verify that i am able to select serology option
    And I verify that i am able to select Nucleic acid option
   # And I deselect Sarc option
   # And I deselect Nucleic acid option
    And I deselect serology option

  @Test_020    @patient    @PTestForm
  Scenario: To verify user should not be allowed to redirect to second page if FirstName field is empty
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I clear the First name field
    #  And I enter In LastName field
    #  And I enter In DOB field
    #  And I select Female gender radio button
    #  And I enter in Social Security
    #  And I enter in Phone Number field
    # And I enter in Email Field
    #And I select a Test
    # And I enter in WhyComeToDoctor
    When I click on Next Page button
    Then I verify that i am getting error message to fill mandatory fields

  @Test_021    @patient   @PTestForm
  Scenario: To verify User when clear Field and then navigate to Dashboard and then again open the form, cleared fields should not display pre-written content
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I clear the First name field
    When I click dashboard button
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    And I verify that Content under First Name field is empty

  @Test_022    @patient   @PTestForm
  Scenario: To verify user should not be allowed to redirect to next field if Last Name fields is empty
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I clear the Last name field
    And I enter the First name field
    # And I enter In DOB field
    #  And I select Female gender radio button
    #  And I enter in Social Security
    #  And I enter in Phone Number field
    #  And I enter in Email Field
    #  And I enter in WhyComeToDoctor
    # And I select a Test
    When I click on Next Page button
    Then I verify that i am getting error message to fill mandatory fields

  @Test_023    @patient   @PTestForm
  Scenario: To verify user should not be allowed to redirect to next field if DOB fields is empty
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I clear DOB field
    # And I enter the First name field
    And I enter In LastName field
    #  And I select Female gender radio button
    #  And I enter in Social Security
    #  And I enter in Phone Number field
    #  And I enter in Email Field
    #  And I enter in WhyComeToDoctor
    #   And I select a Test
    When I click on Next Page button
    Then I verify that i am getting error message to fill mandatory fields

  @Test_025    @patient  @PTestForm
  Scenario: To verify user should not be allowed to redirect to next field if Email fields is empty
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    # And I enter the First name field
    # And I enter In LastName field
    When I clear DOB field
    And I enter In DOB field
    When I clear Email field
    # And I select Female gender radio button
    #And I enter in Social Security
    #  And I enter in Phone Number field
    #  And I enter in WhyComeToDoctor
    #  And I select a Test
    When I click on Next Page button
    Then I verify that i am getting error message to fill mandatory fields

  @Test_026    @patient   @PTestForm
  Scenario: To verify user should not be allowed to redirect to next field if Best Phone fields is empty
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I clear Best Phone field
    # And I enter the First name field
    #And I enter In LastName field
    # And I enter In DOB field
    #  And I select Female gender radio button
    #  And I enter in Social Security
    And I enter in Email Field
    #   And I enter in WhyComeToDoctor
    #  And I select a Test
    When I click on Next Page button
    Then I verify that i am getting error message to fill mandatory fields

  @Test_027    @patient  @PTestForm
  Scenario: To verify user should not be allowed to redirect to next field if Social Securityfields is empty
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I clear SocialSecurity field
    # And I enter the First name field
    # And I enter In LastName field
    # And I enter In DOB field
    # And I select Female gender radio button
    # And I enter in Email Field
    And I enter in Phone Number field
    # And I enter in WhyComeToDoctor
    # And I select a Test
    When I click on Next Page button
    Then I verify that i am getting error message to fill mandatory fields

  # @Test_028 @78 @78912
  # Scenario: To verify user should not be allowed to redirect to next field if Select a Test fields is not selected
  #   Then I verify that I navigated to Dashboard Page Of Patient
  #   And I verify that TestFormQA is present in Form List and I click on it
  #  And I verify that TestFormQA is opened
  #  And I enter in Social Security
  #  And I enter the First name field
  #  And I enter In LastName field
  #  And I enter In DOB field
  #  And I select Female gender radio button
  #  And I enter in Email Field
  #  And I enter in Phone Number field
  #   And I enter in WhyComeToDoctor
  #   And I deselect a Test
  #   When I click on Next Page button
  #  Then I verify that i am getting error message to fill mandatory fields
  @Test_029    @patient  @PTestForm
  Scenario: To verify user should not be redirected to next page if entered Invalid Date of birth
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    #  And I enter the First name field
    #  And I enter In LastName field
    When I clear DOB field
    And I enter invalid DOB
    #  And I select Female gender radio button
    #   And I enter in Email Field
    #   And I enter in Phone Number field
    # And I enter in WhyComeToDoctor
    #     And I select a Test
    When I click on Next Page button
    Then I verify that i am not navigated to next page

  @Test_030    @patient  @PTestForm
  Scenario: To verify user should not be able to redirect to next page if entered invalid Phone
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    #   And I enter in Social Security
    #   And I enter the First name field
    #   And I enter In LastName field
    When I clear DOB field
    And I enter In DOB field
    When I clear Best Phone field
    And I enter Invalid Phone Number
    #    And I enter in Email Field
    #   And I select Female gender radio button
    #  And I enter in WhyComeToDoctor
    #  And I select a Test
    When I click on Next Page button
    Then I verify that i am getting error message to fill mandatory fields

  #@Test_031 @patient @78912
  #Scenario: To verify user should not be able to redirect to next page if entered invalid Email
  # Then I verify that I navigated to Dashboard Page Of Patient
  # And I verify that TestFormQA is present in Form List and I click on it
  # And I verify that TestFormQA is opened
  # And I enter in Social Security
  # And I enter the First name field
  # And I enter In LastName field
  # And I enter in Phone Number field
  # And I enter invalid Email Field
  # And I enter In DOB field
  # And I select Female gender radio button
  # And I enter in WhyComeToDoctor
  # And I select a Test
  #When I click on Next Page button
  #  Then I verify that i am not navigated to next page
  
  @Test_032    @patient  @PTestForm
  Scenario: To verify user should not be able to redirect to next page if entered invalid Social Security
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    #  And I enter the First name field
    #  And I enter In LastName field
    #  And I enter In DOB field
    #  And I select Female gender radio button
    When I clear SocialSecurity field
    And I enter invalid Social Security
    When I clear Best Phone field
    And I enter in Phone Number field
    #  And I enter in Email Field
    #  And I select a Test
    When I click on Next Page button
    Then I verify that i am getting error message to fill mandatory fields

  @Test_033       @patient  @Smoke   @PTestForm
  Scenario: To verify user is able to navigate to next page if all fields are entered as valid
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I clear SocialSecurity field
    And I enter in Social Security
  #  When I clear the First name field
  #  And I enter the First name field
  #  When I clear the Last name field
  #  And I enter In LastName field
  #  When I clear DOB field
  #  And I enter In DOB field
  #  And I select Female gender radio button
  #  When I clear Best Phone field
 #   And I enter in Phone Number field
    #  And I enter in Email Field
    #  And I enter in WhyComeToDoctor
    #  And I select a Test
    When I click on Next Page button
    Then I verify that I navigated to next page

  @Test_034       @patient   @Smoke    @PTestForm
  Scenario: To verify Right arrow on top becomes enabled if all the fields are valid
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    # And I enter the First name field
    # And I enter In LastName field
    #  When I clear DOB field
    #  And I enter In DOB field
    # And I select Female gender radio button
    # And I enter in Social Security
    #  And I enter in Phone Number field
    #  And I enter in Email Field
    #And I enter in WhyComeToDoctor
    #  And I select a Test
    When I click on Right arrow button on top
    Then I verify that I navigated to next page

  @Test_035_036_037_043     @patient   @Smoke   @PTestForm
  Scenario: To verify Fields and sections under page-2 of Test Form QA
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    And I verify that Emergency Contact Section is displayed
    And I verify that Office only section text is displayed
    And I verify that Office only section is not displayed to patient
    And I verify that PAge number and Total number of pages displayed
    And I verify that Second page title is displayed
    And I verify that third page title is displayed
    And I verify that Name Field is displayed
    And I verify that Phone Field is displayed
    And I verify that I am able to select from Relation Dropdown

  @Test_038_039_040     @patient  @Smoke  @PTestForm
  Scenario: To verify user is able to redirect to previous page when click on Previous button
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I click on Previous page Button
    Then I verify that I navigated to First page
    When I click on Right arrow button on top
    Then I verify that I navigated to next page
    When I click on Left arrow again on top of 2nd Page
    Then I verify that I navigated to First page

  @Test_041_042     @patient   @Smoke   @PTestForm
  Scenario: To verify I am able to enter in Name and Phone Number Field
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    And I verify that I am able to enter in Name Field
    And I verify that I am able to enter in Phone Field

  @Test_044    @patient     @PTestForm
  Scenario: To verify user is not able to navigate to next page with empty Name
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I clear Name field
    # And I enter in PhoneField of page two
    When I click on Next Page button
    Then I verify that i am getting error message to fill mandatory fields

  @Test_045    @patient     @PTestForm
  Scenario: To verify user is not able to navigate tot next page with empty Phone
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I clear Phone field
    And I enter in NameField of page two
    When I click on Next Page button
    Then I verify that i am getting error message to fill mandatory fields

  @Test_046  @patient   @PTestForm
  Scenario: To verify user is not able to navigate to next page with invalid Phone number
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I clear Phone field
    And I enter invalid PhoneField of page two
    When I click on Next Page button
    Then I verify that i am getting error message to fill mandatory fields

  @Test_047     @patient  @Smoke  @PTestForm
  Scenario: To verify user is able to navigate to next page when all mandatory fields are filled with valid data
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I clear Phone field
    And I enter in PhoneField of page two
    When I click on Next Page button
    Then I verify that i navigated to third page
 
  @Test_048_049_050_051     @patient  @Smoke  @PTestForm
  Scenario: To verify and navigate back and forth from third page to second page and then to third page
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I click on Next Page button
    Then I verify that i navigated to third page
    When I click on Previous page Button
    Then I verify that I navigated to Second page
    When I click on Right arrow button on top
    Then I verify that i navigated to third page
    When I click on Left arrow again on top of 2nd Page
    Then I verify that I navigated to Second page

  @Test_052_053     @patient  @Smoke  @PTestForm
  Scenario: To verify fields on third page of Test Form QA
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I click on Next Page button
    Then I verify that i navigated to third page
    And I verify that i am able to view Third page with total number of page
    And I verify that i am able to view third page title
    And I verify that Primary Insurance section is present
    And I verify that Secondary Insurance section is present
    And I verify that Policy Holder Name is present
    And I verify that Insurance Name is present
    And I verify that Policy DOB is present
    And I verify that Policy ID is present
    And I verify that Policy Name is present
    And I verify that Group Number is present

  @Test_055 @patient  @PTestForm
  Scenario: To verify User is not able to navigate to 4th page if Policy Holder name is left empty
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I click on Next Page button
    Then I verify that i navigated to third page
    When I clear Policy Holder Name
    And I Enter PolicyID
    # And I upload Insurance frontPage image
    # And I upload Insurance LastPage image
    When I click on Next Page button
    Then I verify that i am getting error message to fill mandatory fields

  @Test_056_057_058_059   @patient   @PTestForm
  Scenario: To verify text fields on form should not be accepting spaces as valid names
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I click on Next Page button
    Then I verify that i navigated to third page
    And I verify that spaces are not accepted as valid names under text fields of Test form QA

  @Test_054     @patient   @Smoke  @PTestForm
  Scenario: To verify user is able to navigate to 4th page of the form if user fill following fields 1. Policy Holder name 2. Policy ID 3. Upload Front of Insurance Card 4. Upload Back of Insurance Card
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I click on Next Page button
    Then I verify that i navigated to third page
    And I enter Policy Holder Name
    And I Enter PolicyID
    And I upload Insurance frontPage image
    And I upload Insurance LastPage image
    When I click on Next Page button
    Then I verify that i navigated to 4th page of the Form

  @Test_060_061_062       @patient   @Smoke   @PTestForm
  Scenario: To verify Back and Forth functionality from 4th page to 3rd page and then to 4th page
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I click on Next Page button
    Then I verify that i navigated to third page
    And I enter Policy Holder Name
    When I click on Next Page button
    Then I verify that i navigated to 4th page of the Form
    When I click on Previous page Button
    Then I verify that i navigated to third page
    When I click on Right arrow button on top
    Then I verify that i navigated to 4th page of the Form
    When I click on Left arrow again on top of 4th Page
    Then I verify that i navigated to third page

  @Test_063_064_065_066     @patient  @Smoke  @PTestForm
  Scenario: To verify Content gets displayed under Page four of test Form QA
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I click on Next Page button
    Then I verify that i navigated to third page
    When I click on Next Page button
    Then I verify that i navigated to 4th page of the Form
    And I verify that i am able to view page number with total number of pages
    And I verify that i am able to view page title
    And I verify that i am able to view signature text
    And I verify that i am able to view Signature checkbox
    When I click on Next Page button
    Then I verify that i get error message to fill mandatory fields

  @Test_067     @patient   @Smoke  @PTestForm
  Scenario: To verify user is able to navigate to 5th page if user checked signature checkbox
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I click on Next Page button
    Then I verify that i navigated to third page
    When I click on Next Page button
    Then I verify that i navigated to 4th page of the Form
    When I checked Signature
    Then I verify that I navigated to fifth page

  @Test_068_069_070     @patient   @Smoke   @PTestForm
  Scenario: To verify back and fourth functionality from last page to 1st page
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I click on Next Page button
    Then I verify that i navigated to third page
    When I click on Next Page button
    Then I verify that i navigated to 4th page of the Form
    When I click on Next Page button
    Then I verify that I navigated to fifth page
    When I click on Previous page Button
    Then I verify that i navigated to 4th page of the Form
    When I click on Previous page Button
    Then I verify that i navigated to third page
    When I click on Previous page Button
    Then I verify that I navigated to next page
    When I click on Right arrow button on top
    Then I verify that i navigated to third page
    When I click on Right arrow button on top
    Then I verify that i navigated to 4th page of the Form
    When I click on Right arrow button on top
    Then I verify that I navigated to fifth page

  @Test_071_072     @patient  @Smoke   @PTestForm
  Scenario: To verify Patient is able to view Fields under page-5 of Test Form QA
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I click on Next Page button
    Then I verify that i navigated to third page
    When I click on Next Page button
    Then I verify that i navigated to 4th page of the Form
    When I click on Next Page button
    Then I verify that I navigated to fifth page
    And I verify that Current page number is shown on top of page five
    And I verify that current page title is shown on top of page five
    And I verify that Medical Condition section text is shown on page five
    And I verify that Allergic and Medical condition text is shown on page five

  @Test_073 @patient @PTestForm
  Scenario: To verify user is not able to submit the form  if  no medical condition is selected
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I click on Next Page button
    Then I verify that i navigated to third page
    When I click on Next Page button
    Then I verify that i navigated to 4th page of the Form
    When I click on Next Page button
    Then I verify that I navigated to fifth page
    When I click on Submit button5
    Then I verify that i am getting error message to fill mandatory fields

  @Test_074 @patient  @PTestForm
  Scenario: To veri other text field is enabled if user select Other checkbox under medical condition
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I click on Next Page button
    Then I verify that i navigated to third page
    When I click on Next Page button
    Then I verify that i navigated to 4th page of the Form
    When I click on Next Page button
    Then I verify that I navigated to fifth page
    When I select other Medical conditions
    Then I verify that Other text field is displayed

  @Test_075     @patient   @Smoke   @PTestForm
  Scenario: To verify user is able to submit the form and receives confirmation mail if all the mandatory fields are filled
    Then I verify that I navigated to Dashboard Page Of Patient
    And I verify that TestFormQA is present in Form List and I click on it
    And I verify that TestFormQA is opened
    When I click on Next Page button
    Then I verify that I navigated to next page
    When I click on Next Page button
    Then I verify that i navigated to third page
    When I click on Next Page button
    Then I verify that i navigated to 4th page of the Form
    When I click on Next Page button
    Then I verify that I navigated to fifth page
    When I select Diabetes checkbox
    When I click on Submit button5
    Then I verify that  Patient receives confirmation mail for successful form submit
    
  @Test_076   @patient   @Smoke   @PTestForm
  Scenario: To logout from patient module dashboard page
     Then I verify that I navigated to Dashboard Page Of Patient
     When I logout from dashboard of patient module
     And I verify that I am on LoginPage of Patient1