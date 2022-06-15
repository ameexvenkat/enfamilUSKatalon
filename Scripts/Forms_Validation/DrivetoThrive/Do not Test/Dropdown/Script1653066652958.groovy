import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/')

WebUI.waitForElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    3)

WebUI.verifyElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    0)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

WebUI.mouseOver(findTestObject('Nutramigen/Field Validation for invalid data/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Verify hover on Offers and Savings menu'))

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Verify Nutramigen in Menu'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/input_Password_866a7dab-8bf6-4bee-a159-5265_93e73f'), 
    0)

WebUI.setText(findTestObject('Object Repository/Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/input_Password_866a7dab-8bf6-4bee-a159-5265_93e73f'), 
    'A')

WebUI.click(findTestObject('Object Repository/Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/li_At least 8 characters'))

WebUI.getText(findTestObject('Object Repository/Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/li_A lowercase letter'))

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/li_An uppercase letter'), 
    'id', 0)

//attribute = WebUI.getAttribute(findTestObject('Page_CuraHomepage/btn_MakeAppointment'), 'class')
Updated_Password_Rules_2 = WebUI.getAttribute(findTestObject('Object Repository/Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/li_A number'), 
    'class')

Updated_Password_Rules_3 = WebUI.getAttribute(findTestObject('Object Repository/Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/li_A special character'), 
    'class')

WebUI.click(findTestObject('Object Repository/Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/li_Must not be your email address'))

Updated_Password_Rules_1 = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/li_At least 8 characters'), 
    'type')

WebUI.waitForPageLoad(0)

