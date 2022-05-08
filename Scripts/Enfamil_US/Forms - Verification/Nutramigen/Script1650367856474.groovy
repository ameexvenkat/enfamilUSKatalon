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

WebUI.navigateToUrl(GlobalVariable.Nutramigen)

WebUI.maximizeWindow()

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/span_Nutramigen Savings and Support'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/span_Nutramigen Savings and Support'), 
    'Nutramigen® Savings and Support')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/h1_Nutramigen Savings and Support'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/h1_Nutramigen Savings and Support'), 
    'Nutramigen® Savings and Support')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_Join now for up to 130 in exclusive savin_72035f'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_Join now for up to 130 in exclusive savin_72035f'), 
    'Join now for up to $130 in exclusive savings, samples, tips for cow\'s milk allergy management and more.*')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_Benefits may vary'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_Benefits may vary'), 
    '*Benefits may vary.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/img_Nutramigen Savings and Support Program__4b42fe'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_PERSONALIZE YOUR EXPERIENCE'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_PERSONALIZE YOUR EXPERIENCE'), 
    'PERSONALIZE YOUR EXPERIENCE')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_1. Tell us your name and email'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_1. Tell us your name and email'), 
    '1. Tell us your name and email.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_First Name_fb93a681-abac-454b-96d8-6b_b88fa4'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_First Name_fb93a681-abac-454b-96d8-6b_b88fa4'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_Last Name_f79d7000-6316-40fb-a3e6-b1f_b5683d'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_Last Name_f79d7000-6316-40fb-a3e6-b1f_b5683d'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_Email_9fcda2d9-4eb1-44ad-9f84-baea49c9ae6a'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_Email_9fcda2d9-4eb1-44ad-9f84-baea49c9ae6a'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_2. Enter your address'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_2. Enter your address'), 
    '2. Enter your address.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/div_2. Enter your address.You may receive s_cffe19'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/div_2. Enter your address.You may receive s_cffe19'), 
    '2. Enter your address.\nYou may receive some gifts closer to your baby’s due date.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_Street address_65b812a7-bc02-4bcd-ac9_5261a8'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_Street address_65b812a7-bc02-4bcd-ac9_5261a8'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_UnitSuiteApt (optional)_c2ceb8f5-0157_bab9a4'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_UnitSuiteApt (optional)_c2ceb8f5-0157_bab9a4'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_City_06a36acf-6633-4f94-886b-c290462de787'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_City_06a36acf-6633-4f94-886b-c290462de787'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/div_State'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/div_State'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_Zip code_722c29a2-2f5f-4d57-9ea0-2040_c80e4e'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_Zip code_722c29a2-2f5f-4d57-9ea0-2040_c80e4e'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_3. Set password'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_3. Set password'), 
    '3. Set password.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_Password_866a7dab-8bf6-4bee-a159-5265_93e73f'), 
    0)

WebUI.verifyElementText(findTestObject('Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_Password_866a7dab-8bf6-4bee-a159-5265_93e73f'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/button_Hide'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/button_Hide'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/div_Password must containAt least 8 charact_619724'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/div_Password must containAt least 8 charact_619724'), 
    'Password must contain:\nAt least 8 characters\nA lowercase letter\nAn uppercase letter\nA number\nA special character\nMust not be your email address')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_4. Stay up to date via SMS'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_4. Stay up to date via SMS'), 
    '4. Stay up to date via SMS.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_You will receive the latest product and d_ad0807'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_You will receive the latest product and d_ad0807'), 
    'You will receive the latest product and discount information.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_Mobile phone (optional)_11bc8c7d-cb5a_a1e949'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_Mobile phone (optional)_11bc8c7d-cb5a_a1e949'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/label_Consent to Receive Certain Text Messa_5ce4cc'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/span_Consent to Receive Certain Text Messag_3845ec'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/span_Consent to Receive Certain Text Messag_3845ec'), 
    'Consent to Receive Certain Text Messages: By signing up for Enfamil text alerts you will receive occasional messages that include information regarding infant and toddler formula. Message and data rates may apply. Text STOP to cancel, HELP for help. By opting-in, you agree to get texts from Enfamil at your mobile number, which may be sent through an automatic telephone dialing system. Your consent to receive such texts is not required for you to obtain any Enfamil products.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_5. Customize your profile for you and your baby'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_5. Customize your profile for you and your baby'), 
    '5. Customize your profile for you and your baby.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_Well provide tips and samples to fit your needs'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_Well provide tips and samples to fit your needs'), 
    'We’ll provide tips and samples to fit your needs.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/label_Babys Due Date or Birth Date'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/label_Babys Due Date or Birth Date'), 
    'Baby\'s Due Date or Birth Date')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_concat(Baby, , s Due Date or Birth Da_fc80e8'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/input_concat(Baby, , s Due Date or Birth Da_fc80e8'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/button_Why'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/button_Why'), 
    'Why?')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/button_Why'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_Relationship to child'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_Relationship to child'), 
    'Relationship to child')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/div_Select one'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/div_Select one'), 
    'Select one')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/div_Select one'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_How are you currently feeding your little_6134cd'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/span_How are you currently feeding your little one'), 
    'How are you currently feeding your little one?')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/span_(optional)'), 
    '(optional)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/div_Select one'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/div_Select one'), 
    'Select one')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/div_Select one'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_Do you expect to receive infant formula f_11fd50'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_Do you expect to receive infant formula f_11fd50'), 
    'Do you expect to receive infant formula from the government-sponsored Special Supplemental Nutrition Program for Women, Infants, and Children (WIC)?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_Your answer helps us personalize your experience'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_Your answer helps us personalize your experience'), 
    'Your answer helps us personalize your experience.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/label_Yes'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/label_Yes'), 
    'Yes')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/label_Yes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/label_No'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/label_No'), 
    'No')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/label_No'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/label_Not sure'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/label_Not sure'), 
    'Not sure')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/label_Not sure'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/button_Submit'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/button_Submit'), 
    'Submit')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_Terms and Conditions'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_Terms and Conditions'), 
    'Terms and Conditions')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_By clicking Submit, I agree to join the N_c705a0'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/p_By clicking Submit, I agree to join the N_c705a0'), 
    'By clicking “Submit”, I agree to join the Nutramigen Savings and Support program and to receive free samples, offers and other communications from the Nutramigen Savings and Support program and receive other information and offers on family-related health and hygiene products and services from Mead Johnson Nutrition’s affiliated companies. I understand that my information will be shared with such affiliates and will be used in accordance with their own privacy policies. By joining, I acknowledge that I have reviewed and agree to the  Terms of Use and Privacy Policy.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/a_Nutramigen'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/a_Nutramigen'), 
    'Nutramigen')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/a_Nutramigen'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/a_Nutramigen_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/a_Nutramigen_1'), 
    'Nutramigen')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/a_Nutramigen_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/a_Terms of Use'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/a_Terms of Use'), 
    'Terms of Use')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/a_Terms of Use'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/a_Privacy Policy'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/a_Privacy Policy'), 
    'Privacy Policy')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Nutramigen Form EN/Page_Nutramigen  Enfamil/a_Privacy Policy'))

WebUI.closeBrowser()

