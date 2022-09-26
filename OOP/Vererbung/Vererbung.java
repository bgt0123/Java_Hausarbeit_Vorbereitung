package OOP.Vererbung;

public abstract class Vererbung {
    private int lokaleVariable;
    private String name;
    public Vererbung(int lokal, String name){
        this.lokaleVariable = lokal;
        this.name = name;
    }
    public abstract void nonimplementedMethod();

    public void implementedMethod(){
        System.out.println("This is a implemented Method from the superclass with name="+name);
    }

}
