package dpr.calc;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DPRCalcTest {
	
	private static final Character.PC pc1 = new Character.PC();
	private static final Character.PC pc2 = new Character.PC();
	private static final Character.PC pc3 = new Character.PC();
	private static final Character.PC pc4 = new Character.PC();
	private static final Character.NPC npc1 = new Character.NPC();

	@Test //U-10
	public void victoryPredictionTest() {
		ArrayList<Character.PC> PCG = new ArrayList<Character.PC>();
		ArrayList<Character.NPC> NPCG = new ArrayList<Character.NPC>();
		DPRCalc.samplePC1(pc1);
		DPRCalc.samplePC2(pc2);
		DPRCalc.samplePC3(pc3);
		DPRCalc.samplePC4(pc4);
		DPRCalc.sampleNPC1(npc1);
		
		PCG.add(pc1);
		PCG.add(pc2);
		PCG.add(pc3);
		PCG.add(pc4);
		
		NPCG.add(npc1);
		NPCG.add(npc1);
		NPCG.add(npc1);
		NPCG.add(npc1);
		
		assertEquals("Players", DPRCalc.victory(PCG, NPCG));
	}
	
	@Test //U-25
	public void victoryPredictionTest2() {
		ArrayList<Character.PC> PCG = new ArrayList<Character.PC>();
		ArrayList<Character.NPC> NPCG = new ArrayList<Character.NPC>();
		DPRCalc.samplePC1(pc1);
		DPRCalc.samplePC2(pc2);
		DPRCalc.samplePC3(pc3);
		DPRCalc.samplePC4(pc4);
		DPRCalc.sampleNPC1(npc1);
		
		PCG.add(pc1);
		PCG.add(pc2);
		PCG.add(pc3);
		PCG.add(pc4);
		
		NPCG.add(npc1);
		NPCG.add(npc1);
		NPCG.add(npc1);
		NPCG.add(npc1);
		NPCG.add(npc1);
		NPCG.add(npc1);
		NPCG.add(npc1);
		
		assertEquals("Monsters", DPRCalc.victory(PCG, NPCG));
	}

	@Test //U-26
	public void roundsTest() {
		ArrayList<Character.PC> PCG = new ArrayList<Character.PC>();
		ArrayList<Character.NPC> NPCG = new ArrayList<Character.NPC>();
		DPRCalc.samplePC1(pc1);
		DPRCalc.samplePC2(pc2);
		DPRCalc.samplePC3(pc3);
		DPRCalc.samplePC4(pc4);
		DPRCalc.sampleNPC1(npc1);
		
		PCG.add(pc1);
		PCG.add(pc2);
		PCG.add(pc3);
		PCG.add(pc4);
		
		NPCG.add(npc1);
		NPCG.add(npc1);
		NPCG.add(npc1);
		NPCG.add(npc1);
		
		assertEquals(2, DPRCalc.rounds(PCG, NPCG));
	}
	
	@Test //U-9
	public void groupDprTest() {
		ArrayList<Character.PC> PCG = new ArrayList<Character.PC>();
		PCG.add(pc1);
		PCG.add(pc2);
		PCG.add(pc3);
		assertEquals(3, PCG.size());
	}
	
	@Test //U-21
	public void sizeTest() {
		ArrayList<Character.PC> PCG = new ArrayList<Character.PC>();
		PCG.add(pc1);
		PCG.add(pc2);
		PCG.add(pc3);
		PCG.add(pc4);
		PCG.add(pc2);
		PCG.add(pc3);
		PCG.add(pc4);
		assertEquals(7, PCG.size());
	}
	
	@Test //U-11
	public void numberNoTest() {
		assertEquals(false, DPRCalc.isNumeric("test"));
	}
	
	@Test //U-12
	public void boolNoTest() {
		assertEquals(false, DPRCalc.isBoolean("test"));
	}
	
	@Test //U-13
	public void numberYesTest() {
		assertEquals(true, DPRCalc.isNumeric("10"));
	}
	
	@Test //U-14
	public void boolYesTest() {
		assertEquals(true, DPRCalc.isBoolean("true"));
	}

}
