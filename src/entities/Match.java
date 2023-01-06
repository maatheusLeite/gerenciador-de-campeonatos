package entities;

public class Match {
	private Tournament tournament;
	private Player player1;
	private Player player2;
	private int player1Goals;
	private int player2Goals;
	private Player winner;
	private boolean tiedGame;
	
	public Match() {
		this.player1Goals = 0;
		this.player2Goals = 0;
		this.tiedGame = false;
	}

	public Match(Tournament tournament, Player player1, Player player2) {
		this.tournament = tournament;
		this.player1 = player1;
		this.player2 = player2;
		this.player1Goals = 0;
		this.player2Goals = 0;
		this.tiedGame = false;
	}
	
	
	
}
