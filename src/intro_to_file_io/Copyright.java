package intro_to_file_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Copyright {

	
	public static void main(String[] args) {
		String copyrightedFile = "";
	JFileChooser choose = new JFileChooser();
	int a = choose.showOpenDialog(null);
	if (a == JFileChooser.APPROVE_OPTION) {
	copyrightedFile = choose.getSelectedFile().getAbsolutePath();
System.out.println(copyrightedFile);
	}
	
	try {
		FileWriter fileWriter = new FileWriter(copyrightedFile, true);
		
		/*
		NOTE: To append to a file that already exists, add true as a second parameter when calling the
		      FileWriter constructor.
		      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
		*/
		
		fileWriter.write("\nCopyrighted!");
			
		fileWriter.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
}	
	

