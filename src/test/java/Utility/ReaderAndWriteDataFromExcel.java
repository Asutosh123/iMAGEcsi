package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableWorkbook;

public class ReaderAndWriteDataFromExcel {
	public ReaderAndWriteDataFromExcel() throws Exception {
	}
	private static WritableCellFormat courier;

	public void writeCaseIDToExcel(String caseID, String FILE_PATH) throws Exception {

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		Workbook wb = Workbook.getWorkbook(new File(FILE_PATH));
		WritableWorkbook wwb = Workbook.createWorkbook(new File(FILE_PATH), wb);
		int intRowCount = wwb.getSheet(0).getRows();
		for (int intRow = 0; intRow <= intRowCount; intRow++) {

			WritableCell cell = wwb.getSheet(0).getWritableCell(0, intRow);
			if (cell.getType() == CellType.EMPTY) {
				WritableCellFormat wcf = new WritableCellFormat();
				wcf.setBorder(Border.ALL, BorderLineStyle.THIN);
				wcf.setWrap(true);

				WritableFont courier10pt = new WritableFont(WritableFont.COURIER, 10);

				courier = new WritableCellFormat(courier10pt);
				wcf.setFont(courier10pt);

				Label label0 = new Label(0, intRow, "", wcf);
				wwb.getSheet(0).addCell(label0);

				Label label1 = new Label(1, intRow, caseID, wcf);
				wwb.getSheet(0).addCell(label1);

				wwb.write();
				intRow = intRowCount + 1;
			}
		}
		wwb.close();
	}
	
	

	public String readingExcel(String filePath) throws BiffException, IOException {
		String result = "";
		Sheet ws = null;
	
		try (FileInputStream file = new FileInputStream(new File(filePath))) {
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFSheet sheet = workbook.getSheetAt(0);
			
			Iterator<Row> rowIterator = sheet.iterator();
			for (Row row : sheet) {
				Iterator<Cell> cellIterator = row.cellIterator();
				for (Cell cell : row) {
					if (cell.getStringCellValue() != null || cell.getStringCellValue() != "") {
						result = cell.getStringCellValue();
					} else {
						break;
					}
				}
			}
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
		return result;
	}

	public String RunON() throws Exception {
		String strResult = "Local System";
		return strResult;
	}

	  public boolean isFileDownloaded(String downloadPath, String fileName) {
		  File dir = new File(downloadPath);
		  File[] dirContents = dir.listFiles();

		  for (int i = 0; i < dirContents.length; i++) {
		      if (dirContents[i].getName().equals(fileName)) {		          
		          return true;
		      }
		          }
		      return false;
		  }
}
