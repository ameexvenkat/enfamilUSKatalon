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

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Footer/Footer_Elements/button_GOT IT_onetrust-close-btn-handler on_95ce22 (2) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Footer/Footer_Elements/button_Join now (1) (1)'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/button_Join now (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/i_Follow us_social-links__icon social-links_198a1c (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/i_Instagram_social-links__icon social-links_65b7e6 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/i_Facebook_social-links__icon social-links__10ed12 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/i_Twitter_social-links__icon social-links___7ff13c (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_Chat with us (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_Email us (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_Browse FAQs (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_Call us (1-800-BABY123) (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_WhatsApp (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_For Healthcare professionals (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_Enfamil Wholesale (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_California transparency in supply chains _19d4b3 (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_Do Not Sell My Information (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_Privacy Policy (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_Terms of Use (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_Terms of Sale (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/button_Cookie Preference (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_Terms of Use_1 (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_Privacy Policy_1 (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Footer_Elements/a_Sweepstakes Official Rules (2) (1)'))

WebUI.scrollToElement(findTestObject('Footer/Footer_Elements/div_Download our app'), 0)

WebUI.click(findTestObject('Object Repository/Footer/Footer_Elements/img (1) (1)'))

WebUI.switchToWindowTitle('Enfamil Family Beginnings® on the App Store')

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_Enfamil Family Beginnings on the AppStore/picture_ember3, ember3before           widt_0f0213'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer/Page_Enfamil Family Beginnings on the AppStore/span_App Store'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_Enfamil Family Beginnings on the AppStore/span_App Store'), 
    0)

WebUI.switchToWindowTitle('Enfamil Newborn, Infant & Toddler Nutrition │ Enfamil')

WebUI.click(findTestObject('Object Repository/Footer/Footer_Elements/img_1 (1) (1)'))

WebUI.switchToWindowTitle('Enfamil Family Beginnings® - Apps on Google Play')

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_Enfamil Family Beginnings - Apps on Go_66e846/span_Enfamil Family Beginnings'), 
    0)

WebUI.switchToWindowTitle('Enfamil Newborn, Infant & Toddler Nutrition │ Enfamil')

WebUI.click(findTestObject('Object Repository/Footer/Footer_Elements/i_Follow us_social-links__icon social-links_198a1c (1) (1)'))

WebUI.switchToWindowTitle('Enfamil™ 🍼 (@enfamil) • Instagram photos and videos')

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Enfamil™ 🍼 (@enfamil) • Instagram photos and videos', false)

WebUI.switchToWindowTitle('Enfamil Newborn, Infant & Toddler Nutrition │ Enfamil')

WebUI.click(findTestObject('Object Repository/Footer/Footer_Elements/i_Instagram_social-links__icon social-links_65b7e6 (1) (1)'))

WebUI.switchToWindowTitle('Enfamil - Home | Facebook')

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Enfamil - Home | Facebook', false)

WebUI.switchToWindowTitle('Enfamil Newborn, Infant & Toddler Nutrition │ Enfamil')

WebUI.click(findTestObject('Object Repository/Footer/Footer_Elements/i_Facebook_social-links__icon social-links__10ed12 (1) (1)'))

WebUI.switchToWindowTitle('Enfamil (@Enfamil) / Twitter')

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_Enfamil (Enfamil)  Twitter/span_Enfamil'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_Enfamil (Enfamil)  Twitter/div_Enfamil'), 0)

WebUI.switchToWindowTitle('Enfamil Newborn, Infant & Toddler Nutrition │ Enfamil')

WebUI.click(findTestObject('Object Repository/Footer/Footer_Elements/i_Twitter_social-links__icon social-links___7ff13c (1) (1)'))

WebUI.switchToWindowTitle('Enfamil US - YouTube')

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_Enfamil US - YouTube/yt-formatted-string_Enfamil US (1)'), 
    0)

WebUI.switchToWindowTitle('Enfamil Newborn, Infant & Toddler Nutrition │ Enfamil')

WebUI.click(findTestObject('Object Repository/Footer/Footer_Elements/a_Terms of Use_1 (2) (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_/span_Terms and conditions'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_/span_Terms and conditions'), 'Terms and conditions')

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Privacy Policy'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_/span_Privacy Policy (1)'), 'Privacy Policy (1)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_/ul_HomePrivacy Policy (1)'), 0)

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Sweepstakes Official Rules'))

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Sweepstakes Official Rules'))

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Chat with us'))

WebUI.delay(8)

WebUI.verifyElementVisible(findTestObject('Object Repository/Footer/Page_/a_Contact us'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Email us'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Footer/Page_/h2_Contact Us'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_/h2_Contact Us'), 0)

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Browse FAQs'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Footer/Page_/span_Help Center  FAQ'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_/span_Help Center  FAQ'), 0)

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_For Healthcare professionals'))

WebUI.switchToWindowTitle('Mead Johnson Healthcare Professional Resource Center')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Mead Johnson Healthcare Professional R_486903/p_This site is for healthcare professionals only'), 
    'This site is for healthcare professionals only')

WebUI.click(findTestObject('Object Repository/Footer/Page_Mead Johnson Healthcare Professional R_486903/img_For Consumers_close-icon modal-focus-tabindex'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Mead Johnson Healthcare Professional R_486903/p_FOR HEALTHCARE PROFESSIONALS'), 
    'FOR HEALTHCARE PROFESSIONALS')

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_Mead Johnson Healthcare Professional R_486903/p_Intended for U.S. Healthcare Professional_b04798'), 
    0)

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Enfamil Wholesale'))

WebUI.switchToWindowTitle('Enfamil')

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_Enfamil/img'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Enfamil/a_Apply for wholesale'), 'Apply for wholesale')

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_Enfamil/a_Apply for wholesale'), 0)

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_California transparency in supply chains _19d4b3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_/span_California transparency in supply chai_d4e5f5'), 
    0)

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Do Not Sell My Information'))

WebUI.switchToWindowTitle('Privacy Web Form')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Privacy Web Form/u_We do not sell consumer information to th_51c14f'), 
    'We do not sell any of your personal information for money to any third parties. ')

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_Privacy Web Form/u_We do not sell consumer information to th_51c14f'), 
    0)

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Privacy Policy_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_/span_Privacy Policy'), 'Privacy Policy')

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Terms of Use'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_/span_Terms of Use'), 0)

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Terms of Sale'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_/span_Terms of Sale'), 0)

WebUI.click(findTestObject('Object Repository/Footer/Page_/button_Cookie Preference'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_/button_Confirm My Choices'), 0)

WebUI.click(findTestObject('Object Repository/Footer/Page_/button_Cookie Preference_close-pc-btn-handler'))

WebUI.closeBrowser()

