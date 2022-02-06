package dpr.calc;

import java.util.*;
import java.lang.*;
import java.io.*;

public class PlayerCharacter {
	
	public static String name = "Player Character";		//character name for reference
	public static String characterClass = "Fighter";	//character class for reference
	public static int attackBonus = 0;					//modifier to hit
	public static int armorClass = 10;					//armor class of character
	public static int targetArmorClass = 10;			//armor class of target that is being hit
	public static double avgDiceDmg = 3;				//average value of the damage dice without modifiers
	public static int dmgModifier = 0;					//modifier to each damage roll
	public static int attacksPerRound = 1;				//attacks per round
	public static double sneakAvgAttackDmg = 0;			//optional sneak attack
	public static double extraCritDmg = 0;				//optional extra crit damage
	public static boolean extraCritAttack = false;		//optional extra crit attack
	public static boolean improvedCrit = false;			//improved critical toggle
	public static double critChance = 0.05;				//chance of critical hit normally 5%, 10% if improvedCrit = true
	
	//Player character object
	public static void main(String[] args) {
		
		//check for improved critical
		if(improvedCrit == true)
			critChance = 0.1;
		else
			critChance = 0.05;
		
		//display();
		System.out.println("Chance to Hit: "+chanceToHit()+"%");
		System.out.println("Chance to Hit with Advantage: "+advantageChanceToHit()+"%");
		System.out.println("Damage Per Round: "+DPR());
		
	}
	
	//chance to hit the target AC
	public static double chanceToHit() {
		double chance = (21+attackBonus-targetArmorClass)*5;
		double roundedChance = Math.round(chance*100.0)/100.0;
		return roundedChance;
	}
	
	//chance to hit the target AC with advantage (two dice rolls instead of one)
	public static double advantageChanceToHit() {
		double chanceToHit = (21+attackBonus-targetArmorClass)*0.05;
		double chance = (1-((1-chanceToHit) * (1-chanceToHit)))*100;
		double roundedChance = Math.round(chance*100.0)/100.0;
		return roundedChance;
	}
	
	//Average Damage Per Round
	public static double DPR() {
		double chanceToHit = (21+attackBonus-targetArmorClass)*0.05;
		double chanceToHitOnce = 1- Math.pow((1-chanceToHit), attacksPerRound);
		double chanceToCritOnce = 1- Math.pow((1-chanceToHit), critChance);
		double avgDmgPerHit = avgDiceDmg + dmgModifier;
		double avgDmgPerCrit = (avgDiceDmg*2)+dmgModifier+extraCritDmg;
		double chance = 0;
		
		if (extraCritAttack == false) {
			chance = (((chanceToHit-critChance) * avgDmgPerHit) + (critChance*avgDmgPerCrit)) * attacksPerRound
					+ ((chanceToHitOnce-chanceToCritOnce)*sneakAvgAttackDmg) + (chanceToCritOnce*sneakAvgAttackDmg*2);
		}
		else {
			chance = (((chanceToHit-critChance) * avgDmgPerHit) + (critChance*avgDmgPerCrit)) * (attacksPerRound*chanceToCritOnce)
					+ ((chanceToHitOnce-chanceToCritOnce)*sneakAvgAttackDmg);
		}
		
		double roundedChance = Math.round(chance*100.0)/100.0;
		return roundedChance;
	}
	
	//output the value of each variable of PlayerCharacter
	public static void display() {
		System.out.println("Character Name = " + name);
		System.out.println("Class = " + characterClass);
		System.out.println("Attack Bonus = " + attackBonus);
		System.out.println("Armor Class (AC) = " + armorClass);
		System.out.println("Target Armor Class (AC) = " + targetArmorClass);
		System.out.println("Average Dice Damage = " + avgDiceDmg);
		System.out.println("Damage Modifer = " + dmgModifier);
		System.out.println("Number of Attacks per Round = " + attacksPerRound);
		System.out.println("Sneak Attack Average Damage = " + sneakAvgAttackDmg);
		System.out.println("Extra Damage on Critical Hit = " + extraCritDmg);
		System.out.println("Improved Critical (true/false) = " + improvedCrit);
		System.out.println("Chance of Critical Hit = " + critChance);
		
	}
}
