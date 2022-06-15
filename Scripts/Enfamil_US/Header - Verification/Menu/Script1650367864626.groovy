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

//WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Shop Products'), 
  //  'Shop Products')

//WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Shop Products'), 
  //  0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Tips  Resources'), 
    'Tips & Resources')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Tips  Resources'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Why Enfamil'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Why Enfamil'), 
    'Why Enfamil')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Offers  Savings'), 
    'Offers & Savings')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Offers  Savings'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Show contact page'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Toggle search box'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Toggle search box_cart-tooltip-trigg_c05b76'), 
    0)

WebUI.closeBrowser()

