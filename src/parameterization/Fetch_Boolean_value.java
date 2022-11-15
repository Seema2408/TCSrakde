package parameterization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Boolean_value {
	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis =new FileInputStream("C:\\Users\\seema\\OneDrive\\Desktop\\New folder\\Family.xlsx");
		  boolean value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
	System.out.println(value);

}

}
