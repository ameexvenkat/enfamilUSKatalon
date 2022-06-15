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

WebUI.navigateToUrl(GlobalVariable.Enspire)

WebUI.waitForElementPresent(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    3)

WebUI.verifyElementPresent(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    0)

WebUI.click(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

DobLabel_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify DoB field label'), 
    Font_Color)

WebUI.verifyMatch(DobLabel_FontColor, 'rgba(33, 33, 33, 1)', false)

DobLabel_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify DoB field label'), 
    Font_Size)

WebUI.verifyMatch(DobLabel_FontSize, '16px', false)

DobLabel_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify DoB field label'), 
    Font_Weight)

if (DobLabel_FontWeight == 'bold') {
    println(('Font Weight of DobLabel is' + DobLabel_FontWeight) + 'and is passed')
} else if (DobLabel_FontWeight == '700') {
    println(('Font Weight of DobLabel is' + DobLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of DobLabel is not 700 or bold')
}

DobLabel_FontFamily = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify DoB field label'), 
    Font_Family)

WebUI.verifyMatch(DobLabel_FontFamily, '"Open Sans"', false)

DobHolder_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify DoB palceholder text for date picker field'), 
    Font_Color)

WebUI.verifyMatch(DobHolder_FontColor, 'rgba(90, 91, 94, 1)', false)

DobHolder_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify DoB palceholder text for date picker field'), 
    Font_Size)

WebUI.verifyMatch(DobHolder_FontSize, '14px', false)

WhyLabel_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify Why tooltip label'), 
    Font_Color)

WebUI.verifyMatch(WhyLabel_FontColor, 'rgba(0, 37, 122, 1)', false)

WhyLabel_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify Why tooltip label'), 
    Font_Weight)

if (WhyLabel_FontWeight == 'bold') {
    println(('Font Weight of WhyLabel is' + WhyLabel_FontWeight) + 'and is passed')
} else if (WhyLabel_FontWeight == '700') {
    println(('Font Weight of WhyLabel is' + WhyLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of WhyLabel is not 700 or bold')
}

RelLabel_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label for Relationship to Child field'), 
    Font_Color)

WebUI.verifyMatch(RelLabel_FontColor, 'rgba(0, 0, 0, 1)', false)

RelLabel_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label for Relationship to Child field'), 
    Font_Size)

WebUI.verifyMatch(RelLabel_FontSize, '16px', false)

RelLabel_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label for Relationship to Child field'), 
    Font_Weight)

if (RelLabel_FontWeight == 'bold') {
    println(('Font Weight of RelLabel is' + RelLabel_FontWeight) + 'and is passed')
} else if (RelLabel_FontWeight == '700') {
    println(('Font Weight of RelLabel is' + RelLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of RelLabel is not 700 or bold')
}

RelLabel_FontFamily = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label for Relationship to Child field'), 
    Font_Family)

WebUI.verifyMatch(RelLabel_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

RelHolder_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship to Child placeholder text for dropdown field'), 
    Font_Color)

WebUI.verifyMatch(RelHolder_FontColor, 'rgba(90, 91, 94, 1)', false)

RelHolder_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship to Child placeholder text for dropdown field'), 
    Font_Size)

WebUI.verifyMatch(RelHolder_FontSize, '14px', false)

RelHolder_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship to Child placeholder text for dropdown field'), 
    Font_Weight)

if (RelHolder_FontWeight == 'normal') {
    println(('Font Weight of RelHolder is' + RelHolder_FontWeight) + 'and is passed')
} else if (RelHolder_FontWeight == '400') {
    println(('Font Weight of RelHolder is' + RelHolder_FontWeight) + 'and is passed')
} else {
    println('Font Weight of RelHolder is not 400 or normal')
}

RelHolder_FontFamily = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify Relationship to Child placeholder text for dropdown field'), 
    Font_Family)

WebUI.verifyMatch(RelHolder_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

FeedLabel_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label for How are you currently feeding your little one'), 
    Font_Color)

WebUI.verifyMatch(FeedLabel_FontColor, 'rgba(33, 33, 33, 1)', false)

FeedLabel_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label for How are you currently feeding your little one'), 
    Font_Size)

WebUI.verifyMatch(FeedLabel_FontSize, '16px', false)

FeedLabel_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label for How are you currently feeding your little one'), 
    Font_Weight)

if (FeedLabel_FontWeight == 'bold') {
    println(('Font Weight of FeedLabel is' + FeedLabel_FontWeight) + 'and is passed')
} else if (FeedLabel_FontWeight == '700') {
    println(('Font Weight of FeedLabel is' + FeedLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FeedLabel is not 700 or bold')
}

FeedLabel_FontFamily = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label for How are you currently feeding your little one'), 
    Font_Family)

WebUI.verifyMatch(FeedLabel_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

FeedLabel1_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for How are you currently feeding your little one'), 
    Font_Color)

WebUI.verifyMatch(FeedLabel1_FontColor, 'rgba(33, 33, 33, 1)', false)

FeedLabel1_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for How are you currently feeding your little one'), 
    Font_Size)

WebUI.verifyMatch(FeedLabel1_FontSize, '14px', false)

FeedLabel1_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for How are you currently feeding your little one'), 
    Font_Weight)

if (FeedLabel1_FontWeight == 'normal') {
    println(('Font Weight of FeedLabel_1 is' + FeedLabel1_FontWeight) + 'and is passed')
} else if (FeedLabel1_FontWeight == '400') {
    println(('Font Weight of FeedLabel_1 is' + FeedLabel1_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FeedLabel_1 is not 400 or normal')
}

FeedLabel1_FontFamily = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for How are you currently feeding your little one'), 
    Font_Family)

WebUI.verifyMatch(FeedLabel_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

FeedHolder_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify How are currently feeding you little one placeholder text for dropdown field'), 
    Font_Color)

WebUI.verifyMatch(FeedHolder_FontColor, 'rgba(90, 91, 94, 1)', false)

FeedHolder_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify How are currently feeding you little one placeholder text for dropdown field'), 
    Font_Size)

WebUI.verifyMatch(FeedHolder_FontSize, '14px', false)

FeedHolder_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify How are currently feeding you little one placeholder text for dropdown field'), 
    Font_Weight)

if (FeedHolder_FontWeight == 'normal') {
    println(('Font Weight of FeedHolder is' + FeedHolder_FontWeight) + 'and is passed')
} else if (FeedHolder_FontWeight == '400') {
    println(('Font Weight of FeedHolder is' + FeedHolder_FontWeight) + 'and is passed')
} else {
    println('Font Weight of FeedHolder is not 400 or normal')
}

FeedHolder_FontFamily = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify How are currently feeding you little one placeholder text for dropdown field'), 
    Font_Family)

WebUI.verifyMatch(FeedHolder_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

WicLabel_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label for WIC Status field'), 
    Font_Color)

WebUI.verifyMatch(WicLabel_FontColor, 'rgba(33, 33, 33, 1)', false)

WicLabel_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label for WIC Status field'), 
    Font_Size)

WebUI.verifyMatch(WicLabel_FontSize, '16px', false)

WicLabel_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label for WIC Status field'), 
    Font_Weight)

if (WicLabel_FontWeight == 'bold') {
    println(('Font Weight of WicLabel is' + WicLabel_FontWeight) + 'and is passed')
} else if (WicLabel_FontWeight == '700') {
    println(('Font Weight of WicLabel is' + WicLabel_FontWeight) + 'and is passed')
} else {
    println('Font Weight of WicLabel is not 700 or bold')
}

WicLabel_FontFamily = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label for WIC Status field'), 
    Font_Family)

WebUI.verifyMatch(WicLabel_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

WicLabel1_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for WIC Status field'), 
    Font_Color)

WebUI.verifyMatch(WicLabel1_FontColor, 'rgba(90, 91, 94, 1)', false)

WicLabel1_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for WIC Status field'), 
    Font_Size)

WebUI.verifyMatch(WicLabel1_FontSize, '14px', false)

WicLabel1_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for WIC Status field'), 
    Font_Weight)

if (WicLabel1_FontWeight == 'normal') {
    println(('Font Weight of WicLabel_1 is' + WicLabel1_FontWeight) + 'and is passed')
} else if (WicLabel_FontWeight == '400') {
    println(('Font Weight of WicLabel_1 is' + WicLabel1_FontWeight) + 'and is passed')
} else {
    println('Font Weight of WicLabel_1 is not 400 or normal')
}

WicLabel1_FontFamily = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify label 1 for WIC Status field'), 
    Font_Family)

WebUI.verifyMatch(WicLabel1_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

WicOption1_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify option 1 for WIC Status field'), 
    Font_Color)

WebUI.verifyMatch(WicOption1_FontColor, 'rgba(33, 33, 33, 1)', false)

WicOption1_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify option 1 for WIC Status field'), 
    Font_Size)

WebUI.verifyMatch(WicOption1_FontSize, '14px', false)

WicOption1_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify option 1 for WIC Status field'), 
    Font_Weight)

if (WicOption1_FontWeight == 'bold') {
    println(('Font Weight of WicOption_1 is' + WicOption1_FontWeight) + 'and is passed')
} else if (WicOption1_FontWeight == '700') {
    println(('Font Weight of WicOption_1 is' + WicOption1_FontWeight) + 'and is passed')
} else {
    println('Font Weight of WicOption_1 is not 700 or bold')
}

WicOption1_FontFamily = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify option 1 for WIC Status field'), 
    Font_Family)

WebUI.verifyMatch(WicOption1_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

WicOption2_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify option 2 for WIC Status field'), 
    Font_Color)

WebUI.verifyMatch(WicOption2_FontColor, 'rgba(33, 33, 33, 1)', false)

WicOption2_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify option 2 for WIC Status field'), 
    Font_Size)

WebUI.verifyMatch(WicOption2_FontSize, '14px', false)

WicOption2_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify option 2 for WIC Status field'), 
    Font_Weight)

if (WicOption2_FontWeight == 'bold') {
    println(('Font Weight of WicOption_2 is' + WicOption2_FontWeight) + 'and is passed')
} else if (WicOption2_FontWeight == '700') {
    println(('Font Weight of WicOption_2 is' + WicOption2_FontWeight) + 'and is passed')
} else {
    println('Font Weight of WicOption_2 is not 700 or bold')
}

WicOption2_FontFamily = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify option 2 for WIC Status field'), 
    Font_Family)

WebUI.verifyMatch(WicOption2_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

WicOption3_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify option 3 for WIC Status field'), 
    Font_Color)

WebUI.verifyMatch(WicOption3_FontColor, 'rgba(33, 33, 33, 1)', false)

WicOption3_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify option 3 for WIC Status field'), 
    Font_Size)

WebUI.verifyMatch(WicOption3_FontSize, '14px', false)

WicOption3_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify option 3 for WIC Status field'), 
    Font_Weight)

if (WicOption3_FontWeight == 'bold') {
    println(('Font Weight of WicOption_3 is' + WicOption3_FontWeight) + 'and is passed')
} else if (WicOption3_FontWeight == '700') {
    println(('Font Weight of WicOption_3 is' + WicOption3_FontWeight) + 'and is passed')
} else {
    println('Font Weight of WicOption_3 is not 700 or bold')
}

WicOption3_FontFamily = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify option 3 for WIC Status field'), 
    Font_Family)

WebUI.verifyMatch(WicOption3_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

Submit_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify Submit CTA'), 
    Font_Color)

WebUI.verifyMatch(Submit_FontColor, 'rgba(255, 255, 255, 1)', false)

Submit_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify Submit CTA'), 
    Font_Size)

WebUI.verifyMatch(Submit_FontSize, '16px', false)

Submit_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify Submit CTA'), 
    Font_Weight)

if (Submit_FontWeight == 'bold') {
    println(('Font Weight of Submit CTA is' + Submit_FontWeight) + 'and is passed')
} else if (Submit_FontWeight == '700') {
    println(('Font Weight of Submit CTA is' + Submit_FontWeight) + 'and is passed')
} else {
    println('Font Weight of Submit CTA is not 700 or bold')
}

Submit_BgColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify Submit CTA'), 
    BgColor)

WebUI.verifyMatch(Submit_BgColor, 'rgba(0, 37, 122, 1)', false)

TermsCond_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify Terms and Conditions label'), 
    Font_Color)

WebUI.verifyMatch(TermsCond_FontColor, 'rgba(33, 33, 33, 1)', false)

TermsCond_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify Terms and Conditions label'), 
    Font_Size)

WebUI.verifyMatch(TermsCond_FontSize, '16px', false)

TermsCond_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify Terms and Conditions label'), 
    Font_Weight)

if (TermsCond_FontWeight == 'bold') {
    println(('Font Weight of TermsCond is' + TermsCond_FontWeight) + 'and is passed')
} else if (TermsCond_FontWeight == '700') {
    println(('Font Weight of TermsCond is' + TermsCond_FontWeight) + 'and is passed')
} else {
    println('Font Weight of TermsCond is not 700 or bold')
}

TermsCond_FontFamily = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify Terms and Conditions label'), 
    Font_Family)

WebUI.verifyMatch(TermsCond_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

TermsDis_FontColor = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify disclaimer for terms'), 
    Font_Color)

WebUI.verifyMatch(TermsDis_FontColor, 'rgba(33, 33, 33, 1)', false)

TermsDis_FontSize = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify disclaimer for terms'), 
    Font_Size)

WebUI.verifyMatch(TermsDis_FontSize, '16px', false)

TermsDis_FontWeight = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify disclaimer for terms'), 
    Font_Weight)

if (TermsDis_FontWeight == 'normal') {
    println(('Font Weight of TermsDis is' + TermsDis_FontWeight) + 'and is passed')
} else if (TermsDis_FontWeight == '400') {
    println(('Font Weight of TermsDis is' + TermsDis_FontWeight) + 'and is passed')
} else {
    println('Font Weight of TermsDis is not 400 or normal')
}

TermsDis_FontFamily = WebUI.getCSSValue(findTestObject('Ensipre/Element Text verification/Page_Nutramigen  Enfamil/Verify disclaimer for terms'), 
    Font_Family)

WebUI.verifyMatch(TermsDis_FontFamily, '"Open Sans", Arial, Helvetica, sans-serif', false)

