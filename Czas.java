import java.util.Scanner;

public class Czas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long unixTimeMillis = System.currentTimeMillis();
        long sek = unixTimeMillis/1000;
        long min = sek/60;
        long godz = min/60;
        long dzien = godz/24;
        long lata = dzien/365;
        System.out.println("1. Unix milliseconds");
        System.out.println("2. Unix Seconds");
        System.out.println("3. Unix Minutes");
        System.out.println("4. Unix Hours");
        System.out.println("5. Unix Days");
        System.out.println("6. Unix Years");
        System.out.println("7. Exit");
        System.out.println("Wybierz(1/2/3/4/5/6/7)");
        int unix = scanner.nextInt();
        switch (unix) {
            case 1: {
                System.out.println("Czas unixowy w milisekundach: " + unixTimeMillis);
                break;
            }
            case 2: {
                System.out.println("Czas unixowy w sekundach: " + sek);
                break;
            }
            case 3: {
                System.out.println("Czas unixowy w minutach: " + min);
                break;
            }
            case 4: {
                System.out.println("Czas unixowy w godzinach: " + godz);
                break;
            }
            case 5:{
                System.out.println("Czas unixowy w dnaich: " + dzien);
                break;
            }
            case 6: {
                System.out.println("Czas unixowy w latach: " + lata);
                break;
            }
            case 7: {
                break;
            }
            default: {
                System.out.println("Wybrałes nieistniejaca opcje");
                break;
            }
        }
    }
}