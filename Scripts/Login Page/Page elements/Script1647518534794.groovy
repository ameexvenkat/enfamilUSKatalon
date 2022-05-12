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

WebUI.getWindowTitle(FailureHandling.CONTINUE_ON_FAILURE)

if (true) {
    WebUI.verifyElementPresent(findTestObject('Login Page/LoginPage_ElementsValidation/ul_HomeSign in'), 0)

    WebUI.comment('Breadcrumb is visible')
} else {
    WebUI.verifyElementNotPresent(findTestObject('Login Page/LoginPage_ElementsValidation/ul_HomeSign in'), 0)

    WebUI.comment('Breadcrumb is missing for Sign In page')
}

if (true) {
    WebUI.verifyElementPresent(findTestObject('Login Page/LoginPage_ElementsValidation/Enfamil banner Eyebrow'), 0)

    WebUI.comment('Enfamil Eyebrow present')
} else {
    WebUI.verifyElementNotPresent(findTestObject('Login Page/LoginPage_ElementsValidation/Enfamil banner Eyebrow'), 0)

    WebUI.comment('Banner Eyebrow is missing')
}

if (true) {
    WebUI.verifyElementPresent(findTestObject('Login Page/LoginPage_ElementsValidation/div_ENFAMIL Banner Sign In'), 0)

    WebUI.comment('H1 banner text visible')
} else {
    WebUI.verifyElementNotPresent(findTestObject('Login Page/LoginPage_ElementsValidation/div_ENFAMIL Banner Sign In'), 0)

    WebUI.comment('H1 banner text is missing')
}

if (true) {
    WebUI.verifyElementPresent(findTestObject('Login Page/LoginPage_ElementsValidation/button_Continue with Facebook'), 0)

    WebUI.comment('Facebook Login is available')
} else {
    WebUI.verifyElementNotPresent(findTestObject('Login Page/LoginPage_ElementsValidation/button_Continue with Facebook'), 0)

    WebUI.comment('Facebook Login is missing')
}

if (true) {
    WebUI.verifyElementPresent(findTestObject('Login Page/LoginPage_ElementsValidation/button_Sign in with Google'), 0)

    WebUI.comment('Google Login is available')
} else {
    WebUI.verifyElementNotPresent(findTestObject('Login Page/LoginPage_ElementsValidation/button_Sign in with Google'), 0)

    WebUI.comment('Google Login is missing')
}

if (true) {
    WebUI.verifyElementPresent(findTestObject('Login Page/LoginPage_ElementsValidation/button_Continue with Apple'), 0)

    WebUI.comment('Apple login is available')
} else {
    WebUI.verifyElementNotPresent(findTestObject('Login Page/LoginPage_ElementsValidation/button_Continue with Apple'), 0)

    WebUI.comment('Apple login is missing')
}

if (true) {
    WebUI.verifyElementPresent(findTestObject('Login Page/LoginPage_ElementsValidation/input_Email_login-username'), 0)

    WebUI.comment('Username field is available')
} else {
    WebUI.verifyElementNotPresent(findTestObject('Login Page/LoginPage_ElementsValidation/input_Email_login-username'), 0)

    WebUI.comment('Username field is missing')
}

if (true) {
    WebUI.verifyElementPresent(findTestObject('Login Page/LoginPage_ElementsValidation/input_Password_login-password'), 0)

    WebUI.comment('Password field is available')
} else {
    WebUI.verifyElementNotPresent(findTestObject('Login Page/LoginPage_ElementsValidation/input_Password_login-password'), 0)

    WebUI.comment('Password field is missing')
}

if (true) {
    WebUI.verifyElementPresent(findTestObject('Login Page/LoginPage_ElementsValidation/button_Show Password Eye'), 0)

    WebUI.comment('Show password field is available')
} else {
    WebUI.verifyElementNotPresent(findTestObject('Login Page/LoginPage_ElementsValidation/button_Show Password Eye'), 0)

    WebUI.comment('Show password field is missing')
}

if (true) {
    WebUI.verifyElementPresent(findTestObject('Login Page/LoginPage_ElementsValidation/a_Forgot your password Link'), 0)

    WebUI.comment('Forgot password field is available')
} else {
    WebUI.comment('Forgot password field is missing')
}

if (true) {
    WebUI.verifyElementPresent(findTestObject('Login Page/LoginPage_ElementsValidation/button_Sign in'), 0)

    WebUI.comment('Sign In button is available')
} else {
    WebUI.comment('Sign In button is missing')
}

if (true) {
    WebUI.verifyElementPresent(findTestObject('Login Page/LoginPage_ElementsValidation/div_Short form above footer'), 0)

    WebUI.comment('Short form is available above the footer')
} else {
    WebUI.comment('Short form above the footer is missing')
}

WebUI.closeBrowser()

