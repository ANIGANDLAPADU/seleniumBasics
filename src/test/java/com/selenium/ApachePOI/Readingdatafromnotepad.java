package com.selenium.ApachePOI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Readingdatafromnotepad {

	public static void main(String[] args) throws IOException {
		File file = new File(System.getProperty("user.dir") + "\\testdata\\file.txt");
		FileReader filer = new FileReader(file);
		BufferedReader reader = new BufferedReader(filer);
		String str = "";
		while ((str = reader.readLine()) != null) {
			System.out.println(str);
		}
		reader.close();

	}

}
