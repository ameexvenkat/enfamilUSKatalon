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

WebUI.navigateToUrl('https://enfamil-us.ameexcloud.com/enspire-family-beginnings/?slug=self_enroll')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/input_First Name_bda32aa6-a964-46d2-b907-bb_101ad6_1_2_3_4_5_6'), 
    FirstName)

WebUI.setText(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/input_Last Name_df44e44d-2cc6-4d1c-a220-d50_400c72_1_2_3_4_5_6_7_8'), 
    LastName)

int en

en = ((Math.random() * 5000) as int)

WebUI.setText(findTestObject('null'), 
    ('Test' + en) + '@gmail.com')

WebUI.setText(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/input_Street address_d6339477-e514-4e65-ba1_5e745a_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18'), 
    Street)

WebUI.setText(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/input_UnitSuiteApt (optional)_c8d5824c-02e8_6cff11_1_2_3_4_5'), 
    Unit)

WebUI.setText(findTestObject('enspire/Page_Enspire Family Beginnings Registration_996fe8/input_City_181'), 
    City)

WebUI.click(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/div_State'))

WebUI.click(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/div_Alabama'))

WebUI.setText(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/input_Zip code_b3d77e6e-ceea-4dff-908a-1f2d_4ec643_1_2_3_4_5'), 
    ZipCode)

WebUI.click(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/button_Show'))

WebUI.setText(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/input_Password_7dd74fb4-6489-42c8-8964-2cc2_e023cd_1_2_3_4_5_6_7_8_9_10'), 
    Password)

WebUI.click(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/button_Show'))

WebUI.setText(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/input_Mobile phone (optional)_eaf6a18d-7532_9ddcd5_1_2_3_4_5_6_7_8_9'), 
    '7897845512')

WebUI.click(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/label_Consent to Receive Certain Text Messa_5ce4cc'))

WebUI.click(findTestObject('Object Repository/DrivetoThrive/Page_/input_concat(Baby, , s Due Date or Birth Da_cb1f65'))

WebUI.selectOptionByValue(findTestObject('Object Repository/DrivetoThrive/Page_/select_20212022'), '2021', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/DrivetoThrive/Page_/select_MayJuneJulyAugustSeptemberOctoberNov_ca24f3'), 
    '8', true)

WebUI.click(findTestObject('Object Repository/DrivetoThrive/Page_/div_8'))

WebUI.click(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/svg_Select one_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/div_Father'))

WebUI.click(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/svg_Select one_css-19bqh2r_1'))

WebUI.click(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/div_Breast milk and formula'))

WebUI.click(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/label_No'))

WebUI.click(findTestObject('Object Repository/enspire/Page_Enspire Family Beginnings Registration_996fe8/button_Submit'))

