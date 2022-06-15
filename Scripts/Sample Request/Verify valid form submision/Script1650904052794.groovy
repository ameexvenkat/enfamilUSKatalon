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

WebUI.click(findTestObject('Sample Request/Verify Enfagrow Free Sample in Menu'))

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    0)

WebUI.delay(5)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'))

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'), 
    Val_First_Name)

WebUI.focus(findTestObject('Sample Request/Verify Last Name placeholder text - Sample Request'))

Submitted_First_Name = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'), 
    'Value')

WebUI.verifyElementText(findTestObject('Sample Request/Verify Float First Name Label - Sample Request'), Float_First_Name_Label)

FloatValFirstLabel_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float First Name Label - Sample Request'), 
    Font_Color)

WebUI.verifyMatch(FloatValFirstLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValFirstLabel_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float First Name Label - Sample Request'), 
    Font_Size)

WebUI.verifyMatch(FloatValFirstLabel_FontSize, '11px', false)

FloatValFirstLabel_FontWeight = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float First Name Label - Sample Request'), 
    Font_Weight)

if (FloatValFirstLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValFirstLabel is' + FloatValFirstLabel_FontWeight) + 'and is passed')
} else if (FloatValFirstLabel_FontWeight == '400') {
    println(('Font Weight of FloatValFirstLabel is' + FloatValFirstLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValFirstLabel is not 400 or normal')
}

FloatValFirstLabel_FontFamily = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float First Name Label - Sample Request'), 
    Font_Family)

WebUI.verifyMatch(FloatValFirstLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Sample Request/Verify Last Name placeholder text - Sample Request'), Val_Last_Name)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'))

Submitted_Last_Name = WebUI.getAttribute(findTestObject('Sample Request/Verify Last Name placeholder text - Sample Request'), 
    'Value')

WebUI.verifyElementText(findTestObject('Sample Request/Verify Float Last Name Label - Sample Request'), Float_Last_Name_Label)

FloatValLastLabel_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Last Name Label - Sample Request'), 
    Font_Color)

WebUI.verifyMatch(FloatValLastLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValLastLabel_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Last Name Label - Sample Request'), 
    Font_Size)

WebUI.verifyMatch(FloatValLastLabel_FontSize, '11px', false)

FloatValLastLabel_FontWeight = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Last Name Label - Sample Request'), 
    Font_Weight)

if (FloatValLastLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValLastLabel is' + FloatValLastLabel_FontWeight) + 'and is passed')
} else if (FloatValLastLabel_FontWeight == '400') {
    println(('Font Weight of FloatValLastLabel is' + FloatValLastLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValLastLabel is not 400 or normal')
}

FloatValLastLabel_FontFamily = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Last Name Label - Sample Request'), 
    Font_Family)

WebUI.verifyMatch(FloatValLastLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'), 
    Val_Email)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'))

Submitted_Email = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'), 
    'Value')

WebUI.verifyElementText(findTestObject('Sample Request/Verify Float Email Label - Sample Request'), Float_Email_Label)

FloatValEmailLabel_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Email Label - Sample Request'), 
    Font_Color)

WebUI.verifyMatch(FloatValEmailLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValEmailLabel_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Email Label - Sample Request'), 
    Font_Size)

WebUI.verifyMatch(FloatValEmailLabel_FontSize, '11px', false)

FloatValEmailLabel_FontWeight = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Email Label - Sample Request'), 
    Font_Weight)

if (FloatValEmailLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValEmailLabel is' + FloatValEmailLabel_FontWeight) + 'and is passed')
} else if (FloatValEmailLabel_FontWeight == '400') {
    println(('Font Weight of FloatValEmailLabel is' + FloatValEmailLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValEmailLabel is not 400 or normal')
}

FloatValEmailLabel_FontFamily = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Email Label - Sample Request'), 
    Font_Family)

WebUI.verifyMatch(FloatValEmailLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'), 
    Val_Street_Add)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify UnitSuiteApt placeholder text for input field'))

Submitted_Street_Add = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'), 
    'Value')

WebUI.verifyElementText(findTestObject('Sample Request/Verify Float Street Label - Sample Request'), Float_Street_Label)

FloatValStreetLabel_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Street Label - Sample Request'), 
    Font_Color)

WebUI.verifyMatch(FloatValStreetLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValStreetLabel_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Street Label - Sample Request'), 
    Font_Size)

WebUI.verifyMatch(FloatValStreetLabel_FontSize, '11px', false)

FloatValStreetLabel_FontWeight = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Street Label - Sample Request'), 
    Font_Weight)

if (FloatValStreetLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValStreetLabel is' + FloatValStreetLabel_FontWeight) + 'and is passed')
} else if (FloatValEmailLabel_FontWeight == '400') {
    println(('Font Weight of FloatValStreetLabel is' + FloatValStreetLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValStreetLabel is not 400 or normal')
}

FloatValStreetLabel_FontFamily = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Street Label - Sample Request'), 
    Font_Family)

WebUI.verifyMatch(FloatValStreetLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify UnitSuiteApt placeholder text for input field'), 
    Val_Unit_Add)

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'))

Submitted_Unit_Add = WebUI.getAttribute(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify UnitSuiteApt placeholder text for input field'), 
    'Value')

WebUI.verifyElementText(findTestObject('Sample Request/Verify Float Unit Label - Sample Request'), Float_Unit_Label)

FloatValUnitLabel_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Unit Label - Sample Request'), 
    Font_Color)

WebUI.verifyMatch(FloatValUnitLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValUnitLabel_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Unit Label - Sample Request'), 
    Font_Size)

WebUI.verifyMatch(FloatValUnitLabel_FontSize, '11px', false)

FloatValUnitLabel_FontWeight = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Unit Label - Sample Request'), 
    Font_Weight)

if (FloatValUnitLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValStreetLabel is' + FloatValUnitLabel_FontWeight) + 'and is passed')
} else if (FloatValUnitLabel_FontWeight == '400') {
    println(('Font Weight of FloatValStreetLabel is' + FloatValUnitLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValStreetLabel is not 400 or normal')
}

FloatValUnitLabel_FontFamily = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float Unit Label - Sample Request'), 
    Font_Family)

WebUI.verifyMatch(FloatValUnitLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'), 
    Val_City_Add)

WebUI.click(findTestObject('Sample Request/Verify State Placeholder text dropdown - Sample Request'))

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

WebUI.click(findTestObject('Sample Request/Verify Selecting an option in State field - Sample Request', [('State') : State_Select_Value]))

WebUI.focus(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'))

Submitted_State = WebUI.getText(findTestObject('Sample Request/Verify option selected in State field - Sample Request'))

Submitted_State_Code = WebUI.getAttribute(findTestObject('Sample Request/Verify State Code - Sample Request'), 'Value')

WebUI.verifyElementText(findTestObject('Sample Request/Verify Float State Label - Sample Request'), Float_State_Label)

FloatValStateLabel_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float State Label - Sample Request'), 
    Font_Color)

WebUI.verifyMatch(FloatValStateLabel_FontColor, 'rgba(90, 91, 94, 1)', false)

FloatValStateLabel_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float State Label - Sample Request'), 
    Font_Size)

WebUI.verifyMatch(FloatValStateLabel_FontSize, '11px', false)

FloatValStateLabel_FontWeight = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float State Label - Sample Request'), 
    Font_Weight)

if (FloatValStateLabel_FontWeight == 'normal') {
    println(('Font Weight of FloatValStateLabel is' + FloatValStateLabel_FontWeight) + 'and is passed')
} else if (FloatValUnitLabel_FontWeight == '400') {
    println(('Font Weight of FloatValStateLabel is' + FloatValStateLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FloatValStateLabel is not 400 or normal')
}

FloatValStateLabel_FontFamily = WebUI.getCSSValue(findTestObject('Sample Request/Verify Float State Label - Sample Request'), 
    Font_Family)

WebUI.verifyMatch(FloatValStateLabel_FontFamily, '"Open Sans"', false)

WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'), 
    Val_Zip_Code)

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

WebUI.scrollToElement(findTestObject('Sample Request/Verify DoB field label - Sample Request'), 0)

WebUI.click(findTestObject('Sample Request/Verify DoB placeholder text - Sample Request'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Dob To Select', 
        [('Date_Dob') : Dob_Select]))

Date_Selected = WebUI.getAttribute(findTestObject('Sample Request/Verify Dob Selected - Sample Request'), Dob_Selected)

WebUI.click(findTestObject('Sample Request/Verify GetMySample CTA'))

WebUI.waitForPageLoad(20)

WebUI.delay(20)

Thank_You_Page_URL = WebUI.getUrl()

WebUI.verifyMatch(Thank_You_Page_URL, Thank_You_Page_URL_Input, false)

if (No_of_Submission == 1) {
    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Hero Banner section - Eyebrow'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Hero Banner section - Eyebrow'), 
        Thank_Banner_Eyebrow)

    WebUI.verifyElementPresent(findTestObject('Sample Request/Verify Hero Banner - Thankyou Message - Sample Request'), 
        0)

    WebUI.verifyElementText(findTestObject('Sample Request/Verify Hero Banner - Thankyou Message - Sample Request'), Thank_Banner_Message)

    WebUI.verifyElementPresent(findTestObject('Sample Request/Verify Title below Hero Banner - Sample Request'), 0)

    WebUI.verifyElementText(findTestObject('Sample Request/Verify Title below Hero Banner - Sample Request'), Thank_Title_Below_Banner)

    WebUI.verifyElementPresent(findTestObject('Sample Request/Verify Thank Description below Hero Banner - Sample Request'), 
        0)

    WebUI.verifyElementText(findTestObject('Sample Request/Verify Thank Description below Hero Banner - Sample Request'), 
        Thank_Description_Below_Banner)

    String[] Thank_Title_Below_Banner_Split = Thank_Title_Below_Banner.split('Dr')

    Thank_Title_Below_Banner_combine = WebUI.concatenate(((['Thank_Title_Below_Banner_Split[0]', ' Dr', 'Thank_Title_Below_Banner_Split[1]']) as String[]), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyMatch(Thank_Title_Below_Banner_Split[0], Thank_Title_Below_Banner, false)

    /*Thank_Banner_Msg_Name = (Thank_Banner_Msg_Split[1])

    Thank_Banner_Msg_Name_Split = Thank_Banner_Msg_Name.split('!')

    WebUI.verifyMatch(Thank_Banner_Msg_Name_Split[0], Submitted_First_Name, false) */
    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Featured Articles section'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Featured Articles section'), 
        Thank_Featured_Head)

    WebUI.verifyElementPresent(findTestObject('Sample Request/Verify Articles Cards under Featured Articles - Sample Request'), 
        0)

    for (i = 1; i <= 4; i++) {
        WebUI.verifyElementPresent(findTestObject('Sample Request/Verify Articles Cards under Featured Articles - Sample Request'), 
            0)

        println(('Articles Card' + i) + 'present')

        WebUI.verifyElementPresent(findTestObject('Sample Request/Verify title in each Articles Card - Sample Request'), 
            0)

        WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Read Time in each Articles Card', 
                [('Articles_Card_No') : i]), 0)
    }
    
    WebUI.scrollToElement(findTestObject('Sample Request/Verify Product Banner section - Heading -Sample Request'), 0)

    WebUI.verifyElementPresent(findTestObject('Sample Request/Verify Product Banner section - Heading -Sample Request'), 
        0)

    WebUI.verifyElementText(findTestObject('Sample Request/Verify Product Banner section - Heading -Sample Request'), Thank_Product_Banner_Heading)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner Section - CTA'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner Section - CTA'), 
        Thank_Product_Banner_CTA)

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner Section - CTA'))

    WebUI.waitForPageLoad(10)

    WebUI.delay(10)

    Thank_Prod_Banner_CTA_URL = WebUI.getUrl()

    if (Thank_Prod_Banner_CTA_URL == 'https://enfamil-us.frontend.test.us-east-1.starterkit.rbcloud.io/products/enfagrow-premium-toddler-next-step-natural-milk-powder') {
        println('Product Banner click and URL is passed')
    } else {
        WebUI.verifyMatch(Thank_Prod_Banner_CTA_URL, Thank_Prod_Banner_CTA_URL_Input, false)
    }
    
    WebUI.navigateToUrl(Thank_You_Page_URL_Input)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop section - Heading'), 
        0)

    WebUI.scrollToElement(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop section - Heading'), 
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
        ' at checkout for 10% off your order.')

    WebUI.scrollToElement(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - CTA'), 
        0)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - CTA'), 
        0)

    WebUI.verifyElementText(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - CTA'), 
        Thank_Shop_Section_CTA)

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - CTA'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(20)

    Thank_Shop_Section_CTA_URL = WebUI.getUrl()

    WebUI.verifyMatch(Thank_Shop_Section_CTA_URL, Thank_Shop_Section_CTA_URL_Input, false)

    WebUI.navigateToUrl(Thank_You_Page_URL_Input)

    WebUI.scrollToElement(findTestObject('Sample Request/Verify Guarantee Section - Sample Request'), 0)

    WebUI.verifyElementPresent(findTestObject('Sample Request/Verify Guarantee Section - Sample Request'), 0)

    WebUI.verifyElementText(findTestObject('Sample Request/Verify Guarantee Section - Sample Request'), Thank_Guarantee_Heading)

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
            //WebUI.verifyElementHasAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Profile - Verify Email Program Options',
            //       [('Em_Prog_Options') : i]), 'checked', 0)
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
    } */ )
    }
} else if (No_of_Submission != 1) {
    WebUI.closeBrowser()

    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/toddler-sample-request/')

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

    WebUI.sendKeys(findTestObject('Sample Request/Verify Last Name placeholder text - Sample Request'), Val_Last_Name)

    WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'), 
        Val_Email)

    WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'), 
        Val_Street_Add)

    WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'), 
        Val_City_Add)

    WebUI.click(findTestObject('Sample Request/Verify State Placeholder text dropdown - Sample Request'))

    WebUI.click(findTestObject('Sample Request/Verify Selecting an option in State field - Sample Request', [('State') : State_Select_Value]))

    WebUI.sendKeys(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'), 
        Val_Zip_Code)

    WebUI.click(findTestObject('Sample Request/Verify DoB placeholder text - Sample Request'), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Dob To Select', 
            [('Date_Dob') : Dob_Select]))

    WebUI.click(findTestObject('Sample Request/Verify GetMySample CTA'))

    WebUI.verifyElementPresent(findTestObject('Sample Request/Verify Multiple Submission Error at top - Sample Request'), 
        0)

    WebUI.scrollToElement(findTestObject('Sample Request/Verify Multiple Submission Error at top - Sample Request'), 0)

    WebUI.verifyElementText(findTestObject('Sample Request/Verify Multiple Submission Error at top - Sample Request'), Multi_Err_Msg)
}

