/**
 * 
 */
package com.ss.basics.searchdir;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author Matthew Hader
 *
 */
public class SearchDirectory {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file path: ");
		String dir = sc.next();
		
		try (Stream<Path> paths =Files.walk(Paths.get(dir))) {
			paths.filter(Files::isDirectory)
				 .forEach(System.out::println);
		}
		catch (Exception e) {
			
		}
	}
}
