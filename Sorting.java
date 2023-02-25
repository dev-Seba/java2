import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wczytanie tablicy do posortowania
        System.out.println("Podaj elementy tablicy do posortowania, oddzielone przecinkami:");
        String input = scanner.nextLine();
        String[] inputArray = input.split(",");
        int[] arr = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i].trim());
        }

        // Wybór algorytmu sortowania za pomocą switch
        System.out.println("Wybierz algorytm sortowania:");
        System.out.println("1. Sortowanie babelkowe");
        System.out.println("2. Sortowanie przez wstawianie");
        System.out.println("3. Sortowanie przez wymiane");
        System.out.println("4. Szybkie sortowanie");
        System.out.println("5. Sortowanie przez zliczanie");
        System.out.println("6. Sortowanie przez scalanie");

        int algorithmChoice = scanner.nextInt();

        switch (algorithmChoice) {
            case 1:
                bubbleSort(arr);
                break;
            case 2:
                insertionSort(arr);
                break;
            case 3:
                selectionSort(arr);
                break;
            case 4:
                quickSort(arr, 0, arr.length - 1);
                break;
            case 5:
                countingSort(arr);
                break;
            case 6:
                mergeSort(arr, 0, arr.length - 1);
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
                return;
        }

        // Wyświetlenie posortowanej tablicy
        System.out.println("Posortowana tablica:");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        // Implementacja sortowania bąbelkowego
        // ...
    }

    public static void insertionSort(int[] arr) {
        // Implementacja sortowania przez wstawianie
        // ...
    }

    public static void selectionSort(int[] arr) {
        // Implementacja sortowania przez wymianę
        // ...
    }

    public static void quickSort(int[] arr, int low, int high) {
        // Implementacja szybkiego sortowania
        // ...
    }

    public static void countingSort(int[] arr) {
        // Implementacja sortowania przez zliczanie
        // ...
    }

    public static void mergeSort(int[] arr, int left, int right) {
        // Implementacja sortowania przez scalanie
        // ...
    }
}