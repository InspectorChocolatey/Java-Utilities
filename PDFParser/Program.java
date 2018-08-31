/**
 * radixcode.com/pdfbox-example-code-how-to-extract-text-from-pdf-file-with-java
 * https://www.youtube.com/watch?v=w2SuxrURiQY
 * 
 */
package com.nicholasjacquet;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String filepath = "C:/Users/NicholasJ/Desktop/pdfCode/NicholasJacquet.pdf";
		try { printfPDF(filepath);} catch (IOException e) {	e.printStackTrace();	}
	}

	public static void printfPDF(String filepath) throws IOException {
		PDFManager pdfManager = new PDFManager();
		pdfManager.setFilePath(filepath);
	    System.out.println(pdfManager.ToText());
	}

}
