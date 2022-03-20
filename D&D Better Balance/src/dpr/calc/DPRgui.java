package dpr.calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class DPRgui {

	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldClass;
	private JTextField textFieldPlayerAC;
	private JTextField textFieldTargetAC;
	private JTextField textFieldAtkBonus;
	private JTextField textFieldDiceDmg;
	private JTextField textFieldDmgMod;
	private JTextField textFieldAtkPerRnd;
	private JTextField textFieldAtkAvgDmg;
	private JTextField textFieldXtraCritDmg;
	private JTextField textFieldXtraCritAtk;
	private JTextField textFieldImpCrit;
	private JTextField textFieldNameOutput;
	private JTextField textFieldChanceHit;
	private JTextField textFieldChanceAdv;
	private JTextField textFieldDPR;
	private JTextField textFieldHP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DPRgui window = new DPRgui();
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
	public DPRgui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 767, 551);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("D&D Better Balance");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 26));
		lblNewLabel.setBounds(409, 312, 305, 87);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Character Input");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(145, 11, 110, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Character Output");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(512, 14, 110, 23);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(34, 48, 169, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Class");
		lblNewLabel_2_1.setBounds(34, 79, 169, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Player AC");
		lblNewLabel_2_2.setBounds(34, 142, 169, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Target AC");
		lblNewLabel_2_3.setBounds(34, 173, 169, 14);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Avg Dice Damage");
		lblNewLabel_2_4.setBounds(34, 238, 169, 14);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Damage Modifier");
		lblNewLabel_2_5.setBounds(34, 273, 169, 14);
		frame.getContentPane().add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Attacks Per Round");
		lblNewLabel_2_6.setBounds(34, 308, 169, 14);
		frame.getContentPane().add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("Sneak Atk Avg Dmg");
		lblNewLabel_2_7.setBounds(34, 343, 169, 14);
		frame.getContentPane().add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_7_1 = new JLabel("Extra Crit Dmg");
		lblNewLabel_2_7_1.setBounds(34, 378, 169, 14);
		frame.getContentPane().add(lblNewLabel_2_7_1);
		
		JLabel lblNewLabel_2_7_2 = new JLabel("Extra Crit Attack (true/false)");
		lblNewLabel_2_7_2.setBounds(34, 414, 169, 14);
		frame.getContentPane().add(lblNewLabel_2_7_2);
		
		JLabel lblNewLabel_2_7_3 = new JLabel("Improved Critical (true/false)");
		lblNewLabel_2_7_3.setBounds(34, 450, 169, 14);
		frame.getContentPane().add(lblNewLabel_2_7_3);
		
		//Name input
		textFieldName = new JTextField();
		textFieldName.setBounds(228, 45, 131, 20);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		//Class input
		textFieldClass = new JTextField();
		textFieldClass.setColumns(10);
		textFieldClass.setBounds(228, 76, 131, 20);
		frame.getContentPane().add(textFieldClass);
		
		//Player AC input
		textFieldPlayerAC = new JTextField();
		textFieldPlayerAC.setColumns(10);
		textFieldPlayerAC.setBounds(228, 139, 131, 20);
		frame.getContentPane().add(textFieldPlayerAC);
		
		//Target AC input
		textFieldTargetAC = new JTextField();
		textFieldTargetAC.setColumns(10);
		textFieldTargetAC.setBounds(228, 170, 131, 20);
		frame.getContentPane().add(textFieldTargetAC);
		
		//Average dice damage input
		textFieldDiceDmg = new JTextField();
		textFieldDiceDmg.setColumns(10);
		textFieldDiceDmg.setBounds(228, 235, 131, 20);
		frame.getContentPane().add(textFieldDiceDmg);
		
		//Damage modifier input
		textFieldDmgMod = new JTextField();
		textFieldDmgMod.setColumns(10);
		textFieldDmgMod.setBounds(228, 270, 131, 20);
		frame.getContentPane().add(textFieldDmgMod);
		
		//Attacks per round input
		textFieldAtkPerRnd = new JTextField();
		textFieldAtkPerRnd.setColumns(10);
		textFieldAtkPerRnd.setBounds(228, 305, 131, 20);
		frame.getContentPane().add(textFieldAtkPerRnd);
		
		//Sneak attack damage input
		textFieldAtkAvgDmg = new JTextField();
		textFieldAtkAvgDmg.setColumns(10);
		textFieldAtkAvgDmg.setBounds(228, 340, 131, 20);
		frame.getContentPane().add(textFieldAtkAvgDmg);
		
		//Extra crit damage input
		textFieldXtraCritDmg = new JTextField();
		textFieldXtraCritDmg.setColumns(10);
		textFieldXtraCritDmg.setBounds(228, 375, 131, 20);
		frame.getContentPane().add(textFieldXtraCritDmg);
		
		//Extra crit attack input
		textFieldXtraCritAtk = new JTextField();
		textFieldXtraCritAtk.setColumns(10);
		textFieldXtraCritAtk.setBounds(228, 411, 131, 20);
		frame.getContentPane().add(textFieldXtraCritAtk);
		textFieldXtraCritAtk.setText("false");
		
		//Improved critical input
		textFieldImpCrit = new JTextField();
		textFieldImpCrit.setColumns(10);
		textFieldImpCrit.setBounds(228, 447, 131, 20);
		frame.getContentPane().add(textFieldImpCrit);
		textFieldImpCrit.setText("false");

		//Attack bonus input
		textFieldAtkBonus = new JTextField();
		textFieldAtkBonus.setColumns(10);
		textFieldAtkBonus.setBounds(228, 204, 131, 20);
		frame.getContentPane().add(textFieldAtkBonus);
		
		JLabel lblNewLabel_2_7_4 = new JLabel("Name and Class");
		lblNewLabel_2_7_4.setBounds(409, 59, 164, 14);
		frame.getContentPane().add(lblNewLabel_2_7_4);
		
		JLabel lblNewLabel_2_7_5 = new JLabel("Chance to Hit");
		lblNewLabel_2_7_5.setBounds(409, 94, 164, 14);
		frame.getContentPane().add(lblNewLabel_2_7_5);
		
		JLabel lblNewLabel_2_7_6 = new JLabel("Chance to Hit with Advantage");
		lblNewLabel_2_7_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_7_6.setBounds(409, 131, 169, 14);
		frame.getContentPane().add(lblNewLabel_2_7_6);
		
		JLabel lblNewLabel_2_7_7 = new JLabel("Damage per Round");
		lblNewLabel_2_7_7.setBounds(409, 167, 164, 14);
		frame.getContentPane().add(lblNewLabel_2_7_7);
		
		textFieldNameOutput = new JTextField();
		textFieldNameOutput.setColumns(10);
		textFieldNameOutput.setBounds(583, 56, 131, 20);
		frame.getContentPane().add(textFieldNameOutput);
		
		textFieldChanceHit = new JTextField();
		textFieldChanceHit.setColumns(10);
		textFieldChanceHit.setBounds(583, 91, 131, 20);
		frame.getContentPane().add(textFieldChanceHit);
		
		textFieldChanceAdv = new JTextField();
		textFieldChanceAdv.setColumns(10);
		textFieldChanceAdv.setBounds(583, 128, 131, 20);
		frame.getContentPane().add(textFieldChanceAdv);
		
		textFieldDPR = new JTextField();
		textFieldDPR.setColumns(10);
		textFieldDPR.setBounds(583, 167, 131, 20);
		frame.getContentPane().add(textFieldDPR);
		
		//calculate DPR
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//setting up the PlayerCharacter with input values
				Character.PC PC = new Character.PC();
				PC.name = textFieldName.getText();
				PC.characterClass = textFieldClass.getText();
				PC.HP = Double.parseDouble(textFieldHP.getText());
				PC.armorClass = Double.parseDouble(textFieldPlayerAC.getText());
				PC.targetArmorClass = Double.parseDouble(textFieldTargetAC.getText());
				PC.attackBonus = Double.parseDouble(textFieldAtkBonus.getText());
				PC.avgDiceDmg = Double.parseDouble(textFieldDiceDmg.getText());
				PC.dmgModifier = Double.parseDouble(textFieldDmgMod.getText());
				PC.attacksPerRound = Double.parseDouble(textFieldAtkPerRnd.getText());
				PC.sneakAvgAttackDmg = Double.parseDouble(textFieldAtkAvgDmg.getText());
				PC.extraCritDmg = Double.parseDouble(textFieldXtraCritDmg.getText());
				PC.extraCritAttack = Boolean.parseBoolean(textFieldXtraCritAtk.getText());
				PC.improvedCrit = Boolean.parseBoolean(textFieldImpCrit.getText());
				
				//outputs and calculations
				String nameClass = PC.name + " / " + PC.characterClass;
				String hitOutput = String.valueOf(PC.chanceToHit());
				String advOutput = String.valueOf(PC.advantageChanceToHit());
				String dprOutput = String.valueOf(PC.DPR());
				
				textFieldNameOutput.setText(nameClass);
				textFieldChanceHit.setText(hitOutput + " %");
				textFieldChanceAdv.setText(advOutput + " %");
				textFieldDPR.setText(dprOutput);
				
				//System.out.print(Name);
				
			}
		});
		btnCalculate.setBounds(512, 222, 110, 40);
		frame.getContentPane().add(btnCalculate);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Attack Bonus");
		lblNewLabel_2_3_1.setBounds(34, 207, 169, 14);
		frame.getContentPane().add(lblNewLabel_2_3_1);
		
		textFieldHP = new JTextField();
		textFieldHP.setColumns(10);
		textFieldHP.setBounds(228, 107, 131, 20);
		frame.getContentPane().add(textFieldHP);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Health");
		lblNewLabel_2_1_1.setBounds(34, 110, 169, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1);

	}
}
