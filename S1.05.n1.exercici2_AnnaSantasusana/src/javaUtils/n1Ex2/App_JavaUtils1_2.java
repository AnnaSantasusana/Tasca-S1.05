package javaUtils.n1Ex2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class App_JavaUtils1_2 {

	public static void main(String[] args) {
		
		if (args == null || args.length != 1) {
			System.out.println("The specified path doesn't exist");
		} else {
			String parameterPath = args[0];
			sortDirectory(parameterPath);
		}
	}
	
	public static void sortDirectory(String parameterPath) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		File path = new File(parameterPath);
		File[] fileNames = path.listFiles();
		Arrays.sort(fileNames);	
			
		for (File file : fileNames) {
				
			if (file.isDirectory()) {
				System.out.println(file.getName() + " (D) - Last modified: " + dateFormat.format(file.lastModified()));
				sortDirectory(file.getAbsolutePath());
			} else {
				System.out.println("   |---------> " + file.getName() + " (F) - Last modified: " + dateFormat.format(file.lastModified()));
			}
		}
	}
}
