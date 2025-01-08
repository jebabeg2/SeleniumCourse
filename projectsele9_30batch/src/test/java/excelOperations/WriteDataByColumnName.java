package excelOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataByColumnName 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\begyu\\Desktop\\testdata1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(0);
		
		String cell = "failed" ;
		//cell.setCellValue("failed");
		
		int cellindex = -1;
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equalsIgnoreCase("Password"))
			{
				cellindex = i;
			}
		}
		

		FileOutputStream fos = new FileOutputStream(f);
        wb.write(fos);
        wb.close();
        fos.close();
        fis.close();
        
	}
	
}
