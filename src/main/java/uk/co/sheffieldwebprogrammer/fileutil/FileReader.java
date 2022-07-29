package uk.co.sheffieldwebprogrammer.fileutil;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileReader {
    public FileReader() {
    }

    public void readFile(){
        InputStream is = getClass().getClassLoader().getResourceAsStream("test.txt");
        if (is == null) {
            throw new IllegalArgumentException("file not found!");
        } else {
            try (InputStreamReader streamReader =
                         new InputStreamReader(is, StandardCharsets.UTF_8);
                 BufferedReader reader = new BufferedReader(streamReader)) {

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
