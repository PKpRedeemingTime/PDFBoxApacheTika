import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class ExtractFromPDF {

	public static void main(String[] args) throws Exception, IOException {
		
		File file = new File("C:\\Dev\\RDDS\\RDDS_2019_CXE_MASTER_do_not_touch\\More,_in_addition_to_RDDS_JB_pdfs,_xmls,_zips\\RDTE_J_Books,_pdfs,_xmls,_zips\\Army_JB\\Army_JBook_PDFs.pdf");
		PDDocument doc = PDDocument.load(file);
		System.out.println(doc.getNumberOfPages());

	}

}
