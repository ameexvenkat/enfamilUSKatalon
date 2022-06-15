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

WebUI.navigateToUrl(GlobalVariable.HCP_ThankYou)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Cookie Close'))

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Breadcrumb'), 'Thank You')

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Banner section'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Banner Text'), 'A complete family of formulas inspired by breast milk')

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Thank You_Banner_image'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Thank you for your submission_Title'), 
    'Thank you for your submission.')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Thank you for your submission_Description'), 
    'Your offer information will arrive by email or text in the next few days. Please follow the instructions in the email or text in order to activate your offer.')

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Product Overview section'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Overview section_Title'), 'OVERVIEW')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Overview section_Description'), 'ONLY leading formula to have DHA* in an amount experts recommend')

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Overview_Section1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Overview_Section2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Overview_Section3'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Table section_Title'), 'Top Reasons to Choose Enfamil NeuroPro')

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Table section'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Campaign_Image'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Campaign_Section1'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/Thankyou/Campaign_Section2'), 0)

WebUI.scrollToElement(findTestObject('HCP_Form/Anonymous/Thankyou/Products Section'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Products Section'), 0)

WebUI.click(findTestObject('HCP_Form/Anonymous/FormPage/Product'))

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Product page breadcrumb'), 0)

WebUI.back()

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/Thankyou/Banner section'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/Thankyou/Products_Disclaimer'), '†Compared to discontinued Enfamil without DHA Colombo J, Carlson SE, Cheatham CL et al. Long chain polyunsaturated fatty acid supplementation in infancy reduces heart rate and positively affects distribution of attention. Pediatr Res.2011;70:406-410. Based on a study of Enfamil LIPIL before the addition of probiotics.')

WebUI.closeBrowser()

