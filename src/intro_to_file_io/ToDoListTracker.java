package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoListTracker implements ActionListener {

JFrame frame = new JFrame("To-Do List Tracker");
JPanel panel = new JPanel();
JButton addTask = new JButton("Add Task");
JButton removeTask = new JButton("Remove Task");
JButton saveButton = new JButton("Save");
JButton loadButton = new JButton("Load");
ArrayList<String> toDoList = new ArrayList<String>();

public static void main(String[] args) {

	

ToDoListTracker thisClass = new ToDoListTracker();
thisClass.setup();

}
void setup(){

frame.add(panel);
panel.add(addTask);
panel.add(removeTask);
panel.add(saveButton);
panel.add(loadButton);
frame.pack();
frame.setVisible(true);

addTask.addActionListener(this);
removeTask.addActionListener(this);
saveButton.addActionListener(this);
loadButton.addActionListener(this);

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if(e.getSource() == addTask) {
String newTask = JOptionPane.showInputDialog("What task would you like to add to your to-do list?");
toDoList.add(newTask);
System.out.println(toDoList);
}
if(e.getSource() == removeTask) {
String number = JOptionPane.showInputDialog("Here is your to-do list: \n" + toDoList + "\n" + "Type in the number of the chore as it appears on the list (1,2,3,etc) to remove.");
int banana = Integer.parseInt(number);
for (int i = 0; i < toDoList.size(); i++) {
int orange = i;
int apple = i+1;
if(apple == banana) {
toDoList.remove(orange);
}
System.out.println(toDoList);
}

}
if(e.getSource() == saveButton) {
	try {
	FileWriter fileWriter = new FileWriter("src/todolist.txt");
	for (int i = 0; i < toDoList.size(); i++) {
	fileWriter.write(toDoList.get(i) + "\n");
	}
	fileWriter.close();
} catch (IOException e1) {
	e1.printStackTrace();
}
}
if(e.getSource() == loadButton) {
	try {
		BufferedReader br = new BufferedReader(new FileReader("src/todolist.txt"));
		
		String line = br.readLine();
		while(line != null){
			toDoList.add(line);
			System.out.println(line);
			line = br.readLine();
			
		}
		
		br.close();
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
System.out.println(toDoList);
}
}
