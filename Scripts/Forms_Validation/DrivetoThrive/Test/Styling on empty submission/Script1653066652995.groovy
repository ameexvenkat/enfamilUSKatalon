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
    6)

WebUI.verifyElementPresent(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    0)

WebUI.click(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

WebUI.scrollToElement(findTestObject('DrivetoThrive/Element Text verification/Page_Nutramigen  Enfamil/Verify Submit CTA'), 
    0)

WebUI.click(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify submit with all fields empty'))

WebUI.click(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert message at top of the form layout'), 
    FailureHandling.OPTIONAL)

TopAlert_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert message at top of the form layout'), 
    Font_Color)

WebUI.verifyMatch(TopAlert_FontColor, 'rgba(169, 68, 66, 1)', false)

TopAlert_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert message at top of the form layout'), 
    Font_Size)

WebUI.verifyMatch(TopAlert_FontSize, '12px', false)

TopAlert_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert message at top of the form layout'), 
    Font_Weight)

if (TopAlert_FontWeight == 'normal') {
    println(('Font Weight of TopAlert is' + TopAlert_FontWeight) + 'and is passed')
} else if (TopAlert_FontWeight == '400') {
    println(('Font Weight of TopAlert is' + TopAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of TopAlert is not 400 or normal')
}

TopAlert_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert message at top of the form layout'), 
    Font_Family)

WebUI.verifyMatch(TopAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

TopAlert_BgColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert message at top of the form layout'), 
    BgColor)

WebUI.verifyMatch(TopAlert_BgColor, 'rgba(242, 222, 222, 1)', false)

EmtFirstAlert_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - first name field'), 
    Font_Color)

WebUI.verifyMatch(EmtFirstAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

EmtFirstAlert_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - first name field'), 
    Font_Size)

WebUI.verifyMatch(EmtFirstAlert_FontSize, '12px', false)

EmtFirstAlert_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - first name field'), 
    Font_Weight)

if (EmtFirstAlert_FontWeight == 'normal') {
    println(('Font Weight of EmtFirstAlert is' + EmtFirstAlert_FontWeight) + 'and is passed')
} else if (EmtFirstAlert_FontWeight == '400') {
    println(('Font Weight of EmtFirstAlert is' + EmtFirstAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of EmtFirstAlert is not 400 or normal')
}

EmtFirstAlert_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - first name field'), 
    Font_Family)

WebUI.verifyMatch(EmtFirstAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

EmtLastAlert_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - last name field'), 
    Font_Color)

WebUI.verifyMatch(EmtLastAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

EmtLastAlert_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - last name field'), 
    Font_Size)

WebUI.verifyMatch(EmtLastAlert_FontSize, '12px', false)

EmtLastAlert_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - last name field'), 
    Font_Weight)

if (EmtLastAlert_FontWeight == 'normal') {
    println(('Font Weight of EmtLastAlert is' + EmtLastAlert_FontWeight) + 'and is passed')
} else if (EmtLastAlert_FontWeight == '400') {
    println(('Font Weight of EmtLastAlert is' + EmtLastAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of EmtLastAlert is not 400 or normal')
}

EmtLastAlert_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - last name field'), 
    Font_Family)

WebUI.verifyMatch(EmtLastAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

EmtEmailAlert_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Email field'), 
    Font_Color)

WebUI.verifyMatch(EmtEmailAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

EmtEmailAlert_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Email field'), 
    Font_Size)

WebUI.verifyMatch(EmtEmailAlert_FontSize, '12px', false)

EmtEmailAlert_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Email field'), 
    Font_Weight)

if (EmtEmailAlert_FontWeight == 'normal') {
    println(('Font Weight of EmtEmailAlert is' + EmtEmailAlert_FontWeight) + 'and is passed')
} else if (EmtEmailAlert_FontWeight == '400') {
    println(('Font Weight of EmtEmailAlert is' + EmtEmailAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of EmtEmailAlert is not 400 or normal')
}

EmtEmailAlert_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Email field'), 
    Font_Family)

WebUI.verifyMatch(EmtEmailAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

EmtStreetAlert_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Street field'), 
    Font_Color)

WebUI.verifyMatch(EmtStreetAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

EmtStreetAlert_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Street field'), 
    Font_Size)

WebUI.verifyMatch(EmtStreetAlert_FontSize, '12px', false)

EmtStreetAlert_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Street field'), 
    Font_Weight)

if (EmtStreetAlert_FontWeight == 'normal') {
    println(('Font Weight of EmtStreetAlert is' + EmtStreetAlert_FontWeight) + 'and is passed')
} else if (EmtStreetAlert_FontWeight == '400') {
    println(('Font Weight of EmtStreetAlert is' + EmtStreetAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of EmtStreetAlert is not 400 or normal')
}

EmtStreetAlert_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Street field'), 
    Font_Family)

WebUI.verifyMatch(EmtStreetAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

EmtCityAlert_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - City field'), 
    Font_Color)

WebUI.verifyMatch(EmtCityAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

EmtCityAlert_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - City field'), 
    Font_Size)

WebUI.verifyMatch(EmtCityAlert_FontSize, '12px', false)

EmtCityAlert_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - City field'), 
    Font_Weight)

if (EmtCityAlert_FontWeight == 'normal') {
    println(('Font Weight of EmtCityAlert is' + EmtCityAlert_FontWeight) + 'and is passed')
} else if (EmtCityAlert_FontWeight == '400') {
    println(('Font Weight of EmtCityAlert is' + EmtCityAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of EmtCityAlert is not 400 or normal')
}

EmtCityAlert_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - City field'), 
    Font_Family)

WebUI.verifyMatch(EmtCityAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

EmtStateAlert_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - State field'), 
    Font_Color)

WebUI.verifyMatch(EmtStateAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

EmtStateAlert_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - State field'), 
    Font_Size)

WebUI.verifyMatch(EmtStateAlert_FontSize, '12px', false)

EmtStateAlert_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - State field'), 
    Font_Weight)

if (EmtStateAlert_FontWeight == 'normal') {
    println(('Font Weight of EmtStateAlert is' + EmtStateAlert_FontWeight) + 'and is passed')
} else if (EmtStateAlert_FontWeight == '400') {
    println(('Font Weight of EmtStateAlert is' + EmtStateAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of EmtStateAlert is not 400 or normal')
}

EmtStateAlert_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - State field'), 
    Font_Family)

WebUI.verifyMatch(EmtStateAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

EmtZipAlert_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - zip code field'), 
    Font_Color)

WebUI.verifyMatch(EmtZipAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

EmtZipAlert_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - zip code field'), 
    Font_Size)

WebUI.verifyMatch(EmtZipAlert_FontSize, '12px', false)

EmtZipAlert_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - zip code field'), 
    Font_Weight)

if (EmtZipAlert_FontWeight == 'normal') {
    println(('Font Weight of EmtZipAlert is' + EmtZipAlert_FontWeight) + 'and is passed')
} else if (EmtZipAlert_FontWeight == '400') {
    println(('Font Weight of EmtZipAlert is' + EmtZipAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of EmtZipAlert is not 400 or normal')
}

EmtZipAlert_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - zip code field'), 
    Font_Family)

WebUI.verifyMatch(EmtZipAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

EmtPassAlert_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Password field'), 
    Font_Color)

WebUI.verifyMatch(EmtPassAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

EmtPassAlert_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Password field'), 
    Font_Size)

WebUI.verifyMatch(EmtPassAlert_FontSize, '12px', false)

EmtPassAlert_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Password field'), 
    Font_Weight)

if (EmtPassAlert_FontWeight == 'normal') {
    println(('Font Weight of EmtPassAlert is' + EmtPassAlert_FontWeight) + 'and is passed')
} else if (EmtPassAlert_FontWeight == '400') {
    println(('Font Weight of EmtPassAlert is' + EmtPassAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of EmtPassAlert is not 400 or normal')
}

EmtPassAlert_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - Password field'), 
    Font_Family)

WebUI.verifyMatch(EmtPassAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

EmtDobAlert_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - DoB field'), 
    Font_Color)

WebUI.verifyMatch(EmtDobAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

EmtDobAlert_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - DoB field'), 
    Font_Size)

WebUI.verifyMatch(EmtDobAlert_FontSize, '12px', false)

EmtDobAlert_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - DoB field'), 
    Font_Weight)

if (EmtDobAlert_FontWeight == 'normal') {
    println(('Font Weight of EmtDobAlert is' + EmtDobAlert_FontWeight) + 'and is passed')
} else if (EmtDobAlert_FontWeight == '400') {
    println(('Font Weight of EmtDobAlert is' + EmtDobAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of EmtDobAlert is not 400 or normal')
}

EmtDobAlert_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - DoB field'), 
    Font_Family)

WebUI.verifyMatch(EmtDobAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

EmtRelAlert_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - relationship field'), 
    Font_Color)

WebUI.verifyMatch(EmtRelAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

EmtRelAlert_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - relationship field'), 
    Font_Size)

WebUI.verifyMatch(EmtRelAlert_FontSize, '12px', false)

EmtRelAlert_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - relationship field'), 
    Font_Weight)

if (EmtRelAlert_FontWeight == 'normal') {
    println(('Font Weight of EmtRelAlert is' + EmtRelAlert_FontWeight) + 'and is passed')
} else if (EmtRelAlert_FontWeight == '400') {
    println(('Font Weight of EmtRelAlert is' + EmtRelAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of EmtRelAlert is not 400 or normal')
}

EmtRelAlert_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - relationship field'), 
    Font_Family)

WebUI.verifyMatch(EmtRelAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

EmtWicAlert_FontColor = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - WIC status field'), 
    Font_Color)

WebUI.verifyMatch(EmtWicAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

EmtWicAlert_FontSize = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - WIC status field'), 
    Font_Size)

WebUI.verifyMatch(EmtWicAlert_FontSize, '12px', false)

EmtWicAlert_FontWeight = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - WIC status field'), 
    Font_Weight)

if (EmtWicAlert_FontWeight == 'normal') {
    println(('Font Weight of EmtWicAlert is' + EmtWicAlert_FontWeight) + 'and is passed')
} else if (EmtWicAlert_FontWeight == '400') {
    println(('Font Weight of EmtWicAlert is' + EmtWicAlert_FontWeight) + 'and is passed')
} else {
    println('Font Weight of EmtWicAlert is not 400 or normal')
}

EmtWicAlert_FontFamily = WebUI.getCSSValue(findTestObject('DrivetoThrive/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert - WIC status field'), 
    Font_Family)

WebUI.verifyMatch(EmtWicAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

