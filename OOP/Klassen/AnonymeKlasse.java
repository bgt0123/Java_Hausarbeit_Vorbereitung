package OOP.Klassen;


/**
 * Anonyme Klassen sollten verwendet werden, wenn Variablen definiert werden sollen
 * oder hinzufügende Methoden definiert werden sollen
 * --> definiert und instantiert
 * ähnelt verschachtelte Klassen
 */
public class AnonymeKlasse {
    public void display() {
        System.out.println("Outer Klasse");
    }

    public class AnonymeKlasseInner {
        public void createClass() {
            // creation of anonymous class extending class Polygon
            AnonymeKlasse anonymeKlasse = new AnonymeKlasse() {
                public void display() {
                    System.out.println("Anonyme Klasse");
                }
            };
            anonymeKlasse.display();
        }
    }
}