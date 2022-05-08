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

WebUI.navigateToUrl(GlobalVariable.Enrollment)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Enfamil Family Beginnings'), 
    'Enfamil Family Beginnings©')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_Enfamil Family Beginnings'), 
    'ENFAMIL FAMILY BEGINNINGS')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h1_Celebrate your little one with up to 400_dbb811'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h1_Celebrate your little one with up to 400_dbb811'), 
    'Celebrate your little one with up to $400 in savings, exclusive rewards and support.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_First nameLast nameDue date or birth da_610c3b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_First name_registerGivenNameField_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Last name_registerFamilyNameField_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Due date or birth date_childregisterC_87b480_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Why'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Email_registerEmailField_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Join now'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Or register with your social account'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Or register with your social account'), 
    'OR REGISTER WITH YOUR SOCIAL ACCOUNT')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Continue with Facebook'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Sign in with Google'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/svg'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_By clicking Join Now and Enter Sweepstake_0b0cd5'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_By clicking Join Now and Enter Sweepstake_0b0cd5'), 
    'By clicking “Join Now and Enter Sweepstakes,” I agree to join Enfamil Family Beginnings and receive free samples, offers and other communications from Enfamil and Mead Johnson Nutrition’s affiliated companies I understand and agree to the Terms of Use, Privacy Policy and Sweepstakes Official Rules.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Terms of Use'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Privacy Policy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Sweepstakes Official Rules'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_ENFAMIL FAMILY BEGINNINGS (1)'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_ENFAMIL FAMILY BEGINNINGS (1)'), 
    'ENFAMIL FAMILY BEGINNINGS')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h2_10 reasons to join Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h2_10 reasons to join Enfamil Family Beginnings'), 
    '10 reasons to join Enfamil Family Beginnings.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_Benefits may vary1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_Benefits may vary1'), 
    'Benefits may vary1')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_1. Shop and earn rewards'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_1. Shop and earn rewards'), 
    '1. Shop and earn rewards')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Earn 10 pointsdollar on Enfamil purchases_afc5a7'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Earn 10 pointsdollar on Enfamil purchases_afc5a7'), 
    'Earn 10 points/dollar on Enfamil purchases2. (Upgrade to our premium program and earn 12 points/dollar.)')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Learn more'), 
    'Learn more')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Learn more'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_2. Engage and earn'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_2. Engage and earn'), 
    '2. Engage and earn')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Read articles, participate in polls and m_ddcb36'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Read articles, participate in polls and m_ddcb36'), 
    'Read articles, participate in polls and more - the more you do, the more you earn.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_3. Share the love'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_3. Share the love'), 
    '3. Share the love')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Well give you 1000 points when your frien_ae08c9'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Well give you 1000 points when your frien_ae08c9'), 
    'We\'ll give you 1000 points when your friends make a purchase (sharing really pays off!)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_4. Formula samples'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_4. Formula samples'), 
    '4. Formula samples')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_As a member of the Enfamil Family Beginni_9731d6'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_As a member of the Enfamil Family Beginni_9731d6'), 
    'As a member of the Enfamil Family Beginnings® program, you may be eligible for free samples.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_5. Discount checks  digital rebates'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_5. Discount checks  digital rebates'), 
    '5. Discount checks & digital rebates')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Enjoy discounts on Enfamil products. Chec_0cdf68'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Enjoy discounts on Enfamil products. Chec_0cdf68'), 
    'Enjoy discounts on Enfamil products. Checks are similar to formula coupons and can be used at most major retailers. We\'ll also send you digital cash back rebates in our app.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_6. Belly Badges'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_6. Belly Badges'), 
    '6. Belly Badges™')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Get a set of Belly Badges so you can shar_9bafd4'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Get a set of Belly Badges so you can shar_9bafd4'), 
    'Get a set of Belly Badges™ so you can share your baby’s special moments and milestones with friends and family.')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Learn more_1'), 
    'Learn more')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Learn more_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_7. A Chance to win free formula for a year'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_7. A Chance to win free formula for a year'), 
    '7. A Chance to win free formula for a year')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_By signing up for Enfamil Family Beginnin_f8cedd'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_By signing up for Enfamil Family Beginnin_f8cedd'), 
    'By signing up for Enfamil Family Beginnings®, you gain entry to our sweepstakes to win a year’s supply of free formula3.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Learn more_1_2'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Learn more_1_2'), 
    'Learn more')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_8. Tips tailored to you'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_8. Tips tailored to you'), 
    '8. Tips tailored to you')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Whether youre pregnant and dont know wher_7d93d8'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Whether youre pregnant and dont know wher_7d93d8'), 
    'Whether you\'re pregnant and don\'t know where to start, or you have a newborn and are starting to get in the swing of things, we\'ll send you emails with expert developmental and nutrition tips tailored to your journey.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_9. Access to our mobile app'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Access to coupons and articles tailored t_a49b3a'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Learn more_1_2_3'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_9. Access to our mobile app'), 
    '9. Access to our mobile app')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Access to coupons and articles tailored t_a49b3a'), 
    'Access to coupons and articles tailored to your little one\'s age and stage. Also check out our digital #BellyBadges and share your baby\'s special milestones with your friends and family.')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Learn more_1_2_3'), 
    'Learn more')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_10. Special offers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Get special gifts and discounts from our _31c1cb'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_10. Special offers'), 
    '10. Special offers')

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Get special gifts and discounts from our _31c1cb'), 
    'Get special gifts and discounts from our partners sent to you during your membership.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_Join Enfamil Family Beginnings for up t_950703'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h2_Join Enfamil Family Beginnings for up to_78b78f'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h2_Join Enfamil Family Beginnings for up to_78b78f'), 
    'Join Enfamil Family Beginnings for up to $400 in free gifts')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_First name_registerGivenNameField_1_2_3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Last name_registerFamilyNameField_1_2_3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Due date or birth date_childregisterC_87b480_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Why'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Email_registerEmailField_1_2_3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Join now'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Join now'), 
    'Join now')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Or register with your social account'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Or register with your social account'), 
    'OR REGISTER WITH YOUR SOCIAL ACCOUNT')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Continue with Facebook'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Sign in with Google'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_By clicking Join Now and Enter Sweepstake_0b0cd5'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_By clicking Join Now and Enter Sweepstake_0b0cd5'), 
    'By clicking “Join Now and Enter Sweepstakes,” I agree to join Enfamil Family Beginnings and receive free samples, offers and other communications from Enfamil and Mead Johnson Nutrition’s affiliated companies I understand and agree to the Terms of Use, Privacy Policy and Sweepstakes Official Rules.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Terms of Use'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Terms of Use'), 
    'Terms of Use')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Privacy Policy'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Privacy Policy'), 
    'Privacy Policy')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Sweepstakes Official Rules'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Sweepstakes Official Rules'), 
    'Sweepstakes Official Rules.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_media screen and (max-width 768px)  .li_440402'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_ALTERNATIVE PROGRAMS'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_ALTERNATIVE PROGRAMS'), 
    'ALTERNATIVE PROGRAMS')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h2_Join a specialty program for samples and_7d0636'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h2_Join a specialty program for samples and_7d0636'), 
    'Join a specialty program for samples and offers tailored to specific needs.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/li_Drive to Thrive Support ProgramFor prema_3c92d2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/li_Nutramigen Savings and Support ProgramFo_933902'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/li_Enspire Family Beginnings ProgramFor bab_540dbd'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_Drive to Thrive Support Program'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_Drive to Thrive Support Program'), 
    'Drive to Thrive Support Program')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_For premature babies'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_For premature babies'), 
    'For premature babies')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Receive up to 70 in savings, plus monthly_835e26'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Receive up to 70 in savings, plus monthly_835e26'), 
    'Receive up to $70 in savings*, plus monthly emails with expert advice on caring for your premature baby. ')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Join now'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_Nutramigen Savings and Support Program'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_Nutramigen Savings and Support Program'), 
    'Nutramigen Savings and Support Program')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_For babies with cows milk allergy'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_For babies with cows milk allergy'), 
    'For babies with cow’s milk allergy')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Join for up to 130 in exclusive savings, _bf0f58'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Join for up to 130 in exclusive savings, _bf0f58'), 
    'Join for up to $130 in exclusive savings, samples, and tips for cow\'s milk allergy management.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Join now_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_Enspire Family Beginnings Program'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_Enspire Family Beginnings Program'), 
    'Enspire Family Beginnings Program')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_For babies using our formula closest to_e207a5'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_For babies using our formula closest to_e207a5'), 
    'For babies using our formula closest to breastmilk')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Enjoy special values, free gifts, a dedic_03abee'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Enjoy special values, free gifts, a dedic_03abee'), 
    'Enjoy special values, free gifts, a dedicated phone number to reach an Enspire Expert, and more.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Join now_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/div_For more ways to earn, download our app_de43e5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h2_For more ways to earn, download our app'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h2_For more ways to earn, download our app'), 
    'For more ways to earn, download our app.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Download the Enfamil Family Beginnings_ff7c19'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Download the Enfamil Family Beginnings_ff7c19'), 
    'Download the Enfamil Family Beginnings app for instant access to exclusive rewards, coupons, tips, digital #BellyBadges and more. Plus get 100 points for downloading.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Prev'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Next'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_Here for you, every step of the way'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_Here for you, every step of the way'), 
    0)

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/h3_Here for you, every step of the way'), 
    'Here for you, every step of the way.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/li_Pregnancy tips for expecting mothers'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/li_Pregnancy tips for expecting mothers'), 
    'Pregnancy tips for expecting mothers.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/li_Guidance and resources for every stage o_33650f'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/li_Guidance and resources for every stage o_33650f'), 
    'Guidance and resources for every stage of your baby’s development.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/li_Tools to track your pregnancy and your b_23c7bc'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/li_Tools to track your pregnancy and your b_23c7bc'), 
    'Tools to track your pregnancy and your baby’s growth.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/img_1_2_3_4_5_6_7_8_9_10'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/img_1_2_3_4_5_6_7_8_9_10_11'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_1. Every motherhood journey is unique, so_de9b3b'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_1. Every motherhood journey is unique, so_de9b3b'), 
    '1. Every motherhood journey is unique, so your Enfamil Family Beginnings experience is tailored to the information you provide and may vary from what another mom might experience. If you have questions about the program or would like more detail, our Family of Experts can help at 1-800-BABY123 between 7am-7pm CST M-F; 8am-4:30pm Sat.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_2. On eligible products purchased on E_07e9f6'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_2. On eligible products purchased on E_07e9f6'), 
    '2. On eligible products purchased on Enfamil.com.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_3. NO PURCHASE OR PAYMENT NECESSARY TO_cd37dd'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_3. NO PURCHASE OR PAYMENT NECESSARY TO_cd37dd'), 
    '3. NO PURCHASE OR PAYMENT NECESSARY TO ENTER OR WIN. A purchase will not increase your chances of winning.   Open to legal US residents 18 and older. Void where prohibited. Promotion ends on December 31, 2022.   Odds of winning depend on the total number of eligible entries received each month. For full Official Rules click here Sponsor: Mead Johnson & Co., LLC, 2400 West Lloyd Expressway, Evansville, IN 47721')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_4. Only the latest printing of Enfamil Fa_4f82f9'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_4. Only the latest printing of Enfamil Fa_4f82f9'), 
    '4. Only the latest printing of Enfamil Family Beginnings® checks include unique codes that are redeemable online in the Enfamil® Shop. All checks are still valid in select retail stores until the posted expiration date. Refer to your personalized checks for redemption details.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/b_All About Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/b_All About Enfamil Family Beginnings'), 
    'All About Enfamil Family Beginnings')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/b_Free baby samples What is Enfamil Family _f1e2da'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/b_Free baby samples What is Enfamil Family _f1e2da'), 
    'Free baby samples: What is Enfamil Family Beginnings?')

WebUI.click(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_The Enfamil Family Beginnings program is _6a8d96'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_The Enfamil Family Beginnings program is _6a8d96'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_The Enfamil Family Beginnings program is _6a8d96'), 
    'The Enfamil Family Beginnings program is a way to earn rewards on Enfamil purchases, get discounts, free baby formula samples, and baby freebies! After signing up, you can receive special offers, get baby formula coupons, information, and more. ')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Enfamil Family Beginnings program'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Enfamil Family Beginnings program'), 
    'Enfamil Family Beginnings program')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_is a way to earn rewards on Enfamil pu_50fb20'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_is a way to earn rewards on Enfamil pu_50fb20'), 
    'is a way to earn rewards on Enfamil purchases, get discounts, free baby formula samples, and baby freebies! After signing up, you can receive special offers, get baby formula coupons, information, and more. ')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_You can earn rewards for referring Enf_178560'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_You can earn rewards for referring Enf_178560'), 
    'You can earn rewards for referring Enfamil to family and friends too. Get custom baby content delivered to your email with tips about baby formulas and how to keep your infant healthy. Download and get access to our mobile app too for more benefits and special offers.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/b_Why Choose Enfamils Baby Formula Samples'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/b_Why Choose Enfamils Baby Formula Samples'), 
    'Why Choose Enfamil’s Baby Formula Samples?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Enfamils baby formula samples can help yo_cc9350'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Enfamils baby formula samples can help yo_cc9350'), 
    'Enfamil’s baby formula samples can help your baby try different types of baby formulas. You can see which ingredients and formulas work best for your little one. Enfamil has different lines of baby formulas for infants and formula samples allow you to test infant formulas and have different options as infants grow and develop. If you get free baby formula samples through our rewards program, you can also pass them on to family and friends with babies.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_infant formulas'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_infant formulas'), 
    'infant formulas')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_infants grow and develop'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_infants grow and develop'), 
    'infants grow and develop')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_If you get free baby formula samples t_7f1213'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_If you get free baby formula samples t_7f1213'), 
    '. If you get free baby formula samples through our rewards program, you can also pass them on to family and friends with babies.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/b_How to get free baby formula'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/b_How to get free baby formula'), 
    'How to get free baby formula')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Sign up for Enfamils Family Beginnings'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Sign up for Enfamils Family Beginnings'), 
    'Sign up for Enfamil’s Family Beginnings')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_to get free baby formulas and free bab_ac67de'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_to get free baby formulas and free bab_ac67de'), 
    'to get free baby formulas and free baby stuff. Enfamil also offers a chance to win free baby formula for a year when you sign up!')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/b_Get free baby stuff and more'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/b_Get free baby stuff and more'), 
    'Get free baby stuff and more')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Enfamil is the 1 infant formula brand rec_588986'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Enfamil is the 1 infant formula brand rec_588986'), 
    'Enfamil is the #1 infant formula brand recommended by pediatricians. Our Enfamil Family Beginnings program is a unique way to get free baby stuff and more. You can get up to $400 in free baby stuff for signing up, plus additional rewards. With over 100 years of nutritional expertise in the baby formula space, Enfamil is a trusted brand for baby formula and more.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_baby formula'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_baby formula'), 
    'baby formula')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/b_More baby item offers'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/b_More baby item offers'), 
    'More baby item offers')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Sign up for Enfamil emails and join Enfam_6903f6'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/p_Sign up for Enfamil emails and join Enfam_6903f6'), 
    'Sign up for Enfamil emails and join Enfamil Family Beginnings to get more baby item offers, baby freebies, baby formula coupons, and learn how to get free baby stuff.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Enfamil Family Beginnings_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Enfamil Family Beginnings_1'), 
    'Enfamil Family Beginnings')

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_First name_registerGivenNameField_1_2_3_4_5'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Last name_registerFamilyNameField_1_2_3_4_5'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Due date or birth date_childregisterC_87b480_1_2_3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Why'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Email_registerEmailField_1_2_3_4_5'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Join now'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Continue with Facebook'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Sign in with Google'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/svg'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Terms of Use'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Privacy Policy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Sweepstakes Official Rules'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Learn more'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Learn more_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Learn more_1_2_3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_First name_registerGivenNameField_1_2_3_4_5_6_7'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Last name_registerFamilyNameField_1_2_3_4_5_6_7'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Due date or birth date_childregisterC_87b480_1_2_3_4'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Why'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/input_Email_registerEmailField_1_2_3_4_5_6_7'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Join now'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Continue with Facebook'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Sign in with Google'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Terms of Use'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Privacy Policy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Sweepstakes Official Rules'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Join now'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Join now_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/a_Join now_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Prev'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/button_Next'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/img_1_2_3_4_5_6_7_8_9_10'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/img_1_2_3_4_5_6_7_8_9_10_11'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/u_here'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Enfamil Family Beginnings program'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_infant formulas'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_infants grow and develop'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_infants grow and develop'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Sign up for Enfamils Family Beginnings'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_baby formula'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Form Verification/Enrollment Form/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Enfamil Family Beginnings_1'))

WebUI.closeBrowser()

