import java.io.File;
import java.io.IOException;

public class ExtractFromZipAfterRestAppTest {

	public static void main(String[] args) throws IOException {
		
		String targetZip = "C:\\Dev\\RDDS\\RDDS_2019_CXE_MASTER_do_not_touch\\More,_in_addition_to_RDDS_JB_pdfs,_xmls,_zips\\RDTE_J_Books,_pdfs,_xmls,_zips\\Army_JB\\P40_Selections_Individual_repackaged.zip";
		String targetDir = targetZip.substring(0,targetZip.lastIndexOf(File.separator));
		ExtractFromZipAfterRestApp.extractPDFs(targetZip, targetDir);

	}

}
