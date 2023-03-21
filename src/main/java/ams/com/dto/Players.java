package ams.com.dto;

public class Players {
	
	private String name;
	private String team;
	private Integer totalPoints;
	private Integer position;
	private Integer goals;
	private Integer assists;
	private Integer red;
	private Integer yellow;
	private Integer clean;
	
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
		this.team = team;
	}
	
	public Integer getTotalPoints() {
		return totalPoints;
	}
	
	public void setTotalPoints(Integer totalPoints) {
		this.totalPoints = totalPoints;
	}
	
	public Integer getGoals() {
		return goals;
	}
	
	public void setGoals(Integer goals) {
		this.goals = goals;
	}
	
	public Integer getAssists() {
		return assists;
	}
	
	public void setAssists(Integer assists) {
		this.assists = assists;
	}
	
	public Integer getRed() {
		return red;
	}
	
	public void setRed(Integer red) {
		this.red = red;
	}
	
	public Integer getYellow() {
		return yellow;
	}
	
	public void setYellow(Integer yellow) {
		this.yellow = yellow;
	}
	
	public Integer getClean() {
		return clean;
	}
	
	public void setClean(Integer clean) {
		this.clean = clean;
	}
	
	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Players [name=" + name + ", team=" + team + ", position = " + position + ", totalPoints="
				+ totalPoints + ", goals=" + goals + ", assists=" + assists + ", red=" + red + ", yellow=" + yellow
				+ ", clean=" + clean + "]";
	}
}
