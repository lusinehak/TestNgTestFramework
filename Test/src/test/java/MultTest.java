
import org.testng.Assert;

import org.testng.annotations.Test;

public class MultTest extends ConfigurationTest{
	
	  @Test(dataProvider = "longValue", groups = { "arithmetic" })
	  public void testLongValue(long num1, long num2) {
		  Assert.assertEquals(c.mult(num1, num2), num1 * num2);
	  }
	  
	  @Test(dataProvider = "doubleValue", groups = { "arithmetic" })
	  //for double value the result is round
	  public void testDoubleValue(double num1, double num2) {
		  Assert.assertEquals(c.mult(num1, num2), num1 * num2, 3);
	  }
}
