
public class BowlingPlay {
	
	private static BowlingAlley b;
	private static Scores sc;
	
	public static void main(String args[]) {
		b = new BowlingAlley();
		
		Player p1 = new Player("Vid");
		Player p2 = new Player("Mayur");
		
		b.addPlayers(p1);
		b.addPlayers(p2);
		
		sc = new Scores();
		
		startGame();		
	}
	
	private static void startGame() {
		int i, j, knocks;
		
		for(i=0; i<4; i++) {
			//Each player plays 10 frames
			
			for(Player p : b.getPlayers()) {
				Frame f = new Frame();
				//Resetting for new player
				b.setPins(10);
				for(j=0; j<2; j++) {
					knocks = p.knocks(b.getPins());
					b.setPins(b.getPins()-knocks);
					
					f.setTurn(j, knocks);
					
					//If strike, skip turn
					if(j==0 && knocks == 10) {
						break;						
					}
				}
				f.setWhole(f.getTurn(0)+f.getTurn(1));
				p.addFrame(f);
				//System.out.println(f.toString());
			}			
		}
	//	evaluateScores();	
	}

	private static void evaluateScores() {
		int i,j;
		
		for(Player p : b.getPlayers()) { 
			System.out.println("P new ------");
			for(i=0; i<p.getFrames().size(); i++) {
				Frame f = p.getFrames().get(i);
				System.out.println(f.toString());
				
				if(f.getTurn(0) == 10) {
					if(i+2 < p.getFrames().size()){
						f.setWhole(p.getFrames().get(i+1).getWhole()
								+10
								+p.getFrames().get(i+2).getWhole()); 
					}
					else {//cond
					
					}
					System.out.print("Strike  ");
					//cal next 2
				} else if((f.getTurn(0) + f.getTurn(1)) == 10) {
					if(i+1 < p.getFrames().size()) {
						
					}
					
					System.out.print("Spare  ");
					//Cal next 1
				} else {    
					f.setWhole(f.getTurn(0) + f.getTurn(1));
					System.out.print(f.getWhole()+"  ");
				}
				System.out.print("  ||  ");
			}
			System.out.println("_______________________-");
			
		}
		
		
	}
	


}
