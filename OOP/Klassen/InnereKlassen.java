package OOP.Klassen;

import org.w3c.dom.ls.LSOutput;

/**
 * Grund für innere Klassen = Gruppierung der Klassen die zusammengehören, um so den Code besser lesbar und reperierbar zu machen.
 * Wann verwenden ? -> Wenn sich die Anforderungen der Klassen ähneln
 * Static --> Verwendet wenn kein Zugriff auf die Äußere Klasse benötigt wird
 * Nicht Static --> Verwendet wenn Zugriff auf die Äußere Klasse benötigt wird
 *
 */
public class InnereKlassen { // Dies ist die Äußere Klasse
    int x = 10;

    public int getX() {
        return x;
    }

    static class InnereStatischeKLasse{ // Dies ist die Innere Klasse
        int y = 5;

        public void printOuterX(){
            //System.out.println(InnereKlassen.this.getX());// funktioniert nicht
        }

    }
    public class InnereNonStatischeKlasse{
        int y = 5;
        public void printOuterX(){
            System.out.println(InnereKlassen.this.getX());// funktioniert nicht
        }
    }
}
