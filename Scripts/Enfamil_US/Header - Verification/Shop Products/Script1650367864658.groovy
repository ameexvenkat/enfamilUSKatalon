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

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/li_Shop ProductsShop ProductsShop all produ_dc3f9e'), 
    0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Shop Products'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_Shop Products'), 
    'Shop Products')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Shop all products'), 
    'Shop all products')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Shop all products'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_BY AGES  STAGES'), 
    'BY AGES & STAGES')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_BY AGES  STAGES'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_BY FEEDING NEED'), 
    'BY FEEDING NEED')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_BY FEEDING NEED'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_BY PRODUCT CATEGORY'), 
    'BY PRODUCT CATEGORY')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/span_BY PRODUCT CATEGORY'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/div_FEATURED'), 'FEATURED')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/div_FEATURED'), 0)

WebUI.click(findTestObject('Object Repository/Header/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/a_Shop all products'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Shop  Enfamil/span_Products'), 'Products')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Shop  Enfamil/h2_Enfamil Shop'), 'Join for up to $400 in free gifts.')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Shop  Enfamil/span_Shop Products'))

WebUI.click(findTestObject('Object Repository/Header/Page_Shop  Enfamil/a_Infant012 mos'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Infant Products  Enfamil US/h1_Infant'), 'Infant')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Infant Products  Enfamil US/span_Newborn Infant Formula'), 
    'Newborn Infant Formula')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Infant Products  Enfamil US/span_Shop Products'))

WebUI.click(findTestObject('Object Repository/Header/Page_Infant Products  Enfamil US/a_Toddler1-3 years'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Toddler Vitamins Nutritional Drink'), 'Toddler Vitamins Nutritional Drink')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Toddler Vitamins  Nutritional Drinks'), 'Toddler Vitamins & Nutritional Drinks')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Preemie Formula - Premature Baby Formu_fe4960/span_Shop Products'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Premature09 mos'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Preemie Formula - Premature Baby Formu_fe4960/span_Preemie Formula'), 
    'Preemie Formula')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Preemie Formula - Premature Baby Formu_fe4960/h1_Preemie Formulas'), 
    'Preemie Formulas')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Preemie Formula - Premature Baby Formu_fe4960/span_Shop Products'))

WebUI.click(findTestObject('Object Repository/Header/Page_Preemie Formula - Premature Baby Formu_fe4960/a_PrenatalPregnancy and pre-conception'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Prenatal Vitamins'), 'Prenatal Vitamins')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Prenatal Vitamins'), 'Prenatal Vitamins')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Shop Products'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/div_FEATURED'), 'FEATURED')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/div_FEATURED'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/a_Enfamil NeuroPro Infant Formula'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/a_Enfamil NeuroPro Gentlease Infant Formula'), 
    0)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Shop Products'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Everyday Nutrition'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Baby Formula for Everyday Baby Nutrition'), 'Baby Formula for Everyday Baby Nutrition')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Baby Formula'), 'Baby Formula')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Shop Products'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Tummy Troubles'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Sensitive Stomach Baby Formula'), 'Sensitive Stomach Baby Formula')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Formula for Baby Tummy Troubles'), 'Formula for Baby Tummy Troubles')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Shop Products'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Allergies'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Hypoallergenic Baby Formulas'), 'Hypoallergenic Baby Formulas')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Hypoallergenic Baby Formula'), 'Hypoallergenic Baby Formula')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Shop Products'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Special Dietary Needs'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Special Dietary Needs'), 'Special Dietary Needs')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Special Baby Formula'), 'Special Baby Formula')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Shop Products'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Formula'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Shop Products'))

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Vitamins  Supplements'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Baby Vitamins  Supplements/span_Baby Vitamins and Supplements'), 
    'Baby Vitamins and Supplements')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_Baby Vitamins  Supplements/span_Shop Products'))

WebUI.click(findTestObject('Object Repository/Header/Page_Baby Vitamins  Supplements/a_Feeding Accessories'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Baby Feeding Accessories'), 'Baby Feeding Accessories')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/span_Baby Feeding Accessories'), 'Baby Feeding Accessories')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Accessories'), 'Accessories')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Header/Page_/span_Shop Products'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/a_Enfamil NeuroPro Infant Formula'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/a_Enfamil NeuroPro Gentlease Infant Formula'), 
    0)

WebUI.delay(5)

WebUI.closeBrowser()

