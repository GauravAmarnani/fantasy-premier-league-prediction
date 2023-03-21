package ams.com.dto;

public class Teams {
	
	private String teamName;
	private Integer position;
	private Integer defense;
	private Integer attack;
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public Integer getPosition() {
		return position;
	}
	
	public void setPosition(Integer position) {
		this.position = position;
	}
	
	public Integer getDefense() {
		return defense;
	}
	
	public void setDefense(Integer defense) {
		this.defense = defense;
	}
	
	public Integer getAttack() {
		return attack;
	}
	
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	
	@Override
	public String toString() {
		return "Teams [teamName=" + teamName + ", position=" + position + ", defense=" + defense + "]";
	}
	
}
