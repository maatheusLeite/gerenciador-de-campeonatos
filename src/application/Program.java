package application;

import java.util.ArrayList;
import java.util.List;

import entities.Match;
import entities.Player;
import entities.Tournament;

public class Program {

	public static void main(String[] args) {
		
		Player p1 = new Player(1, 1, "Player 1", 0, 0, 0, 0, 0, 0, 0, 0);
		Player p2 = new Player(2, 2, "Player 2", 0, 0, 0, 0, 0, 0, 0, 0);
		Player p3 = new Player(3, 3, "Player 3", 0, 0, 0, 0, 0, 0, 0, 0);
		
		List<Player> players = new ArrayList<>();
		players.add(p1);
		players.add(p2);
		players.add(p3);
		
		// p1 2 vs p2 1
//		p1.addGame();
//		p2.addGame();
//		
//		p1.makeGoal(p2);
//		p1.makeGoal(p2);
//		p2.makeGoal(p1);
//		
//		p1.addWin();
//		p2.addLoss();
//		
//		//p1 2 vs p3 0
//		p1.addGame();
//		p3.addGame();
//		
//		p1.makeGoal(p3);
//		p1.makeGoal(p3);
//		
//		p1.addWin();
//		p3.addLoss();
//		
//		//p2 0 vs p3 0
//		p2.addGame();
//		p3.addGame();
//		
//		p2.addDraw();
//		p3.addDraw();
//		
//		System.out.println("|ID|POS|NAME |P|G|W|D|L|F|A|GD|");
//		for (Player p : players) {
//			p.calcGoalDiff();
//			p.calcPoints();
//			System.out.println(p);
//		}
		
		System.out.println("|ID|POS|NAME |P|G|W|D|L|F|A|GD|");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println();
	
		Match m1 = new Match(new Tournament(), p1, p2);
		m1.addPlayer1Goal();
		m1.addPlayer1Goal();
		m1.addPlayer2Goal();
		m1.addPlayer2Goal();
		m1.calcWinner();
		m1.saveResults();
		System.out.println(m1.toString());
		System.out.println();
		
		System.out.println("|ID|POS|NAME |P|G|W|D|L|F|A|GD|");
		System.out.println(p1);
		System.out.println(p2);
		
		Match m2 = new Match(new Tournament(), p1, p3);
		m2.addPlayer1Goal();
		m2.calcWinner();
		m2.saveResults();
		System.out.println(m2.toString());
		System.out.println();
		
		System.out.println("|ID|POS|NAME |P|G|W|D|L|F|A|GD|");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
