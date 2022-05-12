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

WebUI.openBrowser('', FailureHandling.OPTIONAL)

WebUI.navigateToUrl(GlobalVariable.STG_Login_Page_URL)

WebUI.maximizeWindow()

WebUI.delay(2)

if (true) {
    WebUI.verifyElementPresent(findTestObject('Cookie floater/Cookies pop up'), 0)

    WebUI.click(findTestObject('Cookie floater/Cookie accept'))
}

WebUI.setText(findTestObject('Login Page/Password_Reset/Sign in Page/input_Email_login-username'), GlobalVariable.EmailUsername)

WebUI.setEncryptedText(findTestObject('Login Page/Password_Reset/Sign in Page/input_Password_login-password'), 'eNBatQnucOQ=')

WebUI.click(findTestObject('Login Page/Password_Reset/Sign in Page/button_Sign in'))

WebUI.delay(2)

WebUI.click(findTestObject('Login Page/Password_Reset/Sign in Page/Have you forgotten your password'))

WebUI.verifyElementPresent(findTestObject('Login Page/Password_Reset/Reset detail Page/Banner text'), 0)

WebUI.back()

WebUI.click(findTestObject('Login Page/Password_Reset/Sign in Page/Forgot your password link'))

WebUI.verifyElementVisible(findTestObject('Login Page/Password_Reset/Reset detail Page/Banner text'))

WebUI.delay(3)

WebUI.click(findTestObject('Login Page/Password_Reset/Reset detail Page/button_Email new password'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Login Page/Password_Reset/Reset detail Page/div_Please enter a valid email address'))

WebUI.setText(findTestObject('Login Page/Password_Reset/Reset detail Page/input_Email address_reset-email'), GlobalVariable.ValidEmail1)

WebUI.click(findTestObject('Login Page/Password_Reset/Reset detail Page/button_Email new password'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Login Page/Password_Reset/Reset detail Page/Invalid User error message'))

WebUI.sendKeys(findTestObject('Login Page/Password_Reset/Reset detail Page/input_Email address_reset-email'), Keys.chord(
        Keys.SHIFT, Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Login Page/Password_Reset/Reset detail Page/input_Email address_reset-email'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Login Page/Password_Reset/Reset detail Page/input_Email address_reset-email'), GlobalVariable.ValidEmail)

WebUI.click(findTestObject('Login Page/Password_Reset/Reset detail Page/button_Email new password'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Login Page/Password_Reset/Reset detail Page/Email Success'), 0)

WebUI.closeBrowser()

