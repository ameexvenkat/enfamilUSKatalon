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

WebUI.navigateToUrl(GlobalVariable.Premium)

WebUI.maximizeWindow()

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/span_Premium Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/span_Premium Enfamil Family Beginnings'), 
    'Premium Enfamil Family Beginnings®')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/h2_Premium Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/h2_Premium Enfamil Family Beginnings'), 
    'Premium Enfamil Family Beginnings®')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_For just 39.99 get 700 in value, includin_f5bb73'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_For just 39.99 get 700 in value, includin_f5bb73'), 
    'For just $39.99 get $700 in value, including a welcome gift of Enfamil products, coupons, exclusive partner offers and so much more!')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Benefits may vary'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Benefits may vary'), 
    '*Benefits may vary.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/a_Join Premium now'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/a_Join Premium now'), 
    'Join Premium now')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/a_Join Premium now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/h2_Join Premium for 39.99 and get guarantee_e921a3'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/h2_Join Premium for 39.99 and get guarantee_e921a3'), 
    'For just $39.99 get $700 in value, including a welcome gift of Enfamil products, coupons, exclusive partner offers and so much more!')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/div_Ask a registered nurse anything 247'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/div_Pick your own Premium sample when you join'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/div_Exclusive monthly discounts on Enfamil.com'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/div_Over 200 in valuable Enfamil discounts'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/h3_Ask a registered nurse anything 247'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/h3_Ask a registered nurse anything 247'), 
    'Ask a registered nurse anything 24/7.†')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/h3_Pick your own Premium sample when you join'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/h3_Pick your own Premium sample when you join'), 
    'Pick your own Premium sample when you join.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/h3_Exclusive monthly discounts on Enfamil.com'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/h3_Exclusive monthly discounts on Enfamil.com'), 
    'Exclusive monthly discounts on Enfamil.com.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/h3_Over 200 in valuable Enfamil discounts'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/h3_Over 200 in valuable Enfamil discounts'), 
    'Over $200 in valuable Enfamil discounts.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/a_Join Premium now'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/a_Join Premium now'), 
    'Join Premium now')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Ask a Nurse is currently not yet availabl_22ec0c'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Ask a Nurse is currently not yet availabl_22ec0c'), 
    '†Ask a Nurse is currently not yet available in the following states: AK, HI, MN, NV, OH, OR, PA, RI, VT, WA, DC.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/div_StandardPremiumPriceFree39.99Free Gifts_058466'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/div_StandardPremiumPriceFree39.99Free Gifts_058466'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/th_Standard'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/span_Standard'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/span_Standard'), 
    'Standard**')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/th_Premium'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/span_Premium'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/span_Premium'), 
    'Premium')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Price'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Price'), 
    'Price')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Free'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Free'), 
    'Free')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_39.99'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_39.99'), 
    '$39.99')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Free Gifts, Discounts and Checks'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Free Gifts, Discounts and Checks'), 
    'Free Gifts, Discounts and Checks')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Up to 400'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Up to 400'), 
    'Up to $400**')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Guaranteed 700'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Guaranteed 700'), 
    'Guaranteed $700')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Enfamil Rewards Points'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Enfamil Rewards Points'), 
    'Enfamil Rewards Points')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_10 pointsdollar'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_10 pointsdollar'), 
    '10 points/dollar')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_12 pointsdollar'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_12 pointsdollar'), 
    '12 points/dollar')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Digital Cash Back Rebates'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Digital Cash Back Rebates'), 
    'Digital Cash Back Rebates')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_2x more vs standard'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_2x more vs standard'), 
    '2x more vs standard')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Premium Welcome Box'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Premium Welcome Box'), 
    'Premium Welcome Box')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Guaranteed Monthly Savings at Enfamil.com'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Guaranteed Monthly Savings at Enfamil.com'), 
    'Guaranteed Monthly Savings at Enfamil.com')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Ask an RN powered by Abi Global Health'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Ask an RN powered by Abi Global Health'), 
    'Ask an RN powered by Abi Global Health†† ')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_50 off Qeepsake Family and Baby Book Subs_f222c9'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_50 off Qeepsake Family and Baby Book Subs_f222c9'), 
    '50% off Qeepsake Family and Baby Book Subscription Plus $40 Book Voucher')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Benefits may vary.Limited to 5 micro-cons_1324de'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Premium short form/Page_Premium Enfamil Family Beginnings/p_Benefits may vary.Limited to 5 micro-cons_1324de'), 
    '**Benefits may vary.\n††Limited to 5 micro-consultations per membership.')

WebUI.closeBrowser()

