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

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/enfacare-drive-to-thrive-support-program/')

WebUI.maximizeWindow()

WebUI.delay(8)

WebUI.verifyElementText(findTestObject('Object Repository/DrivetoThrive/Page_/p_Receive up to 70 in savings, plus monthly_bdae63'), 
    'Receive up to $70 in savings*, plus monthly emails with expert advice on caring for your premature baby. Check your mailbox within 2 weeks of joining for your exclusive savings!')

WebUI.setText(findTestObject('Object Repository/DrivetoThrive/Page_/input_First Name_03b7fe2a-3e68-45ab-aab0-ad_c608d0_1_2_3_4_5_6'), 
    'venkat')

WebUI.setText(findTestObject('Object Repository/DrivetoThrive/Page_/input_Last Name_b7646462-9b79-4a9f-bfac-a4d_a09211_1_2_3_4_5_6_7_8_9_10'), 
    'raghavan')

int dt

dt = ((Math.random() * 5000) as int)

WebUI.setText(findTestObject('DrivetoThrive/Page_/input_Email_ca07a407-accc-4c4a-b2c3-cdf136bcce09_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19'), 
    ('Test' + dt) + '@gmail.com')

WebUI.setText(findTestObject('Object Repository/DrivetoThrive/Page_/input_Street address_ce0841cb-2ae9-4bc0-9ca_87d9da_1_2_3_4_5_6_7_8_9_10_11_12'), 
    '123 Queen st')

WebUI.setText(findTestObject('Object Repository/DrivetoThrive/Page_/input_UnitSuiteApt (optional)_cec817e9-76cd_747c93_1_2_3_4_5_6_7_8'), 
    '2nd unit')

WebUI.setText(findTestObject('Object Repository/DrivetoThrive/Page_/input_City_1cea0cb2-2f5d-4e2d-9c1d-66cd6c282c6c_1_2_3_4_5_6_7_8_9_10'), 
    'California')

WebUI.click(findTestObject('Object Repository/DrivetoThrive/Page_/div_State'))

WebUI.click(findTestObject('Object Repository/DrivetoThrive/Page_/div_California'))

WebUI.setText(findTestObject('Object Repository/DrivetoThrive/Page_/input_Zip code_699e6d61-72d6-44bf-91fc-5f3a_d249c0_1_2_3_4_5'), 
    '54981')

WebUI.setEncryptedText(findTestObject('Object Repository/DrivetoThrive/Page_/input_Password_0c92672a-af33-4c66-910a-5dd1_f15064_1_2_3_4_5_6_7_8'), 
    '0fBBaieMO5uUzrZIvVmS2Q==')

WebUI.click(findTestObject('Object Repository/DrivetoThrive/Page_/button_Show'))

WebUI.setText(findTestObject('Object Repository/DrivetoThrive/Page_/input_Mobile phone (optional)_de90bf96-74b5_dd48ac_1_2_3_4_5_6_7_8_9'), 
    '7290948561')

WebUI.click(findTestObject('Object Repository/DrivetoThrive/Page_/label_Consent to Receive Certain Text Messa_5ce4cc'))

WebUI.click(findTestObject('Object Repository/DrivetoThrive/Page_/input_concat(Baby, , s Due Date or Birth Da_cb1f65'))

WebUI.selectOptionByValue(findTestObject('Object Repository/DrivetoThrive/Page_/select_20212022'), '2021', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/DrivetoThrive/Page_/select_MayJuneJulyAugustSeptemberOctoberNov_ca24f3'), 
    '8', true)

WebUI.click(findTestObject('Object Repository/DrivetoThrive/Page_/div_8'))

WebUI.click(findTestObject('Object Repository/DrivetoThrive/Page_/div_Select one'))

WebUI.click(findTestObject('Object Repository/DrivetoThrive/Page_/div_Mother'))

WebUI.click(findTestObject('Object Repository/DrivetoThrive/Page_/div_Select one'))

WebUI.click(findTestObject('Object Repository/DrivetoThrive/Page_/div_Breast milk and formula'))

WebUI.click(findTestObject('Object Repository/DrivetoThrive/Page_/label_Yes'))

WebUI.click(findTestObject('Object Repository/DrivetoThrive/Page_/button_Submit'))

