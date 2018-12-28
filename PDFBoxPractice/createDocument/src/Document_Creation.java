import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.text.PDFTextStripper;

public class Document_Creation {

	public static void main(String[] args) throws IOException {
		
		//		Creating a New PDF
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_creating_a_pdf_document.htm
//		PDDocument document = new PDDocument();
//		document.save("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		System.out.println("PDF Created");
//		document.close();
		
		//		Adding Page(s) to a PDF
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_adding_pages.htm
//		PDDocument document = new PDDocument();
//		for (int i=0; i<10; i++) {
//			PDPage blankPage = new PDPage();
//			document.addPage(blankPage);
//		}
//		document.save("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		System.out.println("PDF Created");
//		document.close();
		
		//		Loading a Document
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_loading_a_document.htm
//		String home = System.getProperty("user.home");
//		File file = new File(home+"/Downloads/Testing.pdf");
//		PDDocument document = PDDocument.load(file);
//		System.out.println("Document loaded");
//		document.addPage(new PDPage());
//		document.save("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		document.close();
		
		//		Removing Pages From An Existing Document
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_removing_pages.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		PDDocument document = PDDocument.load(file);
//		int nmbrOfPages = document.getNumberOfPages();
//		System.out.println(nmbrOfPages);
//		document.removePage(26);
//		System.out.println("Page Removed");
//		document.save("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		document.close();
		
		//		Setting Document Properties
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_document_properties.htm
//		PDDocument document = new PDDocument();
//		PDPage blankPage = new PDPage();
//		document.addPage(blankPage);
//		PDDocumentInformation pdd = document.getDocumentInformation();
//		pdd.setAuthor("Patrick Kilpatrick");
//		pdd.setTitle("PDFBox Practice");
//		pdd.setCreator("Me");
//		pdd.setSubject("PDFBox");
//		Calendar date = new GregorianCalendar();
//		date.set(2018, 12, 27);
//		pdd.setCreationDate(date);
//		date.set(2018, 12, 28);
//		pdd.setModificationDate(date);
//		pdd.setKeywords("sample, first example, my pdf");
//		document.save("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		System.out.println("properties saved");
//		document.close();
		
		//		Getting Document Properties
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_document_properties.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		PDDocument document = PDDocument.load(file);
//		PDDocumentInformation pdd = document.getDocumentInformation();
//		System.out.println("The author of the document is " + pdd.getAuthor());
//		System.out.println("The title of the document is " + pdd.getTitle());
//		System.out.println("The creator of the document is " + pdd.getCreator());
//		System.out.println("The subject of the document is " + pdd.getSubject());
//		System.out.println("The creation date of the document is " + pdd.getCreationDate());
//		System.out.println("The modification date of the document is " + pdd.getModificationDate());
//		System.out.println("The keyword(s) of the document is(are) " + pdd.getKeywords());
//		document.close();
		
		//		Adding Text
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_adding_text.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		PDDocument doc = PDDocument.load(file);
//		PDPage page = doc.getPage(0);
//		PDPageContentStream contentStream = new PDPageContentStream(doc, page);
//		contentStream.beginText();
//		contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
//		contentStream.newLineAtOffset(25, 300);
//		String text = "Did this move higher on the page?";
//		contentStream.showText(text);
//		contentStream.endText();
//		System.out.println("Content added");
//		contentStream.close();
//		doc.save("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		doc.close();
		
		//		Adding multiple lines
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_adding_multiple_lines.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		PDDocument doc = PDDocument.load(file);
//		PDPage page = doc.getPage(0);
//		PDPageContentStream contentStream = new PDPageContentStream(doc, page);
//		contentStream.beginText();
//		contentStream.setFont(PDType1Font.TIMES_ROMAN, 16);
//		contentStream.setLeading(14.5f);
//		contentStream.newLineAtOffset(25, 725);
//		String text1 = "This is an example of adding text to a page in the pdf document. We can add as many lines";
//		String text2 = "as we want like this using the ShowText()  method of the ContentStream class";
//		contentStream.showText(text1);
//		contentStream.newLine();
//		contentStream.showText(text2);
//		contentStream.endText();
//		System.out.println("Content added");
//		contentStream.close();
//		doc.save("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		doc.close();
		
		//		Reading text
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_reading_text.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		PDDocument doc = PDDocument.load(file);
//		PDFTextStripper pdfStripper = new PDFTextStripper();
//		String text = pdfStripper.getText(doc);
//		System.out.println(text);
//		doc.close();
		
		//		Inserting an image
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_inserting_image.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		PDDocument doc = PDDocument.load(file);
//		PDPage page = doc.getPage(1);
//		PDImageXObject pdImage = PDImageXObject.createFromFile("Z:/My Documents/My Pictures/news-of-the-weird.jpg", doc);
//		PDPageContentStream contents = new PDPageContentStream(doc, page);
//		contents.drawImage(pdImage, 70, 250);
//		System.out.println("Image inserted");
//		contents.close();
//		doc.save("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		doc.close();
		
		//		Encrypting a PDF doc
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_encrypting_a_pdf_document.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		PDDocument doc = PDDocument.load(file);
//		AccessPermission ap = new AccessPermission();
//		StandardProtectionPolicy spp = new StandardProtectionPolicy("1234","1234",ap);
//		spp.setEncryptionKeyLength(128);
//		spp.setPermissions(ap);
//		doc.protect(spp);
//		System.out.println("Document encrypted");
//		doc.save("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		doc.close();
		
		//		Adding JavaScript to a PDF
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_javascript_in_pdf_document.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		PDDocument doc = PDDocument.load(file);
//		String javaScript = "app.alert( {cMsg: 'this is an example', nIcon: 3," + " nType: 0,cTitle: 'PDFBox Javascript example' } );";       
//		PDActionJavaScript PDAjavascript = new PDActionJavaScript(javaScript);
//		doc.getDocumentCatalog().setOpenAction(PDAjavascript);
//		doc.save("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		System.out.println("Data added to the given PDF");
//		doc.close();
		
		//		Splitting a PDF doc
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_splitting_a_pdf_document.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		PDDocument doc = PDDocument.load(file);
//		Splitter splitter = new Splitter();
//		List<PDDocument> Pages = splitter.split(doc);
//		Iterator<PDDocument> iterator = Pages.listIterator();
//		int i = 1;
//		while(iterator.hasNext()) {
//			PDDocument pd = iterator.next();
//			pd.save("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc" + i++ + ".pdf");
//		}
//		System.out.println("Multiple documents saved");
//		doc.close();
		
		//		Merging multiple PDF documents
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_merging_multiple_pdf_documents.htm
//		File file1 = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc1.pdf");
//		PDDocument doc1 = PDDocument.load(file1);
//		File file2 = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc2.pdf");
//		PDDocument doc2 = PDDocument.load(file2);
//		PDFMergerUtility PDFmerger = new PDFMergerUtility();
//		PDFmerger.setDestinationFileName("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/merged.pdf");
//		PDFmerger.addSource(file1);
//	    PDFmerger.addSource(file2);
//	    PDFmerger.mergeDocuments();
//	    System.out.println("Documents merged");
//	    doc1.close();
//	    doc2.close();
		
		//		Extracting an image of the page
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_extracting_image.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		PDDocument doc = PDDocument.load(file);
//		PDFRenderer renderer = new PDFRenderer(doc);
//		BufferedImage image = renderer.renderImage(0);
//		ImageIO.write(image, "JPEG", new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/newImage.jpg"));
//		System.out.println("Image created");
//		doc.close();
		
		//		Adding rectangles
		//		https://www.tutorialspoint.com/pdfbox/pdfbox_adding_rectangles.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		PDDocument doc = PDDocument.load(file);
//		PDPage page = doc.getPage(0);
//		PDPageContentStream contentStream = new PDPageContentStream(doc, page);
//		contentStream.setNonStrokingColor(Color.DARK_GRAY);
//		contentStream.addRect(200, 650, 100, 100);
//		contentStream.fill();
//		System.out.println("rectangle added");
//		contentStream.close();
//		doc.save("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		doc.close();
	
	}

}
