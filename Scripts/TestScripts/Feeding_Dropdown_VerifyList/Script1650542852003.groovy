import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/enspire-family-beginnings/?slug=self_enroll')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('New Folder/New Folder (1)/Page_Enspire Family Beginnings/GOT IT_Cookie'))

WebUI.scrollToElement(findTestObject('New Folder/New Folder (1)/Page_Enspire Family Beginnings/div_Select one - 3'), 0)

WebUI.click(findTestObject('New Folder/New Folder (1)/Page_Enspire Family Beginnings/div_Select one - 3'))

TestObject Fcount = new TestObject()
Fcount.addProperty("xpath", ConditionType.EQUALS, "//*[@class='single-select__menu-list css-11unzgr']/div")

List<WebElement> FeedingCount = WebUI.findWebElements(Fcount, 30)

for (int i = 1; i <= FeedingCount.size(); i++) {
    String xpath = "//div[@class='single-select__menu-list css-11unzgr']/div[" + i + "]"

    TestObject feeding = new TestObject('objectName')

    feeding.addProperty('xpath', ConditionType.EQUALS, xpath)

    Verifyfeeding = WebUI.getText(feeding)

    WebUI.verifyMatch(Verifyfeeding, findTestData('Test/FeedingDropdown').getValue(1, i), false)
}

