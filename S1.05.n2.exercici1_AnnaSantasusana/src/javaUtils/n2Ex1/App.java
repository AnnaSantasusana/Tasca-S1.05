package javaUtils.n2Ex1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

public class App {

	public static void main(String[] args) {
		
		ArrayList<String> arrayFiles = new ArrayList<>();
		Properties properties = new Properties();
		
		try {
			properties.load(new FileInputStream(new File("/Users/annasantasusanaberch/Eclipse/eclipse-workspace/Curs_pont/S1.05.n2.exercici1_AnnaSantasusana/src/javaUtils/n2Ex1/configuration.properties.txt")));
		}catch (Exception e) {
			e.printStackTrace();
		} 
		
		String path = properties.getProperty("path");
		String txtFilePath = properties.getProperty("txtFilePath");
		String txtFileName = properties.getProperty("txtFileName");
		
		sortDirectory(path, arrayFiles);
		editFile(txtFilePath, txtFileName, arrayFiles);
		
	}
	
	public static void sortDirectory(String path, ArrayList<String> arrayFiles) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		File directory = new File(path);
		File[] fileNames = directory.listFiles();
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
	
	public static void editFile(String txtFilePath, String txtFileName, ArrayList<String> arrayFiles) {
		
		try {
			File result = new File(txtFilePath + txtFileName);
			if (!result.exists()) {
				result.createNewFile();
				System.out.println("File created");
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
