import java.util.Random;
import java.util.Scanner;

public class Losowanie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj Liczbę od 1 do 10");
        int twojaliczba = scan.nextInt();
        if (twojaliczba < 1 || twojaliczba > 10) {
            System.out.printf("Nieprawidłowa liczba");
        } else {
            Random generator = new Random();
            int liczba = generator.nextInt(10) + 1;
            if (liczba == twojaliczba) {
                System.out.println("Wygrałeś");
            } else {
                System.out.printf("Przegrałeś liczba wygrana to "+liczba);
            }
        }
    }
}