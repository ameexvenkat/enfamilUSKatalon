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

WebUI.navigateToUrl(GlobalVariable.HomePage_URL)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Buttons/Sign In link_Pop up'), 
    0)

if (true) {
    WebUI.verifyElementPresent(findTestObject('Cookie floater/Cookies pop up'), 0)

    WebUI.click(findTestObject('Cookie floater/Cookie accept'))
}

WebUI.click(findTestObject('Buttons/Sign In link_Pop up'))

WebUI.verifyElementPresent(findTestObject('Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Sign In Pop up title'), 
    0)

WebUI.click(findTestObject('Login Pop Up/Sign In with Google/Google button'))

WebUI.switchToWindowTitle('Sign in – Google accounts')

WebUI.setText(findTestObject('Login Page/Google Sign In/Registered/Page_Sign in  Google accounts/Google username'), GlobalVariable.Gmail_Reg_User)

WebUI.click(findTestObject('Login Page/Google Sign In/Registered/Page_Sign in  Google accounts/span_Next'))

WebUI.setText(findTestObject('Login Page/Google Sign In/Registered/Page_Sign in  Google accounts/Google_password'), GlobalVariable.Gmail_Reg_Pass)

WebUI.click(findTestObject('Login Page/Google Sign In/Registered/Page_Sign in  Google accounts/span_Next'))

WebUI.delay(20)

WebUI.switchToDefaultContent(FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Login Pop Up/Sign In with FB/Logged In Homepage'), 0)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Login Page/Facebook Sign In/Registered/Page_/span_My Account'))

WebUI.click(findTestObject('Login Page/Facebook Sign In/Registered/Page_/span_Log out'))

WebUI.waitForElementVisible(findTestObject('Login Pop Up/Sign In with FB/Logged out Header'), 0)

WebUI.closeBrowser()

