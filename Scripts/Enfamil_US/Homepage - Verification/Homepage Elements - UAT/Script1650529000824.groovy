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

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.scrollToElement(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Home_carousel-item__content-image'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Home_carousel-item__content-image'), 
    0)

WebUI.verifyElementPresent(findTestObject('Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_First name_registerGivenNameField_1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_First name_registerGivenNameField_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Last name_registerFamilyNameField_1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Last name_registerFamilyNameField_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Email_registerEmailField_1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Email_registerEmailField_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Due date or birth date_childregisterC_87b480'), 
    0)

WebUI.verifyElementClickable(findTestObject('Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Due date or birth date_childregisterC_87b480'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Why'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Why'))

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Why'), 
    'Why?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Join now'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Join now'), 
    'Join now')

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Join now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/p_By clicking Join Now and Enter Sweepstake_0b0cd5'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/p_By clicking Join Now and Enter Sweepstake_0b0cd5'), 
    'By clicking “Join Now and Enter Sweepstakes,” I agree to join Enfamil Family Beginnings and receive free samples, offers and other communications from Enfamil and Mead Johnson Nutrition’s affiliated companies I understand and agree to the Terms of Use, Privacy Policy and Sweepstakes Official Rules.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Terms of Use'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Terms of Use'), 
    'Terms of Use')

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Terms of Use'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Privacy Policy'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Privacy Policy'), 
    'Privacy Policy')

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Privacy Policy'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Sweepstakes Official Rules'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Sweepstakes Official Rules'), 
    'Sweepstakes Official Rules.')

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Sweepstakes Official Rules'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Or register with your social account'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Or register with your social account'), 
    'OR REGISTER WITH YOUR SOCIAL ACCOUNT')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Continue with Facebook'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Continue with Facebook'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Sign in with Google'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Sign in with Google'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/svg'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/svg'))

WebUI.scrollToElement(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_WHY ENFAMIL'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_WHY ENFAMIL'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_WHY ENFAMIL'), 
    'WHY ENFAMIL')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Providing trusted nutrition to fuel won_595b0e'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Providing trusted nutrition to fuel won_595b0e'), 
    'Providing trusted nutrition to fuel wonder every step of the way.')

WebUI.scrollToElement(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_trusted brand for brain-building nutrit_f784b2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_trusted brand for brain-building nutrit_f784b2'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_trusted brand for brain-building nutrit_f784b2'), 
    'trusted brand for brain-building nutrition and immune support')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_infant formula brand recommended by ped_324947'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_infant formula brand recommended by ped_324947'), 
    'infant formula brand recommended by pediatricians')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_See Our Formulas'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_See Our Formulas'), 
    'See Our Formulas')

WebUI.scrollToElement(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_See Our Formulas'), 
    0)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/img_See Our Formulas_image-as-link__image'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/img_See Our Formulas_image-as-link__image'))

WebUI.scrollToElement(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Shop Products'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Shop Products'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Shop Products'), 
    'SHOP PRODUCTS')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/h2_Explore the full range of Enfamil products'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/h2_Explore the full range of Enfamil products'), 
    'Explore the full range of Enfamil products.')

WebUI.scrollToElement(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Featured'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Featured'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Ages  Stages'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Ages  Stages'), 
    'Ages & Stages')

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Ages  Stages'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Feeding Need'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Feeding Need'), 
    'Feeding Need')

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Feeding Need'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Product Category'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Product Category'), 
    'Product Category')

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Product Category'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Nutrition for brain building  immune s_0d1134'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Nutrition for brain building  immune s_0d1134'), 
    'Made with USDA certified organic milk')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_More formats  sizes available'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_More formats  sizes available'), 
    'More formats & sizes available')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Enfamil NeuroPro Infant Formula'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Enfamil NeuroPro Infant Formula'), 
    'Enfamil Simply Organic Infant Formula')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Shop Now'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Shop Now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Compare'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Compare'), 
    'Compare')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_For fussiness, crying, gas and spit-up'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_For fussiness, crying, gas and spit-up'), 
    'For a nutritional complement to Toddler diets')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_For our nutrition closest to breast milk'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_For our nutrition closest to breast milk'), 
    'For a nutritional complement to Toddler diets')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_More formats  sizes available'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Enfamil NeuroPro Gentlease Infant Formula'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Enfamil NeuroPro Gentlease Infant Formula'), 
    'Enfagrow NeuroPro Toddler Nutritional Drink Natural Milk')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Shop Now_1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Shop Now_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Compare'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Compare'), 
    'Compare')

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Compare'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_For our nutrition closest to breast milk'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_More formats  sizes available'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Enfamil Enspire Infant Formula'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Shop Now_1_2'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Shop Now_1_2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Compare'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Compare'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Qualifying participants may use their S_a39733'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Qualifying participants may use their S_a037c3'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Qualifying participants may use their S_a037c3'), 
    'Qualifying participants may use their SNAP benefits to purchase any baby formula, including Enfamil products.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Learn more'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Learn more'))

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Learn more'), 
    'Learn more')

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

