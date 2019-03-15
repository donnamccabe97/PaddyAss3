import java.awt.Container;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class Search extends JDialog {
	JButton search, cancel;
	JTextField searchField;
	EmployeeDetails parent;

	public Search() {
		super();
	}
	
	public Container searchPane() {
		JPanel searchPanel = new JPanel(new GridLayout(3, 1));
		JPanel textPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JLabel searchLabel;
		String searchExpression = "Search by ";
		String enterLabel = "Enter ";
	
		searchPanel.add(new JLabel(searchExpression));
	
		textPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		textPanel.add(searchLabel = new JLabel(enterLabel));
		searchLabel.setFont(this.parent.font1);
		textPanel.add(searchField = new JTextField(20));
		searchField.setFont(this.parent.font1);
		searchField.setDocument(new JTextFieldLimit(20));
		
		buttonPanel.add(search = new JButton("Search"));
		search.addActionListener((ActionListener) this);
		search.requestFocus();
		
		buttonPanel.add(cancel = new JButton("Cancel"));
		cancel.addActionListener((ActionListener) this);
	
		searchPanel.add(textPanel);
		searchPanel.add(buttonPanel);
	
		return searchPanel;
	}// end searchPane

}