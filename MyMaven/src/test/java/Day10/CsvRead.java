package Day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CsvRead {
  @Test
  public void f() throws IOException {
	  CSVReader csv=new CSVReader(new FileReader(".\\data.csv"));
	  List<String[]> alldata=csv.readAll();
	  for(String rowData[]:alldata)
	  {
		  //System.out.println(rowData[0]);
		  //System.out.println(rowData[1]);
	  for(String col:rowData)
	  {
		  System.out.println(col);
	  }
	  
	  
	  }
  }
}
