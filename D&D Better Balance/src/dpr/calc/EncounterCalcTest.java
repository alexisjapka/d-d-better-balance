package dpr.calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncounterCalcTest {

	@Test //U-15
	public void intYesTest() {
		assertEquals(true, EncounterCalc.isInt("10"));
	}
	
	@Test //U-16
	public void intNoTest() {
		assertEquals(false, EncounterCalc.isInt("true"));
	}
	
	@Test //U-17
	public void crEasy1() {
		assertEquals("1/2", EncounterCalc.recommendEasy(1, 2, 3, 4, 16));
	}
	
	@Test //U-18
	public void crEasy2() {
		assertEquals("4", EncounterCalc.recommendEasy(5, 6, 7, 8, 2));
	}
	
	@Test //U-19
	public void crEasy3() {
		assertEquals("5", EncounterCalc.recommendEasy(9, 10, 11, 12, 3));
	}
	
	@Test //U-20
	public void crEasy4() {
		assertEquals("5", EncounterCalc.recommendEasy(13, 14, 15, 16, 12));
	}
	
	@Test //U-27
	public void crEasy5() {
		assertEquals("13", EncounterCalc.recommendEasy(17, 18, 19, 20, 1));
	}
	
	@Test //U-28
	public void crHard1() {
		assertEquals("4", EncounterCalc.recommendHard(1, 2, 3, 4, 1));
	}
	
	@Test //U-29
	public void crHard2() {
		assertEquals("7", EncounterCalc.recommendHard(5, 6, 7, 8, 2));
	}
	
	@Test //U-30
	public void crHard3() {
		assertEquals("9", EncounterCalc.recommendHard(9, 10, 11, 12, 3));
	}
	
	@Test //U-31
	public void crHard4() {
		assertEquals("10", EncounterCalc.recommendHard(13, 14, 15, 16, 12));
	}
	
	@Test //U-32
	public void crHard5() {
		assertEquals("21", EncounterCalc.recommendHard(17, 18, 19, 20, 1));
	}

}
