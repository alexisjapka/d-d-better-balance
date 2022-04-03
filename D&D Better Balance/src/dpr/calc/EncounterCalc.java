package dpr.calc;

import java.util.*;

import dpr.calc.Character;

public class EncounterCalc {
	
	public static void main(String[] args) {
		
		System.out.println(xpEasy(2));
		System.out.println(xpHard(7));
		
	}
	
	//xp threshold by level (easy encounter)
	public static int xpEasy(int level) {
		int l = level;
		int xp = 0;
		
		if(l == 1)
			xp = 25;
		else if(l == 2)
			xp = 50;
		else if(l == 3)
			xp = 75;
		else if(l == 4)
			xp = 125;
		else if(l == 5)
			xp = 250;
		else if(l == 6)
			xp = 300;
		else if(l == 7)
			xp = 350;
		else if(l == 8)
			xp = 450;
		else if(l == 9)
			xp = 550;
		else if(l == 10)
			xp = 600;
		else if(l == 11)
			xp = 800;
		else if(l == 12)
			xp = 1000;
		else if(l == 13)
			xp = 1100;
		else if(l == 14)
			xp = 1250;
		else if(l == 15)
			xp = 1400;
		else if(l == 16)
			xp = 1600;
		else if(l == 17)
			xp = 2000;
		else if(l == 18)
			xp = 2100;
		else if(l == 19)
			xp = 2400;
		else
			xp = 2800;
		
		return xp;
	}
	
	//xp threshold by level (easy encounter)
	public static int xpHard(int level) {
		int l = level;
		int xp = 0;
		
		if(l == 1)
			xp = 75;
		else if(l == 2)
			xp = 150;
		else if(l == 3)
			xp = 225;
		else if(l == 4)
			xp = 375;
		else if(l == 5)
			xp = 750;
		else if(l == 6)
			xp = 900;
		else if(l == 7)
			xp = 1100;
		else if(l == 8)
			xp = 1400;
		else if(l == 9)
			xp = 1600;
		else if(l == 10)
			xp = 1900;
		else if(l == 11)
			xp = 2400;
		else if(l == 12)
			xp = 3000;
		else if(l == 13)
			xp = 3400;
		else if(l == 14)
			xp = 3800;
		else if(l == 15)
			xp = 4300;
		else if(l == 16)
			xp = 4800;
		else if(l == 17)
			xp = 5900;
		else if(l == 18)
			xp = 6300;
		else if(l == 19)
			xp = 7300;
		else
			xp = 8500;
		
		return xp;
	}

}
