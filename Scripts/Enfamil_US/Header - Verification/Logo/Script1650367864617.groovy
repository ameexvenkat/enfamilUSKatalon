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

WebUI.verifyElementPresent(findTestObject('New Folder/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Espaol_main-header__logo-link link link--active'), 
    0)

WebUI.verifyElementVisible(findTestObject('New Folder/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Espaol_main-header__logo-link link link--active'))

WebUI.click(findTestObject('New Folder/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Espaol_main-header__logo-link link link--active'))

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Enfamil Newborn, Infant & Toddler Nutrition │ Enfamil', false)

WebUI.click(findTestObject('New Folder/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/img'))

WebUI.click(findTestObject('New Folder/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Espaol_main-header__logo-link link link--active'))

WebUI.delay(10)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Enfamil Newborn, Infant & Toddler Nutrition │ Enfamil', false)

WebUI.closeBrowser()

