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

WebUI.navigateToUrl(GlobalVariable.Login_Account_URL)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Login Page/Facebook Sign In/Unregistered/Page_Sign in  Enfamil US/h1_Sign In'), 
    'Sign  In')

WebUI.delay(2)

if (true) {
    WebUI.verifyElementPresent(findTestObject('Cookie floater/Cookies pop up'), 0)

    WebUI.click(findTestObject('Cookie floater/Cookie accept'))
}

WebUI.scrollToElement(findTestObject('Login Page/Facebook Sign In/Unregistered/Page_Sign in  Enfamil US/button_Continue with Facebook'), 
    0)

WebUI.click(findTestObject('Login Page/Facebook Sign In/Unregistered/Page_Sign in  Enfamil US/button_Continue with Facebook'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Login Page/Facebook Sign In/Unregistered/Page_Facebook/input_Email address or phone number_email'), 
    GlobalVariable.FB_Unreg_User)

WebUI.setText(findTestObject('Login Page/Facebook Sign In/Unregistered/Page_Facebook/input_Password_pass'), GlobalVariable.FB_Unreg_Pass)

WebUI.click(findTestObject('Login Page/Facebook Sign In/Unregistered/Page_Facebook/input_Enfamil Family Beginnings_login'))

if (true) {
    WebUI.verifyElementPresent(findTestObject('Login Page/Facebook Sign In/Unregistered/Page_Log in with Facebook/span_Continue as Enfamil'), 
        0, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Login Page/Facebook Sign In/Unregistered/Page_Log in with Facebook/span_Continue as Enfamil'), 
        FailureHandling.OPTIONAL)
}

WebUI.switchToWindowTitle('Free Baby Formula Samples & Coupons | Enfamil')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Login Page/Facebook Sign In/Unregistered/Page_Free Baby Formula Samples  Coupons  Enfamil/First name_registerGivenNameField'), 
    0)

FirstNameprefilled = WebUI.getAttribute(findTestObject('Login Page/Facebook Sign In/Unregistered/Page_Free Baby Formula Samples  Coupons  Enfamil/First name_registerGivenNameField'), 
    'Value')

WebUI.verifyMatch(FirstNameprefilled, 'Enfamil', false)

LastnamePrefilled = WebUI.getAttribute(findTestObject('Login Page/Facebook Sign In/Unregistered/Page_Free Baby Formula Samples  Coupons  Enfamil/Last name_registerFamilyNameField'), 
    'Value')

WebUI.verifyMatch(LastnamePrefilled, 'Enfamil', false)

EmailPrefilled = WebUI.getAttribute(findTestObject('Login Page/Facebook Sign In/Unregistered/Page_Free Baby Formula Samples  Coupons  Enfamil/Email_registerEmailField'), 
    'Value')

WebUI.verifyMatch(EmailPrefilled, 'enfamil.fbautomation@gmail.com', false)

WebUI.closeBrowser()

