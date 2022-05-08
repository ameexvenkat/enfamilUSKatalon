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

WebUI.navigateToUrl(GlobalVariable.Rebates)

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/span_Enfamil Rebates'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/h2_Enfamil Rebates'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/h2_Enfamil Rebates'), 'Enfamil® Rebates')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/p_Thank you for choosing Enfamil. To redeem_f7a344'), 
    'Thank you for choosing Enfamil. To redeem your cash back rebate or offer, please log in or sign up first.')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/p_Thank you for choosing Enfamil. To redeem_f7a344'), 
    'Thank you for choosing Enfamil. To redeem your cash back rebate or offer, please log in or sign up first.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/button_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/a_Sign Up'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/img_Enfamil Rebates_carousel-item__image'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/h5_Access other offers and cash back option_d885a7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/p_Receive push notifications once new offer_a8384f'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/p_Easily redeem by using the app to take ph_0d9a6e'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/h5_Access other offers and cash back option_d885a7'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/h5_Access other offers and cash back option_d885a7'), 
    'Access other offers and cash back options on our mobile app!')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/img'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/img_1'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/p_Receive push notifications once new offer_a8384f'), 
    'Receive push notifications once new offers are available.')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/p_Easily redeem by using the app to take ph_0d9a6e'), 
    'Easily redeem by using the app to take photos of your receipts and UPCs')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/img_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Rebates Form/Page_/a_Sign Up'))

WebUI.closeBrowser()

