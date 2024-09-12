package com.selenium.ApachePOI;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CSVfileReading {

	public static void main(String[] args) throws CsvValidationException, IOException {
		
		CSVReader csvReader = new CSVReader(new FileReader(""));
		String[] str;
		while((str=csvReader.readNext())!=null) {
			for(String s:str) {
				System.out.println();
			}
		}

	}

}
