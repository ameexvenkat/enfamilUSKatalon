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

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Verify Nutramigen in Menu'), 
    'Nutramigen Savings & Support program')

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Verify Nutramigen in Menu'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

WebUI.verifyMatch(WebUI.getUrl(), 'https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/nutramigen-savings-and-support-program/', 
    false)

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify hero banner title'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify hero banner title'), 
    Hero_Title)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify description in hero banner section below title'), 
    Hero_Description)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify disclaimer text in hero banner section below description'), 
    Hero_Disclaimer)

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    Form_Layout_Text)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for First Name, Last Name, Email'), 
    Label_Basic_Info)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'), 
    '')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Last Name placeholder text for input field'), 
    '')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'), 
    '')

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for address fields'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for address fields'), 
    '2. Enter your address.\nYou may receive some gifts closer to your baby’s due date.')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for address field'), 
    '2. Enter your address.\nYou may receive some gifts closer to your baby’s due date.')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'), 
    '')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify UnitSuiteApt placeholder text for input field'), 
    '')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'), 
    '')

State_Placeholder = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify State placeholder text for dropdown field'), 
    'Placeholder')

if (State_Placeholder == 'State') {
    println('Placeholder text for State is Correct')
} else {
    println('Placeholder text for State is NOT CORRECT')
}

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'), 
    '')

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for password field'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for password field'), 
    Label_Password)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify password placeholder text for input field'), 
    '')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Password rules heading below password input field'), 
    Pass_Rules_Heading)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 1'), 
    Pass_Rules_1)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 2'), 
    Pass_Rules_2)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 3'), 
    Pass_Rules_3)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 4'), 
    Pass_Rules_4)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 5'), 
    Pass_Rules_5)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 6'), 
    Pass_Rules_6)

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label'), 
    Label_Phone_SMS)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label 1'), 
    Label_Phone_SMS_1)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label 2'), 
    Label_Phone_SMS_2)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone placehoder text for input field'), 
    '')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify consent Message for phone checkbox field'), 
    Phone_Consent_Text)

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for DoB, Relation, Feeding, WIC fields'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for DoB, Relation, Feeding, WIC fields'), 
    Label_Baby_Rel_Info)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 - for Dob, Relation, Feeding, WIC fields'), 
    Label_Baby_Rel_Info1)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify DoB field label'), 
    Label_DoB)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify DoB palceholder text for date picker field'), 
    '')

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Why tooltip label'), 
    Label_Why)

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship to Child placeholder text for dropdown field'), 
    2)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for Relationship to Child field'), 
    Label_Relationship)

Relationship_Placeholder = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship to Child placeholder text for dropdown field'), 
    'Placeholder')

if (Relationship_Placeholder == 'Select one') {
    println('Relationship to Child placeholder text is correct')
} else {
    println('Relationship to Child placeholder text is NOT CORRECT')
}

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship to Child placeholder text for dropdown field'))

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship option 1 dropdown'), 
    Rel_Op_1)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship option 2 dropdown'), 
    Rel_Op_2)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship option 3 dropdown'), 
    Rel_Op_3)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship option 4 dropdown'), 
    Rel_Op_4)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Why tooltip label'))

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Why popup content'), 
    Why_Popup_Text)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify why popup closed'))

WebUI.verifyElementNotPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify why popup present'), 
    0)

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for How are you currently feeding your little one'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for How are you currently feeding your little one'), 
    Label_Feed)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for How are you currently feeding your little one'), 
    Label_Feed_1)

Feeding_Placeholder = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify feeding method placeholder text for dropdown field'), 
    'Placeholder')

if (Feeding_Placeholder == 'Select one') {
    println('Placeholder text of Feeding Method is correct')
} else {
    println('Placeholder text for Feeding Method is NOT CORRECT')
}

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify feeding method placeholder text for dropdown field'))

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Feeding option 1 dropdown'), 
    Feed_Op_1)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Feeding option 2 dropdown'), 
    Feed_Op_2)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Feeding option 3 dropdown'), 
    Feed_Op_3)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for WIC Status field'), 
    Label_WIC)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for WIC Status field'), 
    Label_WIC_1)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify option 1 for WIC Status field'), 
    WIC_Op_1)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify option 2 for WIC Status field'), 
    WIC_Op_2)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify option 3 for WIC Status field'), 
    WIC_Op_3)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Submit CTA'), 
    CTA)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Terms and Conditions label'), 
    Terms_Head)

WebUI.verifyElementText(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify disclaimer for terms'), 
    Terms_Disclaimer)

WebUI.closeBrowser()

