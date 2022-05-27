import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/')

WebUI.waitForElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    3)

WebUI.verifyElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    0)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

WebUI.mouseOver(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify hover on Offers and Savings Menu'))

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Verify Nutramigen in Menu'))

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    0)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'))

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'), 
    Val_First_Name)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Last Name placeholder text for input field'))

Submitted_First_Name = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'), 
    'Value')

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float First Name Label'), 
    Float_First_Name_Label)

FloatValFirstLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float First Name Label'), 
    Font_Color)

WebUI.verifyMatch(FloatValFirstLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValFirstLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float First Name Label'), 
    Font_Size)

WebUI.verifyMatch(FloatValFirstLabel_FontSize, '11px', false)

FloatValFirstLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float First Name Label'), 
    Font_Weight)

if (FloatValFirstLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValFirstLabel is' + FloatValFirstLabel_FontWeight) + 'and is passed')
} else if (FloatValFirstLabel_FontWeight == '400') {
    println(('Font Weight of FloatValFirstLabel is' + FloatValFirstLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValFirstLabel is not 400 or normal')
}

FloatValFirstLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float First Name Label'), 
    Font_Family)

WebUI.verifyMatch(FloatValFirstLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Last Name placeholder text for input field'), 
    Val_Last_Name)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'))

Submitted_Last_Name = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Last Name placeholder text for input field'), 
    'Value')

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Last Name Label'), 
    Float_Last_Name_Label)

FloatValLastLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Last Name Label'), 
    Font_Color)

WebUI.verifyMatch(FloatValLastLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValLastLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Last Name Label'), 
    Font_Size)

WebUI.verifyMatch(FloatValLastLabel_FontSize, '11px', false)

FloatValLastLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Last Name Label'), 
    Font_Weight)

if (FloatValLastLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValLastLabel is' + FloatValLastLabel_FontWeight) + 'and is passed')
} else if (FloatValLastLabel_FontWeight == '400') {
    println(('Font Weight of FloatValLastLabel is' + FloatValLastLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValLastLabel is not 400 or normal')
}

FloatValLastLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Last Name Label'), 
    Font_Family)

WebUI.verifyMatch(FloatValLastLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'), 
    Val_Email)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'))

Submitted_Email = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'), 
    'Value')

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Email Label'), 
    Float_Email_Label)

FloatValEmailLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Email Label'), 
    Font_Color)

WebUI.verifyMatch(FloatValEmailLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValEmailLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Email Label'), 
    Font_Size)

WebUI.verifyMatch(FloatValEmailLabel_FontSize, '11px', false)

FloatValEmailLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Email Label'), 
    Font_Weight)

if (FloatValEmailLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValEmailLabel is' + FloatValEmailLabel_FontWeight) + 'and is passed')
} else if (FloatValEmailLabel_FontWeight == '400') {
    println(('Font Weight of FloatValEmailLabel is' + FloatValEmailLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValEmailLabel is not 400 or normal')
}

FloatValEmailLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Email Label'), 
    Font_Family)

WebUI.verifyMatch(FloatValEmailLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'), 
    Val_Street_Add)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify UnitSuiteApt placeholder text for input field'))

Submitted_Street_Add = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'), 
    'Value')

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Street Label'), 
    Float_Street_Label)

FloatValStreetLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Street Label'), 
    Font_Color)

WebUI.verifyMatch(FloatValStreetLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValStreetLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Street Label'), 
    Font_Size)

WebUI.verifyMatch(FloatValStreetLabel_FontSize, '11px', false)

FloatValStreetLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Street Label'), 
    Font_Weight)

if (FloatValStreetLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValStreetLabel is' + FloatValStreetLabel_FontWeight) + 'and is passed')
} else if (FloatValEmailLabel_FontWeight == '400') {
    println(('Font Weight of FloatValStreetLabel is' + FloatValStreetLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValStreetLabel is not 400 or normal')
}

FloatValStreetLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Street Label'), 
    Font_Family)

WebUI.verifyMatch(FloatValStreetLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify UnitSuiteApt placeholder text for input field'), 
    Val_Unit_Add)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'))

Submitted_Unit_Add = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify UnitSuiteApt placeholder text for input field'), 
    'Value')

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Unit Label'), 
    Float_Unit_Label)

FloatValUnitLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Unit Label'), 
    Font_Color)

WebUI.verifyMatch(FloatValUnitLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValUnitLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Unit Label'), 
    Font_Size)

WebUI.verifyMatch(FloatValUnitLabel_FontSize, '11px', false)

FloatValUnitLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Unit Label'), 
    Font_Weight)

if (FloatValUnitLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValStreetLabel is' + FloatValUnitLabel_FontWeight) + 'and is passed')
} else if (FloatValUnitLabel_FontWeight == '400') {
    println(('Font Weight of FloatValStreetLabel is' + FloatValUnitLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValStreetLabel is not 400 or normal')
}

FloatValUnitLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Unit Label'), 
    Font_Family)

WebUI.verifyMatch(FloatValUnitLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'), 
    Val_City_Add)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify State placeholder text for dropdown field'))

Submitted_City_Add = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'), 
    'Value')

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float City Label'), 
    Float_City_Label)

FloatValCityLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float City Label'), 
    Font_Color)

WebUI.verifyMatch(FloatValCityLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValCityLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float City Label'), 
    Font_Size)

WebUI.verifyMatch(FloatValCityLabel_FontSize, '11px', false)

FloatValCityLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float City Label'), 
    Font_Weight)

if (FloatValCityLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValCityLabel is' + FloatValCityLabel_FontWeight) + 'and is passed')
} else if (FloatValUnitLabel_FontWeight == '400') {
    println(('Font Weight of FloatValCityLabel is' + FloatValCityLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValCityLabel is not 400 or normal')
}

FloatValCityLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float City Label'), 
    Font_Family)

WebUI.verifyMatch(FloatValCityLabel_FontFamily, '"Open Sans"', false)

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify selecting an option in State field', 
        [('State') : State_Select_Value]))

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'))

Submitted_State = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify option selected in State field'))

Submitted_State_Code = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify State code'), 
    'Value')

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float State Label'), 
    Float_State_Label)

FloatValStateLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float State Label'), 
    Font_Color)

WebUI.verifyMatch(FloatValStateLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValStateLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float State Label'), 
    Font_Size)

WebUI.verifyMatch(FloatValStateLabel_FontSize, '11px', false)

FloatValStateLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float State Label'), 
    Font_Weight)

if (FloatValStateLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValStateLabel is' + FloatValStateLabel_FontWeight) + 'and is passed')
} else if (FloatValUnitLabel_FontWeight == '400') {
    println(('Font Weight of FloatValStateLabel is' + FloatValStateLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValStateLabel is not 400 or normal')
}

FloatValStateLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float State Label'), 
    Font_Family)

WebUI.verifyMatch(FloatValStateLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'), 
    Val_Zip_Code)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify password placeholder text for input field'))

Submitted_Zip = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'), 
    'Value')

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Zip Label'), 
    Float_Zip_Label)

FloatValZipLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Zip Label'), 
    Font_Color)

WebUI.verifyMatch(FloatValZipLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValZipLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Zip Label'), 
    Font_Size)

WebUI.verifyMatch(FloatValZipLabel_FontSize, '11px', false)

FloatValZipLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Zip Label'), 
    Font_Weight)

if (FloatValZipLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValZipLabel is' + FloatValZipLabel_FontWeight) + 'and is passed')
} else if (FloatValUnitLabel_FontWeight == '400') {
    println(('Font Weight of FloatValZipLabel is' + FloatValZipLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValZipLabel is not 400 or normal')
}

FloatValZipLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Zip Label'), 
    Font_Family)

WebUI.verifyMatch(FloatValZipLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify password placeholder text for input field'), 
    Val_Pass)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone placehoder text for input field'))

Submitted_Pass = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify password placeholder text for input field'), 
    'Value')

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Password Label'), 
    Float_Pass_Label)

FloatValPassLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Password Label'), 
    Font_Color)

WebUI.verifyMatch(FloatValPassLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValPassLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Password Label'), 
    Font_Size)

WebUI.verifyMatch(FloatValPassLabel_FontSize, '11px', false)

FloatValPassLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Password Label'), 
    Font_Weight)

if (FloatValPassLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValPassLabel is' + FloatValPassLabel_FontWeight) + 'and is passed')
} else if (FloatValUnitLabel_FontWeight == '400') {
    println(('Font Weight of FloatValPassLabel is' + FloatValPassLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValPassLabel is not 400 or normal')
}

FloatValPassLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Password Label'), 
    Font_Family)

WebUI.verifyMatch(FloatValPassLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone placehoder text for input field'), 
    Val_Phone)

if (Checkbox_to_be_Checked == 'Yes') {
    WebUI.check(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Phone consent checkbox present'))
}

Submitted_Phone = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone placehoder text for input field'), 
    'Value')

Checkbox_Attribute = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Phone Consent Checkbox Attribute'), 
    'aria-checked')

Checkbox_Attribute1 = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Phone Consent Checkbox Attribute'), 
    'aria-checked')

if (Checkbox_Attribute && (Checkbox_Attribute1 == 'true')) {
    Submitted_Checkbox_Value = println('Checkbox is checked')
} else if (Checkbox_Attribute && (Checkbox_Attribute1 == 'false')) {
    Submitted_Checkbox_Value = println('Checkbox is NOT checked')
}

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify DoB field label'), 
    0)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify DoB palceholder text for date picker field'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Dob To Select', 
        [('Date_Dob') : Dob_Select]))

Date_Selected = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Dob Selected'), 
    Dob_Selected)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship to Child placeholder text for dropdown field'))

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in Relationship field', 
        [('Relationship') : Select_Relation_Value]))

Submitted_Relationship = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify option selected in Relationship field'))

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify feeding method placeholder text for dropdown field'))

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in Feeding Method field', 
        [('Feeding') : Select_Feeding_Value]))

Submitted_Feeding = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify option selected in Feeding Method field'))

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for WIC Status field'), 
    0)

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in WIC Status field', 
        [('WIC_Option') : Select_WIC_Value]))

if (WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in WIC Status field', 
        [('WIC_Option') : Select_WIC_Value]), Font_Color) == 'rgba(0, 37, 122, 1)') {
    Wic_Label_Value = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in WIC Status field', 
            [('WIC_Option') : Select_WIC_Value]), 'for')

    Wic_Input_Value = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Wic Selected Option', 
            [('WIC_Option') : Select_WIC_Value]), 'id')

    if (Wic_Label_Value == Wic_Input_Value) {
        Submitted_Wic_Option = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Wic Selected Option', 
                [('WIC_Option') : Select_WIC_Value]), 'value')

        Submitted_Wic_Option_Case = Submitted_Wic_Option.toUpperCase()
    }
    
    for (i = 3; i != 0; i--) {
        Not_Selected_Wic = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Wic Option not selected', 
                [('Not_Selected') : i]))

        if (Submitted_Wic_Option != Not_Selected_Wic) {
            if (WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Wic Option not selected', 
                    [('Not_Selected') : i]), Font_Color) == 'rgba(33, 33, 33, 1)') {
                println(Not_Selected_Wic)
            }
        }
    }
}

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify submit with all fields empty'))

WebUI.waitForPageLoad(20)

WebUI.delay(20)

Thank_You_Page_URL = WebUI.getUrl()

WebUI.verifyMatch(Thank_You_Page_URL, Thank_You_Page_URL_Input, false)

WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify user is logged in'), 
    0)

if (No_of_Submission == 1) {
    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Hero Banner section - Eyebrow'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Hero Banner section - Eyebrow'), 
        Thank_Banner_Eyebrow)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Hero Banner - Thankyou Message'), 
        0)

    Thank_Banner_Msg = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Hero Banner - Thankyou Message'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    String[] Thank_Banner_Msg_Split = Thank_Banner_Msg.split(', ')

    WebUI.verifyMatch(Thank_Banner_Msg_Split[0], Thank_Banner_Message, false)

    Thank_Banner_Msg_Name = (Thank_Banner_Msg_Split[1])

    Thank_Banner_Msg_Name_Split = Thank_Banner_Msg_Name.split('!')

    WebUI.verifyMatch(Thank_Banner_Msg_Name_Split[0], Submitted_First_Name, false)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Featured Articles section'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Featured Articles section'), 
        Thank_Featured_Head)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Articles Cards under Featured Articles'), 
        0)

    for (i = 1; i <= 4; i++) {
        WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify each Articles Card under Featured Articles', 
                [('Articles_Card_No') : i]), 0)

        println(('Articles Card' + i) + 'present')

        WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify title in each Articles Card', 
                [('Articles_Card_No') : i]), 0)

        WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Read Time in each Articles Card', 
                [('Articles_Card_No') : i]), 0)
    }
    
    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner section - Heading'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner section - Heading'), 
        Thank_Product_Banner_Heading)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner Section - CTA'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner Section - CTA'), 
        Thank_Product_Banner_CTA)

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner Section - CTA'))

    WebUI.waitForPageLoad(10)

    WebUI.delay(10)

    Thank_Prod_Banner_CTA_URL = WebUI.getUrl()
	
	if (Thank_Prod_Banner_CTA_URL == 'https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/products/nutramigen-powder-infant-formula/') {
		println ('Product Banner click and URL is passed')
	}
	else {
		WebUI.verifyMatch(Thank_Prod_Banner_CTA_URL, Thank_Prod_Banner_CTA_URL_Input, false)
	}

    WebUI.navigateToUrl(Thank_You_Page_URL_Input)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Title'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Title'), 
        Thank_App_Carousel_Head)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Description'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Description'), 
        Thank_App_Carousel_Description)

    for (i = 1; i <= 2; i++) {
        WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section - App Img', 
                [('App_Image') : i]), 0)

        println(('App image' + i) + 'is present')
    }
    
    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section - Slider'), 
        0)

    for (i = 1; i <= 4; i++) {
        WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider dots', 
                [('sliders') : i]), 0)

        WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider dots'))

        WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section - Different Sliders', 
                [('sliders') : i]), 0)

        WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider image', 
                [('sliders') : i]), 0)

        WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider Heading', 
                [('sliders') : i]), 0)

        WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider Info', 
                [('sliders') : i]), 0)
    }
    
    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider Previous'), 
        0)

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider Previous'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider Next'), 
        0)

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider Next'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop section - Heading'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop section - Heading'), 
        Thank_Shop_Section_Heading)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description'), 
        'Enter code ')

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description_1'), 
        'WELCOME')

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description_2'), 
        ' at checkout for 10% off your order. ')

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - CTA'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - CTA'), 
        Thank_Shop_Section_CTA)

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - CTA'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    Thank_Shop_Section_CTA_URL = WebUI.getUrl()

    WebUI.verifyMatch(Thank_Shop_Section_CTA_URL, Thank_Shop_Section_CTA_URL_Input, false)

    WebUI.navigateToUrl(Thank_You_Page_URL_Input)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section'), 
        Thank_Guarantee_Heading)

    for (i = 1; i <= 3; i++) {
        WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section - Image', 
                [('image_icon') : i]), 0)

        WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section - Info Heading', 
                [('Guarantee_Heading') : i]), 0)

        WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section - Info Description', 
                [('Guarantee_Description') : 'i']), 0 //if (Profile_EM_Prog_Options)
            //Do you want to receive special offers and information through email?
            //Email Program Options
            //Promotion Options
            //println(Profile_EM_Prog_Options + 'This checkbox is checked')
            //println(Profile_EM_Prog_Options + 'This checkbox is NOT checked')
            //println(('Special Offers' + Profile_Sp_Offers_Prefill) + 'option is checked')
            //println(('Special Offers' + Profile_Sp_Offers_Prefill) + 'option is NOT checked')
            //println(('Special Offers' + Profile_Sp_Offers_Prefill) + 'option is checked')
            //println(('Special Offers' + Profile_Sp_Offers_Prefill) + 'option is NOT checked')
            )
    }
} else if (No_of_Submission != 1) {
    WebUI.mouseOver(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify user is logged in'))

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify My Profile under My Account Nav'), 
        0)

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify My Profile under My Account Nav'))

    WebUI.waitForPageLoad(5)

    WebUI.delay(5)

    My_Profile_URL = WebUI.getUrl()

    WebUI.verifyMatch(My_Profile_URL, My_Profile_URL_Input, false)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify My Info tab'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify My Info tab'), 
        'My Information')

    Profile_First_Name_Prefill = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify First Name Prefill'), 
        'value')

    WebUI.verifyMatch(Submitted_First_Name, Profile_First_Name_Prefill, false)

    Profile_Last_Name_Prefill = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Last Name Prefill'), 
        'value')

    WebUI.verifyMatch(Submitted_Last_Name, Profile_Last_Name_Prefill, false)

    Profile_Email_Prefill = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Prefill'), 
        'value')

    WebUI.verifyMatch(Submitted_Email, Profile_Email_Prefill, false)

    Profile_Street_Add_Prefill = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Street Address Prefill'), 
        'value')

    WebUI.verifyMatch(Submitted_Street_Add, Profile_Street_Add_Prefill, false)

    Profile_Unit_Add_Prefill = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Unit Address Prefill'), 
        'value')

    WebUI.verifyMatch(Submitted_Unit_Add, Profile_Unit_Add_Prefill, false)

    Profile_City_Add_Prefill = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify City Prefill'), 
        'value')

    WebUI.verifyMatch(Submitted_City_Add, Profile_City_Add_Prefill, false)

    Profile_State_Prefill = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify State Prefill'))

    WebUI.verifyMatch(Submitted_State, Profile_State_Prefill, false)

    Profile_State_Code_Prefill = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify State Code for State Prefilled'), 
        'value')

    WebUI.verifyMatch(Submitted_State_Code, Profile_State_Code_Prefill, false)

    Profile_Zip_Prefill = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Zipcode Prefill'), 
        'value')

    WebUI.verifyMatch(Submitted_Zip, Profile_Zip_Prefill, false)

    for (i = 1; i <= 3; i++) {
        Profile_WIC_Property = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify WIC options property', 
                [('WIC_Option_Property') : i]), 'aria-checked')

        if (Profile_WIC_Property == 'true') {
            Profile_WIC_Option_Prefill = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify WIC Option Prefill', 
                    [('WIC_Option_Property') : i]), FailureHandling.CONTINUE_ON_FAILURE)

            Profile_WIC_Option_Prefill_Case = Profile_WIC_Option_Prefill.toUpperCase()

            WebUI.verifyMatch(Submitted_Wic_Option_Case, Profile_WIC_Option_Prefill_Case, false)
        }
    }
    
    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify My Preg and Baby tab'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify My Preg and Baby tab'), 
        'My Pregnancy and Baby')

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify My Preg and Baby tab'))

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify My Preg and Baby - Add Preg CTA'), 
        0)

    Profile_Date_Selected_Prefill = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Dob Selected Prefill'), 
        'value')

    WebUI.verifyMatch(Date_Selected, Profile_Date_Selected_Prefill, false)

    for (i = 1; i <= 4; i++) {
        Profile_Relation_Property = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Relationship options property', 
                [('Relation_Option_Property') : i]), 'aria-checked')

        if (Profile_Relation_Property == 'true') {
            Profile_Relationship_Prefill = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Relationship Option Prefill', 
                    [('Relation_Option_Property') : i]), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.verifyMatch(Submitted_Relationship, Profile_Relationship_Prefill, false)
        }
    }
    
    for (i = 1; i <= 5; i++) {
        Profile_Feeding_Property = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Feeding options property', 
                [('Feeding_Option_Property') : i]), 'aria-checked')

        if (Profile_Feeding_Property == 'true') {
            Profile_Feeding_Prefill = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Feeding Option Prefill', 
                    [('Feeding_Option_Property') : i]), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.verifyMatch(Submitted_Feeding, Profile_Feeding_Prefill, false)
        }
    }
    
    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify My Subscriptions tab'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify My Subscriptions tab'), 
        'My Subscriptions')

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify My Subscriptions tab'))

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify My Subscriptions tab - Ele Text'), 
        0)

    for (i = 1; i <= 2; i++) {
        Profile_Sp_Offers_Property = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Sp.Offers options property', 
                [('Sp_Offers_Property') : i]), 'aria-checked')

        if (Profile_Sp_Offers_Property == 'true') {
            Profile_Sp_Offers_Prefill = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Sp.Offers Option Prefill', 
                    [('Sp_Offers_Property') : i]), FailureHandling.CONTINUE_ON_FAILURE)

            Profile_Sp_Offers_Prefill_1 = println(('Special Offers' + Profile_Sp_Offers_Prefill) + 'option is checked')
        } else if (Profile_Sp_Offers_Property != 'true') {
            Profile_Sp_Offers_Prefill = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Sp.Offers Option Prefill', 
                    [('Sp_Offers_Property') : i]), FailureHandling.CONTINUE_ON_FAILURE)

            Profile_Sp_Offers_Prefill_1 = println(('Special Offers' + Profile_Sp_Offers_Prefill) + 'option is NOT checked')
        }
    }
	
	for (i = 1; i <= 5; i++) {
		WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options',
				[('Em_Prog_Options') : i]), 'value', FailureHandling.CONTINUE_ON_FAILURE)
	
		//WebUI.verifyElementHasAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options',
		//       [('Em_Prog_Options') : i]), 'checked', 0)
		if (WebUI.verifyElementHasAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options',
				[('Em_Prog_Options') : i]), 'checked', 0)) {
			String[] Profile_EM_Prog_Prefills_Checked = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options Prefill',
					[('Em_Prog_Options') : i]), FailureHandling.CONTINUE_ON_FAILURE)
	
			Profile_EM_Prog_Prefills_1 = println(('Email Program Options' + (Profile_EM_Prog_Prefills_Checked[i])) + 'is checked')
		}
		
		else if (WebUI.verifyElementNotHasAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options',
				[('Em_Prog_Options') : i]), 'checked', 0)) {
			String[] Profile_EM_Prog_Prefills_Not_Checked = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options Prefill',
					[('Em_Prog_Options') : i]), FailureHandling.CONTINUE_ON_FAILURE)
	
			Profile_EM_Prog_Prefills_1 = println(('Email Program Options' + (Profile_EM_Prog_Prefills_Not_Checked[i])) + 'is NOT checked')
		}
	}
	
	if (WebUI.verifyElementNotHasAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options',
		[('Em_Prog_Options') : 2]), 'checked', 0) && WebUI.verifyElementNotHasAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options',
		[('Em_Prog_Options') : 4]), 'checked', 0) && WebUI.verifyElementNotHasAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options',
		[('Em_Prog_Options') : 5]), 'checked', 0)) {
		if (WebUI.verifyElementHasAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options',
			[('Em_Prog_Options') : 1]), 'checked', 0) && WebUI.verifyElementHasAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options',
			[('Em_Prog_Options') : 3]), 'checked', 0)) {
		println('Enfamil Family Beginnings and Nutramigen Savings and Support Programs are opted by the user')
	} else {
		println('Expected program options are not opted by user or additional program options are opted that are not permitted')
	}
	} else {
	println('Expected program options are not opted by user or additional program options are opted that are not permitted')
	}
    
    /*for (i = 1; i <= 5; i++) {
        WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options', 
                [('Em_Prog_Options') : i]), 'value')

        WebUI.verifyElementHasAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options', 
                [('Em_Prog_Options') : i]), 'checked', 0)

        Profile_EM_Prog_Options = WebUI.verifyElementAttributeValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options', 
                [('Em_Prog_Options') : i]), 'checked', 'true', 0)

        Profile_EM_Prog_Checked = WebUI.verifyElementChecked(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options', 
                [('Em_Prog_Options') : i]), 0)

        if (Profile_EM_Prog_Checked == 'checked') {
            Profile_EM_Prog_Prefills = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options Prefill', 
                    [('Em_Prog_Options') : i]))

            Profile_EM_Prog_Prefills_1 = println(('Email Program Options' + Profile_EM_Prog_Prefills) + 'is checked')
        } else {
            Profile_EM_Prog_Prefills = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options Prefill', 
                    [('Em_Prog_Options') : i]))

            Profile_EM_Prog_Prefills_1 = println(('Email Program Options' + Profile_EM_Prog_Prefills) + 'is NOT checked')
        }
    } */
    
    for (i = 1; i <= 2; i++) {
        Profile_Promotion_Options_Property = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Promotion Options Property', 
                [('Promotion_Options_Property') : i]), 'aria-checked')

        if (Profile_Promotion_Options_Property == 'true') {
            Profile_Promotion_Options_Prefills = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Promotion Options Prefill', 
                    [('Promotion_Options_Property') : i]), FailureHandling.CONTINUE_ON_FAILURE)

            Profile_Promotion_Options_Prefills_1 = println(('Promotion Options' + Profile_Promotion_Options_Prefills) + 
                'is checked')
        } else if (Profile_Promotion_Options_Property != 'true') {
            Profile_Promotion_Options_Prefills = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Promotion Options Prefill', 
                    [('Promotion_Options_Property') : i]), FailureHandling.CONTINUE_ON_FAILURE)

            Profile_Promotion_Options_Prefills_1 = println(('Promotion Options' + Profile_Promotion_Options_Prefills) + 
                'is NOT checked')
        }
    }
    
    for (i = 2; i >= 0; i--) {
        Profile_Postal_Mail_Property = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Postal Mailings Property', 
                [('Postal_Mail_Property') : i]), 'aria-checked')

        if (Profile_Postal_Mail_Property != 'true') {
            Profile_Postal_Mail_Prefills = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Postal Mailings Prefill', 
                    [('Postal_Mail_Property') : i]))

            Profile_Postal_Mail_Prefills_1 = println(('Postal Mailings Options' + Profile_Postal_Mail_Prefills) + 'is NOT checked')
        } else if (Profile_Postal_Mail_Property == 'true') {
            Profile_Postal_Mail_Prefills = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Postal Mailings Prefill', 
                    [('Postal_Mail_Property') : i]))

            Profile_Postal_Mail_Prefills_1 = println(('Postal Mailings Options' + Profile_Postal_Mail_Prefills) + 'is checked')
        }
    }
    
    Profile_Phone_Prefill = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Phone Prefill'), 
        'value')

    String[] Profile_Phone_Prefill_Split = Profile_Phone_Prefill.split('-')

    println(Profile_Phone_Prefill_Split[0])

    println(Profile_Phone_Prefill_Split[1])

    println(Profile_Phone_Prefill_Split[2])

    Profile_Phone_Prefill_combine = WebUI.concatenate(((['Profile_Phone_Prefill_Split[0]', 'Profile_Phone_Prefill_Split[1]'
                , 'Profile_Phone_Prefill_Split[2]']) as String[]), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyMatch(Submitted_Phone, Profile_Phone_Prefill_combine, false)

    for (i = 1; i <= 2; i++) {
        WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Phone Checkbox Property', 
                [('Phone_Checkbox_Property') : i]), 'value')

        Profile_Phone_Checkbox_Property = WebUI.verifyElementChecked(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Phone Checkbox Property', 
                [('Phone_Checkbox_Property') : i]), 0)

        if (Profile_Phone_Checkbox_Property == 'checked') {
            Profile_Phone_Checkbox_Value_Prefills = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Phone Checkbox Prefills', 
                    [('Phone_Checkbox_Property') : i]))

            Profile_Phone_Checkbox_Value_Prefills_1 = println(('Phone Checkbox' + Profile_Phone_Checkbox_Value_Prefills) + 
                'is checked')
        } else {
            Profile_Phone_Checkbox_Value_Prefills = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Phone Checkbox Prefills', 
                    [('Phone_Checkbox_Property') : i]))

            Profile_Phone_Checkbox_Value_Prefills_1 = println(('Phone Checkbox' + Profile_Phone_Checkbox_Value_Prefills) + 
                'is NOT checked')
        }
    }
    
    Profile_Unsubscribe_Property = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Unsubscribe From All'), 
        'aria-checked')

    if (Profile_Unsubscribe_Property == 'true') {
        Profile_Unsubscribe_Prefills = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Unsubscribe From All Prefill'))

        Profile_Unsubscribe_Prefills_1 = println(('Unsubscribe From All' + Profile_Unsubscribe_Prefills) + 'is checked')
    } else {
        Profile_Unsubscribe_Prefills = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Unsubscribe From All Prefill'))

        Profile_Unsubscribe_Prefills_1 = println(('Unsubscribe From All' + Profile_Unsubscribe_Prefills) + 'is NOT checked')
    }
    
    WebUI.closeBrowser()

    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/nutramigen-savings-and-support-program/')

    WebUI.waitForPageLoad(5)

    WebUI.waitForElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
        3)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
        0)

    WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

    WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
        0)

    WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'), 
        Val_First_Name)

    WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Last Name placeholder text for input field'), 
        Val_Last_Name)

    WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'), 
        Val_Email)

    WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'), 
        Val_Street_Add)

    WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'), 
        Val_City_Add)

    WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify State placeholder text for dropdown field'))

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify selecting an option in State field', 
            [('State') : State_Select_Value]))

    WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'), 
        Val_Zip_Code)

    WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify password placeholder text for input field'), 
        Val_Pass)

    WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify DoB palceholder text for date picker field'), 
        FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Dob To Select', 
            [('Date_Dob') : Dob_Select]))

    WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship to Child placeholder text for dropdown field'))

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in Relationship field', 
            [('Relationship') : Select_Relation_Value]))

    Submitted_Relationship = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify option selected in Relationship field'))

    WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify feeding method placeholder text for dropdown field'))

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in Feeding Method field', 
            [('Feeding') : Select_Feeding_Value]))

    Submitted_Feeding = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify option selected in Feeding Method field'))

    WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for WIC Status field'), 
        0)

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in WIC Status field', 
            [('WIC_Option') : Select_WIC_Value]))

    if (WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in WIC Status field', 
            [('WIC_Option') : Select_WIC_Value]), Font_Color) == 'rgba(0, 37, 122, 1)') {
        Wic_Label_Value = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in WIC Status field', 
                [('WIC_Option') : Select_WIC_Value]), 'for')

        Wic_Input_Value = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Wic Selected Option', 
                [('WIC_Option') : Select_WIC_Value]), 'id')

        if (Wic_Label_Value == Wic_Input_Value) {
            Submitted_Wic_Option = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Wic Selected Option', 
                    [('WIC_Option') : Select_WIC_Value]), 'value')

            Submitted_Wic_Option_Case = Submitted_Wic_Option.toUpperCase()
        }
        
        for (i = 3; i != 0; i--) {
            Not_Selected_Wic = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Wic Option not selected', 
                    [('Not_Selected') : i]))

            if (Submitted_Wic_Option != Not_Selected_Wic) {
                if (WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Wic Option not selected', 
                        [('Not_Selected') : i]), Font_Color) == 'rgba(33, 33, 33, 1)') {
                    println(Not_Selected_Wic)
                }
            }
        }
    }
    
    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify submit with all fields empty'))

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Multiple Submission Error at top'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Multiple Submission Error at top'), 
        Multi_Err_Msg)
}

