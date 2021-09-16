/**
 * 
 */
package com.ss.basics.addtofile;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Matthew Hader
 *
 */
public class AppendToFile {

	public static void main(String[] args) throws IOException {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter file path: ");
		String filePath = read.readLine();
		
		try(FileWriter fw = new FileWriter(filePath, true)) {
			
			System.out.print("Enter text to append: ");
			String text = read.readLine();
			fw.write(text);
		}
		catch (Exception e) {
			
		}
	}
}
