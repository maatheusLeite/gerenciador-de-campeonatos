package entities;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
	private String name;
	private List<Player> players;
	
	public Tournament() {
		this.players = new ArrayList<>();
	}
	
	public Tournament(String name, List<Player> players) {
		this.name = name;
		this.players = players;
	}
}
