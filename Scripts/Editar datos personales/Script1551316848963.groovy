import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import testlink.api.java.client.TestLinkAPIException as TestLinkAPIException
import testlink.api.java.client.TestLinkAPIClient as TestLinkAPIClient
import testlink.api.java.client.TestLinkAPIResults as TestLinkAPIResults

// rommel key f7a213e815b5649bcd5ee4ef350b3992
// angel key 1831d2a0d3ffaeb921542bddf0621779
//Colocar key del testlink personal
Test()

void Test() throws Exception {
    AutomatedUpdateExample a = new AutomatedUpdateExample()

    String testProject = 'Proyecto QA'

    String testPlan = 'Plan'

    String testCase = 'Edición de datos personales '

    String build = 'Build'

    String result = null

    String notes = null

    try {
        WebUI.openBrowser('')

        WebUI.navigateToUrl('http://localhost:50447/Views/Login.aspx')

        WebUI.setText(findTestObject('Page_Login  inResorts/input_Usuario_txtUsuario (2)'), 'userQa')

        WebUI.setEncryptedText(findTestObject('Page_Login  inResorts/input_Contrasea_txtPassword (2)'), 'FVZhtmnLu/c=')

        WebUI.click(findTestObject('Page_Login  inResorts/input_Recordar Contrasea_btnLo (2)'))

        WebUI.click(findTestObject('Page_Inicio  inResorts/span_Hola Omar Urteaga Cabrera (1)'))

        WebUI.click(findTestObject('Page_Inicio  inResorts/a_Cuenta (1)'))

        WebUI.click(findTestObject('Object Repository/Page_Editar Socio  inResorts/a_Datos personales (1)'))

        WebUI.click(findTestObject('Object Repository/Page_Editar Socio  inResorts/span_Peru'))

        WebUI.setText(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Nombres_txtName (1)'), nombres)

        WebUI.setText(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Apellidos_txtLastName (1)'), 
            apellidos)

        WebUI.setText(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Nro. Telfono mvil_txtPho'), telefono)

        WebUI.setText(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Fecha de nacimiento_txtB'), fechadenacimiento)

        WebUI.setText(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Correo electrnico_txtEma'), email)

        WebUI.setText(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Nro. Telfono mvil adicio'), telefono2)

        WebUI.setText(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Direccin_txtAddress'), direccion)

        WebUI.setText(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Estado_txtEstado'), estado)

        WebUI.setText(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Ciudad_txtCiudad'), ciudad)

        WebUI.closeBrowser()

        result = TestLinkAPIResults.TEST_PASSED

        notes = 'Executed successfully'
    }
    catch (Exception e) {
        result = TestLinkAPIResults.TEST_FAILED

        notes = 'Execution failed'
    } 
    finally { 
        a.reportResult(testProject, testPlan, testCase, build, notes, result)
    }
}

