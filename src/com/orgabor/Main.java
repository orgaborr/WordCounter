package com.orgabor;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<String> words = new ArrayList<>();
		
		try(Scanner sc = new Scanner(new FileReader("some-text.txt"))) {
			sc.useDelimiter(" ");
			while(sc.hasNext()) {
				words.add(sc.next());
			}
		}
		
		for (String word : words) {
			System.out.print(word + " ");
		}
		
		System.out.println("\nNumber of words in text: " + words.size());
		
	}

}
