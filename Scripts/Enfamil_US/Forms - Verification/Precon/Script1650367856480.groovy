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

WebUI.navigateToUrl(GlobalVariable.Precon)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Form Verification/Precon Form/Page_/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/span_Enfamil Family Beginnings for Moms To Be'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/span_Enfamil Family Beginnings for Moms To Be'), 
    'Enfamil Family Beginnings for Moms To Be')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_Enfamil Family Beginnings'), 
    'ENFAMIL FAMILY BEGINNINGS')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_Join for up to 400 in free gifts'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_Join for up to 400 in free gifts'), 
    'Join for up to $400 in free gifts.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/input_First Name_486c5e53-2548-4f26-be7a-d5_fcb248'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Precon Form/Page_/input_First Name_486c5e53-2548-4f26-be7a-d5_fcb248'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/input_Last Name_8d6160dc-8ee6-412c-81fa-526_7cb424'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Precon Form/Page_/input_Last Name_8d6160dc-8ee6-412c-81fa-526_7cb424'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/input_Email_be1731a6-126d-4f04-8d75-331aca87e9b2'), 
    0)

WebUI.verifyElementClickable(findTestObject('Form Verification/Precon Form/Page_/input_Email_be1731a6-126d-4f04-8d75-331aca87e9b2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_Tell us more about yourself so we can t_f89e59'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_Tell us more about yourself so we can t_f89e59'), 
    'Tell us more about yourself so we can tailor your experience.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_Select one'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_Select one'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_By clicking Join Now and Enter Sweepstake_0b0cd5'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_By clicking Join Now and Enter Sweepstake_0b0cd5'), 
    'By clicking “Join Now and Enter Sweepstakes,” I agree to join Enfamil Family Beginnings and receive free samples, offers and other communications from Enfamil and Mead Johnson Nutrition’s affiliated companies I understand and agree to the  Terms of Use , Privacy Policy and Sweepstakes Official Rules.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Terms of Use'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Terms of Use'), 'Terms of Use')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Terms of Use'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Privacy Policy'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Privacy Policy'), 'Privacy Policy')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Privacy Policy'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Sweepstakes Official Rules'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Sweepstakes Official Rules'), 
    'Sweepstakes Official Rules.')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Sweepstakes Official Rules'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/button_Join now'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/button_Join now'), 'Join now')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Precon Form/Page_/button_Join now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_BENEFITS'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_BENEFITS'))

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_BENEFITS'), 'BENEFITS')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h3_8 reasons to join Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h3_8 reasons to join Enfamil Family Beginnings'), 
    '8 reasons to join Enfamil Family Beginnings.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_Benefits may vary1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_Benefits may vary1'), 
    'Benefits may vary1')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h4_1. Belly Badges'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h4_1. Belly Badges'), '1. Belly Badges™')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_1. Belly BadgesGet a set of Belly Badge_0e7fce'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_Get a set of Belly Badges so you can shar_9bafd4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Learn more'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Learn more'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_2. A Chance to win free formula for a y_fdef2d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h4_2. A Chance to win free formula for a year'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h4_2. A Chance to win free formula for a year'), 
    '2. A Chance to win free formula for a year')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_By signing up for Enfamil Family Beginnin_031202'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_By signing up for Enfamil Family Beginnin_031202'), 
    'By signing up for Enfamil Family Beginnings®, you gain entry to our sweepstakes to win a year’s supply of free formula2.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Learn more_1'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Learn more_1'), 'Learn more')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Learn more_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_3. Formula samplesAs a member of the En_98fbbb'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h4_3. Formula samples'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h4_3. Formula samples'), '3. Formula samples')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_As a member of the Enfamil Family Beginni_9731d6'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_As a member of the Enfamil Family Beginni_9731d6'), 
    'As a member of the Enfamil Family Beginnings® program, you may be eligible for free samples.')

WebUI.scrollToElement(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_4. Discount checksEnjoy discounts on En_33130c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_4. Discount checksEnjoy discounts on En_33130c'), 
    0)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h4_4. Discount checks'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h4_4. Discount checks'), '4. Discount checks')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_Enjoy discounts on Enfamil products. Chec_d0981e'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_5. Tips tailored to youWhether youre pr_0f495b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h4_5. Tips tailored to you'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_Whether youre pregnant and dont know wher_7ceed8'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_Whether youre pregnant and dont know wher_7ceed8'), 
    'Whether you\'re pregnant and don\'t know where to start, or you have a newborn and are starting to get the swing of things, we\'ll send you emails with expert developmental and nutrition tips tailored to your journey.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_6. Access to our mobile appAccess to co_eab040'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h4_6. Access to our mobile app'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h4_6. Access to our mobile app'), 
    '6. Access to our mobile app')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_Access to coupons and articles tailored_c8371c'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_Access to coupons and articles tailored_c8371c'), 
    'Access to coupons and articles tailored to your little one\'s age and stage. Also check out our digital #BellyBadges and share your baby\'s special milestones with your friends and family.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Learn more_1_2'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Learn more_1_2'), 'Learn more')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Learn more_1_2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_7. Enfamil Shop RewardsStart earning po_1dda2c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h4_7. Enfamil Shop Rewards'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_Start earning points at the Enfamil Shop._e7f63e'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_Start earning points at the Enfamil Shop._e7f63e'), 
    'Start earning points at the Enfamil® Shop. Get 1 point for every $1 you spend, and get 75 points just for joining.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Learn more_1_2_3'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Learn more_1_2_3'), 'Learn more')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Precon Form/Page_/a_Learn more_1_2_3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/div_8. Special offersGet special gifts sent_ed0e1c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h4_8. Special offers'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/h4_8. Special offers'), '8. Special offers')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_Get special gifts sent to you during your_2e774d'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_Get special gifts sent to you during your_2e774d'), 
    'Get special gifts sent to you during your membership, including rebates on birth announcements and more, and other special discounts from our partners.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_1. Every motherhood journey is unique, so_de9b3b'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_1. Every motherhood journey is unique, so_de9b3b'), 
    '1. Every motherhood journey is unique, so your Enfamil Family Beginnings experience is tailored to the information you provide and may vary from what another mom might experience. If you have questions about the program or would like more detail, our Family of Experts can help at 1-800-BABY123 between 7am-7pm CST M-F; 8am-4:30pm Sat.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_2. NO PURCHASE OR PAYMENT NECESSARY TO EN_a80952'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_2. NO PURCHASE OR PAYMENT NECESSARY TO EN_a80952'), 
    '2. NO PURCHASE OR PAYMENT NECESSARY TO ENTER OR WIN. A purchase will not increase your chances of winning. Open to legal U.S. residents 18 and older. Void where prohibited. Promotion ends on December 31, 2020. Odds of winning depend on the total number of eligible entries received. For full Official Rules click here. Sponsor: Mead Johnson & Co., LLC, 2400 West Lloyd Expressway, Evansville, IN 47721.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_3. Only the latest printing of Enfamil Fa_86aa15'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Precon Form/Page_/p_3. Only the latest printing of Enfamil Fa_86aa15'), 
    '3. Only the latest printing of Enfamil Family Beginnings® checks include unique codes that are redeemable online in the Enfamil® Shop. All checks are still valid in select retail stores until the posted expiration date. Refer to your personalized checks for redemption details.')

WebUI.closeBrowser()

