package fileproblem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;

public class ReadingFileUsingNio {

	public static void main(String[] args) {
		
		try {
			Files.lines(Paths.get("output.txt")).filter(line->line.length()>20).map(String::toUpperCase).forEach(System.out::println);
			String str= "Hello World";
			Files.write(Paths.get("hello.txt"),str.getBytes());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}