import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.HomePage)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/Enfamil products'), 0)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/p_Enfamil products unaffected by recall. Le_0a6984'), 
    0)

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/p_Enfamil products unaffected by recall. Le_0a6984'), 
    'No Enfamil products are affected by the recent infant formula recall that was initiated by another manufacturer. More >>')

css_color = WebUI.getCSSValue(findTestObject('Header/Page_Enfamil Newborn, Infant/p_Enfamil products unaffected by recall. Le_0a6984'), 
    'color')

println(css_color)

WebUI.verifyEqual(css_color, 'rgba(255, 255, 255, 1)')

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/u_Learn more'), 0)

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/u_Learn more'), 'More >>')

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/u_Learn more'))

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Close'), 0)

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Close'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/u_Learn more'))

WebUI.delay(10)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Enfamil® Formula Safety | Enfamil US', false)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Formula Safety  Enfamil/div_Enfamil Formula Safety'), 
    'Enfamil® Formula Safety')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Formula Safety  Enfamil/span_Enfamil Formula Safety'), 
    'Enfamil® Formula Safety')

WebUI.click(findTestObject('Object Repository/Header/Page_Enfamil Formula Safety  Enfamil/a_Espaol_main-header__logo-link link link--_b21617'))

WebUI.delay(15)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Close'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.delay(5)

WebUI.verifyElementNotPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/p_Enfamil products unaffected by recall. Le_0a6984'), 
    0)

WebUI.closeBrowser()

