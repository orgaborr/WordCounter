package com.orgabor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<String> words = new ArrayList<>();
		
		try(Scanner sc = new Scanner(new BufferedReader(new FileReader("some-text.txt")))) { // try () is try-with-resources, also closes scanner
			sc.useDelimiter(" "); // decides at what character should the text be divided
			while(sc.hasNext()) {
				words.add(sc.next());
			}
		}
		
		for(String word : words) {
			System.out.print(word + " ");
		}
		
		System.out.println("\nNumber of words in text: " + words.size());
		
		
		// prints integers found in text
		for(String word : words) {
			char[] temp = word.toCharArray();
			for(char c : temp) {
				String s = Character.toString(c);
				try {
					System.out.println("Integer found in text: " + Integer.parseInt(s));
				} catch(NumberFormatException e) {
					continue;
				}
			}
			
		}
		
//		String forReadme = "This is my first program using scanner/file reader to take the words from a text file, " +
//				"save them in an array list, then print the text and write out the number of words in it." +
//				"\nThis readme was also written from the program.";
//		
//		try(FileWriter fw = new FileWriter("README.md")) {
//			fw.write(forReadme);
//		}
		
	}

}
