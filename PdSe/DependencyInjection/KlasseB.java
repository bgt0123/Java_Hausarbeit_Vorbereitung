package PdSe.DependencyInjection;

public class KlasseB {
    private KlasseA a;

    public KlasseB(){
        // Abhängigkeit würde so aussehen: this.a = new KlasseA();
    }

    public void setA(KlasseA a) {
        this.a = a;
    }

    public KlasseA getA() {
        return a;
    }
}
