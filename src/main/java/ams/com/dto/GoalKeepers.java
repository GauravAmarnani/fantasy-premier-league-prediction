package ams.com.dto;

public class GoalKeepers {

	private String name;
	private String chanceOfPlaying;
	private String form;
	private Integer pointsPerGame;
	private Integer fixture;
	private Integer cleanSheets;
	private Integer cost;
	private Integer saves;
	private Integer position;
	private Float performance;
	private Integer team;

	public GoalKeepers() { }

	public GoalKeepers(String name, String chanceOfPlaying, String form, Integer pointsPerGame,
			Integer fixture, Integer cleanSheets, Integer cost, Integer saves, Integer position, Float performance) {
		this.name = name;
		this.chanceOfPlaying = chanceOfPlaying;
		this.form = form;
		this.pointsPerGame = pointsPerGame;
		this.fixture = fixture;
		this.cleanSheets = cleanSheets;
		this.cost = cost;
		this.saves = saves;
		this.position = position;
		this.performance = performance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChanceOfPlaying() {
		return chanceOfPlaying;
	}

	public void setChanceOfPlaying(String chanceOfPlaying) {
		this.chanceOfPlaying = chanceOfPlaying;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public Integer getPointsPerGame() {
		return pointsPerGame;
	}

	public void setPointsPerGame(Integer pointsPerGame) {
		this.pointsPerGame = pointsPerGame;
	}

	public Integer getFixture() {
		return fixture;
	}

	public void setFixture(Integer fixture) {
		this.fixture = fixture;
	}

	public Integer getCleanSheets() {
		return cleanSheets;
	}

	public void setCleanSheets(Integer cleanSheets) {
		this.cleanSheets = cleanSheets;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Integer getSaves() {
		return saves;
	}

	public void setSaves(Integer saves) {
		this.saves = saves;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Float getPerformance() {
		return performance;
	}

	public void setPerformance(Float performance) {
		this.performance = performance;
	}
	
	public Integer getTeam() {
		return team;
	}

	public void setTeam(Integer team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "GoalKeepers [name=" + name + ", chanceOfPlaying=" + chanceOfPlaying + ", form=" + form
				+ ", pointsPerGame=" + pointsPerGame + ", fixture=" + fixture
				+ ", cleanSheets=" + cleanSheets + ", cost=" + cost + ", saves=" + saves + ",position = " + position + ", performance = " + performance + "]";
	}
}
