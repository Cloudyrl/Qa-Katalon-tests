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
import testlink.api.java.client.TestLinkAPIClient
import testlink.api.java.client.TestLinkAPIException
import testlink.api.java.client.TestLinkAPIResults

public class AutomatedUpdateExample {
	public static String DEVKEY="f7a213e815b5649bcd5ee4ef350b3992";
	public static String URL="http://localhost/testlink/lib/api/xmlrpc/v1/xmlrpc.php";
	public static void reportResult(String TestProject,String TestPlan,String Testcase,String Build,String Notes,String Result) throws TestLinkAPIException{
	TestLinkAPIClient api=new TestLinkAPIClient(DEVKEY, URL);
	api.reportTestCaseResult(TestProject, TestPlan, Testcase, Build, Notes, Result);
	}
}
public void Test()throws Exception{
	AutomatedUpdateExample a=new AutomatedUpdateExample();
	String testProject="Proyecto QA";
	String testPlan="Plan";
	String testCase="Login";
	String build="Build";
	String result=null;
	String notes=null;
	try{
    WebUI.openBrowser('')
    WebUI.navigateToUrl('http://localhost:50447/Views/Login.aspx')
    WebUI.setText(findTestObject('Page_Login  inResorts/input_Usuario_txtUsuario'), 'usera')
    WebUI.setEncryptedText(findTestObject('Page_Login  inResorts/input_Contrasea_txtPassword'), 'FVZhtmnLu/c=')
    WebUI.click(findTestObject('Page_Login  inResorts/input_Recordar Contrasea_btnLo'))
    WebUI.click(findTestObject('Object Repository/Page_Inicio  inResorts/img_Salir_img-responsive'))
    WebUI.closeBrowser()
    result= TestLinkAPIResults.TEST_PASSED;
    notes="Executed successfully";
    }catch(Exception e){
    result=TestLinkAPIResults.TEST_FAILED;
    notes="Execution failed";
    }
    finally{
	a.reportResult(testProject, testPlan, testCase, build, notes, result);
	}
    }

    Test();

