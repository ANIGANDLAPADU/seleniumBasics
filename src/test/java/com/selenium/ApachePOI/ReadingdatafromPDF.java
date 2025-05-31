package com.selenium.ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadingdatafromPDF {

	public static void main(String[] args) throws IOException {

		FileInputStream fileInputStream = new FileInputStream(
				"D:\\projects\\seleniumcore\\testdata\\Postman_ResponseValidations.pdf");
		PDDocument document1 = new PDDocument();
		document1 = document1.load(fileInputStream);
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		String data = pdfTextStripper.getText(document1);
		System.out.println(data);

	}

}
