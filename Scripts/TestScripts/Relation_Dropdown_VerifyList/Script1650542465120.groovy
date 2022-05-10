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

WebUI.scrollToElement(findTestObject('New Folder (1)/Page_Enspire Family Beginnings/Forms_Select one'), 0)

WebUI.click(findTestObject('New Folder (1)/Page_Enspire Family Beginnings/Forms_Select one'))

TestObject rcount = new TestObject()
rcount.addProperty("xpath", ConditionType.EQUALS, "//*[@class='single-select__menu-list css-11unzgr']/div")

List<WebElement> Relationcount = WebUI.findWebElements(rcount, 30)

for (int i = 1; i <= Relationcount.size(); i++) {
    String xpath = "//div[@class='single-select__menu-list css-11unzgr']/div[(" + i + ")]"

    TestObject relation = new TestObject('objectName')

    relation.addProperty('xpath', ConditionType.EQUALS, xpath)

    Verifyrelation = WebUI.getText(relation)
	
	WebUI.verifyMatch(Verifyrelation, findTestData('Test/RelationsDropdown').getValue(1, i), false)
}

