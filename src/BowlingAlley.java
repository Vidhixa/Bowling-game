import java.util.ArrayList;


public class BowlingAlley {
	
	private static int pins = 10;
	private static ArrayList<Player> players;
	
	public BowlingAlley() {
		players = new ArrayList<Player>();
	}
	
	public void addPlayers(Player p) {
		players.add(p);		
	}
	
	public ArrayList<Player> getPlayers() {
		return this.players;
	}
	
	public void setPins(int i) {
		this.pins = i;
	}
	
	public int getPins() {
		return this.pins;
	}
	
}
