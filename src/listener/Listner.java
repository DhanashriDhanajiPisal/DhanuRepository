package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener {

		@Override
		public void onTestSuccess(ITestResult result) {
			
			Reporter.log("test case passed successfully",true);
			Reporter.log("Name of test method completed success is"+result.getName(),true);
		}
	
		@Override
		public void onTestFailure(ITestResult result) {
	
		Reporter.log("test case failed plz check again",true);
		Reporter.log("Name of test method failed is"+result.getName(),true);
		}
		@Override
		public void onTestSkipped(ITestResult result) {
			Reporter.log("Test case skipped,please check dependent method",true);
			Reporter.log("Name of test method skipped is"+result.getName(),true);
		
		}
		
}

