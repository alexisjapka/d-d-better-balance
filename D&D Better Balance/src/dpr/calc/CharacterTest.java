package dpr.calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterTest {
	
	private static final double DELTA = 1e-15;

	@Test //U-4
	public void dprTest() {
		Character.PC sPC = new Character.PC();
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
		
		assertEquals(48.41, sPC.DPR(), DELTA);
	}
	
	@Test //U-5
	public void chanceToHitTest() {
		Character.PC sPC = new Character.PC();
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
		
		assertEquals(65, sPC.chanceToHit(), DELTA);
	}
	
	@Test //U-6
	public void chanceToHitAdTest() {
		Character.PC sPC = new Character.PC();
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
		
		assertEquals(87.75, sPC.advantageChanceToHit(), DELTA);
	}
	
	@Test //U-8
	public void roundOff() {
		Character.PC sPC = new Character.PC();
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
		
		assertEquals(75, sPC.chanceToHit(), DELTA);
	}
	
	@Test //U-7
	public void multiple() {
		Character.PC PC1 = new Character.PC();
		PC1.name = "John Doe";
		
		Character.PC PC2 = new Character.PC();
		PC2.name = "Balthazar";
		
		assertEquals("John Doe", PC1.name);
		assertEquals("Balthazar", PC2.name);
	}
	
	@Test //U-1
	public void pcEdit() {
		Character.PC test = new Character.PC();
		test.name = "Phil";
		
		assertEquals("Phil", test.name);
	}
	
	@Test //U-3
	public void npcEdit() {
		Character.NPC test = new Character.NPC();
		test.name = "Sarah";
		
		assertEquals("Sarah", test.name);
	}
	
	@Test //U-22
	public void npcCheckTest() {
		Character.NPC sNPC = new Character.NPC();
		sNPC.name = "Fire";
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
		
		assertEquals(12.5, sNPC.DPR(), DELTA);
	}
	
	@Test //U-23
	public void npcCheck2Test() {
		Character.NPC sNPC = new Character.NPC();
		sNPC.name = "Fire";
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
		
		assertEquals(45, sNPC.chanceToHit(), DELTA);
	}
	
	@Test //U-22
	public void npcCheck3Test() {
		Character.NPC sNPC = new Character.NPC();
		sNPC.name = "Fire";
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
		
		assertEquals(69.75, sNPC.advantageChanceToHit(), DELTA);
	}

}
