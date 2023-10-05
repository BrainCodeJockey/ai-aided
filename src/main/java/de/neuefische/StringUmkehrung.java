package de.neuefische;

public class StringUmkehrung {
    public static String umkehren(String eingabe) {
        // Überprüfen, ob die Eingabe null ist
        if (eingabe == null) {
            return null;
        }

        // Die Länge der Eingabezeichenkette abrufen
        int length = eingabe.length();

        // Ein StringBuilder-Objekt erstellen, um die umgekehrte Zeichenkette aufzubauen
        StringBuilder umgekehrteZeichenkette = new StringBuilder(length);

        // Die Zeichen von hinten nach vorne zur umgekehrten Zeichenkette hinzufügen
        for (int i = length - 1; i >= 0; i--) {
            umgekehrteZeichenkette.append(eingabe.charAt(i));
        }

        // Die umgekehrte Zeichenkette als String zurückgeben
        return umgekehrteZeichenkette.toString();
    }

    public static void main(String[] args) {
        String eingabe = "Hallo";
        String umgekehrteZeichenkette = umkehren(eingabe);
        System.out.println("Ursprüngliche Zeichenkette: " + eingabe);
        System.out.println("Umgekehrte Zeichenkette: " + umgekehrteZeichenkette);
    }
}
