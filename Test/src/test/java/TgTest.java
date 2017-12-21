import org.testng.Assert;
import org.testng.annotations.Test;

public class TgTest extends ConfigurationTest{

	@Test(dependsOnMethods = {"tg30"})
	//Tg in 0 is not defined but returns 0
	public void tg0() {
		Assert.assertEquals(c.tg(Math.toRadians(0.0)), Math.tan(Math.toRadians(0.0)), 3);
	}
	@Test(dependsOnMethods = {"tg45"})
	public void tg30() {
		Assert.assertEquals(c.tg(Math.toRadians(30.0)), Math.tan(Math.toRadians(30.0)), 3);
	}
	@Test(dependsOnMethods = {"tg60"})
	public void tg45() {
		Assert.assertEquals(c.tg(Math.toRadians(45.0)), Math.tan(Math.toRadians(45.0)), 3);
	}
	@Test()
	public void tg60() {
		Assert.assertEquals(c.tg(Math.toRadians(60.0)), Math.tan(Math.toRadians(60.0)), 3);
	}
}
