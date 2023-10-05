package de.neuefische;

public class PalindromCheck {
    public static boolean istPalindrom(String eingabe) {
        // Überprüfen, ob die Eingabe null ist
        if (eingabe == null) {
            return false;
        }

        // Die Länge der Eingabezeichenkette abrufen
        int length = eingabe.length();

        // Die Zeichen von vorne und hinten vergleichen, um zu überprüfen, ob es sich um ein Palindrom handelt
        for (int i = 0; i < length / 2; i++) {
            if (eingabe.charAt(i) != eingabe.charAt(length - 1 - i)) {
                return false; // Wenn die Zeichen nicht übereinstimmen, ist es kein Palindrom
            }
        }

        return true; // Wenn alle Zeichen übereinstimmen, ist es ein Palindrom
    }

    public static void main(String[] args) {
        String eingabe = "anna";
        boolean istEinPalindrom = istPalindrom(eingabe);
        System.out.println("Eingabe: " + eingabe);
        System.out.println("Ist ein Palindrom: " + istEinPalindrom);
    }
}
