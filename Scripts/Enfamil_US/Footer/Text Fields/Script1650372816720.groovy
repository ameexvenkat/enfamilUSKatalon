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

'Open Browser'
WebUI.openBrowser('')

'Navigate to URL'
WebUI.navigateToUrl(GlobalVariable.HomePage)

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Footer/Footer_Elements/button_GOT IT_onetrust-close-btn-handler on_95ce22 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Footer/Footer_Elements/div_Enfamil Family BeginningsJoin for upto _3d5e60'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/p_Enfamil Family Beginnings (1)'), 'ENFAMIL FAMILY BEGINNINGS')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/span_Join for upto 400 in free gifts (1)'), 
    'Join for up to $400 in free gifts.')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/div_Download our app (1)'), 'DOWNLOAD OUR APP')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/p_For savings and personalized tips (1)'), 
    'For savings and personalized tips')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/span_Monday - Friday 8 a.m. to 8 p.m. ESTEDT (1)'), 
    'Monday - Friday: 8 a.m. to 8 p.m. EST/EDT')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/span_Saturday 9 a.m. to 530 p.m. ESTEDT (1)'), 
    'Saturday: 9 a.m. to 5:30 p.m. EST/EDT')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/a_Email us (1)'), 'Email us')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/p_Concact us with any questions or comments (1)'), 
    'Contact us with any questions or comments')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/span_Follow us (1)'), 'FOLLOW US')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/button_Why (1)'), 'Why?')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/a_Browse FAQs (1)'), 'Browse FAQs')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/p_Find helpful advice and answers to parent_0992bb (1)'), 
    'Find helpful advice and answers to parents\' most common questions')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/a_Call us (1-800-BABY123) (1)'), 'Call us (1-800-BABY123)')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/a_Terms of Use (1)'), 'Terms of Use')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/a_Privacy Policy (1)'), 'Privacy Policy')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/a_Sweepstakes Official Rules (1)'), 'Sweepstakes Official Rules.')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/a_For Healthcare professionals (1)'), 'For Healthcare professionals')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/a_California transparency in supply chains _19d4b3 (1)'), 
    'California transparency in supply chains act and modern slavery act')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/a_Do Not Sell My Information (1)'), 'Do Not Sell My Information')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/a_Privacy Policy_1 (1)'), 'Privacy Policy')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/a_Terms of Use_1 (1)'), 'Terms of Use')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/a_Terms of Sale (1)'), 'Terms of Sale')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/button_Cookie Preference (1)'), 'Cookie Preference')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/p_Intended for U.S. Residents Only. 1998, 2_0578d4 (1)'), 
    'Intended for U.S. Residents Only. 1998, 2020, Mead Johnson & Company, LLC. All Rights Reserved')

WebUI.closeBrowser()

