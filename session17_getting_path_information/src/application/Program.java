package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getPath: " + path.getPath()); // File Name and Path
		System.out.println("getParent: " + path.getParent()); // Path Only
		System.out.println("getName: " + path.getName()); // File Name Only
		
		sc.close();
	}
}