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

WebUI.navigateToUrl('https://enfamil.com/hcp-offer/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Cookie Close'))

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/BreadCrumb'), 'Redeem Offer')

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Banner Image'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Banner header'), 'Get your offer worth up to $15 on Enfamil products')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Header text'), 'Fill out the form below and check your email for next steps.')

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/First Name field'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Last name field'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Street Address field'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/UnitSuite field'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/City field'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/State field'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Zip Code field'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Email field'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Due Date field'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Why tooltip'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Phone field'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Code Activation field'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Retailers logo'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Note text'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Terms and Conditions'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Terms and Condition 1'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Terms and conditions 2'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Terms and Conditions 3'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Terms and Conditions 4'), 0)

WebUI.verifyElementPresent(findTestObject('HCP_Form/Anonymous/FormPage/Terms and Conditions 5'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Advanced Nutrition CTA'), 0)

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Highlighted errors'), 'Please correct all highlighted errors and try again')

WebUI.verifyElementText(findTestObject('HCP_Form/Anonymous/FormPage/Error_FirstName_required'), 'First name field is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Last name required'), 'Last name field is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Street address_required'), 'Street address field is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_City field_required'), 'City field is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_State field_required'), 'State field is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_ZipCode_required'), 'Invalid Zip code Format.')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Email field_required'), 'Email field is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Due date_required'), 'Due date or birth date is required')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Phone number_required'), 'Phone number is required')

WebUI.verifyElementText(findTestObject('HCP_Form/Anonymous/FormPage/Error_Activation code_required'), 'Activation code is required.')

WebUI.scrollToElement(findTestObject('HCP_Form/Anonymous/FormPage/Shop retailers button'), 0)

WebUI.click(findTestObject('HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/First Name_Error_Focus'), '12345@')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_First name_Invalid Characters'), 
    'First Name contains invalid characters.')

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/First Name_Error_Focus'), Keys.chord(Keys.SHIFT, Keys.HOME))

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/First Name_Error_Focus'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/First Name_Error_Focus'), 'Enfamil _-.\'')

WebUI.verifyElementNotPresent(findTestObject('HCP_Form/Anonymous/FormPage/Error_First name_Invalid Characters'), 0)

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Last name_Error_Focus'), '12345@')

WebUI.verifyElementText(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Last Name_Invalid Characters'), 
    'Last Name contains invalid characters.')

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/Last name_Error_Focus'), Keys.chord(Keys.SHIFT, Keys.HOME))

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/Last name_Error_Focus'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Last name_Error_Focus'), 'Automation _-.\'')

WebUI.verifyElementNotPresent(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Error_Last Name_Invalid Characters'), 
    0)

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Street Address_Error_Focus'), '@')

WebUI.verifyElementText(findTestObject('HCP_Form/Anonymous/FormPage/Error_Street address_Invalid Characters'), 'Street address has invalid characters.')

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/Street Address_Error_Focus'), Keys.chord(Keys.SHIFT, Keys.HOME))

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/Street Address_Error_Focus'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Street Address_Error_Focus'), 'Street Address #()_-;\',./')

WebUI.verifyElementNotPresent(findTestObject('HCP_Form/Anonymous/FormPage/Error_Street address_Invalid Characters'), 0)

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.click(findTestObject('HCP_Form/Anonymous/FormPage/UnitSuite field'))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Unit field_focus'), '@')

WebUI.click(findTestObject('HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.verifyElementText(findTestObject('HCP_Form/Anonymous/FormPage/Error_Unit_Invalid Characters'), 'Unit/Suite/Apt contains invalid characters.')

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/Unit field_Error_focus'), Keys.chord(Keys.SHIFT, Keys.HOME))

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/Unit field_Error_focus'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Unit field_focus'), 'Unit/Suite/Apartment #()_-;\',./')

WebUI.verifyElementNotPresent(findTestObject('HCP_Form/Anonymous/FormPage/Error_Unit_Invalid Characters'), 0)

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/City field_Error_Focus'), '@')

WebUI.verifyElementText(findTestObject('HCP_Form/Anonymous/FormPage/Error_City_Invalid Characters'), 'City field has invalid characters.')

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/City field_Error_Focus'), Keys.chord(Keys.SHIFT, Keys.HOME))

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/City field_Error_Focus'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/City field_Error_Focus'), 'City  #()_-;\',./')

WebUI.verifyElementNotPresent(findTestObject('HCP_Form/Anonymous/FormPage/Error_City_Invalid Characters'), 0)

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.click(findTestObject('HCP_Form/Anonymous/FormPage/State field_Error'))

WebUI.click(findTestObject('New Folder/New Folder (1)/Page_Enspire Family Beginnings/Select_State_Dynamic', [('State') : 'Colorado']))

WebUI.verifyElementNotPresent(findTestObject('HCP_Form/Anonymous/FormPage/Error_State field_required'), 0)

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Zip Code field_Error_Focus'), '@ s #()_-;\',./')

WebUI.verifyElementText(findTestObject('HCP_Form/Anonymous/FormPage/Error_Zip Code_Invalid Format'), 'Invalid Zip code Format.')

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/Zip Code field_Error_Focus'), Keys.chord(Keys.SHIFT, Keys.HOME))

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/Zip Code field_Error_Focus'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Zip Code field_Error_Focus'), '12345')

WebUI.verifyElementNotPresent(findTestObject('HCP_Form/Anonymous/FormPage/Error_Zip Code_Invalid Format'), 0)

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Email field_Error_Focus'), 'Automation')

WebUI.verifyElementText(findTestObject('HCP_Form/Anonymous/FormPage/Error_Email_Invalid'), 'Email field is invalid.')

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/Email field_Error_Focus'), Keys.chord(Keys.SHIFT, Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/Email field_Error_Focus'), Keys.chord(Keys.BACK_SPACE))

int rn

rn = ((Math.random() * 5000) as int)

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Email field_Error_Focus'), ('QA.automation' + rn) + '@testing.com')

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.verifyElementText(findTestObject('HCP_Form/Anonymous/FormPage/Error_Date_required'), 'Due date or birth date is required')

WebUI.delay(2)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Select Date_Birthday'))

WebUI.verifyElementNotPresent(findTestObject('HCP_Form/Anonymous/FormPage/Error_Date_required'), 0)

WebUI.click(findTestObject('Object Repository/HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Phone field_Error_Focus'), 'A@ s #()_-;\',./')

WebUI.verifyElementText(findTestObject('HCP_Form/Anonymous/FormPage/Error_Phone_Invalid Characters'), 'Phone number is not valid')

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/Phone field_Error_Focus'), Keys.chord(Keys.SHIFT, Keys.HOME))

WebUI.sendKeys(findTestObject('HCP_Form/Anonymous/FormPage/Phone field_Error_Focus'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Phone field_Error_Focus'), '1234567890')

WebUI.verifyElementNotPresent(findTestObject('HCP_Form/Anonymous/FormPage/Error_Phone_Invalid Characters'), 0)

WebUI.click(findTestObject('HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.setText(findTestObject('HCP_Form/Anonymous/FormPage/Code Activation field_Error_Focus'), 'Test')

WebUI.verifyElementNotPresent(findTestObject('HCP_Form/Anonymous/FormPage/Error_Activation code_required'), 0)

WebUI.click(findTestObject('HCP_Form/Anonymous/FormPage/Shop retailers button'))

WebUI.verifyElementText(findTestObject('HCP_Form/Anonymous/FormPage/Error_Activation code_Invalid'), 'Code has already been redeemed or Code was entered incorrectly.')

WebUI.click(findTestObject('HCP_Form/Anonymous/FormPage/Why tooltip'))

WebUI.verifyElementText(findTestObject('HCP_Form/Anonymous/FormPage/Why Tooltip content'), 'By sharing your little one\'s tentative birth date, we can give you personalized updates about your pregnancy, including insights about your baby\'s development, tips, advice and more..')

WebUI.click(findTestObject('HCP_Form/Anonymous/FormPage/Why Tooltip Close'))

WebUI.closeBrowser()

