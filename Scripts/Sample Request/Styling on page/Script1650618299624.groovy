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

HeroTitle_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify hero banner title'), 
    Font_Color)

WebUI.verifyMatch(HeroTitle_FontColor, 'rgba(255, 255, 255, 1)', false)

HeroTitle_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify hero banner title'), 
    Font_Size)

WebUI.verifyMatch(HeroTitle_FontSize, '64px', false)

HeroTitle_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify hero banner title'), 
    Font_Weight)

if (HeroTitle_FontWeight == 'normal') {
    println(('Font Weight of HeroTitle is' + HeroTitle_FontWeight) + 'and is passed')
} else if (HeroTitle_FontWeight == '400') {
    println(('Font Weight of HeroTitle is' + HeroTitle_FontWeight) + 'and is passed')
} else {
    println('Font Weight of HeroTitle is not 400 or normal')
}

HeroTitle_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify hero banner title'), 
    Font_Family)

WebUI.verifyMatch(HeroTitle_FontFamily, '"Quatro Slab", Arial, Helvetica, sans-serif', false)

HeroDes_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify description in hero banner section below title'), 
    Font_Color)

WebUI.verifyMatch(HeroDes_FontColor, 'rgba(255, 255, 255, 1)', false)

HeroDes_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify description in hero banner section below title'), 
    Font_Size)

WebUI.verifyMatch(HeroDes_FontSize, '16px', false)

HeroDes_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify description in hero banner section below title'), 
    Font_Family)

WebUI.verifyMatch(HeroTitle_FontFamily, '"Quatro Slab", Arial, Helvetica, sans-serif', false)

FormLayout_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    Font_Color)

WebUI.verifyMatch(FormLayout_FontColor, 'rgba(0, 37, 122, 1)', false)

FormLayout_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    Font_Size)

WebUI.verifyMatch(FormLayout_FontSize, '12px', false)

FormLayout_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    Font_Weight)

if (FormLayout_FontWeight == 'bold') {
    println(('Font Weight of FormLayout is' + FormLayout_FontWeight) + 'and is passed')
} else if (FormLayout_FontWeight == '700') {
    println(('Font Weight of FormLayout is' + FormLayout_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FormLayout is not 700 or bold')
}

FormLayout_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    Font_Family)

WebUI.verifyMatch(FormLayout_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif\'', false)

FirstNameLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for First Name, Last Name, Email'), 
    Font_Color)

WebUI.verifyMatch(FirstNameLabel_FontColor, 'rgba(0, 37, 122, 1)', false)

FirstNameLabel_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for First Name, Last Name, Email'), 
    Font_Size)

WebUI.verifyMatch(FirstNameLabel_FontSize, '18px', false)

FirstNameLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for First Name, Last Name, Email'), 
    Font_Weight)

if (FirstNameLabel_FontWeight == 'normal') {
    println(('Font Weight of FirstNameLabel is' + FirstNameLabel_FontWeight) + 'and is passed')
} else if (FirstNameLabel_FontWeight == '400') {
    println(('Font Weight of FirstNameLabel is' + FirstNameLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FirstNameLabel is not 400 or normal')
}

FirstNameLabel_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for First Name, Last Name, Email'), 
    Font_Family)

WebUI.verifyMatch(FirstNameLabel_FontFamily, '"Quatro Slab Semi-Bold", Arial, Helvetica, sans-serif', false)

FirstNameHolder_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'), 
    Font_Color)

WebUI.verifyMatch(FirstNameHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

FirstNameHolder_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'), 
    Font_Size)

WebUI.verifyMatch(FirstNameHolder_FontSize, '14px', false)

LasttNameHolder_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify Last Name placeholder text - Sample Request'), 
    Font_Color)

WebUI.verifyMatch(LasttNameHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

LasttNameHolder_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify Last Name placeholder text - Sample Request'), 
    Font_Size)

WebUI.verifyMatch(LasttNameHolder_FontSize, '14px', false)

EmailHolder_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'), 
    Font_Color)

WebUI.verifyMatch(EmailHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

EmailHolder_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'), 
    Font_Size)

WebUI.verifyMatch(EmailHolder_FontSize, '14px', false)

AddressLabel_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify label for address field - Styling - Sample Request'), 
    Font_Color)

WebUI.verifyMatch(AddressLabel_FontColor, 'rgba(0, 37, 122, 1)', false)

AddressLabel_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify label for address field - Styling - Sample Request'), 
    Font_Size)

WebUI.verifyMatch(AddressLabel_FontSize, '18px', false)

AddressLabel_FontWeight = WebUI.getCSSValue(findTestObject('Sample Request/Verify label for address field - Styling - Sample Request'), 
    Font_Weight)

if (AddressLabel_FontWeight == 'normal') {
    println(('Font Weight of AddressLabel is' + AddressLabel_FontWeight) + 'and is passed')
} else if (AddressLabel_FontWeight == '400') {
    println(('Font Weight of AddressLabel is' + AddressLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of AddressLabel is not 400 or normal')
}

AddressLabel_FontFamily = WebUI.getCSSValue(findTestObject('Sample Request/Verify label for address field - Styling - Sample Request'), 
    Font_Family)

WebUI.verifyMatch(AddressLabel_FontFamily, '"Quatro Slab Semi-Bold", Arial, Helvetica, sans-serif', false)

StrHolder_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'), 
    Font_Color)

WebUI.verifyMatch(StrHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

StrHolder_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'), 
    Font_Size)

WebUI.verifyMatch(StrHolder_FontSize, '14px', false)

UniHolder_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify UnitSuiteApt placeholder text for input field'), 
    Font_Color)

WebUI.verifyMatch(UniHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

UniHolder_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify UnitSuiteApt placeholder text for input field'), 
    Font_Size)

WebUI.verifyMatch(UniHolder_FontSize, '14px', false)

CtyHolder_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'), 
    Font_Color)

WebUI.verifyMatch(CtyHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

CtyHolder_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'), 
    Font_Size)

WebUI.verifyMatch(CtyHolder_FontSize, '14px', false)

StateHolder_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify State Placeholder text dropdown - Styling - Sample Request'), 
    Font_Color)

WebUI.verifyMatch(StateHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

StateHolder_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify State Placeholder text dropdown - Styling - Sample Request'), 
    Font_Size)

WebUI.verifyMatch(StateHolder_FontSize, '14px', false)

StateHolder_FontWeight = WebUI.getCSSValue(findTestObject('Sample Request/Verify State Placeholder text dropdown - Styling - Sample Request'), 
    Font_Weight)

if (StateHolder_FontWeight == 'normal') {
    println(('Font Weight of StateHolder is' + StateHolder_FontWeight) + 'and is passed')
} else if (StateHolder_FontWeight == '400') {
    println(('Font Weight of StateHolder is' + StateHolder_FontWeight) + 'and is passed')
} else {
    println('Font Weight of StateHolder is not 400 or normal')
}

StateHolder_FontFamily = WebUI.getCSSValue(findTestObject('Sample Request/Verify State Placeholder text dropdown - Styling - Sample Request'), 
    Font_Family)

WebUI.verifyMatch(StateHolder_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

ZipHolder_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'), 
    Font_Color)

WebUI.verifyMatch(ZipHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

ZipHolder_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'), 
    Font_Size)

WebUI.verifyMatch(ZipHolder_FontSize, '14px', false)

DobRelFeedWicLabel_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify label for DoB field - Sample Request'), 
    Font_Color)

WebUI.verifyMatch(DobRelFeedWicLabel_FontColor, 'rgba(0, 37, 122, 1)', false)

DobRelFeedWicLabel_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify label for DoB field - Sample Request'), 
    Font_Size)

WebUI.verifyMatch(DobRelFeedWicLabel_FontSize, '18px', false)

DobRelFeedWicLabel_FontWeight = WebUI.getCSSValue(findTestObject('Sample Request/Verify label for DoB field - Sample Request'), 
    Font_Weight)

if (DobRelFeedWicLabel_FontWeight == 'normal') {
    println(('Font Weight of DobRelFeedWicLabel is' + DobRelFeedWicLabel_FontWeight) + 'and is passed')
} else if (DobRelFeedWicLabel_FontWeight == '400') {
    println(('Font Weight of DobRelFeedWicLabel is' + DobRelFeedWicLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of DobRelFeedWicLabel is not 400 or normal')
}

DobRelFeedWicLabel_FontFamily = WebUI.getCSSValue(findTestObject('Sample Request/Verify label for DoB field - Sample Request'), 
    Font_Family)

WebUI.verifyMatch(DobRelFeedWicLabel_FontFamily, '"Quatro Slab Semi-Bold", Arial, Helvetica, sans-serif', false)

DobRelFeedWicLabel1_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify label 1 for DoB field - Sample Request'), 
    Font_Color)

WebUI.verifyMatch(DobRelFeedWicLabel1_FontColor, 'rgba(33, 33, 33, 1)', false)

DobRelFeedWicLabel1_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify label 1 for DoB field - Sample Request'), 
    Font_Size)

WebUI.verifyMatch(DobRelFeedWicLabel1_FontSize, '14px', false)

DobRelFeedWicLabel1_FontWeight = WebUI.getCSSValue(findTestObject('Sample Request/Verify label 1 for DoB field - Sample Request'), 
    Font_Weight)

if (DobRelFeedWicLabel1_FontWeight == 'normal') {
    println(('Font Weight of DobRelFeedWicLabel_1 is' + DobRelFeedWicLabel1_FontWeight) + 'and is passed')
} else if (DobRelFeedWicLabel1_FontWeight == '400') {
    println(('Font Weight of DobRelFeedWicLabel_1 is' + DobRelFeedWicLabel1_FontWeight) + 'and is passed')
} else {
    println('Font Weight of DobRelFeedWicLabel_1 is not 400 or normal')
}

DobRelFeedWicLabel1_FontFamily = WebUI.getCSSValue(findTestObject('Sample Request/Verify label 1 for DoB field - Sample Request'), 
    Font_Family)

WebUI.verifyMatch(DobRelFeedWicLabel1_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

DobLabel_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify DoB field label - Sample Request'), Font_Color)

WebUI.verifyMatch(DobLabel_FontColor, 'rgba(33, 33, 33, 1)', false)

DobLabel_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify DoB field label - Sample Request'), Font_Size)

WebUI.verifyMatch(DobLabel_FontSize, '16px', false)

DobLabel_FontWeight = WebUI.getCSSValue(findTestObject('Sample Request/Verify DoB field label - Sample Request'), Font_Weight)

if (DobLabel_FontWeight == 'bold') {
    println(('Font Weight of DobLabel is' + DobLabel_FontWeight) + 'and is passed')
} else if (DobLabel_FontWeight == '700') {
    println(('Font Weight of DobLabel is' + DobLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of DobLabel is not 700 or bold')
}

DobLabel_FontFamily = WebUI.getCSSValue(findTestObject('Sample Request/Verify DoB field label - Sample Request'), Font_Family)

WebUI.verifyMatch(DobLabel_FontFamily, '"Open Sans"', false)

DobHolder_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify DoB placeholder text - Sample Request'), Font_Color)

WebUI.verifyMatch(DobHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

DobHolder_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify DoB placeholder text - Sample Request'), Font_Size)

WebUI.verifyMatch(DobHolder_FontSize, '14px', false)

WhyLabel_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Why tooltip label'), 
    Font_Color)

WebUI.verifyMatch(WhyLabel_FontColor, 'rgba(0, 37, 122, 1)', false)

WhyLabel_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Why tooltip label'), 
    Font_Weight)

if (WhyLabel_FontWeight == 'bold') {
    println(('Font Weight of WhyLabel is' + WhyLabel_FontWeight) + 'and is passed')
} else if (WhyLabel_FontWeight == '700') {
    println(('Font Weight of WhyLabel is' + WhyLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of WhyLabel is not 700 or bold')
}

GetMySample_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify GetMySample CTA'), Font_Color)

WebUI.verifyMatch(GetMySample_FontColor, 'rgba(255, 255, 255, 1)', false)

GetMySample_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify GetMySample CTA'), Font_Size)

WebUI.verifyMatch(GetMySample_FontSize, '16px', false)

GetMySample_FontWeight = WebUI.getCSSValue(findTestObject('Sample Request/Verify GetMySample CTA'), Font_Weight)

if (GetMySample_FontWeight == 'bold') {
    println(('Font Weight of GetMySample CTA is' + GetMySample_FontWeight) + 'and is passed')
} else if (GetMySample_FontWeight == '700') {
    println(('Font Weight of GetMySample CTA is' + GetMySample_FontWeight) + 'and is passed')
} else {
    println('Font Weight of GetMySample CTA is not 700 or bold')
}

GetMySample_BgColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify GetMySample CTA - BGColor'), BgColor)

WebUI.verifyMatch(GetMySample_BgColor, 'rgba(0, 37, 122, 1)', false)

for (def i : (1..4)) {
    TermsDis_FontColor = WebUI.getCSSValue(findTestObject('Sample Request/Verify disclaimer for terms - Sample Request', 
            [('paragraph') : i]), Font_Color)

    WebUI.verifyMatch(TermsDis_FontColor, 'rgba(33, 33, 33, 1)', false)

    TermsDis_FontSize = WebUI.getCSSValue(findTestObject('Sample Request/Verify disclaimer for terms - Sample Request', 
            [('paragraph') : i]), Font_Size)

    WebUI.verifyMatch(TermsDis_FontSize, '16px', false)

    TermsDis_FontWeight = WebUI.getCSSValue(findTestObject('Sample Request/Verify disclaimer for terms - Sample Request', 
            [('paragraph') : i]), Font_Weight)

    if (TermsDis_FontWeight == 'normal') {
        println(('Font Weight of TermsDis is' + TermsDis_FontWeight) + 'and is passed')
    } else if (TermsDis_FontWeight == '400') {
        println(('Font Weight of TermsDis is' + TermsDis_FontWeight) + 'and is passed')
    } else {
        println('Font Weight of TermsDis is not 400 or normal')
    }
    
    TermsDis_FontFamily = WebUI.getCSSValue(findTestObject('Sample Request/Verify disclaimer for terms - Sample Request', 
            [('paragraph') : i]), Font_Family)

    WebUI.verifyMatch(TermsDis_FontFamily, '"Open Sans"', false)
}

