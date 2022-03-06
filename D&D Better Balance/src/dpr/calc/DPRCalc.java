package dpr.calc;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

//Contains group DPR methods and calculations
public class DPRCalc {
	
	//Much of this is for testing purposes currently
	public static void main(String[] args) {
		
		Character.PC pc1 = new Character.PC();
		Character.PC pc2 = new Character.PC();
		Character.PC pc3 = new Character.PC();
		Character.PC pc4 = new Character.PC();
		Character.NPC npc1 = new Character.NPC();
		
		samplePC1(pc1);
		pc1.display();
		System.out.println();
		
		samplePC2(pc2);
		pc2.display();
		System.out.println();
		
		samplePC3(pc3);
		pc3.display();
		System.out.println();
		
		samplePC4(pc4);
		pc4.display();
		System.out.println();
		
		sampleNPC1(npc1);
		npc1.display();
		System.out.println();
		
		ArrayList<Character.PC> PCG = new ArrayList<Character.PC>();
		ArrayList<Character.NPC> NPCG = new ArrayList<Character.NPC>();
		
		PCG.add(pc1);
		PCG.add(pc2);
		PCG.add(pc3);
		PCG.add(pc4);
		NPCG.add(npc1);
		NPCG.add(npc1);
		NPCG.add(npc1);
		NPCG.add(npc1);
		NPCG.add(npc1);
		
		for(int i = 0; i < PCG.size(); i++){
			System.out.println(PCG.get(i).name);
		}
		
		System.out.println();

		for(int i = 0; i < NPCG.size(); i++){
			System.out.println(NPCG.get(i).name);
		}
		
		System.out.println();
		System.out.println("Party Stock GDPR is: " + gdprPC(PCG));
		System.out.println("Monster Stock GDPR is: " + gdprNPC(NPCG));
		System.out.println("Party Average AC is: " + avgACPC(PCG));
		System.out.println("Monster Average AC is: " + avgACNPC(NPCG));
		
		System.out.println();
		System.out.println(victory(PCG, NPCG));
		
		System.out.println();
		System.out.println("Rounds PC: " + hpNPC(NPCG)/gdprPC(PCG));
		System.out.println("Rounds NPC: " + hpPC(PCG)/gdprNPC(NPCG));
		
		System.out.println();
		System.out.println("Party Adjusted GDPR is: " + gdprPC(PCG));
		System.out.println("Monster Adjusted GDPR is: " + gdprNPC(NPCG));
		System.out.println("Party Adjusted Target AC: " + PCG.get(0).targetArmorClass);
		System.out.println("Monster Adjusted Target AC: " + NPCG.get(0).targetArmorClass);
		
	}
	
	//Victory prediction
	public static String victory(ArrayList<Character.PC> pc, ArrayList<Character.NPC> npc) {
		String result = "Players Win";
		
		for(int i = 0; i < pc.size(); i++){
			pc.get(i).targetArmorClass = avgACNPC(npc);
		}
		
		for(int i = 0; i < npc.size(); i++){
			npc.get(i).targetArmorClass = avgACPC(pc);
		}
		
		//Victory is predicted by who will be eliminated in fewest rounds
		double roundsPC = hpNPC(npc)/gdprPC(pc);
		double roundsNPC = hpPC(pc)/gdprNPC(npc);
		
		if (roundsNPC < roundsPC)
			result = "Monsters Win";
		
		return result;
	}
	
	//Group total HP
	public static double hpPC(ArrayList<Character.PC> g) {
		double dam = 0;
		for(int i = 0; i < g.size(); i++){
			dam = dam + g.get(i).HP;
		}
		double roundedDam = Math.round(dam*100.0)/100.0;
		return roundedDam;
	}
	
	public static double hpNPC(ArrayList<Character.NPC> g) {
		double dam = 0;
		for(int i = 0; i < g.size(); i++){
			dam = dam + g.get(i).HP;
		}
		double roundedDam = Math.round(dam*100.0)/100.0;
		return roundedDam;
	}
	
	//Group DPR calculators
	public static double gdprPC(ArrayList<Character.PC> g) {
		double dam = 0;
		for(int i = 0; i < g.size(); i++){
			dam = dam + g.get(i).HP;
		}
		double roundedDam = Math.round(dam*100.0)/100.0;
		return roundedDam;
	}
	
	public static double gdprNPC(ArrayList<Character.NPC> g) {
		double dam = 0;
		for(int i = 0; i < g.size(); i++){
			dam = dam + g.get(i).DPR();
		}
		double roundedDam = Math.round(dam*100.0)/100.0;
		return roundedDam;
	}
	
	//Group average AC
	public static double avgACPC(ArrayList<Character.PC> g) {
		double ac = 0;
		for(int i = 0; i < g.size(); i++){
			ac = ac + g.get(i).armorClass;
		}
		ac = ac/g.size();
		double roundedAC = Math.round(ac*100.0)/100.0;
		return roundedAC;
	}
	
	public static double avgACNPC(ArrayList<Character.NPC> g) {
		double ac = 0;
		for(int i = 0; i < g.size(); i++){
			ac = ac + g.get(i).armorClass;
		}
		ac = ac/g.size();
		double roundedAC = Math.round(ac*100.0)/100.0;
		return roundedAC;
	}
	
	//Set values of a Character to a sample set, used for testing
	private static void samplePC1(Character.PC sPC) {
		sPC.name = "John Doe";
		sPC.characterClass = "Fighter";
		sPC.HP = 120;
		sPC.attackBonus = 14;
		sPC.armorClass = 20;
		sPC.targetArmorClass = 20;
		sPC.avgDiceDmg = 8;
		sPC.dmgModifier = 10;
		sPC.attacksPerRound = 3;
		sPC.sneakAvgAttackDmg = 0;
		sPC.extraCritDmg = 5;
		sPC.extraCritAttack = true;
		sPC.improvedCrit = true;
	}
	
	//Set values of a Character to a sample set, used for testing
	private static void samplePC2(Character.PC sPC) {
		sPC.name = "Balthazar";
		sPC.characterClass = "Warlock";
		sPC.HP = 30;
		sPC.attackBonus = 14;
		sPC.armorClass = 14;
		sPC.targetArmorClass = 22;
		sPC.avgDiceDmg = 9;
		sPC.dmgModifier = 5;
		sPC.attacksPerRound = 4;
		sPC.sneakAvgAttackDmg = 0;
		sPC.extraCritDmg = 0;
		sPC.extraCritAttack = false;
		sPC.improvedCrit = false;
	}
	
	//Set values of a Character to a sample set, used for testing
	private static void samplePC3(Character.PC sPC) {
		sPC.name = "Martin";
		sPC.characterClass = "Rogue";
		sPC.HP = 40;
		sPC.attackBonus = 14;
		sPC.armorClass = 18;
		sPC.targetArmorClass = 22;
		sPC.avgDiceDmg = 18;
		sPC.dmgModifier = 8;
		sPC.attacksPerRound = 1;
		sPC.sneakAvgAttackDmg = 35;
		sPC.extraCritDmg = 0;
		sPC.extraCritAttack = false;
		sPC.improvedCrit = false;
	}
	
	//Set values of a Character to a sample set, used for testing
	private static void samplePC4(Character.PC sPC) {
		sPC.name = "Agony";
		sPC.characterClass = "Paladin";
		sPC.HP = 100;
		sPC.attackBonus = 11;
		sPC.armorClass = 18;
		sPC.targetArmorClass = 20;
		sPC.avgDiceDmg = 16;
		sPC.dmgModifier = 10;
		sPC.attacksPerRound = 2;
		sPC.sneakAvgAttackDmg = 0;
		sPC.extraCritDmg = 0;
		sPC.extraCritAttack = false;
		sPC.improvedCrit = false;
	}
	
	//Set values of a Character to a sample set, used for testing
	private static void sampleNPC1(Character.NPC sNPC) {
		sNPC.name = "Earth Elemental";
		sNPC.characterClass = "Monster";
		sNPC.HP = 126;
		sNPC.attackBonus = 8;
		sNPC.armorClass = 17;
		sNPC.targetArmorClass = 20;
		sNPC.avgDiceDmg = 8;
		sNPC.dmgModifier = 5;
		sNPC.attacksPerRound = 2;
		sNPC.sneakAvgAttackDmg = 0;
		sNPC.extraCritDmg = 0;
		sNPC.extraCritAttack = false;
		sNPC.improvedCrit = false;
	}
}