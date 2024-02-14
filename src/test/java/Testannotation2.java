import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testannotation2 {
	@BeforeSuite
	public void bs() {
		System.out.println("beforesuite");
	}
@BeforeTest
public void bt() {
	System.out.println("beforetest");
}
@BeforeClass
public static void bc() {
	System.out.println("beforeclass");
}
@BeforeMethod
public void bmm() {
	System.out.println("beforemethod");
}
@Test
public void testmode() {
	System.out.println("this is  first test");
}
@Test
public void testmode2() {
	System.out.println("this is second test");
}

@AfterMethod
public void am() {
	System.out.println("aftermethod");
}
@AfterClass
public static void ac() {
	System.out.println("afterclass");
}
@AfterTest
public void at() {
	System.out.println("aftertest");
}

@AfterSuite
public void bm() {
	System.out.println("beforemethod");
}


}
