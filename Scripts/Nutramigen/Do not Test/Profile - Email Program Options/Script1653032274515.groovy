import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/')

WebUI.waitForElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    3)

WebUI.verifyElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    0)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

WebUI.click(findTestObject('Nutramigen/Do not Test/Login Object info/Verify sign-in link in header'))

WebUI.verifyElementPresent(findTestObject('Nutramigen/Do not Test/Login Object info/Verify sign-in popup is showing'), 0)

WebUI.sendKeys(findTestObject('Nutramigen/Do not Test/Login Object info/Verify entering email'), 'mithun.uat3011_enroll01@gmail.com')

WebUI.focus(findTestObject('Nutramigen/Do not Test/Login Object info/Verify entering password'))

WebUI.sendKeys(findTestObject('Nutramigen/Do not Test/Login Object info/Verify entering password'), 'Ameexusa@1')

WebUI.click(findTestObject('Nutramigen/Do not Test/Login Object info/Verify Sign in button in popup'))

WebUI.delay(10)

WebUI.mouseOver(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify user is logged in'))

WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify My Profile under My Account Nav'), 
    0)

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify My Profile under My Account Nav'))

WebUI.waitForPageLoad(5)

WebUI.delay(5)

My_Profile_URL = WebUI.getUrl()

//WebUI.verifyMatch(My_Profile_URL, My_Profile_URL_Input, false)
WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify My Subscriptions tab'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify My Subscriptions tab'), 
    'My Subscriptions')

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify My Subscriptions tab'))

WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify My Subscriptions tab - Ele Text'), 
    0)

Profile_Phone_Prefill = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Phone Prefill'), 
    'value')

String[] Profile_Phone_Prefill_Split = Profile_Phone_Prefill.split('-')

println(Profile_Phone_Prefill_Split[0])

println(Profile_Phone_Prefill_Split[1])

println(Profile_Phone_Prefill_Split[2])

Profile_Phone_Prefill_combine = WebUI.concatenate(((['Profile_Phone_Prefill_Split[0]', 'Profile_Phone_Prefill_Split[1]', 'Profile_Phone_Prefill_Split[2]']) as String[]), 
    FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyMatch(Submitted_Phone, Profile_Phone_Prefill_combine, false)
for (i = 1; i <= 2; i++) {
    Porfile_Phone_Checkbox_CSS_Prop = WebUI.getCSSValue(findTestObject('Nutramigen/Do not Test/Profile - Verify css prop of text messages subscriptions', 
            [('Phone_Checkbox_CSS_Property') : i]), 'border-top-color')

    Profile_Phone_Checkbox_CSS_Input_Element = WebUI.getCSSValue(findTestObject('Nutramigen/Do not Test/Verify css prop of input label', 
            [('Phone_Checkbox_CSS_Property') : i]), 'padding')

    if (Porfile_Phone_Checkbox_CSS_Prop == 'rgba(148, 148, 148, 1)') {
        Profile_Phone_Checkbox_Checked = WebUI.getText(findTestObject('Nutramigen/Do not Test/Profile - Verify subscrip checked based on css prop'))

        println(('Phone Subscriptions ' + Profile_Phone_Checkbox_Checked) + ' is NOT checked')
    } /*WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Phone Checkbox Property', 
            [('Phone_Checkbox_Property') : i]), 'value')

    Profile_Phone_Checkbox_Property = WebUI.verifyElementChecked(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Phone Checkbox Property', 
            [('Phone_Checkbox_Property') : i]), 0)

    if (Profile_Phone_Checkbox_Property == 'checked') {
        Profile_Phone_Checkbox_Value_Prefills = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Phone Checkbox Prefills', 
                [('Phone_Checkbox_Property') : i]))

        Profile_Phone_Checkbox_Value_Prefills_1 = println(('Phone Checkbox' + Profile_Phone_Checkbox_Value_Prefills) + 'is checked')
    } else {
        Profile_Phone_Checkbox_Value_Prefills = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Phone Checkbox Prefills', 
                [('Phone_Checkbox_Property') : i]))

        Profile_Phone_Checkbox_Value_Prefills_1 = println(('Phone Checkbox' + Profile_Phone_Checkbox_Value_Prefills) + 'is NOT checked')
    }*/
    else if (Porfile_Phone_Checkbox_CSS_Prop == 'rgba(0, 37, 122, 1)') {
        Profile_Phone_Checkbox_Checked = WebUI.getText(findTestObject('Nutramigen/Do not Test/Profile - Verify subscrip checked based on css prop'))

        println(('Phone Subscriptions ' + Profile_Phone_Checkbox_Checked) + ' is checked')
    }
}

