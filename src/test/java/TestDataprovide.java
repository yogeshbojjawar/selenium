import org.testng.annotations.Test;

public class TestDataprovide {

	@Test(dataProvider="databank",dataProviderClass=Test10Dataprovider.class)
	public void fbdata(String username,String password) {

		System.out.println("Username: "+username+" and "+"password: "+ password);

	}

}
