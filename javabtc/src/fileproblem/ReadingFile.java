package fileproblem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) {
		
		File file=new File("myfile.txt");
		
		try {
			FileReader inputStream = new FileReader(file);
			
			int ch;
			
			while((ch=inputStream.read()) != -1) {
				System.out.print((char)ch);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
