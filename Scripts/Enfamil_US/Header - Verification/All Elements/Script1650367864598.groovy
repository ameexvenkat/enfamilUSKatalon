import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.HomePage)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_GOT IT_onetrust-close-btn-handler on_95ce22'), 
    FailureHandling.OPTIONAL)

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/div_1 brand recommended by pediatriciansAsk_479c76'), 
    0)

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/div_1 brand recommended by pediatricians'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Ask a Nurse'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Join Enfamil Family Beginnings'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Sign In'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Espaol'))

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/div_1 brand recommended by pediatricians'), 
    '#1 brand recommended by pediatricians')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Join Enfamil Family Beginnings'), 'Join Enfamil Family Beginnings®')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Sign In'), 'Sign In')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Espaol'), 'Español')

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/div_1 brand recommended by pediatricians'))

WebUI.delay(8)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Why Enfamil  Enfamil/h1_Why Enfamil'), 'Why Enfamil®?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Why Enfamil  Enfamil/span_Why Enfamil'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Why Enfamil  Enfamil/span_Why Enfamil'), 'Why Enfamil®?')

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Header/Page_Why Enfamil  Enfamil/a_Espaol_main-header__logo-link link link--_b21617'))

WebUI.delay(8)

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Ask a Nurse'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Ask a Registered Nurse Online  Enfamil/span_Ask a Registered Nurse Online'), 
    'Ask a Registered Nurse Online')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Ask a Registered Nurse Online  Enfamil/span_Ask a Registered Nurse Online'), 
    0)

WebUI.click(findTestObject('Object Repository/Header/Page_Ask a Registered Nurse Online  Enfamil/a_Espaol_main-header__logo-link link link--_b21617'))

WebUI.delay(8)

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Join Enfamil Family Beginnings'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Enfamil Family Beginnings'), 
    'Enfamil Family Beginnings®')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Free Baby Formula Samples  Coupons  Enfamil/h1_Celebrate your little one with up to 400_dbb811'), 
    'Celebrate your little one with up to $400 in savings, exclusive rewards and support.')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Free Baby Formula Samples  Coupons  Enfamil/div_Enfamil Family Beginnings'), 
    'ENFAMIL FAMILY BEGINNINGS')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Header/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Espaol_main-header__logo-link link link--_b21617'))

WebUI.delay(5)

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Sign In'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Sign In'), 0)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Sign In'), 0)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/Signin_PopUp_button_Close'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Header/Page_Enfamil Newborn, Infant/Signin_PopUp_button_Close'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.delay(5)

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Espaol'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Object Repository/Header/Page_Enfamil frmula frmula para bebs  Enfamil US/a_English'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil frmula frmula para bebs  Enfamil US/a_English'), 
    'English')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil frmula frmula para bebs  Enfamil US/div_1 Marca recomendada por pediatras'), 
    '#1 recomendada por pediatras')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil frmula frmula para bebs  Enfamil US/span_nete al programa de Enfamil Family Beginnings'), 
    'Únete al programa de Enfamil Family Beginnings')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil frmula frmula para bebs  Enfamil US/button_Iniciar sesin'), 
    'Iniciar sesión')

WebUI.closeBrowser()

