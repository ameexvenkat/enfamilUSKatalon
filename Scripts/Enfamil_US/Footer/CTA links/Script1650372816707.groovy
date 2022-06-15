import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

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

WebUI.switchToWindowUrl('https://apps.apple.com/us/app/enfamil-family-beginnings/id1445688776')

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

switch (true) {
    case true:
        WebUI.switchToWindowTitle('Enfamil™ 🍼 (@enfamil) • Instagram photos and videos', FailureHandling.OPTIONAL)

        break
    default:
        WebUI.switchToWindowTitle('Log in • Instagram', FailureHandling.OPTIONAL)

        break
}

title = WebUI.getWindowTitle()

switch (true) {
    case true:
        WebUI.verifyMatch(title, 'Enfamil™ 🍼 (@enfamil) • Instagram photos and videos', false, FailureHandling.OPTIONAL)

        break
    default:
        WebUI.verifyMatch(title, 'Log in • Instagram', false, FailureHandling.OPTIONAL)

        break
}

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

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_/span_Terms and conditions'), 'Terms of Use')

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Sweepstakes Official Rules'))

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Chat with us'))

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

WebUI.switchToWindowUrl(GlobalVariable.HelpCenter)

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_California transparency in supply chains _19d4b3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_/span_California transparency in supply chai_d4e5f5'), 
    0)

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Do Not Sell My Information'))

WebUI.switchToWindowTitle('Privacy Web Form')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Privacy Web Form/u_We do not sell consumer information to th_51c14f'), 
    'We do not sell any of your personal information for money to any third parties. ')

WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/Page_Privacy Web Form/u_We do not sell consumer information to th_51c14f'), 
    0)

WebUI.switchToWindowUrl(GlobalVariable.California)

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

