import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/enspire-family-beginnings/?slug=self_enroll')

WebUI.maximizeWindow()

WebUI.delay(8)

WebUI.scrollToElement(findTestObject('Object Repository/New Folder/Page_Enspire Family Beginnings Registration_996fe8/div_Select one'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/New Folder/Page_Enspire Family Beginnings Registration_996fe8/div_Select one'), 
    0)

WebUI.click(findTestObject('New Folder/Page_Enspire Family Beginnings Registration_996fe8/div_Select one'))

WebUI.verifyElementAttributeValue(findTestObject('New Folder/New Folder (1)/Page_Enspire Family Beginnings Registration  Enfamil/checkbox'), 
    'aria-checked', 'false', 0)

WebUI.sendKeys(findTestObject('enspire/Page_Enspire Family Beginnings Registration_996fe8/input_Mobile phone (optional)_eaf6a18d-7532_9ddcd5'), 
    '7299019491')

WebUI.click(findTestObject('New Folder/New Folder (1)/Page_Enspire Family Beginnings Registration  Enfamil/label_Consent to Receive Certain'))

WebUI.verifyElementAttributeValue(findTestObject('New Folder/New Folder (1)/Page_Enspire Family Beginnings Registration  Enfamil/checkbox'), 
    'aria-checked', 'true', 0)

