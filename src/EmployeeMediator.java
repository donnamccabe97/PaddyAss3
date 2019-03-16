import java.awt.event.ItemEvent;

import javax.swing.event.DocumentEvent;

public interface EmployeeMediator {

	// display current Employee details
	void displayRecords(Employee thisEmployee);// end display records

	// search Employee by ID
	void searchEmployeeById();// end searchEmployeeByID

	// search Employee by surname
	void searchEmployeeBySurname();// end searchEmployeeBySurname

	// get next free ID from Employees in the file
	int getNextFreeId();// end getNextFreeId

	// add Employee object to fail
	void addRecord(Employee newEmployee);// end addRecord

	// check for correct PPS format and look if PPS already in use
	boolean correctPps(String pps, long currentByte);// end correctPPS

	// enable text fields for editing
	void setEnabled(boolean booleanValue);// end setEnabled

	// DocumentListener methods
	void changedUpdate(DocumentEvent d);

	void insertUpdate(DocumentEvent d);

	void removeUpdate(DocumentEvent d);

	// ItemListener method
	void itemStateChanged(ItemEvent e);

}