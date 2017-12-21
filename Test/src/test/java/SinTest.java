
import org.testng.annotations.Test;
import org.testng.Assert;

public class SinTest extends ConfigurationTest {
  /*@Test(dataProvider = "values", groups = { "trigonometric" })
  public void sinTest(double v) {
	  Assert.assertEquals(c.sin(v), Math.sin(v));
  }*/
	@Test(groups = "trigonometric")
	public void sin0() {
		System.out.print("test n");
//		Assert.assertEquals(c.sin(Math.toRadians(0.0)), Math.sin(Math.toRadians(0.0)));
	}
	@Test(groups = "trigonometric")
	public void sin30() {
//		Assert.assertEquals(c.sin(Math.toRadians(30.0)), Math.sin(Math.toRadians(30.0)));
	}
	@Test(groups = "trigonometric")
	public void sin45() {
		Assert.assertEquals(c.sin(Math.toRadians(45.0)), Math.sin(Math.toRadians(45.0)));
	}
	@Test(groups = "trigonometric")
	public void sin60() {
		//Assert.assertEquals(c.sin(Math.toRadians(60.0)), Math.sin(Math.toRadians(60.0)));
	}
}
