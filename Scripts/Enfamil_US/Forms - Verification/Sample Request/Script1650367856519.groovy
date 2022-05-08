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

WebUI.navigateToUrl(GlobalVariable.SampleRequest)

WebUI.maximizeWindow()

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/span_Free Sample of Enfagrow Toddler Formula'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/span_Free Sample of Enfagrow Toddler Formula'), 
    'Free Sample of Enfagrow® Toddler Formula')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/h1_Free Sample of Enfagrow Toddler Formula'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/h1_Free Sample of Enfagrow Toddler Formula'), 
    'Free Sample of Enfagrow® Toddler Formula')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_Take just a moment to sign up, and youll _95b8ff'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_Take just a moment to sign up, and youll _95b8ff'), 
    'Take just a moment to sign up, and you’ll receive your free sample of Enfagrow PREMIUM™ Toddler Nutritional Drink in a matter of weeks.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_Request Your Sample'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_Request Your Sample'), 
    'REQUEST YOUR SAMPLE')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_1. Tell us your name and email'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_1. Tell us your name and email'), 
    '1. Tell us your name and email.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_First Name_registerGivenNameField_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_Last Name_registerFamilyNameField_1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_Last Name_registerFamilyNameField_1_2_3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_First Name_registerGivenNameField_1_2_3_4_5'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_Email_registerEmailField_1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_Email_registerEmailField_1_2_3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_2. Enter your address'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_2. Enter your address'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_Street Address_address1registerAddres_1a6c90_1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_Street Address_address1registerAddres_1a6c90_1_2_3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_UnitSuiteApt_address1registerAddressA_f19009_1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_UnitSuiteApt_address1registerAddressA_f19009_1_2_3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_City_address1registerAddressCityField_1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_City_address1registerAddressCityField_1_2_3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/div_State'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/div_State'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_Zip Code_address1registerAddressPostalField_1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_Zip Code_address1registerAddressPostalField_1_2_3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_3. Customize your profile for you and you_e5d350'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_3. Customize your profile for you and you_e5d350'), 
    '3. Customize your profile for you and your toddler.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/div_Well provide tips and samples to fit yo_5c2778'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/div_Well provide tips and samples to fit yo_5c2778'), 
    'We’ll provide tips and samples to fit your needs.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/label_Your Childs Birth Date'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/label_Your Childs Birth Date'), 
    'Your Child\'s Birth Date')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_concat(Your Child, , s Birth Date)_ch_19b355'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/input_concat(Your Child, , s Birth Date)_ch_19b355_1'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/button_Why'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/button_Why'), 
    'Why?')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/button_Why'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/button_Get my sample'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/button_Get my sample'), 
    'Get my sample')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/button_Get my sample'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_Try this free toddler sample, and see how_91cd85'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_Try this free toddler sample, and see how_91cd85'), 
    'Try this free toddler sample, and see how easy it can be to get your toddler nutrients that can help nourish their growing brain.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_Mead Johnson  Company does not sell your _894a07'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_Mead Johnson  Company does not sell your _894a07'), 
    'Mead Johnson & Company does not sell your information to outside agencies. The Enfamil Family Beginnings® program only uses your information to send you FREE gifts, discounts and baby information. You can unsubscribe from Enfamil Family beginnings® at any time. Please see our privacy policy for details.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_Enfamil Family Beginnings'), 
    'Enfamil Family Beginnings')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_Enfamil Family Beginnings'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_privacy policy'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_privacy policy'), 
    'privacy policy')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_privacy policy'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_This program is intended for U.S. residen_973301'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_This program is intended for U.S. residen_973301'), 
    'This program is intended for U.S. residents. If you are a resident of Canada. please enroll in the Canadian Enfamil Family Beginnings program. The Enfamil Family Beginnings program is brought to you by Mead Johnson Nutrition. Enfamil Family Beginnings benefits may vary. Offer limited to one per household and subject to change without notice.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_Canadian Enfamil Family Beginnings program'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_Canadian Enfamil Family Beginnings program'), 
    'Canadian Enfamil Family Beginnings program.')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_Canadian Enfamil Family Beginnings program'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_Enfamil Family Beginnings_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_Enfamil Family Beginnings_1'), 
    'Enfamil Family Beginnings')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_Enfamil Family Beginnings_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_Every motherhood journey is unique, so yo_f1a301'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/p_Every motherhood journey is unique, so yo_f1a301'), 
    '††Every motherhood journey is unique, so your Enfamil Family Beginnings experience is tailored to the information you provide and may vary from what another mom might experience. If you have questions about the program or would like more detail, our Family of Experts can help at 1-800-BABY123 between 7 a.m. to 7 p.m. CST M-F; 8 a.m. to 4:30 p.m. Sat.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_Enfamil Family Beginnings_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_Enfamil Family Beginnings_1'), 
    'Enfamil Family Beginnings')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Sample Request Form/Page_Toddler Sample Request  Enfamil/a_Enfamil Family Beginnings_1'))

WebUI.closeBrowser()

