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

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/')

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Footer/Footer_Elements/Button_GotIt_Cookie'))

WebUI.scrollToElement(findTestObject('Object Repository/Footer/Footer_Elements/div_Enfamil Family BeginningsJoin for upto _3d5e60'), 
    0)

css_color = WebUI.getCSSValue(findTestObject('New Folder/Page_Enfamil Newborn, Infant  Toddler Nutrition  Enfamil/section_Enfamil Family'), 
    'background-color')

println(css_color)

WebUI.verifyEqual(css_color, 'rgba(0, 37, 122, 1)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/div_Enfamil Family BeginningsJoin for upto _3d5e60'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/div_For Healthcare professionalsEnfamil Who_57071c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/p_Enfamil Family Beginnings'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/img'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/span_Join for upto 400 in free gifts'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/div_Enfamil Family BeginningsJoin for upto _946d4c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/input_First name_registerGivenNameField_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/input_Last name_registerFamilyNameField_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/input_Email_registerEmailField_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/input_Due date or birth date_childregisterC_87b480'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/button_Why'), 0)

WebUI.click(findTestObject('Object Repository/Footer/Footer_Elements/button_Why'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Footer_Elements/div_By sharing your little ones tentative b_d4444d'), 
    'By sharing your little one\'s tentative birth date, we can give you personalized updates about your pregnancy, including insights about your baby\'s development, tips, advice and more.')

WebUI.click(findTestObject('Object Repository/Footer/Footer_Elements/button_Close'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/button_Join now'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/p_By clicking Join Now and Enter Sweepstake_0b0cd5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_Terms of Use'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_Privacy Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_Sweepstakes Official Rules'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/div_Download our app'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/p_For savings and personalized tips'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/img_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/span_Follow us'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/i_Follow us_social-links__icon social-links_198a1c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/i_Instagram_social-links__icon social-links_65b7e6'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/i_Facebook_social-links__icon social-links__10ed12'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/i_Twitter_social-links__icon social-links___7ff13c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_Chat with us'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/p_Monday - Friday 8 a.m. to 8 p.m. ESTEDTSa_9fe19b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/span_Monday - Friday 8 a.m. to 8 p.m. ESTEDT'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/span_Saturday 9 a.m. to 530 p.m. ESTEDT'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_Email us'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/img_1_2_3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/p_Concact us with any questions or comments'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_Browse FAQs'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/img_1_2_3_4'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/p_Find helpful advice and answers to parent_0992bb'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_Call us (1-800-BABY123)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/img_1_2_3_4_5'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_WhatsApp'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/img_1_2_3_4_5_6'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/p_Monday - Friday 8 a.m. to 8 p.m. ESTEDT S_45a1e5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/img_1_2_3_4_5_6_7'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_For Healthcare professionals'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_Enfamil Wholesale'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_California transparency in supply chains _19d4b3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_Do Not Sell My Information'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_Privacy Policy_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_Terms of Use_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/a_Terms of Sale'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/button_Cookie Preference'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Footer_Elements/p_Intended for U.S. Residents Only. 1998, 2_0578d4'), 
    0)

WebUI.closeBrowser()

