package PdSe.Streams;

import java.nio.charset.StandardCharsets;

public class OutputStream {

    OutputStream os = new OutputStream();

    String text = "HALLO";

    public void write(byte[] bytes) {
        try {
            os.write(this.text.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {

        }
    }
}
