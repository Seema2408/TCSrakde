package parameterization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_data_fetching {
	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis =new FileInputStream("C:\\Users\\seema\\OneDrive\\Desktop\\New folder\\Family.xlsx");
		 String value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);

}
}
