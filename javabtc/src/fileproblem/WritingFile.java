package fileproblem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

	public static void main(String[] args) {
		
		File file=new File("output.txt");
		FileWriter outputFile=null;
		
		try {
			outputFile=new FileWriter(file,true);
			outputFile.write("\nThis is another Line");
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				outputFile.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}