import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4Priority {
	WebDriver driver;
	@BeforeMethod
	public  void browseron() {
		System.out.println("browser open");


	}

	@Test(priority=0,invocationCount=1)
	public void password() {
		System.out.println("verify password");
	}

	@Test(priority=-1,dependsOnMethods="login")   //because of dependson it will execute parent and then child which depend on parent method
	public void name() {
		System.out.println("verify name");
	}

	@Test(priority=3)
	public void login() {
		System.out.println("click on log in");
		Assert.assertTrue(false);              //***due to assert false boolean ,it fails and whatever depend on it, that skipped automatically
	}

	@Test(priority=3,enabled=false)                  //******by using enable=false we just stop the execution of test
	public void signout() {                           //***or if we take invocation count 0 or negative it also stop execution
		System.out.println("click on signout");
	}

	@Test()
	public void example() {
		System.out.println("this is example");
	}

	@AfterMethod()
	public  void browseroff() {
		System.out.println("browser close");
		driver.close();
	}
	}























