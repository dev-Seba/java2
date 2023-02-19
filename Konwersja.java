import java.util.Scanner;

public class Konwersja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę dziesiętną: ");
        int liczba = scanner.nextInt();
        System.out.print("Wybierz system liczbowy (2 - binarny, 8 - ósemkowy, 16 - szesnastkowy): ");
        int system = scanner.nextInt();
        scanner.close();

        String wynik = "";
        switch (system) {
            case 2:
                while (liczba > 0) {
                    wynik = (liczba % 2) + wynik;
                    liczba = liczba / 2;
                }
                break;
            case 8:
                while (liczba > 0) {
                    wynik = (liczba % 8) + wynik;
                    liczba = liczba / 8;
                }
                break;
            case 16:
                while (liczba > 0) {
                    int reszta = liczba % 16;
                    if (reszta < 10) {
                        wynik = reszta + wynik;
                    } else {
                        wynik = (char) ('A' + reszta - 10) + wynik;
                    }
                    liczba = liczba / 16;
                }
                break;
            default:
                System.out.println("Nieprawidłowy wybór systemu liczbowego!");
                return;
        }
        System.out.println("Liczba w systemie " + system + "-kowym: " + wynik);
    }
}