import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.HomePage)

WebUI.waitForElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    3)

WebUI.verifyElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    0)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

WebUI.mouseOver(findTestObject('Nutramigen/Element Text verification/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Verify hover on Offers and Savings menu'))

WebUI.verifyElementText(findTestObject('Sample Request/Verify Enfagrow Free Sample in Menu'), 'Enfagrow Free Sample')

WebUI.click(findTestObject('Sample Request/Verify Enfagrow Free Sample in Menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

WebUI.verifyMatch(WebUI.getUrl(), 'https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/toddler-sample-request/', 
    false)

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify hero banner title'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify hero banner title'), 
    Hero_Title)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify description in hero banner section below title'), 
    Hero_Description)

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    Form_Layout_Text)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for First Name, Last Name, Email'), 
    Label_Basic_Info)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'), 
    '')

WebUI.verifyElementText(findTestObject('Sample Request/Verify Last Name placeholder text - Sample Request'), '')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'), 
    '')

WebUI.scrollToElement(findTestObject('Sample Request/Verify label for address field - Styling - Sample Request'), 0)

WebUI.verifyElementText(findTestObject('Sample Request/Verify label for address field - Styling - Sample Request'), '2. Enter your address.')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'), 
    '')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify UnitSuiteApt placeholder text for input field'), 
    '')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'), 
    '')

WebUI.verifyElementText(findTestObject('Sample Request/Verify State Placeholder text dropdown - Sample Request'), 'State')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'), 
    '')

WebUI.scrollToElement(findTestObject('Sample Request/Verify label for DoB field - Sample Request'), 0)

WebUI.verifyElementText(findTestObject('Sample Request/Verify label for DoB field - Sample Request'), Label_Baby_Rel_Info)

WebUI.verifyElementText(findTestObject('Sample Request/Verify label 1 for DoB field - Sample Request'), Label_Baby_Rel_Info1)

WebUI.verifyElementText(findTestObject('Sample Request/Verify DoB field label - Sample Request'), Label_DoB)

WebUI.verifyElementText(findTestObject('Sample Request/Verify DoB placeholder text - Sample Request'), '')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Why tooltip label'), 
    Label_Why)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Why tooltip label'))

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Why popup content'), 
    Why_Popup_Text)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify why popup closed'))

WebUI.verifyElementNotPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify why popup present'), 
    0)

WebUI.verifyElementText(findTestObject('Sample Request/Verify GetMySample CTA'), CTA)

String[] Terms_Disclaimer = ['Try this free toddler sample, and see how easy it can be to get your toddler nutrients that can help nourish their growing brain.'
    , 'Mead Johnson & Company does not sell your information to outside agencies. The Enfamil Family Beginnings® program only uses your information to send you FREE gifts, discounts and baby information. You can unsubscribe from Enfamil Family beginnings® at any time. Please see our privacy policy for details.'
    , 'This program is intended for U.S. residents. If you are a resident of Canada. please enroll in the Canadian Enfamil Family Beginnings program. The Enfamil Family Beginnings program is brought to you by Mead Johnson Nutrition. Enfamil Family Beginnings benefits may vary. Offer limited to one per household and subject to change without notice.'
    , '††Every motherhood journey is unique, so your Enfamil Family Beginnings experience is tailored to the information you provide and may vary from what another mom might experience. If you have questions about the program or would like more detail, our Family of Experts can help at 1-800-BABY123 between 7 a.m. to 7 p.m. CST M-F; 8 a.m. to 4:30 p.m. Sat.']

for (def i : (1..4)) {
    j = (i - 1)

    WebUI.scrollToElement(findTestObject('Sample Request/Verify disclaimer for terms - Sample Request', [('paragraph') : i]), 
        0)

    WebUI.verifyElementText(findTestObject('Sample Request/Verify disclaimer for terms - Sample Request', [('paragraph') : i]), 
        Terms_Disclaimer[j])
}

WebUI.closeBrowser()

