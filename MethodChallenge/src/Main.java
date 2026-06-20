public class Main {
	public static void main(String[] args) {
		displayHighScorePosition("test1",calculateHighScorePosition(1500));
		displayHighScorePosition("test1",calculateHighScorePosition(1000));
		displayHighScorePosition("test1",calculateHighScorePosition(500));
		displayHighScorePosition("test1",calculateHighScorePosition(100));
		displayHighScorePosition("test1",calculateHighScorePosition(25));
	}
	
	public static void displayHighScorePosition(String name, int position) {
		System.out.println(name + " got position " + position + " in the high score list");
	}
	
	public static int calculateHighScorePosition(int score) {
		int position;
		
		if(score >= 1000)
			position = 1;
		else if(score >= 500)
			position = 2;
		else if(score >= 100)
			position = 3;
		else
			position = 4;
		
		return position;
	}
}
