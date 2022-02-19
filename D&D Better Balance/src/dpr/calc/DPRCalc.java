package dpr.calc;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class DPRCalc {
	
	public static void main(String[] args) {
		
		
		PlayerCharacter pc1 = new PlayerCharacter();
		samplePC1(pc1);
		//pc1.changeName("Bob");
		
		PlayerCharacter pc2 = new PlayerCharacter();
		samplePC2(pc2);
		
		PlayerCharacter pc3 = new PlayerCharacter();
		samplePC3(pc3);
		
		pc1.display();
		System.out.println();
		pc2.display();
		System.out.println();
		pc3.display();
		System.out.println();
	}
	
	//Set values of a PlayerCharacter to a sample set, used for testing
	private static void samplePC1(PlayerCharacter sPC1) {
		sPC1.changeName("John Doe");
		sPC1.characterClass = "Fighter";
		sPC1.attackBonus = 3;
		sPC1.armorClass = 10;
		sPC1.targetArmorClass = 12;
		sPC1.avgDiceDmg = 4;
		sPC1.dmgModifier = 6;
		sPC1.attacksPerRound = 1;
		sPC1.sneakAvgAttackDmg = 0;
		sPC1.extraCritDmg = 2;
		sPC1.extraCritAttack = true;
		sPC1.improvedCrit = true;
	}
	
	//Set values of a PlayerCharacter to a sample set, used for testing
	private static void samplePC2(PlayerCharacter sPC2) {
		sPC2.changeName("Balthazar");
		sPC2.characterClass = "Warlock";
		sPC2.attackBonus = 14;
		sPC2.armorClass = 14;
		sPC2.targetArmorClass = 22;
		sPC2.avgDiceDmg = 9;
		sPC2.dmgModifier = 5;
		sPC2.attacksPerRound = 4;
		sPC2.sneakAvgAttackDmg = 0;
		sPC2.extraCritDmg = 0;
		sPC2.extraCritAttack = false;
		sPC2.improvedCrit = false;
	}
	
	//Set values of a PlayerCharacter to a sample set, used for testing
	private static void samplePC3(PlayerCharacter sPC3) {
		sPC3.name = "Martin";
		sPC3.characterClass = "Rogue";
		sPC3.attackBonus = 14;
		sPC3.armorClass = 18;
		sPC3.targetArmorClass = 22;
		sPC3.avgDiceDmg = 18;
		sPC3.dmgModifier = 8;
		sPC3.attacksPerRound = 1;
		sPC3.sneakAvgAttackDmg = 35;
		sPC3.extraCritDmg = 0;
		sPC3.extraCritAttack = false;
		sPC3.improvedCrit = false;
	}
	
}
