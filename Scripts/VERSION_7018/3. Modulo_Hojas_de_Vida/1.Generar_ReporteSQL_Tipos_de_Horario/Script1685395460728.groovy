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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Despliegue7018)

WebUI.setText(findTestObject('Object Repository/VERSION_7018/3.Modulo_Hojas_de_Vida/1.Generar_ReporteSQL_Tipos_de_Horario/Page_Sistema de Recursos Humanos y Nmina/input_Usuario_usuario'), 
    GlobalVariable.Usuario7018)

WebUI.setEncryptedText(findTestObject('Object Repository/VERSION_7018/3.Modulo_Hojas_de_Vida/1.Generar_ReporteSQL_Tipos_de_Horario/Page_Sistema de Recursos Humanos y Nmina/input_Clave_clave'), 
    GlobalVariable.Password7018)

WebUI.click(findTestObject('Object Repository/VERSION_7018/3.Modulo_Hojas_de_Vida/1.Generar_ReporteSQL_Tipos_de_Horario/Page_Sistema de Recursos Humanos y Nmina/input_Clave_boton'))

WebUI.click(findTestObject('Object Repository/VERSION_7018/3.Modulo_Hojas_de_Vida/1.Generar_ReporteSQL_Tipos_de_Horario/Page_Sistema de Recursos Humanos y Nmina/img_Sistemas De Apoyo_moduloMiniatura'))

WebUI.click(findTestObject('Object Repository/VERSION_7018/3.Modulo_Hojas_de_Vida/1.Generar_ReporteSQL_Tipos_de_Horario/Page_Sistema de Recursos Humanos y Nmina/img_Polivalencia x Empleado_nodeIcon54'))

WebUI.click(findTestObject('Object Repository/VERSION_7018/3.Modulo_Hojas_de_Vida/1.Generar_ReporteSQL_Tipos_de_Horario/Page_Sistema de Recursos Humanos y Nmina/a_Tipos De Horario'))

WebUI.click(findTestObject('Object Repository/VERSION_7018/3.Modulo_Hojas_de_Vida/1.Generar_ReporteSQL_Tipos_de_Horario/Page_Sistema de Recursos Humanos y Nmina/div_Generar'))

WebUI.delay(GlobalVariable.Delay_3_Seg)

WebUI.click(findTestObject('Object Repository/VERSION_7018/3.Modulo_Hojas_de_Vida/1.Generar_ReporteSQL_Tipos_de_Horario/Page_Sistema de Recursos Humanos y Nmina/div_Editar'))

WebUI.delay(GlobalVariable.Delay_3_Seg)

WebUI.click(findTestObject('Object Repository/VERSION_7018/3.Modulo_Hojas_de_Vida/1.Generar_ReporteSQL_Tipos_de_Horario/Page_Sistema de Recursos Humanos y Nmina/div_Cancelar'))

WebUI.closeBrowser()

