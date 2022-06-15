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

WebUI.navigateToUrl('https://enfamil.com/hcp-offer/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('HCP_Form/Anonymous/FormPage/Cookie Close'))

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.delay(20)

int rn

rn = ((Math.random() * 100000000000) as int)

WebUI.click(findTestObject('HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Phone field_Error_Focus'), ('' + rn) + '')

WebUI.verifyElementNotPresent(findTestObject('HCP_Form/Anonymous/FormPage/Error_Phone_Invalid Characters'), 0)

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Code Activation field_Error_Focus'), 'Test')

WebUI.verifyElementNotPresent(findTestObject('HCP_Form/Anonymous/FormPage/Error_Activation code_required'), 0)

WebUI.verifyElementText(findTestObject('HCP_Form/Anonymous/FormPage/Error_Activation code_Invalid'), 'Code has already been redeemed or Code was entered incorrectly.')

