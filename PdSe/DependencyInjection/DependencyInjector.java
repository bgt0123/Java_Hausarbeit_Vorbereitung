package PdSe.DependencyInjection;

public class DependencyInjector {
    public static void main(String[] args) {
        KlasseA a = new KlasseA("Bennet");
        KlasseB b = new KlasseB();
        b.setA(a);//Dies injektiert das abhängige Objekt von Typ KlasseA
        System.out.println(b.getA().getName()); // returns "Bennet"
    }
}
