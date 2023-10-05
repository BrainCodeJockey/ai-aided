package de.neuefische;

public class PrimeNumberGenerator {
    public static void generatePrimes(int n) {
        if (n <= 0) {
            System.out.println("Bitte geben Sie eine positive Zahl n ein.");
            return;
        }

        int count = 0; // Zählt die gefundenen Primzahlen
        int num = 2;   // Die aktuelle Zahl, die überprüft wird

        System.out.print("Die ersten " + n + " Primzahlen sind: ");

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

        System.out.println(); // Neue Zeile am Ende
    }

    // Hilfsfunktion zur Überprüfung, ob eine Zahl prim ist
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Überprüfen, ob number durch Zahlen von 2 bis zur Wurzel von number teilbar ist
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Wenn number durch i teilbar ist, ist es keine Primzahl
            }
        }

        return true; // Wenn keine Teilbarkeit gefunden wurde, ist es eine Primzahl
    }

    public static void main(String[] args) {
        int n = 100; // Anzahl der gewünschten Primzahlen
        generatePrimes(n);
    }
}
