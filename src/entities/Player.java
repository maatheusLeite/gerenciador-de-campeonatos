package entities;

public class Player {
	private Integer id;
	private Integer position;
	private String name;
	private Integer points;
	private Integer games;
	private Integer wins;
	private Integer draws;
	private Integer loses;
	private Integer goalsFor;
	private Integer goalsAgainst;
	private Integer goalDifference;
	
	public Player() {
	}

	public Player(Integer id, Integer position, String name, Integer points, Integer games, Integer wins, 
			Integer draws, Integer loses, Integer goalsFor, Integer goalsAgainst, Integer goalDifference) {
		this.id = id;
		this.position = position;
		this.name = name;
		this.points = points;
		this.games = games;
		this.wins = wins;
		this.draws = draws;
		this.loses = loses;
		this.goalsFor = goalsFor;
		this.goalsAgainst = goalsAgainst;
		this.goalDifference = goalDifference;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	private void addGoalsFor(int qtd) {
		this.goalsFor += qtd;
	}
	
	private void addGoalsAgainst(int qtd) {
		this.goalsAgainst += qtd;
	}
	
	public void addPoint() {
		this.points++;
	}
	
	public void addGame() {
		this.games++;
	}
	
	public void addWin() {
		this.wins++;
	}
	
	public void addDraw() {
		this.draws++;
	}
	
	public void addLoss() {
		this.loses++;
	}
	
	public void makeGoals(Player opponent, int qtd) {
		this.addGoalsFor(qtd);
		opponent.addGoalsAgainst(qtd);
	}
	
	public void calcGoalDiff() {
		int goalDifference = this.goalsFor - this.goalsAgainst;
		this.goalDifference = goalDifference;
	}
	
	public void calcPoints() {
		int winPoints = this.wins * 3;
		int drawPoints = this.draws * 1;
		int totalPoints = winPoints + drawPoints;
		this.points = totalPoints;
	}	

	@Override
	public String toString() {
		return "|" + id + "|" + position + "|" + name + "|" + points + "|"
				+ games + "|" + wins + "|" + draws + "|" + loses + "|" + goalsFor
				+ "|" + goalsAgainst + "|" + goalDifference + "|";
	}
}
