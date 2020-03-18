import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.refresh()

WebUI.scrollToElement(findTestObject('Object Repository/首頁/btn_SwipeNext'), 0)

WebDriver Driver = DriverFactory.getWebDriver()

List elements = Driver.findElements(By.xpath("//a[@class='lnk-slideGame lnk-slideGame-js']"))

for (i = 0 ; i < elements.size() ; i++){
	assert Driver.findElement(By.xpath("(//a[@class='lnk-slideGame lnk-slideGame-js'])[" + (i+1) + "]")).getSize().getHeight() > 20
}