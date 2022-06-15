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

WebUI.navigateToUrl(GlobalVariable.HCPoffer)

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/span_Redeem Offer'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/span_Redeem Offer'), 'Redeem Offer')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/h3_Get your offer worth up to 15 off on Enf_306f7c'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/h3_Get your offer worth up to 15 off on Enf_306f7c'), 
    'Get your offer worth up to $15 off on Enfamil NeuroPro™')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/p_Fill out the form below and check your em_794ef1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/p_Fill out the form below and check your em_794ef1'), 
    'Fill out the form below and check your email for next steps.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/img_Redeem Offer_carousel-item__image'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/input_First name_e3371ce6-6846-459b-8624-a3_9ee797'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/HCP Offer Form/Page_/input_First name_e3371ce6-6846-459b-8624-a3_9ee797'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/input_Last name_4953cab3-a783-46e5-b36a-3ea_0ebc41'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/HCP Offer Form/Page_/input_Last name_4953cab3-a783-46e5-b36a-3ea_0ebc41'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/input_Street Address_09adf00a-2a13-4493-8dc_72c6d2'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/HCP Offer Form/Page_/input_Street Address_09adf00a-2a13-4493-8dc_72c6d2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/input_UnitSuiteApt_006fe22a-d7ee-4d57-bfac-_645c72'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/HCP Offer Form/Page_/input_UnitSuiteApt_006fe22a-d7ee-4d57-bfac-_645c72'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/input_City_eace8285-a56b-4a2e-bbcc-122a92ab2580'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/HCP Offer Form/Page_/input_City_eace8285-a56b-4a2e-bbcc-122a92ab2580'))

WebUI.verifyElementPresent(findTestObject('Form Verification/HCP Offer Form/state/Page_/select_State'), 0)

WebUI.verifyElementClickable(findTestObject('Form Verification/HCP Offer Form/state/Page_/select_State'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/input_Zip Code_482f5eb3-b873-4b90-ad22-00b8_0f9439'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/HCP Offer Form/Page_/input_Zip Code_482f5eb3-b873-4b90-ad22-00b8_0f9439'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/input_Email_4189f5a2-5629-4393-ba54-4b513dd8788b'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/HCP Offer Form/Page_/input_Email_4189f5a2-5629-4393-ba54-4b513dd8788b'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/input_Due date or birth date_2e8446ea-2d1a-_cf9144'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/HCP Offer Form/Page_/input_Due date or birth date_2e8446ea-2d1a-_cf9144'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/button_Why'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/button_Why'), 'Why?')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/button_Why'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/input_Phone_5ea36e97-7c24-4041-8332-06a04fb5bb8c'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/HCP Offer Form/Page_/input_Phone_5ea36e97-7c24-4041-8332-06a04fb5bb8c'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/input_Code Activation_74592baf-a945-44e8-85_e2ed3b'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/input_Code Activation_74592baf-a945-44e8-85_e2ed3b'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/button_Shop retailers'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/span_Shop retailers'), 
    'Shop retailers')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/div'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/div_With submission of this form, you will _8ed342'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/div_With submission of this form, you will _8ed342'), 
    'With submission of this form, you will automatically be enrolled into the Enfamil Family Beginnings® Program')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/p_Terms and Conditions'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/p_Terms and Conditions'), 
    'Terms and Conditions')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/ol_Offer will run from August 15, 2022 - De_c988ff'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/ol_Offer will run from August 15, 2022 - De_c988ff'), 
    'Offer will run from August 15, 2022 - Dec 31, 2022.\nOffer only applies to 17 oz or larger versions of Enfamil Enspire, Enfamil Enspire Gentlease, Enfamil NeuroPro Sensitive, Enfamil A.R., Enfamil Reguline, Enfamil ProSobee, or Nutramigen.\nLimit of one offer per child or household.\nEnfamil has the right to cancel this offer at any time without prior notice.\nVoid where prohibited by law.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/h4_Advanced Nutrition to Fuel Their Possibilities'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/h4_Advanced Nutrition to Fuel Their Possibilities'), 
    'Advanced Nutrition to Fuel Their Possibilities')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/p_Enfamil NeuroPro is the only brand to hav_ad6880'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/p_Enfamil NeuroPro is the only brand to hav_ad6880'), 
    'Enfamil NeuroPro is the only brand to have both expert-recommended DHA and a Triple Prebiotic immune Blend™.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/a_Learn more'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/a_Learn more'), 'Learn more')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/HCP Offer Form/Page_/a_Learn more'))

WebUI.closeBrowser()

