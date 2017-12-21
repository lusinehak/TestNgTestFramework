
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubTest extends ConfigurationTest {
	
	  @Test(dataProvider = "longValue", groups = { "arithmetic" })
	  public void testLongValue(long num1, long num2) {
		  Assert.assertEquals(c.sub(num1, num2), num1 - num2);
	  }
	  
	  @Test(dataProvider = "doubleValue", groups = { "arithmetic" })
	  public void testDoubleValue(double num1, double num2) {
		  Assert.assertEquals(c.sub(num1, num2), num1 - num2);
	  }
}
