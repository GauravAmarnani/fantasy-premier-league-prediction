package ams.com.dao;

import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import ams.com.annotations.Dao;
import ams.com.dto.Defenders;
import ams.com.dto.Forwards;
import ams.com.dto.GoalKeepers;
import ams.com.dto.MidFielder;
import ams.com.dto.Players;
import ams.com.dto.RankedPlayers;
import ams.com.dto.Teams;

@Dao
public class PlayerDAO {
	
	@Autowired
	private FixtureDAO fixtureDAO;
	
	@Autowired
	private TeamCheckerDAO teamCheckerDAO;
	
	private Integer GOALIE_NUMBER = 0;
	private Integer DEFENDER_NUMBER = 0;
	private Integer MIDFIELDER_NUMBER = 0;
	private Integer FORWARD_NUMBER = 0;
	
	private ArrayList<Teams> listOfTeams = new ArrayList<>();
	
	public int setEachTeamFixture(int team) {
		return fixtureDAO.getFixturePoints(team);
	}
	
	public ArrayList<GoalKeepers> generatePredictionForGoalKeepers() {
		ArrayList<GoalKeepers> listOfPlayers = new ArrayList<GoalKeepers>();
		try { 
			JSONObject json = new JSONObject(IOUtils.toString(new URL("https://fantasy.premierleague.com/api/bootstrap-static/"), Charset.forName("UTF-8")));
			JSONArray jsonArray = json.getJSONArray("elements");
			for(int i = 0; i < jsonArray.length(); i++) {
				JSONObject eachObject = (JSONObject) jsonArray.get(i);
				GoalKeepers players = new GoalKeepers();
				initiateTeams();
				players.setName(eachObject.getString("first_name") + " " + eachObject.getString("second_name"));
				players.setChanceOfPlaying(eachObject.getString("chance_of_playing_next_round"));
				players.setFixture(setEachTeamFixture(eachObject.getInt("team")));
				players.setForm(eachObject.getString("form"));
				players.setCleanSheets(eachObject.getInt("clean_sheets"));
				players.setCost(eachObject.getInt("now_cost"));
				players.setPosition(eachObject.getInt("element_type"));
				players.setPointsPerGame(eachObject.getInt("points_per_game"));
				players.setSaves(eachObject.getInt("saves_per_90"));
				players.setTeam(eachObject.getInt("team"));
				if(players.getPosition() == 1) {
					if(eachObject.getString("news").length() == 0)
						players.setChanceOfPlaying("100");
					players.setPerformance(calculatePerformanceForGoalKeepers(players));
					listOfPlayers.add(players);
				}
			}
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return listOfPlayers;
	}
	
	public ArrayList<Defenders> generatePredictionForDefenders() {
		ArrayList<Defenders> listOfPlayers = new ArrayList<Defenders>();
		try { 
			JSONObject json = new JSONObject(IOUtils.toString(new URL("https://fantasy.premierleague.com/api/bootstrap-static/"), Charset.forName("UTF-8")));
			JSONArray jsonArray = json.getJSONArray("elements");
			for(int i = 0; i < jsonArray.length(); i++) {
				JSONObject eachObject = (JSONObject) jsonArray.get(i);
				Defenders players = new Defenders();
				initiateTeams();
				players.setName(eachObject.getString("first_name") + " " + eachObject.getString("second_name"));
				players.setChanceOfPlaying(eachObject.getString("chance_of_playing_next_round"));
				players.setFixture(setEachTeamFixture(eachObject.getInt("team")));
				players.setForm(eachObject.getString("form"));
				players.setCleanSheets(eachObject.getInt("clean_sheets"));
				players.setCost(eachObject.getInt("now_cost"));
				players.setPosition(eachObject.getInt("element_type"));
				players.setPointsPerGame(eachObject.getInt("points_per_game"));
				players.setAssistProvided(eachObject.getInt("assists"));
				players.setGoalsScored(eachObject.getInt("goals_scored"));
				players.setTeam(eachObject.getInt("team"));
				if(players.getPosition() == 2) {
					if(eachObject.getString("news").length() == 0)
						players.setChanceOfPlaying("100");
					players.setPerformance(calculatePerformanceForDefenders(players));
					listOfPlayers.add(players);
				}
			}
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return listOfPlayers;
	}
	
	public ArrayList<MidFielder> generatePredictionForMidFielders() {
		ArrayList<MidFielder> listOfPlayers = new ArrayList<MidFielder>();
		try { 
			JSONObject json = new JSONObject(IOUtils.toString(new URL("https://fantasy.premierleague.com/api/bootstrap-static/"), Charset.forName("UTF-8")));
			JSONArray jsonArray = json.getJSONArray("elements");
			for(int i = 0; i < jsonArray.length(); i++) {
				JSONObject eachObject = (JSONObject) jsonArray.get(i);
				MidFielder players = new MidFielder();
				initiateTeams();
				players.setName(eachObject.getString("first_name") + " " + eachObject.getString("second_name"));
				players.setChanceOfPlaying(eachObject.getString("chance_of_playing_next_round"));
				players.setForm(eachObject.getString("form"));
				players.setFixture(setEachTeamFixture(eachObject.getInt("team")));
				players.setCleanSheets(eachObject.getInt("clean_sheets"));
				players.setCost(eachObject.getInt("now_cost"));
				players.setPosition(eachObject.getInt("element_type"));
				players.setPointsPerGame(eachObject.getInt("points_per_game"));
				players.setAssistProvided(eachObject.getInt("assists"));
				players.setGoalsScored(eachObject.getInt("goals_scored"));
				players.setExpectedAssist(eachObject.getDouble("expected_assists"));
				players.setExpectedGoals(eachObject.getDouble("expected_goals"));
				players.setTeam(eachObject.getInt("team"));
				if(players.getPosition() == 3) {
					if(eachObject.getString("news").length() == 0)
						players.setChanceOfPlaying("100");
					players.setPerformance(calculatePerformanceForMidFielders(players));
					listOfPlayers.add(players);
				}
			}
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return listOfPlayers;
	}
	
	public ArrayList<Forwards> generatePredictionForForwards() {
		ArrayList<Forwards> listOfPlayers = new ArrayList<Forwards>();
		try { 
			JSONObject json = new JSONObject(IOUtils.toString(new URL("https://fantasy.premierleague.com/api/bootstrap-static/"), Charset.forName("UTF-8")));
			JSONArray jsonArray = json.getJSONArray("elements");
			for(int i = 0; i < jsonArray.length(); i++) {
				JSONObject eachObject = (JSONObject) jsonArray.get(i);
				Forwards players = new Forwards();
				initiateTeams();
				players.setName(eachObject.getString("first_name") + " " + eachObject.getString("second_name"));
				players.setChanceOfPlaying(eachObject.getString("chance_of_playing_next_round"));
				players.setForm(eachObject.getString("form"));
				players.setFixture(setEachTeamFixture(eachObject.getInt("team")));
				players.setCleanSheets(eachObject.getInt("clean_sheets"));
				players.setCost(eachObject.getInt("now_cost"));
				players.setPosition(eachObject.getInt("element_type"));
				players.setPointsPerGame(eachObject.getInt("points_per_game"));
				players.setAssistProvided(eachObject.getInt("assists"));
				players.setGoalsScored(eachObject.getInt("goals_scored"));
				players.setExpectedAssist(eachObject.getDouble("expected_assists"));
				players.setExpectedGoals(eachObject.getDouble("expected_goals"));
				players.setTeam(eachObject.getInt("team"));
				if(players.getPosition() == 4) {
					if(eachObject.getString("news").length() == 0)
						players.setChanceOfPlaying("100");
					players.setPerformance(calculatePerformanceForForwards(players));
					listOfPlayers.add(players);
				}
			}
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return listOfPlayers;
	}
	
	public void initiateTeams() {
		for(int i = 1; i < 21; i++)
			listOfTeams.add(addTeams(i + ""));
	}
	
	public Float calculatePerformanceForGoalKeepers(GoalKeepers player) {
		Integer chanceOfPlaying, fixture, pointsPerGame, cleanSheets;
		Float form, performance;
		chanceOfPlaying = calculateChanceOfPlaying(player.getChanceOfPlaying());
		form = (Float.parseFloat(player.getForm())) * 5;
		cleanSheets = player.getCleanSheets() * 4;
		pointsPerGame = player.getPointsPerGame();
		fixture = player.getFixture();
		performance = chanceOfPlaying + form + fixture + cleanSheets + pointsPerGame;
		return performance;
	}
	
	public Float calculatePerformanceForDefenders(Defenders defender) {
		Integer chanceOfPlaying, fixture, pointsPerGame, cleanSheets, cost, goals, assist;
		Float form, performance;
		chanceOfPlaying = calculateChanceOfPlaying(defender.getChanceOfPlaying());
		form = (Float.parseFloat(defender.getForm())) * 5;
		cleanSheets = defender.getCleanSheets() * 4;
		pointsPerGame = defender.getPointsPerGame();
		fixture = defender.getFixture();
		cost = defender.getCost();
		goals = defender.getGoalsScored() * 4;
		assist = defender.getAssistProvided() * 3;
		performance = chanceOfPlaying + form + fixture +  cleanSheets + pointsPerGame - cost + goals + assist;
		return performance;
	}
	
	public Float calculatePerformanceForMidFielders(MidFielder player) {
		Integer chanceOfPlaying, fixture, pointsPerGame, cost, goals, assist, expectedGoals = 0, expectedAssists = 0;
		Float form, performance;
		chanceOfPlaying = calculateChanceOfPlaying(player.getChanceOfPlaying());
		form = (Float.parseFloat(player.getForm())) * 5;
		pointsPerGame = player.getPointsPerGame();
		cost = player.getCost();
		goals = player.getGoalsScored() * 5;
		fixture = player.getFixture();
		assist = player.getAssistProvided() * 3;
		if(player.getExpectedAssist() < assist)
			expectedAssists = 10;
		if(player.getExpectedGoals() < goals)
			expectedGoals = 10;
		performance = chanceOfPlaying + form + fixture +  pointsPerGame - cost + goals + assist + expectedAssists + expectedGoals;
		return performance;
	}
	
	public Float calculatePerformanceForForwards(Forwards player) {
		Integer chanceOfPlaying, fixture, pointsPerGame, cost, goals, assist, expectedGoals = 0, expectedAssists = 0;
		Float form, performance;
		chanceOfPlaying = calculateChanceOfPlaying(player.getChanceOfPlaying());
		form = (Float.parseFloat(player.getForm())) * 5;
		pointsPerGame = player.getPointsPerGame();
		cost = player.getCost();
		fixture = player.getFixture();
		goals = player.getGoalsScored() * 5;
		assist = player.getAssistProvided() * 3;
		if(player.getExpectedAssist() < assist)
			expectedAssists = 10;
		if(player.getExpectedGoals() < goals)
			expectedGoals = 10;
		performance = chanceOfPlaying + form + fixture +  pointsPerGame - cost + goals + assist + expectedAssists + expectedGoals;
		return performance;
	}
	
	public ArrayList<Players> generate() {
		ArrayList<Players> listOfPlayers = new ArrayList<Players>();
		try {
			JSONObject json = new JSONObject(IOUtils.toString(new URL("https://fantasy.premierleague.com/api/bootstrap-static/"), Charset.forName("UTF-8")));
			JSONArray jsonArray = json.getJSONArray("elements");
			for(int i = 0; i < jsonArray.length(); i++) {
				JSONObject eachObject = (JSONObject) jsonArray.get(i);
				Players players = new Players();
				players.setName(eachObject.getString("first_name") + " " + eachObject.getString("second_name"));
				players.setTeam(eachObject.getString("team"));
				players.setGoals(eachObject.getInt("goals_scored"));
				players.setAssists(eachObject.getInt("assists"));
				players.setRed(eachObject.getInt("red_cards"));
				players.setYellow(eachObject.getInt("yellow_cards"));
				players.setClean(eachObject.getInt("clean_sheets"));
				players.setPosition(eachObject.getInt("element_type"));
				players.setTotalPoints(eachObject.getInt("total_points"));
				listOfPlayers.add(players);
			}
			return listOfPlayers;
		} catch(Exception exception) {
			exception.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<RankedPlayers> fetchListOfPlayersForGoals(ArrayList<Players> listOfPlayers) {
		listOfPlayers = generate();
		listOfPlayers.sort((o1, o2)
                -> o2.getGoals().compareTo(
                    o1.getGoals()));
		ArrayList<RankedPlayers> goalsList = new ArrayList<RankedPlayers>();
		for(int i = 0; i < 100; i++) 
			goalsList.add(new RankedPlayers(i+1, listOfPlayers.get(i).getName(), listOfPlayers.get(i).getTeam(), listOfPlayers.get(i).getGoals()));
		return goalsList;
	}

	
	public ArrayList<RankedPlayers> fetchListOfPlayersForAssists(ArrayList<Players> listOfPlayers) {
		listOfPlayers = generate();
		listOfPlayers.sort((o1, o2)
                -> o2.getAssists().compareTo(
                    o1.getAssists()));
		ArrayList<RankedPlayers> assistsList = new ArrayList<RankedPlayers>();
		for(int i = 0; i < 20; i++) 
			assistsList.add(new RankedPlayers(i+1, listOfPlayers.get(i).getName(), listOfPlayers.get(i).getTeam(), listOfPlayers.get(i).getAssists()));
		return assistsList;
	}
	
	public ArrayList<RankedPlayers> fetchListOfPlayersForRedCards(ArrayList<Players> listOfPlayers) {
		listOfPlayers= generate();
		listOfPlayers.sort((o1, o2)
                -> o2.getRed().compareTo(
                    o1.getRed()));
		ArrayList<RankedPlayers> cardsList = new ArrayList<RankedPlayers>();
		for(int i = 0; i < 20; i++) 
			cardsList.add(new RankedPlayers(i+1, listOfPlayers.get(i).getName(), listOfPlayers.get(i).getTeam(), listOfPlayers.get(i).getRed()));
		return cardsList;
	}
	
	public ArrayList<RankedPlayers> fetchListOfPlayersForYellowCards(ArrayList<Players> listOfPlayers) {
		listOfPlayers = generate();
		listOfPlayers.sort((o1, o2)
                -> o2.getYellow().compareTo(
                    o1.getYellow()));
		ArrayList<RankedPlayers> cardsList = new ArrayList<RankedPlayers>();
		for(int i = 0; i < 20; i++) 
			cardsList.add(new RankedPlayers(i+1, listOfPlayers.get(i).getName(), listOfPlayers.get(i).getTeam(), listOfPlayers.get(i).getYellow()));
		return cardsList;
	}
	
	public ArrayList<RankedPlayers> fetchListOfPlayersForCleanSheets(ArrayList<Players> listOfPlayers) {
		listOfPlayers = generate();
		ArrayList<Players> goalies = new ArrayList<Players>();
		for(int i = 0; i < listOfPlayers.size(); i++) 
			if(listOfPlayers.get(i).getPosition() == 1)
				goalies.add(listOfPlayers.get(i));
		goalies.sort((o1, o2)
                -> o2.getClean().compareTo(
                    o1.getClean()));
		ArrayList<RankedPlayers> keeperList = new ArrayList<RankedPlayers>();
		for(int i = 0; i < 20; i++) 
			keeperList.add(new RankedPlayers(i+1, goalies.get(i).getName(), goalies.get(i).getTeam(), goalies.get(i).getClean()));
		return keeperList;
	}
	
	public Integer calculateChanceOfPlaying(String chance) {
		
		int value = 0;
		
		if(chance == null || chance.equals("0")) 
			value = -100;
		
		else if(chance.equals("50")) 
			value = -15;
		
		else if(chance.equals("75")) 
			value = 5;
		
		else if(chance.equals("100")) 
			value = 10;
		
		else 
			value = -100;
		
		return value;
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
	
	public ArrayList<RankedPlayers> createFinalTeam1(ArrayList<GoalKeepers> listOfGoalies) {
		ArrayList<RankedPlayers> listOfFinalGoalies = new ArrayList<RankedPlayers>();
		while(true) {
			RankedPlayers rankedPlayer = new RankedPlayers();
			if(teamCheckerDAO.hasReachedLimit(listOfGoalies.get(GOALIE_NUMBER).getTeam())) {
				rankedPlayer.setName(listOfGoalies.get(GOALIE_NUMBER).getName());
				rankedPlayer.setTeam(listOfGoalies.get(GOALIE_NUMBER).getTeam() + "");
				rankedPlayer.setScore(Math.round(listOfGoalies.get(GOALIE_NUMBER).getPerformance()));
				listOfFinalGoalies.add(rankedPlayer);
				GOALIE_NUMBER++;
			}
			else {
				GOALIE_NUMBER++;
			}
			if(listOfFinalGoalies.size() == 2)
				break;
		}
		return listOfFinalGoalies;
	}
	
	public ArrayList<RankedPlayers> createFinalTeam2(ArrayList<Defenders> listOfDefenders) {
		ArrayList<RankedPlayers> listOfFinalDefenders = new ArrayList<RankedPlayers>();
		while(true) {
			RankedPlayers rankedPlayer = new RankedPlayers();
			if(teamCheckerDAO.hasReachedLimit(listOfDefenders.get(DEFENDER_NUMBER).getTeam())) {
				rankedPlayer.setName(listOfDefenders.get(DEFENDER_NUMBER).getName());
				rankedPlayer.setTeam(listOfDefenders.get(DEFENDER_NUMBER).getTeam() + "");
				rankedPlayer.setScore(Math.round(listOfDefenders.get(DEFENDER_NUMBER).getPerformance()));
				listOfFinalDefenders.add(rankedPlayer);
				DEFENDER_NUMBER++;
			}
			else {
				DEFENDER_NUMBER++;
			}
			if(listOfFinalDefenders.size() == 5)
				break;
		}
		return listOfFinalDefenders;
	}
	
	public ArrayList<RankedPlayers> createFinalTeam3(ArrayList<MidFielder> listOfMidfielders) {
		ArrayList<RankedPlayers> listOfFinalMidfielders = new ArrayList<RankedPlayers>();
		while(true) {
			RankedPlayers rankedPlayer = new RankedPlayers();
			if(teamCheckerDAO.hasReachedLimit(listOfMidfielders.get(MIDFIELDER_NUMBER).getTeam())) {
				rankedPlayer.setName(listOfMidfielders.get(MIDFIELDER_NUMBER).getName());
				rankedPlayer.setTeam(listOfMidfielders.get(MIDFIELDER_NUMBER).getTeam() + "");
				rankedPlayer.setScore(Math.round(listOfMidfielders.get(MIDFIELDER_NUMBER).getPerformance()));
				listOfFinalMidfielders.add(rankedPlayer);
				MIDFIELDER_NUMBER++;
			}
			else {
				MIDFIELDER_NUMBER++;
			}
			if(listOfFinalMidfielders.size() == 5)
				break;
		}
		return listOfFinalMidfielders;
	}
	
	public ArrayList<RankedPlayers> createFinalTeam4(ArrayList<Forwards> listOfForwards) {
		ArrayList<RankedPlayers> listOfFinalForwards = new ArrayList<RankedPlayers>();
		while(true) {
			RankedPlayers rankedPlayer = new RankedPlayers();
			if(teamCheckerDAO.hasReachedLimit(listOfForwards.get(FORWARD_NUMBER).getTeam())) {
				rankedPlayer.setName(listOfForwards.get(FORWARD_NUMBER).getName());
				rankedPlayer.setTeam(listOfForwards.get(FORWARD_NUMBER).getTeam() + "");
				rankedPlayer.setScore(Math.round(listOfForwards.get(FORWARD_NUMBER).getPerformance()));
				listOfFinalForwards.add(rankedPlayer);
				FORWARD_NUMBER++;
			}
			else {
				FORWARD_NUMBER++;
			}
			if(listOfFinalForwards.size() == 3)
				break;
		}
		return listOfFinalForwards;
	}
}





/*

public RankedPlayers getRankedPlayersForGoalie(ArrayList<GoalKeepers> listOfGoalies) {
		RankedPlayers rankedPlayer = new RankedPlayers();
		rankedPlayer.setName(listOfGoalies.get(GOALIE_NUMBER).getName());
		rankedPlayer.setTeam(listOfGoalies.get(GOALIE_NUMBER).getTeam() + "");
		rankedPlayer.setScore(Math.round(listOfGoalies.get(GOALIE_NUMBER).getPerformance()));
		GOALIE_NUMBER++;
		return rankedPlayer;
	}


*/
