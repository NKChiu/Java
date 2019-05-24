package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetOpenData {
	
	private static final String MY_URL = "http://data.tycg.gov.tw/api/v1/rest/datastore/a1b4714b-3b75-4ff8-a8f2-cc377e4eaa0f?format=json";
	
	public static void main(String[] args) throws IOException {
		URL myURL = new URL(MY_URL);
		HttpURLConnection con = (HttpURLConnection) myURL.openConnection();
		con.setRequestMethod("GET");
		InputStream is = con.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
		isr.close();
		is.close();
	}

}
