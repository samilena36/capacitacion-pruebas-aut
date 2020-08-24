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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://thetestingworld.com/testings/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/RegistroUSUARIO/Username'), Username)

WebUI.setText(findTestObject('Object Repository/RegistroUSUARIO/Email'), Email)

WebUI.setEncryptedText(findTestObject('Object Repository/RegistroUSUARIO/Password'), 'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('Object Repository/RegistroUSUARIO/Password2'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/RegistroUSUARIO/Calendario'))

WebUI.click(findTestObject('Object Repository/RegistroUSUARIO/FechaNac'))

WebUI.setText(findTestObject('Object Repository/RegistroUSUARIO/Celular'), '3111111111')

WebUI.setText(findTestObject('Object Repository/RegistroUSUARIO/Direccion'), 'calle 10')

WebUI.selectOptionByValue(findTestObject('Object Repository/RegistroUSUARIO/Genero'), '2', true)

WebUI.click(findTestObject('Object Repository/RegistroUSUARIO/Terminos'))

WebUI.click(findTestObject('Object Repository/RegistroUSUARIO/BRegistrar'))

WebUI.closeBrowser()

