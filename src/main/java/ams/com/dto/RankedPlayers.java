package ams.com.dto;

public class RankedPlayers {
	
	private Integer rank;
	private String name;
	private String team;
	private Integer score;

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getRank() {
		return rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = mapTeam(team);
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public RankedPlayers() { }

	public RankedPlayers(Integer rank, String name, String team, Integer score) {
		this.rank = rank;
		this.name = name;
		this.team = team;
		this.score = score;
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
		}
		return "";
	}
}
