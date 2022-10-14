package PdSe;

import PdSe.Exceptions.LeeresArray;
import PdSe.Exceptions.ThrowingException;
import PdSe.Streams.InputStreamClass;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //new InputStreamClass().input();
        //new InputStreamClass().readinput();

        ThrowingException ex = new ThrowingException();
        String[] s = {};
        try {
            String first = ex.getFirst(s);
        } catch (LeeresArray e) {
            System.out.println(e.getMessage()); // Gibt die Message aus ThrowingException zurück
            System.out.println("Leeres Array Übergeben!");
            //e.printStackTrace();
        }


        // JUnit tests

    }
}
