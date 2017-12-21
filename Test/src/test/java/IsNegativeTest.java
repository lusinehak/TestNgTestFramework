
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class IsNegativeTest extends ConfigurationTest {
	
	  @Parameters({ "val", "res" })
	  @Test
	  public void isNegativeTest(long val, boolean res) {
		Assert.assertEquals(c.isNegative(val), res);  
	  }
}
