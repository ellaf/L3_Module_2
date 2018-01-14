package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
}
if(e.getSource() == saveButton) {
	String newToDoList = toDoList.toString();
	try {
	FileWriter fileWriter = new FileWriter("src/todolist.txt");
	fileWriter.write("Your to-do list: \n \n" + newToDoList);
	fileWriter.close();
} catch (IOException e1) {
	e1.printStackTrace();
}

}
if(e.getSource() == loadButton) {

}

	
}
	

}
