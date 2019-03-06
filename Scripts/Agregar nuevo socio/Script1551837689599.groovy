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
import testlink.api.java.client.TestLinkAPIClient as TestLinkAPIClient
import testlink.api.java.client.TestLinkAPIException as TestLinkAPIException
import testlink.api.java.client.TestLinkAPIResults as TestLinkAPIResults

// rommel key f7a213e815b5649bcd5ee4ef350b3992
// angel key 1831d2a0d3ffaeb921542bddf0621779

public class AutomatedUpdateExample {
	
	public static String DEVKEY="f7a213e815b5649bcd5ee4ef350b3992"; //Colocar key del testlink personal
	
	public static String URL="http://localhost/testlink/lib/api/xmlrpc/v1/xmlrpc.php";
	
	public static void reportResult(String TestProject,String TestPlan,String Testcase,String Build,String Notes,String Result) throws TestLinkAPIException{
	TestLinkAPIClient api=new TestLinkAPIClient(DEVKEY, URL);
	api.reportTestCaseResult(TestProject, TestPlan, Testcase, Build, Notes, Result);
	}
}

void Test() throws Exception {
	AutomatedUpdateExample a = new AutomatedUpdateExample()

	String testProject = 'Proyecto QA'

	String testPlan = 'Plan'

	String testCase = 'Agregar nuevo socio'

	String build = 'Build'

	String result = null

	String notes = null

	try {
		WebUI.openBrowser('')
        WebUI.navigateToUrl('http://localhost:50447/Views/Login.aspx')
        WebUI.setText(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Login  inResorts/input_Usuario_txtUsuario'), 'userQa')
        WebUI.setEncryptedText(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Login  inResorts/input_Contrasea_txtPassword'), 'FVZhtmnLu/c=')
        WebUI.click(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Login  inResorts/input_Recordar Contrasea_btnLo'))
        WebUI.click(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Inicio  inResorts/a_Nuevo Socio'))
        WebUI.setText(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Registro de nuevo Socio  inRes/input_Nombres _txtName'), 'Test')
        WebUI.setText(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Registro de nuevo Socio  inRes/input_Apellidos _txtLastName'), 'Test')
        WebUI.setText(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Registro de nuevo Socio  inRes/input_Fecha de nacimiento _txt'), '11/07/1990')
        WebUI.selectOptionByValue(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Registro de nuevo Socio  inRes/select_Seleccione...DNICEPasap'), '3', true)
        WebUI.setText(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Registro de nuevo Socio  inRes/input_ Asegurese de colocar Co'), '5677584932')
        WebUI.selectOptionByValue(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Registro de nuevo Socio  inRes/select_--Seleccionar--Soltero('), '1', true)
        WebUI.setText(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Registro de nuevo Socio  inRes/input_Correo electrnico _txtEm'), 'test1@gmail.com')
        WebUI.setText(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Registro de nuevo Socio  inRes/input_Nro. Celular _txtPhone'), '906696668')
        WebUI.setText(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Registro de nuevo Socio  inRes/input_Provincia  Ciudad _txtEs'), 'Lima')
        WebUI.setText(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Registro de nuevo Socio  inRes/input_Distrito  Estado _txtCiu'), 'Lima')
        WebUI.click(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Registro de nuevo Socio  inRes/input_Generar Link_btnRegister'))
        WebUI.click(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_inResorts/input_SOLICITUD PARA SER MIEMB'))
        WebUI.click(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_inResorts/input_Haz clic aqu para leer'))
        WebUI.click(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_inResorts/input_disponible en este enlac'))
        WebUI.click(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_inResorts/input_Acepto_btnPoliticsKit'))
        WebUI.click(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Proceso de Pago - inResorts/input_Banca por Internet_packa'))
        WebUI.click(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Proceso de Pago - inResorts/input_S._btnProcess'))
        WebUI.click(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Deposito  Ribera del Rio/input_concat(  Subir comproban'))
        WebUI.click(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_/input_APRESURATE Te esperamos_'))
        WebUI.click(findTestObject('Object Repository/Page_agregar Socio inResorts/Page_Inicio  inResorts/img_Salir_img-responsive'))
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

Test();


