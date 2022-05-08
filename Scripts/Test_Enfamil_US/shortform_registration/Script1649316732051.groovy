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

WebUI.navigateToUrl('https://enfamil-us.ameexcloud.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/shortform/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_First name_registerGivenNameField'))

WebUI.setText(findTestObject('Object Repository/shortform/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_First name_registerGivenNameField_1_2_3_4_5_6_7'), 
    FirstName)

WebUI.click(findTestObject('Object Repository/shortform/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Last name_registerFamilyNameField'))

WebUI.setText(findTestObject('Object Repository/shortform/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Last name_registerFamilyNameField_1_2_3_4_5_6_7_8'), 
    LastName)

int rn

rn = ((Math.random() * 5000) as int)

WebUI.setText(findTestObject('Object Repository/shortform/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Email_registerEmailField_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20'), 
    ('Test' + rn) + '@gmail.com')

WebUI.click(findTestObject('Object Repository/shortform/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/input_Due date or birth date_childregisterC_87b480'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_3'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_Join now'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/label_No, thanks'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Street address_address1registerAddres_39598d'))

WebUI.setText(findTestObject('shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Street address_address'), 
    Street)

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/input_UnitSuiteApt_address1registerAddressA_f19009'))

WebUI.setText(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/input_UnitSuiteApt_address1registerAddressA_f19009_1_2_3_4_5_6'), 
    Unit)

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/input_City_address1registerAddressCityField'))

WebUI.setText(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/input_City_address1registerAddressCityField_1_2_3_4_5_6_7_8_9_10'), 
    City)

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/div_State'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/div_California'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/svg_California_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/div_California'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Zip code_address1registerAddressPostalField'))

WebUI.setText(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Zip code_address1registerAddressPostalField_1_2_3_4_5'), 
    ZipCode)

WebUI.setText(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Password_registerPasswordField_1_2_3_4_5_6_7'), 
    Password)

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Show'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Next'))

WebUI.setText(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Phone_registerPhoneNumberField_1_2_3_4_5_6_7_8_9_10_11'), 
    Phone)

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/label_I agree to receive occasional text me_f59c84'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/div_Select one_select__indicator select__dr_bdb7d2'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/div_Dad'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/div_Select one_select__indicator select__dr_bdb7d2_1'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/div_Breast milk only'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/label_None'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/div_No'))

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Next'))

WebUI.scrollToElement(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Maybe later'), 
    0)

WebUI.click(findTestObject('Object Repository/shortform/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Maybe later'))

WebUI.mouseOver(findTestObject('Object Repository/shortform/Page_/li_My AccountWelcome back, venkatMy Profile_5bd973'))

WebUI.click(findTestObject('Object Repository/shortform/Page_/span_Log out'))

WebUI.closeBrowser()

