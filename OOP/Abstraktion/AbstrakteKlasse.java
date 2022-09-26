package OOP.Abstraktion;

/**
 * abstrakte Klassen: es können keine Exemplare (new) gebildet werden
 * Konstruktor mit super(..) in Unterkalssen möglich
 * Klasse muss abstract deklariert sein wenn mindestens eine Methode mit abstrakt deklariert wurde oder
 * wenn eine abstrakte Methode von der Oberklasse geerbt wird
 *
 * Verwendung um Eigenschaften und Fähigkeiten einer allgemeinen
 * Typgruppe zu definieren, deren abgeleitete Unterklassen diese dann weiter spezifizieren.
 * keine Implementierung und nicht mit static oder final
 *
 * abstakte Methoden erst später von abgeleiteten Klassen implementiert werden (aufschieben von dem Implementieren)
 *
 */

public abstract class AbstrakteKlasse {

    public abstract void abstakteKlasse();

    public void normaleKlasse() {
        //...
    }

}
