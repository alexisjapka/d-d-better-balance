package dpr.calc;

import java.util.*;

import dpr.calc.Character;

public class EncounterCalc {
	
	public static void main(String[] args) {
		
	}
	
	public static boolean isInt(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	//recommends CR for an easy encounter
	public static String recommendEasy(int a, int b, int c, int d, int m) {
		String result = "";
		
		double thresh = xpEasy(a) + xpEasy(b) + xpEasy(c) + xpEasy(d);
		
		thresh = thresh/multiplier(m);
		result = crNPC(thresh);
		
		return result;
	}
	
	//recommends CR for an hard encounter
	public static String recommendHard(int a, int b, int c, int d, int m) {
		String result = "";
		
		double thresh = xpHard(a) + xpHard(b) + xpHard(c) + xpHard(d);
		
		thresh = thresh/multiplier(m);
		result = crNPC(thresh);
		
		return result;
	}
	
	public static double multiplier(int n) {
		double mult = 0;
		
		if(n == 0)
			mult = 0;
		else if(n == 1)
			mult = 1;
		else if(n == 2)
			mult = 1.5;
		else if(n <= 6)
			mult = 2;
		else if(n <= 10)
			mult = 2.5;
		else if(n <= 14)
			mult = 3;
		else
			mult = 4;
		
		return mult;
	}
	
	//challenge rating result from NPC xp threshold
	public static String crNPC(double xp) {
		double l = xp;
		String cr = "0";
		
		if(l <= 10)
			cr = "0";
		else if(l <= 25)
			cr = "1/8";
		else if(l <= 50)
			cr = "1/4";
		else if(l <= 100)
			cr = "1/2";
		else if(l <= 200)
			cr = "1";
		else if(l <= 450)
			cr = "2";
		else if(l <= 700)
			cr = "3";
		else if(l <= 1100)
			cr = "4";
		else if(l <= 1800)
			cr = "5";
		else if(l <= 2300)
			cr = "6";
		else if(l <= 2900)
			cr = "7";
		else if(l <= 3900)
			cr = "8";
		else if(l <= 5000)
			cr = "9";
		else if(l <= 5900)
			cr = "10";
		else if(l <= 7200)
			cr = "11";
		else if(l <= 8400)
			cr = "12";
		else if(l <= 10000)
			cr = "13";
		else if(l <= 11500)
			cr = "14";
		else if(l <= 13000)
			cr = "15";
		else if(l <= 15000)
			cr = "16";
		else if(l <= 18000)
			cr = "17";
		else if(l <= 20000)
			cr = "18";
		else if(l <= 22000)
			cr = "19";
		else if(l <= 25000)
			cr = "20";
		else if(l <= 33000)
			cr = "21";
		else if(l <= 41000)
			cr = "22";
		else if(l <= 50000)
			cr = "23";
		else if(l <= 62000)
			cr = "24";
		else if(l <= 75000)
			cr = "25";
		else if(l <= 90000)
			cr = "26";
		else if(l <= 105000)
			cr = "27";
		else if(l <= 120000)
			cr = "28";
		else if(l <= 135000)
			cr = "29";
		else
			cr = "30";
		
		return cr;
	}
	
	//xp threshold by PC level (easy encounter)
	public static int xpEasy(int level) {
		int l = level;
		int xp = 0;
		
		if(l == 0)
			xp = 0;
		else if(l == 1)
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
	
	//xp threshold by PC level (hard encounter)
	public static int xpHard(int level) {
		int l = level;
		int xp = 0;
		
		if(l == 0)
			xp = 0;
		else if(l == 1)
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
