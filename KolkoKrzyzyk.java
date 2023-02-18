import java.util.Random;
import java.util.Scanner;

public class KolkoKrzyzyk {

	private static char table[][] = {{' ', ' ', ' '},
		                             {' ', ' ', ' '},
		                             {' ', ' ', ' '}};
	private static boolean computer = true;
	
	private static Scanner input = new Scanner(System.in);

	private static boolean checkResult() {
		if ((table[0][0] == table[1][0] && table[1][0] == table[2][0] && table[2][0] != ' ') ||
			(table[0][1] == table[1][1] && table[1][1] == table[2][1] && table[2][1] != ' ') ||
			(table[0][2] == table[1][2] && table[1][2] == table[2][2] && table[2][2] != ' ') ||
			(table[0][0] == table[0][1] && table[0][1] == table[0][2] && table[0][2] != ' ') ||
			(table[1][0] == table[1][1] && table[1][1] == table[1][2] && table[1][2] != ' ') ||
			(table[2][0] == table[2][1] && table[2][1] == table[2][2] && table[2][2] != ' ') ||
			(table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] != ' ') ||
			(table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] != ' ')) {
			if (computer) {
				System.out.println("Wygral komputer!");
			} else {
				System.out.println("Brawo, wygrales!");
			}
			return true;
		}
		if (table[0][0] != ' ' && table[1][0] != ' ' && table[2][0] != ' ' &&
		    table[0][1] != ' ' && table[1][1] != ' ' && table[2][1] != ' ' &&
			table[0][2] != ' ' && table[1][2] != ' ' && table[2][2] != ' ') {
			System.out.println("Remis!");
			return true;
		}
	
		computer = !computer;
		return false;
	}

	/**
	 * Computer move
	 */
	private static void computerMove() {
		
		//end to win
		for (int i=0; i<3; i++) {
			if (table[i][0] == 'X' && table[i][1] == 'X' && table[i][2] == ' ') {
				table[i][2] = 'X';
				return;
			}
			if (table[i][0] == 'X' && table[i][2] == 'X' && table[i][1] == ' ') {
				table[i][1] = 'X';
				return;
			}
			if (table[i][2] == 'X' && table[i][1] == 'X' && table[i][0] == ' ') {
				table[i][0] = 'X';
				return;
			}	
			if (table[0][i] == 'X' && table[1][i] == 'X' && table[2][i] == ' ') {
				table[2][i] = 'X';
				return;
			}
			if (table[0][i] == 'X' && table[2][i] == 'X' && table[1][i] == ' ') {
				table[1][i] = 'X';
				return;
			}
			if (table[2][i] == 'X' && table[1][i] == 'X' && table[0][i] == ' ') {
				table[0][i] = 'X';
				return;
			}			
		}
		if (table[0][0] == 'X' && table[1][1] == 'X' && table[2][2] == ' ') {
			table[2][2] = 'X';
			return;
		}
		if (table[0][0] == 'X' && table[2][2] == 'X' && table[1][1] == ' ') {
			table[1][1] = 'X';
			return;
		}
		if (table[2][2] == 'X' && table[1][1] == 'X' && table[0][0] == ' ') {
			table[0][0] = 'X';
			return;
		}		
		if (table[0][2] == 'X' && table[1][1] == 'X' && table[2][0] == ' ') {
			table[2][0] = 'X';
			return;
		}
		if (table[0][2] == 'X' && table[2][0] == 'X' && table[1][1] == ' ') {
			table[1][1] = 'X';
			return;
		}
		if (table[2][0] == 'X' && table[1][1] == 'X' && table[0][2] == ' ') {
			table[0][2] = 'X';
			return;
		}			
		
		//block user
		for (int i=0; i<3; i++) {
			if (table[i][0] == 'O' && table[i][1] == 'O' && table[i][2] == ' ') {
				table[i][2] = 'X';
				return;
			}
			if (table[i][0] == 'O' && table[i][2] == 'O' && table[i][1] == ' ') {
				table[i][1] = 'X';
				return;
			}
			if (table[i][2] == 'O' && table[i][1] == 'O' && table[i][0] == ' ') {
				table[i][0] = 'X';
				return;
			}	
			if (table[0][i] == 'O' && table[1][i] == 'O' && table[2][i] == ' ') {
				table[2][i] = 'X';
				return;
			}
			if (table[0][i] == 'O' && table[2][i] == 'O' && table[1][i] == ' ') {
				table[1][i] = 'X';
				return;
			}
			if (table[2][i] == 'O' && table[1][i] == 'O' && table[0][i] == ' ') {
				table[0][i] = 'X';
				return;
			}			
		}
		if (table[0][0] == 'O' && table[1][1] == 'O' && table[2][2] == ' ') {
			table[2][2] = 'X';
			return;
		}
		if (table[0][0] == 'O' && table[2][2] == 'O' && table[1][1] == ' ') {
			table[1][1] = 'X';
			return;
		}
		if (table[2][2] == 'O' && table[1][1] == 'O' && table[0][0] == ' ') {
			table[0][0] = 'X';
			return;
		}		
		if (table[0][2] == 'O' && table[1][1] == 'O' && table[2][0] == ' ') {
			table[2][0] = 'X';
			return;
		}
		if (table[0][2] == 'O' && table[2][0] == 'O' && table[1][1] == ' ') {
			table[1][1] = 'X';
			return;
		}
		if (table[2][0] == 'O' && table[1][1] == 'O' && table[0][2] == ' ') {
			table[0][2] = 'X';
			return;
		}	
		
		//if cannot win or cannot block user then random move
		boolean done = false;
		Random r = new Random();
		int a,b;
		while (!done) {
			a = r.nextInt(3);
			b = r.nextInt(3);
			if (table[a][b] == ' ') {
				table[a][b] = 'X';
				done = true;
			}
		}
	}
	
	/**
	 * User move
	 */
	private static void userMove() {
		boolean correct = false;
		System.out.println("Podaj wspolrzedne dla kolka (np: a1): ");
		while (!correct) {
			String coord = input.next();
			if (coord.length() != 2) {
				System.out.println("Nieprawidlowe wspolrzedne");
			} else if (coord.charAt(0) != 'a' &&
					   coord.charAt(0) != 'b' &&
					   coord.charAt(0) != 'c') {
				System.out.println("Nieprawidlowy poczatek wspolrzednych (moze byc a, b lub c)");
			}  else if (coord.charAt(1) != '1' &&
					   coord.charAt(1) != '2' &&
					   coord.charAt(1) != '3') {
				System.out.println("Nieprawidlowy koniec wspolrzednych (moze byc 1, 2 lub 3)");
			} else {
				int a, b;
				if (coord.charAt(0) == 'a') {
					a = 0;
				} else if (coord.charAt(0) == 'b') {
					a = 1;
				} else {
					a = 2;
				}
				if (coord.charAt(1) == '1') {
					b = 0;
				} else if (coord.charAt(1) == '2') {
					b = 1;
				} else {
					b = 2;
				}
				if (table[a][b] != ' ') {
					System.out.println("To pole jest juz zajete");
				} else {
					table[a][b] = 'O';
					correct = true;
				}
			}
		}
	}	
	
	private static void printTable() {
		System.out.println();
		System.out.println();
		System.out.println("    1 2 3");
		System.out.println("a   " + table[0][0]+ "|" + table[0][1]+ "|" + table[0][2]);
		System.out.println("b   " + table[1][0]+ "|" + table[1][1]+ "|" + table[1][2]);
		System.out.println("c   " + table[2][0]+ "|" + table[2][1]+ "|" + table[2][2]);
		
	}
	
	public static void main(String[] args) {

		while (!checkResult()) {
			printTable();
			if (computer) {
				computerMove();
			} else {
				userMove();
			}
		}
		printTable();
	}

}
