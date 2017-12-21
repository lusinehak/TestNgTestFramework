
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SqrtTest extends ConfigurationTest {
	
  @Parameters({ "val"})	
  @Test
  //for negative value works. e.g. -4 => 2
  public void sqrtTest(double val) {
	  Assert.assertEquals(c.sqrt(val), Math.sqrt(val));
  }
}
