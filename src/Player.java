import java.util.ArrayList;
import java.util.Random;


public class Player {
	
	private String name ;
	private static ArrayList<Frame> frames;
	private static int scoreSoFar;
	
	public Player(String name) {
		this.name = name;
		this.frames = new ArrayList<Frame>();
		this.scoreSoFar = 0;
	}

	public String getName() {
		return this.name;		
	}
	
	public int knocks(int pins) {
		Random r = new Random();
		return r.nextInt(pins)+1;			
	}
	
	public void addFrame(Frame f) {
		frames.add(f);	
		for(Frame f1 : frames) {
			System.out.println(f1.toString());			
		}
		System.out.println("********************");
	}
	
	public ArrayList<Frame> getFrames() {
		return this.frames;		
	}
	
	

}
