import org.testng.Assert;
import org.testng.annotations.Test;

public class Test7Assert {



		@Test
		public void first() {

			Assert.assertTrue( true,"verify condition"); //passed because actual result is true and expected is given in " "
			System.out.println("first testng program");
		}
		@Test
		public void second() {
			System.out.println("hello guys");  //executes this  line bcoz it is before the failed test case

			Assert.assertEquals(false, true);   //fails because actual result is false and expected is true

			System.out.println("second program");	//due to fail it does not execute this line and move to next test case
		}
		@Test
		public void third() {
			System.out.println("third testng program");
		}

	}


