package ams.com.dao;

import ams.com.annotations.Dao;

@Dao
public class TeamCheckerDAO {
	
	static Integer ARS = 0;
	static Integer AVL = 0;
	static Integer BOU = 0;
	static Integer BRE = 0;
	static Integer BHA = 0;
	static Integer CHE = 0;
	static Integer CRY = 0; 
	static Integer EVE = 0;
	static Integer FUL = 0;
	static Integer LEE = 0;
	static Integer LEI = 0;
	static Integer LIV = 0;
	static Integer MCI = 0;
	static Integer MUN = 0;
	static Integer NEW = 0;
	static Integer NFO = 0;
	static Integer SOU = 0;
	static Integer TOT = 0;
	static Integer WHU = 0;
	static Integer WOL = 0;
	
	public boolean hasReachedLimit(Integer team) {
		switch (team) {
		case 1: 
			ARS++;
			return hasReachedThrashold(ARS);
			
		case 2: 
			AVL++;
			return hasReachedThrashold(AVL);
		
		case 3: 
			BOU++;
			return hasReachedThrashold(BOU);
		
		case 4: 
			BRE++;
			return hasReachedThrashold(BRE);
		
		case 5: 
			BHA++;
			return hasReachedThrashold(BHA);
		
		case 6: 
			CHE++;
			return hasReachedThrashold(CHE);
		
		case 7: 
			CRY++;
			return hasReachedThrashold(CRY);
		
		case 8: 
			EVE++;
			return hasReachedThrashold(EVE);
		
		case 9: 
			FUL++;
			return hasReachedThrashold(FUL);
		
		case 10: 
			LEE++;
			return hasReachedThrashold(LEE);
		
		case 11: 
			LEI++;
			return hasReachedThrashold(LEI);
		
		case 12: 
			LIV++;
			return hasReachedThrashold(LIV);
		
		case 13: 
			MCI++;
			return hasReachedThrashold(MCI);
		
		case 14: 
			MUN++;
			return hasReachedThrashold(MUN);
		
		case 15: 
			NEW++;
			return hasReachedThrashold(NEW);
		
		case 16: 
			NFO++;
			return hasReachedThrashold(NFO);
		
		case 17: 
			SOU++;
			return hasReachedThrashold(SOU);
		
		case 18: 
			TOT++;
			return hasReachedThrashold(TOT);
		
		case 19: 
			WHU++;
			return hasReachedThrashold(WHU);
		
		case 20: 
			WOL++;
			return hasReachedThrashold(WOL);
		
		default:
			break;
			
		}
		return false;
	}
	
	public boolean hasReachedThrashold(int value) {
		return (value <= 3);
	}
}
