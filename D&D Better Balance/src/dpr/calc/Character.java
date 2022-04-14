package dpr.calc;

public final class Character {
	
	public static final class PC {
		
		public String name = "";					//character name for reference
		public String characterClass = "";			//character class for reference
		public double attackBonus = 1;				//modifier to hit
		public double armorClass = 10;				//armor class of character
		public double targetArmorClass = 10;		//armor class of target that is being hit
		public double avgDiceDmg = 1;				//average value of the damage dice without modifiers
		public double dmgModifier = 1;				//modifier to each damage roll
		public double attacksPerRound = 1;			//attacks per round
		public double sneakAvgAttackDmg = 0;		//optional sneak attack
		public double extraCritDmg = 0;				//optional extra crit damage
		public boolean extraCritAttack = false;		//optional extra crit attack
		public boolean improvedCrit = false;		//improved critical toggle
		public double critChance = 0.05;			//chance of critical hit normally 5%, 10% if improvedCrit = true
		public double HP = 0;						//health
	
		//Player character object
		public void main(String[] args) {
			
		}
		
		//chance to hit the target AC
		public double chanceToHit() {
			double chance = (21+attackBonus-targetArmorClass)*5;
			double roundedChance = Math.round(chance*100.0)/100.0;
			return roundedChance;
		}
		
		//chance to hit the target AC with advantage (two dice rolls instead of one)
		public double advantageChanceToHit() {
			double chanceToHit = (21+attackBonus-targetArmorClass)*0.05;
			double chance = (1-((1-chanceToHit) * (1-chanceToHit)))*100;
			double roundedChance = Math.round(chance*100.0)/100.0;
			return roundedChance;
		}
		
		//Average Damage Per Round
		public double DPR() {
			if(improvedCrit == true)
				critChance = 0.1;
			else
				critChance = 0.05;
			
			double chanceToHit = (21+attackBonus-targetArmorClass)*0.05;
			double chanceToHitOnce = 1- Math.pow((1-chanceToHit), attacksPerRound);
			double chanceToCritOnce = 1- Math.pow((1-critChance), attacksPerRound);
			double avgDmgPerHit = avgDiceDmg + dmgModifier;
			double avgDmgPerCrit = (avgDiceDmg*2)+dmgModifier+extraCritDmg;
			double chance = 0;
			
			if (extraCritAttack == false) {
				chance = (((chanceToHit-critChance) * avgDmgPerHit) + (critChance*avgDmgPerCrit)) * attacksPerRound
						+ ((chanceToHitOnce-chanceToCritOnce)*sneakAvgAttackDmg) + (chanceToCritOnce*sneakAvgAttackDmg*2);
			}
			else if (extraCritAttack == true){
				chance = (((chanceToHit-critChance) * avgDmgPerHit) + (critChance*avgDmgPerCrit)) * (attacksPerRound+chanceToCritOnce)
						+ ((chanceToHitOnce-chanceToCritOnce)*sneakAvgAttackDmg);
			}
			
			double roundedChance = Math.round(chance*100.0)/100.0;
			return roundedChance;
		}
		
	}
	
	public static final class NPC {
		
		public String name = "";					//character name for reference
		public String characterClass = "";			//character class for reference
		public double attackBonus = 0;				//modifier to hit
		public double armorClass = 10;				//armor class of character
		public double targetArmorClass = 10;		//armor class of target that is being hit
		public double avgDiceDmg = 3;				//average value of the damage dice without modifiers
		public double dmgModifier = 0;				//modifier to each damage roll
		public double attacksPerRound = 1;			//attacks per round
		public double sneakAvgAttackDmg = 0;		//optional sneak attack
		public double extraCritDmg = 0;				//optional extra crit damage
		public boolean extraCritAttack = false;		//optional extra crit attack
		public boolean improvedCrit = false;		//improved critical toggle
		public double critChance = 0.05;			//chance of critical hit normally 5%, 10% if improvedCrit = true
		public double HP = 0;						//health
	
		//Non-Player character object
		public void main(String[] args) {
			
		}
		
		//chance to hit the target AC
		public double chanceToHit() {
			double chance = (21+attackBonus-targetArmorClass)*5;
			double roundedChance = Math.round(chance*100.0)/100.0;
			return roundedChance;
		}
		
		//chance to hit the target AC with advantage (two dice rolls instead of one)
		public double advantageChanceToHit() {
			double chanceToHit = (21+attackBonus-targetArmorClass)*0.05;
			double chance = (1-((1-chanceToHit) * (1-chanceToHit)))*100;
			double roundedChance = Math.round(chance*100.0)/100.0;
			return roundedChance;
		}
		
		//Average Damage Per Round
		public double DPR() {
			if(improvedCrit == true)
				critChance = 0.1;
			else
				critChance = 0.05;
			
			double chanceToHit = (21+attackBonus-targetArmorClass)*0.05;
			double chanceToHitOnce = 1- Math.pow((1-chanceToHit), attacksPerRound);
			double chanceToCritOnce = 1- Math.pow((1-critChance), attacksPerRound);
			double avgDmgPerHit = avgDiceDmg + dmgModifier;
			double avgDmgPerCrit = (avgDiceDmg*2)+dmgModifier+extraCritDmg;
			double chance = 0;
			
			if (extraCritAttack == false) {
				chance = (((chanceToHit-critChance) * avgDmgPerHit) + (critChance*avgDmgPerCrit)) * attacksPerRound
						+ ((chanceToHitOnce-chanceToCritOnce)*sneakAvgAttackDmg) + (chanceToCritOnce*sneakAvgAttackDmg*2);
			}
			else if (extraCritAttack == true){
				chance = (((chanceToHit-critChance) * avgDmgPerHit) + (critChance*avgDmgPerCrit)) * (attacksPerRound+chanceToCritOnce)
						+ ((chanceToHitOnce-chanceToCritOnce)*sneakAvgAttackDmg);
			}
			
			double roundedChance = Math.round(chance*100.0)/100.0;
			return roundedChance;
		}
	}

}