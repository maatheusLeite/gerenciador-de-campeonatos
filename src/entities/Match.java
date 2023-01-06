package entities;

public class Match {
	private Integer id;
	private Tournament tournament;
	private Player player1;
	private Player player2;
	private int player1Goals;
	private int player2Goals;
	private Player winner;
	private Player loser;
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

	public void addPlayer1Goal() {
		this.player1Goals++;
	}
	
	public void removePlayer1Goal() {
		this.player1Goals--;
	}
	
	public void addPlayer2Goal() {
		this.player2Goals++;
	}
	
	public void removePlayer2Goal() {
		this.player2Goals--;
	}
	
	public boolean isTied() {
		return (player1Goals == player2Goals) ? true : false;
	}
	
	public void calcWinner() {
		this.tiedGame = isTied();
		if(!tiedGame) {
			if(player1Goals > player2Goals) {
				this.winner = player1;
				this.loser = player2;
			}
			else {
				this.winner = player2;
				this.loser = player1;
			}
		}
	}
	
	public void saveResults() {
		player1.addGame();
		player2.addGame();
		
		player1.makeGoals(player2, player1Goals);
		player2.makeGoals(player1, player2Goals);
		
		if(isTied()) {
			player1.addDraw();
			player2.addDraw();
		}
		else {
			winner.addWin();
			loser.addLoss();
		}
		
		player1.calcGoalDiff();
		player2.calcGoalDiff();
		
		player1.calcPoints();
		player2.calcPoints();
	}

	@Override
	public String toString() {
		return "player1Goals: "+ player1Goals + ", player2Goals: " + player2Goals + 
				", winner: " + ((winner != null) ? winner.getName() : "Tied game") + ", tiedGame: " + tiedGame;
	}
}
