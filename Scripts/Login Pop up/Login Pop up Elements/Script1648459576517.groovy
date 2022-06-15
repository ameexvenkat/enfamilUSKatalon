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

//WebUI.verifyElementPresent(findTestObject('Login Pop Up/Pop Up Elements Validation/Shop Products'), 0)

if (true) {
    WebUI.verifyElementPresent(findTestObject('Cookie floater/Cookies pop up'), 0)

    WebUI.click(findTestObject('Cookie floater/Cookie accept'))
}

WebUI.click(findTestObject('Login Pop Up/Pop Up Elements Validation/Sign In Link'))

WebUI.waitForElementPresent(findTestObject('Login Pop Up/Pop Up Elements Validation/h2_Sign In to Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementPresent(findTestObject('Login Pop Up/Pop Up Elements Validation/button_Close'), 0)

WebUI.verifyElementPresent(findTestObject('Login Pop Up/Pop Up Elements Validation/input_Email_login-username'), 0)

WebUI.verifyElementPresent(findTestObject('Login Pop Up/Pop Up Elements Validation/input_Password_login-password'), 0)

WebUI.verifyElementPresent(findTestObject('Login Pop Up/Pop Up Elements Validation/a_Forgot your password Click here'), 
    0)

WebUI.verifyElementPresent(findTestObject('Login Pop Up/Pop Up Elements Validation/Sign in Button'), 0)

WebUI.verifyElementPresent(findTestObject('Login Pop Up/Pop Up Elements Validation/button_Continue with Facebook'), 0)

WebUI.verifyElementPresent(findTestObject('Login Pop Up/Pop Up Elements Validation/button_Sign in with Google'), 0)

WebUI.verifyElementPresent(findTestObject('Login Pop Up/Pop Up Elements Validation/button_Sign in with Apple'), 0)

WebUI.verifyElementPresent(findTestObject('Login Pop Up/Pop Up Elements Validation/Join now title'), 
    0)

WebUI.verifyElementPresent(findTestObject('Login Pop Up/Pop Up Elements Validation/Join now Button'), 0)

WebUI.click(findTestObject('Login Pop Up/Pop Up Elements Validation/button_Close'))

WebUI.closeBrowser()

