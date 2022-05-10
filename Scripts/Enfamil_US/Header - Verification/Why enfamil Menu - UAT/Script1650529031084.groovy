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

WebUI.click(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Why Enfamil'), 
    'Why Enfamil')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Why Enfamil'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Why Enfamil'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_PROGRAMS  BENEFITS'), 
    'PROGRAMS & BENEFITS')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_SUPPORT OPTIONS'), 
    'SUPPORT OPTIONS')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_RESOURCES'), 
    'RESOURCES')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_FEATURED 3'), 'FEATURED')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/li_Enfamil Family of Formulas'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/li_EFB Mobile App'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/li_Belly Badges'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/li_Enfamil Rewards'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Aftercare'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Expert Support'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Help Center'))

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Why Enfamil'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Our Commitment to Quality'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Coronavirus FAQ'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Aftercare'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Expert Support'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Help Center'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Our Commitment to Quality'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Coronavirus FAQ'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Why Enfamil'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Enfamil Family of Formulas'), 
    'Enfamil Family of Formulas')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_EFB Mobile App'), 
    'EFB Mobile App')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Belly Badges'), 
    'Belly Badges')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Enfamil Rewards - why enfamil'), 
    'Enfamil Rewards')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Why Enfamil'), 
    'Why Enfamil?')

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Why Enfamil'))

WebUI.click(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/li_Enfamil Family of Formulas'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_Enfamil Family of Formulas'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Enfamil Family of Formulas'), 'Enfamil Family of Formulas')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Enfamil Family of Formulas'), 0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Why Enfamil'))

WebUI.click(findTestObject('Object Repository/Header/Page_/div_EFB Mobile App'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_Enfamil Family Beginnings Mobile App'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Enfamil Family Beginnings Mobile App'), 'Enfamil Family Beginnings® Mobile App')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_Enfamil Family Beginnings Mobile App'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h2_Enfamil Family Beginnings Mobile App'), 'Enfamil Family Beginnings® Mobile App')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h2_Enfamil Family Beginnings Mobile App'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/img'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/img_1'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/strong_Download now'), 'Download now')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Why Enfamil'))

WebUI.click(findTestObject('Object Repository/Header/Page_/div_Belly Badges'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_What are Belly Badges'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_What are Belly Badges'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_What are Belly Badges'), 'What are Belly Badges™?')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h2_What are Belly Badges'), 'What are Belly Badges™?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h2_What are Belly Badges'), 0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Why Enfamil'))

WebUI.click(findTestObject('Object Repository/Header/Page_/div_Enfamil Rewards'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_Baby formula rewards program'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Baby formula rewards program'), 'Baby formula rewards program')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_Baby formula rewards program'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h2_Enfamil Rewards'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h2_Enfamil Rewards'), 'Enfamil® Rewards')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Why Enfamil'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Aftercare'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_Enfamil AfterCare/span_Enfamil AfterCare'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil AfterCare/span_Enfamil AfterCare'), 'Enfamil AfterCare')

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_Enfamil AfterCare/span_Enfamil AfterCare'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil AfterCare/span_Enfamil AfterCare'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil AfterCare/h3_Enfamil Aftercare'), 'Enfamil® Aftercare')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil AfterCare/h3_Enfamil Aftercare'), 0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Enfamil AfterCare/span_Why Enfamil'))

WebUI.click(findTestObject('Object Repository/Header/Page_Enfamil AfterCare/a_Expert Support'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_Expert Support'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Expert Support'), 'Expert Support')

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_/span_Expert Support'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_Expert Support'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Expert Support'), 'Expert Support')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Expert Support'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/img_Enfamil NeuroPro_carousel-item__image'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h2_Meet Our Enfamil Experts'), 0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Why Enfamil'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Help Center'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_Help Center  FAQ'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_/span_Help Center  FAQ'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_Help Center  FAQ'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Help Center  FAQ'), 'Help Center & FAQ')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Help Center  FAQs'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Help Center  FAQs'), 'Help Center & FAQs')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Why Enfamil'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Our Commitment to Quality'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_Enfamil Quality Standards  Enfamil/span_Enfamil Quality Standards'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Quality Standards  Enfamil/span_Enfamil Quality Standards'), 
    'Enfamil® Quality Standards')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Quality Standards  Enfamil/span_Enfamil Quality Standards'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_Enfamil Quality Standards  Enfamil/span_Enfamil Quality Standards'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Quality Standards  Enfamil/h1_Enfamil Quality Standards'), 
    'Enfamil® Quality Standards')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Quality Standards  Enfamil/h1_Enfamil Quality Standards'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Quality Standards  Enfamil/h2_Enfamil Quality Assurance'), 
    'Enfamil® Quality Assurance')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Enfamil Quality Standards  Enfamil/span_Why Enfamil'))

WebUI.click(findTestObject('Object Repository/Header/Page_Enfamil Quality Standards  Enfamil/a_Coronavirus FAQ'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_COVID-19 Supporting Your Family'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_COVID-19 Supporting Your Family'), 'COVID-19: Supporting Your Family')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_COVID-19 Supporting Your Family'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Our Enfamil family is here to support yo_64ba03'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_/span_COVID-19 Supporting Your Family'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Why Enfamil'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Why Enfamil'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_Why Enfamil  Enfamil/span_Why Enfamil'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Why Enfamil  Enfamil/span_Why Enfamil'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_Why Enfamil  Enfamil/span_Why Enfamil'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Why Enfamil  Enfamil/h1_Why Enfamil'), 'Why Enfamil®?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Why Enfamil  Enfamil/h1_Why Enfamil'), 0)

WebUI.delay(5)

WebUI.closeBrowser()

