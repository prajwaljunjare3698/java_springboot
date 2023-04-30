//package excel_sheet_read;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import jxl.Cell;
//import jxl.Sheet;
//import jxl.Workbook;
//import jxl.read.biff.BiffException;
//
//
////read the data username and password from excel sheet
//
//
//public class GetNamePass {
//	public static void main(String[] args) throws BiffException, IOException {
//		FileInputStream fis=new FileInputStream("ReadData.xls");
//		Workbook book=Workbook.getWorkbook(fis);
//		Sheet sheet=book.getSheet("Sheet2");
//		int rows =sheet.getRows();
//		System.out.println("total no of rows :"+rows);
//		int column=sheet.getColumns();
//		System.out.println("total no of columns :"+column);
//		for(int i=1;i<rows;i++) {
//		for(int j=0;j<column;j++) {
//		Cell data=sheet.getCell(j, i);
//		System.out.println(data.getContents());
//
//		} }
//		}
//
//}
