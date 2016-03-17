import java.util.Scanner;

public class CalScore {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] rolls = new int[21];
		
		//Getting roll scores from user
		int i;
		for(i=0; i<rolls.length; i++) {
			rolls[i] = sc.nextInt();
		}
		
		compScores(rolls);
		
	}

	private static void compScores(int[] rolls) {
		int score=0, i, j;
		
		for(i=0; i < 9 ; i++) { 
			if(rolls[2*i] == 10) {  //Strike
				score =+ 10 + rolls[(2*i)+2] + rolls[(2*i)+3];
			} else if((rolls[(2*i)] + rolls[(2*i)+1]) == 10) {
				score =+ 10 + rolls[(2*i)+2] ;
			} else {
				score =+ rolls[2*i] + rolls[(2*i)+1];
			}
		}
		System.out.println(score);
		
	}

}
