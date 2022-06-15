import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/')

WebUI.waitForElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    3)

WebUI.verifyElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    0)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

WebUI.mouseOver(findTestObject('Nutramigen/Field Validation for invalid data/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Verify hover on Offers and Savings menu'))

WebUI.click(findTestObject('Object Repository/Nutramigen/Field Validation for invalid data/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Nutramigen Savings  Support program'))

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify State placeholder text for dropdown field'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify selecting an option in State field', 
        [('State') : State_Select_Value]))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/')

WebUI.waitForElementPresent(findTestObject('Object Repository/Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    0)

WebUI.click(findTestObject('Object Repository/Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

WebUI.mouseOver(findTestObject('Object Repository/Profile/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Verify hover on Offers and Savings menu'))

WebUI.click(findTestObject('Object Repository/Profile/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Nutramigen Savings  Support program'))

WebUI.click(findTestObject('Object Repository/Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify State placeholder text for dropdown field'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify selecting an option in State field'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/')

WebUI.click(findTestObject('Object Repository/Profile/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.click(findTestObject('Object Repository/Profile/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Profile/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Email_login-username'), 
    'mithun.uat2007_enroll01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Password_login-password'), 
    'sylscs9IFn581xiy1uDosg==')

WebUI.click(findTestObject('Object Repository/Profile/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Sign in (1)'))

WebUI.click(findTestObject('Object Repository/Profile/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_My Profile'))

WebUI.click(findTestObject('Object Repository/Profile/Page_My Profile  Enfamil US/div_My Subscriptions'))

WebUI.click(findTestObject('Object Repository/Profile/Page_My Profile  Enfamil US/label_Enspire Family Beginnings - From preg_c5acb5'))

WebUI.click(findTestObject('Object Repository/Profile/Page_My Profile  Enfamil US/label_Enfamil Family Beginnings- From pregn_44be5c'))

