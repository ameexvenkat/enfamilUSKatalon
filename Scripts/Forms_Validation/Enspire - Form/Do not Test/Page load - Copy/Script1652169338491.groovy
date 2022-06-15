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

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/')

WebUI.delay(10)

WebUI.mouseOver(findTestObject('null'))

WebUI.verifyElementPresent(findTestObject('null'), 
    0)

WebUI.verifyElementText(findTestObject('null'), 
    'Nutramigen Savings & Support program', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Page_Nutramigen  Enfamil/div_Nutramigen Savings and SupportJoin now _8517f8'))

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/p_PERSONALIZE YOUR EXPERIENCE'), 'PERSONALIZE YOUR EXPERIENCE')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/p_1. Tell us your name and email'), '1. Tell us your name and email.')

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/input_First Name_fb93a681-abac-454b-96d8-6b_b88fa4'), 
    0)

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/input_First Name_fb93a681-abac-454b-96d8-6b_b88fa4_1'), 
    '')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_First Name field is required'), 'First Name field is required.')

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/input_Last Name_f79d7000-6316-40fb-a3e6-b1f_b5683d'), 
    0)

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_Last Name field is required'), 'Last Name field is required.')

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/input_Email_9fcda2d9-4eb1-44ad-9f84-baea49c9ae6a'), 
    0)

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_Email field is required'), 'Email field is required.')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/p_2. Enter your address'), '2. Enter your address.')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_2. Enter your address.You may receive s_cffe19'), '2. Enter your address.\nYou may receive some gifts closer to your baby’s due date.')

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/input_Street address_65b812a7-bc02-4bcd-ac9_5261a8'), 
    0)

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_Street address field is required'), 'Street address field is required.')

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/input_UnitSuiteApt (optional)_c2ceb8f5-0157_bab9a4_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/input_City_06a36acf-6633-4f94-886b-c290462de787_1'), 
    0)

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_City field is required'), 'City field is required.')

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/div_State'), 0)

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_State field is required'), 'State field is required.')

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/input_Zip code_722c29a2-2f5f-4d57-9ea0-2040_c80e4e_1'), 
    0)

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_Zip code field is required'), 'Zip code field is required.')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/p_3. Set password'), '3. Set password.')

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/input_Password_866a7dab-8bf6-4bee-a159-5265_93e73f_1'), 
    0)

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_Password is required'), 'Password is required')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_PasswordPassword is requiredHidePasswor_da1e50'), 'Password*Password is requiredHidePassword must contain:At least 8 charactersA lowercase letterAn uppercase letterA numberA special characterMust not be your email address')

WebUI.click(findTestObject('Page_Nutramigen  Enfamil/p_4. Stay up to date via SMS'))

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/p_4. Stay up to date via SMS'), '4. Stay up to date via SMS.')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/p_You will receive the latest product and d_ad0807'), 'You will receive the latest product and discount information.')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/input_Mobile phone (optional)_11bc8c7d-cb5a_a1e949'), '')

WebUI.click(findTestObject('Page_Nutramigen  Enfamil/label_Consent to Receive Certain Text Messa_5ce4cc'))

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/label_Consent to Receive Certain Text Messa_5ce4cc'), 
    0)

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/p_Consent to Receive Certain Text Messages _e143b0'), 'Consent to Receive Certain Text Messages: By signing up for Enfamil text alerts you will receive occasional messages that include information regarding infant and toddler formula. Message and data rates may apply. Text STOP to cancel, HELP for help. By opting-in, you agree to get texts from Enfamil at your mobile number, which may be sent through an automatic telephone dialing system. Your consent to receive such texts is not required for you to obtain any Enfamil products.')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/p_5. Customize your profile for you and your baby'), '5. Customize your profile for you and your baby.')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/p_Well provide tips and samples to fit your needs'), 'We’ll provide tips and samples to fit your needs.')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/label_Babys Due Date or Birth Date'), 'Baby\'s Due Date or Birth Date')

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/input_concat(Baby, , s Due Date or Birth Da_fc80e8'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/button_Why'), 0)

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/p_Relationship to child'), 'Relationship to child')

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/div_Select one'), 0)

WebUI.click(findTestObject('Page_Nutramigen  Enfamil/form_PERSONALIZE YOUR EXPERIENCE1. Tell us _0e5e33'))

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/span_How are you currently feeding your little one'), 'How are you currently feeding your little one?')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/p_How are you currently feeding your little_6134cd'), 'How are you currently feeding your little one? (optional)')

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/div_Select one_1'), 0)

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/p_Do you expect to receive infant formula f_11fd50'), 'Do you expect to receive infant formula from the government-sponsored Special Supplemental Nutrition Program for Women, Infants, and Children (WIC)?')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/p_Your answer helps us personalize your experience'), 'Your answer helps us personalize your experience.')

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/label_Yes'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/label_No'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/label_Not sure'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Nutramigen  Enfamil/button_Submit'), 0)

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/button_Submit'), 'Submit')

WebUI.click(findTestObject('Page_Nutramigen  Enfamil/button_Submit'))

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_Babys Due Date or Birth Date field is required'), 'Baby\'s Due Date or Birth Date field is required.')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_Relationship to child field is required'), 'Relationship to child field is required.')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_WIC Status field is required'), 'WIC Status field is required.')

WebUI.click(findTestObject('Page_Nutramigen  Enfamil/input_First Name_fb93a681-abac-454b-96d8-6b_b88fa4_1_2'))

WebUI.setText(findTestObject('Page_Nutramigen  Enfamil/input_First Name_fb93a681-abac-454b-96d8-6b_b88fa4_1_2_3'), '@')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_First Name contains invalid characters'), 'First Name contains invalid characters.')

WebUI.click(findTestObject('Page_Nutramigen  Enfamil/input_Last Name_f79d7000-6316-40fb-a3e6-b1f_b5683d_1'))

WebUI.setText(findTestObject('Page_Nutramigen  Enfamil/input_Last Name_f79d7000-6316-40fb-a3e6-b1f_b5683d_1_2'), '$')

WebUI.verifyElementText(findTestObject('Page_Nutramigen  Enfamil/div_Last Name contains invalid characters'), 'Last Name contains invalid characters.')

WebUI.setText(findTestObject('Page_Nutramigen  Enfamil/input_Email_9fcda2d9-4eb1-44ad-9f84-baea49c9ae6a'), 'mithun.uat2107_enroll01')

WebUI.verifyElementText(findTestObject('null'), 
    'Email field is invalid.')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    '^')

WebUI.verifyElementText(findTestObject('null'), 
    'Street address field has invalid characters.')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    '&')

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 
    'Unit/Suite/Apt field has invalid characters.')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    '*')

WebUI.verifyElementText(findTestObject('null'), 
    'City field has invalid characters.')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Object Repository/Nutramigen/Page_Nutramigen  Enfamil/input_Zip code_722c29a2-2f5f-4d57-9ea0-2040_c80e4e_1_2_3_4_5_6_7_8'), 
    '12345-')

WebUI.verifyElementText(findTestObject('null'), 
    'Invalid Zip code Format.')

WebUI.setText(findTestObject('Object Repository/Nutramigen/Page_Nutramigen  Enfamil/input_Password_866a7dab-8bf6-4bee-a159-5265_93e73f_1_2_3_4_5_6_7_8_9'), 
    '1234567')

WebUI.verifyElementText(findTestObject('null'), 
    'Your password isn\'t strong enough.')

WebUI.closeBrowser()

