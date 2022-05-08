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

WebUI.navigateToUrl(GlobalVariable.HomePage)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/button_GOT IT_onetrust-close-btn-handler on_95ce22'))

WebUI.delay(8)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Tips  Resources'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Tips  Resources'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Tips  Resources'), 
    'Tips & Resources')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_BY AGES STAGES 1'), 
    'BY AGES & STAGES')

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_BY AGES STAGES 1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_BY FEEDING TOPIC'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Tips  Resources'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_BY FEEDING TOPIC'), 
    'BY FEEDING TOPIC')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_TOOLS'), 
    'TOOLS')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_FEATURED 2'), 'FEATURED')

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_FEATURED 2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_FAQs'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_FAQs'), 
    'FAQs')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/p_Helpful advice and answers to parents mos_7696c9'), 
    'Helpful advice and answers to parents\' most common questions.')

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Prenatal 2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_PostnatalAfter pregnancy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Premature09 mos'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Newborn0-3 mos'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Infant0 - 12 mos'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Toddler1-3 yrs'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Tips  Resources'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Prenatal 2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h2_My Pregnancy'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h2_My Pregnancy'), 'My Pregnancy')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Prenatal'), 'Prenatal')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Tips  Resources'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_PostnatalAfter pregnancy'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Postnatal'), 'Postnatal')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h2_After Pregnancy'), 'After Pregnancy')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Tips  Resources'))

WebUI.click(findTestObject('Header/Page_/a_Premature_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Premature'), 'Premature')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Premature Baby Care'), 'Premature Baby Care')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Tips  Resources'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Newborn0-3 mos'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Newborn'), 'Newborn')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Newborn'), 'Newborn')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Tips  Resources'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Infant0 - 12 mos'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Infant'), 'Infant')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Infant'), 'Infant')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Infant'), 0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Tips  Resources'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Toddler1-3 yrs'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Toddler'), 'Toddler')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Toddler'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Toddler'), 'Toddler')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Tips  Resources'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Formula Feeding'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Formula Feeding'), 'Formula Feeding')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Formula Feeding'), 0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Tips  Resources'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Breastfeeding'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Breastfeeding Your Baby'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Breastfeeding'), 'Breastfeeding Your Baby')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Tips  Resources'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Supplementing'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Supplementing'), 'Supplementing')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Supplementing with Formula'), 'Supplementing with Formula')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Supplementing with Formula'), 0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Tips  Resources'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Feeding Issues'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Feeding Issues'), 'Feeding Issues')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Baby Feeding Issues'), 'Baby Feeding Issues')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Baby Feeding Issues'), 0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Tips  Resources'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Enfamil Formula Comparison'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Product Comparison'), 'Product Comparison')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Tips  Resources'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Competitor Formula Comparison'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Similac Vs Enfamil Baby Formula Compar_3fb2fb/span_Baby Formula Recall'), 
    'Baby Formula Comparison Chart')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Similac Vs Enfamil Baby Formula Compar_3fb2fb/h1_Enfamil Formula Equivalents'), 
    0)

WebUI.navigateToUrl(GlobalVariable.HomePage)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Similac Vs Enfamil Baby Formula Compar_3fb2fb/span_Tips  Resources'))

WebUI.click(findTestObject('Header/New Folder/Page_Enfamil Newborn, Infant  Toddler Nutrition  Enfamil/a_Baby Feeding Guide'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Baby Feeding Guide  Enfamil/span_Baby Feeding Guide'), 
    'Baby Feeding Guide')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Baby Feeding Guide  Enfamil/h1_Baby Feeding Guide'), 
    0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Baby Feeding Guide  Enfamil/span_Tips  Resources'))

WebUI.delay(3)

WebUI.click(findTestObject('Header/New Folder/Page_Enfamil Newborn, Infant  Toddler Nutrition  Enfamil/a_Store Locator'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Store Locator Baby Formula Near Me  Enfamil/span_Store Locator'), 
    'Store Locator')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Store Locator Baby Formula Near Me  Enfamil/span_Tips  Resources'))

WebUI.click(findTestObject('Object Repository/Header/Page_Store Locator Baby Formula Near Me  Enfamil/div_Open menuShop ProductsShop ProductsShop_68227c'))

WebUI.delay(5)

WebUI.closeBrowser()

