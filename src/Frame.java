
public class Frame {
	
	private static int[] turn;
	private static int wholeFrame;
	
	public Frame() {
		turn = new int[2];
		wholeFrame = 0;
	}

	public int getTurn(int i) {
		return turn[i];
	}
	
	public void setTurn(int i, int knocks) {
		turn[i] = knocks;		
	}
	
	public void setWhole(int score) {
		this.wholeFrame = score;
	}
	
	public int getWhole() {
		return this.wholeFrame;
	}
	
	@Override
	public String toString() {
		return this.turn[0]+" "+this.turn[1]+" "+this.getWhole();
	}
}
