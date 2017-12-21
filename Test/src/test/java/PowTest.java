
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends ConfigurationTest {
  @Test(dataProvider = "pow")
  public void powTest(double val, double ind) {
	  Assert.assertEquals(c.pow(val, ind), Math.pow(val, ind));
  }
  
  @DataProvider
  public Object[][] pow() {
    return new Object[][] {
      new Object[] { 5, 1 },
      new Object[] { 2, -5 },
      new Object[] { -20, -5 },
      new Object[] { 7, 0 },
      new Object[] { -2, 2 },
      new Object[] { 0, 0 }
    };
  }
}
