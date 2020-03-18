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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(GlobalVariable.G_royal)

WebUI.verifyElementVisible(findTestObject('Object Repository/Lang/ChangeLanguage'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Lang/ChangeLanguage'), 0)

WebUI.click(findTestObject('Object Repository/Lang/ChangeLanguage'))


WebUI.verifyElementClickable(findTestObject('Object Repository/Lang/en-us'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Lang/id-id'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Lang/ko-kr'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Lang/my-mm'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Lang/th-th'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Lang/zh-cn'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Lang/zh-tw'))

