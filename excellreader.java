package module_5;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excellreader {
	
	String Filepath;
	String Filename;
	public excellreader(String filepath, String filename) {
		super();
		Filepath = filepath;
		Filename = filename;
	}
	
	public int rowCount()
	{
		int row =0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(Filepath);
			XSSFSheet workSheet = workbook.getSheet(Filename);
			row = workSheet.getPhysicalNumberOfRows();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}
	
	public int colCount()
	{
		int col = 0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(Filepath);
			XSSFSheet workSheet = workbook.getSheet(Filename);
			col = workSheet.getRow(0).getPhysicalNumberOfCells();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return col;
	}
	
	public String getdata(int row, int col)
	{
		String data = null;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(Filepath);
			XSSFSheet workSheet = workbook.getSheet(Filename);
			data = workSheet.getRow(row).getCell(col).getStringCellValue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return data;
	}

}
