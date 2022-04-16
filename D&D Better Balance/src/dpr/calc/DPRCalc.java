package dpr.calc;

import java.util.*;
import dpr.calc.Character;

//Contains group DPR methods and calculations
public class DPRCalc {
	
	public static void main(String[] args) {
		
	}
	
	//Numeric check
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	//Boolean check
	public static boolean isBoolean(String str) {
	    if (str.equals("false")) {
	        return true;
	    }
	    else if(str.equals("true")) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
	
	//Victory prediction
	public static String victory(ArrayList<Character.PC> pc, ArrayList<Character.NPC> npc) {
		String result = "Players";
		
		for(int i = 0; i < pc.size(); i++){
			pc.get(i).targetArmorClass = avgACNPC(npc);
		}
		
		for(int i = 0; i < npc.size(); i++){
			npc.get(i).targetArmorClass = avgACPC(pc);
		}
		
		//Victory is predicted by who will be eliminated in fewest rounds
		double roundsPC = hpNPC(npc)/gdprPC(pc);
		double roundsNPC = hpPC(pc)/gdprNPC(npc);
		
		//benefit of doubt is given to the PCs
		if (roundsNPC < roundsPC)
			result = "Monsters";
		
		return result;
	}
	
	//Number of rounds fought
	public static int rounds(ArrayList<Character.PC> pc, ArrayList<Character.NPC> npc) {
		double rounds = 0;
		
		for(int i = 0; i < pc.size(); i++){
			pc.get(i).targetArmorClass = avgACNPC(npc);
		}
		
		for(int i = 0; i < npc.size(); i++){
			npc.get(i).targetArmorClass = avgACPC(pc);
		}
		
		double roundsPC = hpNPC(npc)/gdprPC(pc);
		double roundsNPC = hpPC(pc)/gdprNPC(npc);
		
		//benefit of doubt is given to the PCs
		if (roundsNPC < roundsPC)
			rounds = roundsNPC;
		else
			rounds = roundsPC;
		
		int result = (int)Math.round(rounds);
		
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
			dam = dam + g.get(i).DPR();
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
	
	//all below methods are for testing purposes
	public static void samplePC1(Character.PC sPC) {
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
	public static void samplePC2(Character.PC sPC) {
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
	public static void samplePC3(Character.PC sPC) {
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
	public static void samplePC4(Character.PC sPC) {
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
	public static void sampleNPC1(Character.NPC sNPC) {
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