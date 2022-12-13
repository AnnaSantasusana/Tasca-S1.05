package javaUtils.n1Ex4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		if (args == null || args.length != 1) {
			System.out.println("The specified path doesn't exist");
		} else {
			String parameterPath = args[0];
			readFile(parameterPath);
		}
	}
	
	public static void readFile(String parameterPath) {
		String line;
		ArrayList<String> arrayList = new ArrayList<>();
		
		try {
			FileReader fr = new FileReader(parameterPath);
			BufferedReader br = new BufferedReader(fr);
			while((line = br.readLine()) !=null) {
				arrayList.add(line);
			}
			String[] content = arrayList.toArray(new String[arrayList.size()]);
			for (String string : content) {
				System.out.println(string);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Failure to read the file");
			e.printStackTrace();
		}
	}

}
