import java.util.Scanner;

public class Version2 {
	
	Scanner sc = new Scanner(System.in);
	int player1 = 0;
	int player2 = 0;
	int player3 = 0;
	
	public Version2() {
		
		while (true) { 
			
			if (player3 >= 20) {
				System.out.println("player3 win");
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
				System.out.println("player1 win");
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
			
			if (player2 >= 20) {
				System.out.println("player2 win");
				break;
			} else {
				System.out.println();
				int g = 0;
				while (g != 1) {
				System.out.println("Player3 press 1 to take a step");
				g = sc.nextInt();
					if (g == 1) {
						int p2 = (int)(1+Math.random()*6);
						System.out.println("dropped the number: " + p2);
						player3 += p2;
						System.out.println("player3 result: " + player3);
					}
				}
						
			}
	
		}
	}
}
	

