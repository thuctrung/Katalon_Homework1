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

WebUI.navigateToUrl('https://hocmai.vn/loginv2/signup.php')

WebUI.setText(findTestObject('Page_ng k nhp hc - HOCMAI/Name01_txt'), 'Trịnh Thị Nữ')

WebUI.setText(findTestObject('Page_ng k nhp hc - HOCMAI/Email01_txt'), 'nutrinh2407@gmail.com')

WebUI.setText(findTestObject('Page_ng k nhp hc - HOCMAI/Phone01_txt'), '0396567451')

WebUI.setEncryptedText(findTestObject('Page_ng k nhp hc - HOCMAI/Password01_txt'), 'oA/wLJSbs1AO79Ko49SfvQ==')

WebUI.setEncryptedText(findTestObject('Page_ng k nhp hc - HOCMAI/Repasword01_txt'), 'oA/wLJSbs1AO79Ko49SfvQ==')

WebUI.click(findTestObject('Page_ng k nhp hc - HOCMAI/Dangky01_btn'))

WebUI.closeBrowser()

