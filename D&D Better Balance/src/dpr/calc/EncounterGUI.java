package dpr.calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EncounterGUI {

	private JFrame frmEncounterCalculator;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EncounterGUI window = new EncounterGUI();
					window.frmEncounterCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EncounterGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEncounterCalculator = new JFrame();
		frmEncounterCalculator.setTitle("Encounter Calculator");
		frmEncounterCalculator.setBounds(100, 100, 374, 309);
		frmEncounterCalculator.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmEncounterCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Character Level");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(35, 27, 122, 22);
		frmEncounterCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblPc = new JLabel("PC 1");
		lblPc.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPc.setHorizontalAlignment(SwingConstants.CENTER);
		lblPc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPc.setBounds(35, 60, 36, 22);
		frmEncounterCalculator.getContentPane().add(lblPc);
		
		JLabel lblPc_1 = new JLabel("PC 2");
		lblPc_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPc_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPc_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPc_1.setBounds(35, 93, 36, 22);
		frmEncounterCalculator.getContentPane().add(lblPc_1);
		
		JLabel lblPc_5 = new JLabel("PC 3");
		lblPc_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPc_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblPc_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPc_5.setBounds(35, 126, 36, 22);
		frmEncounterCalculator.getContentPane().add(lblPc_5);
		
		JLabel lblPc_2 = new JLabel("PC 4");
		lblPc_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPc_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPc_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPc_2.setBounds(35, 159, 36, 22);
		frmEncounterCalculator.getContentPane().add(lblPc_2);
		
		textField = new JTextField();
		textField.setBounds(101, 62, 56, 20);
		frmEncounterCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(101, 95, 56, 20);
		frmEncounterCalculator.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(101, 128, 56, 20);
		frmEncounterCalculator.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(101, 161, 56, 20);
		frmEncounterCalculator.getContentPane().add(textField_3);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Easy");
		tglbtnNewToggleButton.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				 if (tglbtnNewToggleButton.isSelected())  
					 tglbtnNewToggleButton.setText("Hard");  
			        else  
			        	tglbtnNewToggleButton.setText("Easy");  
			}
		});
		tglbtnNewToggleButton.setBounds(200, 72, 121, 23);
		frmEncounterCalculator.getContentPane().add(tglbtnNewToggleButton);
		
		JLabel lblPc_2_1 = new JLabel("Difficulty Toggle");
		lblPc_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPc_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPc_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPc_2_1.setBounds(200, 43, 122, 22);
		frmEncounterCalculator.getContentPane().add(lblPc_2_1);
		
		JLabel lblPc_2_1_1 = new JLabel("How many NPCs?");
		lblPc_2_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPc_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPc_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPc_2_1_1.setBounds(200, 117, 122, 22);
		frmEncounterCalculator.getContentPane().add(lblPc_2_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(234, 147, 56, 20);
		frmEncounterCalculator.getContentPane().add(textField_4);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(35, 214, 286, 39);
		frmEncounterCalculator.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel result = new JLabel("RESULTS");
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setHorizontalTextPosition(SwingConstants.CENTER);
		result.setBounds(130, 6, 146, 25);
		panel.add(result);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		calculate.setBounds(10, 7, 110, 24);
		panel.add(calculate);
	}
}
