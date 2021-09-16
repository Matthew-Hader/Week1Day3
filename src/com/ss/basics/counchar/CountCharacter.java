/**
 * 
 */
package com.ss.basics.counchar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Matthew Hader
 *
 */
public class CountCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String line = "";
		int charCount = 0;
		
		System.out.print("Enter file path: ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String filePath = input.readLine();
		
		System.out.print("Enter character to find: ");
		char charToFind = (char)input.read();
		
		File file = new File(filePath);
		FileInputStream fileStream = new FileInputStream(file);
		BufferedReader read = new BufferedReader(new InputStreamReader(fileStream));
		
		while((line = read.readLine()) != null) {
			for(int i = 0; i < line.length(); i++) {
				if(line.charAt(i) == charToFind) {
					charCount++;
				}
			}
		}
		System.out.printf("Number of %c's in file: %d\n", charToFind, charCount);
	}

}
