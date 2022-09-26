package OOP.Test;
import OOP.Klassen.*;

public class Klassen {
    public static void main(String[] args) {
       //Geschachtelte Klassen
        InnereKlassen Outer = new InnereKlassen();
        InnereKlassen.InnereNonStatischeKlasse Innere = Outer.new InnereNonStatischeKlasse();

       // Anonyme Klassen
        AnonymeKlasse Outer2 = new AnonymeKlasse();
        AnonymeKlasse.AnonymeKlasseInner anonymeKlasse1 = Outer2.new AnonymeKlasseInner();
        anonymeKlasse1.createClass();

       // Getter & Setter
        GetterSetterKonstruktor Outer3 = new GetterSetterKonstruktor(1,"hallo");


    }
}
