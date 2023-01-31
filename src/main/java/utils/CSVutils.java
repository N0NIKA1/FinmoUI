package utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.aventstack.extentreports.Status;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

import baseClass.TestBaseClass;

public class CSVutils extends TestBaseClass
{
	
	/*
	 * This method will read csv data file line by line
	 * int skip line will leave the row data. for example if skipline =3 , means it will take data from row 4
	 * will return the list of each row data
	 */
	public static List<String> readDataLineByLine(String file,int skipLines) throws Exception 
	   { 
	     
	       try {
				   // Create an object of file reader 
			       // class with CSV file as a parameter. 
			       FileReader filereader = new FileReader(file); 
			 
			       // create csvReader object and skip first Line 
			       com.opencsv.CSVReader csvReader = new CSVReaderBuilder(filereader) 
			                                 .withSkipLines(skipLines) 
			                                 .build(); 
			       List<String[]> allData = csvReader.readAll(); 
			       List <String>  allDataCSVContent = new ArrayList<>();
			 
			       // print Data 
			       for (String[] row : allData) { 
			           for (String cell : row) { 
 
			               allDataCSVContent.add(cell);      
			           }
			           
			           //System.out.println(row[0]+"\t"+row[1]); 
			       } 
			       //extentTest.get().log(Status.INFO, "Get: Validate Data from CSV : "+allDataCSVContent);
			       return allDataCSVContent;        

		} catch (Exception e) {
			
			e.printStackTrace();
			throw new Exception(e.getMessage());
		} 
	   }
	
	/*
	 * This method will read csv data line by line
	 * int skip line will leave the row data. for example if skipline =3 , means it will take data from row 4
	 * and write data into hashmap, will return hashmap list data
	 */
	public static HashMap<String, String> readDataLineByLineFromCSVAndAddDataInToHashMap(String filePath,int skipLines,int keyColumnNumber,int valueColumnNumber) throws Exception 
	   { 
			try {
				List<String> listKeyColumnData = readDataLineByLineAndGetListOfColumnValue(filePath, skipLines,
						keyColumnNumber);
				List<String> listValueColumnData = readDataLineByLineAndGetListOfColumnValue(filePath, skipLines,
						valueColumnNumber);

				HashMap<String, String> allDataCSVKeyValue = new HashMap<>();
				for (int i = 0; i < listKeyColumnData.size(); i++) {
					allDataCSVKeyValue.put(listKeyColumnData.get(i), listValueColumnData.get(i));
				}
				return allDataCSVKeyValue;
			} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		} 
	   }

	
	
	/*
 * This method will validate hashMap data list and will remove invalid data and will return valid list of hashmap
 */
	public static HashMap<String, String> validateHashMapAndRemoveBlankKeyOrValue(HashMap<String, String> allDataCSVKeyValue) throws Exception {
		try {
			for (Map.Entry<String, String> entry : allDataCSVKeyValue.entrySet()) {

				//System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
				
				if (entry.getKey().contentEquals("") || entry.getValue().contentEquals("")) {
					allDataCSVKeyValue.remove(entry.getKey(), entry.getValue());

				} else {
					allDataCSVKeyValue.put(entry.getKey(), entry.getValue());
				}
				break;
			}
			extentTest.get().log(Status.INFO, "All Glossary data from CSV File  : Valid HashMap Data : " + allDataCSVKeyValue);
			return allDataCSVKeyValue;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		
	}

	/*
	 * This method will read csv data file line by line
	 * int skip line will leave the row data. for example if skipline =3 , means it will take data from row 4
	 *Input->csv file, row data that you want to skip, column number for that you want data list
	 */
	public static List<String> readDataLineByLineAndGetListOfColumnValue(String file,int skipLines,int columnNumber) throws Exception 
	   { 

			try {
				// Create an object of file reader
				// class with CSV file as a parameter.
				FileReader filereader = new FileReader(file);

				// create csvReader object and skip first Line
				com.opencsv.CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(skipLines).build();
				List<String[]> allData = csvReader.readAll();
				List<String> allDataCSVColumn = new ArrayList<>();

				// add column Data in to list
				for (String[] column : allData) {
					String columnData = column[columnNumber];
					allDataCSVColumn.add(columnData);
				}
				// extentTest.get().log(Status.INFO, "Get: Validate Data from CSV :
				// "+allDataCSVColumn);
				// System.out.println( "Get: Validate Data from CSV : "+allDataCSVColumn);
				return allDataCSVColumn;

			} catch (Exception e) {
			
			e.printStackTrace();
			throw new Exception(e.getMessage());
		} 
	   }
	
	/*
	 * This method will Clear CSV Data From Sheet
	 */	
	public void ClearCSVDataFromSheet(String filelocation) throws Exception {
		try {
			CSVReader readerData = new CSVReader(new FileReader(filelocation));
			List<String[]> allElements = readerData.readAll();
			
			for (int i = 0; i < allElements.size(); i++) {
				allElements.remove(i);
			}
			FileWriter sw = new FileWriter(filelocation);
			CSVWriter writer = new CSVWriter(sw);
			writer.writeAll(allElements);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	/*
	 * This method will write KVP To CSV File
	 */
	public void writeDataInCSV(String filePath, List<String[]> kvpCreateAllTypelist) throws Exception {
		try {
			File file = new File(filePath);

			// create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(file);
			CSVWriter writer = new CSVWriter(outputfile, ',', CSVWriter.NO_QUOTE_CHARACTER,
					CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
			writer.writeAll(kvpCreateAllTypelist);

			// closing writer connection
			writer.flush();
			writer.close();
			outputfile.close();
			extentTest.get().log(Status.INFO, "Taxonomy has been created in CSV");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

}
