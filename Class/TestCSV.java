package ch02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Read file from excel, first thing tranfer .xlsx to .csv
public class TestCSV {
	public static void main(String[] args) throws IOException {  //throws exception to next user

/************ 0. read .csv print information *******************/ 	
//		
//		File file = new File("C:\\DA102_workspace\\JavaEx_Part2\\students.csv"); //attention file is .csv
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
//		
//		String data;
//		while ((data = br.readLine()) != null)
//			System.out.println(data);
//		
//		br.close();
//		fr.close();
//		
/****** above console will show mess  character, because windows excel is MS950 ******/ 
		
/************ 1. 從文字本身的位元資料進行處理 ****************************************/
//		
//		File file = new File("C:\\DA102_workspace\\JavaEx_Part2\\students.csv"); //attention file is .csv
//		FileInputStream fis = new FileInputStream(file);
//		InputStreamReader isr = new InputStreamReader(fis, "MS950");
//		BufferedReader br = new BufferedReader(isr);
//		
//		String data;
//		while ((data = br.readLine()) != null)
//			System.out.println(data);
//		
//		br.close();
//		isr.close();
//		fis.close();
//		
/**************************** Console correct **********************************************************/
		
/********************** 2. 參考 CopyBytes.java 後半段程式  ***********************************************************************************************/
		
		File file = new File("C:\\DA102_workspace\\JavaEx_Part2\\students.csv"); //attention file is .csv
		FileInputStream fis = new FileInputStream(file);
		
		int c;
		
		int i = 0; // for ch[] index
		byte ch[] = new byte[(int) file.length()];  // set a array its length is same as file length, inputFile is long_type,

		
		while ((c = fis.read()) != -1) {  //read from byte data input int data to java 
	
			ch[i++] = (byte)c;
			

		}
		System.out.print(new String(ch, "MS950")); // String(byte[] bytes)

		fis.close();
		
/**************************** Console correct **********************************************************/		
		
//3. 調整 Java Eclipse UTF-8 -> MS950
		/** Console correct **/
//4. CMD: -encodeing XXX( compiler_type (EX:MS950))		
		/** Console correct **/
		
	}

}
