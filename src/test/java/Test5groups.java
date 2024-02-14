
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test5groups {
	@BeforeMethod
	public  void browseron() {
		System.out.println("browser open");


	}

	@Test(groups= {"sanity"})
	public void test2() {
		System.out.println("second test");
	}

	@Test(groups= {"sanity"})   //because of dependson it will execute parent and then child which depend on parent method
	public void first() {
		System.out.println("first test");
	}

	@Test(groups= {"regression"})
	public void test3() {
		System.out.println("third test");
		Assert.assertTrue(false);              //***due to assert false boolean ,it fails and whatever depend on it, that skipped automatically
	}

	@Test(groups= {"gui"})                  //******by using enable=false we just stop the execution of test
	public void forth() {                           //***or if we take invocation count 0 or negative it also stop execution
		System.out.println("forth test");
	}

	@AfterMethod(groups= {"sanity"})
	public  void browseroff() {
		System.out.println("browser close");

	}
	}




