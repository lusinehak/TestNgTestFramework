
import org.testng.Assert;
import org.testng.annotations.Test;

public class CosTest extends ConfigurationTest {
	/*@Test(dataProvider = "values", groups = { "trigonometric" })
	  public void cosTest(double v) {
		  Assert.assertEquals(c.cos(v), Math.cos(v));
	  }*/
	@Test(groups = "trigonometric")
	public void cos0() {
		Assert.assertEquals(c.cos(Math.toRadians(0.0)), Math.cos(Math.toRadians(0.0)), 3);
	}
	@Test(groups = "trigonometric")
	public void cos30() {
		Assert.assertEquals(c.cos(Math.toRadians(30.0)), Math.cos(Math.toRadians(30.0)), 3);
	}
	@Test(groups = "trigonometric")
	public void cos45() {
		Assert.assertEquals(c.cos(Math.toRadians(45.0)), Math.cos(Math.toRadians(45.0)), 3);
	}
	@Test(groups = "trigonometric")
	public void cos60() {
		Assert.assertEquals(c.cos(Math.toRadians(60.0)), Math.cos(Math.toRadians(60.0)), 3);
	}
}
