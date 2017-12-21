
import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgTest extends ConfigurationTest{

	@Test(dependsOnGroups = {"myGroup"})
	public void tg0() {
		Assert.assertEquals(c.ctg(Math.toRadians(0.0)), 0.0, 3);
	}
	@Test(groups = {"myGroup"})
	public void tg30() {
		Assert.assertEquals(c.ctg(Math.toRadians(30.0)), 1/Math.tan(Math.toRadians(30.0)), 3);
	}
	@Test(groups = {"myGroup"})
	public void tg45() {
		Assert.assertEquals(c.ctg(Math.toRadians(45.0)), 1/Math.tan(Math.toRadians(45.0)), 3);
	}
	@Test(dependsOnGroups = {"myGroup"})
	public void tg60() {
		Assert.assertEquals(c.ctg(Math.toRadians(60.0)), 1/Math.tan(Math.toRadians(60.0)), 3);
	}
}
