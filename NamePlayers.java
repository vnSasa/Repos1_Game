import java.util.ArrayList;
import java.util.Scanner;

public class NamePlayers {
	
	int numberPlayers;
	String player1;
	String player2;
	String player3;
	
	Scanner sc = new Scanner(System.in);
	
	
	public NamePlayers() {
		
		System.out.println("enter number of players: ");
		numberPlayers = sc.nextInt();

		ArrayList<String>name = new ArrayList<> ();
		for (int i=0; i<numberPlayers; i++) {
			System.out.println("enter name of players: ");
			String namePlayers = sc.next();
			name.add(namePlayers);
		}
		
		switch (numberPlayers) {
		case 1: {
			player1 = name.get(0);
			System.out.println("name player 1: " + player1);
			break;
		}
		case 2: {
			player1 = name.get(0);
			player2 = name.get(1);
			System.out.println("name player 1: " + player1 + "\n" + "name player 2: " + player2);
			break;
		}
		case 3: {
			player1 = name.get(0);
			player2 = name.get(1);
			player3 = name.get(2);
			System.out.println("name player 1: " + player1 + "\n" + "name player 2: " + player2 + "\n" + "name player 3: " + player3);
			break;
		}
		}
		
	}
}
