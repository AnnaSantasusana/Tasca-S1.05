package javaUtils.n1Ex1;

import java.io.File;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		if (args == null || args.length != 1) {
			System.out.println("The specified path doesn't exist");
		} else {
			String parameterPath = args[0];
			sortDirectory(parameterPath);
		}
		
	}
	
	public static void sortDirectory(String parameterPath) {
		
		File path = new File(parameterPath);
		
		String[] fileNames = path.list();
		Arrays.sort(fileNames);
		
		for (String fileName : fileNames) {
			System.out.println(fileName);
		}
		
	}

}
