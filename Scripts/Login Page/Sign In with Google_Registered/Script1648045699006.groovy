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

WebUI.navigateToUrl(GlobalVariable.HomePage)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Login Page/Google Sign In/Registered/Page_Sign in  Enfamil US/h1_Sign In'), 'Sign  In')

if (true) {
    WebUI.verifyElementPresent(findTestObject('Cookie floater/Cookies pop up'), 0)

    WebUI.click(findTestObject('Cookie floater/Cookie accept'))
}

WebUI.scrollToElement(findTestObject('Login Page/Google Sign In/Registered/Page_Sign in  Enfamil US/button_Sign in with Google'), 
    0)

WebUI.click(findTestObject('Login Page/Google Sign In/Registered/Page_Sign in  Enfamil US/button_Sign in with Google'))

WebUI.switchToWindowTitle('Sign in – Google accounts')

WebUI.setText(findTestObject('Login Page/Google Sign In/Registered/Page_Sign in  Google accounts/Google username'), GlobalVariable.Gmail_Reg_User)

WebUI.click(findTestObject('Login Page/Google Sign In/Registered/Page_Sign in  Google accounts/span_Next'))

WebUI.setText(findTestObject('Login Page/Google Sign In/Registered/Page_Sign in  Google accounts/Google_password'), GlobalVariable.Gmail_Reg_Pass)

WebUI.click(findTestObject('Login Page/Google Sign In/Registered/Page_Sign in  Google accounts/span_Next'))

WebUI.delay(20)

WebUI.switchToDefaultContent(FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Login Page/Google Sign In/Registered/Page_/h2_My Account'), 0)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Buttons/My Account'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Buttons/span_Log out'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Login Page/Google Sign In/Registered/Page_Sign in  Enfamil US/h1_Sign In'), 'Sign  In')

WebUI.closeBrowser()

