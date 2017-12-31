package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class DecryptedMessage {

	static String morseA = " #- ";
	static String morseE = " # ";
	static String morseI = " ## ";
	static String morseO = " --- ";
	static String morseU = " ##- ";
	
	public static void main(String[] args) {
		String encryptedMessage = "";
	JFileChooser choose = new JFileChooser();
	int hello = choose.showOpenDialog(null);
	if (hello == JFileChooser.APPROVE_OPTION) {
	encryptedMessage = choose.getSelectedFile().getAbsolutePath();
	//System.out.println(encryptedMessage);
		
		
	}
	try {
		FileReader reader = new FileReader(encryptedMessage);
		int c = reader.read();
		String totalText = "";
		while(c != -1){
			String characters = Character.toString((char)c);
			//System.out.println(characters);
			c = reader.read();
			totalText += characters;
		
		}
		System.out.println(totalText);
	
	if(totalText.contains(morseA))	{
	totalText = totalText.replaceAll(morseA, "a");
	}
	if(totalText.contains(morseE)) {
	totalText = totalText.replaceAll(morseE, "e");
	}
	if(totalText.contains(morseI)) {
	totalText = totalText.replaceAll(morseI, "i");
	}
	if(totalText.contains(morseO)) {
	totalText = totalText.replaceAll(morseO, "o");
	}
	if(totalText.contains(morseU)) {
	totalText = totalText.replaceAll(morseU, "u");
	}
	
			System.out.println(totalText);
	
		reader.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

	
	
	
	
	
	}
}
