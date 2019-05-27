package HomeWork.HomeWork07_2_00385;

import java.io.*;


	
	
public class HomeWork07_2_00385 {
	public static void main(String[] args) throws IOException {

/**************************************** 1 **************************************************************/		
//		FileOutputStream fo = new FileOutputStream("src\\HomeWork\\Random.txt", true); //append is true, that wont cover old data of the .txt 
//		BufferedOutputStream bo = new BufferedOutputStream(fo);
//		PrintStream ps = new PrintStream(bo);
//		
//		int i; //set a Var. to show integer on console monitor
//		
//		ps.println(i = (int)(Math.random()*1000+1));
//		
//		System.out.println(i);  // show the integer wrote in Random.txt on console monitor
//		
//		ps.close();
//		bo.close();
//		fo.close();
		
		/************************ 1. another way write 'once'  10 randomly Nums.  in  .txt***************************/
		FileWriter fw = new FileWriter("src\\HomeWork\\Random.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i = 0; i<10; i++) {
			String s;
			
			bw.write(s = (Integer.toString((int)(Math.random()*1000+1))));
			bw.newLine();
			
			System.out.println(s);
		}
		
		bw.flush();
		fw.close();


		}
	}
/**********************************************************************************************************/		
	
/**************************************** 2 **************************************************************/		

//  class Copy{
//		
//		public void copyFile(String location1, String location2) throws IOException {
//			
//  // ↓↓↓↓ the Dest. wants to read file, need to create by user.		
//			FileReader fr = new FileReader(location1); 
// // ↓↓↓↓ the Dest. wants to write file, don't need to create it, it will be created automatic by execute this code.
//			FileWriter wr = new FileWriter(location2);
//			 
//			int c;
//			
//			while((c = fr.read()) != -1) {
//				
//				wr.write(c);
//				System.out.print((char) c);
//			}
//			
//			fr.close();
//			wr.close();
//		}
//		
//	}
//	
//public class HomeWork07_2_00385 {	
//	public static void main(String[] args) throws IOException {	
//		
//// create a Obj. of Copy and call copyFile(), 
///// two arguments one is which wants to read destination, another is which wants to write destination.
//		
//	 new Copy().copyFile("src\\HomeWork\\Location1.txt","src\\HomeWork\\Location2.txt");
//		
//	}
//}


