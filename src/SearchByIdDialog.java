/*
 * 
 * This is the dialog for Employee search by ID
 * 
 * */

/*
 * 
 * This is the dialog for Employee search by ID
 * 
 * */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class SearchByIdDialog extends Search implements ActionListener {	
	// constructor for SearchByIdDialog 
	public SearchByIdDialog(EmployeeDetails parent) {
		setTitle("Search by ID");
		setModal(true);
		this.parent = parent;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JScrollPane scrollPane = new JScrollPane(searchPane());
		setContentPane(scrollPane);

		getRootPane().setDefaultButton(search);
		
		setSize(500, 190);
		setLocation(350, 250);
		setVisible(true);
	}// end SearchByIdDialog
	
	
	
	// action listener for save and cancel button
	public void actionPerformed(ActionEvent e) {
		// if option search, search for Employee
		if (e.getSource() == search) {
			// try get correct value from text field
			try {
				Double.parseDouble(searchField.getText());
				this.parent.searchByIdField.setText(searchField.getText());
				// search Employee by ID
				this.parent.searchEmployeeById();
				dispose();// dispose dialog
			}// end try
			catch (NumberFormatException num) {
				// display message and set color to text field if entry is wrong
				searchField.setBackground(new Color(255, 150, 150));
				JOptionPane.showMessageDialog(null, "Wrong ID format!");
			}// end catch
		}// end if
		// else dispose dialog
		else if (e.getSource() == cancel)
			dispose();
	}// end actionPerformed
}// end class searchByIdDialog
