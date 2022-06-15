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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/')

WebUI.waitForElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    3)

WebUI.verifyElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    0)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

WebUI.click(findTestObject('Nutramigen/Do not Test/Login Object info/Verify sign-in link in header'))

WebUI.verifyElementPresent(findTestObject('Nutramigen/Do not Test/Login Object info/Verify sign-in popup is showing'), 0)

WebUI.sendKeys(findTestObject('Nutramigen/Do not Test/Login Object info/Verify entering email'), 'mithun.uat2007_enroll01@gmail.com')

WebUI.focus(findTestObject('Nutramigen/Do not Test/Login Object info/Verify entering password'))

WebUI.sendKeys(findTestObject('Nutramigen/Do not Test/Login Object info/Verify entering password'), 'Ameexusa@1')

WebUI.click(findTestObject('Nutramigen/Do not Test/Login Object info/Verify Sign in button in popup'))

WebUI.delay(20)

WebUI.waitForPageLoad(10)

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/nutramigen-savings-and-support-program/thank-you/')

WebUI.waitForPageLoad(10)

Thank_Hero_Eyebrow_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Hero Banner section - Eyebrow'), 
    Font_Color)

WebUI.verifyMatch(Thank_Hero_Eyebrow_FontColor, 'rgba(0, 37, 122, 1)', false)

Thank_Hero_Eyebrow_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Hero Banner section - Eyebrow'), 
    Font_Size)

WebUI.verifyMatch(Thank_Hero_Eyebrow_FontSize, '12px', false)

Thank_Hero_Eyebrow_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Hero Banner section - Eyebrow'), 
    Font_Weight)

if (Thank_Hero_Eyebrow_FontWeight == 'bold') {
    println(('Font Weight of Thank_Hero_Eyebrow is' + Thank_Hero_Eyebrow_FontWeight) + 'and is passed')
} else if (Thank_Hero_Eyebrow_FontWeight == '700') {
    println(('Font Weight of Thank_Hero_Eyebrow is' + Thank_Hero_Eyebrow_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Thank_Hero_Eyebrow is not 700 or bold')
}

Thank_Hero_Eyebrow_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Hero Banner section - Eyebrow'), 
    Font_Family)

WebUI.verifyMatch(Thank_Hero_Eyebrow_FontFamily, '"Open Sans"', false)

Thank_Banner_Msg_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Hero Banner - Thankyou Message'), 
    Font_Color)

WebUI.verifyMatch(Thank_Banner_Msg_FontColor, 'rgba(0, 37, 122, 1)', false)

Thank_Banner_Msg_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Hero Banner - Thankyou Message'), 
    Font_Size)

WebUI.verifyMatch(Thank_Banner_Msg_FontSize, '56px', false)

Thank_Banner_Msg_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Hero Banner - Thankyou Message'), 
    Font_Weight)

if (Thank_Banner_Msg_FontWeight == 'normal') {
    println(('Font Weight of Thank_Banner_Msg is' + Thank_Banner_Msg_FontWeight) + 'and is passed')
} else if (Thank_Banner_Msg_FontWeight == '400') {
    println(('Font Weight of Thank_Banner_Msg is' + Thank_Banner_Msg_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Thank_Banner_Msg is not 400 or normal')
}

Thank_Banner_Msg_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Hero Banner - Thankyou Message'), 
    Font_Family)

WebUI.verifyMatch(Thank_Banner_Msg_FontFamily, '"Quatro Slab", Arial, Helvetica, sans-serif', false)

Thank_Featured_Head_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Featured Articles section'), 
    Font_Color)

WebUI.verifyMatch(Thank_Featured_Head_FontColor, 'rgba(0, 37, 122, 1)', false)

Thank_Featured_Head_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Featured Articles section'), 
    Font_Size)

WebUI.verifyMatch(Thank_Featured_Head_FontSize, '56px', false)

Thank_Featured_Head_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Featured Articles section'), 
    Font_Weight)

if (Thank_Featured_Head_FontWeight == 'normal') {
    println(('Font Weight of Thank_Featured_Head is' + Thank_Featured_Head_FontWeight) + 'and is passed')
} else if (Thank_Featured_Head_FontWeight == '400') {
    println(('Font Weight of Thank_Featured_Head is' + Thank_Featured_Head_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Thank_Featured_Head is not 400 or normal')
}

Thank_Featured_Head_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Featured Articles section'), 
    Font_Family)

WebUI.verifyMatch(Thank_Featured_Head_FontFamily, '"Quatro Slab", Arial, Helvetica, sans-serif', false)

for (i = 1; i <= 4; i++) {
    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify each Articles Card under Featured Articles', 
            [('Articles_Card_No') : i]), 0)

    println(('Articles Card' + i) + 'present')

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify title in each Articles Card', 
            [('Articles_Card_No') : i]), 0)

    Thank_Featured_Arti_Title_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify title in each Articles Card', 
            [('Articles_Card_No') : i]), Font_Color)

    WebUI.verifyMatch(Thank_Featured_Arti_Title_FontColor, 'rgba(0, 37, 122, 1)', false)

    Thank_Featured_Arti_Title_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify title in each Articles Card', 
            [('Articles_Card_No') : i]), Font_Size)

    WebUI.verifyMatch(Thank_Featured_Arti_Title_FontSize, '16px', false)

    Thank_Featured_Arti_Title_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify title in each Articles Card', 
            [('Articles_Card_No') : i]), Font_Weight)

    if (Thank_Featured_Arti_Title_FontWeight == 'normal') {
        println(('Font Weight of Thank_Featured_Arti_Title is' + Thank_Featured_Arti_Title_FontWeight) + 'and is passed')
    } else if (Thank_Featured_Arti_Title_FontWeight == '400') {
        println(('Font Weight of Thank_Featured_Arti_Title is' + Thank_Featured_Arti_Title_FontWeight) + 'and is passed')
    } else {
        println('Font Weight of Thank_Featured_Arti_Title is not 400 or normal')
    }
    
    Thank_Featured_Arti_Title_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify title in each Articles Card', 
            [('Articles_Card_No') : i]), Font_Family)

    WebUI.verifyMatch(Thank_Featured_Arti_Title_FontFamily, '"Quatro Slab Semi-Bold", Arial, Helvetica, sans-serif', false)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Read Time in each Articles Card', 
            [('Articles_Card_No') : i]), 0)

    Thank_Featured_Read_Time_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Read Time in each Articles Card', 
            [('Articles_Card_No') : i]), Font_Color)

    WebUI.verifyMatch(Thank_Featured_Read_Time_FontColor, 'rgba(90, 91, 94, 1)', false)

    Thank_Featured_Read_Time_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Read Time in each Articles Card', 
            [('Articles_Card_No') : i]), Font_Size)

    WebUI.verifyMatch(Thank_Featured_Read_Time_FontSize, '12px', false)

    Thank_Featured_Read_Time_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Read Time in each Articles Card', 
            [('Articles_Card_No') : i]), Font_Weight)

    if (Thank_Featured_Read_Time_FontWeight == 'bold') {
        println(('Font Weight of Thank_Featured_Read_Time is' + Thank_Featured_Read_Time_FontWeight) + 'and is passed')
    } else if (Thank_Featured_Read_Time_FontWeight == '700') {
        println(('Font Weight of Thank_Featured_Read_Time is' + Thank_Featured_Read_Time_FontWeight) + 'and is passed')
    } else {
        println('Font Weight of Thank_Featured_Read_Time is not 700 or bold')
    }
    
    Thank_Featured_Read_Time_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Read Time in each Articles Card', 
            [('Articles_Card_No') : i]), Font_Family)

    WebUI.verifyMatch(Thank_Featured_Read_Time_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

    Thank_Featured_Read_Time_BgColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Read Time in each Articles Card'), 
        BgColor)

    WebUI.verifyMatch(Thank_Featured_Read_Time_BgColor, 'rgba(235, 235, 235, 1)', false)
}

Thank_Prod_Bann_Head_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner section - Heading'), 
    Font_Color)

WebUI.verifyMatch(Thank_Prod_Bann_Head_FontColor, 'rgba(0, 37, 122, 1)', false)

Thank_Prod_Bann_Head_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner section - Heading'), 
    Font_Size)

WebUI.verifyMatch(Thank_Prod_Bann_Head_FontSize, '32px', false)

Thank_Prod_Bann_Head_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner section - Heading'), 
    Font_Weight)

if (Thank_Prod_Bann_Head_FontWeight == 'normal') {
    println(('Font Weight of Thank_Prod_Bann_Head is' + Thank_Prod_Bann_Head_FontWeight) + 'and is passed')
} else if (Thank_Prod_Bann_Head_FontWeight == '400') {
    println(('Font Weight of Thank_Prod_Bann_Head is' + Thank_Prod_Bann_Head_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Thank_Prod_Bann_Head is not 400 or normal')
}

Thank_Prod_Bann_Head_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner section - Heading'), 
    Font_Family)

WebUI.verifyMatch(Thank_Prod_Bann_Head_FontFamily, '"Quatro Slab", Arial, Helvetica, sans-serif', false)

Thank_Product_Banner_CTA_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner Section - CTA'), 
    Font_Color)

WebUI.verifyMatch(Thank_Product_Banner_CTA_FontColor, 'rgba(255, 255, 255, 1)', false)

Thank_Product_Banner_CTA_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner Section - CTA'), 
    Font_Size)

WebUI.verifyMatch(Thank_Product_Banner_CTA_FontSize, '14px', false)

Thank_Product_Banner_CTA_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner Section - CTA'), 
    Font_Weight)

if (Thank_Product_Banner_CTA_FontWeight == 'bold') {
    println(('Font Weight of Thank_Product_Banner_CTA is' + Thank_Product_Banner_CTA_FontWeight) + 'and is passed')
} else if (Thank_Product_Banner_CTA_FontWeight == '700') {
    println(('Font Weight of Thank_Product_Banner_CTA is' + Thank_Product_Banner_CTA_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Thank_Product_Banner_CTA is not 700 or bold')
}

Thank_Product_Banner_CTA_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner Section - CTA'), 
    Font_Family)

WebUI.verifyMatch(Thank_Product_Banner_CTA_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

Thank_Product_Banner_CTA_BgColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Product Banner Section - CTA_1'), 
    BgColor)

WebUI.verifyMatch(Thank_Product_Banner_CTA_BgColor, 'rgba(0, 37, 122, 1)', false)

Thank_App_Carousel_Title_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Title'), 
    Font_Color)

WebUI.verifyMatch(Thank_App_Carousel_Title_FontColor, 'rgba(0, 37, 122, 1)', false)

Thank_App_Carousel_Title_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Title'), 
    Font_Size)

WebUI.verifyMatch(Thank_App_Carousel_Title_FontSize, '42px', false)

Thank_App_Carousel_Title_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Title'), 
    Font_Weight)

if (Thank_App_Carousel_Title_FontWeight == 'normal') {
    println(('Font Weight of Thank_App_Carousel_Title is' + Thank_App_Carousel_Title_FontWeight) + 'and is passed')
} else if (Thank_App_Carousel_Title_FontWeight == '400') {
    println(('Font Weight of Thank_App_Carousel_Title is' + Thank_App_Carousel_Title_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Thank_App_Carousel_Title is not 400 or normal')
}

Thank_App_Carousel_Title_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Title'), 
    Font_Family)

WebUI.verifyMatch(Thank_App_Carousel_Title_FontFamily, '"Quatro Slab", Arial, Helvetica, sans-serif', false)

Thank_App_Carousel_Descrip_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Description'), 
    Font_Color)

WebUI.verifyMatch(Thank_App_Carousel_Descrip_FontColor, 'rgba(33, 33, 33, 1)', false)

Thank_App_Carousel_Descrip_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Description'), 
    Font_Size)

WebUI.verifyMatch(Thank_App_Carousel_Descrip_FontSize, '16px', false)

Thank_App_Carousel_Descrip_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Description'), 
    Font_Weight)

if (Thank_App_Carousel_Descrip_FontWeight == 'normal') {
    println(('Font Weight of Thank_App_Carousel_Descrip is' + Thank_App_Carousel_Descrip_FontWeight) + 'and is passed')
} else if (Thank_App_Carousel_Descrip_FontWeight == '400') {
    println(('Font Weight of Thank_App_Carousel_Descrip is' + Thank_App_Carousel_Descrip_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Thank_App_Carousel_Descrip is not 400 or normal')
}

Thank_App_Carousel_Descrip_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Description'), 
    Font_Family)

WebUI.verifyMatch(Thank_App_Carousel_Descrip_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

Thank_App_Carousel_Descrip_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Description'), 
    Font_Color)

WebUI.verifyMatch(Thank_App_Carousel_Descrip_FontColor, 'rgba(33, 33, 33, 1)', false)

Thank_App_Carousel_Descrip_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Description'), 
    Font_Size)

WebUI.verifyMatch(Thank_App_Carousel_Descrip_FontSize, '16px', false)

Thank_App_Carousel_Descrip_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Description'), 
    Font_Weight)

if (Thank_App_Carousel_Descrip_FontWeight == 'normal') {
    println(('Font Weight of Thank_App_Carousel_Descrip is' + Thank_App_Carousel_Descrip_FontWeight) + 'and is passed')
} else if (Thank_App_Carousel_Descrip_FontWeight == '400') {
    println(('Font Weight of Thank_App_Carousel_Descrip is' + Thank_App_Carousel_Descrip_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Thank_App_Carousel_Descrip is not 400 or normal')
}

Thank_App_Carousel_Descrip_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel Section Description'), 
    Font_Family)

WebUI.verifyMatch(Thank_App_Carousel_Descrip_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

for (i = 1; i <= 4; i++) {
    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider dots', 
            [('sliders') : i]), 0)

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider dots'))

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider Heading', 
            [('sliders') : i]), 0)

    Thank_App_Carousel_Slider_Head_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider Heading'), 
        Font_Color)

    WebUI.verifyMatch(Thank_App_Carousel_Slider_Head_FontColor, 'rgba(0, 37, 122, 1)', false)

    Thank_App_Carousel_Slider_Head_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider Heading'), 
        Font_Size)

    WebUI.verifyMatch(Thank_App_Carousel_Slider_Head_FontSize, '18px', false)

    Thank_App_Carousel_Slider_Head_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider Heading'), 
        Font_Weight)

    if (Thank_App_Carousel_Slider_Head_FontWeight == 'normal') {
        println(('Font Weight of Thank_App_Carousel_Slider_Head is' + Thank_App_Carousel_Slider_Head_FontWeight) + 'and is passed')
    } else if (Thank_App_Carousel_Slider_Head_FontWeight == '400') {
        println(('Font Weight of Thank_App_Carousel_Slider_Head is' + Thank_App_Carousel_Slider_Head_FontWeight) + 'and is passed')
    } else {
        println('Font Weight of Thank_App_Carousel_Slider_Head is not 400 or normal')
    }
    
    Thank_App_Carousel_Slider_Head_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider Heading'), 
        Font_Family)

    WebUI.verifyMatch(Thank_App_Carousel_Slider_Head_FontFamily, '"Quatro Slab Semi-Bold", Arial, Helvetica, sans-serif', 
        false)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify App Carousel section - Slider Info', 
            [('sliders') : i]), 0)
}

Thank_Shop_Section_Head_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop section - Heading'), 
    Font_Color)

WebUI.verifyMatch(Thank_Shop_Section_Head_FontColor, 'rgba(0, 37, 122, 1)', false)

Thank_Shop_Section_Head_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop section - Heading'), 
    Font_Size)

WebUI.verifyMatch(Thank_Shop_Section_Head_FontSize, '42px', false)

Thank_Shop_Section_Head_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop section - Heading'), 
    Font_Weight)

if (Thank_Shop_Section_Head_FontWeight == 'normal') {
    println(('Font Weight of Thank_Shop_Section_Head is' + Thank_Shop_Section_Head_FontWeight) + 'and is passed')
} else if (Thank_Shop_Section_Head_FontWeight == '400') {
    println(('Font Weight of Thank_Shop_Section_Head is' + Thank_Shop_Section_Head_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Thank_Shop_Section_Head is not 400 or normal')
}

Thank_Shop_Section_Head_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop section - Heading'), 
    Font_Family)

WebUI.verifyMatch(Thank_Shop_Section_Head_FontFamily, '"Quatro Slab", Arial, Helvetica, sans-serif', false)

Thank_Shop_Section_Description_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description'), 
    Font_Color)

WebUI.verifyMatch(Thank_Shop_Section_Description_FontColor, 'rgba(33, 33, 33, 1)', false)

Thank_Shop_Section_Description_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description'), 
    Font_Size)

WebUI.verifyMatch(Thank_Shop_Section_Description_FontSize, '16px', false)

Thank_Shop_Section_Description_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description'), 
    Font_Weight)

if (Thank_Shop_Section_Description_FontWeight == 'normal') {
    println(('Font Weight of Thank_Shop_Section_Description is' + Thank_Shop_Section_Description_FontWeight) + 'and is passed')
} else if (Thank_Shop_Section_Description_FontWeight == '400') {
    println(('Font Weight of Thank_Shop_Section_Description is' + Thank_Shop_Section_Description_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Thank_Shop_Section_Description is not 400 or normal')
}

Thank_Shop_Section_Description_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description'), 
    Font_Family)

WebUI.verifyMatch(Thank_Shop_Section_Description_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

Thank_Shop_Section_Description_1_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description_1'), 
    Font_Color)

WebUI.verifyMatch(Thank_Shop_Section_Description_1_FontColor, 'rgba(33, 33, 33, 1)', false)

Thank_Shop_Section_Description_1_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description_1'), 
    Font_Size)

WebUI.verifyMatch(Thank_Shop_Section_Description_1_FontSize, '16px', false)

Thank_Shop_Section_Description_1_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description_1'), 
    Font_Weight)

if (Thank_Shop_Section_Description_1_FontWeight == 'bolder') {
    println(('Font Weight of Thank_Shop_Section_Description is' + Thank_Shop_Section_Description_1_FontWeight) + 'and is passed')
} else if (Thank_Shop_Section_Description_1_FontWeight == '700') {
    println(('Font Weight of Thank_Shop_Section_Description_1 is' + Thank_Shop_Section_Description_1_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Thank_Shop_Section_Description_1 is not 700 or bolder')
}

Thank_Shop_Section_Description_1_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description_1'), 
    Font_Family)

WebUI.verifyMatch(Thank_Shop_Section_Description_1_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

Thank_Shop_Section_Description_2_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description_2'), 
    Font_Color)

WebUI.verifyMatch(Thank_Shop_Section_Description_2_FontColor, 'rgba(33, 33, 33, 1)', false)

Thank_Shop_Section_Description_2_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description_2'), 
    Font_Size)

WebUI.verifyMatch(Thank_Shop_Section_Description_2_FontSize, '16px', false)

Thank_Shop_Section_Description_2_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description_2'), 
    Font_Weight)

if (Thank_Shop_Section_Description_2_FontWeight == 'normal') {
    println(('Font Weight of Thank_Shop_Section_Description_2 is' + Thank_Shop_Section_Description_2_FontWeight) + 'and is passed')
} else if (Thank_Shop_Section_Description_2_FontWeight == '400') {
    println(('Font Weight of Thank_Shop_Section_Description_2 is' + Thank_Shop_Section_Description_2_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Thank_Shop_Section_Description_2 is not 400 or normal')
}

Thank_Shop_Section_Description_2_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - Description_2'), 
    Font_Family)

WebUI.verifyMatch(Thank_Shop_Section_Description_2_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

Thank_Shop_Section_CTA_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - CTA'), 
    Font_Color)

WebUI.verifyMatch(Thank_Shop_Section_CTA_FontColor, 'rgba(255, 255, 255, 1)', false)

Thank_Shop_Section_CTA_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - CTA'), 
    Font_Size)

WebUI.verifyMatch(Thank_Shop_Section_CTA_FontSize, '16px', false)

Thank_Shop_Section_CTA_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - CTA'), 
    Font_Weight)

if (Thank_Shop_Section_CTA_FontWeight == 'bold') {
    println(('Font Weight of Thank_Shop_Section_CTA is' + Thank_Shop_Section_CTA_FontWeight) + 'and is passed')
} else if (Thank_Shop_Section_CTA_FontWeight == '700') {
    println(('Font Weight of Thank_Shop_Section_CTA is' + Thank_Shop_Section_CTA_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Thank_Shop_Section_CTA is not 700 or bold')
}

Thank_Shop_Section_CTA_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - CTA'), 
    Font_Family)

WebUI.verifyMatch(Thank_Shop_Section_CTA_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

Thank_Shop_Section_CTA_BgColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Shop Section - CTA'), 
    BgColor)

WebUI.verifyMatch(Thank_Shop_Section_CTA_BgColor, 'rgba(0, 37, 122, 1)', false)

Thank_Guarantee_Section_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section'), 
    Font_Color)

WebUI.verifyMatch(Thank_Guarantee_Section_FontColor, 'rgba(0, 37, 122, 1)', false)

Thank_Guarantee_Section_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section'), 
    Font_Size)

WebUI.verifyMatch(Thank_Guarantee_Section_FontSize, '24px', false)

Thank_Guarantee_Section_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section'), 
    Font_Weight)

if (Thank_Guarantee_Section_FontWeight == 'normal') {
    println(('Font Weight of Thank_Guarantee_Section is' + Thank_Guarantee_Section_FontWeight) + 'and is passed')
} else if (Thank_Guarantee_Section_FontWeight == '400') {
    println(('Font Weight of Thank_Guarantee_Section is' + Thank_Guarantee_Section_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Thank_Guarantee_Section is not 400 or normal')
}

Thank_Guarantee_Section_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section'), 
    Font_Family)

WebUI.verifyMatch(Thank_Guarantee_Section_FontFamily, '"Quatro Slab", Arial, Helvetica, sans-serif', false)

for (i = 1; i <= 3; i++) {
    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section - Info Heading', 
            [('Guarantee_Heading') : i]), 0)

    Thank_Guarantee_Section_Info_Head_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section - Info Heading', 
            [('Guarantee_Heading') : i]), Font_Color)

    WebUI.verifyMatch(Thank_Guarantee_Section_Info_Head_FontColor, 'rgba(0, 37, 122, 1)', false)

    Thank_Guarantee_Section_Info_Head_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section - Info Heading', 
            [('Guarantee_Heading') : i]), Font_Size)

    WebUI.verifyMatch(Thank_Guarantee_Section_Info_Head_FontSize, '14px', false)

    Thank_Guarantee_Section_Info_Head_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section - Info Heading', 
            [('Guarantee_Heading') : i]), Font_Weight)

    if (Thank_Guarantee_Section_Info_Head_FontWeight == 'bold') {
        println(('Font Weight of Thank_Guarantee_Section_Info_Head is' + Thank_Guarantee_Section_Info_Head_FontWeight) + 
            'and is passed')
    } else if (Thank_Guarantee_Section_Info_Head_FontWeight == '700') {
        println(('Font Weight of Thank_Guarantee_Section_Info_Head is' + Thank_Guarantee_Section_Info_Head_FontWeight) + 
            'and is passed')
    } else {
        println('Font Weight of Thank_Guarantee_Section_Info_Head is not 700 or bold')
    }
    
    Thank_Guarantee_Section_Info_Head_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section - Info Heading', 
            [('Guarantee_Heading') : i]), Font_Family)

    WebUI.verifyMatch(Thank_Guarantee_Section_Info_Head_FontFamily, '"Open Sans"', false)

    WebUI.verifyElementPresent(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section - Info Description', 
            [('Guarantee_Description') : 'i']), 0 //if (Profile_EM_Prog_Options)
        //Do you want to receive special offers and information through email?
        //Email Program Options
        //Promotion Options
        //println(Profile_EM_Prog_Options + 'This checkbox is checked')
        //println(Profile_EM_Prog_Options + 'This checkbox is NOT checked')
        //println(('Special Offers' + Profile_Sp_Offers_Prefill) + 'option is checked')
        //println(('Special Offers' + Profile_Sp_Offers_Prefill) + 'option is NOT checked')
        //println(('Special Offers' + Profile_Sp_Offers_Prefill) + 'option is checked')
        //println(('Special Offers' + Profile_Sp_Offers_Prefill) + 'option is NOT checked')
        )

    Thank_Guarantee_Section_Info_Descrip_FontColor = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section - Info Description', 
            [('Guarantee_Description') : i]), Font_Color)

    WebUI.verifyMatch(Thank_Guarantee_Section_Info_Descrip_FontColor, 'rgba(0, 37, 122, 1)', false)

    Thank_Guarantee_Section_Info_Descrip_FontSize = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section - Info Description', 
            [('Guarantee_Description') : i]), Font_Size)

    WebUI.verifyMatch(Thank_Guarantee_Section_Info_Descrip_FontSize, '14px', false)

    Thank_Guarantee_Section_Info_Descrip_FontWeight = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section - Info Description', 
            [('Guarantee_Description') : i]), Font_Weight)

    if (Thank_Guarantee_Section_Info_Descrip_FontWeight == 'normal') {
        println(('Font Weight of Thank_Guarantee_Section_Info_Descrip is' + Thank_Guarantee_Section_Info_Descrip_FontWeight) + 
            'and is passed')
    } else if (Thank_Guarantee_Section_Info_Descrip_FontWeight == '400') {
        println(('Font Weight of Thank_Guarantee_Section_Info_Descrip is' + Thank_Guarantee_Section_Info_Descrip_FontWeight) + 
            'and is passed')
    } else {
        println('Font Weight of Thank_Guarantee_Section_Info_Descrip is not 400 or normal')
    }
    
    Thank_Guarantee_Section_Info_Descrip_FontFamily = WebUI.getCSSValue(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Guarantee Section - Info Description', 
            [('Guarantee_Description') : i]), Font_Family)

    WebUI.verifyMatch(Thank_Guarantee_Section_Info_Descrip_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)
}

