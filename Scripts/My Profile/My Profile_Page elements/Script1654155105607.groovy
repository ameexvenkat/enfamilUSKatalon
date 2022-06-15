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

WebUI.navigateToUrl('https://www.enfamil.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/My Profile/HomePage/Cookie Close'))

WebUI.click(findTestObject('Object Repository/My Profile/HomePage/Sign In button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/My Profile/HomePage/Sign In header'), 0)

WebUI.setText(findTestObject('Object Repository/My Profile/HomePage/Email_login-username'), 'enfamil.automation@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/My Profile/HomePage/Password_login-password'), 'xAilcST79EOqY6ed4ZwUPw==')

WebUI.click(findTestObject('Object Repository/My Profile/HomePage/Sign in button_Pop up'))

WebUI.waitForElementVisible(findTestObject('Object Repository/My Profile/HomePage/Welcome back_Banner'), 0)

WebUI.mouseOver(findTestObject('Object Repository/My Profile/HomePage/My Account'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/My Profile/HomePage/My Profile'))

WebUI.verifyElementText(findTestObject('Object Repository/My Profile/Page_My Profile/My Profile_header'), 'My Profile')

WebUI.verifyElementText(findTestObject('Object Repository/My Profile/Page_My Profile/Profile_Message'), 'You are currently enrolled in the Enfamil Family Beginnings program. Please feel free to update your profile and your preferences below. If you have any questions, please feel free to contact us at 1-800-BABY123.')

WebUI.verifyElementText(findTestObject('Object Repository/My Profile/Page_My Profile/My Information'), 'My Information')

WebUI.verifyElementText(findTestObject('Object Repository/My Profile/Page_My Profile/My Pregnancy and Baby'), 'My Pregnancy and Baby')

WebUI.verifyElementText(findTestObject('Object Repository/My Profile/Page_My Profile/My Subscriptions'), 'My Subscriptions')

WebUI.verifyElementText(findTestObject('Object Repository/My Profile/Page_My Profile/Change Password'), 'Change Password')

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Page_My Profile/My Info/First Name field'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Page_My Profile/My Info/Last Name field'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Page_My Profile/My Info/Email field'), 0)

WebUI.verifyElementText(findTestObject('My Profile/Page_My Profile/My Info/Email update message'), 'To update your email address, please call us at 1-800-BABY123.')

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Page_My Profile/My Info/Street Address'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Page_My Profile/My Info/Unit Suite Apt'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Page_My Profile/My Info/City_address'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Page_My Profile/My Info/div_StateDelaware'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Page_My Profile/My Info/Zip Code field'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Page_My Profile/My Info/WIC section'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Page_My Profile/My Info/WIC_Yes'), 0)

WebUI.rightClick(findTestObject('Object Repository/My Profile/Page_My Profile/My Info/WIC_No'))

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Page_My Profile/My Info/WIC_No'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Page_My Profile/My Info/WIC_Not Sure'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Page_My Profile/My Info/Update Profile_Button'), 
    0)

WebUI.click(findTestObject('My Profile/Page_My Profile/My Pregnancy and Baby'))

WebUI.verifyElementText(findTestObject('My Profile/Page_My Profile/My Pregnancy/My Pregnancy message'), 'To update your profile, edit your information below and Save.')

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Add pregnancy button'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/My baby'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/First Name field'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Birth date'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Baby gender_male'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Baby gender_female'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Baby gender_Not to answer'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Relationship_Mom'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Relationship_Dad'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Relationship_grand parent'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Relationship_Other'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Plan to feed_Not sure'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Plan to feed_Milk and formula'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Plan to feed_Milk only'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Plan to feed_Formula only'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Plan to feed_Cow milk'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Child was_born premature'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Child was_Adopted'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Child was_Foster child'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Feeding issues_Gas and fussiness'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Feeding issues_Crying'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Feeding issues_Lactose'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Feeding issues_Constipation'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Feeding issues_Lactose sensitivity'), 
    0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Feeding issues_Cows milk'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Feeding issues_Spit up'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Feeding issues_None'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Name of Hospital'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Baby details_Save button'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Babu details_Cancel button'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Remove child'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Pregnancy/Add child button'), 0)

WebUI.click(findTestObject('My Profile/Page_My Profile/My Subscriptions'))

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Subscription/Special offers email_question'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Subscription/Special offers email_Yes'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Subscription/Special offers email_No'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Subscription/Email Options_Dropdown'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Subscription/Email Options_Toddler'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Subscription/Email Options_Infant'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Subscription/Email Options_Savings'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Subscription/Email Options_Enfacare'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Subscription/Email Options_Not interested'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Subscription/Promotions_Enfamil shop'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Subscription/Promotions_Not interested'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Subscription/Postal Mailings_Yes'), 0)

WebUI.verifyElementPresent(findTestObject('My Profile/Page_My Profile/My Subscription/Postal Mailings_No'), 0)

WebUI.verifyElementPresent(findTestObject(null), 0)

WebUI.verifyElementPresent(findTestObject(null), 0)

WebUI.verifyElementPresent(findTestObject(null), 0)

WebUI.verifyElementPresent(findTestObject(null), 0)

