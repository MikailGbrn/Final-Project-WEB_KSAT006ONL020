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

WebUI.deleteAllCookies()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/Product/Page_Kotakoki  Welcome to my Website/img_Sale_attachment-woocommerce_thumbnail s_432ea2'))

WebUI.click(findTestObject('Object Repository/Product/Page_Beanie  Kotakoki/a_Reviews (0)'))

WebUI.click(findTestObject('Object Repository/Product/Page_Beanie  Kotakoki/a_4'))

WebUI.setText(findTestObject('Object Repository/Product/Page_Beanie  Kotakoki/textarea__comment'), comment)

WebUI.setText(findTestObject('Product/Page_Beanie  Kotakoki/input__author'), author)

WebUI.setText(findTestObject('Product/Page_Beanie  Kotakoki/input__email'), email)

WebUI.click(findTestObject('Object Repository/Product/Page_Beanie  Kotakoki/input_Save my name, email, and website in t_d32613'))

if(WebUI.verifyElementVisible(findTestObject('Product/Page_Comment Submission Failure/Duplicated'))) {
	WebUI.delay(5)
	WebUI.closeBrowser()
}else {
	WebUI.verifyElementVisible(findTestObject('Product/Page_Beanie  Kotakoki/div_ReviewsRated 4 out of 5Your review is awaiting approvaladadas'),
		FailureHandling.STOP_ON_FAILURE)
	
	WebUI.closeBrowser()
}



