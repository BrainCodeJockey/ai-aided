package de.neuefische;

public class StringReverser {

    // Methode zum Umkehren einer Zeichenkette
    public static String reverse(String input) {
        // StringBuilder wird verwendet, um die umgekehrte Zeichenkette zu speichern
        StringBuilder reversed = new StringBuilder();
        // Durchlaufen der Eingabezeichenkette von hinten nach vorne
        for (int i = input.length() - 1; i >= 0; i--) {
            // Hinzufügen jedes Zeichens zur umgekehrten Zeichenkette
            reversed.append(input.charAt(i));
        }
        // Rückgabe der umgekehrten Zeichenkette
        return reversed.toString();
    }
}

