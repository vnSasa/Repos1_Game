
public class Start {

	public static void main(String[] args) {
		
		NamePlayers start = new NamePlayers();
		int number = start.numberPlayers;
				
		if (number == 1) {
			System.out.println("the game is not possible with one player");
		} else if (number == 2) {
			Version1 begin = new Version1();
			int result1player = begin.player1;
			int result2player = begin.player2;
			String name1 = start.player1;
			String name2 = start.player2;
			System.out.println("result: " + "\n" + name1 + " - " + result1player + "\n" + name2 + " - " + result2player);
		} else if (number == 3) {
			Version2 begin2 = new Version2();
			int result11player = begin2.player1;
			int result22player = begin2.player2;
			int result33player = begin2.player3;
			String name1 = start.player1;
			String name2 = start.player2;
			String name3 = start.player3;
			System.out.println("result: " + "\n" + name1 + " - " + result11player + "\n" + name2 + " - " + result22player + "\n" + name3 + " - " + result33player);
		}
	}
}
