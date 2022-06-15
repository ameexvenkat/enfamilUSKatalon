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

WebUI.navigateToUrl(GlobalVariable.DrivetoThrive)

WebUI.waitForElementPresent(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    3)

WebUI.verifyElementPresent(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    0)

WebUI.click(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

HeroTitle_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify hero banner title'), 
    Font_Color)

WebUI.verifyMatch(HeroTitle_FontColor, 'rgba(0, 37, 122, 1)', false)

HeroTitle_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify hero banner title'), 
    Font_Size)

WebUI.verifyMatch(HeroTitle_FontSize, '64px', false)

HeroTitle_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify hero banner title'), 
    Font_Weight)

if (HeroTitle_FontWeight == 'normal') {
    println(('Font Weight of HeroTitle is' + HeroTitle_FontWeight) + 'and is passed')
} else if (HeroTitle_FontWeight == '400') {
    println(('Font Weight of HeroTitle is' + HeroTitle_FontWeight) + 'and is passed')
} else {
    println('Font Weight of HeroTitle is not 400 or normal')
}

HeroTitle_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify hero banner title'), 
    Font_Family)

WebUI.verifyMatch(HeroTitle_FontFamily, '"Quatro Slab", Arial, Helvetica, sans-serif', false)

HeroDes_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify description in hero banner section below title'), 
    Font_Color)

WebUI.verifyMatch(HeroDes_FontColor, 'rgba(0, 37, 122, 1)', false)

HeroDes_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify description in hero banner section below title'), 
    Font_Size)

WebUI.verifyMatch(HeroDes_FontSize, '16px', false)

HeroDes_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify description in hero banner section below title'), 
    Font_Family)

WebUI.verifyMatch(HeroTitle_FontFamily, '"Quatro Slab", Arial, Helvetica, sans-serif', false)

HeroDis_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify disclaimer text in hero banner section below description'), 
    Font_Color)

WebUI.verifyMatch(HeroDis_FontColor, 'rgba(0, 37, 122, 1)', false)

HeroDis_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify disclaimer text in hero banner section below description'), 
    Font_Size)

WebUI.verifyMatch(HeroDis_FontSize, '16px', false)

HeroDis_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify disclaimer text in hero banner section below description'), 
    Font_Family)

WebUI.verifyMatch(HeroDis_FontFamily, '"Quatro Slab", Arial, Helvetica, sans-serif', false)

FormLayout_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    Font_Color)

WebUI.verifyMatch(FormLayout_FontColor, 'rgba(0, 37, 122, 1)', false)

FormLayout_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    Font_Size)

WebUI.verifyMatch(FormLayout_FontSize, '12px', false)

FormLayout_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    Font_Weight)

if (FormLayout_FontWeight == 'bold') {
    println(('Font Weight of FormLayout is' + FormLayout_FontWeight) + 'and is passed')
} else if (FormLayout_FontWeight == '700') {
    println(('Font Weight of FormLayout is' + FormLayout_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FormLayout is not 700 or bold')
}

FormLayout_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify form layout text at top'), 
    Font_Family)

WebUI.verifyMatch(FormLayout_FontFamily, '"Open Sans"', false)

FirstNameLabel_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for First Name, Last Name, Email'), 
    Font_Color)

WebUI.verifyMatch(FirstNameLabel_FontColor, 'rgba(0, 37, 122, 1)', false)

FirstNameLabel_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for First Name, Last Name, Email'), 
    Font_Size)

WebUI.verifyMatch(FirstNameLabel_FontSize, '18px', false)

FirstNameLabel_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for First Name, Last Name, Email'), 
    Font_Weight)

if (FirstNameLabel_FontWeight == 'normal') {
    println(('Font Weight of FirstNameLabel is' + FirstNameLabel_FontWeight) + 'and is passed')
} else if (FirstNameLabel_FontWeight == '400') {
    println(('Font Weight of FirstNameLabel is' + FirstNameLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FirstNameLabel is not 400 or normal')
}

FirstNameLabel_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for First Name, Last Name, Email'), 
    Font_Family)

WebUI.verifyMatch(FirstNameLabel_FontFamily, '"Quatro Slab Semi-Bold", Arial, Helvetica, sans-serif', false)

FirstNameHolder_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'), 
    Font_Color)

WebUI.verifyMatch(FirstNameHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

FirstNameHolder_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify First Name placeholder text for input field'), 
    Font_Size)

WebUI.verifyMatch(FirstNameHolder_FontSize, '14px', false)

LasttNameHolder_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Last Name placeholder text for input field'), 
    Font_Color)

WebUI.verifyMatch(LasttNameHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

LasttNameHolder_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Last Name placeholder text for input field'), 
    Font_Size)

WebUI.verifyMatch(LasttNameHolder_FontSize, '14px', false)

EmailHolder_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'), 
    Font_Color)

WebUI.verifyMatch(EmailHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

EmailHolder_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Email placeholder text for input field'), 
    Font_Size)

WebUI.verifyMatch(EmailHolder_FontSize, '14px', false)

AddressLabel_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for address field - Styling'), 
    Font_Color)

WebUI.verifyMatch(AddressLabel_FontColor, 'rgba(0, 37, 122, 1)', false)

AddressLabel_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for address field - Styling'), 
    Font_Size)

WebUI.verifyMatch(AddressLabel_FontSize, '18px', false)

AddressLabel_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for address field - Styling'), 
    Font_Weight)

if (AddressLabel_FontWeight == 'normal') {
    println(('Font Weight of AddressLabel is' + AddressLabel_FontWeight) + 'and is passed')
} else if (AddressLabel_FontWeight == '400') {
    println(('Font Weight of AddressLabel is' + AddressLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of AddressLabel is not 400 or normal')
}

AddressLabel_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for address field - Styling'), 
    Font_Family)

WebUI.verifyMatch(AddressLabel_FontFamily, '"Quatro Slab Semi-Bold", Arial, Helvetica, sans-serif', false)

AddressLabel_1_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for address field'), 
    Font_Color)

WebUI.verifyMatch(AddressLabel_1_FontColor, 'rgba(0, 0, 0, 1)', false)

AddressLabel_1_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for address field'), 
    Font_Size)

WebUI.verifyMatch(AddressLabel_1_FontSize, '16px', false)

AddressLabel_1_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for address field'), 
    Font_Weight)

if (AddressLabel_1_FontWeight == 'normal') {
    println(('Font Weight of AddressLabel_1 is' + AddressLabel_1_FontWeight) + 'and is passed')
} else if (AddressLabel_1_FontWeight == '400') {
    println(('Font Weight of AddressLabel_1 is' + AddressLabel_1_FontWeight) + 'and is passed')
} else {
    println('Font Weight of AddressLabel_1 is not 400 or normal')
}

AddressLabel_1_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for address field'), 
    Font_Family)

WebUI.verifyMatch(AddressLabel_1_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

StrHolder_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'), 
    Font_Color)

WebUI.verifyMatch(StrHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

StrHolder_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Street address placeholder text for input field'), 
    Font_Size)

WebUI.verifyMatch(StrHolder_FontSize, '14px', false)

UniHolder_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify UnitSuiteApt placeholder text for input field'), 
    Font_Color)

WebUI.verifyMatch(UniHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

UniHolder_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify UnitSuiteApt placeholder text for input field'), 
    Font_Size)

WebUI.verifyMatch(UniHolder_FontSize, '14px', false)

CtyHolder_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'), 
    Font_Color)

WebUI.verifyMatch(CtyHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

CtyHolder_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify City placeholder text for input field'), 
    Font_Size)

WebUI.verifyMatch(CtyHolder_FontSize, '14px', false)

StateHolder_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify State placeholder text for dropdown field - Styling'), 
    Font_Color)

WebUI.verifyMatch(StateHolder_FontColor, 'rgba(90, 91, 94, 1)', false)

StateHolder_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify State placeholder text for dropdown field'), 
    Font_Size)

WebUI.verifyMatch(StateHolder_FontSize, '14px', false)

StateHolder_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify State placeholder text for dropdown field'), 
    Font_Weight)

if (StateHolder_FontWeight == 'normal') {
    println(('Font Weight of StateHolder is' + StateHolder_FontWeight) + 'and is passed')
} else if (StateHolder_FontWeight == '400') {
    println(('Font Weight of StateHolder is' + StateHolder_FontWeight) + 'and is passed')
} else {
    println('Font Weight of StateHolder is not 400 or normal')
}

StateHolder_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify State placeholder text for dropdown field'), 
    Font_Family)

WebUI.verifyMatch(StateHolder_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

ZipHolder_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'), 
    Font_Color)

WebUI.verifyMatch(ZipHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

ZipHolder_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Zipcode placeholder text for input field'), 
    Font_Size)

WebUI.verifyMatch(ZipHolder_FontSize, '14px', false)

PassLabel_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for password field'), 
    Font_Color)

WebUI.verifyMatch(PassLabel_FontColor, 'rgba(0, 37, 122, 1)', false)

PassLabel_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for password field'), 
    Font_Size)

WebUI.verifyMatch(PassLabel_FontSize, '18px', false)

PassLabel_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for password field'), 
    Font_Weight)

if (PassLabel_FontWeight == 'normal') {
    println(('Font Weight of PassLabel is' + PassLabel_FontWeight) + 'and is passed')
} else if (PassLabel_FontWeight == '400') {
    println(('Font Weight of PassLabel is' + PassLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of PassLabel is not 400 or normal')
}

PassLabel_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for password field'), 
    Font_Family)

WebUI.verifyMatch(PassLabel_FontFamily, '"Quatro Slab Semi-Bold", Arial, Helvetica, sans-serif', false)

PassHolder_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify password placeholder text for input field'), 
    Font_Color)

WebUI.verifyMatch(PassHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

PassHolder_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify password placeholder text for input field'), 
    Font_Size)

WebUI.verifyMatch(PassHolder_FontSize, '14px', false)

PassRulesHead_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password rules heading below password input field'), 
    Font_Color)

WebUI.verifyMatch(PassRulesHead_FontColor, 'rgba(90, 91, 94, 1)', false)

PassRulesHead_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password rules heading below password input field'), 
    Font_Size)

WebUI.verifyMatch(PassRulesHead_FontSize, '14px', false)

PassRulesHead_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password rules heading below password input field'), 
    Font_Weight)

if (PassRulesHead_FontWeight == 'normal') {
    println(('Font Weight of PassRulesHead is' + PassRulesHead_FontWeight) + 'and is passed')
} else if (PassRulesHead_FontWeight == '400') {
    println(('Font Weight of PassRulesHead is' + PassRulesHead_FontWeight) + 'and is passed')
} else {
    println('Font Weight of PassRulesHead is not 400 or normal')
}

PassRulesHead_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password rules heading below password input field'), 
    Font_Family)

WebUI.verifyMatch(PassRulesHead_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

PassRules1_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 1'), 
    Font_Color)

WebUI.verifyMatch(PassRules1_FontColor, 'rgba(90, 91, 94, 1)', false)

PassRules1_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 1'), 
    Font_Size)

WebUI.verifyMatch(PassRules1_FontSize, '14px', false)

PassRules1_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 1'), 
    Font_Weight)

if (PassRules1_FontWeight == 'normal') {
    println(('Font Weight of PassRules1 is' + PassRules1_FontWeight) + 'and is passed')
} else if (PassRules1_FontWeight == '400') {
    println(('Font Weight of PassRules1 is' + PassRules1_FontWeight) + 'and is passed')
} else {
    println('Font Weight of PassRules1 is not 400 or normal')
}

PassRules1_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 1'), 
    Font_Family)

WebUI.verifyMatch(PassRules1_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

PassRules2_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 2'), 
    Font_Color)

WebUI.verifyMatch(PassRules2_FontColor, 'rgba(90, 91, 94, 1)', false)

PassRules2_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 2'), 
    Font_Size)

WebUI.verifyMatch(PassRules2_FontSize, '14px', false)

PassRules2_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 2'), 
    Font_Weight)

if (PassRules2_FontWeight == 'normal') {
    println(('Font Weight of PassRules2 is' + PassRules2_FontWeight) + 'and is passed')
} else if (PassRules2_FontWeight == '400') {
    println(('Font Weight of PassRules2 is' + PassRules2_FontWeight) + 'and is passed')
} else {
    println('Font Weight of PassRules2 is not 400 or normal')
}

PassRules2_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 2'), 
    Font_Family)

WebUI.verifyMatch(PassRules2_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

PassRules3_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 3'), 
    Font_Color)

WebUI.verifyMatch(PassRules3_FontColor, 'rgba(90, 91, 94, 1)', false)

PassRules3_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 3'), 
    Font_Size)

WebUI.verifyMatch(PassRules3_FontSize, '14px', false)

PassRules3_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 3'), 
    Font_Weight)

if (PassRules3_FontWeight == 'normal') {
    println(('Font Weight of PassRules3 is' + PassRules3_FontWeight) + 'and is passed')
} else if (PassRules3_FontWeight == '400') {
    println(('Font Weight of PassRules3 is' + PassRules3_FontWeight) + 'and is passed')
} else {
    println('Font Weight of PassRules3 is not 400 or normal')
}

PassRules3_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 3'), 
    Font_Family)

WebUI.verifyMatch(PassRules3_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

PassRules4_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 4'), 
    Font_Color)

WebUI.verifyMatch(PassRules4_FontColor, 'rgba(90, 91, 94, 1)', false)

PassRules4_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 4'), 
    Font_Size)

WebUI.verifyMatch(PassRules4_FontSize, '14px', false)

PassRules4_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 4'), 
    Font_Weight)

if (PassRules4_FontWeight == 'normal') {
    println(('Font Weight of PassRules4 is' + PassRules4_FontWeight) + 'and is passed')
} else if (PassRules4_FontWeight == '400') {
    println(('Font Weight of PassRules4 is' + PassRules4_FontWeight) + 'and is passed')
} else {
    println('Font Weight of PassRules4 is not 400 or normal')
}

PassRules4_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 4'), 
    Font_Family)

WebUI.verifyMatch(PassRules4_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

PassRules5_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 5'), 
    Font_Color)

WebUI.verifyMatch(PassRules5_FontColor, 'rgba(90, 91, 94, 1)', false)

PassRules5_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 5'), 
    Font_Size)

WebUI.verifyMatch(PassRules5_FontSize, '14px', false)

PassRules5_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 5'), 
    Font_Weight)

if (PassRules5_FontWeight == 'normal') {
    println(('Font Weight of PassRules5 is' + PassRules5_FontWeight) + 'and is passed')
} else if (PassRules5_FontWeight == '400') {
    println(('Font Weight of PassRules5 is' + PassRules5_FontWeight) + 'and is passed')
} else {
    println('Font Weight of PassRules5 is not 400 or normal')
}

PassRules5_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 5'), 
    Font_Family)

WebUI.verifyMatch(PassRules5_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

PassRules6_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 6'), 
    Font_Color)

WebUI.verifyMatch(PassRules6_FontColor, 'rgba(90, 91, 94, 1)', false)

PassRules6_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 6'), 
    Font_Size)

WebUI.verifyMatch(PassRules6_FontSize, '14px', false)

PassRules6_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 6'), 
    Font_Weight)

if (PassRules6_FontWeight == 'normal') {
    println(('Font Weight of PassRules6 is' + PassRules6_FontWeight) + 'and is passed')
} else if (PassRules6_FontWeight == '400') {
    println(('Font Weight of PassRules6 is' + PassRules6_FontWeight) + 'and is passed')
} else {
    println('Font Weight of PassRules6 is not 400 or normal')
}

PassRules6_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Password Rules list 6'), 
    Font_Family)

WebUI.verifyMatch(PassRules6_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

PhoneLabel_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label'), 
    Font_Color)

WebUI.verifyMatch(PhoneLabel_FontColor, 'rgba(0, 37, 122, 1)', false)

PhoneLabel_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label'), 
    Font_Size)

WebUI.verifyMatch(PhoneLabel_FontSize, '18px', false)

PhoneLabel_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label'), 
    Font_Weight)

if (PhoneLabel_FontWeight == 'normal') {
    println(('Font Weight of PhoneLabel is' + PhoneLabel_FontWeight) + 'and is passed')
} else if (PhoneLabel_FontWeight == '400') {
    println(('Font Weight of PhoneLabel is' + PhoneLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of PhoneLabel is not 400 or normal')
}

PhoneLabel_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label'), 
    Font_Family)

WebUI.verifyMatch(PhoneLabel_FontFamily, '"Quatro Slab Semi-Bold", Arial, Helvetica, sans-serif', false)

PhoneLabel1_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label 1'), 
    Font_Color)

WebUI.verifyMatch(PhoneLabel1_FontColor, 'rgba(0, 37, 122, 1)', false)

PhoneLabel1_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label 1'), 
    Font_Size)

WebUI.verifyMatch(PhoneLabel1_FontSize, '18px', false)

PhoneLabel1_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label 1'), 
    Font_Weight)

if (PhoneLabel1_FontWeight == 'normal') {
    println(('Font Weight of PhoneLabel_1 is' + PhoneLabel1_FontWeight) + 'and is passed')
} else if (PhoneLabel1_FontWeight == '400') {
    println(('Font Weight of PhoneLabel_1 is' + PhoneLabel1_FontWeight) + 'and is passed')
} else {
    println('Font Weight of PhoneLabel_1 is not 400 or normal')
}

PhoneLabel1_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label 1'), 
    Font_Family)

WebUI.verifyMatch(PhoneLabel1_FontFamily, '"Quatro Slab Semi-Bold", Arial, Helvetica, sans-serif', false)

PhoneLabel2_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label 2'), 
    Font_Color)

WebUI.verifyMatch(PhoneLabel2_FontColor, 'rgba(33, 33, 33, 1)', false)

PhoneLabel2_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label 2'), 
    Font_Size)

WebUI.verifyMatch(PhoneLabel2_FontSize, '14px', false)

PhoneLabel2_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label 2'), 
    Font_Weight)

if (PhoneLabel2_FontWeight == 'normal') {
    println(('Font Weight of PhoneLabel_2 is' + PhoneLabel2_FontWeight) + 'and is passed')
} else if (PhoneLabel2_FontWeight == '400') {
    println(('Font Weight of PhoneLabel_2 is' + PhoneLabel2_FontWeight) + 'and is passed')
} else {
    println('Font Weight of PhoneLabel_2 is not 400 or normal')
}

PhoneLabel2_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone field label 2'), 
    Font_Family)

WebUI.verifyMatch(PhoneLabel2_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

PhoneHolder_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone placehoder text for input field'), 
    Font_Color)

WebUI.verifyMatch(PhoneHolder_FontColor, 'rgba(33, 33, 33, 1)', false)

PhoneHolder_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone placehoder text for input field'), 
    Font_Size)

WebUI.verifyMatch(PhoneHolder_FontSize, '14px', false)

PhoneHolder_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone placehoder text for input field'), 
    Font_Weight)

if (PhoneHolder_FontWeight == 'normal') {
    println(('Font Weight of PhoneHolder is' + PhoneHolder_FontWeight) + 'and is passed')
} else if (PhoneHolder_FontWeight == '400') {
    println(('Font Weight of PhoneHolder is' + PhoneHolder_FontWeight) + 'and is passed')
} else {
    println('Font Weight of PhoneHolder is not 400 or normal')
}

PhoneHolder_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone placehoder text for input field'), 
    Font_Family)

WebUI.verifyMatch(PhoneHolder_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

PhoneConsent_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify consent Message for phone checkbox field'), 
    Font_Color)

WebUI.verifyMatch(PhoneConsent_FontColor, 'rgba(33, 33, 33, 1)', false)

PhoneConsent_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify consent Message for phone checkbox field'), 
    Font_Size)

WebUI.verifyMatch(PhoneConsent_FontSize, '14px', false)

PhoneConsent_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify consent Message for phone checkbox field'), 
    Font_Weight)

if (PhoneConsent_FontWeight == 'normal') {
    println(('Font Weight of PhoneConsent is' + PhoneConsent_FontWeight) + 'and is passed')
} else if (PhoneConsent_FontWeight == '400') {
    println(('Font Weight of PhoneConsent is' + PhoneConsent_FontWeight) + 'and is passed')
} else {
    println('Font Weight of PhoneConsent is not 400 or normal')
}

PhoneConsent_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify consent Message for phone checkbox field'), 
    Font_Family)

WebUI.verifyMatch(PhoneConsent_FontFamily, '"Open Sans"', false)

DobRelFeedWicLabel_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for DoB, Relation, Feeding, WIC fields'), 
    Font_Color)

WebUI.verifyMatch(DobRelFeedWicLabel_FontColor, 'rgba(0, 37, 122, 1)', false)

DobRelFeedWicLabel_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for DoB, Relation, Feeding, WIC fields'), 
    Font_Size)

WebUI.verifyMatch(DobRelFeedWicLabel_FontSize, '18px', false)

DobRelFeedWicLabel_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for DoB, Relation, Feeding, WIC fields'), 
    Font_Weight)

if (DobRelFeedWicLabel_FontWeight == 'normal') {
    println(('Font Weight of DobRelFeedWicLabel is' + DobRelFeedWicLabel_FontWeight) + 'and is passed')
} else if (DobRelFeedWicLabel_FontWeight == '400') {
    println(('Font Weight of DobRelFeedWicLabel is' + DobRelFeedWicLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of DobRelFeedWicLabel is not 400 or normal')
}

DobRelFeedWicLabel_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label for DoB, Relation, Feeding, WIC fields'), 
    Font_Family)

WebUI.verifyMatch(DobRelFeedWicLabel_FontFamily, '"Quatro Slab Semi-Bold", Arial, Helvetica, sans-serif', false)

DobRelFeedWicLabel1_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 - for Dob, Relation, Feeding, WIC fields'), 
    Font_Color)

WebUI.verifyMatch(DobRelFeedWicLabel1_FontColor, 'rgba(33, 33, 33, 1)', false)

DobRelFeedWicLabel1_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 - for Dob, Relation, Feeding, WIC fields'), 
    Font_Size)

WebUI.verifyMatch(DobRelFeedWicLabel1_FontSize, '14px', false)

DobRelFeedWicLabel1_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 - for Dob, Relation, Feeding, WIC fields'), 
    Font_Weight)

if (DobRelFeedWicLabel1_FontWeight == 'normal') {
    println(('Font Weight of DobRelFeedWicLabel_1 is' + DobRelFeedWicLabel1_FontWeight) + 'and is passed')
} else if (DobRelFeedWicLabel1_FontWeight == '400') {
    println(('Font Weight of DobRelFeedWicLabel_1 is' + DobRelFeedWicLabel1_FontWeight) + 'and is passed')
} else {
    println('Font Weight of DobRelFeedWicLabel_1 is not 400 or normal')
}

DobRelFeedWicLabel1_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 - for Dob, Relation, Feeding, WIC fields'), 
    Font_Family)

WebUI.verifyMatch(DobRelFeedWicLabel1_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

