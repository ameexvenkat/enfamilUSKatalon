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

WebUI.navigateToUrl(GlobalVariable.ContactUs)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Form Verification/Page_/h2_Contact Us'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/span_Contact Us'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/h2_Contact Us'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/h3_Thank you for your interest in the Enfam_7b10da'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Page_/h3_Thank you for your interest in the Enfam_7b10da'), 
    'Thank you for your interest in the Enfamil Family of Formulas™.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/span_If you have a question about our produ_57c769'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Page_/span_If you have a question about our produ_57c769'), 
    'If you have a question about our products, company or services, please check out our Help Center or Store locator.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/p_If you still havent found what you are lo_8b6a86'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Page_/p_If you still havent found what you are lo_8b6a86'), 
    'If you still haven\'t found what you are looking for or have a comment about our products or company services, please fill out this form. For an immediate response, please call 1-800-BABY123.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/p_If you have any questions about Mead John_48fc50'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Page_/p_If you have any questions about Mead John_48fc50'), 
    'If you have any questions about Mead Johnson products sold outside the U.S., please go to meadjohnson.com.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/p_Required fields'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Page_/p_Required fields'), '*Required fields')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/label_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/label_Confirm Email'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/label_First Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/label_Last Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/label_Subject'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/button_Submit'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/a_Help Center'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/a_Store locator'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/a_meadjohnson.com'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/input_Email_76f67e59-fbad-4da9-8a9c-f5c7dd24d4e5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/input_Confirm Email_18b9f37b-8bb2-4d85-bf8f_ce5dfe'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/input_First Name_b98ca522-d1e2-4c26-91d5-8b_c1fb3d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/input_Last Name_e92bd6d4-db43-4465-8dce-cd4_49093a'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/div_Subject'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Page_/div_SubjectSubjectChoose a subject'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Page_/button_Submit'), 'Submit')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Page_/label_Subject'), '*Subject')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Page_/label_First Name'), '*First Name')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Page_/label_Last Name'), '*Last Name')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Page_/label_Confirm Email'), '*Confirm Email')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Page_/label_Email'), '*Email')

WebUI.click(findTestObject('Object Repository/Form Verification/Page_/span_Home'))

WebUI.delay(10)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Enfamil Newborn, Infant & Toddler Nutrition │ Enfamil', false)

WebUI.closeBrowser()

