import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/enspire-family-beginnings/?slug=self_enroll')

WebUI.maximizeWindow()

WebUI.delay(8)

WebUI.scrollToElement(findTestObject('Object Repository/New Folder/Page_Enspire Family Beginnings Registration_996fe8/svg_State_css-19bqh2r'), 
    0)

WebUI.getAttribute(findTestObject('Object Repository/New Folder/Page_Enspire Family Beginnings Registration_996fe8/svg_State_css-19bqh2r'), 
    '')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Enspire Family Beginnings Registration_996fe8/svg_State_css-19bqh2r'), 
    FailureHandling.CONTINUE_ON_FAILURE)

for (int i = 1; i < 32; i++) {
    TestObject btn_make_appointment = findTestObject('Object Repository/New Folder/Page_Enspire Family Beginnings Registration_996fe8/svg_State_css-19bqh2r' + i + ']')

    result = WebUI.getText(findTestObject(btn_make_appointment))

    println(result)
}

