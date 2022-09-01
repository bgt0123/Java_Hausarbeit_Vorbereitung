package Test;

/**
 * Objekte = repräsentieren zusammengehörige Aspekte eines Anwendungsbereichs.
 */
public class MAIN {
    public static void main(String[] args) {
        System.out.println("KLASSEN");
        new Klassen(1, "Testklasse").printKlasse(); // Dies ist ein Objekt
        System.out.println("INTERFACE");
        new InterfaceKlasse().printKlasse();
    }
}
