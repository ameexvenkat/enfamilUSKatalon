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

WebUI.navigateToUrl(GlobalVariable.Enroll_homepage_STG_URL)

WebUI.maximizeWindow()

if (true) {
    WebUI.verifyElementPresent(findTestObject('Cookie floater/Cookies pop up'), 0)

    WebUI.click(findTestObject('Cookie floater/Cookie accept'))
}

WebUI.waitForElementVisible(findTestObject('Enrollment Series/Step1/Enfamil_Homepage/Join Enfamil Family Beginnings link'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step1/Enfamil_Homepage/Join Enfamil Family Beginnings link'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Join now form'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Enfamil Breadcrumb'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_Background Image'), 
    0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_EFP form'), 0)

WebUI.scrollToElement(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Why Tooltip'), 0)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Terms of use'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Breadcrumb_Terms of use'), 
    0)

WebUI.back()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Why Tooltip'), 0)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Privacy Policy link'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Breadcrumb_Privacy policy'), 
    0)

WebUI.back()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Why Tooltip'), 0)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Sweepstakes links'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Breadcrumb_Sweepstakes'), 
    0)

WebUI.back()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Why Tooltip'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_FB icon'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_Google icon'), 
    0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_Apple icon'), 
    0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_Benefits section'), 
    0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_Shortform2'), 
    0)

WebUI.scrollToElement(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_Alternative programs section'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_Drive to thrive link'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Breadcrumb_Drive to thrive'), 
    0)

WebUI.back()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_Alternative programs section'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_Nutramigen link'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Breadcrumb_Nutramigen'), 
    0)

WebUI.back()

WebUI.delay(2)

WebUI.refresh()

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_Alternative programs section'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_Ensprie family link'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Breadcrumb_Enspire family'), 
    0)

WebUI.back()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_Carousel section'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step1_Carousel_Next'))

WebUI.delay(1)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Carousel Bullet'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Disclaimer section'), 
    0)

WebUI.scrollToElement(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Join now button'), 0)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Join now button'))

WebUI.verifyElementText(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Error_Please correct all highlighted errors'), 
    'Please correct all highlighted errors and try again!')

WebUI.verifyElementText(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Error_First name field is required'), 
    'First name field is required')

WebUI.verifyElementText(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Error_Last name field is required'), 
    'Last name field is required')

WebUI.verifyElementText(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Error_Due date or birth date is required'), 
    'Due date or birth date is required')

WebUI.verifyElementText(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Error_Email address is required'), 
    'Email address is required')

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_First name'))

WebUI.setText(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_First name'), GlobalVariable.Invalid_Data)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Join now'))

WebUI.verifyElementText(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Error_Firstname_Invalid'), 
    'First name contains invalid characters')

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_First name'))

WebUI.sendKeys(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_First name'), Keys.chord(
        Keys.SHIFT, Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_First name'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_First name'), GlobalVariable.Enroll_Firstname)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Join now'))

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Error_Firstname_Invalid'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_Last name'))

WebUI.setText(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_Last name'), GlobalVariable.Invalid_Data)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Join now'))

WebUI.verifyElementText(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Error_Lastname_Invalid'), 
    'Last name contains invalid characters')

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_Last name'))

WebUI.sendKeys(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_Last name'), Keys.chord(Keys.SHIFT, 
        Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_Last name'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_Last name'), GlobalVariable.Enroll_Lastname)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Join now'))

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Error_Lastname_Invalid'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_Due Date field'))

WebUI.delay(2)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Select Date_Birthday'))

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Join now'))

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Error_Due date or birth date is required'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Why Tooltip'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Tool tip text'), 0)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Tool tip_button_Close'))

WebUI.setText(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_Email_Field'), GlobalVariable.Valid_Email)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Join now'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Error_Already Registered user'), 
    0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Error_SignIN'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Error_Forgot password'), 
    0)

WebUI.sendKeys(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_Email_Field'), Keys.chord(
        Keys.SHIFT, Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_Email_Field'), Keys.chord(
        Keys.BACK_SPACE))

int rn

rn = ((Math.random() * 5000) as int)

WebUI.setText(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_Email_Field'), ('QA.automation' + 
    rn) + '@testing.com')

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Join now'))

WebUI.waitForElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step2 Page_h1'), 0)

WebUI.comment('Enrollment Step1 completed')

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Enfamil Breadcrumb'), 0)

WebUI.scrollToElement(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Choose your Belly Badges'), 
    0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Enrollment_Progress'), 
    0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Choose your Belly Badges'), 
    0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Baby milestones'), 
    0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step4/Enter your address section'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Password section'), 
    0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Huggies section'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Select Baby age'))

WebUI.scrollToElement(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Next Button'), 5)

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Next Button'))

WebUI.scrollToElement(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Error_Street address field'), 
    10)

WebUI.verifyElementText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Error_Street address field'), 
    'Street address field is required')

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Input_Street address'))

WebUI.setText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Input_Street address'), 'Testing')

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Next Button'))

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Error_Street address field'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Input_City_Field'))

WebUI.verifyElementText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Error_City field'), 'City field is required')

WebUI.setText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Input_City_Field'), 'Testing')

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Next Button'))

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Error_City field'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Input_UnitSuite_Field'))

WebUI.setText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Input_UnitSuite_Field'), 'Testing')

WebUI.scrollToElement(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Input_State_Dropdown'), 
    0)

WebUI.verifyElementText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Error_State field'), 
    'State field is required')

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Input_State_Dropdown'))

WebUI.click(findTestObject('New Folder/New Folder (1)/Page_Enspire Family Beginnings/Select_State_Dynamic', [('State') : 'Hawaii']))

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Next Button'))

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Error_State field'), 
    0)

WebUI.verifyElementText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Error_Zip code field'), 
    'Zip code field is required.')

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Input_Zip code'))

WebUI.setText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Input_Zip code'), GlobalVariable.Enroll_Zipcode)

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Next Button'), FailureHandling.OPTIONAL)

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Error_Zip code field'), 
    0)

WebUI.verifyElementText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Error_Password field'), 
    'Password is required')

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Input_Password Field'))

WebUI.setText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Input_Password Field'), 'Q')

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_UpperAndEmail_Success'), 
    0)

WebUI.setText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Input_Password Field'), 'w')

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Lowercase'), 
    0)

WebUI.setText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Input_Password Field'), 'ertyui')

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_8_Characters'), 
    0)

WebUI.setText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Input_Password Field'), '1')

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Number'), 0)

WebUI.setText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Input_Password Field'), '@')

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Special Character'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Error_Password field'), 
    0)

WebUI.scrollToElement(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Huggies_Checkbox'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Huggies_Checkbox'))

WebUI.verifyElementChecked(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Huggies_Checkbox'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Next Button'))

WebUI.comment('Enrollment Step2 completed')

WebUI.waitForElementVisible(findTestObject('Enrollment Series/Step3/Step3_h1_Header'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Enfamil Breadcrumb'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_Infant_Banner img'), 0)

WebUI.scrollToElement(findTestObject('Enrollment Series/Step3/Step3_Stay up to date with Enfamil Family'), 0)

WebUI.verifyElementVisible(findTestObject('Enrollment Series/Step3/Step3_Progress_img'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_Stay up to date with Enfamil Family'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_Customize your child'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_Relationship to child'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_How are you currently feeding'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_Are you interested in formula'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_WIC section'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_Content'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_button_Next'), 0)

WebUI.setText(findTestObject('Enrollment Series/Step3/Step3_Input_Phone field'), '987-654-321')

WebUI.delay(1)

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_Phone_Checkbox'))

WebUI.verifyElementText(findTestObject('Enrollment Series/Step3/Step3_Error_Phone number'), 'Phone number is not valid')

WebUI.verifyElementNotChecked(findTestObject('Enrollment Series/Step3/Step3_Phone_Checkbox'), 0)

WebUI.setText(findTestObject('Enrollment Series/Step3/Step3_Input_Phone field'), '0')

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_Phone_Checkbox'))

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step3/Step3_Error_Phone number'), 0)

WebUI.verifyElementChecked(findTestObject('Enrollment Series/Step3/Step3_Phone Checked'), 0)

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_Child_Select'))

WebUI.click(findTestObject('New Folder/New Folder (1)/Page_Enspire Family Beginnings/Select_Relationship_dynamic', [('Relation') : 'Dad']))

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_Feeding Type'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Infant_Breast milk'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Infant_Formula'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Infant_Breast milk and formula'), 0)

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step3/Prenatal_Im not sure'), 0)

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step3/Toddler_Cow milk'), 0)

WebUI.click(findTestObject('New Folder/New Folder (1)/Page_Enspire Family Beginnings/Select_Feeding_Dynamic', [('Feeding') : 'Breast milk only']))

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_label_Gas and fussiness'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_Gas_Checked'), 0)

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_label_Crying or colicky'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_Crying_Checked'), 0)

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_label_Spit-up'))

WebUI.verifyElementChecked(findTestObject('Enrollment Series/Step3/Step3_Spit_Checked'), 0)

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_label_Occasional constipation'))

WebUI.verifyElementChecked(findTestObject('Enrollment Series/Step3/Step3_Constipation_Checked'), 0)

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_label_Lactose sensitivity'))

WebUI.verifyElementChecked(findTestObject('Enrollment Series/Step3/Step3_Lactose_Checked'), 0)

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_label_Cows milk'))

WebUI.verifyElementChecked(findTestObject('Enrollment Series/Step3/Step3_Cows milk_Checked'), 0)

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_label_None'))

WebUI.verifyElementChecked(findTestObject('Enrollment Series/Step3/Step3_None_Checked'), 0)

WebUI.verifyElementNotChecked(findTestObject('Enrollment Series/Step3/Step3_Gas FussinessUnchecked'), 0)

WebUI.verifyElementNotChecked(findTestObject('Enrollment Series/Step3/Step3_Crying_Unchecked'), 0)

WebUI.verifyElementNotChecked(findTestObject('Enrollment Series/Step3/Step3_Spit_Unchecked'), 0)

WebUI.verifyElementNotChecked(findTestObject('Enrollment Series/Step3/Step3_Constipation_Unchecked'), 0)

WebUI.verifyElementNotChecked(findTestObject('Enrollment Series/Step3/Step3_Lactose_Unchecked'), 0)

WebUI.verifyElementNotChecked(findTestObject('Enrollment Series/Step3/Step3_Cows milk_Unchecked'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step4/div_YesNoNot Sure'), 0)

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_WIC_Not Sure'))

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_button_Next'))

WebUI.comment('Enrollment Step3 completed')

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step4/Step4_background img'), 0)

WebUI.verifyElementVisible(findTestObject('Enrollment Series/Thank You page/Thank You_Banner'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/ThankYou_User name'), 0)

WebUI.click(findTestObject('Enrollment Series/Thank You page/Start Earning'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/Breadcrumb_Rewards'), 0)

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/Thank You_Carousel section'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/Thank You_Save 10 section'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/Thank You_Shop with us section'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/Thank You_Related Articles'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/Thank you_Guarantee list'), 0)

WebUI.scrollToElement(findTestObject('Enrollment Series/Thank You page/Thank You_Shop now'), 0)

WebUI.click(findTestObject('Enrollment Series/Thank You page/Thank You_Shop now'))

WebUI.waitForElementVisible(findTestObject('Enrollment Series/Thank You page/Page_Shop  Enfamil/Shop Products'), 0)

WebUI.delay(4)

WebUI.back()

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Enrollment Series/Thank You page/Thank You_Banner'), 0)

WebUI.scrollToElement(findTestObject('Enrollment Series/Thank You page/ThankYou_View all articles button'), 0)

WebUI.click(findTestObject('Enrollment Series/Thank You page/ThankYou_View all articles button'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/Breadcrumbs_Articles'), 0)

WebUI.closeBrowser()
