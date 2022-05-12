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

WebUI.navigateToUrl(GlobalVariable.HomePageSTG_URL)

WebUI.maximizeWindow(FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Login Page/Apple Sign In/Unregistered/Page_Sign in  Enfamil US/h1_Sign In'), 'Sign In')

if (true) {
    WebUI.verifyElementPresent(findTestObject('Cookie floater/Cookies pop up'), 0)

    WebUI.click(findTestObject('Cookie floater/Cookie accept'))
}

WebUI.scrollToElement(findTestObject('Login Page/Apple Sign In/Unregistered/Page_Sign in  Enfamil US/button_Sign In with Apple'), 
    0)

WebUI.click(findTestObject('Login Page/Apple Sign In/Unregistered/Page_Sign in  Enfamil US/button_Sign In with Apple'))

WebUI.setText(findTestObject('Login Page/Apple Sign In/Unregistered/Page_Sign in with AppleID/input_Use your AppleID to sign in to Enfami_56f3da'), 
    GlobalVariable.Apple_User)

WebUI.click(findTestObject('Login Page/Apple Sign In/Unregistered/Page_Sign in with AppleID/button_Continue'))

WebUI.delay(3)

WebUI.setText(findTestObject('Login Page/Apple Sign In/Unregistered/Page_Sign in with AppleID/input_Password_password_text_field'), 
    GlobalVariable.Apple_Pass)

WebUI.click(findTestObject('Login Page/Apple Sign In/Unregistered/Page_Sign in with AppleID/div_Use your AppleID to sign in to Enfamil _0987cb'))

WebUI.click(findTestObject('Login Page/Apple Sign In/Unregistered/Page_Sign in with AppleID/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('Login Page/Apple Sign In/Unregistered/Page_Sign in  Enfamil US/Apple 2 factor authentication'), 
    0)

WebUI.closeBrowser()

