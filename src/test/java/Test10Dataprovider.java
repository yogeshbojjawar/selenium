import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test10Dataprovider {
	@DataProvider(name="databank")     //either we can use dataprovider name or method name
	public Object[][] testdata() {
		Object[][] obj=new Object[2][2];
		obj[0][0]="yogesh";
		obj[0][1]="123456";
		obj[1][0]="superman";
		obj[1][1]="547895";
		return obj;
	}

	@Test(dataProvider="databank")
	public void fbdata(String username,String password) {

		System.out.println(username+" "+password);

	}
	
	//*******
	@DataProvider
	public  Object[][] instadata() {                   //when u do not have data provider name u can use method name too
		Object[][] instadata= {{"odifdo","12322"},{"gidsoa","75846"}};
		return instadata;
	}
	
	@Test(dataProvider="instadata")
	public void receivedata(String username,String password) {
		System.out.println(username+" "+password);
	}

//************
	@Test(dataProvider = "dp1")
	public  void testlogin(String[] s) {                   
		System.out.println(s[0]+">>"+s[1]);
	}
	
	
	@DataProvider	
	public  String[][] dp1() {                   
		String[][] text=new String[][]{{"a","1232"},{"b","245"},{"c","987"}	};
		return text;
	}
	}
