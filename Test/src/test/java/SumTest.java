
import org.testng.annotations.Test;

import org.testng.Assert;

public class SumTest extends ConfigurationTest{
	
  @Test(dataProvider = "longValue", groups = { "arithmetic" })
  public void testLongValue(long num1, long num2) {
	  Assert.assertEquals(c.sum(num1, num2), num1 + num2);
  }
  
  @Test(dataProvider = "doubleValue", groups = { "arithmetic" })
  public void testDoubleValue(double num1, double num2) {
	  Assert.assertEquals(c.sum(num1, num2), num1 + num2);
  } 
}
