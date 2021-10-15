
import java.io.IOException;


public class ExcutingBatchFile {

	public static void main(String[] args) throws IOException {
//		String command[];
//		Runtime rs = Runtime.getRuntime();
//		rs.exec("C:\\xampp\\mysql\\bin\\mysqlbackup.bat");
		String os =  System.getProperty("os.name");
		
		System.out.println("Os Name "+os);
	}

}
