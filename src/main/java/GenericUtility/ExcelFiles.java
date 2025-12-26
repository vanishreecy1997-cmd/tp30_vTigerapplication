package GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFiles
{
	/**
	 * This method is used to read single data from the excel file
	 * @author vani
	 * @param sheetName
	 * @param rowNo
	 * @param celNo
	 * @return 
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 * 
	 */
public String readDataFromExcel(String sheetName,int rowNo,int celNo) throws EncryptedDocumentException, IOException
{
	FileInputStream f1 = new FileInputStream(Ipathconstants.Excelpath);
	Workbook wb = WorkbookFactory.create(f1);
	Sheet sh = wb.getSheet(sheetName);
	String value = sh.getRow(rowNo).getCell(celNo).getStringCellValue();
	return value;
}

 /**
 * This method is used to read multiple data from the excel file
 * @param sheetName
 * @param rowNo
 * @param celNo
 * @return
 * @throws IOException 
 * @throws EncryptedDocumentException 
 */

 public ArrayList<String> readMultipleDataFromExcel(String sheetName,int rowNo,int celNo) throws EncryptedDocumentException, IOException
 {
	 FileInputStream f1 = new FileInputStream(Ipathconstants.Excelpath);
	 Workbook wb = WorkbookFactory.create(f1);
	 Sheet sh = wb.getSheet(sheetName);
	 int rowCount = sh.getLastRowNum();
	 int cellCount = sh.getRow(0).getLastCellNum();
	 
	 ArrayList<String> list = new ArrayList<String>();
	 
	 for(int i =0; i<=rowCount; i++)
	 {
		 for(int j=0;j<cellCount;j++)
		 {
			String value = sh.getRow(i).getCell(j).getStringCellValue();
			
			list.add(value);
		 }
	 }
	 return list;
 }
 /**
  * This method is used to get the last row count in the excel file
  * @param sheetName
  * @return
 * @throws IOException 
 * @throws EncryptedDocumentException 
  */
  
 public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException
 {
	 FileInputStream f1 = new FileInputStream(Ipathconstants.Excelpath);
	 Workbook wb = WorkbookFactory.create(f1);
	 Sheet sh = wb.getSheet(sheetName); 
	 int rowCount = sh.getLastRowNum();
	 return rowCount;
	 
 }
 /**
  * This method is used to get the last cell count in the excel file
  * @param sheetName
  * @return
 * @throws IOException 
 * @throws EncryptedDocumentException 
  */
 public int getRCelcount(String sheetName) throws EncryptedDocumentException, IOException
 {
	 FileInputStream f1 = new FileInputStream(Ipathconstants.Excelpath);
	 Workbook wb = WorkbookFactory.create(f1);
	 Sheet sh = wb.getSheet(sheetName); 
	 int celCount = sh.getRow(0).getLastCellNum();
	 return celCount;
 }
 /**
  * This method is used to write data into excel file
  * @param sheetName
  * @param value
 * @throws IOException 
  */
 
 public void writeDataintoExcel(String sheetName,String value) throws IOException
 {
	 FileInputStream f1 = new FileInputStream(Ipathconstants.Excelpath);
	 Workbook wb = WorkbookFactory.create(f1);
	 Sheet sh = wb.getSheet(sheetName); 
	 Row row = sh.createRow(0);
	 Cell cel = row.createCell(4);
	 cel.setCellValue("vanishree");
	 
	 FileOutputStream fos = new FileOutputStream(Ipathconstants.Excelpath);
	 wb.write(fos);
		
     wb.close();
	 
 }
 /**
  * This method is used to read the data from the excel
  * @author vanishree
  * @return
  * @throws EncryptedDocumentException
  * @throws IOException
  */
 public Object[][] ReadMultipleSetData(String sheetName) throws EncryptedDocumentException, IOException
 {
	 FileInputStream f = new FileInputStream(Ipathconstants.Excelpath);
	 Workbook wb = WorkbookFactory.create(f);
	 Sheet sh = wb.getSheet(sheetName);
	 int rowcount = sh.getLastRowNum()+1;
	 int cellcount = sh.getRow(0).getLastCellNum();
	 
	 Object[][] obj = new Object[rowcount][cellcount];
	 
	 for(int i =0;i<rowcount;i++)
	 {
		 for(int j=0;j<cellcount;j++)
		 {
			 obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
		 }
	 }
	 return obj;
	 
	 
 }
}

 
 
 

