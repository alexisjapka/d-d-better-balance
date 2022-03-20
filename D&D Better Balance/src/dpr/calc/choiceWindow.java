package dpr.calc;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class choiceWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					choiceWindow window = new choiceWindow();
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
	public choiceWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 335, 290);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to D&D Better Balance!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 287, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("What would you like to calculate?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 66, 277, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton one = new JButton("Individual DPR");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DPRgui.main(null);
			}
		});
		one.setBounds(20, 106, 277, 23);
		frame.getContentPane().add(one);
		
		JButton group = new JButton("Group DPR");
		group.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GroupDRPgui.main(null);
			}
		});
		group.setBounds(20, 140, 277, 23);
		frame.getContentPane().add(group);
		
		JButton victory = new JButton("Combat Encounter Victory Prediction");
		victory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		victory.setBounds(20, 208, 277, 23);
		frame.getContentPane().add(victory);
		
		JButton btnNewButton = new JButton("DPR Character Comparison");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comparegui.main(null);
			}
		});
		btnNewButton.setBounds(20, 174, 277, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
