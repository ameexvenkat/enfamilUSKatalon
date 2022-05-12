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

WebUI.navigateToUrl(GlobalVariable.STG_Login_Page_URL)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Login Page/Google Sign In/Unregistered/Page_Sign in  Enfamil US/h1_Sign In'), 'Sign  In')

WebUI.delay(2)

if (true) {
    WebUI.verifyElementPresent(findTestObject('Cookie floater/Cookies pop up'), 0)

    WebUI.click(findTestObject('Cookie floater/Cookie accept'))
}

WebUI.scrollToElement(findTestObject('Login Page/Google Sign In/Unregistered/Page_Sign in  Enfamil US/button_Sign in with Google'), 
    0)

WebUI.click(findTestObject('Login Page/Google Sign In/Unregistered/Page_Sign in  Enfamil US/button_Sign in with Google'))

WebUI.switchToWindowTitle('Sign in – Google accounts')

WebUI.setText(findTestObject('Login Page/Google Sign In/Unregistered/Page_Sign in  Google accounts/Gmail_Username'), GlobalVariable.Gmail_Unreg_User)

WebUI.click(findTestObject('Login Page/Google Sign In/Unregistered/Page_Sign in  Google accounts/span_Next'))

WebUI.setText(findTestObject('Login Page/Google Sign In/Unregistered/Page_Sign in  Google accounts/Gmail_Password'), GlobalVariable.Gmail_Unreg_Pass)

WebUI.click(findTestObject('Login Page/Google Sign In/Unregistered/Page_Sign in  Google accounts/span_Next'))

WebUI.switchToWindowTitle('Free Baby Formula Samples & Coupons | Enfamil')

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Login Page/Google Sign In/Unregistered/Page_Free Baby Formula Samples  Coupons  Enfamil/Homepage Eyebrow'), 
    0)

WebUI.scrollToElement(findTestObject('Login Page/Google Sign In/Unregistered/Page_Free Baby Formula Samples  Coupons  Enfamil/Google_FirstName'), 
    0)

GoogleFirstName = WebUI.getAttribute(findTestObject('Login Page/Google Sign In/Unregistered/Page_Free Baby Formula Samples  Coupons  Enfamil/Google_FirstName'), 
    'Value')

WebUI.verifyMatch(GoogleFirstName, 'Enfamil', false)

GoogleLastName = WebUI.getAttribute(findTestObject('Login Page/Google Sign In/Unregistered/Page_Free Baby Formula Samples  Coupons  Enfamil/Google_Last name'), 
    'Value')

WebUI.verifyMatch(GoogleLastName, 'Reggoogle', false)

GoogleEmail = WebUI.getAttribute(findTestObject('Login Page/Google Sign In/Unregistered/Page_Free Baby Formula Samples  Coupons  Enfamil/Google_Email Field'), 
    'Value')

WebUI.verifyMatch(GoogleEmail, 'enfamil.reggg@gmail.com', false)

WebUI.closeBrowser()

