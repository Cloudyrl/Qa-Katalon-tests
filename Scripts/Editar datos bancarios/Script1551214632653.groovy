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
	
	public static String DEVKEY="1831d2a0d3ffaeb921542bddf0621779"; //Colocar key del testlink personal
	
	public static String URL="http://localhost/testlink/lib/api/xmlrpc/v1/xmlrpc.php";
	
	public static void reportResult(String TestProject,String TestPlan,String Testcase,String Build,String Notes,String Result) throws TestLinkAPIException{
	TestLinkAPIClient api=new TestLinkAPIClient(DEVKEY, URL);
	api.reportTestCaseResult(TestProject, TestPlan, Testcase, Build, Notes, Result);
	}
}

Test()

void Test() throws Exception {
    AutomatedUpdateExample a = new AutomatedUpdateExample()

    String testProject = 'Proyecto QA'

    String testPlan = 'Plan'

    String testCase = 'Edición de datos bancarios'

    String build = 'Build'

    String result = null

    String notes = null

    try {
        WebUI.openBrowser('')

        WebUI.navigateToUrl('http://localhost:50447/Views/Login.aspx')

        WebUI.setText(findTestObject('Page_Login  inResorts/input_Usuario_txtUsuario (1)'), 'userQa')

        WebUI.setEncryptedText(findTestObject('Page_Login  inResorts/input_Contrasea_txtPassword (1)'), 'FVZhtmnLu/c=')

        WebUI.click(findTestObject('Page_Login  inResorts/input_Recordar Contrasea_btnLo (1)'))

        WebUI.click(findTestObject('Object Repository/Page_Inicio  inResorts/span_Hola Omar Urteaga Cabrera'))

        WebUI.click(findTestObject('Object Repository/Page_Inicio  inResorts/a_Cuenta'))

        WebUI.click(findTestObject('Object Repository/Page_Editar Socio  inResorts/a_Datos bancarios'))

        WebUI.setText(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Nombre del titular de cu'), NombreC)

        WebUI.click(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Tipo de Cuenta_Cuenta'))

        WebUI.setText(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Nmero de Cuenta_txtNumCu'), NumeroCuenta)

        WebUI.setText(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Numero de Contribuyente_'), NumeroContribuyente)

        WebUI.setText(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Direccin Fiscal_txtFisca'), DireccionFiscal)

        WebUI.setText(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Razn Social_txtBusinessN'), RazonSocial)

        WebUI.click(findTestObject('Object Repository/Page_Editar Socio  inResorts/input_Cancelar_btnSaveDataBank'))

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

