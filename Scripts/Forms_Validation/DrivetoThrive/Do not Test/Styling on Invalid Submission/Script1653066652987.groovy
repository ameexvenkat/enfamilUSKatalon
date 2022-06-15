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

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Submit CTA'), 
    0)

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify submit with all fields empty'))

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify alert message at top of the form layout'), 
    FailureHandling.OPTIONAL)

InvalFirstAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - first name field'), 
    Font_Color)

WebUI.verifyMatch(InvalFirstAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalFirstAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - first name field'), 
    Font_Size)

WebUI.verifyMatch(InvalFirstAlert_FontSize, '12px', false)

InvalFirstAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - first name field'), 
    Font_Weight)

WebUI.verifyMatch(InvalFirstAlert_FontWeight, 'normal', false)

InvalFirstAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - first name field'), 
    Font_Family)

WebUI.verifyMatch(InvalFirstAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

InvalLastAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invaild alert - last name field'), 
    Font_Color)

WebUI.verifyMatch(InvalLastAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalLastAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invaild alert - last name field'), 
    Font_Size)

WebUI.verifyMatch(InvalLastAlert_FontSize, '12px', false)

InvalLastAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invaild alert - last name field'), 
    Font_Weight)

WebUI.verifyMatch(InvalLastAlert_FontWeight, 'normal', false)

InvalLastAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invaild alert - last name field'), 
    Font_Family)

WebUI.verifyMatch(InvalLastAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

InvalEmailAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Email field'), 
    Font_Color)

WebUI.verifyMatch(InvalEmailAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalEmailAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Email field'), 
    Font_Size)

WebUI.verifyMatch(InvalEmailAlert_FontSize, '12px', false)

InvalEmailAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Email field'), 
    Font_Weight)

WebUI.verifyMatch(InvalEmailAlert_FontWeight, 'normal', false)

InvalEmailAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Email field'), 
    Font_Family)

WebUI.verifyMatch(InvalEmailAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

InvalStreetAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Street field'), 
    Font_Color)

WebUI.verifyMatch(InvalStreetAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalStreetAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Street field'), 
    Font_Size)

WebUI.verifyMatch(InvalStreetAlert_FontSize, '12px', false)

InvalStreetAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Street field'), 
    Font_Weight)

WebUI.verifyMatch(InvalStreetAlert_FontWeight, 'normal', false)

InvalStreetAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Street field'), 
    Font_Family)

WebUI.verifyMatch(InvalStreetAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

InvalUnitAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Unit field'), 
    Font_Color)

WebUI.verifyMatch(InvalUnitAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalUnitAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Unit field'), 
    Font_Size)

WebUI.verifyMatch(InvalUnitAlert_FontSize, '12px', false)

InvalUnitAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Unit field'), 
    Font_Weight)

WebUI.verifyMatch(InvalUnitAlert_FontWeight, 'normal', false)

InvalUnitAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Unit field'), 
    Font_Family)

WebUI.verifyMatch(InvalUnitAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

InvalCityAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - City field'), 
    Font_Color)

WebUI.verifyMatch(InvalCityAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalCityAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - City field'), 
    Font_Size)

WebUI.verifyMatch(InvalCityAlert_FontSize, '12px', false)

InvalCityAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - City field'), 
    Font_Weight)

WebUI.verifyMatch(InvalCityAlert_FontWeight, 'normal', false)

InvalCityAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - City field'), 
    Font_Family)

WebUI.verifyMatch(InvalCityAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

InvalZipAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Zip code field'), 
    Font_Color)

WebUI.verifyMatch(InvalZipAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalZipAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Zip code field'), 
    Font_Size)

WebUI.verifyMatch(InvalZipAlert_FontSize, '12px', false)

InvalZipAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Zip code field'), 
    Font_Weight)

WebUI.verifyMatch(InvalZipAlert_FontWeight, 'normal', false)

InvalZipAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Zip code field'), 
    Font_Family)

WebUI.verifyMatch(InvalZipAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

InvalPassAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Password field'), 
    Font_Color)

WebUI.verifyMatch(InvalPassAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalPassAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Password field'), 
    Font_Size)

WebUI.verifyMatch(InvalPassAlert_FontSize, '12px', false)

InvalPassAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Password field'), 
    Font_Weight)

WebUI.verifyMatch(InvalPassAlert_FontWeight, 'normal', false)

InvalPassAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Password field'), 
    Font_Family)

WebUI.verifyMatch(InvalPassAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

InvalPhoneAlert_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Phone field'), 
    Font_Color)

WebUI.verifyMatch(InvalPhoneAlert_FontColor, 'rgba(206, 17, 38, 1)', false)

InvalPhoneAlert_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Phone field'), 
    Font_Size)

WebUI.verifyMatch(InvalPhoneAlert_FontSize, '12px', false)

InvalPhoneAlert_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Phone field'), 
    Font_Weight)

WebUI.verifyMatch(InvalPhoneAlert_FontWeight, 'normal', false)

InvalPhoneAlert_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify invalid alert - Phone field'), 
    Font_Family)

WebUI.verifyMatch(InvalPhoneAlert_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

