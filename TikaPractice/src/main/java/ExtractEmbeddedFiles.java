import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.poi.hmef.Attachment;
import org.apache.poi.hmef.HMEFMessage;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.ParserDecorator;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.sax.EmbeddedContentHandler;
import org.apache.tika.extractor.EmbeddedDocumentExtractor;
import org.apache.tika.extractor.ParsingEmbeddedDocumentExtractor;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.xml.sax.SAXException;

public class ExtractEmbeddedFiles {

	public static void main(String[] args) throws Exception, IOException, SAXException, TikaException{
		
		File file = new File("C:\\Dev\\RDDS\\RDDS_2019_CXE_MASTER_do_not_touch\\More,_in_addition_to_RDDS_JB_pdfs,_xmls,_zips\\RDTE_J_Books,_pdfs,_xmls,_zips\\Army_JB\\Army_JBook_PDFs.pdf");
		String name = "C:\\Dev\\RDDS\\RDDS_2019_CXE_MASTER_do_not_touch\\More,_in_addition_to_RDDS_JB_pdfs,_xmls,_zips\\RDTE_J_Books,_pdfs,_xmls,_zips\\Army_JB\\Army_JBook_PDFs.pdf";
		boolean isPDF;
		isPDF = FilenameUtils.isExtension(name, "pdf");
		StringWriter any = new StringWriter();
		Detector detector = new DefaultDetector();
		Parser parser = new AutoDetectParser(detector);
		BodyContentHandler handler = new BodyContentHandler(any);
		Metadata metadata = new Metadata();
		FileInputStream inputstream = new FileInputStream(file);
		TikaInputStream tis = TikaInputStream.get(inputstream);
		ParseContext context = new ParseContext();
		parser.parse(tis, handler, metadata, context);
		EmbeddedDocumentExtractor ex = context.get(EmbeddedDocumentExtractor.class);
        EmbeddedDocumentExtractor embeddedExtractor;
        if (ex==null) {
           embeddedExtractor = new ParsingEmbeddedDocumentExtractor(context);
        } else {
           embeddedExtractor = ex;
        }
        if(embeddedExtractor.shouldParseEmbedded(metadata)) {
        	embeddedExtractor.parseEmbedded(tis, handler, metadata, false);
        }
        System.out.println(metadata.get(TikaCoreProperties.ORIGINAL_RESOURCE_NAME));
        
       
	}
   
}
