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

WebUI.callTestCase(findTestCase('LoginTestcase'), [('url') : 'https://mpwebsandbox.mhkdevsandbox.com/', ('username') : 'DZCPS'
        , ('password') : 'mp0292'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enableSmartWait()

not_run: WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/a_MarketProminence_mpweb-navbar-icon-button_1cdd27'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/a_Setup'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/a_Action'))

WebUI.enableSmartWait()

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Program_k-input-value-text'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_03 Medicaid Prospect'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_Primary_action'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Primary_k-button-icon k-icon k-i-arrow-s'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/li_testing'))

WebUI.setText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_Secondary_affiliation'), 'Testmp')

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Site_k-button-icon k-icon k-i-arrow-s'))

WebUI.setText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_Secondary_affiliation'), 'Testmp')

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/li_EP03-1'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Product_k-input-value-text'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_E05-3'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/mp-read-only-input_Program03 Medicaid Prospect'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/div_03 Medicaid Prospect'), 
    '03 Medicaid Prospect')

WebUI.enableSmartWait()

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/span_Program_k-input-value-text'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/span_03 Medicaid Prospect'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/input_Primary_k-4aa542c3-5746-463a-b2b8-a1e_f6caed'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/span_Primary_k-button-icon k-icon k-i-arrow-s'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/li_testing'))

WebUI.setText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/input_Secondary_secondary'), 
    'Testmp')

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/span_Site_k-button-icon k-icon k-i-arrow-s'))

WebUI.setText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/input_Secondary_secondary'), 
    'Testmp')

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/li_EP03-1'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/span_Product_k-input-value-text'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/span_E05-3'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/mp-read-only-input_Program03 Medicaid Prospect'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MHK MarketProminence Sandbox/div_03 Medicaid Prospect'), 
    '03 Medicaid Prospect')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mpwebsandbox.mhkdevsandbox.com/')

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MarketProminence Authorization/h3_MarketProminence Login'))

var = WebUI.verifyElementText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Page_MarketProminence Authorization/h3_MarketProminence Login'), 
    'MarketProminence Login')

