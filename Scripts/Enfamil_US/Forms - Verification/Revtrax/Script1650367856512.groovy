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

WebUI.navigateToUrl(GlobalVariable.Revtrax)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Form Verification/Revtrax/Page_/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/span_Offer'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/span_Offer'), 'Offer')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/span_Enfamil NeuroPro'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/span_Enfamil NeuroPro'), 'Enfamil NeuroPro™')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/h2_Get up to 15 off the New Enfamil NeuroPro'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/h2_Get up to 15 off the New Enfamil NeuroPro'), 
    'Get up to $15 off the New Enfamil NeuroPro.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/p_Discover the difference now'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/p_Discover the difference now'), 
    'Discover the difference now.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/p_Try new Enfamil NeuroPro, the only brand _8d5720'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/p_Try new Enfamil NeuroPro, the only brand _8d5720'), 
    'Try new Enfamil NeuroPro, the only brand that has brain-building expert-recommended DHA and a Triple Prebiotic Immune Blend™ including 2’-FL HMO (Human Milk Oligosaccharide). All inspired by breast milk. So you can set up your baby up for a life full of wonder.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/div_Fill out the form below and check your _3fe827'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/div_Fill out the form below and check your _3fe827'), 
    'Fill out the form below and check your email for next steps.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/h3_Redeem offer worth up to 15'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/h3_Redeem offer worth up to 15'), 
    'Redeem offer worth up to $15')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_First name_e3371ce6-6846-459b-8624-a3_9ee797'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_First name_e3371ce6-6846-459b-8624-a3_9ee797_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_Last name_4953cab3-a783-46e5-b36a-3ea_0ebc41'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_Last name_4953cab3-a783-46e5-b36a-3ea_0ebc41_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_Street Address_09adf00a-2a13-4493-8dc_72c6d2'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_Street Address_09adf00a-2a13-4493-8dc_72c6d2_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_UnitSuiteApt_006fe22a-d7ee-4d57-bfac-_645c72'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_UnitSuiteApt_006fe22a-d7ee-4d57-bfac-_645c72_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_City_eace8285-a56b-4a2e-bbcc-122a92ab2580'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_City_eace8285-a56b-4a2e-bbcc-122a92ab2580_1'))

WebUI.verifyElementPresent(findTestObject('Form Verification/Revtrax/Dropdrown/select_State'), 0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Revtrax/Dropdrown/select_State'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_Zip Code_482f5eb3-b873-4b90-ad22-00b8_0f9439'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_Zip Code_482f5eb3-b873-4b90-ad22-00b8_0f9439_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_Email_4189f5a2-5629-4393-ba54-4b513dd8788b'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_Email_4189f5a2-5629-4393-ba54-4b513dd8788b_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_Due date or birth date_2e8446ea-2d1a-_cf9144'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Revtrax/Page_/input_Due date or birth date_2e8446ea-2d1a-_cf9144_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/button_Why'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Revtrax/Page_/button_Why'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/button_Shop retailers'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/button_Shop retailers'), 'Shop retailers')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Revtrax/Page_/button_Shop retailers'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/div_With submission of this form, you will _a71c2c'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/div_With submission of this form, you will _a71c2c'), 
    'With submission of this form, you will automatically be enrolled into the Enfamil Family Beginnings® Program')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/p_Terms and Conditions'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/p_Terms and Conditions'), 'Terms and Conditions')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/li_Offer will run from August 11, 2021 to O_cbc6eb'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/li_Offer will run from August 11, 2021 to O_cbc6eb'), 
    'Offer will run from August 11, 2021 to October 31, 2021.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/li_Offer is valid on one NeuroPro tub (Enfa_f17709'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/li_Offer is valid on one NeuroPro tub (Enfa_f17709'), 
    'Offer is valid on one NeuroPro tub (Enfamil NeuroPro Infant Formula Powder 20.7oz Tub, Enfamil NeuroPro Gentlease Infant Formula 19.5oz Tub, or Enfamil NeuroPro Sensitive Infant Formula Powder 19.5oz Tub).')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/li_Limit of one offer per child or household'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/li_Limit of one offer per child or household'), 
    'Limit of one offer per child or household.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/li_Enfamil has the right to cancel this off_0688e4'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/li_Enfamil has the right to cancel this off_0688e4'), 
    'Enfamil has the right to cancel this offer at any time without prior notice.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/h3_Top Formula-Feeding Articles'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/h3_Top Formula-Feeding Articles'), 
    'Top Formula-Feeding Articles')

WebUI.scrollToElement(findTestObject('Object Repository/Form Verification/Revtrax/Page_/h3_Choosing to Formula-Feed'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/ul_What is DHA  Why is It ImportantYouve pr_6a7719'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/h3_What is DHA  Why is It Important'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/p_Youve probably heard that DHA is importan_e7d6a5'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/h3_What is DHA  Why is It Important'), 
    'What is DHA & Why is It Important?')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/p_Youve probably heard that DHA is importan_e7d6a5'), 
    'You’ve probably heard that DHA is important for moms and babies, but you...')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/div_1 min read'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/li_What is DHA  Why is It ImportantYouve pr_4fb0dc'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/li_4 Important Baby Formula IngredientsWhen_aa93f4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/li_Breastfeeding vs. Formula-Feeding 6 Comm_d64dfe'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/li_Choosing to Formula-FeedMany moms choose_f398fa'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/h3_4 Important Baby Formula Ingredients'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/h3_4 Important Baby Formula Ingredients'), 
    '4 Important Baby Formula Ingredients')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/p_When choosing baby formula, its important_7cfe6a'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/p_When choosing baby formula, its important_7cfe6a'), 
    'When choosing baby formula, it\'s important to consider whether a formula...')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/h3_Breastfeeding vs. Formula-Feeding 6 Comm_b05cf7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/p_Here are six common breastfeeding questio_c22eae'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Revtrax/Page_/p_Many moms choose formula-feeding. Learn m_3b6345'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/h3_Choosing to Formula-Feed'), 
    'Choosing to Formula-Feed')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Revtrax/Page_/p_Many moms choose formula-feeding. Learn m_3b6345'), 
    'Many moms choose formula-feeding. Learn more about choosing to formula-feed...')

WebUI.closeBrowser()

