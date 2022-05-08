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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/')

WebUI.delay(10)

WebUI.click(findTestObject('Login/Page_Enfamil Newborn, Infant  Toddler Nutrition  Enfamil/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Email_login-username'), 
    Email)

WebUI.setText(findTestObject('Object Repository/Login/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Password_login-password'), 
    Password)

WebUI.click(findTestObject('Object Repository/Login/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Password_password-field__visibility-button'))

WebUI.click(findTestObject('Object Repository/Login/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Sign In'))

WebUI.delay(20)

WebUI.mouseOver(findTestObject('Object Repository/Login/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/li_My AccountWelcome back, raghavanMy Profi_559013'))

WebUI.click(findTestObject('Object Repository/Login/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Log out'))

WebUI.delay(20)

WebUI.closeBrowser()

