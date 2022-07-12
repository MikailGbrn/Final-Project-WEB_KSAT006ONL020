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

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('Login/Page_Kotakoki  Welcome to my Website/span_Login'))

WebUI.setText(findTestObject('Login/Page_Login  Kotakoki/input_Username or E-mail_username-298'), 'MikailGbrn')

WebUI.setText(findTestObject('Login/Page_Login  Kotakoki/input_Password_user_password-298'), 'Gibran2005@@')

WebUI.click(findTestObject('Login/Page_Login  Kotakoki/input_Keep me signed in_um-submit-btn'))

WebUI.verifyElementNotVisible(findTestObject('Login/Page_Kotakoki  Welcome to my Website/span_Login'), FailureHandling.OPTIONAL)

WebUI.verifyElementNotVisible(findTestObject('Login/Page_Kotakoki  Welcome to my Website/span_Register Now'), FailureHandling.OPTIONAL)

WebUI.delay(10)

WebUI.closeBrowser()

