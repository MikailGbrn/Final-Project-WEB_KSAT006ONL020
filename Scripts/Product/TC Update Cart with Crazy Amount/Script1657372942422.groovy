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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/Product/Page_Kotakoki  Welcome to my Website/img_Sale_attachment-woocommerce_thumbnail s_432ea2'))

WebUI.click(findTestObject('Object Repository/Product/Page_Beanie  Kotakoki/button_Add to cart'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Product/Page_Cart  Kotakoki/Page_Beanie  Kotakoki/p_View cart Beanie has been added to your cart'), 
    40)

WebUI.click(findTestObject('Object Repository/Product/Page_Beanie  Kotakoki/a_View cart'))

WebUI.verifyElementVisible(findTestObject('Product/Page_Cart  Kotakoki/tr_BeanieRp18Beanie quantityRp18'), FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('Product/Page_Cart  Kotakoki/input_Beanie quantity_cartac1dd209cbcc5e5d1c6e28598e8cbbe8qty'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Product/Page_Cart  Kotakoki/input_Beanie quantity_cartac1dd209cbcc5e5d1c6e28598e8cbbe8qty'), 
    crazy_amount)

WebUI.verifyElementClickable(findTestObject('Product/Page_Cart  Kotakoki/button_Update cart'))

WebUI.click(findTestObject('Product/Page_Cart  Kotakoki/button_Update cart'))

WebUI.verifyElementPresent(findTestObject('Product/Page_Cart  Kotakoki/p_Cart updated'), 0)

WebUI.closeBrowser()

