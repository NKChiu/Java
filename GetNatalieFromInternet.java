package ch02;

import java.io.*;
import java.net.*;

public class GetNatalieFromInternet {

	public static void main(String[] args) {
		File dir = new File("D:\\Pictures"); //create Obj. connect destination
		
//// ↓↓↓↓ if the destination is not existed then automatic create it by Java 		
		if (!dir.exists()) {
			dir.mkdir();		
		}
		
  for (int i = 1; i <= 42; i++) {
	  
	  
/*************************** Step1. create file *********************************************/	  
// put the path in String url. ATTENTION: there is a Local Var. (i) in path,
/// ↓↓↓↓ because those Pics. we wanted is same path and add flow number 
			String url = "http://www.space-fox.com/wallpapers/celebs/natalie-portman" + 
					"/natalie_portman_" + i	+ ".jpg"; 
			
//lastIndexOf("/") : find the last string "/" and + 1 that mean to get after"/" String, 
/// ↓↓↓↓ substring() : to get the whole string then assign to Local Var. (filename)
			String filename = url.substring(url.lastIndexOf("/") + 1);
			
// ↓↓↓↓ create a file, in this case the first file is C:\\Pictures\\natalie_portman_1.jpg
			File file = new File(dir, filename);
/********************************************************************************************/			
			
/*************************** Step2. connect the URL Path ************************************/	 			
			try {
// ↓↓↓↓ Creates a URL object from the String representation.
				URL myURL = new URL(url);  
				
//openConnection() : Returns a URLConnection instance that represents a connection 
///to the remote object referred to by the URL.					
//// ↓↓↓↓ HttpURLConnection is a URLConnection so that URLConnection.myURL need to down-casting
				HttpURLConnection conn = (HttpURLConnection) myURL.openConnection();
/////////////// above statement is shorten by two statements, the detail is in final program.
				
//getInputStream() : an input stream that reads from this open connection.
/// ↓↓↓↓ Returns an input stream that reads from this open connection
				InputStream is = conn.getInputStream();
				
/********************************************************************************************/					

				
/*************************** Step3. output file to the Dir. ************************************/					
// ↓↓↓↓ available() : Returns an estimate of the number of bytes that can be read 
				System.out.println(is.available() + " bytes.");
				
// ↓↓↓↓ Creates a file output stream to write to the file represented by the specified File object.
				FileOutputStream fos = new FileOutputStream(file);
									// filename : C:\\Pictures\\natalie_portman_1.jpg
				System.out.println("Wallpaper: " + filename + " kick-off!");

				// 自訂緩衝區大小(分段讀寫操作)
				int length = 0;
				byte[] b = new byte[4096];   //4kb
//use int read(byte[] buf) //read 4096 byte data and put in buffer
				while ((length = is.read(b)) != -1) {  
					
					// b: 代表要輸出的byte陣列 (資料都放在裡面了)
					// 0: 代表從這個陣列的第一個元素開始輸出 (索引值)
					// length: 代表要輸出的資料量
					fos.write(b, 0, length);  
					fos.flush();
				}
				
				fos.close();
				is.close();
				System.out.println(filename + " Done!");

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

//URLConnection conn = myURL.openConnection();
//HttpURLConnection conn1 = (HttpURLConnection)conn;
//     ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ shorten to below statement
//HttpURLConnection conn = (HttpURLConnection) myURL.openConnection();
