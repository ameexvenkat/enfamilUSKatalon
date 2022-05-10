import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.DrivetoThrive)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_Join the Drive to Thrive Support Program'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_Join the Drive to Thrive Support Program'), 
    'Join the Drive to Thrive Support Program')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/h1_Join the Drive to Thrive Support Program'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/h1_Join the Drive to Thrive Support Program'), 
    'Join the Drive to Thrive Support Program')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_Receive up to 70 in savings, plus monthly_bdae63'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_Receive up to 70 in savings, plus monthly_bdae63'), 
    'Receive up to $70 in savings*, plus monthly emails with expert advice on caring for your premature baby. Check your mailbox within 2 weeks of joining for your exclusive savings!')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/div_Benefits may vary'), 
    '*Benefits may vary.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/div_Benefits may vary'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/img_Drive to Thrive Program_carousel-item__image'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/img_Drive to Thrive Program_carousel-item__image'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_PERSONALIZE YOUR EXPERIENCE'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_PERSONALIZE YOUR EXPERIENCE'), 
    'PERSONALIZE YOUR EXPERIENCE')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_1. Tell us your name and email'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_1. Tell us your name and email'), 
    '1. Tell us your name and email')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_First Name_03b7fe2a-3e68-45ab-aab0-ad_c608d0'), 
    0)

WebUI.click(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/form_PERSONALIZE YOUR EXPERIENCE1. Tell us _fbf02e'))

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_First Name_03b7fe2a-3e68-45ab-aab0-ad_c608d0_1_2'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_Last Name_b7646462-9b79-4a9f-bfac-a4d_a09211'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_Last Name_b7646462-9b79-4a9f-bfac-a4d_a09211_1'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_Email_ca07a407-accc-4c4a-b2c3-cdf136bcce09'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_Email_ca07a407-accc-4c4a-b2c3-cdf136bcce09_1'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_2. Enter your address'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_2. Enter your address'), 
    '2. Enter your address.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/div_You may receive some gifts closer to yo_321671'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/div_You may receive some gifts closer to yo_321671'), 
    'You may receive some gifts closer to your baby’s due date.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_Street address_ce0841cb-2ae9-4bc0-9ca_87d9da'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_Street address_ce0841cb-2ae9-4bc0-9ca_87d9da_1'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_UnitSuiteApt (optional)_cec817e9-76cd_747c93'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_UnitSuiteApt (optional)_cec817e9-76cd_747c93_1'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_City_1cea0cb2-2f5d-4e2d-9c1d-66cd6c282c6c'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_City_1cea0cb2-2f5d-4e2d-9c1d-66cd6c282c6c_1'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/div_State'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/div_State'), 'State')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/label_State'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_Zip code_699e6d61-72d6-44bf-91fc-5f3a_d249c0'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_Zip code_699e6d61-72d6-44bf-91fc-5f3a_d249c0_1'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_3. Set password'), 
    '3. Set password.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_Password_0c92672a-af33-4c66-910a-5dd1_f15064'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_Password_0c92672a-af33-4c66-910a-5dd1_f15064_1'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/button_Hide'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_Password must contain'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_At least 8 characters'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_A lowercase letter'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_An uppercase letter'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_A number'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_A special character'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_Must not be your email address'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_Password must contain'), 
    'Password must contain:')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_At least 8 characters'), 
    'At least 8 characters')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_A lowercase letter'), 
    'A lowercase letter')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_An uppercase letter'), 
    'An uppercase letter')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_A number'), 
    'A number')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_A special character'), 
    'A special character')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_Must not be your email address'), 
    'Must not be your email address')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_4. Stay up to date via SMS'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_4. Stay up to date via SMS'), 
    '4. Stay up to date via SMS.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/div_You will receive the latest product and_c60db3'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/div_You will receive the latest product and_c60db3'), 
    'You will receive the latest product and discount information.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_Mobile phone (optional)_de90bf96-74b5_dd48ac'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_Mobile phone (optional)_de90bf96-74b5_dd48ac_1'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_Consent to Receive Certain Text Messag_3845ec'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_Consent to Receive Certain Text Messag_3845ec'), 
    'Consent to Receive Certain Text Messages: By signing up for Enfamil text alerts you will receive occasional messages that include information regarding infant and toddler formula. Message and data rates may apply. Text STOP to cancel, HELP for help. By opting-in, you agree to get texts from Enfamil at your mobile number, which may be sent through an automatic telephone dialing system. Your consent to receive such texts is not required for you to obtain any Enfamil products.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/label_Consent to Receive Certain Text Messa_5ce4cc'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_Consent to Receive Certain Text Messages _e143b0'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_5. Customize your profile for you and your baby'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_5. Customize your profile for you and your baby'), 
    '5. Customize your profile for you and your baby.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/div_Well provide tips and samples to fit yo_5c2778'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/div_Well provide tips and samples to fit yo_5c2778'), 
    'We’ll provide tips and samples to fit your needs.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/label_Babys Due Date or Birth Date'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/label_Babys Due Date or Birth Date'), 
    'Baby\'s Due Date or Birth Date')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_concat(Baby, , s Due Date or Birth Da_cb1f65'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/input_concat(Baby, , s Due Date or Birth Da_cb1f65_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/button_Why'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/button_Why'), 
    'Why?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_Relationship to child'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_Relationship to child'), 
    'Relationship to child')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/div_Select one'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/div_Select one'), 
    'Select one')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/div_Select one'), 
    'Select one')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_How are you currently feeding your little one'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_How are you currently feeding your little one'), 
    'How are you currently feeding your little one?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_(optional)'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_(optional)'), 
    '(optional)')

WebUI.verifyElementPresent(findTestObject('Form Verification/Drive to Thrive Form EN/Page_/div_Select one - Copy'), 0)

WebUI.verifyElementText(findTestObject('Form Verification/Drive to Thrive Form EN/Page_/div_Select one - Copy'), 'Select one')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/div_Do you expect to receive infant formula_e140e3'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_Do you expect to receive infant formula f_11fd50'), 
    'Do you expect to receive infant formula from the government-sponsored Special Supplemental Nutrition Program for Women, Infants, and Children (WIC)?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_Your answer helps us personalize your experience'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_Your answer helps us personalize your experience'), 
    'Your answer helps us personalize your experience.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/label_Yes'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/label_Yes'), 'Yes')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/label_No'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/label_No'), 'No')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/label_Not sure'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/label_Not sure'), 
    'Not sure')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_Terms and Conditions'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_Terms and Conditions'), 
    'Terms and Conditions')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_By clicking Submit, I agree to join the E_ddbe4c'), 
    'By clicking “Submit”, I agree to join the Enfamil® Enfacare® Drive to Thrive program and to receive free samples, offers and other communications from the Drive to Thrive Support program and receive other information and offers on family-related health and hygiene products and services from Mead Johnson Nutrition’s affiliated companies. I understand that my information will be shared with such affiliates and will be used in accordance with their own privacy policies. By joining, I acknowledge that I have reviewed and agree to the Terms of Use and Privacy Policy.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/p_By clicking Submit, I agree to join the E_ddbe4c'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/a_Terms of Use'), 
    'Terms of Use')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/a_Terms of Use'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/a_Privacy Policy'), 
    'Privacy Policy.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/a_Privacy Policy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/button_Submit'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/button_Submit'), 
    'Submit')

WebUI.click(findTestObject('Object Repository/Form Verification/Drive to Thrive Form EN/Page_/span_Home'))

WebUI.delay(10)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Enfamil Newborn, Infant & Toddler Nutrition │ Enfamil', false)

WebUI.closeBrowser()

