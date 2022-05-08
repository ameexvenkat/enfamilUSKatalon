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

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/Enfamil products'), 
    0)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/img'), 
    0)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/div_Open menuShop ProductsShop ProductsShop_68227c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/p_Enfamil products unaffected by recall. Le_0a6984'), 
    0)

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/p_Enfamil products unaffected by recall. Le_0a6984'), 
    'Enfamil products unaffected by recall. Learn more.')

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/u_Learn more'), 
    0)

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/u_Learn more'))

WebUI.rightClick(findTestObject('Object Repository/Header/Page_Enfamil Formula Safety  Enfamil/div_HomeEnfamil Formula Safety'))

WebUI.rightClick(findTestObject('Object Repository/Header/Page_Enfamil Formula Safety  Enfamil/a_Free Shipping over 50    Happiness guaran_1fc1e2'))

WebUI.rightClick(findTestObject('Object Repository/Header/Page_Enfamil Formula Safety  Enfamil/div_Open menuShop ProductsShop ProductsShop_68227c'))

WebUI.rightClick(findTestObject('Object Repository/Header/Page_Enfamil Formula Safety  Enfamil/ul_HomeEnfamil Formula Safety'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil Formula Safety  Enfamil/div_Enfamil Formula Safety'), 
    'Enfamil® Formula Safety')

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Close'), 
    0)

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Close'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/u_Learn more'))

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/Enfamil products'), 
    0)

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Close'))

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/div_1 brand recommended by pediatricians'), 
    0)

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/div_1 brand recommended by pediatricians'), 
    '#1 brand recommended by pediatricians')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/div_1 brand recommended by pediatricians'), 
    '#1 brand recommended by pediatricians')

WebUI.rightClick(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Ask a Nurse'))

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Ask a Nurse'), 
    'Ask a Nurse')

WebUI.rightClick(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Ask a Nurse'))

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Ask a Nurse'), 
    0)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Join Enfamil Family Beginnings'), 
    0)

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Join Enfamil Family Beginnings'), 
    'Join Enfamil Family Beginnings®')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Sign In'), 
    'Sign In')

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Sign In'), 
    0)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Espaol'), 
    0)

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Espaol'), 
    'Español')

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Ask a Nurse'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Join Enfamil Family Beginnings'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Sign In'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Espaol'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/div_1 brand recommended by pediatricians'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Header/Page_Why Enfamil  Enfamil/h1_Why Enfamil'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Why Enfamil  Enfamil/h1_Why Enfamil'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Why Enfamil  Enfamil/h1_Why Enfamil'), 'Why Enfamil®?')

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Join Enfamil Family Beginnings'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Enfamil Family Beginnings'), 
    0)

WebUI.rightClick(findTestObject('Object Repository/Header/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Enfamil Family Beginnings'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Free Baby Formula Samples  Coupons  Enfamil/span_Enfamil Family Beginnings'), 
    'Enfamil Family Beginnings©')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Free Baby Formula Samples  Coupons  Enfamil/div_First nameLast nameDue date or birth da_610c3b'), 
    0)

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/fieldset_EmailPasswordEnter your passwordFo_0d1eb6'), 
    0)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Close'), 
    0)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/p_Sign In to Enfamil Family Beginnings'), 
    0)

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Close'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Espaol'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil frmula frmula para bebs  Enfamil US/div_1 Marca recomendada por pediatras'), 
    '#1 Marca recomendada por pediatras')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil frmula frmula para bebs  Enfamil US/span_Productos para Comprar'), 
    'Productos para Comprar')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil frmula frmula para bebs  Enfamil US/span_Consejos y Recursos'), 
    'Consejos y Recursos')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil frmula frmula para bebs  Enfamil US/span_Ofertas y Ahorros'), 
    'Ofertas y Ahorros')

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil frmula frmula para bebs  Enfamil US/div_Points_carousel-item__content-image'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Enfamil frmula frmula para bebs  Enfamil US/div_Points_carousel-item__content-image'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Enfamil frmula frmula para bebs  Enfamil US/h2_Tu beb naci lleno de maravillas'), 
    'Tu bebé nació lleno de maravillas')

WebUI.click(findTestObject('Object Repository/Header/Page_Enfamil frmula frmula para bebs  Enfamil US/a_English'))

WebUI.rightClick(findTestObject('Header/Page_Enfamil Newborn, Infant/div_Home_carousel-item__content-image'))

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/div_carousel-item__content-image'), 
    '')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/div_Home_carousel-item__content-image'), 
    '')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Shop Products'), 
    'Shop Products')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Tips  Resources'), 
    'Tips & Resources')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Why Enfamil'), 
    'Why Enfamil')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Offers  Savings'), 
    'Offers & Savings')

WebUI.verifyElementVisible(findTestObject('Header/Page_Enfamil Newborn, Infant/img'))

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/img'), 
    0)

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/img'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/img'))

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/div_1 brand recommended by pediatriciansAsk_479c76'), 
    '#1 brand recommended by pediatriciansAsk a NurseJoin Enfamil Family Beginnings®For up to $400 in free gifts and special offersSign InEspañol')

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Shop Products'), 
    0)

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Shop Products'), 
    'Shop Products')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Tips  Resources'), 
    'Tips & Resources')

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Tips  Resources'), 
    0)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Why Enfamil'), 
    0)

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Why Enfamil'), 
    'Why Enfamil')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Why Enfamil'), 
    'Why Enfamil')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Offers  Savings'), 
    'Offers & Savings')

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Offers  Savings'), 
    0)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Show contact page'), 
    0)

WebUI.rightClick(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Toggle search box'))

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Toggle search box'), 
    0)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Toggle search box_cart-tooltip-trigg_c05b76'), 
    0)

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Toggle search box_cart-tooltip-trigg_c05b76'))

WebUI.rightClick(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Toggle search box'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Toggle search box'))

WebUI.rightClick(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Show contact page'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/button_Show contact page'))

WebUI.mouseOver(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Shop Products'))

WebUI.rightClick(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Shop Products'))

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/div_Shop all productsBrowse our products by_a12a09'), 
    0)

WebUI.verifyElementVisible(findTestObject('Header/Page_Enfamil Newborn, Infant/div_Shop all productsBrowse our products by_a12a09'))

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/div_BY AGES  STAGES'), 
    'BY AGES & STAGES')

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/span_BY FEEDING NEED'), 
    0)

WebUI.rightClick(findTestObject('Header/Page_Enfamil Newborn, Infant/span_BY PRODUCT CATEGORY'))

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/span_BY PRODUCT CATEGORY'), 
    'BY PRODUCT CATEGORY')

WebUI.verifyElementText(findTestObject('Header/Page_Enfamil Newborn, Infant/span_BY FEEDING NEED'), 
    'BY FEEDING NEED')

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/div_BY FEEDING NEED Everyday NutritionTummy_33ab03'), 
    0)

WebUI.rightClick(findTestObject('Header/Page_Enfamil Newborn, Infant/div_BY PRODUCT CATEGORY FormulaVitamins  Su_4e6890'))

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/div_BY PRODUCT CATEGORY FormulaVitamins  Su_4e6890'), 
    0)

WebUI.verifyElementPresent(findTestObject('Header/Page_Enfamil Newborn, Infant/div_FEATURED'), 
    0)

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Infant012 mos'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Toddler1-3 years'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Premature09 mos'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Premature09 mos'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/a_PrenatalPregnancy and pre-conception'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Everyday Nutrition'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Tummy Troubles'))

WebUI.rightClick(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Allergies'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Allergies'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Special Dietary Needs'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Formula'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Vitamins  Supplements'))

WebUI.verifyElementClickable(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Feeding Accessories'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Infant012 mos'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Header/Page_Infant Products  Enfamil US/h1_Infant'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Infant Products  Enfamil US/h1_Infant'), 'Infant')

WebUI.click(findTestObject('Object Repository/Header/Page_Infant Products  Enfamil US/img'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Toddler1-3 years'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Toddler Vitamins  Nutritional Drinks'), 'Toddler Vitamins & Nutritional Drinks')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Toddler Vitamins  Nutritional Drinks'), 0)

WebUI.click(findTestObject('Object Repository/Header/Page_/img'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Premature09 mos'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Preemie Formula - Premature Baby Formu_fe4960/h1_Preemie Formulas'), 
    'Preemie Formulas')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Preemie Formula - Premature Baby Formu_fe4960/h1_Preemie Formulas'), 
    0)

WebUI.click(findTestObject('Object Repository/Header/Page_Preemie Formula - Premature Baby Formu_fe4960/img'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/a_PrenatalPregnancy and pre-conception'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Prenatal Vitamins'), 'Prenatal Vitamins')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Prenatal Vitamins'), 0)

WebUI.click(findTestObject('Object Repository/Header/Page_/img'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Everyday Nutrition'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Baby Formula for Everyday Baby Nutrition'), 'Baby Formula for Everyday Baby Nutrition')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Baby Formula for Everyday Baby Nutrition'), 
    0)

WebUI.click(findTestObject('Object Repository/Header/Page_/img'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Tummy Troubles'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Formula for Baby Tummy Troubles'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Formula for Baby Tummy Troubles'), 'Formula for Baby Tummy Troubles')

WebUI.click(findTestObject('Object Repository/Header/Page_/img'))

WebUI.mouseOver(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Shop Products'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Allergies'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Hypoallergenic Baby Formulas'), 'Hypoallergenic Baby Formulas')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Hypoallergenic Baby Formulas'), 0)

WebUI.click(findTestObject('Object Repository/Header/Page_/img'))

WebUI.rightClick(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Shop Products'))

WebUI.mouseOver(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Shop Products'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Special Dietary Needs'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Special Baby Formula'), 'Special Baby Formula')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Special Baby Formula'), 0)

WebUI.click(findTestObject('Object Repository/Header/Page_/img'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Espaol_main-header__logo-link link link--active'))

WebUI.mouseOver(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Shop Products'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Formula'))

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Enfamil Baby Formula  Toddler Nutritiona_4eab9f'), 
    'Enfamil Baby Formula & Toddler Nutritional Drinks')

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Enfamil Baby Formula  Toddler Nutritiona_4eab9f'), 
    0)

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Espaol_main-header__logo-link link link--_b21617'))

WebUI.mouseOver(findTestObject('Header/Page_Enfamil Newborn, Infant/li_Shop ProductsShop ProductsShop all produ_dc3f9e'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Vitamins  Supplements'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_Baby Vitamins  Supplements/h1_Vitamins  Supplements for Babies, Toddle_9c4f93'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_Baby Vitamins  Supplements/h1_Vitamins  Supplements for Babies, Toddle_9c4f93'), 
    'Vitamins & Supplements for Babies, Toddlers & Moms')

WebUI.click(findTestObject('Object Repository/Header/Page_Baby Vitamins  Supplements/a_Espaol_main-header__logo-link link link--_b21617'))

WebUI.mouseOver(findTestObject('Header/Page_Enfamil Newborn, Infant/span_Shop Products'))

WebUI.click(findTestObject('Header/Page_Enfamil Newborn, Infant/a_Feeding Accessories'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Page_/h1_Accessories'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Header/Page_/h1_Accessories'), 'Accessories')

WebUI.click(findTestObject('Object Repository/Header/Page_/a_Espaol_main-header__logo-link link link--_b21617'))

WebUI.closeBrowser()

