package PdSe.Streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class InputStreamClass {
    InputStream inputStream = null;
    File file = new File("C:\\Users\\benne\\Documents\\NAK\\Semester 4\\Java_Hausarbeit_Vorbereitung\\PdSe\\Streams\\test.txt");

    public void input() throws IOException {
        int i;
        char c;

        try {
            inputStream = new FileInputStream(file);

            while ((i = inputStream.read()) != -1){
                c = (char) i;
                System.out.println(c);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            inputStream.close();
        }
    }

    public void readinput(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Die Eingabe war: "+s);
    }

}
