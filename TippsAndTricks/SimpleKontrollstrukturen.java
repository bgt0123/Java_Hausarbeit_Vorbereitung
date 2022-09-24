package TippsAndTricks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class SimpleKontrollstrukturen  {

    //Equals vs ==

    // Comparable vs. Comperator --> Sortieren von elementen
    // --> Comperator ermöglicht eine andere Sortierung von Elementen/Objekten als die natürlich
    //--> Comperable fordert eine natürliche Sortierung

    public String orderArray(){
        String[] names = {"Mary", "James", "Patricia", "John", "Jennifer", "Robert"};
        Arrays.sort(names);
        return Arrays.toString(names);
    }


    // Iterator --> Am Besten verwendet, wenn es sich um ein Hashset oder LinkedList bspw. handelt, die nicht mit indizes arbeiten
    ArrayList myList = new ArrayList<String>();

    public void fillmyList(){
        myList.add("ONE");
        myList.add("TWO");
        myList.add("THREE");
    }

    public void emptymyList(){
        myList.removeAll(myList);
    }

    public void useIterator (){
        fillmyList();
        Iterator<String> it = myList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        emptymyList();
    }

}
