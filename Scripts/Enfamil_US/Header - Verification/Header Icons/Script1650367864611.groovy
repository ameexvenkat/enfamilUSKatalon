import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.HomePage)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Show contact page (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Show contact page (1)'), 
    0)

//WebUI.click(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Show contact page (1)'))
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Show contact page (1)'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Call us (1-800-BABY123)'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/h4_How can we help'), 
    'How can we help?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/h4_How can we help'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Call us (1-800-BABY123)'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Call us (1-800-BABY123)'), 
    'Call us (1-800-BABY123)')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Chat with us'), 
    'Chat with us')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Chat with us'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/img (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/img_1 (1)'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Email us'), 
    'Email us')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Email us'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/strong_Updates Regarding COVID-19'), 
    'Updates Regarding COVID-19')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Browse FAQs'), 
    'Browse FAQs')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/strong_Updates Regarding COVID-19'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Browse FAQs'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/p_Monday - Friday 8 a.m. to 8 p.m. ESTEDT S_45a1e5'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/p_Contact us with any questions or comments'), 
    'Contact us with any questions or comments')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/p_Prioritizing the health  safety of all babies'), 
    'Prioritizing the health & safety of all babies')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/p_Prioritizing the health  safety of all babies'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/p_Find helpful advice and answers to parent_0992bb'), 
    'Find helpful advice and answers to parent\'s most common questions')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/p_Find helpful advice and answers to parent_0992bb'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Call us (1-800-BABY123)'))

WebUI.click(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Chat with us'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/div_Contact Us'), 'Contact Us')

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('Header/Page_/button_Show contact page'), 0)

WebElement element0 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Show contact page (1)'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element0))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Email us'))

WebUI.switchToWindowUrl(GlobalVariable.ContactUs)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h2_Contact Us'), 0)

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('Header/Page_/button_Show contact page'), 0)

WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Show contact page (1)'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element1))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Header/Page_/strong_Updates Regarding COVID-19'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_COVID-19 Supporting Your Family (1)'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_COVID-19 Supporting Your Family (1)'), 'COVID-19: Supporting Your Family')

WebElement element2 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Show contact page (1)'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element2))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Browse FAQs'))

WebUI.switchToWindowUrl(GlobalVariable.HelpCenter)

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_Help Center  FAQ (1)'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Help Center  FAQ (1)'), 'Help Center & FAQ')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/button_Toggle search box'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Header/Page_/button_Toggle search box'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_/button_Toggle search box'))

WebUI.enhancedClick(findTestObject('Header/Page_/button_Toggle search box'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Header/Page_/input_Toggle search box_react-autosuggest___4dfc55'), 'enfamil')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_359 results'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_enfamil'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/button_Search submit'), 0)

WebUI.click(findTestObject('Object Repository/Header/Page_/button_Search submit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Header/Page_/button_Toggle search box_cart-tooltip-trigg_c05b76'))

WebUI.delay(7)

WebUI.closeBrowser()

