package utils;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;

import baseClass.TestBaseClass;

public class ClipboardOperations extends TestBaseClass {

	/**
	 * Method is used to get the clipboard data
	 * @returnclipboardData
	 * @throws Exception
	 */
	public Object getClipboardData() throws Exception {
		try {
			Object clipboardData = Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
			return clipboardData;
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new Exception(e1.getMessage());
		}
	}
	
	/**
	 * Method is used to get the clipboard data
	 * @returnclipboardData
	 * @throws Exception
	 */
	public String getTextClipboardData() throws Exception {
		try {
			String stringText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); 
			return stringText;
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new Exception(e1.getMessage());
		}
	}
}