package Test;

public class InterfaceKlasse implements TestInterface{
    private int Klassen_nr;
    private String Klassenname;


    public void printKlasse(){
        System.out.println("Ich bin Klasse Nr.:"+ Klassen_nr+" mit den Namen Klassenname:"+Klassenname);
    }
}
