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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/hcp-offer/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Cookie Close'))

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/BreadCrumb'), 'HomeRedeem Offer')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Banner header'), 
    'Get your offer worth up to $15 off on Enfamil NeuroPro™')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Header text'), 
    'Fill out the form below and check your email for next steps.')

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Terms and Conditions'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/First name field_Error'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Last name field_Error'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Street Address field_Error'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/UnitSuite field'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/City field_Error_Focus'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/State field_Error'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Zip Code field_Error_Focus'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Email field_Error_Focus'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Date field'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Why tooltip'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Phone field_Error_Focus'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Code Activation field'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Street address_Invalid Characters'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Retailers logo'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Note text'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Advanced Nutrition CTA'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Advanced Nutrition CTA'), 
    0)

WebUI.setText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/First name field_Error'), 
    '12345')

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Last Name_Invalid Characters'), 
    'First Name contains invalid characters.')

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_First name_Invalid Characters'))

WebUI.setText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/First name field_Error'), 
    'QATest@')

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Last Name_Invalid Characters'), 
    'First Name contains invalid characters.')

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_First name_Invalid Characters'))

WebUI.setText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/First name field_Error'), 
    'Enfamil')

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Highlighted errors'), 
    'Please correct all highlighted errors and try again!')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Last name required'), 'Last name field is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Street address_required'), 
    'Street address field is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_City field_required'), 'City field is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_State field_required'), 'State field is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_ZipCode_required'), 'Zip code field is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Email field_required'), 'Email field is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Due date_required'), 
    'Due date or birth date is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Phone number_required'), 'Phone number is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Activation code_required'), 'Activation code is required.')

WebUI.closeBrowser()

