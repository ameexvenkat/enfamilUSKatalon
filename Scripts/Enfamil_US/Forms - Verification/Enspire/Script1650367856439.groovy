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

WebUI.navigateToUrl(GlobalVariable.Enspire)

WebUI.maximizeWindow()

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/span_Enspire Family Beginnings by Enfamil'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/span_Enspire Family Beginnings by Enfamil'), 
    'Enspire Family Beginnings™ by Enfamil®')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/h1_Enspire Family Beginnings by Enfamil'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/h1_Enspire Family Beginnings by Enfamil'), 
    'Enspire Family Beginnings™ by Enfamil®')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_Enjoy special values, free gifts, a dedic_e6dd85'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_Enjoy special values, free gifts, a dedic_e6dd85'), 
    'Enjoy special values, free gifts, a dedicated phone number to reach an Enspire Expert, emails tailored to your baby’s developmental stage and more.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/img_Enspire Family Beginnings Registration__662615'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_PERSONALIZE YOUR EXPERIENCE'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_PERSONALIZE YOUR EXPERIENCE'), 
    'PERSONALIZE YOUR EXPERIENCE')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_1. Tell us your name and email'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_1. Tell us your name and email'), 
    '1. Tell us your name and email.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_First Name_bda32aa6-a964-46d2-b907-bb_101ad6'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_First Name_bda32aa6-a964-46d2-b907-bb_101ad6'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_Last Name_df44e44d-2cc6-4d1c-a220-d50_400c72'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_Last Name_df44e44d-2cc6-4d1c-a220-d50_400c72'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_Email_9e95da2d-15d0-44dd-9b32-eec35c51690d'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_Email_9e95da2d-15d0-44dd-9b32-eec35c51690d'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_2. Enter your address'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_2. Enter your address'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/div_You may receive some gifts closer to yo_321671'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/div_You may receive some gifts closer to yo_321671'), 
    'You may receive some gifts closer to your baby’s due date.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_Street address_d6339477-e514-4e65-ba1_5e745a'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_Street address_d6339477-e514-4e65-ba1_5e745a'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_UnitSuiteApt (optional)_c8d5824c-02e8_6cff11'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_UnitSuiteApt (optional)_c8d5824c-02e8_6cff11'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_City_18fdd373-a4ad-4c45-b8a2-d0a8b43ea8ae'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_City_18fdd373-a4ad-4c45-b8a2-d0a8b43ea8ae'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/div_State'), 
    0)

WebUI.verifyElementText(findTestObject('Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/div_State'), 
    'State')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_Zip code_b3d77e6e-ceea-4dff-908a-1f2d_4ec643'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_Zip code_b3d77e6e-ceea-4dff-908a-1f2d_4ec643'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_3. Set password'), 
    0)

WebUI.verifyElementText(findTestObject('Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_3. Set password'), 
    '3. Set password.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_Password_7dd74fb4-6489-42c8-8964-2cc2_e023cd'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_Password_7dd74fb4-6489-42c8-8964-2cc2_e023cd'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/button_Hide'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/button_Hide'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/div_Password must containAt least 8 charact_619724'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/div_Password must containAt least 8 charact_619724'), 
    'Password must contain:\nAt least 8 characters\nA lowercase letter\nAn uppercase letter\nA number\nA special character\nMust not be your email address')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/span_Password must contain'), 
    'Password must contain:')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/span_At least 8 characters'), 
    'At least 8 characters')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/li_A lowercase letter'), 
    'A lowercase letter')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/span_An uppercase letter'), 
    'An uppercase letter')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/span_A number'), 
    'A number')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/span_A special character'), 
    'A special character')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/span_Must not be your email address'), 
    'Must not be your email address')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_4. Stay up to date with Enspire Family Be_293c8a'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_4. Stay up to date with Enspire Family Be_293c8a'), 
    '4. Stay up to date with Enspire Family Beginnings.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/div_You will receive the latest product and_c60db3'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/div_You will receive the latest product and_c60db3'), 
    'You will receive the latest product and discount information.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_Mobile phone (optional)_eaf6a18d-7532_9ddcd5'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_Mobile phone (optional)_eaf6a18d-7532_9ddcd5_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/label_Consent to Receive Certain Text Messa_5ce4cc'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/span_Consent to Receive Certain Text Messag_3845ec'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/span_Consent to Receive Certain Text Messag_3845ec'), 
    'Consent to Receive Certain Text Messages: By signing up for Enfamil text alerts you will receive occasional messages that include information regarding infant and toddler formula. Message and data rates may apply. Text STOP to cancel, HELP for help. By opting-in you agree to get texts from Enfamil at your mobile number, which may be sent through an automatic telephone dialing system. Your consent to receive such texts is not required for you to obtain any Enfamil products')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_5. Customize your profile for you and your baby'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_5. Customize your profile for you and your baby'), 
    '5. Customize your profile for you and your baby.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/div_Well provide tips and samples to fit yo_5c2778'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/div_Well provide tips and samples to fit yo_5c2778'), 
    'We’ll provide tips and samples to fit your needs.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/label_Babys Due Date or Birth Date'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/label_Babys Due Date or Birth Date'), 
    'Baby\'s Due Date or Birth Date')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_concat(Baby, , s Due Date or Birth Da_e66dc1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/input_concat(Baby, , s Due Date or Birth Da_e66dc1_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/button_Why'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/button_Why'), 
    'Why?')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/button_Why'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_Relationship to child'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_Relationship to child'), 
    'Relationship to child')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/div_Select one'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/div_Select one'), 
    'Select one')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/span_How are you currently feeding your little one'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/span_How are you currently feeding your little one'), 
    'How are you currently feeding your little one?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/span_(optional)'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/span_(optional)'), 
    '(optional)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_Do you expect to receive infant formula f_11fd50'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_Do you expect to receive infant formula f_11fd50'), 
    'Do you expect to receive infant formula from the government-sponsored Special Supplemental Nutrition Program for Women, Infants, and Children (WIC®)?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_Your answer helps us personalize your Ens_02095d'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_Your answer helps us personalize your Ens_02095d'), 
    'Your answer helps us personalize your Enspire Family Beginnings experience.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/label_Yes'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/label_Yes'), 
    'Yes')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/label_No'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/label_No'), 
    'No')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/label_Not sure'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/label_Not sure'), 
    'NotSure')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_Terms and Conditions'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_Terms and Conditions'), 
    'Terms and Conditions')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_By clicking Submit, I agree to join the E_a301af'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/p_By clicking Submit, I agree to join the E_a301af'), 
    'By clicking “Submit”, I agree to join the Enspire Family Beginnings by Enfamil program and to receive free samples, offers and other communications from the Enspire Family Beginnings by Enfamil program and receive other information and offers on family-related health and hygiene products and services from Mead Johnson Nutrition’s affiliated companies. I understand that my information will be shared with such affiliates and will be used in accordance with their own privacy policies. By joining, I acknowledge that I have reviewed and agree to the Terms of Use and Privacy Policy.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/a_Terms of Use'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/a_Terms of Use'), 
    'Terms of Use')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/a_Terms of Use'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/a_Privacy Policy'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/a_Privacy Policy'), 
    'Privacy Policy')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/a_Privacy Policy'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/button_Submit'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/button_Submit'), 
    'Submit')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enspire Form/Page_Enspire Family Beginnings Registration_996fe8/button_Submit'))

WebUI.closeBrowser()

