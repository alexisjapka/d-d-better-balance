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

public class VictoryPrediction {

	private JFrame victoryPrediction;
	private JTextField groupDPR;
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
	private JTextField pc1HP;
	private JTextField pc1AC;
	private JTextField pc2HP;
	private JTextField pc2AC;
	private JTextField pc3HP;
	private JTextField pc3AC;
	private JTextField pc4HP;
	private JTextField pc4AC;
	private JTextField npc1Name;
	private JTextField npc1TAC;
	private JTextField npc1AtkBonus;
	private JTextField npc1Dmg;
	private JTextField npc1DmgMod;
	private JTextField npc1Num;
	private JTextField npc1Sneak;
	private JTextField npc1CritDmg;
	private JTextField npc1XCrit;
	private JTextField npc1ImpCrit;
	private JTextField npc1HP;
	private JTextField npc1AC;
	private JTextField npc2Name;
	private JTextField npc2TAC;
	private JTextField npc2AtkBonus;
	private JTextField npc2Dmg;
	private JTextField npc2DmgMod;
	private JTextField npc2Num;
	private JTextField npc2Sneak;
	private JTextField npc2CritDmg;
	private JTextField npc2XCrit;
	private JTextField npc2ImpCrit;
	private JTextField npc2HP;
	private JTextField npc2AC;
	private JTextField npc3Name;
	private JTextField npc3TAC;
	private JTextField npc3AtkBonus;
	private JTextField npc3Dmg;
	private JTextField npc3DmgMod;
	private JTextField npc3Num;
	private JTextField npc3Sneak;
	private JTextField npc3CritDmg;
	private JTextField npc3XCrit;
	private JTextField npc3ImpCrit;
	private JTextField npc3HP;
	private JTextField npc3AC;
	private JTextField npc1Amount;
	private JTextField npc2Amount;
	private JTextField npc3Amount;
	private JTextField npcDPR;
	private JTextField rounds;
	private JTextField winner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VictoryPrediction window = new VictoryPrediction();
					window.victoryPrediction.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VictoryPrediction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		victoryPrediction = new JFrame();
		victoryPrediction.setTitle("Victory Prediction");
		victoryPrediction.setBounds(100, 100, 907, 533);
		victoryPrediction.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		victoryPrediction.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 366, 472);
		victoryPrediction.getContentPane().add(tabbedPane);
		
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
		lblNewLabel_2_3.setBounds(10, 107, 169, 14);
		pcTab1.add(lblNewLabel_2_3);
		
		pc1TAC = new JTextField();
		pc1TAC.setColumns(10);
		pc1TAC.setBounds(204, 104, 131, 20);
		pcTab1.add(pc1TAC);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Attack Bonus");
		lblNewLabel_2_3_1.setBounds(10, 141, 169, 14);
		pcTab1.add(lblNewLabel_2_3_1);
		
		pc1atkBonus = new JTextField();
		pc1atkBonus.setColumns(10);
		pc1atkBonus.setBounds(204, 138, 131, 20);
		pcTab1.add(pc1atkBonus);
		
		JLabel lblNewLabel_2_4 = new JLabel("Avg Dice Damage");
		lblNewLabel_2_4.setBounds(10, 172, 169, 14);
		pcTab1.add(lblNewLabel_2_4);
		
		pc1dmg = new JTextField();
		pc1dmg.setColumns(10);
		pc1dmg.setBounds(204, 169, 131, 20);
		pcTab1.add(pc1dmg);
		
		JLabel lblNewLabel_2_5 = new JLabel("Damage Modifier");
		lblNewLabel_2_5.setBounds(10, 207, 169, 14);
		pcTab1.add(lblNewLabel_2_5);
		
		pc1Mod = new JTextField();
		pc1Mod.setColumns(10);
		pc1Mod.setBounds(204, 204, 131, 20);
		pcTab1.add(pc1Mod);
		
		JLabel lblNewLabel_2_6 = new JLabel("Attacks Per Round");
		lblNewLabel_2_6.setBounds(10, 242, 169, 14);
		pcTab1.add(lblNewLabel_2_6);
		
		pc1AtkNum = new JTextField();
		pc1AtkNum.setColumns(10);
		pc1AtkNum.setBounds(204, 239, 131, 20);
		pcTab1.add(pc1AtkNum);
		
		JLabel lblNewLabel_2_7 = new JLabel("Sneak Atk Avg Dmg");
		lblNewLabel_2_7.setBounds(10, 277, 169, 14);
		pcTab1.add(lblNewLabel_2_7);
		
		pc1Sneak = new JTextField();
		pc1Sneak.setColumns(10);
		pc1Sneak.setBounds(204, 274, 131, 20);
		pcTab1.add(pc1Sneak);
		
		JLabel lblNewLabel_2_7_1 = new JLabel("Extra Crit Dmg");
		lblNewLabel_2_7_1.setBounds(10, 312, 169, 14);
		pcTab1.add(lblNewLabel_2_7_1);
		
		pc1CritDmg = new JTextField();
		pc1CritDmg.setColumns(10);
		pc1CritDmg.setBounds(204, 309, 131, 20);
		pcTab1.add(pc1CritDmg);
		
		JLabel lblNewLabel_2_7_2 = new JLabel("Extra Crit Attack (true/false)");
		lblNewLabel_2_7_2.setBounds(10, 348, 169, 14);
		pcTab1.add(lblNewLabel_2_7_2);
		
		pc1XCrit = new JTextField();
		pc1XCrit.setColumns(10);
		pc1XCrit.setBounds(204, 345, 131, 20);
		pcTab1.add(pc1XCrit);
		
		JLabel lblNewLabel_2_7_3 = new JLabel("Improved Critical (true/false)");
		lblNewLabel_2_7_3.setBounds(10, 384, 169, 14);
		pcTab1.add(lblNewLabel_2_7_3);
		
		pc1ImpCrit = new JTextField();
		pc1ImpCrit.setColumns(10);
		pc1ImpCrit.setBounds(204, 381, 131, 20);
		pcTab1.add(pc1ImpCrit);
		
		JPanel pcTab2 = new JPanel();
		tabbedPane.addTab("PC 2", null, pcTab2, null);
		pcTab2.setLayout(null);
		
		JLabel lblNewLabel_2_8 = new JLabel("Name");
		lblNewLabel_2_8.setBounds(10, 14, 169, 14);
		pcTab2.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Target AC");
		lblNewLabel_2_3_2.setBounds(10, 107, 169, 14);
		pcTab2.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Attack Bonus");
		lblNewLabel_2_3_1_1.setBounds(10, 141, 169, 14);
		pcTab2.add(lblNewLabel_2_3_1_1);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Avg Dice Damage");
		lblNewLabel_2_4_1.setBounds(10, 172, 169, 14);
		pcTab2.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Damage Modifier");
		lblNewLabel_2_5_1.setBounds(10, 207, 169, 14);
		pcTab2.add(lblNewLabel_2_5_1);
		
		JLabel lblNewLabel_2_6_1 = new JLabel("Attacks Per Round");
		lblNewLabel_2_6_1.setBounds(10, 242, 169, 14);
		pcTab2.add(lblNewLabel_2_6_1);
		
		JLabel lblNewLabel_2_7_4 = new JLabel("Sneak Atk Avg Dmg");
		lblNewLabel_2_7_4.setBounds(10, 277, 169, 14);
		pcTab2.add(lblNewLabel_2_7_4);
		
		JLabel lblNewLabel_2_7_1_1 = new JLabel("Extra Crit Dmg");
		lblNewLabel_2_7_1_1.setBounds(10, 312, 169, 14);
		pcTab2.add(lblNewLabel_2_7_1_1);
		
		JLabel lblNewLabel_2_7_2_1 = new JLabel("Extra Crit Attack (true/false)");
		lblNewLabel_2_7_2_1.setBounds(10, 348, 169, 14);
		pcTab2.add(lblNewLabel_2_7_2_1);
		
		JLabel lblNewLabel_2_7_3_1 = new JLabel("Improved Critical (true/false)");
		lblNewLabel_2_7_3_1.setBounds(10, 384, 169, 14);
		pcTab2.add(lblNewLabel_2_7_3_1);
		
		pc2ImpCrit = new JTextField();
		pc2ImpCrit.setColumns(10);
		pc2ImpCrit.setBounds(204, 381, 131, 20);
		pcTab2.add(pc2ImpCrit);
		
		pc2XCrit = new JTextField();
		pc2XCrit.setColumns(10);
		pc2XCrit.setBounds(204, 345, 131, 20);
		pcTab2.add(pc2XCrit);
		
		pc2CritDmg = new JTextField();
		pc2CritDmg.setColumns(10);
		pc2CritDmg.setBounds(204, 309, 131, 20);
		pcTab2.add(pc2CritDmg);
		
		pc2Sneak = new JTextField();
		pc2Sneak.setColumns(10);
		pc2Sneak.setBounds(204, 274, 131, 20);
		pcTab2.add(pc2Sneak);
		
		pc2Num = new JTextField();
		pc2Num.setColumns(10);
		pc2Num.setBounds(204, 239, 131, 20);
		pcTab2.add(pc2Num);
		
		pc2DmgMod = new JTextField();
		pc2DmgMod.setColumns(10);
		pc2DmgMod.setBounds(204, 204, 131, 20);
		pcTab2.add(pc2DmgMod);
		
		pc2Dmg = new JTextField();
		pc2Dmg.setColumns(10);
		pc2Dmg.setBounds(204, 169, 131, 20);
		pcTab2.add(pc2Dmg);
		
		pc2AtkBonus = new JTextField();
		pc2AtkBonus.setColumns(10);
		pc2AtkBonus.setBounds(204, 138, 131, 20);
		pcTab2.add(pc2AtkBonus);
		
		pc2TAC = new JTextField();
		pc2TAC.setColumns(10);
		pc2TAC.setBounds(204, 104, 131, 20);
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
		lblNewLabel_2_3_3.setBounds(10, 107, 169, 14);
		pcTab3.add(lblNewLabel_2_3_3);
		
		JLabel lblNewLabel_2_3_1_2 = new JLabel("Attack Bonus");
		lblNewLabel_2_3_1_2.setBounds(10, 141, 169, 14);
		pcTab3.add(lblNewLabel_2_3_1_2);
		
		JLabel lblNewLabel_2_4_2 = new JLabel("Avg Dice Damage");
		lblNewLabel_2_4_2.setBounds(10, 172, 169, 14);
		pcTab3.add(lblNewLabel_2_4_2);
		
		JLabel lblNewLabel_2_5_2 = new JLabel("Damage Modifier");
		lblNewLabel_2_5_2.setBounds(10, 207, 169, 14);
		pcTab3.add(lblNewLabel_2_5_2);
		
		JLabel lblNewLabel_2_6_2 = new JLabel("Attacks Per Round");
		lblNewLabel_2_6_2.setBounds(10, 242, 169, 14);
		pcTab3.add(lblNewLabel_2_6_2);
		
		JLabel lblNewLabel_2_7_5 = new JLabel("Sneak Atk Avg Dmg");
		lblNewLabel_2_7_5.setBounds(10, 277, 169, 14);
		pcTab3.add(lblNewLabel_2_7_5);
		
		JLabel lblNewLabel_2_7_1_2 = new JLabel("Extra Crit Dmg");
		lblNewLabel_2_7_1_2.setBounds(10, 312, 169, 14);
		pcTab3.add(lblNewLabel_2_7_1_2);
		
		JLabel lblNewLabel_2_7_2_2 = new JLabel("Extra Crit Attack (true/false)");
		lblNewLabel_2_7_2_2.setBounds(10, 348, 169, 14);
		pcTab3.add(lblNewLabel_2_7_2_2);
		
		JLabel lblNewLabel_2_7_3_2 = new JLabel("Improved Critical (true/false)");
		lblNewLabel_2_7_3_2.setBounds(10, 384, 169, 14);
		pcTab3.add(lblNewLabel_2_7_3_2);
		
		pc3ImpCrit = new JTextField();
		pc3ImpCrit.setColumns(10);
		pc3ImpCrit.setBounds(204, 381, 131, 20);
		pcTab3.add(pc3ImpCrit);
		
		pc3XCrit = new JTextField();
		pc3XCrit.setColumns(10);
		pc3XCrit.setBounds(204, 345, 131, 20);
		pcTab3.add(pc3XCrit);
		
		pc3CritDmg = new JTextField();
		pc3CritDmg.setColumns(10);
		pc3CritDmg.setBounds(204, 309, 131, 20);
		pcTab3.add(pc3CritDmg);
		
		pc3Sneak = new JTextField();
		pc3Sneak.setColumns(10);
		pc3Sneak.setBounds(204, 274, 131, 20);
		pcTab3.add(pc3Sneak);
		
		pc3Num = new JTextField();
		pc3Num.setColumns(10);
		pc3Num.setBounds(204, 239, 131, 20);
		pcTab3.add(pc3Num);
		
		pc3DmgMod = new JTextField();
		pc3DmgMod.setColumns(10);
		pc3DmgMod.setBounds(204, 204, 131, 20);
		pcTab3.add(pc3DmgMod);
		
		pc3Dmg = new JTextField();
		pc3Dmg.setColumns(10);
		pc3Dmg.setBounds(204, 169, 131, 20);
		pcTab3.add(pc3Dmg);
		
		pc3AtkBonus = new JTextField();
		pc3AtkBonus.setColumns(10);
		pc3AtkBonus.setBounds(204, 138, 131, 20);
		pcTab3.add(pc3AtkBonus);
		
		pc3TAC = new JTextField();
		pc3TAC.setColumns(10);
		pc3TAC.setBounds(204, 104, 131, 20);
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
		lblNewLabel_2_3_4.setBounds(10, 107, 169, 14);
		pcTab4.add(lblNewLabel_2_3_4);
		
		JLabel lblNewLabel_2_3_1_3 = new JLabel("Attack Bonus");
		lblNewLabel_2_3_1_3.setBounds(10, 141, 169, 14);
		pcTab4.add(lblNewLabel_2_3_1_3);
		
		JLabel lblNewLabel_2_4_3 = new JLabel("Avg Dice Damage");
		lblNewLabel_2_4_3.setBounds(10, 172, 169, 14);
		pcTab4.add(lblNewLabel_2_4_3);
		
		JLabel lblNewLabel_2_5_3 = new JLabel("Damage Modifier");
		lblNewLabel_2_5_3.setBounds(10, 207, 169, 14);
		pcTab4.add(lblNewLabel_2_5_3);
		
		JLabel lblNewLabel_2_6_3 = new JLabel("Attacks Per Round");
		lblNewLabel_2_6_3.setBounds(10, 242, 169, 14);
		pcTab4.add(lblNewLabel_2_6_3);
		
		JLabel lblNewLabel_2_7_6 = new JLabel("Sneak Atk Avg Dmg");
		lblNewLabel_2_7_6.setBounds(10, 277, 169, 14);
		pcTab4.add(lblNewLabel_2_7_6);
		
		JLabel lblNewLabel_2_7_1_3 = new JLabel("Extra Crit Dmg");
		lblNewLabel_2_7_1_3.setBounds(10, 312, 169, 14);
		pcTab4.add(lblNewLabel_2_7_1_3);
		
		JLabel lblNewLabel_2_7_2_3 = new JLabel("Extra Crit Attack (true/false)");
		lblNewLabel_2_7_2_3.setBounds(10, 348, 169, 14);
		pcTab4.add(lblNewLabel_2_7_2_3);
		
		JLabel lblNewLabel_2_7_3_3 = new JLabel("Improved Critical (true/false)");
		lblNewLabel_2_7_3_3.setBounds(10, 384, 169, 14);
		pcTab4.add(lblNewLabel_2_7_3_3);
		
		pc4ImpCrit = new JTextField();
		pc4ImpCrit.setColumns(10);
		pc4ImpCrit.setBounds(204, 381, 131, 20);
		pcTab4.add(pc4ImpCrit);
		
		pc4XCrit = new JTextField();
		pc4XCrit.setColumns(10);
		pc4XCrit.setBounds(204, 345, 131, 20);
		pcTab4.add(pc4XCrit);
		
		pc4CritDmg = new JTextField();
		pc4CritDmg.setColumns(10);
		pc4CritDmg.setBounds(204, 309, 131, 20);
		pcTab4.add(pc4CritDmg);
		
		pc4Sneak = new JTextField();
		pc4Sneak.setColumns(10);
		pc4Sneak.setBounds(204, 274, 131, 20);
		pcTab4.add(pc4Sneak);
		
		pc4Num = new JTextField();
		pc4Num.setColumns(10);
		pc4Num.setBounds(204, 239, 131, 20);
		pcTab4.add(pc4Num);
		
		pc4DmgMod = new JTextField();
		pc4DmgMod.setColumns(10);
		pc4DmgMod.setBounds(204, 204, 131, 20);
		pcTab4.add(pc4DmgMod);
		
		pc4Dmg = new JTextField();
		pc4Dmg.setColumns(10);
		pc4Dmg.setBounds(204, 169, 131, 20);
		pcTab4.add(pc4Dmg);
		
		pc4AtkBonus = new JTextField();
		pc4AtkBonus.setColumns(10);
		pc4AtkBonus.setBounds(204, 138, 131, 20);
		pcTab4.add(pc4AtkBonus);
		
		pc4TAC = new JTextField();
		pc4TAC.setColumns(10);
		pc4TAC.setBounds(204, 104, 131, 20);
		pcTab4.add(pc4TAC);
		
		pc4Name = new JTextField();
		pc4Name.setColumns(10);
		pc4Name.setBounds(204, 11, 131, 20);
		pcTab4.add(pc4Name);
		
		JLabel lblNewLabel = new JLabel("PC Group DPR");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(359, 51, 179, 28);
		victoryPrediction.getContentPane().add(lblNewLabel);
		
		groupDPR = new JTextField();
		groupDPR.setHorizontalAlignment(SwingConstants.CENTER);
		groupDPR.setBounds(405, 90, 86, 20);
		victoryPrediction.getContentPane().add(groupDPR);
		groupDPR.setColumns(10);
		
		pc1XCrit.setText("false");
		pc1ImpCrit.setText("false");
		
		pc1HP = new JTextField();
		pc1HP.setColumns(10);
		pc1HP.setBounds(204, 39, 131, 20);
		pcTab1.add(pc1HP);
		
		pc1AC = new JTextField();
		pc1AC.setColumns(10);
		pc1AC.setBounds(204, 73, 131, 20);
		pcTab1.add(pc1AC);
		
		JLabel lblNewLabel_2_3_1_4 = new JLabel("Character AC");
		lblNewLabel_2_3_1_4.setBounds(10, 76, 169, 14);
		pcTab1.add(lblNewLabel_2_3_1_4);
		
		JLabel lblNewLabel_2_3_5 = new JLabel("Health");
		lblNewLabel_2_3_5.setBounds(10, 42, 169, 14);
		pcTab1.add(lblNewLabel_2_3_5);
		pc2XCrit.setText("false");
		pc2ImpCrit.setText("false");
		
		JLabel lblNewLabel_2_3_5_1 = new JLabel("Health");
		lblNewLabel_2_3_5_1.setBounds(10, 42, 169, 14);
		pcTab2.add(lblNewLabel_2_3_5_1);
		
		pc2HP = new JTextField();
		pc2HP.setColumns(10);
		pc2HP.setBounds(204, 39, 131, 20);
		pcTab2.add(pc2HP);
		
		pc2AC = new JTextField();
		pc2AC.setColumns(10);
		pc2AC.setBounds(204, 73, 131, 20);
		pcTab2.add(pc2AC);
		
		JLabel lblNewLabel_2_3_1_4_1 = new JLabel("Character AC");
		lblNewLabel_2_3_1_4_1.setBounds(10, 76, 169, 14);
		pcTab2.add(lblNewLabel_2_3_1_4_1);
		pc3XCrit.setText("false");
		pc3ImpCrit.setText("false");
		
		JLabel lblNewLabel_2_3_5_1_1 = new JLabel("Health");
		lblNewLabel_2_3_5_1_1.setBounds(10, 42, 169, 14);
		pcTab3.add(lblNewLabel_2_3_5_1_1);
		
		pc3HP = new JTextField();
		pc3HP.setColumns(10);
		pc3HP.setBounds(204, 39, 131, 20);
		pcTab3.add(pc3HP);
		
		pc3AC = new JTextField();
		pc3AC.setColumns(10);
		pc3AC.setBounds(204, 73, 131, 20);
		pcTab3.add(pc3AC);
		
		JLabel lblNewLabel_2_3_1_4_1_1 = new JLabel("Character AC");
		lblNewLabel_2_3_1_4_1_1.setBounds(10, 76, 169, 14);
		pcTab3.add(lblNewLabel_2_3_1_4_1_1);
		pc4XCrit.setText("false");
		pc4ImpCrit.setText("false");
		
		JLabel lblNewLabel_2_3_5_1_2 = new JLabel("Health");
		lblNewLabel_2_3_5_1_2.setBounds(10, 42, 169, 14);
		pcTab4.add(lblNewLabel_2_3_5_1_2);
		
		pc4HP = new JTextField();
		pc4HP.setColumns(10);
		pc4HP.setBounds(204, 39, 131, 20);
		pcTab4.add(pc4HP);
		
		pc4AC = new JTextField();
		pc4AC.setColumns(10);
		pc4AC.setBounds(204, 73, 131, 20);
		pcTab4.add(pc4AC);
		
		JLabel lblNewLabel_2_3_1_4_1_2 = new JLabel("Character AC");
		lblNewLabel_2_3_1_4_1_2.setBounds(10, 76, 169, 14);
		pcTab4.add(lblNewLabel_2_3_1_4_1_2);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//reset
				groupDPR.setText("");
				npcDPR.setText("");
				rounds.setText("");
				winner.setText("");
				
				Character.PC PC1 = new Character.PC();
				Character.PC PC2 = new Character.PC();
				Character.PC PC3 = new Character.PC();
				Character.PC PC4 = new Character.PC();
				Character.NPC NPC1 = new Character.NPC();
				Character.NPC NPC2 = new Character.NPC();
				Character.NPC NPC3 = new Character.NPC();
				
				int errorCheckPC1 = 0;
				int errorCheckPC2 = 0;
				int errorCheckPC3 = 0;
				int errorCheckPC4 = 0;
				int errorCheckNPC1 = 0;
				int errorCheckNPC2 = 0;
				int errorCheckNPC3 = 0;
				
				//create groups
				ArrayList<Character.PC> PCG = new ArrayList<Character.PC>();
				ArrayList<Character.NPC> NPCG = new ArrayList<Character.NPC>();
				
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
				if(DPRCalc.isNumeric(pc1HP.getText()) != true) errorCheckPC1++;
				if(DPRCalc.isNumeric(pc1AC.getText()) != true) errorCheckPC1++;
			
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
				if(DPRCalc.isNumeric(pc2HP.getText()) != true) errorCheckPC2++;
				if(DPRCalc.isNumeric(pc2AC.getText()) != true) errorCheckPC2++;
				
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
				if(DPRCalc.isNumeric(pc3HP.getText()) != true) errorCheckPC3++;
				if(DPRCalc.isNumeric(pc3AC.getText()) != true) errorCheckPC3++;
				
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
				if(DPRCalc.isNumeric(pc4HP.getText()) != true) errorCheckPC4++;
				if(DPRCalc.isNumeric(pc4AC.getText()) != true) errorCheckPC4++;
				
				if(npc1Name.getText().equals("") == true) errorCheckNPC1 = cap;
				if(DPRCalc.isNumeric(npc1TAC.getText()) != true) errorCheckNPC1++;
				if(DPRCalc.isNumeric(npc1AtkBonus.getText()) != true) errorCheckNPC1++;
				if(DPRCalc.isNumeric(npc1Dmg.getText()) != true) errorCheckNPC1++;
				if(DPRCalc.isNumeric(npc1DmgMod.getText()) != true) errorCheckNPC1++;
				if(DPRCalc.isNumeric(npc1Num.getText()) != true) errorCheckNPC1++;
				if(DPRCalc.isNumeric(npc1Sneak.getText()) != true) errorCheckNPC1++;
				if(DPRCalc.isNumeric(npc1CritDmg.getText()) != true) errorCheckNPC1++;
				if(DPRCalc.isBoolean(npc1XCrit.getText()) != true) errorCheckNPC1++;
				if(DPRCalc.isBoolean(npc1ImpCrit.getText()) != true) errorCheckNPC1++;
				if(DPRCalc.isNumeric(npc1HP.getText()) != true) errorCheckNPC1++;
				if(DPRCalc.isNumeric(npc1AC.getText()) != true) errorCheckNPC1++;
				if(DPRCalc.isNumeric(npc1Amount.getText()) != true) errorCheckNPC1++;
				
				if(npc2Name.getText().equals("") == true) errorCheckNPC2 = cap;
				if(DPRCalc.isNumeric(npc2TAC.getText()) != true) errorCheckNPC2++;
				if(DPRCalc.isNumeric(npc2AtkBonus.getText()) != true) errorCheckNPC2++;
				if(DPRCalc.isNumeric(npc2Dmg.getText()) != true) errorCheckNPC2++;
				if(DPRCalc.isNumeric(npc2DmgMod.getText()) != true) errorCheckNPC2++;
				if(DPRCalc.isNumeric(npc2Num.getText()) != true) errorCheckNPC2++;
				if(DPRCalc.isNumeric(npc2Sneak.getText()) != true) errorCheckNPC2++;
				if(DPRCalc.isNumeric(npc2CritDmg.getText()) != true) errorCheckNPC2++;
				if(DPRCalc.isBoolean(npc2XCrit.getText()) != true) errorCheckNPC2++;
				if(DPRCalc.isBoolean(npc2ImpCrit.getText()) != true) errorCheckNPC2++;
				if(DPRCalc.isNumeric(npc2HP.getText()) != true) errorCheckNPC2++;
				if(DPRCalc.isNumeric(npc2AC.getText()) != true) errorCheckNPC2++;
				if(DPRCalc.isNumeric(npc2Amount.getText()) != true) errorCheckNPC2++;
				
				if(npc3Name.getText().equals("") == true) errorCheckNPC3 = cap;
				if(DPRCalc.isNumeric(npc3TAC.getText()) != true) errorCheckNPC3++;
				if(DPRCalc.isNumeric(npc3AtkBonus.getText()) != true) errorCheckNPC3++;
				if(DPRCalc.isNumeric(npc3Dmg.getText()) != true) errorCheckNPC3++;
				if(DPRCalc.isNumeric(npc3DmgMod.getText()) != true) errorCheckNPC3++;
				if(DPRCalc.isNumeric(npc3Num.getText()) != true) errorCheckNPC3++;
				if(DPRCalc.isNumeric(npc3Sneak.getText()) != true) errorCheckNPC3++;
				if(DPRCalc.isNumeric(npc3CritDmg.getText()) != true) errorCheckNPC3++;
				if(DPRCalc.isBoolean(npc3XCrit.getText()) != true) errorCheckNPC3++;
				if(DPRCalc.isBoolean(npc3ImpCrit.getText()) != true) errorCheckNPC3++;
				if(DPRCalc.isNumeric(npc3HP.getText()) != true) errorCheckNPC3++;
				if(DPRCalc.isNumeric(npc3AC.getText()) != true) errorCheckNPC3++;
				if(DPRCalc.isNumeric(npc3Amount.getText()) != true) errorCheckNPC3++;
				
				//If errorCheck is > 0, characters will not be created
				//If errorCheck is >= 50 due to no name, characters will not be added to the group
				if(errorCheckPC1 > 0) {
					pc1HP.setText("Empty/Error");
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
					PC1.HP = Double.parseDouble(pc1HP.getText());
					PC1.armorClass = Double.parseDouble(pc1AC.getText());
					PCG.add(PC1);
				}
				
				if(errorCheckPC2 > 0) {
					pc2HP.setText("Empty/Error");
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
					PC2.HP = Double.parseDouble(pc2HP.getText());
					PC2.armorClass = Double.parseDouble(pc2AC.getText());
					PCG.add(PC2);
				}
				
				if(errorCheckPC3 > 0) {
					pc3HP.setText("Empty/Error");
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
					PC3.HP = Double.parseDouble(pc3HP.getText());
					PC3.armorClass = Double.parseDouble(pc3AC.getText());
					PCG.add(PC3);
				}
				
				if(errorCheckPC4 > 0) {
					pc4HP.setText("Empty/Error");
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
					PC4.HP = Double.parseDouble(pc4HP.getText());
					PC4.armorClass = Double.parseDouble(pc4AC.getText());
					PCG.add(PC4);
				}
				
				if(errorCheckNPC1 > 0) {
					npc1HP.setText("Empty/Error");
				}
				else {
					NPC1.name = npc1Name.getText();
					NPC1.targetArmorClass = Double.parseDouble(npc1TAC.getText());
					NPC1.attackBonus = Double.parseDouble(npc1AtkBonus.getText());
					NPC1.avgDiceDmg = Double.parseDouble(npc1Dmg.getText());
					NPC1.dmgModifier = Double.parseDouble(npc1DmgMod.getText());
					NPC1.attacksPerRound = Double.parseDouble(npc1Num.getText());
					NPC1.sneakAvgAttackDmg = Double.parseDouble(npc1Sneak.getText());
					NPC1.extraCritDmg = Double.parseDouble(npc1CritDmg.getText());
					NPC1.extraCritAttack = Boolean.parseBoolean(npc1XCrit.getText());
					NPC1.improvedCrit = Boolean.parseBoolean(npc1ImpCrit.getText());
					NPC1.HP = Double.parseDouble(npc1HP.getText());
					NPC1.armorClass = Double.parseDouble(npc1AC.getText());
					double npc1Mul = Double.parseDouble(npc1Amount.getText());
					
					for(int i = 0; i < npc1Mul; i++){
						NPCG.add(NPC1);
					}
				}
				
				if(errorCheckNPC2 > 0) {
					npc2HP.setText("Empty/Error");
				}
				else {
					NPC2.name = npc2Name.getText();
					NPC2.targetArmorClass = Double.parseDouble(npc2TAC.getText());
					NPC2.attackBonus = Double.parseDouble(npc2AtkBonus.getText());
					NPC2.avgDiceDmg = Double.parseDouble(npc2Dmg.getText());
					NPC2.dmgModifier = Double.parseDouble(npc2DmgMod.getText());
					NPC2.attacksPerRound = Double.parseDouble(npc2Num.getText());
					NPC2.sneakAvgAttackDmg = Double.parseDouble(npc2Sneak.getText());
					NPC2.extraCritDmg = Double.parseDouble(npc2CritDmg.getText());
					NPC2.extraCritAttack = Boolean.parseBoolean(npc2XCrit.getText());
					NPC2.improvedCrit = Boolean.parseBoolean(npc2ImpCrit.getText());
					NPC2.HP = Double.parseDouble(npc2HP.getText());
					NPC2.armorClass = Double.parseDouble(npc2AC.getText());
					double npc2Mul = Double.parseDouble(npc2Amount.getText());
					
					for(int i = 0; i < npc2Mul; i++){
						NPCG.add(NPC2);
					}
				}
				
				if(errorCheckNPC3 > 0) {
					npc3HP.setText("Empty/Error");
				}
				else {
					NPC3.name = npc3Name.getText();
					NPC3.targetArmorClass = Double.parseDouble(npc3TAC.getText());
					NPC3.attackBonus = Double.parseDouble(npc3AtkBonus.getText());
					NPC3.avgDiceDmg = Double.parseDouble(npc3Dmg.getText());
					NPC3.dmgModifier = Double.parseDouble(npc3DmgMod.getText());
					NPC3.attacksPerRound = Double.parseDouble(npc3Num.getText());
					NPC3.sneakAvgAttackDmg = Double.parseDouble(npc3Sneak.getText());
					NPC3.extraCritDmg = Double.parseDouble(npc3CritDmg.getText());
					NPC3.extraCritAttack = Boolean.parseBoolean(npc3XCrit.getText());
					NPC3.improvedCrit = Boolean.parseBoolean(npc3ImpCrit.getText());
					NPC3.HP = Double.parseDouble(npc3HP.getText());
					NPC3.armorClass = Double.parseDouble(npc3AC.getText());
					double npc3Mul = Double.parseDouble(npc3Amount.getText());
					
					for(int i = 0; i < npc3Mul; i++){
						NPCG.add(NPC3);
					}
				}
					
				String gdpr = String.valueOf(DPRCalc.gdprPC(PCG));
				String ngdpr = String.valueOf(DPRCalc.gdprNPC(NPCG));
				String roundsResult = String.valueOf(DPRCalc.rounds(PCG, NPCG));
				groupDPR.setText(gdpr);
				npcDPR.setText(ngdpr);
				rounds.setText(roundsResult);
				winner.setText(DPRCalc.victory(PCG, NPCG));
				
			}
		});
		calculate.setBounds(405, 399, 89, 23);
		victoryPrediction.getContentPane().add(calculate);
		
		JTabbedPane npcTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		npcTabbedPane.setBounds(517, 11, 366, 472);
		victoryPrediction.getContentPane().add(npcTabbedPane);
		
		JPanel npcTab1 = new JPanel();
		npcTab1.setLayout(null);
		npcTab1.setToolTipText("");
		npcTabbedPane.addTab("NPC 1", null, npcTab1, null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Name");
		lblNewLabel_2_1.setBounds(10, 14, 169, 14);
		npcTab1.add(lblNewLabel_2_1);
		
		npc1Name = new JTextField();
		npc1Name.setColumns(10);
		npc1Name.setBounds(204, 11, 131, 20);
		npcTab1.add(npc1Name);
		
		JLabel lblNewLabel_2_3_6 = new JLabel("Target AC");
		lblNewLabel_2_3_6.setBounds(10, 107, 169, 14);
		npcTab1.add(lblNewLabel_2_3_6);
		
		npc1TAC = new JTextField();
		npc1TAC.setColumns(10);
		npc1TAC.setBounds(204, 104, 131, 20);
		npcTab1.add(npc1TAC);
		
		JLabel lblNewLabel_2_3_1_5 = new JLabel("Attack Bonus");
		lblNewLabel_2_3_1_5.setBounds(10, 141, 169, 14);
		npcTab1.add(lblNewLabel_2_3_1_5);
		
		npc1AtkBonus = new JTextField();
		npc1AtkBonus.setColumns(10);
		npc1AtkBonus.setBounds(204, 138, 131, 20);
		npcTab1.add(npc1AtkBonus);
		
		JLabel lblNewLabel_2_4_4 = new JLabel("Avg Dice Damage");
		lblNewLabel_2_4_4.setBounds(10, 172, 169, 14);
		npcTab1.add(lblNewLabel_2_4_4);
		
		npc1Dmg = new JTextField();
		npc1Dmg.setColumns(10);
		npc1Dmg.setBounds(204, 169, 131, 20);
		npcTab1.add(npc1Dmg);
		
		JLabel lblNewLabel_2_5_4 = new JLabel("Damage Modifier");
		lblNewLabel_2_5_4.setBounds(10, 207, 169, 14);
		npcTab1.add(lblNewLabel_2_5_4);
		
		npc1DmgMod = new JTextField();
		npc1DmgMod.setColumns(10);
		npc1DmgMod.setBounds(204, 204, 131, 20);
		npcTab1.add(npc1DmgMod);
		
		JLabel lblNewLabel_2_6_4 = new JLabel("Attacks Per Round");
		lblNewLabel_2_6_4.setBounds(10, 242, 169, 14);
		npcTab1.add(lblNewLabel_2_6_4);
		
		npc1Num = new JTextField();
		npc1Num.setColumns(10);
		npc1Num.setBounds(204, 239, 131, 20);
		npcTab1.add(npc1Num);
		
		JLabel lblNewLabel_2_7_7 = new JLabel("Sneak Atk Avg Dmg");
		lblNewLabel_2_7_7.setBounds(10, 277, 169, 14);
		npcTab1.add(lblNewLabel_2_7_7);
		
		npc1Sneak = new JTextField();
		npc1Sneak.setColumns(10);
		npc1Sneak.setBounds(204, 274, 131, 20);
		npcTab1.add(npc1Sneak);
		
		JLabel lblNewLabel_2_7_1_4 = new JLabel("Extra Crit Dmg");
		lblNewLabel_2_7_1_4.setBounds(10, 312, 169, 14);
		npcTab1.add(lblNewLabel_2_7_1_4);
		
		npc1CritDmg = new JTextField();
		npc1CritDmg.setColumns(10);
		npc1CritDmg.setBounds(204, 309, 131, 20);
		npcTab1.add(npc1CritDmg);
		
		JLabel lblNewLabel_2_7_2_4 = new JLabel("Extra Crit Attack (true/false)");
		lblNewLabel_2_7_2_4.setBounds(10, 348, 169, 14);
		npcTab1.add(lblNewLabel_2_7_2_4);
		
		npc1XCrit = new JTextField();
		npc1XCrit.setText("false");
		npc1XCrit.setColumns(10);
		npc1XCrit.setBounds(204, 345, 131, 20);
		npcTab1.add(npc1XCrit);
		
		JLabel lblNewLabel_2_7_3_4 = new JLabel("Improved Critical (true/false)");
		lblNewLabel_2_7_3_4.setBounds(10, 384, 169, 14);
		npcTab1.add(lblNewLabel_2_7_3_4);
		
		npc1ImpCrit = new JTextField();
		npc1ImpCrit.setText("false");
		npc1ImpCrit.setColumns(10);
		npc1ImpCrit.setBounds(204, 381, 131, 20);
		npcTab1.add(npc1ImpCrit);
		
		npc1HP = new JTextField();
		npc1HP.setColumns(10);
		npc1HP.setBounds(204, 39, 131, 20);
		npcTab1.add(npc1HP);
		
		npc1AC = new JTextField();
		npc1AC.setColumns(10);
		npc1AC.setBounds(204, 73, 131, 20);
		npcTab1.add(npc1AC);
		
		JLabel lblNewLabel_2_3_1_4_2 = new JLabel("Character AC");
		lblNewLabel_2_3_1_4_2.setBounds(10, 76, 169, 14);
		npcTab1.add(lblNewLabel_2_3_1_4_2);
		
		JLabel lblNewLabel_2_3_5_2 = new JLabel("Health");
		lblNewLabel_2_3_5_2.setBounds(10, 42, 169, 14);
		npcTab1.add(lblNewLabel_2_3_5_2);
		
		JLabel lblNewLabel_2_7_1_4_1 = new JLabel("How many?");
		lblNewLabel_2_7_1_4_1.setBounds(10, 416, 169, 14);
		npcTab1.add(lblNewLabel_2_7_1_4_1);
		
		npc1Amount = new JTextField();
		npc1Amount.setColumns(10);
		npc1Amount.setBounds(204, 413, 131, 20);
		npcTab1.add(npc1Amount);
		
		JPanel npcTab2 = new JPanel();
		npcTab2.setLayout(null);
		npcTab2.setToolTipText("");
		npcTabbedPane.addTab("NPC 2", null, npcTab2, null);
		
		JLabel lblNewLabel_2_2 = new JLabel("Name");
		lblNewLabel_2_2.setBounds(10, 14, 169, 14);
		npcTab2.add(lblNewLabel_2_2);
		
		npc2Name = new JTextField();
		npc2Name.setColumns(10);
		npc2Name.setBounds(204, 11, 131, 20);
		npcTab2.add(npc2Name);
		
		JLabel lblNewLabel_2_3_7 = new JLabel("Target AC");
		lblNewLabel_2_3_7.setBounds(10, 107, 169, 14);
		npcTab2.add(lblNewLabel_2_3_7);
		
		npc2TAC = new JTextField();
		npc2TAC.setColumns(10);
		npc2TAC.setBounds(204, 104, 131, 20);
		npcTab2.add(npc2TAC);
		
		JLabel lblNewLabel_2_3_1_6 = new JLabel("Attack Bonus");
		lblNewLabel_2_3_1_6.setBounds(10, 141, 169, 14);
		npcTab2.add(lblNewLabel_2_3_1_6);
		
		npc2AtkBonus = new JTextField();
		npc2AtkBonus.setColumns(10);
		npc2AtkBonus.setBounds(204, 138, 131, 20);
		npcTab2.add(npc2AtkBonus);
		
		JLabel lblNewLabel_2_4_5 = new JLabel("Avg Dice Damage");
		lblNewLabel_2_4_5.setBounds(10, 172, 169, 14);
		npcTab2.add(lblNewLabel_2_4_5);
		
		npc2Dmg = new JTextField();
		npc2Dmg.setColumns(10);
		npc2Dmg.setBounds(204, 169, 131, 20);
		npcTab2.add(npc2Dmg);
		
		JLabel lblNewLabel_2_5_5 = new JLabel("Damage Modifier");
		lblNewLabel_2_5_5.setBounds(10, 207, 169, 14);
		npcTab2.add(lblNewLabel_2_5_5);
		
		npc2DmgMod = new JTextField();
		npc2DmgMod.setColumns(10);
		npc2DmgMod.setBounds(204, 204, 131, 20);
		npcTab2.add(npc2DmgMod);
		
		JLabel lblNewLabel_2_6_5 = new JLabel("Attacks Per Round");
		lblNewLabel_2_6_5.setBounds(10, 242, 169, 14);
		npcTab2.add(lblNewLabel_2_6_5);
		
		npc2Num = new JTextField();
		npc2Num.setColumns(10);
		npc2Num.setBounds(204, 239, 131, 20);
		npcTab2.add(npc2Num);
		
		JLabel lblNewLabel_2_7_8 = new JLabel("Sneak Atk Avg Dmg");
		lblNewLabel_2_7_8.setBounds(10, 277, 169, 14);
		npcTab2.add(lblNewLabel_2_7_8);
		
		npc2Sneak = new JTextField();
		npc2Sneak.setColumns(10);
		npc2Sneak.setBounds(204, 274, 131, 20);
		npcTab2.add(npc2Sneak);
		
		JLabel lblNewLabel_2_7_1_5 = new JLabel("Extra Crit Dmg");
		lblNewLabel_2_7_1_5.setBounds(10, 312, 169, 14);
		npcTab2.add(lblNewLabel_2_7_1_5);
		
		npc2CritDmg = new JTextField();
		npc2CritDmg.setColumns(10);
		npc2CritDmg.setBounds(204, 309, 131, 20);
		npcTab2.add(npc2CritDmg);
		
		JLabel lblNewLabel_2_7_2_5 = new JLabel("Extra Crit Attack (true/false)");
		lblNewLabel_2_7_2_5.setBounds(10, 348, 169, 14);
		npcTab2.add(lblNewLabel_2_7_2_5);
		
		npc2XCrit = new JTextField();
		npc2XCrit.setText("false");
		npc2XCrit.setColumns(10);
		npc2XCrit.setBounds(204, 345, 131, 20);
		npcTab2.add(npc2XCrit);
		
		JLabel lblNewLabel_2_7_3_5 = new JLabel("Improved Critical (true/false)");
		lblNewLabel_2_7_3_5.setBounds(10, 384, 169, 14);
		npcTab2.add(lblNewLabel_2_7_3_5);
		
		npc2ImpCrit = new JTextField();
		npc2ImpCrit.setText("false");
		npc2ImpCrit.setColumns(10);
		npc2ImpCrit.setBounds(204, 381, 131, 20);
		npcTab2.add(npc2ImpCrit);
		
		npc2HP = new JTextField();
		npc2HP.setColumns(10);
		npc2HP.setBounds(204, 39, 131, 20);
		npcTab2.add(npc2HP);
		
		npc2AC = new JTextField();
		npc2AC.setColumns(10);
		npc2AC.setBounds(204, 73, 131, 20);
		npcTab2.add(npc2AC);
		
		JLabel lblNewLabel_2_3_1_4_3 = new JLabel("Character AC");
		lblNewLabel_2_3_1_4_3.setBounds(10, 76, 169, 14);
		npcTab2.add(lblNewLabel_2_3_1_4_3);
		
		JLabel lblNewLabel_2_3_5_3 = new JLabel("Health");
		lblNewLabel_2_3_5_3.setBounds(10, 42, 169, 14);
		npcTab2.add(lblNewLabel_2_3_5_3);
		
		JLabel lblNewLabel_2_7_1_4_1_1 = new JLabel("How many?");
		lblNewLabel_2_7_1_4_1_1.setBounds(10, 416, 169, 14);
		npcTab2.add(lblNewLabel_2_7_1_4_1_1);
		
		npc2Amount = new JTextField();
		npc2Amount.setColumns(10);
		npc2Amount.setBounds(204, 413, 131, 20);
		npcTab2.add(npc2Amount);
		
		JPanel npcTab3 = new JPanel();
		npcTab3.setLayout(null);
		npcTab3.setToolTipText("");
		npcTabbedPane.addTab("NPC 3", null, npcTab3, null);
		
		JLabel lblNewLabel_2_11 = new JLabel("Name");
		lblNewLabel_2_11.setBounds(10, 14, 169, 14);
		npcTab3.add(lblNewLabel_2_11);
		
		npc3Name = new JTextField();
		npc3Name.setColumns(10);
		npc3Name.setBounds(204, 11, 131, 20);
		npcTab3.add(npc3Name);
		
		JLabel lblNewLabel_2_3_8 = new JLabel("Target AC");
		lblNewLabel_2_3_8.setBounds(10, 107, 169, 14);
		npcTab3.add(lblNewLabel_2_3_8);
		
		npc3TAC = new JTextField();
		npc3TAC.setColumns(10);
		npc3TAC.setBounds(204, 104, 131, 20);
		npcTab3.add(npc3TAC);
		
		JLabel lblNewLabel_2_3_1_7 = new JLabel("Attack Bonus");
		lblNewLabel_2_3_1_7.setBounds(10, 141, 169, 14);
		npcTab3.add(lblNewLabel_2_3_1_7);
		
		npc3AtkBonus = new JTextField();
		npc3AtkBonus.setColumns(10);
		npc3AtkBonus.setBounds(204, 138, 131, 20);
		npcTab3.add(npc3AtkBonus);
		
		JLabel lblNewLabel_2_4_6 = new JLabel("Avg Dice Damage");
		lblNewLabel_2_4_6.setBounds(10, 172, 169, 14);
		npcTab3.add(lblNewLabel_2_4_6);
		
		npc3Dmg = new JTextField();
		npc3Dmg.setColumns(10);
		npc3Dmg.setBounds(204, 169, 131, 20);
		npcTab3.add(npc3Dmg);
		
		JLabel lblNewLabel_2_5_6 = new JLabel("Damage Modifier");
		lblNewLabel_2_5_6.setBounds(10, 207, 169, 14);
		npcTab3.add(lblNewLabel_2_5_6);
		
		npc3DmgMod = new JTextField();
		npc3DmgMod.setColumns(10);
		npc3DmgMod.setBounds(204, 204, 131, 20);
		npcTab3.add(npc3DmgMod);
		
		JLabel lblNewLabel_2_6_6 = new JLabel("Attacks Per Round");
		lblNewLabel_2_6_6.setBounds(10, 242, 169, 14);
		npcTab3.add(lblNewLabel_2_6_6);
		
		npc3Num = new JTextField();
		npc3Num.setColumns(10);
		npc3Num.setBounds(204, 239, 131, 20);
		npcTab3.add(npc3Num);
		
		JLabel lblNewLabel_2_7_9 = new JLabel("Sneak Atk Avg Dmg");
		lblNewLabel_2_7_9.setBounds(10, 277, 169, 14);
		npcTab3.add(lblNewLabel_2_7_9);
		
		npc3Sneak = new JTextField();
		npc3Sneak.setColumns(10);
		npc3Sneak.setBounds(204, 274, 131, 20);
		npcTab3.add(npc3Sneak);
		
		JLabel lblNewLabel_2_7_1_6 = new JLabel("Extra Crit Dmg");
		lblNewLabel_2_7_1_6.setBounds(10, 312, 169, 14);
		npcTab3.add(lblNewLabel_2_7_1_6);
		
		npc3CritDmg = new JTextField();
		npc3CritDmg.setColumns(10);
		npc3CritDmg.setBounds(204, 309, 131, 20);
		npcTab3.add(npc3CritDmg);
		
		JLabel lblNewLabel_2_7_2_6 = new JLabel("Extra Crit Attack (true/false)");
		lblNewLabel_2_7_2_6.setBounds(10, 348, 169, 14);
		npcTab3.add(lblNewLabel_2_7_2_6);
		
		npc3XCrit = new JTextField();
		npc3XCrit.setText("false");
		npc3XCrit.setColumns(10);
		npc3XCrit.setBounds(204, 345, 131, 20);
		npcTab3.add(npc3XCrit);
		
		JLabel lblNewLabel_2_7_3_6 = new JLabel("Improved Critical (true/false)");
		lblNewLabel_2_7_3_6.setBounds(10, 384, 169, 14);
		npcTab3.add(lblNewLabel_2_7_3_6);
		
		npc3ImpCrit = new JTextField();
		npc3ImpCrit.setText("false");
		npc3ImpCrit.setColumns(10);
		npc3ImpCrit.setBounds(204, 381, 131, 20);
		npcTab3.add(npc3ImpCrit);
		
		npc3HP = new JTextField();
		npc3HP.setColumns(10);
		npc3HP.setBounds(204, 39, 131, 20);
		npcTab3.add(npc3HP);
		
		npc3AC = new JTextField();
		npc3AC.setColumns(10);
		npc3AC.setBounds(204, 73, 131, 20);
		npcTab3.add(npc3AC);
		
		JLabel lblNewLabel_2_3_1_4_4 = new JLabel("Character AC");
		lblNewLabel_2_3_1_4_4.setBounds(10, 76, 169, 14);
		npcTab3.add(lblNewLabel_2_3_1_4_4);
		
		JLabel lblNewLabel_2_3_5_4 = new JLabel("Health");
		lblNewLabel_2_3_5_4.setBounds(10, 42, 169, 14);
		npcTab3.add(lblNewLabel_2_3_5_4);
		
		JLabel lblNewLabel_2_7_1_4_1_2 = new JLabel("How many?");
		lblNewLabel_2_7_1_4_1_2.setBounds(10, 416, 169, 14);
		npcTab3.add(lblNewLabel_2_7_1_4_1_2);
		
		npc3Amount = new JTextField();
		npc3Amount.setColumns(10);
		npc3Amount.setBounds(204, 413, 131, 20);
		npcTab3.add(npc3Amount);
		
		JLabel lblNpcGroupDpr = new JLabel("NPC Group DPR");
		lblNpcGroupDpr.setHorizontalAlignment(SwingConstants.CENTER);
		lblNpcGroupDpr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNpcGroupDpr.setBounds(359, 132, 179, 28);
		victoryPrediction.getContentPane().add(lblNpcGroupDpr);
		
		npcDPR = new JTextField();
		npcDPR.setHorizontalAlignment(SwingConstants.CENTER);
		npcDPR.setColumns(10);
		npcDPR.setBounds(405, 171, 86, 20);
		victoryPrediction.getContentPane().add(npcDPR);
		
		rounds = new JTextField();
		rounds.setHorizontalAlignment(SwingConstants.CENTER);
		rounds.setColumns(10);
		rounds.setBounds(405, 255, 86, 20);
		victoryPrediction.getContentPane().add(rounds);
		
		JLabel lblRounds = new JLabel("Rounds Fought");
		lblRounds.setHorizontalAlignment(SwingConstants.CENTER);
		lblRounds.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRounds.setBounds(359, 216, 179, 28);
		victoryPrediction.getContentPane().add(lblRounds);
		
		winner = new JTextField();
		winner.setHorizontalAlignment(SwingConstants.CENTER);
		winner.setColumns(10);
		winner.setBounds(405, 338, 86, 20);
		victoryPrediction.getContentPane().add(winner);
		
		JLabel lblWinners = new JLabel("Winners");
		lblWinners.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinners.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWinners.setBounds(359, 299, 179, 28);
		victoryPrediction.getContentPane().add(lblWinners);
	}
}
