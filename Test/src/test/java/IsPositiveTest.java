
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;
import org.testng.Assert;


public class IsPositiveTest extends ConfigurationTest{
  
  @Parameters({ "val", "res" })
  @Test
  public void isPositiveTest(long val, boolean res) {
	Assert.assertEquals(c.isPositive(val), res);  
  }
}
