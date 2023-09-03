package com.selenium.ApachePOI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writingdatanotepad {

	public static void main(String[] args) throws IOException {
		File file = new File(System.getProperty("user.dir")+"\\testdata\\file.txt");
		FileWriter writer = new FileWriter(file);
		BufferedWriter writering = new BufferedWriter(writer);
		writering.write("Hello Hai");
		writering.newLine();
		writering.write("Seshu Babu");
		writering.close();

	}

}
