import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.apache.tika.language.LanguageIdentifier;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.asm.ClassParser;
import org.apache.tika.parser.html.HtmlParser;
import org.apache.tika.parser.jpeg.JpegParser;
import org.apache.tika.parser.microsoft.ooxml.OOXMLParser;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.apache.tika.parser.mp4.MP4Parser;
import org.apache.tika.parser.odf.OpenDocumentParser;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.parser.pkg.PackageParser;
import org.apache.tika.parser.txt.TXTParser;
import org.apache.tika.parser.xml.XMLParser;
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
		
		//		Extracting PDF
		//		https://www.tutorialspoint.com/tika/tika_extracting_pdf.htm
		File file = new File("C:\\Dev\\RDDS\\RDDS_2019_CXE_MASTER_do_not_touch\\More,_in_addition_to_RDDS_JB_pdfs,_xmls,_zips\\RDTE_J_Books,_pdfs,_xmls,_zips\\Army_JB\\Army_JBook_PDFs.pdf");
		StringWriter any = new StringWriter();
		PDFParser parser = new PDFParser();
		BodyContentHandler handler = new BodyContentHandler(any);
		Metadata metadata = new Metadata();
		FileInputStream inputstream = new FileInputStream(file);
		ParseContext context = new ParseContext();
		parser.parse(inputstream, handler, metadata, context);
//		System.out.println("Contents of the PDF: " + handler.toString());
//		System.out.println("Metadata of the PDF:");
//		String[] metadataNames = metadata.names();
//		for(String name : metadataNames) {
//			System.out.println(name + " : " + metadata.get(name));
//		}
		System.out.println(metadata.get(metadata.RESOURCE_NAME_KEY));
		
		//		Extracting ODF
		//		https://www.tutorialspoint.com/tika/tika_extracting_odf.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/my_doc.pdf");
//		OpenDocumentParser parser = new OpenDocumentParser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(file);
//		ParseContext context = new ParseContext();
//		parser.parse(inputstream, handler, metadata, context);
//		System.out.println("Contents of the document:" + handler.toString());
//		System.out.println("Metadata of the document:");
//		String[] metadataNames = metadata.names();  
//		for(String name : metadataNames) {		        
//		   System.out.println(name + " :  " + metadata.get(name)); 
//		}
		
		//		Extracting MS-Office Files
		//		https://www.tutorialspoint.com/tika/tika_extracting_ms_office_files.htm
//		File file = new File("C:/Dev/PDFBoxAndApacheTika/PDFBoxPractice/PDFs/WordTest.docx");
//		OOXMLParser parser = new OOXMLParser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(file);
//		ParseContext context = new ParseContext();
//		parser.parse(inputstream, handler, metadata, context);
//		System.out.println("Contents of the document: " + handler.toString());
//	    System.out.println("Metadata of the document:");
//	    String[] metadataNames = metadata.names();
//	    for(String name : metadataNames) {
//	       System.out.println(name + ": " + metadata.get(name));
//	    }
		
		//		Extracting Text Document
		//		https://www.tutorialspoint.com/tika/tika_extracting_text_document.htm
//		File file = new File("C:/Dev/tapestryPractice/tapestryProject.txt");
//		TXTParser parser = new TXTParser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(file);
//		ParseContext context = new ParseContext();
//		parser.parse(inputstream, handler, metadata, context);
//		System.out.println("Contents of the document: " + handler.toString());
//	    System.out.println("Metadata of the document:");
//	    String[] metadataNames = metadata.names();
//	    for(String name : metadataNames) {
//	       System.out.println(name + ": " + metadata.get(name));
//	    }
		
		//		Extracting HTML Document
		//		https://www.tutorialspoint.com/tika/tika_extracting_html_document.htm
//		File file = new File("C:/Dev/cbes-repo/CXE/r2-frontend/src/main/webapp/index.html");
//		HtmlParser parser = new HtmlParser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(file);
//		ParseContext context = new ParseContext();
//		parser.parse(inputstream, handler, metadata, context);
//		System.out.println("Contents of the document: " + handler.toString());
//	    System.out.println("Metadata of the document:");
//	    String[] metadataNames = metadata.names();
//	    for(String name : metadataNames) {
//	       System.out.println(name + ": " + metadata.get(name));
//	    }
	    
	    //		Extracting XML file
	    //		https://www.tutorialspoint.com/tika/tika_extracting_xml_document.htm
//	    File file = new File("C:/Users/PKilpatr/Downloads/5491.xml");
//		XMLParser parser = new XMLParser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(file);
//		ParseContext context = new ParseContext();
//		parser.parse(inputstream, handler, metadata, context);
//		System.out.println("Contents of the document: " + handler.toString());
//	    System.out.println("Metadata of the document:");
//	    String[] metadataNames = metadata.names();
//	    for(String name : metadataNames) {
//	       System.out.println(name + ": " + metadata.get(name));
//	    }
		
		//		Extracting .class file
		//		https://www.tutorialspoint.com/tika/tika_extracting_class_file.htm
//		File file = new File("C:/Dev/tapestryPractice/dojosAndNinjasOneToMany/target/classes/com/patrickKilpatrick/dojosAndNinjasOneToMany/components/layout.class");
//		ClassParser parser = new ClassParser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(file);
//		ParseContext context = new ParseContext();
//		parser.parse(inputstream, handler, metadata, context);
//		System.out.println("Contents of the document: " + handler.toString());
//	    System.out.println("Metadata of the document:");
//	    String[] metadataNames = metadata.names();
//	    for(String name : metadataNames) {
//	       System.out.println(name + ": " + metadata.get(name));
//	    }
		
		//		Extracting a JAR file
		//		https://www.tutorialspoint.com/tika/tika_extracting_jar_file.htm
//		File file = new File("C:/Users/PKilpatr/.m2/repository/ant/ant/1.6.5/ant-1.6.5.jar");
//		PackageParser parser = new PackageParser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(file);
//		ParseContext context = new ParseContext();
//		parser.parse(inputstream, handler, metadata, context);
//		System.out.println("Contents of the document: " + handler.toString());
//	    System.out.println("Metadata of the document:");
//	    String[] metadataNames = metadata.names();
//	    for(String name : metadataNames) {
//	       System.out.println(name + ": " + metadata.get(name));
//	    }
		
		//		Extracting an image
		//		https://www.tutorialspoint.com/tika/tika_extracting_image_file.htm
//		File file = new File("C:/Users/PKilpatr/.m2/repository/ant/ant/1.6.5/ant-1.6.5.jar");
//		JpegParser parser = new JpegParser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(file);
//		ParseContext context = new ParseContext();
//		parser.parse(inputstream, handler, metadata, context);
//		System.out.println("Contents of the document: " + handler.toString());
//	    System.out.println("Metadata of the document:");
//	    String[] metadataNames = metadata.names();
//	    for(String name : metadataNames) {
//	       System.out.println(name + ": " + metadata.get(name));
//	    }
		
		//		Extracting MP4 files
		//		https://www.tutorialspoint.com/tika/tika_extracting_mp4_files.htm
//		File file = new File("C:/Users/PKilpatr/.m2/repository/ant/ant/1.6.5/ant-1.6.5.jar");
//		MP4Parser parser = new MP4Parser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(file);
//		ParseContext context = new ParseContext();
//		parser.parse(inputstream, handler, metadata, context);
//		System.out.println("Contents of the document: " + handler.toString());
//	    System.out.println("Metadata of the document:");
//	    String[] metadataNames = metadata.names();
//	    for(String name : metadataNames) {
//	       System.out.println(name + ": " + metadata.get(name));
//	    }
		
		//		Extracting MP3 files
		//		https://www.tutorialspoint.com/tika/tika_extracting_mp3_files.htm
//		File file = new File("C:/Users/PKilpatr/.m2/repository/ant/ant/1.6.5/ant-1.6.5.jar");
//		Mp3Parser parser = new Mp3Parser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(file);
//		ParseContext context = new ParseContext();
//		parser.parse(inputstream, handler, metadata, context);
//		System.out.println("Contents of the document: " + handler.toString());
//	    System.out.println("Metadata of the document:");
//	    String[] metadataNames = metadata.names();
//	    for(String name : metadataNames) {
//	       System.out.println(name + ": " + metadata.get(name));
//	    }
		
	}
	
	

}
