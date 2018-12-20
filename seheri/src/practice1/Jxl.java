package practice1;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Jxl 
{

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException 
	{
	
		//open excel file for reading
				File f=new File("Book10.xls");
				Workbook rwb=Workbook.getWorkbook(f);
				Sheet rsh=rwb.getSheet(0);
				int nour=rsh.getRows();
				//open same excel file for writing
				WritableWorkbook wwb=Workbook.createWorkbook(f, rwb);
				WritableSheet wsh=wwb.getSheet(0);
				//Data driven
				//0 th row have names of columns
				for(int i=0;i<nour;i++)
				{
					int x=Integer.parseInt(rsh.getCell(0,i).getContents());
					int y=Integer.parseInt(rsh.getCell(1,i).getContents());
					int z=x+y;
					Number n=new Number(2,i,z);
					wsh.addCell(n);
				}
				//save & close file
				wwb.write();//save
				wwb.close();
				rwb.close();
		
		

	}

}
