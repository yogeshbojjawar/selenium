import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test7Assert2 {

	@Test
	public void first() {

		Assert.assertTrue( true,"verify condition"); //passed because actual result is true and expected is given in " "
		System.out.println("first testng program");
	}
	@Test
	public void second() {
		SoftAssert obj=new SoftAssert();
		System.out.println("hello guys");

		obj.assertEquals(false, "not passed conditon");     //even it fails it will execute next line steps and next test case.

		System.out.println("second program");
		obj.assertAll();
	}
	@Test
	public void third() {
		System.out.println("third testng program");
	}

}
