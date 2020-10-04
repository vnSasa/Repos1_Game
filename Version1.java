import java.util.Scanner;

public class Version1 {

	Scanner sc = new Scanner(System.in);
	int player1 = 0;
	int player2 = 0;
	
	public Version1() {
	
	while (true) { 
		
		if (player2 >= 20) {
			System.out.println("PLAYER2 WIN");
			break;
		} else {
			System.out.println();
			int r = 0;
			
			while (r != 1) {
			
				System.out.println("Player1 press 1 to take a step");
			r = sc.nextInt();
			if (r == 1) {
					int p = (int)(1+Math.random()*6);
					System.out.println("dropped the number: " + p);
					player1 += p;
					System.out.println("player1 result: " + player1);
						} 
					} 
				}
		
		if (player1 >= 20) {
			System.out.println("PLAYER1 WIN" );
			break;
		} else {
			System.out.println();
			int k = 0;
			
			while (k != 1) { 
			
				System.out.println("Player2 press 1 to take a step");
			k = sc.nextInt();
				if (k == 1) {
					int p1 = (int)(1+Math.random()*6);
					System.out.println("dropped the number: " + p1);
					player2 += p1;
					System.out.println("player2 result: " + player2);
							}
						} 
			
					}
					
		}

	}
}
	

