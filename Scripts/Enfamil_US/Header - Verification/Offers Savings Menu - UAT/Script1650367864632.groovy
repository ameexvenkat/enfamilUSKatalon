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

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Offers  Savings'), 
    'Offers & Savings')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Offers  Savings'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Offers  Savings'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/h5_Savings  Support Programs'), 
    'SAVINGS & SUPPORT PROGRAMS')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_FEATURED 4'), 'FEATURED')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_MORE WAYS TO SAVE'), 
    'MORE WAYS TO SAVE')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/h5_Savings  Support Programs'), 
    0)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_FEATURED 4'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_MORE WAYS TO SAVE'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Offers  Savings'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Premium Enfamil Family Beginnings'), 
    'Premium Enfamil Family Beginnings®')

//WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Enspire Family Beginnings'), 
//  'Enspire Family Beginnings®')
WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Enfamil Rewards'), 
    'Enfamil Rewards®')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Nutramigen Savings  Support program'), 
    'Nutramigen Savings & Support program')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Enfacare Drive to Thrive Support Program'), 
    'Enfacare® Drive to Thrive Support Program')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Enfagrow Free Sample'), 
    'Enfagrow Free Sample')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Partner Offers'), 
    'Partner Offers')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Professional Discounts'), 
    'Professional Discounts')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_NEW Gift Cards'), 
    'NEW! Gift Cards')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Save 15 when you use Afterpay'), 
    'Save 15% when you use Afterpay')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Enfamil Rebates'), 
    'Enfamil Rebates')

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Offers  Savings'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Financial Assistance'), 
    'Financial Assistance')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Upgrade to Premium Enfamil Family Begin_f1fe7a'), 
    'Upgrade to Premium Enfamil Family Beginnings® for up to $700 in gifts')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Ask a Nurse'), 
    'Ask a Nurse')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/li_Premium Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/li_Enspire Family Beginnings'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/li_Enfamil Rewards'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/li_Nutramigen Savings  Support program'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/li_Enfacare Drive to Thrive Support Program'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/li_Enfagrow Free Sample'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Partner Offers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Professional Discounts'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_NEW Gift Cards'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Offers  Savings'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Save 15 when you use Afterpay'), 
    'Save 15% when you use Afterpay')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Save 15 when you use Afterpay'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Enfamil Rebates'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Financial Assistance'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Upgrade to Premium Enfamil Family Beginni_120ba0'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Ask a Nurse Powered By'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/img_1'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Offers  Savings'))

WebUI.click(findTestObject('Object Repository/Header/Page_/div_Premium Enfamil Family Beginnings'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_Premium Enfamil Family Beginnings/span_Premium Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Premium Enfamil Family Beginnings/span_Premium Enfamil Family Beginnings'), 
    'Premium Enfamil Family Beginnings®')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Premium Enfamil Family Beginnings/span_Premium Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_Premium Enfamil Family Beginnings/span_Premium Enfamil Family Beginnings'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Premium Enfamil Family Beginnings/h2_Premium Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Premium Enfamil Family Beginnings/h2_Premium Enfamil Family Beginnings'), 
    'Premium Enfamil Family Beginnings®')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Premium Enfamil Family Beginnings/span_Offers  Savings'))

//WebUI.click(findTestObject('Object Repository/Header/Page_Premium Enfamil Family Beginnings/div_Enspire Family Beginnings'))

//WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_Enspire Family Beginnings Registration_996fe8/span_Enspire Family Beginnings by Enfamil'), 
  //  0)

//WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enspire Family Beginnings Registration_996fe8/span_Enspire Family Beginnings by Enfamil'), 
 //   'Enspire Family Beginnings™ by Enfamil®')

//WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enspire Family Beginnings Registration_996fe8/span_Enspire Family Beginnings by Enfamil'), 
   // 'Enspire Family Beginnings™ by Enfamil®')

//WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enspire Family Beginnings Registration_996fe8/span_Enspire Family Beginnings by Enfamil'), 
  //  0)

//WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_Enspire Family Beginnings Registration_996fe8/span_Enspire Family Beginnings by Enfamil'))

//WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enspire Family Beginnings Registration_996fe8/h1_Enspire Family Beginnings by Enfamil'), 
   // 'Enspire Family Beginnings™ by Enfamil®')

//WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enspire Family Beginnings Registration_996fe8/h1_Enspire Family Beginnings by Enfamil'), 
  //  0)

//WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Enspire Family Beginnings Registration_996fe8/span_Offers  Savings'))

WebUI.click(findTestObject('Object Repository/Header/Page_Enspire Family Beginnings Registration_996fe8/div_Enfamil Rewards'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_Baby formula rewards program'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Baby formula rewards program'), 'Baby formula rewards program')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_Baby formula rewards program'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_/span_Baby formula rewards program'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h2_Enfamil Rewards'), 'Enfamil® Rewards')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h2_Enfamil Rewards'), 0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Offers  Savings'))

WebUI.click(findTestObject('Object Repository/Header/Page_/div_Nutramigen Savings  Support program'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_Nutramigen  Enfamil/span_Nutramigen Savings and Support'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Nutramigen  Enfamil/span_Nutramigen Savings and Support'), 
    'Nutramigen® Savings and Support')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Nutramigen  Enfamil/span_Nutramigen Savings and Support'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_Nutramigen  Enfamil/span_Nutramigen Savings and Support'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Nutramigen  Enfamil/h1_Nutramigen Savings and Support'), 
    'Nutramigen® Savings and Support')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Nutramigen  Enfamil/h1_Nutramigen Savings and Support'), 
    0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Nutramigen  Enfamil/span_Offers  Savings'))

WebUI.click(findTestObject('Object Repository/Header/Page_Nutramigen  Enfamil/div_Enfacare Drive to Thrive Support Program'))

WebUI.delay(8)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Join the Drive to Thrive Support Program'), 
    'Join the Drive to Thrive Support Program')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_Join the Drive to Thrive Support Program'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_/span_Join the Drive to Thrive Support Program'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Join the Drive to Thrive Support Program'), 'Join the Drive to Thrive Support Program')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Join the Drive to Thrive Support Program'), 
    0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Offers  Savings'))

WebUI.click(findTestObject('Object Repository/Header/Page_/div_Enfagrow Free Sample'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_Toddler Sample Request  Enfamil/span_Free Sample of Enfagrow Toddler Formula'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Toddler Sample Request  Enfamil/span_Free Sample of Enfagrow Toddler Formula'), 
    'Free Sample of Enfagrow® Toddler Formula')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Toddler Sample Request  Enfamil/span_Free Sample of Enfagrow Toddler Formula'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Header/Page_Toddler Sample Request  Enfamil/span_Free Sample of Enfagrow Toddler Formula'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Toddler Sample Request  Enfamil/h1_Free Sample of Enfagrow Toddler Formula'), 
    'Free Sample of Enfagrow® Toddler Formula')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Toddler Sample Request  Enfamil/h1_Free Sample of Enfagrow Toddler Formula'), 
    0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Toddler Sample Request  Enfamil/span_Offers  Savings'))

WebUI.click(findTestObject('Object Repository/Header/Page_Toddler Sample Request  Enfamil/a_Partner Offers'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_Partnership Offers'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Partnership Offers'), 'Partnership Offers')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_Partnership Offers'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h3_Enfamil Partner Discounts'), 'Enfamil Partner Discounts')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h3_Enfamil Partner Discounts'), 0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Offers  Savings'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Professional Discounts'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_Enfamil Shop Professional Discounts'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Enfamil Shop Professional Discounts'), 'Enfamil® Shop Professional Discounts')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_Enfamil Shop Professional Discounts'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Enfamil Shop Professional Discounts'), 'Enfamil® Shop Professional Discounts')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Enfamil Shop Professional Discounts'), 0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Offers  Savings'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_NEW Gift Cards'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_Gift Cards'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Gift Cards'), 'Gift Cards')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_Gift Cards'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h2_Gift Cards'), 'Gift Cards')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h2_Gift Cards'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h3_Select Your Gift Card'), 'Select Your Gift Card')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/div_start gifting now'), 'START GIFTING NOW')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Offers  Savings'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Save 15 when you use Afterpay'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_Afterpay'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Afterpay'), 'Afterpay')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_Afterpay'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h2_Stock up and Save 15 when you use Afterpay'), 
    'Stock up and Save 15% when you use Afterpay')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h2_Stock up and Save 15 when you use Afterpay'), 
    0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Offers  Savings'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Enfamil Rebates'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_/span_Enfamil Rebates'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Enfamil Rebates'), 'Enfamil® Rebates')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/span_Enfamil Rebates'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h2_Enfamil Rebates'), 'Enfamil® Rebates')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h2_Enfamil Rebates'), 0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Offers  Savings'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Financial Assistance'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_Reimbursement and Support  Enfamil/span_Reimbursement and Support'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Reimbursement and Support  Enfamil/span_Reimbursement and Support'), 
    'Reimbursement and Support')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Reimbursement and Support  Enfamil/span_Reimbursement and Support'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Reimbursement and Support  Enfamil/h2_SNAP, WIC  Formula Insurance Coverage  R_6d98a7'), 
    'SNAP, WIC & Formula Insurance Coverage & Reimbursement')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Reimbursement and Support  Enfamil/h2_SNAP, WIC  Formula Insurance Coverage  R_6d98a7'), 
    0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Premium Enfamil Family Beginnings Subs_b2e86a/span_Offers  Savings'))

WebUI.click(findTestObject('Object Repository/Header/Page_Premium Enfamil Family Beginnings Subs_b2e86a/span_Ask a Nurse'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_Ask a Registered Nurse Online  Enfamil/span_Ask a Registered Nurse Online'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Ask a Registered Nurse Online  Enfamil/span_Ask a Registered Nurse Online'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Ask a Registered Nurse Online  Enfamil/h1_Ask a RegisteredNurse Online'), 
    0)

WebUI.delay(5)

WebUI.closeBrowser()

