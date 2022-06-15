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

WebUI.scrollToElement(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify label for WIC Status field'), 
    0)

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in WIC Status field', 
        [('WIC_Option') : Select_WIC_Value]))

if (WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in WIC Status field', 
        [('WIC_Option') : Select_WIC_Value]), Font_Color) == 'rgba(0, 37, 122, 1)') {
    //Wic_Selected_Value = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in WIC Status field', 
    //  [('WIC_Option') : Select_WIC_Value]))
    Wic_Label_Value = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Select option in WIC Status field', 
            [('WIC_Option') : Select_WIC_Value]), 'for')

    Wic_Input_Value = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Wic Selected Option', 
            [('WIC_Option') : Select_WIC_Value]), 'id')

    if (Wic_Label_Value == Wic_Input_Value) {
        Wic_Input_Value1 = WebUI.getAttribute(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Wic Selected Option', 
                [('WIC_Option') : Select_WIC_Value]), 'value')

        Submitted_Wic_Option = println(Wic_Input_Value1)
    }
}

