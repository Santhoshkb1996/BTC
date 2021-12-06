package fileproblem;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingLines {

	public static void main(String[] args) {
		
		File file=new File("output.txt");
		
		try {
			FileReader inputStream = new FileReader(file);
			
			Scanner scan=new Scanner(inputStream);
			
			String str="";
			
			while(scan.hasNext()) {
				str=scan.nextLine();
				System.out.println(str);
			}
			
			
			
		}
	catch (Exception e) {
		// TODO: handle exception
	}

	}

}