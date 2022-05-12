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

WebUI.verifyElementPresent(findTestObject('Login Page/Login_Page_functions_check/Sign in'), 0)

if (true) {
    WebUI.verifyElementPresent(findTestObject('Cookie floater/Cookies pop up'), 0)

    WebUI.click(findTestObject('Cookie floater/Cookie accept'))
}

WebUI.getWindowTitle()

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Login Page/Login_Page_functions_check/button_Sign in'), 0)

WebUI.click(findTestObject('Login Page/Login_Page_functions_check/button_Sign in'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Login Page/Login_Page_functions_check/div_Email field is required'), 'Email field is required')

WebUI.verifyElementText(findTestObject('Login Page/Login_Page_functions_check/div_Password field is required'), 'Password field is required')

WebUI.comment('Empty email and Password submission is verified')

WebUI.setText(findTestObject('Login Page/Login_Page_functions_check/input_Email_login-username'), GlobalVariable.EmailUsername)

WebUI.setText(findTestObject('Login Page/Login_Page_functions_check/input_Password_login-password'), GlobalVariable.EmailPassword)

WebUI.click(findTestObject('Login Page/Login_Page_functions_check/button_Sign in'))

WebUI.verifyElementText(findTestObject('Login Page/Login_Page_functions_check/Sorry, unrecognized username or password'), 
    'Email address and/or password not correct. Have you forgotten your password?')

WebUI.comment('Unregistered email submission is verified')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Login Page/Login_Page_functions_check/input_Email_login-username'), Keys.chord(Keys.SHIFT, 
        Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Login Page/Login_Page_functions_check/input_Email_login-username'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Login Page/Login_Page_functions_check/input_Email_login-username'), GlobalVariable.ValidEmail1)

WebUI.sendKeys(findTestObject('Login Page/Login_Page_functions_check/input_Password_login-password'), Keys.chord(Keys.SHIFT, 
        Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Login Page/Login_Page_functions_check/input_Password_login-password'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Login Page/Login_Page_functions_check/input_Password_login-password'), GlobalVariable.InvalidPassword)

WebUI.click(findTestObject('Login Page/Login_Page_functions_check/button_Sign in'))

WebUI.verifyElementText(findTestObject('Login Page/Login_Page_functions_check/Sorry, unrecognized username or password'), 
    'Email address and/or password not correct. Have you forgotten your password?')

WebUI.comment('Valid email and Invalid password submission is verified')

WebUI.sendKeys(findTestObject('Login Page/Login_Page_functions_check/input_Email_login-username'), Keys.chord(Keys.SHIFT, 
        Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Login Page/Login_Page_functions_check/input_Email_login-username'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Login Page/Login_Page_functions_check/input_Email_login-username'), GlobalVariable.ValidEmail)

WebUI.sendKeys(findTestObject('Login Page/Login_Page_functions_check/input_Password_login-password'), Keys.chord(Keys.SHIFT, 
        Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Login Page/Login_Page_functions_check/input_Password_login-password'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Login Page/Login_Page_functions_check/input_Password_login-password'), GlobalVariable.ValidPassword)

WebUI.click(findTestObject('Login Page/Login_Page_functions_check/Password-field__visibility-button'))

WebUI.delay(2)

WebUI.comment('Password EYE icon function verified')

WebUI.delay(2)

WebUI.click(findTestObject('Login Page/Login_Page_functions_check/button_Sign in'))

WebUI.verifyElementPresent(findTestObject('Login Page/Login_Page_functions_check/LoggedIn_Page_Validation/h2_My Account'), 
    0)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Login Page/Login_Page_functions_check/LoggedIn_Page_Validation/My Account'))

WebUI.delay(1)

WebUI.click(findTestObject('Login Page/Login_Page_functions_check/LoggedIn_Page_Validation/span_Log out'))

WebUI.waitForElementVisible(findTestObject('Login Page/Login_Page_functions_check/Sign in'), 0)

WebUI.closeBrowser()

