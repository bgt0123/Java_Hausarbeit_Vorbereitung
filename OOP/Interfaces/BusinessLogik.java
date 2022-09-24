package OOP.Interfaces;

import java.util.ArrayList;

public class BusinessLogik {
    private ArrayList<ITest> list = new ArrayList<>();
    public void listAdder(){
        list.add(new ImplementierteKlasse());
        list.add(new Subklasse());
    }
}
