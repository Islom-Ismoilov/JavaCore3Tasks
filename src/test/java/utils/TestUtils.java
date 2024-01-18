package utils;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestUtils {

    public static String captureSystemOut(Runnable code){
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        try {
            code.run();
            return outputStream.toString();
        } finally {
            System.setOut(originalOut);
        }
    }
}
