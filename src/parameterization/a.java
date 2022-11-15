package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class a {
public static void main(String[] args) throws Throwable {
	
	FileInputStream fis =new FileInputStream("C:\\Users\\seema\\OneDrive\\Desktop\\New folder\\Family.xlsx");
	double value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
System.out.println(value);
}
}
