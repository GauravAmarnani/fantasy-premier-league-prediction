package ams.com.dao;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

import ams.com.annotations.Dao;
import ams.com.dto.Teams;

import java.time.LocalDateTime;

@Dao
public class FixtureDAO {

	private ArrayList<Teams> listOfTeams = new ArrayList<>();
	private HashMap<String, String> gameWeekStartTime = new HashMap<>();
	private ArrayList<HashMap<String, Integer>> teamFixtures = new ArrayList<>();

	final String GAMEWEEK_27_START_TIME = "2023/03/11 15:30";
	final String GAMEWEEK_28_START_TIME = "2023/03/17 23:00";
	final String GAMEWEEK_29_START_TIME = "2023/04/01 14:30";
	final String GAMEWEEK_30_START_TIME = "2023/04/08 14:30";
	final String GAMEWEEK_31_START_TIME = "2023/04/15 14:30";
	final String GAMEWEEK_32_START_TIME = "2023/04/21 22:00";
	final String GAMEWEEK_33_START_TIME = "2023/04/25 21:30";
	final String GAMEWEEK_34_START_TIME = "2023/04/29 14:30";
	final String GAMEWEEK_35_START_TIME = "2023/05/06 17:00";
	final String GAMEWEEK_36_START_TIME = "2023/05/13 17:00";
	final String GAMEWEEK_37_START_TIME = "2023/05/20 17:00";
	final String GAMEWEEK_38_START_TIME = "2023/05/28 18:30";

	public int getFixturePoints(int team) {
		int fixture = 0;
		ArrayList<String> currentGameWeeks = findCurrentGameWeeks();
		HashMap<String, Integer> ourTeamFixtures = teamFixtures.get(team-1);
		for(int i = 0; i < currentGameWeeks.size(); i++) 
				fixture += ourTeamFixtures.get(currentGameWeeks.get(i));
		return fixture;
	}

	public void initializeMap() {
		gameWeekStartTime.put("GAMEWEEK_27", GAMEWEEK_27_START_TIME);
		gameWeekStartTime.put("GAMEWEEK_28", GAMEWEEK_28_START_TIME);
		gameWeekStartTime.put("GAMEWEEK_29", GAMEWEEK_29_START_TIME);
		gameWeekStartTime.put("GAMEWEEK_30", GAMEWEEK_30_START_TIME);
		gameWeekStartTime.put("GAMEWEEK_31", GAMEWEEK_31_START_TIME);
		gameWeekStartTime.put("GAMEWEEK_32", GAMEWEEK_32_START_TIME);
		gameWeekStartTime.put("GAMEWEEK_33", GAMEWEEK_33_START_TIME);
		gameWeekStartTime.put("GAMEWEEK_34", GAMEWEEK_34_START_TIME);
		gameWeekStartTime.put("GAMEWEEK_35", GAMEWEEK_35_START_TIME);
		gameWeekStartTime.put("GAMEWEEK_36", GAMEWEEK_36_START_TIME);
		gameWeekStartTime.put("GAMEWEEK_37", GAMEWEEK_37_START_TIME);
		gameWeekStartTime.put("GAMEWEEK_38", GAMEWEEK_38_START_TIME);
	}

	public void initializeTeams() {
		for(int i = 1; i < 21; i++)
			listOfTeams.add(addTeams(i + ""));
	}

	public String getStartTime(String gameWeek) {
		initializeMap();
		return gameWeekStartTime.get(gameWeek);
	}


	public int checkTime(String start) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime currentTime = LocalDateTime.now();
		String currentTimeString = currentTime.format(dateTimeFormatter);
		LocalDateTime startTime = LocalDateTime.parse(start, dateTimeFormatter);
		LocalDateTime targetTime = LocalDateTime.parse(currentTimeString, dateTimeFormatter);
		if(targetTime.isBefore(startTime))
			return 1;
		else
			return -1;
	}

	public ArrayList<String> initializeList() {
		ArrayList<String> gameWeeksList = new ArrayList<>();
		for(int i = 27; i < 39; i++)
			gameWeeksList.add("GAMEWEEK_" + i);
		return gameWeeksList;
	}

	public ArrayList<String> findNextGameWeeks(String gameweek) {
		ArrayList<String> gameWeekList = initializeList();
		int index = gameWeekList.indexOf(gameweek);
		ArrayList<String> listOfNext = new ArrayList<>();
		for(int i = index; i < (index + 3) && i<gameWeekList.size(); i++)
			listOfNext.add(gameWeekList.get(i));
		return listOfNext;
	}

	public ArrayList<String> findCurrentGameWeeks() {
		ArrayList<String> gameWeekList = initializeList();
		for(int i = 0; i < gameWeekList.size(); i++) 
			if(checkTime(getStartTime(gameWeekList.get(i))) == 1) 
				return findNextGameWeeks(gameWeekList.get(i));
		return null;
	}

	public void initializeTeamFixtures() {
		for(int i = 1; i < 21; i++)
			teamFixtures.add(initializeEachTeamFixtures(i));
		System.gc();
	}
	
	public int getMyFixturePoints(String team, String teamAgainst) {
		int pos1 = 0, pos2 = 0;
		for(int i = 0; i < listOfTeams.size(); i++) {
			if(listOfTeams.get(i).equals(team))
				pos1 = listOfTeams.get(i).getPosition();
			if(listOfTeams.get(i).equals(teamAgainst))
				pos2 = listOfTeams.get(i).getPosition();
		}
		return (pos1 - pos2);
	}

	public HashMap<String, Integer> initializeEachTeamFixtures(int team) {
		initializeTeams();
		HashMap<String, Integer> eachTeamFixtures = new HashMap<>();
		switch(team) {
		case 1:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("ARS", "FUL"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("ARS", "CRY"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("ARS", "LEE"));
			return eachTeamFixtures;
		case 2:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("AVL", "WHU"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("AVL", "BOU"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("AVL", "CHE") + getMyFixturePoints("AVL", "LEI"));
			return eachTeamFixtures;
		case 3:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("BOU", "LIV"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("BOU", "AVL"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("BOU", "FUL") + getMyFixturePoints("BOU", "BHA"));
			return eachTeamFixtures;
		case 4:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("BRE", "EVE") + getMyFixturePoints("BOU", "SOU"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("BRE", "LEI"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("BRE", "BHA") + getMyFixturePoints("BOU", "MUN"));
			return eachTeamFixtures;
		case 5:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("BHA", "LEE") + getMyFixturePoints("BHA", "CRY"));
			eachTeamFixtures.put("GAMEWEEK_28", -50);//Blank Game Week.
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("BHA", "BRE") + getMyFixturePoints("BHA", "BOU"));
			return eachTeamFixtures;
		case 6:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("CHE", "LEI"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("CHE", "EVE"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("CHE", "LIV") + getMyFixturePoints("CHE", "AVL"));
			return eachTeamFixtures;
		case 7:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("CRY", "MCI") + getMyFixturePoints("CRY", "BHA"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("CRY", "ARS"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("CRY", "LEI"));
			return eachTeamFixtures;
		case 8:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("EVE", "BRE"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("EVE", "CHE"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("EVE", "TOT"));
			return eachTeamFixtures;
		case 9:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("FUL", "ARS"));
			eachTeamFixtures.put("GAMEWEEK_28", -50);
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("FUL", "BOU"));
			return eachTeamFixtures;
		case 10:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("LEE", "BHA"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("LEE", "WOL"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("LEE", "ARS") + getMyFixturePoints("LEE", "NFO"));
			return eachTeamFixtures;
		case 11:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("LEI", "CHE"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("LEI", "BRE"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("LEI", "CRY") + getMyFixturePoints("LEI", "AVL"));
			return eachTeamFixtures;
		case 12:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("LIV", "BOU"));
			eachTeamFixtures.put("GAMEWEEK_28", -50);
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("LIV", "MCI") + getMyFixturePoints("LIV", "CHE"));
			return eachTeamFixtures;
		case 13:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("MCI", "CRY"));
			eachTeamFixtures.put("GAMEWEEK_28", -50);
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("MCI", "LIV"));
			return eachTeamFixtures;
		case 14:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("MUN", "SOU"));
			eachTeamFixtures.put("GAMEWEEK_28", -50);
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("MUN", "NEW") + getMyFixturePoints("MUN", "BRE"));
			return eachTeamFixtures;
		case 15:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("NEW", "WOL"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("NEW", "NFO"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("NEW", "MUN") + getMyFixturePoints("NEW", "WHU"));
			return eachTeamFixtures;
		case 16:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("NFO", "TOT"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("NFO", "NEW"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("NFO", "WOL") + getMyFixturePoints("NFO", "LEE"));
			return eachTeamFixtures;
		case 17:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("SOU", "MUN") + getMyFixturePoints("SOU", "BRE"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("SOU", "TOT"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("SOU", "WHU"));
			return eachTeamFixtures;
		case 18:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("TOT", "NFO"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("TOT", "SOU"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("TOT", "EVE"));
			return eachTeamFixtures;
		case 19:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("WHU", "AVL"));
			eachTeamFixtures.put("GAMEWEEK_28", -50);
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("WHU", "SOU") + getMyFixturePoints("WHU", "NEW"));
			return eachTeamFixtures;
		case 20:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("WOL", "NEW"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("WOL", "LEE"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("WOL", "NFO"));
			return eachTeamFixtures;
		}
		return null;
	}

	public Teams addTeams(String number) {
		Teams teams = new Teams();
		switch(number) {
		case "1": 
			teams.setPosition(1);
			teams.setTeamName("ARS");
			teams.setAttack(10);
			teams.setDefense(10);
			return teams;
		case "2": 
			teams.setPosition(11);
			teams.setTeamName("AVL");
			teams.setAttack(6);
			teams.setDefense(5);
			return teams;
		case "3": 
			teams.setPosition(20);
			teams.setTeamName("BOU");
			teams.setAttack(2);
			teams.setDefense(3);
			return teams;
		case "4": 
			teams.setPosition(9);
			teams.setTeamName("BRE");
			teams.setAttack(7);
			teams.setDefense(6);
			return teams;
		case "5": 
			teams.setPosition(8);
			teams.setTeamName("BHA");
			teams.setAttack(7);
			teams.setDefense(6);
			return teams;
		case "6": 
			teams.setPosition(10);
			teams.setTeamName("CHE");
			teams.setAttack(4);
			teams.setDefense(7);
			return teams;
		case "7": 
			teams.setPosition(12);
			teams.setTeamName("CRY");
			teams.setAttack(3);
			teams.setDefense(5);
			return teams;
		case "8": 
			teams.setPosition(18);
			teams.setTeamName("EVE");
			teams.setAttack(4);
			teams.setDefense(5);
			return teams;
		case "9": 
			teams.setPosition(7);
			teams.setTeamName("FUL");
			teams.setAttack(7);
			teams.setDefense(6);
			return teams;
		case "10": 
			teams.setPosition(17);
			teams.setTeamName("LEE");
			teams.setAttack(4);
			teams.setDefense(3);
			return teams;
		case "11": 
			teams.setPosition(15);
			teams.setTeamName("LEI");
			teams.setAttack(7);
			teams.setDefense(4);
			return teams;
		case "12": 
			teams.setPosition(5);
			teams.setTeamName("LIV");
			teams.setAttack(9);
			teams.setDefense(6);
			return teams;
		case "13": 
			teams.setPosition(2);
			teams.setTeamName("MCI");
			teams.setAttack(10);
			teams.setDefense(8);
			return teams;
		case "14": 
			teams.setPosition(3);
			teams.setTeamName("MUN");
			teams.setAttack(8);
			teams.setDefense(7);
			return teams;
		case "15": 
			teams.setPosition(6);
			teams.setTeamName("NEW");
			teams.setAttack(6);
			teams.setDefense(7);
			return teams;
		case "16": 
			teams.setPosition(14);
			teams.setTeamName("NFO");
			teams.setAttack(3);
			teams.setDefense(5);
			return teams;
		case "17": 
			teams.setPosition(19);
			teams.setTeamName("SOU");
			teams.setAttack(3);
			teams.setDefense(3);
			return teams;
		case "18": 
			teams.setPosition(4);
			teams.setTeamName("TOT");
			teams.setAttack(8);
			teams.setDefense(7);
			return teams;
		case "19": 
			teams.setPosition(16);
			teams.setTeamName("WHU");
			teams.setAttack(3);
			teams.setDefense(5);
			return teams;
		case "20": 
			teams.setPosition(13);
			teams.setTeamName("WOL");
			teams.setAttack(2);
			teams.setDefense(5);
			return teams;
		}
		return null;
	}

	public String mapTeam(String team) {
		switch (team) {
			case "1": {
				return "ARS";
			}
			case "2": {
				return "AVL";
			}
			case "3": {
				return "BOU";
			}
			case "4": {
				return "BRE";
			}
			case "5": {
				return "BHA";
			}
			case "6": {
				return "CHE";
			}
			case "7": {
				return "CRY";
			}
			case "8": {
				return "EVE";
			}
			case "9": {
				return "FUL";
			}
			case "10": {
				return "LEE";
			}
			case "11": {
				return "LEI";
			}
			case "12": {
				return "LIV";
			}
			case "13": {
				return "MCI";
			}
			case "14": {
				return "MUN";
			}
			case "15": {
				return "NEW";
			}
			case "16": {
				return "NFO";
			}
			case "17": {
				return "SOU";
			}
			case "18": {
				return "TOT";
			}
			case "19": {
				return "WHU";
			}
			case "20": {
				return "WOL";
			}
		} return null;
	}
}





/*


public HashMap<String, Integer> initializeEachTeamFixtures(int team) {
		initializeTeams();
		HashMap<String, Integer> eachTeamFixtures = new HashMap<>();
		switch(team) {
		case 1:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("ARS", "FUL"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("ARS", "CRY"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("ARS", "LEE"));
//			eachTeamFixtures.put("GAMEWEEK_30", getMyFixturePoints("ARS", "LIV"));
//			eachTeamFixtures.put("GAMEWEEK_31", getMyFixturePoints("ARS", "WHU"));
//			eachTeamFixtures.put("GAMEWEEK_32", getMyFixturePoints("ARS", "SOU"));
//			eachTeamFixtures.put("GAMEWEEK_33", getMyFixturePoints("ARS", "MCI"));
//			eachTeamFixtures.put("GAMEWEEK_34", getMyFixturePoints("ARS", "CHE"));
//			eachTeamFixtures.put("GAMEWEEK_35", getMyFixturePoints("ARS", "NEW"));
//			eachTeamFixtures.put("GAMEWEEK_36", getMyFixturePoints("ARS", "BHA"));
//			eachTeamFixtures.put("GAMEWEEK_37", getMyFixturePoints("ARS", "NFO"));
//			eachTeamFixtures.put("GAMEWEEK_38", getMyFixturePoints("ARS", "WOL"));
			return eachTeamFixtures;
		case 2:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("AVL", "WHU"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("AVL", "BOU"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("AVL", "CHE") + getMyFixturePoints("AVL", "LEI"));
//			eachTeamFixtures.put("GAMEWEEK_30", getMyFixturePoints("AVL", "WHU"));
//			eachTeamFixtures.put("GAMEWEEK_31", getMyFixturePoints("AVL", "WHU"));
//			eachTeamFixtures.put("GAMEWEEK_32", getMyFixturePoints("AVL", "WHU"));
//			eachTeamFixtures.put("GAMEWEEK_33", getMyFixturePoints("AVL", "WHU"));
//			eachTeamFixtures.put("GAMEWEEK_34", getMyFixturePoints("AVL", "WHU"));
//			eachTeamFixtures.put("GAMEWEEK_35", getMyFixturePoints("AVL", "WHU"));
//			eachTeamFixtures.put("GAMEWEEK_36", getMyFixturePoints("AVL", "WHU"));
//			eachTeamFixtures.put("GAMEWEEK_37", getMyFixturePoints("AVL", "WHU"));
//			eachTeamFixtures.put("GAMEWEEK_38", getMyFixturePoints("AVL", "WHU"));
			return eachTeamFixtures;
		case 3:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("BOU", "LIV"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("BOU", "AVL"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("BOU", "FUL") + getMyFixturePoints("BOU", "BHA"));
//			eachTeamFixtures.put("GAMEWEEK_30", getMyFixturePoints("BOU", "LIV"));
//			eachTeamFixtures.put("GAMEWEEK_31", getMyFixturePoints("BOU", "LIV"));
//			eachTeamFixtures.put("GAMEWEEK_32", getMyFixturePoints("BOU", "LIV"));
//			eachTeamFixtures.put("GAMEWEEK_33", getMyFixturePoints("BOU", "LIV"));
//			eachTeamFixtures.put("GAMEWEEK_34", getMyFixturePoints("BOU", "LIV"));
//			eachTeamFixtures.put("GAMEWEEK_35", getMyFixturePoints("BOU", "LIV"));
//			eachTeamFixtures.put("GAMEWEEK_36", getMyFixturePoints("BOU", "LIV"));
//			eachTeamFixtures.put("GAMEWEEK_37", getMyFixturePoints("BOU", "LIV"));
//			eachTeamFixtures.put("GAMEWEEK_38", getMyFixturePoints("BOU", "LIV"));
			return eachTeamFixtures;
		case 4:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("BRE", "EVE") + getMyFixturePoints("BOU", "SOU"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("BRE", "LEI"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("BRE", "BHA") + getMyFixturePoints("BOU", "MUN"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"NEW"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"WOL"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"AVL"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"CHE"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"NFO"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"LIV"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"WHU"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"TOT"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"MCI"});
			return eachTeamFixtures;
		case 5:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("BHA", "LEE") + getMyFixturePoints("BHA", "CRY"));
			eachTeamFixtures.put("GAMEWEEK_28", -50);//Blank Game Week.
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("BHA", "BRE") + getMyFixturePoints("BHA", "BOU"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"TOT"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"CHE"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"MCI"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"NFO"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"WOL"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"EVE"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"ARS"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"SOU"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"AVL"});
			return eachTeamFixtures;
		case 6:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("CHE", "LEI"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("CHE", "EVE"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("CHE", "LIV") + getMyFixturePoints("CHE", "AVL"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"WOL"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"BHA"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"MUN"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"BRE"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"ARS"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"BOU"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"NFO"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"MCI"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"NEW"});
			return eachTeamFixtures;
		case 7:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("CRY", "MCI") + getMyFixturePoints("CRY", "BHA"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("CRY", "ARS"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("CRY", "LEI"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"LEE"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"SOU"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"EVE"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"WOL"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"WHU"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"TOT"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"BOU"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"FUL"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"NFO"});
			return eachTeamFixtures;
		case 8:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("EVE", "BRE"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("EVE", "CHE"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("EVE", "TOT"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"MUN"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"FUL"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"CRY"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"NEW"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"LEI"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"BHA"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"MCI"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"WOL"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"BOU"});
			return eachTeamFixtures;
		case 9:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("FUL", "ARS"));
			eachTeamFixtures.put("GAMEWEEK_28", -50);
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("FUL", "BOU"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"WHU"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"EVE"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"LEE"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"AVL"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"MCI"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"LEI"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"SOU"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"CRY"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"MUN"});
			return eachTeamFixtures;
		case 10:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("LEE", "BHA"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("LEE", "WOL"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("LEE", "ARS") + getMyFixturePoints("LEE", "NFO"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"CRU"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"LIV"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"FUL"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"LEI"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"BOU"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"MCI"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"NEW"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"WHU"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"TOT"});
			return eachTeamFixtures;
		case 11:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("LEI", "CHE"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("LEI", "BRE"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("LEI", "CRY") + getMyFixturePoints("LEI", "AVL"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"BOU"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"MCI"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"WOL"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"LEE"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"EVE"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"FUL"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"LIV"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"NEW"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"WHU"});
			return eachTeamFixtures;
		case 12:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("LIV", "BOU"));
			eachTeamFixtures.put("GAMEWEEK_28", -50);
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("LIV", "MCI") + getMyFixturePoints("LIV", "CHE"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"ARS"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"LEE"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"NFO"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"WHU"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"TOT"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"BRE"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"LEI"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"AVL"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"SOU"});
			return eachTeamFixtures;
		case 13:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("MCI", "CRY"));
			eachTeamFixtures.put("GAMEWEEK_28", -50);
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("MCI", "LIV"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"SOU"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"LEI"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"BHA"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"ARS"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"FUL"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"LEE"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"EVE"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"CHE"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"BRE"});
			return eachTeamFixtures;
		case 14:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("MUN", "SOU"));
			eachTeamFixtures.put("GAMEWEEK_28", -50);
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("MUN", "NEW") + getMyFixturePoints("MUN", "BRE"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"EVE"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"NFO"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"CHE"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"TOT"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"AVL"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"WHU"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"WOL"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"BOU"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"FUL"});
			return eachTeamFixtures;
		case 15:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("NEW", "WOL"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("NEW", "NFO"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("NEW", "MUN") + getMyFixturePoints("NEW", "WHU"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"BRE"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"AVL"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"TOT"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"EVE"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"SOU"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"ARS"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"LEE"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"LEI"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"CHE"});
			return eachTeamFixtures;
		case 16:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("NFO", "TOT"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("NFO", "NEW"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("NFO", "WOL") + getMyFixturePoints("NFO", "LEE"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"AVL"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"MUN"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"LIV"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"BHA"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"BRE"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"SOU"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"CHE"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"ARS"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"CRY"});
			return eachTeamFixtures;
		case 17:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("SOU", "MUN") + getMyFixturePoints("SOU", "BRE"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("SOU", "TOT"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("SOU", "WHU"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"MCI"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"CRY"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"ARS"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"BOU"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"NEW"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"NFO"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"FUL"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"BHA"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"LIV"});
			return eachTeamFixtures;
		case 18:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("TOT", "NFO"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("TOT", "SOU"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("TOT", "EVE"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"BHA"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"BOU"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"NEW"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"MUN"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"LIV"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"CRY"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"MUN"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"BRE"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"LEE"});
			return eachTeamFixtures;
		case 19:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("WHU", "AVL"));
			eachTeamFixtures.put("GAMEWEEK_28", -50);
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("WHU", "SOU") + getMyFixturePoints("WHU", "NEW"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"FUL"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"ARS"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"BOU"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"LIV"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"CRY"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"MUN"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"BRE"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"LEE"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"LEI"});
			return eachTeamFixtures;
		case 20:
			eachTeamFixtures.put("GAMEWEEK_27", getMyFixturePoints("WOL", "NEW"));
			eachTeamFixtures.put("GAMEWEEK_28", getMyFixturePoints("WOL", "LEE"));
			eachTeamFixtures.put("GAMEWEEK_29", getMyFixturePoints("WOL", "NFO"));
//			eachTeamFixtures.put("GAMEWEEK_30", new String[] {"CHE"});
//			eachTeamFixtures.put("GAMEWEEK_31", new String[] {"BRE"});
//			eachTeamFixtures.put("GAMEWEEK_32", new String[] {"LEI"});
//			eachTeamFixtures.put("GAMEWEEK_33", new String[] {"CRY"});
//			eachTeamFixtures.put("GAMEWEEK_34", new String[] {"BHA"});
//			eachTeamFixtures.put("GAMEWEEK_35", new String[] {"AVL"});
//			eachTeamFixtures.put("GAMEWEEK_36", new String[] {"MUN"});
//			eachTeamFixtures.put("GAMEWEEK_37", new String[] {"EVE"});
//			eachTeamFixtures.put("GAMEWEEK_38", new String[] {"ARS"});
			return eachTeamFixtures;
		}
		return null;
	}




*/