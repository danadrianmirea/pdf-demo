package adi;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class StringToPDF {
    public static void main(String[] args) {
        // Sample string to be written to the PDF
        String sampleText = "This is a sample string to be written to the PDF file.";

        // Create a document object
        Document document = new Document();

        try {
            // Create a PdfWriter instance, specifying the output file
            PdfWriter.getInstance(document, new FileOutputStream("output.pdf"));

            // Open the document for writing
            document.open();

            // Add the sample text to the document
            document.add(new Paragraph(sampleText));

            System.out.println("PDF created successfully!");

        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } finally {
            // Close the document
            document.close();
        }
    }
}
