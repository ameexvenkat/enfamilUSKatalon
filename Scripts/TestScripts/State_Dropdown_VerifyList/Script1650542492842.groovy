import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/enspire-family-beginnings/?slug=self_enroll')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('New Folder (1)/Page_Enspire Family Beginnings/GOT IT_Cookie'))

WebUI.scrollToElement(findTestObject('New Folder (1)/Page_Enspire Family Beginnings/Forms_State'), 0)

WebUI.click(findTestObject('New Folder (1)/Page_Enspire Family Beginnings/Forms_State'))

TestObject scount = new TestObject()
scount.addProperty("xpath", ConditionType.EQUALS, "//*[@class='single-select__menu-list css-11unzgr']/div")

List<WebElement> Statecount = WebUI.findWebElements(scount, 30)

for (int i = 1; i <= Statecount.size(); i++) {
    String xpath = "//div[@class='single-select__menu-list css-11unzgr']/div[" + i + "]"

    TestObject state = new TestObject('objectName')

    state.addProperty('xpath', ConditionType.EQUALS, xpath)

	Verifystates = WebUI.getText(state)
	
	WebUI.verifyMatch(Verifystates, findTestData('Test/StateDropdown').getValue(1, i), false)
}

