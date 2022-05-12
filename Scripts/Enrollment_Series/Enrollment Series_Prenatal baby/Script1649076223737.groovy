import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

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

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_Due date_Next'))

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_Due date_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Select Date'))

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Join now'))

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Error_Due date or birth date is required'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Why Tooltip'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Tool tip text'), 0)

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Tool tip_button_Close'))

int rn

rn = ((Math.random() * 5000) as int)

WebUI.setText(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Input_Email_Field'), ('QA.automation' + 
    rn) + '@testing.com')

WebUI.click(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/button_Join now'))

WebUI.waitForElementPresent(findTestObject('Enrollment Series/Step1/Baby Formula Samples Coupons page/Step2 Page_h1'), 0)

WebUI.comment('Enrollment Step1 completed')

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

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Next Button'))

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

WebUI.verifyElementText(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Error_State field'), 
    'State field is required')

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Input_State_Dropdown'))

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Input_State_Alaska'))

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

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Step2_Huggies_Checkbox'), 
    0)

WebUI.click(findTestObject('Enrollment Series/Step2/Baby Formula Samples Coupons_Step2/Next Button'))

WebUI.comment('Enrollment Step2 completed')

WebUI.waitForElementVisible(findTestObject('Enrollment Series/Step3/Step3_h1_Header'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_Prenatal_Banner Img'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_Stay up to date with Enfamil Family'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_Customize your prenatal baby'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_Relationship to baby'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_How do you plan to feed'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Step3_Prenatal WIC section'), 0)

WebUI.setText(findTestObject('Enrollment Series/Step3/Step3_Input_Phone field'), '987-654-321')

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_Phone_Checkbox'))

WebUI.verifyElementText(findTestObject('Enrollment Series/Step3/Step3_Error_Phone number'), 'Phone number is not valid')

WebUI.verifyElementNotChecked(findTestObject('Enrollment Series/Step3/Step3_Phone_Checkbox'), 0)

WebUI.setText(findTestObject('Enrollment Series/Step3/Step3_Input_Phone field'), '0')

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_Phone_Checkbox'))

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step3/Step3_Error_Phone number'), 0)

WebUI.verifyElementChecked(findTestObject('Enrollment Series/Step3/Step3_Phone Checked'), 0)

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_Child_Select'))

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_Child_Dad'))

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_Feeding Type'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Prenatal_Im not sure'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Infant_Breast milk'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Infant_Breast milk and formula'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step3/Infant_Formula'), 0)

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step3/Toddler_Cow milk'), 0)

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_Breast milk only'))

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step3/Step3_label_Gas and fussiness'), 0)

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step3/Step3_label_Crying or colicky'), 0)

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step3/Step3_label_Spit-up'), 0)

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step3/Step3_label_Occasional constipation'), 0)

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step3/Step3_label_Lactose sensitivity'), 0)

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step3/Step3_label_Cows milk'), 0)

WebUI.verifyElementNotPresent(findTestObject('Enrollment Series/Step3/Step3_label_None'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step4/div_YesNoNot Sure'), 0)

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_WIC_Not Sure'))

WebUI.click(findTestObject('Enrollment Series/Step3/Step3_button_Next'))

WebUI.comment('Enrollment Step3 completed')

WebUI.waitForElementVisible(findTestObject('Enrollment Series/Step4/Step4_h1_header'), 0)

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('Enrollment Series/Step4/Step4_button_Upgrade Now'), 0)

WebUI.mouseOver(findTestObject('Enrollment Series/Step4/Step4_button_Upgrade Now'))

WebUI.click(findTestObject('Enrollment Series/Step4/Step4_button_Upgrade Now'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Enrollment Series/Step4/Step4_button_Upgrade Now'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Enrollment Series/Step4/Step4_Upgrade_h2_header'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step4/Step4_Upgrade_products'), 0)

WebUI.click(findTestObject('Enrollment Series/Step4/Step4_Upgrade_Option'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step4/Step4_Upgrade_Confirm your choice'), 0)

WebUI.click(findTestObject('Enrollment Series/Step4/Step4_Upgrade_button_Close'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step4/Step4_Progress'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step4/Step4_Promotion'), 0)

WebUI.click(findTestObject('Enrollment Series/Step4/Step4_Get Premium for 39.99 button'))

WebUI.click(findTestObject('Enrollment Series/Step4/Step4_Upgrade_Confirm your choice'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step4/Step4_Get Premium_options'), 0)

WebUI.click(findTestObject('Enrollment Series/Step4/Step4_Upgrade_button_Close'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step4/Step4_Table section'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step4/Step4_Content section'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Step4/Step4_Upgrade nowMaybe later section'), 0)

WebUI.click(findTestObject('Enrollment Series/Step4/Step4_Maybe later button'))

WebUI.comment('Enrollment Step4 completed')

WebUI.verifyElementVisible(findTestObject('Enrollment Series/Thank You page/Thank You_Banner'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/Thank You_Upgrade to premium section'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/ThankYou_Upgrade now Section'), 0)

WebUI.scrollToElement(findTestObject('Enrollment Series/Thank You page/Thank You_button_Upgrade now'), 0)

WebUI.delay(10)

WebUI.click(findTestObject('Enrollment Series/Thank You page/Thank You_button_Upgrade now'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/Thank you_Upgrade header'), 0)

WebUI.click(findTestObject('Enrollment Series/Thank You page/Thank You_Upgrade_button_Close'))

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/Thank You_Carousel section'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/Thank You_Save 10 section'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/Thank You_Shop with us section'), 0)

WebUI.verifyElementPresent(findTestObject('Enrollment Series/Thank You page/Thank You_Related Articles'), 0)

WebUI.click(findTestObject('Enrollment Series/Thank You page/Thank You_Learn more button'))

WebUI.waitForElementVisible(findTestObject('Enrollment Series/Thank You page/Page_Premium Enfamil Family Beginnings/Youre one step away from Premium'), 
    0)

WebUI.back()

WebUI.waitForElementVisible(findTestObject('Enrollment Series/Thank You page/Thank You_Banner'), 0)

WebUI.click(findTestObject('Enrollment Series/Thank You page/Thank You_Shop now'))

WebUI.waitForElementVisible(findTestObject('Enrollment Series/Thank You page/Page_Shop  Enfamil/Shop Products'), 0)

WebUI.closeBrowser()

