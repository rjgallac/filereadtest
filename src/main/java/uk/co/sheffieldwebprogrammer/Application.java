package uk.co.sheffieldwebprogrammer;

import uk.co.sheffieldwebprogrammer.fileutil.FileReader;


public class Application {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.readFile();
    }
}
