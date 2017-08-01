import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
public class TestPOI{
	public static void main(String[] args) {
		try{
			 //读取excel文件
	        FileInputStream inputStream=new FileInputStream("1111.xls");
	        //将输入流转换为workbook
	        HSSFWorkbook workbook=new HSSFWorkbook(inputStream);
	        //获取工作表
	        HSSFSheet sheet=workbook.getSheetAt(0);
	        //获取行
	        HSSFRow row=sheet.getRow(2);
	        //获取单元格（第一行第三列）
	        HSSFCell cell=row.getCell(2);
	        
	        System.out.println("单元格内容为:"+cell.getStringCellValue());

		}catch(Exception e){
			e.printStackTrace();

		}
	}
}