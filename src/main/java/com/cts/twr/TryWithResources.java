package com.cts.twr;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class TryWithResources {
	
	public static void main(String[] args) {
		
		String fileLocation = "C:\\Users\\2232857\\Training\\Apple\\temp\\";
		
		try(FileOutputStream fos = new FileOutputStream(fileLocation+"output.txt");
				BufferedReader br = new BufferedReader(new FileReader(fileLocation+"a.txt"))) {
			
			String text;

			while ((text = br.readLine()) != null) {

				byte arr[] = text.getBytes();
				fos.write(arr);
			}

			System.out.println("File content copied to another file.");
		}
		catch (Exception e) {
			System.out.println(e);
		}

		// Display message for successful execution
		System.out.println("Resource are closed and message has been written into the a.txt");
		
	}

}
