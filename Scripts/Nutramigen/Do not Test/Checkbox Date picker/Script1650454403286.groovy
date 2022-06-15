import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/')

WebUI.waitForElementPresent(findTestObject('Object Repository/Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    0)

WebUI.click(findTestObject('Object Repository/Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

WebUI.mouseOver(findTestObject('Object Repository/Profile/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Verify hover on Offers and Savings menu'))

WebUI.click(findTestObject('Object Repository/Profile/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/div_Nutramigen Savings  Support program'))

WebUI.scrollToElement(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Date Picker'), 
    0)

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Date Picker'))

WebUI.delay(10)

for (j = 1; j <= 6; j++) {
    for (i = 1; i <= 7; i++) {
        String[] Last_Active_Date = WebUI.getText(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                [('Week') : j, ('Date') : i]))

        if (i < 7) {
            int K = i + 1

            if (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                    [('Week') : j, ('Date') : K]), 0)) {
                println('Next date is present')
            } else {
                println('Last Date in a Week is reached')

                Last_Active_Date = WebUI.getText(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                        [('Week') : j, ('Date') : i]))

                break
            }
        }
    }
    
    int L = j + 1

    if (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify Date details in the month', [('Week') : L
                , ('Date') : 1]), 0)) {
        println('Next Week is present')
    } else {
        if (i == 8) {
            i = (i - 1)
        }
        
        Last_Active_Date = WebUI.getText(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                [('Week') : j, ('Date') : i]))

        Allowed_Date_Range_Till = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                [('Week') : j, ('Date') : i]), 'aria-label')

        Element_Not_Present = 'Stop further Looping'

        break
    }
}

Allowed_Date_Range_Till_Split = Allowed_Date_Range_Till.split(' ')

println((((('Allowed Date Range upto ' + (Allowed_Date_Range_Till_Split[1])) + ' ') + (Allowed_Date_Range_Till_Split[2])) + 
    ' ') + (Allowed_Date_Range_Till_Split[3]))

