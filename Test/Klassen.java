package Test;

/**
 * Test.Klassen = Baupläne/Schablonen für Objekte.Eine Klasse beschreibt den Zustandsraum und das Verhalten für
 * gleichartige Objekte.
 *
 * Konstruktor = Initialisieren Objekte und bringen sie in einen konsistenten Anfangszustand
 */

public class Klassen {
    private int Klassen_nr; // Variablen sind für ein Objekt nie auf public zu setzten (Kapselung)
    private String Klassenname;

    Klassen(int Klassen_nr, String Klassenname){ //Dies ist ein Konstruktor - wird beim Erstellen eines Objektes der Klasse von Nutzen gemacht --> Gibt es diese nicht, wird ein Leerer Konstruktor gestellt
        this.Klassen_nr = Klassen_nr;
        this.Klassenname = Klassenname;
    }

    public int getKlassen_nr() { //Sonderiende Methode
        return Klassen_nr;
    }

    public void setKlassen_nr(int klassen_nr) { //Verändernde Methode
        Klassen_nr = klassen_nr;
    }

    public String getKlassenname() {
        return Klassenname;
    }

    public void setKlassenname(String klassenname) {
        Klassenname = klassenname;
    }

    public void printKlasse(){
        System.out.println("Ich bin Klasse Nr.:"+ Klassen_nr+" mit den Namen Klassenname:"+Klassenname);
    }
}