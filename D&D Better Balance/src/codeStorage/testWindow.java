package codeStorage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;

public class testWindow {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testWindow window = new testWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(154, 95, 139, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1)
	                textField.setText("yes");
	            else
	                textField.setText("no");
			}
		});
		chckbxNewCheckBox.setBounds(165, 50, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Do it");
		btnNewButton.setBounds(177, 158, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
