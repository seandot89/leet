package com.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void DownloadWebPage(String webpage) {
		
		try {
			URL url = new URL(webpage);
			BufferedReader readr = new BufferedReader(new InputStreamReader(url.openStream()));
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("Download.html"));
			
			String line;
			while((line = readr.readLine()) != null) {
				writer.write(line);
			}
			
			readr.close();
			writer.close();
			System.out.println("Successfully Downloaded.");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		String url = "https://sso.secure.fedex.com/pex/eaidetail.php?appid=6428&type=ALL";
		DownloadWebPage(url);
	}
}
