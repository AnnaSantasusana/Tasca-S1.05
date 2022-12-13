package javaUtils.n1Ex3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		ArrayList<String> arrayFiles = new ArrayList<>();
		
		if (args == null || args.length != 1) {
			System.out.println("The specified path doesn't exist");
		} else {
			String parameterPath = args[0];
			sortDirectory(parameterPath, arrayFiles);
			editFile(arrayFiles);
		}
	}
	
	public static void sortDirectory(String parameterPath, ArrayList<String> arrayFiles) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		File path = new File(parameterPath);
		File[] fileNames = path.listFiles();
		Arrays.sort(fileNames);	
			
		for (File file : fileNames) {
				
			if (file.isDirectory()) {
				arrayFiles.add(file.getName() + " (D) - Last modified: " + dateFormat.format(file.lastModified()));
				sortDirectory(file.getAbsolutePath(), arrayFiles);
			} else {
				arrayFiles.add("   |---------> " + file.getName() + " (F) - Last modified: " + dateFormat.format(file.lastModified()));
			}
		}
	}
	
	public static void editFile(ArrayList<String> arrayFiles) {
		
		try {
			File result = new File("/Users/annasantasusanaberch/Eclipse/eclipse-workspace/Curs_pont/S1.05.n1.exercici3_AnnaSantasusana/src/javaUtils/result.txt");
			if (!result.exists()) {
				result.createNewFile();
				System.out.println("File created: " + result.getName());
			}
			FileWriter fw = new FileWriter(result);
			BufferedWriter bw = new BufferedWriter(fw);
			for (String string : arrayFiles) {
				fw.write(string + "\n");
			}
			bw.close();
			System.out.println("File edited");
		} catch (Exception e) {
			System.out.println("An error ocurred");
			e.printStackTrace();
		}
	}
}
