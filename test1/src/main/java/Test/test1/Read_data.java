package Test.test1;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class Read_data {
    public static final String filepath = "Mydata.xlsx";

    public String data(String readdata) throws IOException, InvalidFormatException {

    	
    	Workbook workbook = WorkbookFactory.create(new File(filepath));
    	Sheet sheet = workbook.getSheetAt(0);
    	DataFormatter dataFormatter = new DataFormatter();

         Iterator<Row> rowIterator = sheet.rowIterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                String cellValue = dataFormatter.formatCellValue(cell);
                if(readdata.equals(cellValue))
                {
                	row = rowIterator.next();
                	return row.getCell(cell.getColumnIndex()).toString();
                }
                }
        }
        return null;
            }
}