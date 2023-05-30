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

WebUI.navigateToUrl(GlobalVariable.Despliegue74)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/VERSION_74/3.Modulo_Hojas_de_Vida/Page_Softland HCM/input_Ingresar_usuario'), 
    GlobalVariable.Usuario74)

WebUI.setEncryptedText(findTestObject('Object Repository/VERSION_74/3.Modulo_Hojas_de_Vida/Page_Softland HCM/input_Ingresar_clave'), 
    GlobalVariable.Password74)

WebUI.click(findTestObject('Object Repository/VERSION_74/3.Modulo_Hojas_de_Vida/Page_Softland HCM/button_Ingresar'))

WebUI.click(findTestObject('Object Repository/VERSION_74/3.Modulo_Hojas_de_Vida/Page_Softland HCM/img_Sistemas de Apoyo_moduloMiniatura'))

WebUI.click(findTestObject('Object Repository/VERSION_74/3.Modulo_Hojas_de_Vida/Page_Softland HCM/img_Consulta General Empleado_nodeIcon57'))

WebUI.click(findTestObject('Object Repository/VERSION_74/3.Modulo_Hojas_de_Vida/Page_Softland HCM/a_Tipos De Horario_1'))

WebUI.click(findTestObject('Object Repository/VERSION_74/3.Modulo_Hojas_de_Vida/Page_Softland HCM/div_Generar'))

WebUI.click(findTestObject('Object Repository/VERSION_74/3.Modulo_Hojas_de_Vida/Page_Softland HCM/div_Editar'))

WebUI.click(findTestObject('Object Repository/VERSION_74/3.Modulo_Hojas_de_Vida/Page_Softland HCM/div_Cancelar'))

WebUI.closeBrowser()

