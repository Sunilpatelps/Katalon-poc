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

WebUI.callTestCase(findTestCase('LoginTestcase'), [('url') : url, ('username') : username, ('password') : password], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/a_MarketProminence_mpweb-navbar-icon-button_1cdd27'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/a_Setup'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/a_Action'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/selectAffiliation'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_Primary_affiliation'), 'staff user')

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_Secondary_affiliation'))

WebUI.setText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_Secondary_affiliation'), 'user1')

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_Lan_assignedPrograms-SELECTED-row-2-col-0'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_M03_assignedPrograms-SELECTED-row-3-col-0'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_staff user (1)'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Primary_k-button-icon k-icon k-i-arrow-s'))

WebUI.setText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_Primary_affiliation'), 'staff user')

WebUI.setText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_Secondary_affiliation'), 'user2')

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_M03_assignedPrograms-SELECTED-row-3-col-0'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/button_Save'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/div_Successfully saved Affiliation'), 
    'Successfully saved Affiliation.')

WebUI.click(findTestObject('Page_MHK MarketProminence Sandbox/copyfrom'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_Contains_copyFrom-selected-col-radio-0'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/button_Copy'))

not_run: WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/div_Programs Copied Successfully'), 
    'Programs Copied Successfully')

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/closecopypopup'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_Primary_affiliation'), 'staff user')

WebUI.setText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_Secondary_affiliation'), 'user3')

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_KL0_assignedPrograms-SELECTED-row-1-col-0'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_M05_assignedPrograms-SELECTED-row-4-col-0'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/button_Save'))

not_run: WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/applyfrom'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/ApplytoCheckbox1'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Applytocheckbox2'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/Apply'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/closeApplypopupwindow'))

a = 1

if (a == 5) {
    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_staff user (1)'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Voluntary Disenroll Reason(18)_fa fa-lg f_9fce55'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Voluntary Disenroll Reason(18)_fa fa-lg f_5f7ad2'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Contains_action-icon-is-enabled fa fa-fw _a6b016'))

    WebUI.rightClick(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Contains_action-icon-is-enabled fa fa-fw _51a936'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Contains_action-icon-is-enabled fa fa-fw _51a936'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/closecopypopup'))

    WebUI.mouseOver(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Assigned Programs_k-icon k-i-file-exce_807b9d'))

    WebUI.mouseOver(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Assigned Programs_k-icon k-i-file-pdf _669663'))

    WebUI.rightClick(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Assigned Programs_fa fa-lg fa-table'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Assigned Programs_fa fa-lg fa-table'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Assigned Programs_fa fa-lg fa-table'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Assigned Programs_fa fa-check-square fa-lg'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Assigned Programs_fa fa-lg fa-square-o'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Assigned Programs_fa fa-lg fa-table_1'))

    WebUI.mouseOver(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Record  1'))

    WebUI.mouseOver(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Records  31'))

    WebUI.mouseOver(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Assigned Programs_k-icon k-i-file-exce_807b9d'))

    WebUI.mouseOver(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Assigned Programs_k-icon k-i-file-pdf _669663'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Voluntary Disenroll Reason(18)_fa fa-lg fa-table'))

    WebUI.mouseOver(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Record  1'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Voluntary Disenroll Reason(18)_fa fa-lg f_5f7ad2'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Voluntary Disenroll Reason(18)_fa fa-lg f_9fce55'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Voluntary Disenroll Reason(18)_fa fa-lg f_5f7ad2'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Voluntary Disenroll Reason(18)_fa fa-lg f_9fce55'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Voluntary Disenroll Reason(18)_fa fa-lg f_9fce55_1'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Voluntary Disenroll Reason(18)_fa fa-lg f_5f7ad2'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Contains_action-icon-is-enabled fa fa-fw _a6b016'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_SNP(1)_k-icon ng-tns-c68-15 k-i-expand'))

    WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_user3'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_user3'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_user3'))

    WebUI.verifyElementText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_user3'), 'user3')

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Contains_action-icon-is-enabled fa fa-fw _582439'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Voluntary Disenroll Reason(18)_fa fa-lg f_5f7ad2'))

    WebUI.verifyElementText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Contains_action-icon-is-enabled fa fa-fw _a6b016'), 
        '')

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Contains_action-icon-is-enabled fa fa-fw _8e0d62'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/button_Yes'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/a_About MarketProminence_mpweb-navbar-icon-_43a834'))

    WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Log Out'))

    WebUI.verifyElementText(findTestObject('Object Repository/Page_MarketProminence Authorization/h1_Logout        You are now logged out'), 
        'Logout\n You are now logged out')
}

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Voluntary Disenroll Reason(18)_fa fa-lg fa-table'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_SNP(1)_k-icon ng-tns-c68-17 k-i-expand'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Contains_action-icon-is-enabled fa fa-fw _a6b016'))

WebUI.getText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_user2'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Voluntary Disenroll Reason(18)_fa fa-lg f_9fce55'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Record  1'), 'Record : 1')

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Voluntary Disenroll Reason(18)_fa fa-lg f_5f7ad2'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Records  2'), 'Records : 2')

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Voluntary Disenroll Reason(18)_fa fa-lg fa-table'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Records  3'), 'Records : 3')

WebUI.mouseOver(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Assigned Programs_k-icon k-i-file-exce_807b9d'), 
    FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Assigned Programs_k-icon k-i-file-pdf _669663'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Records  31'), 
    'Records : 31')

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Assigned Programs_fa fa-lg fa-table'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Assigned Programs_fa fa-check-square fa-lg'))

WebUI.getText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_Contains_assignedPrograms-SELECTED-ro_1fd6e7'), 
    FailureHandling.OPTIONAL)

WebUI.getText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/input_KL0_assignedPrograms-SELECTED-row-1-col-0'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Assigned Programs_fa fa-lg fa-square-o'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Assigned Programs_fa fa-check-square fa-lg'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Assigned Programs_fa fa-lg fa-square-o'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/i_Contains_action-icon-is-enabled fa fa-fw _582439'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Records  3'), 'Records : 3')

WebUI.click(findTestObject('Page_MHK MarketProminence Sandbox/deletebutton'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/button_Yes'))

WebUI.click(findTestObject('Page_MHK MarketProminence Sandbox/deletebutton'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/button_Yes'))

WebUI.click(findTestObject('Page_MHK MarketProminence Sandbox/deletebutton'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/a_About MarketProminence_mpweb-navbar-icon-_43a834'))

WebUI.click(findTestObject('Object Repository/Page_MHK MarketProminence Sandbox/span_Log Out'))

WebUI.navigateToUrl('https://mpwebsandbox.mhkdevsandbox.com/authenticate/Account/Logout?logoutId=CfDJ8K87TC5dzgBOtk8mjK3KbhZJ7srMBqIZeaK84EgHpItsTF3ug5ko5xKSjvrSn0sppYTlFgYNoqazYwuTiT7yZwYC5ERLgfRnHQUREdAE0koEe4iVBz1LPe7vFJyqL0EmWGUsrOdnRAvu33qN8wHH3dOKyIcGEi5fivCul-88yAJ6Ha4jyokVk9V5oWX7BBfFlc8fntCC3N0ijb2oQgkN_P8QOxY-K_BhAxzV_IH5bTo3ElkxmipC2F-Zl0LeoOkhtzPoTv_IzfUWdmNoGsxFoRSFhMtffMz7238EO-0QUWa4N9g_sUGm_ZjZIIHCjuIrMcMnm21n3B9mJIQPAQJWKy7c4VL9OuhLfKhs-07Y-dafoP7Ym62S5pnNUq5IDZ7n721k0WwE4Ryj78D0ZmlRHXJxtf5wUaGovO4ywS_4HDbCawSOzYekU5AODg7F4KHheRJlWghSxocNWvGXaHzepzSq8_KyaP1Pm-9el3YQqsNBpsNjhMiEHvtdyc9KVGGHpE1Rki8jBKph0-owSwtkINw')

WebUI.click(findTestObject('Object Repository/Page_MarketProminence Authorization/body_MarketProminence Authorization        _4e99f9'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MarketProminence Authorization/small_You are now logged out'), 
    'You are now logged out')

WebUI.closeBrowser()

