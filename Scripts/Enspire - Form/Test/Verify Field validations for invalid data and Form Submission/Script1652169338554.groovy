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

WebUI.navigateToUrl(GlobalVariable.HomePage)

WebUI.waitForElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    3)

WebUI.verifyElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    0)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

WebUI.mouseOver(findTestObject('Nutramigen/Field Validation for invalid data/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Verify hover on Offers and Savings menu'))

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Verify Nutramigen in Menu'))

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Submit CTA'), 
    0)

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify submit with all fields empty'))

WebUI.scrollToElement(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert message at top of the form layout'), 
    0)

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert message at top of the form layout'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert message at top of the form layout'), 
    'Please correct all highlighted errors and try again!')

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - first name field'), 
    First_Name_Empty_Alert)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - last name field'), 
    Last_Name_Empty_Alert)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Email field'), 
    Email_Empty_Alert)

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for address fields'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Street field'), 
    Street_Address_Empty_Alert)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - City field'), 
    City_Empty_Alert)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - State field'), 
    State_Not_Selected_Alert)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - zip code field'), 
    Zip_Code_Empty_Alert)

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for password field'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Password field'), 
    Password_Empty_Alert)

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for DOB, Relationship to Child, Feeding Method, WIC Status'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - DoB field'), 
    DOB_Empty_Alert)

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship to Child placeholder text for dropdown field'), 
    0)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - relationship field'), 
    Relationship_Not_Selected_Alert)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - WIC status field'), 
    WIC_Not_Selected_Alert)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'))

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'), 
    InVal_First_Name)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Last Name placeholder text for input field'))

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - first name field'), 
    First_Name_Invalid_Alert)

InvalFirstAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - first name field'), 
    Font_Color)

WebUI.verifyMatch(InvalFirstAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalFirstAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - first name field'), 
    Font_Size)

WebUI.verifyMatch(InvalFirstAlert_FontSize, '12px', false)

InvalFirstAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - first name field'), 
    Font_Weight)

if (InvalFirstAlert_FontWeight == 'normal') {
    println(('Font Weight of InValFirstAlert is' + InvalFirstAlert_FontWeight) + 'and is passed')
} else if (InvalFirstAlert_FontWeight == '400') {
    println(('Font Weight of InValFirstAlert is' + InvalFirstAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of InValFirstAlert is not 400 or normal')
}

InvalFirstAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - first name field'), 
    Font_Family)

WebUI.verifyMatch(InvalFirstAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float First Name Label'), 
    Float_First_Name_Label)

FloatFirstLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float First Name Label'), 
    Font_Color)

WebUI.verifyMatch(FloatFirstLabel_FontColor, 'rgba(214, 40, 57, 1)', false)

FloatFirstLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float First Name Label'), 
    Font_Size)

WebUI.verifyMatch(FloatFirstLabel_FontSize, '11px', false)

FloatFirstLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float First Name Label'), 
    Font_Weight)

if (FloatFirstLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatFirstLabel is' + FloatFirstLabel_FontWeight) + 'and is passed')
} else if (InvalFirstAlert_FontWeight == '400') {
    println(('Font Weight of FloatFirstLabel is' + FloatFirstLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatFirstLabel is not 400 or normal')
}

FloatFirstLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float First Name Label'), 
    Font_Family)

WebUI.verifyMatch(FloatFirstLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Last Name placeholder text for input field'), 
    InVal_Last_Name)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'))

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invaild alert - last name field'), 
    Last_Name_Invalid_Alert)

InvalLastAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invaild alert - last name field'), 
    Font_Color)

WebUI.verifyMatch(InvalLastAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalLastAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invaild alert - last name field'), 
    Font_Size)

WebUI.verifyMatch(InvalLastAlert_FontSize, '12px', false)

InvalLastAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invaild alert - last name field'), 
    Font_Weight)

if (InvalLastAlert_FontWeight == 'normal') {
    println(('Font Weight of InValLastAlert is' + InvalLastAlert_FontWeight) + 'and is passed')
} else if (InvalLastAlert_FontWeight == '400') {
    println(('Font Weight of InValLastAlert is' + InvalLastAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of InValLastAlert is not 400 or normal')
}

InvalLastAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invaild alert - last name field'), 
    Font_Family)

WebUI.verifyMatch(InvalLastAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Last Name Label'), 
    Float_Last_Name_Label)

FloatLastLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Last Name Label'), 
    Font_Color)

WebUI.verifyMatch(FloatLastLabel_FontColor, 'rgba(214, 40, 57, 1)', false)

FloatLastLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Last Name Label'), 
    Font_Size)

WebUI.verifyMatch(FloatLastLabel_FontSize, '11px', false)

FloatLastLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Last Name Label'), 
    Font_Weight)

if (FloatLastLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatLastLabel is' + FloatLastLabel_FontWeight) + 'and is passed')
} else if (FloatLastLabel_FontWeight == '400') {
    println(('Font Weight of FloatLastLabel is' + FloatLastLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatLastLabel is not 400 or normal')
}

FloatLastLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Last Name Label'), 
    Font_Family)

WebUI.verifyMatch(FloatLastLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'), 
    InVal_Email)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'))

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Email field'), 
    Email_Invalid_Alert)

InvalEmailAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Email field'), 
    Font_Color)

WebUI.verifyMatch(InvalEmailAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalEmailAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Email field'), 
    Font_Size)

WebUI.verifyMatch(InvalEmailAlert_FontSize, '12px', false)

InvalEmailAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Email field'), 
    Font_Weight)

if (InvalEmailAlert_FontWeight == 'normal') {
    println(('Font Weight of InValEmailAlert is' + InvalEmailAlert_FontWeight) + 'and is passed')
} else if (InvalEmailAlert_FontWeight == '400') {
    println(('Font Weight of InValEmailAlert is' + InvalEmailAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of InValEmailAlert is not 400 or normal')
}

InvalEmailAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Email field'), 
    Font_Family)

WebUI.verifyMatch(InvalEmailAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Email Label'), 
    Float_Email_Label)

FloatEmailLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Email Label'), 
    Font_Color)

WebUI.verifyMatch(FloatEmailLabel_FontColor, 'rgba(214, 40, 57, 1)', false)

FloatEmailLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Email Label'), 
    Font_Size)

WebUI.verifyMatch(FloatEmailLabel_FontSize, '11px', false)

FloatEmailLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Email Label'), 
    Font_Weight)

if (FloatEmailLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatEmailLabel is' + FloatEmailLabel_FontWeight) + 'and is passed')
} else if (FloatEmailLabel_FontWeight == '400') {
    println(('Font Weight of FloatEmailLabel is' + FloatEmailLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatEmailLabel is not 400 or normal')
}

FloatEmailLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Email Label'), 
    Font_Family)

WebUI.verifyMatch(FloatEmailLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'), 
    InVal_Street_Add)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify UnitSuiteApt placeholder text for input field'))

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Street field'), 
    Street_Address_Invalid_Alert)

InvalStreetAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Street field'), 
    Font_Color)

WebUI.verifyMatch(InvalStreetAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalStreetAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Street field'), 
    Font_Size)

WebUI.verifyMatch(InvalStreetAlert_FontSize, '12px', false)

InvalStreetAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Street field'), 
    Font_Weight)

if (InvalStreetAlert_FontWeight == 'normal') {
    println(('Font Weight of InValStreetAlert is' + InvalStreetAlert_FontWeight) + 'and is passed')
} else if (InvalStreetAlert_FontWeight == '400') {
    println(('Font Weight of InValStreetAlert is' + InvalStreetAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of InValStreetAlert is not 400 or normal')
}

InvalStreetAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Street field'), 
    Font_Family)

WebUI.verifyMatch(InvalStreetAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Street Label'), 
    Float_Street_Label)

FloatStreetLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Street Label'), 
    Font_Color)

WebUI.verifyMatch(FloatStreetLabel_FontColor, 'rgba(214, 40, 57, 1)', false)

FloatStreetLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Street Label'), 
    Font_Size)

WebUI.verifyMatch(FloatStreetLabel_FontSize, '11px', false)

FloatStreetLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Street Label'), 
    Font_Weight)

if (FloatStreetLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatStreetLabel is' + FloatStreetLabel_FontWeight) + 'and is passed')
} else if (FloatStreetLabel_FontWeight == '400') {
    println(('Font Weight of FloatStreetLabel is' + FloatStreetLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatStreetLabel is not 400 or normal')
}

FloatStreetLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Street Label'), 
    Font_Family)

WebUI.verifyMatch(FloatStreetLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify UnitSuiteApt placeholder text for input field'), 
    InVal_Unit_Add)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'))

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Unit field'), 
    Unit_Suite_Invalid_Alert)

InvalUnitAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Unit field'), 
    Font_Color)

WebUI.verifyMatch(InvalUnitAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalUnitAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Unit field'), 
    Font_Size)

WebUI.verifyMatch(InvalUnitAlert_FontSize, '12px', false)

InvalUnitAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Unit field'), 
    Font_Weight)

if (InvalUnitAlert_FontWeight == 'normal') {
    println(('Font Weight of InValUnitAlert is' + InvalUnitAlert_FontWeight) + 'and is passed')
} else if (InvalUnitAlert_FontWeight == '400') {
    println(('Font Weight of InValUnitAlert is' + InvalUnitAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of InValUnitAlert is not 400 or normal')
}

InvalUnitAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Unit field'), 
    Font_Family)

WebUI.verifyMatch(InvalUnitAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Unit Label'), 
    Float_Unit_Label)

FloatUnitLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Unit Label'), 
    Font_Color)

WebUI.verifyMatch(FloatUnitLabel_FontColor, 'rgba(214, 40, 57, 1)', false)

FloatUnitLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Unit Label'), 
    Font_Size)

WebUI.verifyMatch(FloatUnitLabel_FontSize, '11px', false)

FloatUnitLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Unit Label'), 
    Font_Weight)

if (FloatUnitLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatUnitLabel is' + FloatUnitLabel_FontWeight) + 'and is passed')
} else if (FloatUnitLabel_FontWeight == '400') {
    println(('Font Weight of FloatUnitLabel is' + FloatUnitLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatUnitLabel is not 400 or normal')
}

FloatUnitLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Unit Label'), 
    Font_Family)

WebUI.verifyMatch(FloatUnitLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'), 
    InVal_City_Add)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify State placeholder text for dropdown field'))

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - City field'), 
    City_Invalid_Alert)

InvalCityAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - City field'), 
    Font_Color)

WebUI.verifyMatch(InvalCityAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalCityAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - City field'), 
    Font_Size)

WebUI.verifyMatch(InvalCityAlert_FontSize, '12px', false)

InvalCityAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - City field'), 
    Font_Weight)

if (InvalCityAlert_FontWeight == 'normal') {
    println(('Font Weight of InValCityAlert is' + InvalCityAlert_FontWeight) + 'and is passed')
} else if (InvalCityAlert_FontWeight == '400') {
    println(('Font Weight of InValCityAlert is' + InvalCityAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of InValCityAlert is not 400 or normal')
}

InvalCityAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - City field'), 
    Font_Family)

WebUI.verifyMatch(InvalCityAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float City Label'), 
    Float_City_Label)

FloatCityLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float City Label'), 
    Font_Color)

WebUI.verifyMatch(FloatCityLabel_FontColor, 'rgba(214, 40, 57, 1)', false)

FloatCityLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float City Label'), 
    Font_Size)

WebUI.verifyMatch(FloatCityLabel_FontSize, '11px', false)

FloatCityLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float City Label'), 
    Font_Weight)

if (FloatCityLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatCityLabel is' + FloatCityLabel_FontWeight) + 'and is passed')
} else if (FloatCityLabel_FontWeight == '400') {
    println(('Font Weight of FloatCityLabel is' + FloatCityLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatCityLabel is not 400 or normal')
}

FloatCityLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float City Label'), 
    Font_Family)

WebUI.verifyMatch(FloatCityLabel_FontFamily, '"Open Sans"', false)

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify selecting an option in State field', 
        [('State') : State_Select_Value]))

State_Option_Selected = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify option selected in State field'))

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'))

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'), 
    InVal_Zip)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify password placeholder text for input field'))

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Zip code field'), 
    Zip_Code_Invalid_Alert)

InvalZipAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Zip code field'), 
    Font_Color)

WebUI.verifyMatch(InvalZipAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalZipAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Zip code field'), 
    Font_Size)

WebUI.verifyMatch(InvalZipAlert_FontSize, '12px', false)

InvalZipAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Zip code field'), 
    Font_Weight)

if (InvalZipAlert_FontWeight == 'normal') {
    println(('Font Weight of InValZipAlert is' + InvalZipAlert_FontWeight) + 'and is passed')
} else if (InvalZipAlert_FontWeight == '400') {
    println(('Font Weight of InValZipAlert is' + InvalZipAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of InValZipAlert is not 400 or normal')
}

InvalZipAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Zip code field'), 
    Font_Family)

WebUI.verifyMatch(InvalZipAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Zip Label'), 
    Float_Zip_Label)

FloatZipLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Zip Label'), 
    Font_Color)

WebUI.verifyMatch(FloatZipLabel_FontColor, 'rgba(214, 40, 57, 1)', false)

FloatZipLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Zip Label'), 
    Font_Size)

WebUI.verifyMatch(FloatZipLabel_FontSize, '11px', false)

FloatZipLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Zip Label'), 
    Font_Weight)

if (FloatZipLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatZipLabel is' + FloatZipLabel_FontWeight) + 'and is passed')
} else if (FloatZipLabel_FontWeight == '400') {
    println(('Font Weight of FloatZipLabel is' + FloatZipLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatZipLabel is not 400 or normal')
}

FloatZipLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Zip Label'), 
    Font_Family)

WebUI.verifyMatch(FloatZipLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify password placeholder text for input field'), 
    InVal_Pass)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone placehoder text for input field'))

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Password field'), 
    Password_Not_Matching_Rules)

InvalPassAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Password field'), 
    Font_Color)

WebUI.verifyMatch(InvalPassAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalPassAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Password field'), 
    Font_Size)

WebUI.verifyMatch(InvalPassAlert_FontSize, '12px', false)

InvalPassAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Password field'), 
    Font_Weight)

if (InvalPassAlert_FontWeight == 'normal') {
    println(('Font Weight of InValPassAlert is' + InvalPassAlert_FontWeight) + 'and is passed')
} else if (InvalPassAlert_FontWeight == '400') {
    println(('Font Weight of InValPassAlert is' + InvalPassAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of InValPassAlert is not 400 or normal')
}

InvalPassAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Password field'), 
    Font_Family)

WebUI.verifyMatch(InvalPassAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Password Label'), 
    Float_Pass_Label)

FloatPassLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Password Label'), 
    Font_Color)

WebUI.verifyMatch(FloatPassLabel_FontColor, 'rgba(214, 40, 57, 1)', false)

FloatPassLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Password Label'), 
    Font_Size)

WebUI.verifyMatch(FloatPassLabel_FontSize, '11px', false)

FloatPassLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Password Label'), 
    Font_Weight)

if (FloatPassLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatPassLabel is' + FloatPassLabel_FontWeight) + 'and is passed')
} else if (FloatPassLabel_FontWeight == '400') {
    println(('Font Weight of FloatPassLabel is' + FloatPassLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatPassLabel is not 400 or normal')
}

FloatPassLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Password Label'), 
    Font_Family)

WebUI.verifyMatch(FloatPassLabel_FontFamily, '"Open Sans"', false)

Checkbox_Not_Checked = WebUI.verifyElementNotChecked(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Phone consent checkbox present'), 
    0)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone placehoder text for input field'), 
    InVal_Phone)

WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Phone consent checkbox present'), 
    0)

WebUI.check(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Phone consent checkbox present'))

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Phone field'), 
    Mobile_Invalid_Alert)

InvalPhoneAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Phone field'), 
    Font_Color)

WebUI.verifyMatch(InvalPhoneAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalPhoneAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Phone field'), 
    Font_Size)

WebUI.verifyMatch(InvalPhoneAlert_FontSize, '12px', false)

InvalPhoneAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Phone field'), 
    Font_Weight)

if (InvalPhoneAlert_FontWeight == 'normal') {
    println(('Font Weight of InValPhoneAlert is' + InvalPhoneAlert_FontWeight) + 'and is passed')
} else if (InvalPhoneAlert_FontWeight == '400') {
    println(('Font Weight of InValPhoneAlert is' + InvalPhoneAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of InValPhoneAlert is not 400 or normal')
}

InvalPhoneAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Phone field'), 
    Font_Family)

WebUI.verifyMatch(InvalPhoneAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Phone Label'), 
    Float_Mobile_Label)

FloatPhoneLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Phone Label'), 
    Font_Color)

WebUI.verifyMatch(FloatPhoneLabel_FontColor, 'rgba(214, 40, 57, 1)', false)

FloatPhoneLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Phone Label'), 
    Font_Size)

WebUI.verifyMatch(FloatPhoneLabel_FontSize, '11px', false)

FloatPhoneLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Phone Label'), 
    Font_Weight)

if (FloatPhoneLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatPhoneLabel is' + FloatPhoneLabel_FontWeight) + 'and is passed')
} else if (FloatPhoneLabel_FontWeight == '400') {
    println(('Font Weight of FloatPhoneLabel is' + FloatPhoneLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatPhoneLabel is not 400 or normal')
}

FloatPhoneLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Float Phone Label'), 
    Font_Family)

WebUI.verifyMatch(FloatPhoneLabel_FontFamily, '"Open Sans"', false)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship to Child placeholder text for dropdown field'))

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in Relationship field', 
        [('Relationship') : Select_Relation_Value]))

Relationship_Option_Selected = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify option selected in Relationship field'))

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify How are currently feeding you little one placeholder text for dropdown field'))

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in Feeding Method field', 
        [('Feeding') : Select_Feeding_Value]))

Feeding_Option_Selected = WebUI.getText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify option selected in Feeding Method field'))

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for WIC Status field'), 
    0)

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in WIC Status field', 
        [('WIC_Option') : Select_WIC_Value]))

