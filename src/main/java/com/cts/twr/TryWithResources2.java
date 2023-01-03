package com.cts.twr;

import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.TreeSet;

public class TryWithResources2 {
	
	public static void main(String[] args) {
		
		String fileLocation = "C:\\Users\\2232857\\Training\\Apple\\temp\\";
		
		try(FileOutputStream fileOutputStream = 
				new FileOutputStream(fileLocation + "trywithresources2.txt")) {

		// SortedSet
		TreeSet<Integer> primeNumbers = new TreeSet<Integer>();

		primeNumbers.add(3);
		primeNumbers.add(11);
		primeNumbers.add(71);
		primeNumbers.add(23);
		primeNumbers.add(7);

		Iterator<Integer> it = primeNumbers.iterator();
		while (it.hasNext()) {
			String nextNumber = String.valueOf(it.next());
			System.out.println(nextNumber);
			byte byteArray[] = (nextNumber+"\n").getBytes(); // converting string into byte array
			fileOutputStream.write(byteArray);
		}
		System.out.println("Content written to file");
		} catch (Exception e) {
			System.out.println(e);
		} 
	}

}
