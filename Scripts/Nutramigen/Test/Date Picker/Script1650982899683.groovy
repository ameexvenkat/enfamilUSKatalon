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

WebUI.waitForElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    3)

WebUI.verifyElementPresent(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify one trust cookie preferences'), 
    0)

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify One trust cookie close'))

WebUI.mouseOver(findTestObject('Nutramigen/Field Validation for invalid data/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Verify hover on Offers and Savings menu'))

WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Enfamil Newborn, Infant  Toddler Nutri_2e0999/Verify Nutramigen in Menu'))

WebUI.scrollToElement(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Date Picker'), 
    0)

WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Date Picker'))

/*if (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify Previous Month button'), 0)) {
    //Below for loop to check date for one week of the month
    for (j = 1; j <= 6; j++) {
        for (i = 1; i <= 7; i++) {
            WebUI.verifyElementAttributeValue(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                    [('Week') : j, ('Date') : i]), 'class', 'DayPicker-Day', 0)

            if (WebUI.verifyElementAttributeValue(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                    [('Week') : j, ('Date') : i]), 'class', 'DayPicker-Day', 0)) {
                String[] Month_Year_Details = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                        [('Week') : j, ('Date') : i]), 'aria-label')

                String[] Date = WebUI.getText(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                        [('Week') : j, ('Date') : i]))  
            } else if (WebUI.verifyElementAttributeValue(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                    [('Week') : j, ('Date') : i]), 'class', 'DayPicker-Day DayPicker-Day--today', 0)) {
                String[] Active_date = WebUI.getText(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                        [('Week') : j, ('Date') : i]))

                String[] Active_Month_date_Year = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                        [('Week') : j, ('Date') : i]), 'aria-label')
            } else {
                String[] InACtive_Date = WebUI.getText(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                        [('Week') : j, ('Date') : i]))
            }
        }
    }
    
    WebUI.click(findTestObject('Nutramigen/Calendar/Verify Previous Month button'))
}*/
//WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify Next Month button'), 0)
if (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify Next Month button'), 0) && WebUI.verifyElementPresent(
    findTestObject('Nutramigen/Calendar/Verify Previous Month button'), 0)) {
    while (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify Next Month button'), 0)) {
        WebUI.click(findTestObject('Nutramigen/Calendar/Verify Next Month button'), FailureHandling.OPTIONAL)

        Month_Year_Next = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify Month and Year'), 'aria-label', 
            FailureHandling.OPTIONAL)

        println('Next Month and Year is ' + Month_Year_Next)

        String[] Month_Year_Next_Split = Month_Year_Next.split(' ')

        println('Month is ' + (Month_Year_Next_Split[1]))

        println('Year is ' + (Month_Year_Next_Split[3]))
    }
    
    if (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify First Inactive Date in a Month'), 
        0)) {
        First_Inactive_Date = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify First Inactive Date in a Month'), 
            'aria-label', FailureHandling.OPTIONAL)

        String[] First_Inactive_Date_Split = First_Inactive_Date.split(' ')

        Inactive_Date_Split = (First_Inactive_Date_Split[2])

        int Inactive_Date = Inactive_Date_Split.toInteger() - 1

        println((((('Allowed Date Range upto ' + (First_Inactive_Date_Split[1])) + ' ') + Inactive_Date) + ' ') + (First_Inactive_Date_Split[
            3]))
    } else if (!(WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify First Inactive Date in a Month'), 
        0))) {
        for (j = 1; j <= 6; j++) {
            for (i = 1; i <= 7; i++) {
                String[] Last_Active_Date = WebUI.getText(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                        [('Week') : j, ('Date') : i]), FailureHandling.OPTIONAL)

                if (i < 7) {
                    int K = i + 1

                    if (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                            [('Week') : j, ('Date') : K]), 0)) {
                        println('Next date is present')
                    } else {
                        println('Last Date in a Week is reached')

                        Last_Active_Date = WebUI.getText(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                                [('Week') : j, ('Date') : i]), FailureHandling.OPTIONAL)

                        break
                    }
                }
            }
            
            int L = j + 1

            if (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                    [('Week') : L, ('Date') : 1]), 0)) {
                println('Next Week is present')
            } else {
                if (i == 8) {
                    i = (i - 1)
                }
                
                Last_Active_Date = WebUI.getText(findTestObject('Nutramigen/Calendar/Verify Date details in the month', 
                        [('Week') : j, ('Date') : i]), FailureHandling.OPTIONAL)

                Allowed_Date_Range_Till = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify Date details in the month'), 
                    'aria-label', FailureHandling.OPTIONAL)

                Element_Not_Present = 'Stop further Looping'

                break
            }
        }
        
        Allowed_Date_Range_Till_Split = Allowed_Date_Range_Till.split(' ')

        println((((('Allowed Date Range upto ' + (Allowed_Date_Range_Till_Split[1])) + ' ') + (Allowed_Date_Range_Till_Split[
            2])) + ' ') + (Allowed_Date_Range_Till_Split[3]))
    }
    
    WebUI.click(findTestObject('Nutramigen/Element Text verification/Page_Nutramigen  Enfamil/Verify Phone placehoder text for input field'), 
        FailureHandling.OPTIONAL)

    WebUI.scrollToElement(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Date Picker'), 
        0, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Nutramigen/Field Validation for invalid data/Page_Nutramigen  Enfamil/Verify Date Picker'), 
        FailureHandling.OPTIONAL)

    while (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify Previous Month button'), 0)) {
        WebUI.click(findTestObject('Nutramigen/Calendar/Verify Previous Month button'), FailureHandling.OPTIONAL)

        Month_Year_Previous = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify Month and Year'), 
            'aria-label', FailureHandling.OPTIONAL)

        println('Previous Month and Year is ' + Month_Year_Previous)

        String[] Month_Year_Previous_Split = Month_Year_Previous.split(' ')

        println('Month is ' + (Month_Year_Previous_Split[1]))

        println('Year is ' + (Month_Year_Previous_Split[3]))
    }
    
    First_Active_Date = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify First Active Date in a Month'), 
        'aria-label', FailureHandling.OPTIONAL)

    String[] First_Active_Date_Split = First_Active_Date.split(' ')

    println((((('Allowed Date Range from ' + (First_Active_Date_Split[1])) + ' ') + (First_Active_Date_Split[2])) + ' ') + 
        (First_Active_Date_Split[3]))
} else if (WebUI.verifyElementNotPresent(findTestObject('Nutramigen/Calendar/Verify Next Month button'), 0) && 
WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify Previous Month button'), 0)) {
    Month_Year = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify Month and Year'), 'aria-label', 
        FailureHandling.OPTIONAL)

    String[] Month_Year_Split = Month_Year.split(' ')

    println('Month is ' + (Month_Year_Split[1]))

    println('Year is ' + (Month_Year_Split[3]))

    if (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify First Inactive Date in a Month'), 
        0)) {
        First_Inactive_Date = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify First Inactive Date in a Month'), 
            'aria-label', FailureHandling.OPTIONAL)

        String[] First_Inactive_Date_Split = First_Inactive_Date.split(' ')

        Inactive_Date_Split = (First_Inactive_Date_Split[2])

        int Inactive_Date = Inactive_Date_Split.toInteger() - 1

        println((((('Allowed Date Range upto ' + (First_Inactive_Date_Split[1])) + ' ') + Inactive_Date) + ' ') + (First_Inactive_Date_Split[
            3]))
    } else if (!(WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify First Inactive Date in a Month'), 
        0))) {
        Page_URL = WebUI.getUrl(FailureHandling.OPTIONAL)

        if (Page_URL == 'https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/toddler-sample-request/') {
            Allowed_Date_Range_Till = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify First Inactive Date in a Month'), 
                'aria-label', FailureHandling.OPTIONAL)

            String[] Allowed_Date_Range_Till_Split = Allowed_Date_Range_Till.split(' ')

            Inactive_Date_Split = (Allowed_Date_Range_Till_Split[2])

            int Inactive_Date = Inactive_Date_Split.toInteger() - 1

            println((((('Allowed Date Range upto ' + (First_Inactive_Date_Split[1])) + ' ') + Inactive_Date) + ' ') + (First_Inactive_Date_Split[
                3]))
        }
        
        Allowed_Date_Range_Till = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify Highlighted Date if no inactive date in a month'), 
            'aria-label', FailureHandling.OPTIONAL)

        Allowed_Date_Range_Till_Split = Allowed_Date_Range_Till.split(' ')

        println((((('Allowed Date Range upto ' + (Allowed_Date_Range_Till_Split[1])) + ' ') + (Allowed_Date_Range_Till_Split[
            2])) + ' ') + (Allowed_Date_Range_Till_Split[3]))
    }
    
    while (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify Previous Month button'), 0)) {
        WebUI.click(findTestObject('Nutramigen/Calendar/Verify Previous Month button'), FailureHandling.OPTIONAL)

        Month_Year_Previous = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify Month and Year'), 
            'aria-label', FailureHandling.OPTIONAL)

        println('Previous Month and Year is ' + Month_Year_Previous)

        String[] Month_Year_Previous_Split = Month_Year_Previous.split(' ')

        println('Month is ' + (Month_Year_Previous_Split[1]))

        println('Year is ' + (Month_Year_Previous_Split[3]))
    }
    
    First_Active_Date = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify First Active Date in a Month'), 
        'aria-label', FailureHandling.OPTIONAL)

    String[] First_Active_Date_Split = First_Active_Date.split(' ')

    println((((('Allowed Date Range ' + (First_Active_Date_Split[1])) + ' ') + (First_Active_Date_Split[2])) + ' ') + 
        (First_Active_Date_Split[3]))
}
else {
	
	Page_URL = WebUI.getUrl(FailureHandling.OPTIONAL)
	
	if (Page_URL == 'https://enfamil-us.cdn.test.us-east-1.starterkit.rbcloud.io/moms-to-be-enrollment/') {
	
	First_Active_Date = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify First Active Date in a Month'),
		'aria-label', FailureHandling.OPTIONAL)

	String[] First_Active_Date_Split = First_Active_Date.split(' ')

	println((((('Allowed Date Range from ' + (First_Active_Date_Split[1])) + ' ') + (First_Active_Date_Split[2])) + ' ') +
		(First_Active_Date_Split[3]))
	
	while (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify Next Month button'), 0)) {
		WebUI.click(findTestObject('Nutramigen/Calendar/Verify Next Month button'), FailureHandling.OPTIONAL)

		Month_Year_Next = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify Month and Year'), 'aria-label',
			FailureHandling.OPTIONAL)

		println('Next Month and Year is ' + Month_Year_Next)

		String[] Month_Year_Next_Split = Month_Year_Next.split(' ')

		println('Month is ' + (Month_Year_Next_Split[1]))

		println('Year is ' + (Month_Year_Next_Split[3]))
	}
	
	if (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify First Inactive Date in a Month'),
		0)) {
		First_Inactive_Date = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify First Inactive Date in a Month'),
			'aria-label', FailureHandling.OPTIONAL)

		String[] First_Inactive_Date_Split = First_Inactive_Date.split(' ')

		Inactive_Date_Split = (First_Inactive_Date_Split[2])

		int Inactive_Date = Inactive_Date_Split.toInteger() - 1

		println((((('Allowed Date Range upto ' + (First_Inactive_Date_Split[1])) + ' ') + Inactive_Date) + ' ') + (First_Inactive_Date_Split[
			3]))
	} else if (!(WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify First Inactive Date in a Month'),
		0))) {
		for (j = 1; j <= 6; j++) {
			for (i = 1; i <= 7; i++) {
				String[] Last_Active_Date = WebUI.getText(findTestObject('Nutramigen/Calendar/Verify Date details in the month',
						[('Week') : j, ('Date') : i]), FailureHandling.OPTIONAL)

				if (i < 7) {
					int K = i + 1

					if (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify Date details in the month',
							[('Week') : j, ('Date') : K]), 0)) {
						println('Next date is present')
					} else {
						println('Last Date in a Week is reached')

						Last_Active_Date = WebUI.getText(findTestObject('Nutramigen/Calendar/Verify Date details in the month',
								[('Week') : j, ('Date') : i]), FailureHandling.OPTIONAL)

						break
					}
				}
			}
			
			int L = j + 1

			if (WebUI.verifyElementPresent(findTestObject('Nutramigen/Calendar/Verify Date details in the month',
					[('Week') : L, ('Date') : 1]), 0)) {
				println('Next Week is present')
			} else {
				if (i == 8) {
					i = (i - 1)
				}
				
				Last_Active_Date = WebUI.getText(findTestObject('Nutramigen/Calendar/Verify Date details in the month',
						[('Week') : j, ('Date') : i]), FailureHandling.OPTIONAL)

				Allowed_Date_Range_Till = WebUI.getAttribute(findTestObject('Nutramigen/Calendar/Verify Date details in the month'),
					'aria-label', FailureHandling.OPTIONAL)

				Element_Not_Present = 'Stop further Looping'

				break
			}
		}
		
		Allowed_Date_Range_Till_Split = Allowed_Date_Range_Till.split(' ')

		println((((('Allowed Date Range upto ' + (Allowed_Date_Range_Till_Split[1])) + ' ') + (Allowed_Date_Range_Till_Split[
			2])) + ' ') + (Allowed_Date_Range_Till_Split[3]))
	}
	}
		
}

