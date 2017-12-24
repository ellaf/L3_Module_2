package intro_to_file_io;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.xml.ws.handler.MessageContext;

public class EncryptedMessage {

File file = new File("encryption.txt");
static String morseA = " *- ";
static String morseE = " * ";
static String morseI = " ** ";
static String morseO = " --- ";
static String morseU = " **- ";

public static void main(String[] args) {
	
	String text = JOptionPane.showInputDialog(null, "What do you want to put in the file?");

	char lastLetter = text.charAt(text.length() - text.length());
	char firstLetter = text.charAt(0);
	
	//String change1 = text.replaceAll("a", "*");
	//String change2 = change1.replaceAll("e", "$");
	String change1 = text.replaceAll("a", morseA);
	//System.out.println(change1);
	String change2 = change1.replaceAll("e", morseE);
	//System.out.println(change2);
	String change3 = change2.replaceAll("i", morseI);
	//System.out.println(change3);
	String change4 = change3.replaceAll("o", morseO);
	//System.out.println(change4);
	String change5 = change4.replaceAll("u", morseU);
	System.out.println(change5);
	String newText = change5;
	
	
	try {

		FileWriter orange = new FileWriter("src/intro_to_file_io/encryption.txt");
	
		orange.write(newText);
			
		orange.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
for (int i = 0; i < text.length(); i++) {
	
	char last = text.charAt(text.length() - text.length());
	char first = text.charAt(0);
	
}



	
	
	
	
	
}
	
	

	
	
	
}
