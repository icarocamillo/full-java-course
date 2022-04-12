package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		String path = "D:\\files_test_workspace\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // Use true in case of additional data inside the file
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}