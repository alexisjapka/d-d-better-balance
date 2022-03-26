package dpr.calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GroupDRPgui {

	private JFrame frmGroupDprCalculator;
	private JTextField groupDPR;
	private JTextField pc1DPR;
	private JTextField pc2DPR;
	private JTextField pc3DPR;
	private JTextField pc4DPR;
	private JTextField pc1Name;
	private JTextField pc1TAC;
	private JTextField pc1atkBonus;
	private JTextField pc1dmg;
	private JTextField pc1Mod;
	private JTextField pc1AtkNum;
	private JTextField pc1Sneak;
	private JTextField pc1CritDmg;
	private JTextField pc1XCrit;
	private JTextField pc1ImpCrit;
	private JTextField pc2ImpCrit;
	private JTextField pc2XCrit;
	private JTextField pc2CritDmg;
	private JTextField pc2Sneak;
	private JTextField pc2Num;
	private JTextField pc2DmgMod;
	private JTextField pc2Dmg;
	private JTextField pc2AtkBonus;
	private JTextField pc2TAC;
	private JTextField pc2Name;
	private JTextField pc3ImpCrit;
	private JTextField pc3XCrit;
	private JTextField pc3CritDmg;
	private JTextField pc3Sneak;
	private JTextField pc3Num;
	private JTextField pc3DmgMod;
	private JTextField pc3Dmg;
	private JTextField pc3AtkBonus;
	private JTextField pc3TAC;
	private JTextField pc3Name;
	private JTextField pc4ImpCrit;
	private JTextField pc4XCrit;
	private JTextField pc4CritDmg;
	private JTextField pc4Sneak;
	private JTextField pc4Num;
	private JTextField pc4DmgMod;
	private JTextField pc4Dmg;
	private JTextField pc4AtkBonus;
	private JTextField pc4TAC;
	private JTextField pc4Name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupDRPgui window = new GroupDRPgui();
					window.frmGroupDprCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GroupDRPgui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGroupDprCalculator = new JFrame();
		frmGroupDprCalculator.setTitle("Group DPR Calculator");
		frmGroupDprCalculator.setBounds(100, 100, 528, 453);
		frmGroupDprCalculator.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmGroupDprCalculator.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 366, 388);
		frmGroupDprCalculator.getContentPane().add(tabbedPane);
		
		JPanel pcTab1 = new JPanel();
		pcTab1.setToolTipText("");
		tabbedPane.addTab("PC 1", null, pcTab1, null);
		pcTab1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(10, 14, 169, 14);
		pcTab1.add(lblNewLabel_2);
		
		pc1Name = new JTextField();
		pc1Name.setColumns(10);
		pc1Name.setBounds(204, 11, 131, 20);
		pcTab1.add(pc1Name);
		
		JLabel lblNewLabel_2_3 = new JLabel("Target AC");
		lblNewLabel_2_3.setBounds(10, 45, 169, 14);
		pcTab1.add(lblNewLabel_2_3);
		
		pc1TAC = new JTextField();
		pc1TAC.setColumns(10);
		pc1TAC.setBounds(204, 42, 131, 20);
		pcTab1.add(pc1TAC);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Attack Bonus");
		lblNewLabel_2_3_1.setBounds(10, 79, 169, 14);
		pcTab1.add(lblNewLabel_2_3_1);
		
		pc1atkBonus = new JTextField();
		pc1atkBonus.setColumns(10);
		pc1atkBonus.setBounds(204, 76, 131, 20);
		pcTab1.add(pc1atkBonus);
		
		JLabel lblNewLabel_2_4 = new JLabel("Avg Dice Damage");
		lblNewLabel_2_4.setBounds(10, 110, 169, 14);
		pcTab1.add(lblNewLabel_2_4);
		
		pc1dmg = new JTextField();
		pc1dmg.setColumns(10);
		pc1dmg.setBounds(204, 107, 131, 20);
		pcTab1.add(pc1dmg);
		
		JLabel lblNewLabel_2_5 = new JLabel("Damage Modifier");
		lblNewLabel_2_5.setBounds(10, 145, 169, 14);
		pcTab1.add(lblNewLabel_2_5);
		
		pc1Mod = new JTextField();
		pc1Mod.setColumns(10);
		pc1Mod.setBounds(204, 142, 131, 20);
		pcTab1.add(pc1Mod);
		
		JLabel lblNewLabel_2_6 = new JLabel("Attacks Per Round");
		lblNewLabel_2_6.setBounds(10, 180, 169, 14);
		pcTab1.add(lblNewLabel_2_6);
		
		pc1AtkNum = new JTextField();
		pc1AtkNum.setColumns(10);
		pc1AtkNum.setBounds(204, 177, 131, 20);
		pcTab1.add(pc1AtkNum);
		
		JLabel lblNewLabel_2_7 = new JLabel("Sneak Atk Avg Dmg");
		lblNewLabel_2_7.setBounds(10, 215, 169, 14);
		pcTab1.add(lblNewLabel_2_7);
		
		pc1Sneak = new JTextField();
		pc1Sneak.setColumns(10);
		pc1Sneak.setBounds(204, 212, 131, 20);
		pcTab1.add(pc1Sneak);
		
		JLabel lblNewLabel_2_7_1 = new JLabel("Extra Crit Dmg");
		lblNewLabel_2_7_1.setBounds(10, 250, 169, 14);
		pcTab1.add(lblNewLabel_2_7_1);
		
		pc1CritDmg = new JTextField();
		pc1CritDmg.setColumns(10);
		pc1CritDmg.setBounds(204, 247, 131, 20);
		pcTab1.add(pc1CritDmg);
		
		JLabel lblNewLabel_2_7_2 = new JLabel("Extra Crit Attack (true/false)");
		lblNewLabel_2_7_2.setBounds(10, 286, 169, 14);
		pcTab1.add(lblNewLabel_2_7_2);
		
		pc1XCrit = new JTextField();
		pc1XCrit.setColumns(10);
		pc1XCrit.setBounds(204, 283, 131, 20);
		pcTab1.add(pc1XCrit);
		
		JLabel lblNewLabel_2_7_3 = new JLabel("Improved Critical (true/false)");
		lblNewLabel_2_7_3.setBounds(10, 322, 169, 14);
		pcTab1.add(lblNewLabel_2_7_3);
		
		pc1ImpCrit = new JTextField();
		pc1ImpCrit.setColumns(10);
		pc1ImpCrit.setBounds(204, 319, 131, 20);
		pcTab1.add(pc1ImpCrit);
		
		JPanel pcTab2 = new JPanel();
		tabbedPane.addTab("PC 2", null, pcTab2, null);
		pcTab2.setLayout(null);
		
		JLabel lblNewLabel_2_8 = new JLabel("Name");
		lblNewLabel_2_8.setBounds(10, 14, 169, 14);
		pcTab2.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Target AC");
		lblNewLabel_2_3_2.setBounds(10, 45, 169, 14);
		pcTab2.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Attack Bonus");
		lblNewLabel_2_3_1_1.setBounds(10, 79, 169, 14);
		pcTab2.add(lblNewLabel_2_3_1_1);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Avg Dice Damage");
		lblNewLabel_2_4_1.setBounds(10, 110, 169, 14);
		pcTab2.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Damage Modifier");
		lblNewLabel_2_5_1.setBounds(10, 145, 169, 14);
		pcTab2.add(lblNewLabel_2_5_1);
		
		JLabel lblNewLabel_2_6_1 = new JLabel("Attacks Per Round");
		lblNewLabel_2_6_1.setBounds(10, 180, 169, 14);
		pcTab2.add(lblNewLabel_2_6_1);
		
		JLabel lblNewLabel_2_7_4 = new JLabel("Sneak Atk Avg Dmg");
		lblNewLabel_2_7_4.setBounds(10, 215, 169, 14);
		pcTab2.add(lblNewLabel_2_7_4);
		
		JLabel lblNewLabel_2_7_1_1 = new JLabel("Extra Crit Dmg");
		lblNewLabel_2_7_1_1.setBounds(10, 250, 169, 14);
		pcTab2.add(lblNewLabel_2_7_1_1);
		
		JLabel lblNewLabel_2_7_2_1 = new JLabel("Extra Crit Attack (true/false)");
		lblNewLabel_2_7_2_1.setBounds(10, 286, 169, 14);
		pcTab2.add(lblNewLabel_2_7_2_1);
		
		JLabel lblNewLabel_2_7_3_1 = new JLabel("Improved Critical (true/false)");
		lblNewLabel_2_7_3_1.setBounds(10, 322, 169, 14);
		pcTab2.add(lblNewLabel_2_7_3_1);
		
		pc2ImpCrit = new JTextField();
		pc2ImpCrit.setColumns(10);
		pc2ImpCrit.setBounds(204, 319, 131, 20);
		pcTab2.add(pc2ImpCrit);
		
		pc2XCrit = new JTextField();
		pc2XCrit.setColumns(10);
		pc2XCrit.setBounds(204, 283, 131, 20);
		pcTab2.add(pc2XCrit);
		
		pc2CritDmg = new JTextField();
		pc2CritDmg.setColumns(10);
		pc2CritDmg.setBounds(204, 247, 131, 20);
		pcTab2.add(pc2CritDmg);
		
		pc2Sneak = new JTextField();
		pc2Sneak.setColumns(10);
		pc2Sneak.setBounds(204, 212, 131, 20);
		pcTab2.add(pc2Sneak);
		
		pc2Num = new JTextField();
		pc2Num.setColumns(10);
		pc2Num.setBounds(204, 177, 131, 20);
		pcTab2.add(pc2Num);
		
		pc2DmgMod = new JTextField();
		pc2DmgMod.setColumns(10);
		pc2DmgMod.setBounds(204, 142, 131, 20);
		pcTab2.add(pc2DmgMod);
		
		pc2Dmg = new JTextField();
		pc2Dmg.setColumns(10);
		pc2Dmg.setBounds(204, 107, 131, 20);
		pcTab2.add(pc2Dmg);
		
		pc2AtkBonus = new JTextField();
		pc2AtkBonus.setColumns(10);
		pc2AtkBonus.setBounds(204, 76, 131, 20);
		pcTab2.add(pc2AtkBonus);
		
		pc2TAC = new JTextField();
		pc2TAC.setColumns(10);
		pc2TAC.setBounds(204, 42, 131, 20);
		pcTab2.add(pc2TAC);
		
		pc2Name = new JTextField();
		pc2Name.setColumns(10);
		pc2Name.setBounds(204, 11, 131, 20);
		pcTab2.add(pc2Name);
		
		JPanel pcTab3 = new JPanel();
		tabbedPane.addTab("PC 3", null, pcTab3, null);
		pcTab3.setLayout(null);
		
		JLabel lblNewLabel_2_9 = new JLabel("Name");
		lblNewLabel_2_9.setBounds(10, 14, 169, 14);
		pcTab3.add(lblNewLabel_2_9);
		
		JLabel lblNewLabel_2_3_3 = new JLabel("Target AC");
		lblNewLabel_2_3_3.setBounds(10, 45, 169, 14);
		pcTab3.add(lblNewLabel_2_3_3);
		
		JLabel lblNewLabel_2_3_1_2 = new JLabel("Attack Bonus");
		lblNewLabel_2_3_1_2.setBounds(10, 79, 169, 14);
		pcTab3.add(lblNewLabel_2_3_1_2);
		
		JLabel lblNewLabel_2_4_2 = new JLabel("Avg Dice Damage");
		lblNewLabel_2_4_2.setBounds(10, 110, 169, 14);
		pcTab3.add(lblNewLabel_2_4_2);
		
		JLabel lblNewLabel_2_5_2 = new JLabel("Damage Modifier");
		lblNewLabel_2_5_2.setBounds(10, 145, 169, 14);
		pcTab3.add(lblNewLabel_2_5_2);
		
		JLabel lblNewLabel_2_6_2 = new JLabel("Attacks Per Round");
		lblNewLabel_2_6_2.setBounds(10, 180, 169, 14);
		pcTab3.add(lblNewLabel_2_6_2);
		
		JLabel lblNewLabel_2_7_5 = new JLabel("Sneak Atk Avg Dmg");
		lblNewLabel_2_7_5.setBounds(10, 215, 169, 14);
		pcTab3.add(lblNewLabel_2_7_5);
		
		JLabel lblNewLabel_2_7_1_2 = new JLabel("Extra Crit Dmg");
		lblNewLabel_2_7_1_2.setBounds(10, 250, 169, 14);
		pcTab3.add(lblNewLabel_2_7_1_2);
		
		JLabel lblNewLabel_2_7_2_2 = new JLabel("Extra Crit Attack (true/false)");
		lblNewLabel_2_7_2_2.setBounds(10, 286, 169, 14);
		pcTab3.add(lblNewLabel_2_7_2_2);
		
		JLabel lblNewLabel_2_7_3_2 = new JLabel("Improved Critical (true/false)");
		lblNewLabel_2_7_3_2.setBounds(10, 322, 169, 14);
		pcTab3.add(lblNewLabel_2_7_3_2);
		
		pc3ImpCrit = new JTextField();
		pc3ImpCrit.setColumns(10);
		pc3ImpCrit.setBounds(204, 319, 131, 20);
		pcTab3.add(pc3ImpCrit);
		
		pc3XCrit = new JTextField();
		pc3XCrit.setColumns(10);
		pc3XCrit.setBounds(204, 283, 131, 20);
		pcTab3.add(pc3XCrit);
		
		pc3CritDmg = new JTextField();
		pc3CritDmg.setColumns(10);
		pc3CritDmg.setBounds(204, 247, 131, 20);
		pcTab3.add(pc3CritDmg);
		
		pc3Sneak = new JTextField();
		pc3Sneak.setColumns(10);
		pc3Sneak.setBounds(204, 212, 131, 20);
		pcTab3.add(pc3Sneak);
		
		pc3Num = new JTextField();
		pc3Num.setColumns(10);
		pc3Num.setBounds(204, 177, 131, 20);
		pcTab3.add(pc3Num);
		
		pc3DmgMod = new JTextField();
		pc3DmgMod.setColumns(10);
		pc3DmgMod.setBounds(204, 142, 131, 20);
		pcTab3.add(pc3DmgMod);
		
		pc3Dmg = new JTextField();
		pc3Dmg.setColumns(10);
		pc3Dmg.setBounds(204, 107, 131, 20);
		pcTab3.add(pc3Dmg);
		
		pc3AtkBonus = new JTextField();
		pc3AtkBonus.setColumns(10);
		pc3AtkBonus.setBounds(204, 76, 131, 20);
		pcTab3.add(pc3AtkBonus);
		
		pc3TAC = new JTextField();
		pc3TAC.setColumns(10);
		pc3TAC.setBounds(204, 42, 131, 20);
		pcTab3.add(pc3TAC);
		
		pc3Name = new JTextField();
		pc3Name.setColumns(10);
		pc3Name.setBounds(204, 11, 131, 20);
		pcTab3.add(pc3Name);
		
		JPanel pcTab4 = new JPanel();
		tabbedPane.addTab("PC 4", null, pcTab4, null);
		pcTab4.setLayout(null);
		
		JLabel lblNewLabel_2_10 = new JLabel("Name");
		lblNewLabel_2_10.setBounds(10, 14, 169, 14);
		pcTab4.add(lblNewLabel_2_10);
		
		JLabel lblNewLabel_2_3_4 = new JLabel("Target AC");
		lblNewLabel_2_3_4.setBounds(10, 45, 169, 14);
		pcTab4.add(lblNewLabel_2_3_4);
		
		JLabel lblNewLabel_2_3_1_3 = new JLabel("Attack Bonus");
		lblNewLabel_2_3_1_3.setBounds(10, 79, 169, 14);
		pcTab4.add(lblNewLabel_2_3_1_3);
		
		JLabel lblNewLabel_2_4_3 = new JLabel("Avg Dice Damage");
		lblNewLabel_2_4_3.setBounds(10, 110, 169, 14);
		pcTab4.add(lblNewLabel_2_4_3);
		
		JLabel lblNewLabel_2_5_3 = new JLabel("Damage Modifier");
		lblNewLabel_2_5_3.setBounds(10, 145, 169, 14);
		pcTab4.add(lblNewLabel_2_5_3);
		
		JLabel lblNewLabel_2_6_3 = new JLabel("Attacks Per Round");
		lblNewLabel_2_6_3.setBounds(10, 180, 169, 14);
		pcTab4.add(lblNewLabel_2_6_3);
		
		JLabel lblNewLabel_2_7_6 = new JLabel("Sneak Atk Avg Dmg");
		lblNewLabel_2_7_6.setBounds(10, 215, 169, 14);
		pcTab4.add(lblNewLabel_2_7_6);
		
		JLabel lblNewLabel_2_7_1_3 = new JLabel("Extra Crit Dmg");
		lblNewLabel_2_7_1_3.setBounds(10, 250, 169, 14);
		pcTab4.add(lblNewLabel_2_7_1_3);
		
		JLabel lblNewLabel_2_7_2_3 = new JLabel("Extra Crit Attack (true/false)");
		lblNewLabel_2_7_2_3.setBounds(10, 286, 169, 14);
		pcTab4.add(lblNewLabel_2_7_2_3);
		
		JLabel lblNewLabel_2_7_3_3 = new JLabel("Improved Critical (true/false)");
		lblNewLabel_2_7_3_3.setBounds(10, 322, 169, 14);
		pcTab4.add(lblNewLabel_2_7_3_3);
		
		pc4ImpCrit = new JTextField();
		pc4ImpCrit.setColumns(10);
		pc4ImpCrit.setBounds(204, 319, 131, 20);
		pcTab4.add(pc4ImpCrit);
		
		pc4XCrit = new JTextField();
		pc4XCrit.setColumns(10);
		pc4XCrit.setBounds(204, 283, 131, 20);
		pcTab4.add(pc4XCrit);
		
		pc4CritDmg = new JTextField();
		pc4CritDmg.setColumns(10);
		pc4CritDmg.setBounds(204, 247, 131, 20);
		pcTab4.add(pc4CritDmg);
		
		pc4Sneak = new JTextField();
		pc4Sneak.setColumns(10);
		pc4Sneak.setBounds(204, 212, 131, 20);
		pcTab4.add(pc4Sneak);
		
		pc4Num = new JTextField();
		pc4Num.setColumns(10);
		pc4Num.setBounds(204, 177, 131, 20);
		pcTab4.add(pc4Num);
		
		pc4DmgMod = new JTextField();
		pc4DmgMod.setColumns(10);
		pc4DmgMod.setBounds(204, 142, 131, 20);
		pcTab4.add(pc4DmgMod);
		
		pc4Dmg = new JTextField();
		pc4Dmg.setColumns(10);
		pc4Dmg.setBounds(204, 107, 131, 20);
		pcTab4.add(pc4Dmg);
		
		pc4AtkBonus = new JTextField();
		pc4AtkBonus.setColumns(10);
		pc4AtkBonus.setBounds(204, 76, 131, 20);
		pcTab4.add(pc4AtkBonus);
		
		pc4TAC = new JTextField();
		pc4TAC.setColumns(10);
		pc4TAC.setBounds(204, 42, 131, 20);
		pcTab4.add(pc4TAC);
		
		pc4Name = new JTextField();
		pc4Name.setColumns(10);
		pc4Name.setBounds(204, 11, 131, 20);
		pcTab4.add(pc4Name);
		
		JLabel lblNewLabel = new JLabel("Group DPR");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(358, 11, 179, 28);
		frmGroupDprCalculator.getContentPane().add(lblNewLabel);
		
		groupDPR = new JTextField();
		groupDPR.setHorizontalAlignment(SwingConstants.CENTER);
		groupDPR.setBounds(404, 50, 86, 20);
		frmGroupDprCalculator.getContentPane().add(groupDPR);
		groupDPR.setColumns(10);
		
		JLabel lblPcDpr = new JLabel("PC 1 DPR");
		lblPcDpr.setHorizontalAlignment(SwingConstants.CENTER);
		lblPcDpr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPcDpr.setBounds(358, 81, 179, 28);
		frmGroupDprCalculator.getContentPane().add(lblPcDpr);
		
		pc1DPR = new JTextField();
		pc1DPR.setHorizontalAlignment(SwingConstants.CENTER);
		pc1DPR.setColumns(10);
		pc1DPR.setBounds(404, 120, 86, 20);
		frmGroupDprCalculator.getContentPane().add(pc1DPR);
		
		JLabel lblPcDpr_1 = new JLabel("PC 2 DPR");
		lblPcDpr_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPcDpr_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPcDpr_1.setBounds(358, 151, 179, 28);
		frmGroupDprCalculator.getContentPane().add(lblPcDpr_1);
		
		pc2DPR = new JTextField();
		pc2DPR.setHorizontalAlignment(SwingConstants.CENTER);
		pc2DPR.setColumns(10);
		pc2DPR.setBounds(404, 190, 86, 20);
		frmGroupDprCalculator.getContentPane().add(pc2DPR);
		
		JLabel lblPcDpr_2 = new JLabel("PC 3 DPR");
		lblPcDpr_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPcDpr_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPcDpr_2.setBounds(358, 221, 179, 28);
		frmGroupDprCalculator.getContentPane().add(lblPcDpr_2);
		
		pc3DPR = new JTextField();
		pc3DPR.setHorizontalAlignment(SwingConstants.CENTER);
		pc3DPR.setColumns(10);
		pc3DPR.setBounds(404, 260, 86, 20);
		frmGroupDprCalculator.getContentPane().add(pc3DPR);
		
		JLabel lblPcDpr_3 = new JLabel("PC 4 DPR");
		lblPcDpr_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPcDpr_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPcDpr_3.setBounds(358, 291, 179, 28);
		frmGroupDprCalculator.getContentPane().add(lblPcDpr_3);
		
		pc4DPR = new JTextField();
		pc4DPR.setHorizontalAlignment(SwingConstants.CENTER);
		pc4DPR.setColumns(10);
		pc4DPR.setBounds(404, 330, 86, 20);
		frmGroupDprCalculator.getContentPane().add(pc4DPR);
		
		pc1XCrit.setText("false");
		pc1ImpCrit.setText("false");
		pc2XCrit.setText("false");
		pc2ImpCrit.setText("false");
		pc3XCrit.setText("false");
		pc3ImpCrit.setText("false");
		pc4XCrit.setText("false");
		pc4ImpCrit.setText("false");
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//reset
				pc1DPR.setText("");
				pc2DPR.setText("");
				pc3DPR.setText("");
				pc4DPR.setText("");
				groupDPR.setText("");
				
				Character.PC PC1 = new Character.PC();
				Character.PC PC2 = new Character.PC();
				Character.PC PC3 = new Character.PC();
				Character.PC PC4 = new Character.PC();
				
				int errorCheckPC1 = 0;
				int errorCheckPC2 = 0;
				int errorCheckPC3 = 0;
				int errorCheckPC4 = 0;
				
				//create PC group
				ArrayList<Character.PC> PCG = new ArrayList<Character.PC>();
				
				//checking for empty values
				//characters without a name will not get added to the group
				int cap = 50;
				
				if(pc1Name.getText().equals("") == true) errorCheckPC1 = cap;
				if(DPRCalc.isNumeric(pc1TAC.getText()) != true) errorCheckPC1++;
				if(DPRCalc.isNumeric(pc1atkBonus.getText()) != true) errorCheckPC1++;
				if(DPRCalc.isNumeric(pc1dmg.getText()) != true) errorCheckPC1++;
				if(DPRCalc.isNumeric(pc1Mod.getText()) != true) errorCheckPC1++;
				if(DPRCalc.isNumeric(pc1AtkNum.getText()) != true) errorCheckPC1++;
				if(DPRCalc.isNumeric(pc1Sneak.getText()) != true) errorCheckPC1++;
				if(DPRCalc.isNumeric(pc1CritDmg.getText()) != true) errorCheckPC1++;
				if(DPRCalc.isBoolean(pc1XCrit.getText()) != true) errorCheckPC1++;
				if(DPRCalc.isBoolean(pc1ImpCrit.getText()) != true) errorCheckPC1++;
			
				if(pc2Name.getText().equals("") == true) errorCheckPC2 = cap;
				if(DPRCalc.isNumeric(pc2TAC.getText()) != true) errorCheckPC2++;
				if(DPRCalc.isNumeric(pc2AtkBonus.getText()) != true) errorCheckPC2++;
				if(DPRCalc.isNumeric(pc2Dmg.getText()) != true) errorCheckPC2++;
				if(DPRCalc.isNumeric(pc2DmgMod.getText()) != true) errorCheckPC2++;
				if(DPRCalc.isNumeric(pc2Num.getText()) != true) errorCheckPC2++;
				if(DPRCalc.isNumeric(pc2Sneak.getText()) != true) errorCheckPC2++;
				if(DPRCalc.isNumeric(pc2CritDmg.getText()) != true) errorCheckPC2++;
				if(DPRCalc.isBoolean(pc2XCrit.getText()) != true) errorCheckPC2++;
				if(DPRCalc.isBoolean(pc2ImpCrit.getText()) != true) errorCheckPC2++;
				
				if(pc3Name.getText().equals("") == true) errorCheckPC3 = cap;
				if(DPRCalc.isNumeric(pc3TAC.getText()) != true) errorCheckPC3++;
				if(DPRCalc.isNumeric(pc3AtkBonus.getText()) != true) errorCheckPC3++;
				if(DPRCalc.isNumeric(pc3Dmg.getText()) != true) errorCheckPC3++;
				if(DPRCalc.isNumeric(pc3DmgMod.getText()) != true) errorCheckPC3++;
				if(DPRCalc.isNumeric(pc3Num.getText()) != true) errorCheckPC3++;
				if(DPRCalc.isNumeric(pc3Sneak.getText()) != true) errorCheckPC3++;
				if(DPRCalc.isNumeric(pc3CritDmg.getText()) != true) errorCheckPC3++;
				if(DPRCalc.isBoolean(pc3XCrit.getText()) != true) errorCheckPC3++;
				if(DPRCalc.isBoolean(pc3ImpCrit.getText()) != true) errorCheckPC3++;
				
				if(pc4Name.getText().equals("") == true) errorCheckPC4 = cap;
				if(DPRCalc.isNumeric(pc4TAC.getText()) != true) errorCheckPC4++;
				if(DPRCalc.isNumeric(pc4AtkBonus.getText()) != true) errorCheckPC4++;
				if(DPRCalc.isNumeric(pc4Dmg.getText()) != true) errorCheckPC4++;
				if(DPRCalc.isNumeric(pc4DmgMod.getText()) != true) errorCheckPC4++;
				if(DPRCalc.isNumeric(pc4Num.getText()) != true) errorCheckPC4++;
				if(DPRCalc.isNumeric(pc4Sneak.getText()) != true) errorCheckPC4++;
				if(DPRCalc.isNumeric(pc4CritDmg.getText()) != true) errorCheckPC4++;
				if(DPRCalc.isBoolean(pc4XCrit.getText()) != true) errorCheckPC4++;
				if(DPRCalc.isBoolean(pc4ImpCrit.getText()) != true) errorCheckPC4++;
				
				//If errorCheck is > 0, characters will not be created
				//If errorCheck is >= 50 due to no name, characters will not be added to the group
				if(errorCheckPC1 >= cap) {
					pc1DPR.setText("-");
				}
				else if(errorCheckPC1 > 0) {
					pc1DPR.setText(errorCheckPC1+" Error(s)");
				}
				else {
					PC1.name = pc1Name.getText();
					PC1.targetArmorClass = Double.parseDouble(pc1TAC.getText());
					PC1.attackBonus = Double.parseDouble(pc1atkBonus.getText());
					PC1.avgDiceDmg = Double.parseDouble(pc1dmg.getText());
					PC1.dmgModifier = Double.parseDouble(pc1Mod.getText());
					PC1.attacksPerRound = Double.parseDouble(pc1AtkNum.getText());
					PC1.sneakAvgAttackDmg = Double.parseDouble(pc1Sneak.getText());
					PC1.extraCritDmg = Double.parseDouble(pc1CritDmg.getText());
					PC1.extraCritAttack = Boolean.parseBoolean(pc1XCrit.getText());
					PC1.improvedCrit = Boolean.parseBoolean(pc1ImpCrit.getText());
					String dpr1 = String.valueOf(PC1.DPR());
					pc1DPR.setText(dpr1);
					PCG.add(PC1);
				}
				
				if(errorCheckPC2 >= cap) {
					pc2DPR.setText("-");
				}
				else if(errorCheckPC2 > 0) {
					pc2DPR.setText(errorCheckPC2+" Error(s)");
				}
				else {
					PC2.name = pc2Name.getText();
					PC2.targetArmorClass = Double.parseDouble(pc2TAC.getText());
					PC2.attackBonus = Double.parseDouble(pc2AtkBonus.getText());
					PC2.avgDiceDmg = Double.parseDouble(pc2Dmg.getText());
					PC2.dmgModifier = Double.parseDouble(pc2DmgMod.getText());
					PC2.attacksPerRound = Double.parseDouble(pc2Num.getText());
					PC2.sneakAvgAttackDmg = Double.parseDouble(pc2Sneak.getText());
					PC2.extraCritDmg = Double.parseDouble(pc2CritDmg.getText());
					PC2.extraCritAttack = Boolean.parseBoolean(pc2XCrit.getText());
					PC2.improvedCrit = Boolean.parseBoolean(pc2ImpCrit.getText());
					String dpr2 = String.valueOf(PC2.DPR());
					pc2DPR.setText(dpr2);
					PCG.add(PC2);
				}
				
				if(errorCheckPC3 >= cap) {
					pc3DPR.setText("-");
				}
				else if(errorCheckPC3 > 0) {
					pc3DPR.setText(errorCheckPC3+" Error(s)");
				}
				else {
					PC3.name = pc3Name.getText();
					PC3.targetArmorClass = Double.parseDouble(pc3TAC.getText());
					PC3.attackBonus = Double.parseDouble(pc3AtkBonus.getText());
					PC3.avgDiceDmg = Double.parseDouble(pc3Dmg.getText());
					PC3.dmgModifier = Double.parseDouble(pc3DmgMod.getText());
					PC3.attacksPerRound = Double.parseDouble(pc3Num.getText());
					PC3.sneakAvgAttackDmg = Double.parseDouble(pc3Sneak.getText());
					PC3.extraCritDmg = Double.parseDouble(pc3CritDmg.getText());
					PC3.extraCritAttack = Boolean.parseBoolean(pc3XCrit.getText());
					PC3.improvedCrit = Boolean.parseBoolean(pc3ImpCrit.getText());
					String dpr3 = String.valueOf(PC3.DPR());
					pc3DPR.setText(dpr3);
					PCG.add(PC3);
				}
				
				if(errorCheckPC4 >= cap) {
					pc4DPR.setText("-");
				}
				else if(errorCheckPC4 > 0) {
					pc4DPR.setText(errorCheckPC4+" Error(s)");
				}
				else {
					PC4.name = pc4Name.getText();
					PC4.targetArmorClass = Double.parseDouble(pc4TAC.getText());
					PC4.attackBonus = Double.parseDouble(pc4AtkBonus.getText());
					PC4.avgDiceDmg = Double.parseDouble(pc4Dmg.getText());
					PC4.dmgModifier = Double.parseDouble(pc4DmgMod.getText());
					PC4.attacksPerRound = Double.parseDouble(pc4Num.getText());
					PC4.sneakAvgAttackDmg = Double.parseDouble(pc4Sneak.getText());
					PC4.extraCritDmg = Double.parseDouble(pc4CritDmg.getText());
					PC4.extraCritAttack = Boolean.parseBoolean(pc4XCrit.getText());
					PC4.improvedCrit = Boolean.parseBoolean(pc4ImpCrit.getText());
					String dpr4 = String.valueOf(PC4.DPR());
					pc4DPR.setText(dpr4);
					PCG.add(PC4);
				}
					
				String gdpr = String.valueOf(DPRCalc.gdprPC(PCG));
				groupDPR.setText(gdpr);
				
			}
		});
		calculate.setBounds(404, 376, 89, 23);
		frmGroupDprCalculator.getContentPane().add(calculate);
	}
}
