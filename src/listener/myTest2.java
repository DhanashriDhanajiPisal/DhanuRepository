package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener.Listner.class)
public class myTest2 {
  
  @Test
  public void myMethod4()
  {
	  Reporter.log("my method 4 is running",true);
  
  }
  @Test
  public void myMethod5()
  {
	  Assert.fail();
  Reporter.log("my method5 is running",true);
  }
  @Test(dependsOnMethods = {"myMethod5"})
  public void myMethod6()
  {
	  
	 Reporter.log("my method6 is running",true);
  }


  }

