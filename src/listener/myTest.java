package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener.Listner.class)
public class myTest {
  
  @Test
  public void myMethod1()
  {
	  Reporter.log("my method 1 is running",true);
  
  }
  @Test
  public void myMethod2()
  {
	  Assert.fail();
  Reporter.log("my method2 is running",true);
  }
  @Test(dependsOnMethods = {"myMethod2"})
  public void myMethod3()
  {
	  
	 Reporter.log("my method3 is running",true);
  }


  }

