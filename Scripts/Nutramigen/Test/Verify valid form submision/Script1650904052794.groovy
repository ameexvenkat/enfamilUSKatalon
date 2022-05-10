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

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/')

WebUI.waitForElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    3)

WebUI.verifyElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    0)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

WebUI.mouseOver(findTestObject('Nutramigen/Field Validation for invalid data/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Verify hover on Offers and Savings menu'))

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

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify How are currently feeding you little one placeholder text for dropdown field'))

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

