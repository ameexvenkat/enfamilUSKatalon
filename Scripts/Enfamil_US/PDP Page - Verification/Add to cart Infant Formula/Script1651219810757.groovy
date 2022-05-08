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

WebUI.navigateToUrl(GlobalVariable.PDP1)

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.click(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/button_Add to cart'))

WebUI.scrollToElement(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/span_No, thanks'), 
    0)

WebUI.click(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/span_No, thanks'))

WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/div_Item successfully added to cartCongrats_5d7bdb'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/span_Item successfully added to cart'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/span_Item successfully added to cart'), 
    'Item successfully added to cart')

WebUI.verifyElementPresent(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/a_Congrats Your order qualifies for FREE shipping'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/a_Congrats Your order qualifies for FREE shipping'), 
    'Congrats! Your order qualifies for FREE shipping!')

WebUI.verifyElementPresent(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/div_Subtotal190.99'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/span_Price  Qty'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/button_View Shopping Cart'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/button_Checkout now'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/button_View Shopping Cart'))

WebUI.verifyElementClickable(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/button_Checkout now'))

WebUI.verifyElementPresent(findTestObject('PDP Element Verification - infant/Recorded/AddtoCart_button_Close'), 0)

WebUI.verifyElementClickable(findTestObject('PDP Element Verification - infant/Recorded/AddtoCart_button_Close'))

WebUI.click(findTestObject('PDP Element Verification - infant/Recorded/AddtoCart_button_Close'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/div_1'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/button_Item successfully added to cart_cart_034add'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/div_Enfamil NeuroPro Infant FormulaPowder  _3b138e'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/div_Subtotal190.99'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/span_Shipping and taxes calculated at checkout'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/span_Shipping and taxes calculated at checkout'), 
    'Shipping and taxes calculated at checkout.')

WebUI.verifyElementPresent(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/button_View Shopping Cart'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PDP Element Verification - infant/Page_Enfamil NeuroPro Infant Formula  Enfamil/span_View Shopping Cart'), 
    'View Shopping Cart')

