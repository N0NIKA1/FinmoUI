package utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import baseClass.TestBaseClass;

public class CsvFileOperations extends TestBaseClass{

	public File file;
	/**This is the constructor is used to initialize the methods of this class
	 * @param filePath
	 * @throws Exception
	 */
	public CsvFileOperations(String filePath) throws Exception
	{
		try
		{
			file = new File(filePath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	/**This method is used to clear the csv file
	 * 
	 * @throws Exception
	 */
	public void clearCsvFileData() throws Exception
	{
		try
		{
			CSVReader readerData = new CSVReader(new FileReader(file));
    		FileWriter outputfile = new FileWriter(file);
    		CSVWriter writer = new CSVWriter(outputfile, ',', 
					CSVWriter.NO_QUOTE_CHARACTER, 
					CSVWriter.DEFAULT_ESCAPE_CHARACTER, 
					CSVWriter.DEFAULT_LINE_END);
			List<String[]> allElements = readerData.readAll();
			for (int i = 0; i < allElements.size(); i++) {
				allElements.remove(i);
			}

			writer.writeAll(allElements);
			writer.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	/**This method is used to write the data in the csv file
	 * @param writeData
	 * @throws Exception
	 */
	public void writeDataToCsvFile(String[] writeData) throws Exception
	{
		try
		{
			FileWriter outputfile = new FileWriter(file, true);
	        CSVWriter writer = new CSVWriter(outputfile, ',', 
					CSVWriter.NO_QUOTE_CHARACTER, 
					CSVWriter.DEFAULT_ESCAPE_CHARACTER, 
					CSVWriter.DEFAULT_LINE_END);  	  
	        writer.writeNext(writeData);
	        // closing writer connection
			writer.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
}
