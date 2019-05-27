package HomeWork.HomeWork07_1_00385;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork07_1_00385 {

	public static void main(String[] args){	
	
/****************************************** 1 ******************************************/		
System.out.println("******************************* 1 ******************************");

		try {
			
			File file = new File("src\\HomeWork\\Sample.txt"); //use non-absolute path
		// also can use absolute path:  "C:\DA102_workspace\JavaTest\src\HomeWork\Sample.txt"
			
			System.out.println("the Sample file are : "+file.length()+" bytes");
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	
/************************************** 2 *********************************************/
System.out.println("******************************* 2 ******************************");
/************************** 2.1 ***********************************/		
		
		try {
			FileInputStream file1 = new FileInputStream ("src\\HomeWork\\Sample.txt");
			
				System.out.println("The Sample file are : "+file1.available()+" bytes");
				
				file1.close();
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		

//System.out.println("*****************************************************************");			
///************************** 2.2***********************************/		
		int r, count=0;
		
		try {
			FileReader file2 = new FileReader ("src\\HomeWork\\Sample.txt");
			
			while( (r =file2.read()) != -1) {
				count++;
				//System.out.print((char)r); //checking if reading is correct or not
			}
			
			System.out.println("There are : " + count + " characters");
			
			file2.close();
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

//System.out.println("*****************************************************************");		
/************************** 2.3***********************************/	
		
		String r1; 
		int count1=0;
		
		 try {
			BufferedReader bf3 = new  BufferedReader(new FileReader ("src\\HomeWork\\Sample.txt"));
			
			while((r1 = bf3.readLine()) != null) {
				count1++;
				
				//System.out.println(r1); //checking if reading is correct or not.
			}
			System.out.println("There are : " + count1 + " lines");
			
			bf3.close();
		} catch (FileNotFoundException e) { //for FileReader
			e.printStackTrace();
		}catch (IOException e) { //for BufferedReader
		e.printStackTrace();
	}

/************************************** 3 *********************************************/		
		
		
		
	}

}
