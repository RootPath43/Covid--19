package datapullout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writer {
	private static Writer inst= new Writer();
	private String[] array;
	private String[][] exceldata;
	
	private  Writer() {
		
		
		
	}
		
        		
        	
        
  
     
public static Writer getInstance() {
	return inst;
}

public void writeit()  {
	try {
		
		array=SocketDevice.getInstance().getText().split("-",10);
	  /* for (int i=0;i<10;i=i++) {
	    	for(int z=0;z<3;z++) {
	    		
	    		exceldata[i][z]=array[(z*10)+i];
	    		System.out.println(exceldata[i][z]);
	    			}}
		*/

		//name of excel file

		String sheetName = "Sayfa1";//name of sheet

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet(sheetName) ;
 
		
	   

     
    	 XSSFRow row= sheet.createRow(2);
         for (int j = 0; j <array.length; j++) {
        	 XSSFCell cell = row.createCell(j);

        	    
            cell.setCellValue(array[j]);
            
         }
     
      
         FileOutputStream fileOut = new FileOutputStream(new File("new.xlsx"));
         wb.write(fileOut);
 		fileOut.flush();
 		fileOut.close();
	        System.out.println("mission accomplished");
		} catch (IOException |NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         System.out.println("file edited");

 

}
}


