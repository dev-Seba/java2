import java.util.Scanner;

public class Potegi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę do potęgi:");
        int podstawa = scan.nextInt();
        int potega = 1;

        System.out.println("Potęgi liczby 2:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(potega);
            potega = potega * podstawa;
        }
    }
}