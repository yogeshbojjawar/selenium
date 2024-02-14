import org.testng.Assert;
import org.testng.annotations.Test;

import com.Test.Listener;

public class Test11Listener extends Listener {


	@Test(enabled=false)
	public void firstcase() {
		System.out.println("first test case");
		Assert.assertEquals("yogesh", "Yogesh");
	}
	@Test(dependsOnMethods="thirdcase")
	public void secondcase() {
		System.out.println("second test case");
		Assert.assertEquals("swap", "skap");
	}

	@Test()
	public void thirdcase() {
		System.out.println("third test case");
		Assert.assertTrue(false);
	}





}
