package OOP.Vererbung;


public class SubKlasse extends Vererbung{ // Wenn man die Abstrakte Method nicht mit implementieren möchte, gilt es die Signatur der Subklasse auch abstrakt zu machen
    private int lokaleVariable;
    private String name;
    public SubKlasse(int lokal, String name){
        super(lokal, name); // Der Konstruktor der Superklasse wird hier verwendet, da dieser die Variablen name und lokaleVariable in der SubKlasse zuweist, sodass diese in der hier implementierten Methode ausgeben.

    }
    public void nonimplementedMethod() {
        System.out.println("This is a implemented Method from the subclass with name="+this.name);
    }

}
