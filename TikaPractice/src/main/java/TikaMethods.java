import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.apache.tika.language.LanguageIdentifier;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class TikaMethods {

	public static void main(String[] args) throws IOException, SAXException, TikaException{
		
		// 		Type Detection
		//		https://www.tutorialspoint.com/tika/tika_document_type_detection.htm
//		File file = new File("Z:/My documents/My Pictures/news-of-the-weird.jpg");
//		Tika tika = new Tika();
//		String filetype = tika.detect(file);
//		System.out.println(filetype);
		
		//		Content extraction
		//		https://www.tutorialspoint.com/tika/tika_content_extraction.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		Tika tika = new Tika();
//		String filecontent = tika.parseToString(file);
//		System.out.println("Extracted content: " + filecontent);
		
		//		Content extraction using the parser interface
		//		https://www.tutorialspoint.com/tika/tika_content_extraction.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		Parser parser = new AutoDetectParser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(file);
//		ParseContext context = new ParseContext();
//		parser.parse(inputstream, handler, metadata, context);
//		System.out.println("File content: " + handler.toString());
		
		// 		Extracting metadata using Parse method
		//		https://www.tutorialspoint.com/tika/tika_metadata_extraction.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		Parser parser = new AutoDetectParser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(file);
//		ParseContext context = new ParseContext();
//		parser.parse(inputstream, handler, metadata, context);
//		System.out.println("File content: " + handler.toString());
//		String[] metadataNames = metadata.names();
//		for(String name : metadataNames) {
//			System.out.println(name + ": " + metadata.get(name));
//		}
		
		//		Adding new metadata values
		//		https://www.tutorialspoint.com/tika/tika_metadata_extraction.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		Parser parser = new AutoDetectParser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(file);
//		ParseContext context = new ParseContext();
//		parser.parse(inputstream, handler, metadata, context);
//		System.out.println("metadata elements:" + Arrays.toString(metadata.names()));
//		metadata.add("Author", "Patrick Kilpatrick");
//		System.out.println("Metadata name/value pair is successfully added");
//		System.out.println("Here is the list of all the metadata elemenst after adding the new elements");
//		System.out.println(Arrays.toString(metadata.names()));
		
		//		Language detection
		//		https://www.tutorialspoint.com/tika/tika_language_detection.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		Parser parser = new AutoDetectParser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(file);
//		ParseContext context = new ParseContext();
//		parser.parse(inputstream, handler, metadata, context);
//		LanguageIdentifier object = new LanguageIdentifier(handler.toString());
//		System.out.println("Language name: " + object.getLanguage());
		
		//		

	}

}
