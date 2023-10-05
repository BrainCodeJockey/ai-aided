package de.neuefische;
import static de.neuefische.StringReverser.reverse;

public class Main {
        // Hauptmethode zum Testen der reverse-Methode
        public static void main(String[] args) {
            // Testzeichenkette
            String testString = "Hallo";
            // Aufruf der reverse-Methode und Ausgabe des Ergebnisses
            System.out.println(StringReverser.reverse(testString));  // Ausgabe: "ollaH"
        }
    }
