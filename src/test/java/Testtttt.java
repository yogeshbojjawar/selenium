import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Testtttt {


	@Test
	public void first() throws IOException {

		String xcelpath="C:\\Users\\Yogesh Bojjawar\\eclipse-workspace\\eclipse\\myproject\\test data\\data.xlsx";
		File src=new File(xcelpath);
		FileInputStream file=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(file);
	String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);

	double datanumeric=wb.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
	System.out.println(datanumeric);
	String dataa=Double.toString(datanumeric).replace(".0","");
	System.out.println(dataa);




	wb.close();


			}



}
