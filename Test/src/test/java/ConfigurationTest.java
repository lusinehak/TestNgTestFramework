
import com.epam.tat.module4.Calculator;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterClass;

public class ConfigurationTest {
	protected Calculator c;
	
  @BeforeClass(alwaysRun=true)
  public void beforeClass() {
	  c = new Calculator();
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Test Completed");
  }
  
  @DataProvider
  public static Object[][] longValue() {
    return new Object[][] {
      new Object[] { 1, 1 },
      new Object[] { 25, -5 },
      new Object[] { -20, -5 },
      new Object[] { -7, 30 },
      new Object[] { '1', '2' },
    };
  }
  
  @DataProvider
  public static Object[][] doubleValue() {
    return new Object[][] {
      new Object[] { 1.5, 1.31 },
      new Object[] { 22.6, -57.8 },
      new Object[] { -20.2, -0.25 },
      new Object[] { -5.7, 30.21 },
    };
  }
  
  @DataProvider
  public static Object[][] values() {
    return new Object[][] {
      new Object[] { 0 },
      new Object[] { 30 },
      new Object[] { 45 },
      new Object[] { 60 },
      new Object[] { 90 }
    };
  }

}
