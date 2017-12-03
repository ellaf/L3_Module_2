package intro_to_file_io;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

public class EncryptedMessage {

File file = new File("file.txt");

public static void main(String[] args) {
	
	String text = JOptionPane.showInputDialog(null, "What do you want to put in the file?");
	
	try {

		FileWriter orange = new FileWriter("src/intro_to_file_io/file.txt");
	
		orange.write(text);
			
		orange.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
for (int i = 0; i < text.length(); i++) {
	
	char last = text.charAt(text.length() - text.length());
	char first = text.charAt(0);
	
}


	
	System.out.println(text.length());
	System.out.println(text.charAt(text.length() - 1));
	System.out.println(text.charAt(0));
	
	
	
	
}
	
	

	
	
	
}
