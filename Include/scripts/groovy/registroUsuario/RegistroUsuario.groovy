package registroUsuario
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class RegistroUsuario {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("que he ingresado a la página principal de registro")
	def IngresoPaginaPrincipal() {
		println "Ingresar página inicial del registro"
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://thetestingworld.com/testings/')
		
		WebUI.maximizeWindow()
		
	}
	
	@And("he ingresado en el campo Username (.*)")
	def IngresarCampoUsername(String Username) {
		println "Ingresar campo Username"
		WebUI.setText(findTestObject('Object Repository/RegistroUSUARIO/Username'), Username)
		
	}
	
	@And("he ingresado en el campo Email (.*)")
	def IngresarCampoEmail(String Email) {
		println "Ingresar campo Email"
		WebUI.setText(findTestObject('Object Repository/RegistroUSUARIO/Email'), Email)
		
	}
	@And("he ingresado en el campo Password (.*)")
	def IngresarCampoPassword(String Password) {
		println "Ingresar campo Password"
		WebUI.setEncryptedText(findTestObject('Object Repository/RegistroUSUARIO/Password'), Password)
	}
	@And("he ingresado en el campo Confirm Password (.*)")
	def IngresarCampoPassword2(String Password2) {
		println "Ingresar campo Password2"
		WebUI.setEncryptedText(findTestObject('Object Repository/RegistroUSUARIO/Password2'), Password2)
	}
	@And("he seleccionado el campo Date")
	def SeleccionarCampoDate() {
		println "Ingresar campo Date"
		WebUI.click(findTestObject('Object Repository/RegistroUSUARIO/Calendario'))
		WebUI.click(findTestObject('Object Repository/RegistroUSUARIO/FechaNac'))
	}
	@And("he ingresado en el campo Celular (.*)")
	def IngresarCampoCelular(String Celular) {
		println "Ingresar campo Celular"
		WebUI.setText(findTestObject('Object Repository/RegistroUSUARIO/Celular'), Celular)
	}
	@And("he seleccionado en el campo Genero")
	def SeleccionarCampoGenero() {
		println "Ingresar campo Genero"
		WebUI.selectOptionByValue(findTestObject('Object Repository/RegistroUSUARIO/Genero'), '2', true)
	}
	@And("he seleccionado el campo terminos")
	def SeleccionarCampoTerminos() {
		println "Ingresar campo Términos"
		WebUI.click(findTestObject('Object Repository/RegistroUSUARIO/Terminos'))
	}
		
	@When("seleccione el botón SignUp")
	def SeleccionarBotonSignUp() {
		println "Seleccionar el botón SignUp"
		WebUI.click(findTestObject('Object Repository/RegistroUSUARIO/BRegistrar'))
	}

	@Then("Debería visualizar el registro limpio")
	def VisualizarRegistro() {
		println "Visualizar la creación del registro"
		WebUI.click(findTestObject('RegistroUSUARIO/RegistroExitoso_Limpiado'))
		WebUI.closeBrowser()
	}
}