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

WebUI.click(findTestObject('Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Sign in'))

WebUI.verifyElementText(findTestObject('Object Repository/Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Email field is required'), 
    'Email field is required')

WebUI.verifyElementText(findTestObject('Object Repository/Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Password field is required'), 
    'Password field is required')

WebUI.setText(findTestObject('Object Repository/Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Email_login-username'), 
    GlobalVariable.EmailUsername)

WebUI.setText(findTestObject('Object Repository/Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Password_login-password'), 
    GlobalVariable.EmailPassword)

WebUI.click(findTestObject('Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Sign in'))

WebUI.waitForElementPresent(findTestObject('Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Incorrect account_pasword_error'), 
    0)

WebUI.verifyElementText(findTestObject('Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Incorrect account_pasword_error'), 
    'Sorry, unrecognized username or password. Have you forgotten your password?')

WebUI.sendKeys(findTestObject('Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Email_login-username'), 
    Keys.chord(Keys.SHIFT, Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Email_login-username'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Email_login-username'), 
    GlobalVariable.ValidEmail1)

WebUI.sendKeys(findTestObject('Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Password_login-password'), 
    Keys.chord(Keys.SHIFT, Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Password_login-password'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Password_login-password'), 
    GlobalVariable.InvalidPassword)

WebUI.click(findTestObject('Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Sign in'))

WebUI.verifyElementText(findTestObject('Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Incorrect account_pasword_error'), 
    'Sorry, unrecognized username or password. Have you forgotten your password?')

WebUI.click(findTestObject('Object Repository/Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Join now'))

WebUI.waitForElementVisible(findTestObject('Login Pop Up/Sign In with Email/Page_Free Baby Formula Samples  Coupons  Enfamil/Join now header'), 
    0)

WebUI.delay(2)

WebUI.click(findTestObject('Buttons/Sign In link_Pop up'))

WebUI.setText(findTestObject('Object Repository/Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Email_login-username'), 
    GlobalVariable.ValidEmail)

WebUI.setText(findTestObject('Object Repository/Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Password_login-password'), 
    GlobalVariable.ValidPassword)

WebUI.click(findTestObject('Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Sign in'))

WebUI.waitForElementVisible(findTestObject('Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Logged in H1 header'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_My Account'))

WebUI.click(findTestObject('Object Repository/Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Log out'))

WebUI.waitForElementVisible(findTestObject('Login Pop Up/Sign In with Email/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Logged out header'), 
    0)

WebUI.closeBrowser()

