package task2;

import java.io.File;

public class Convertertest {
    public static final String FILE_FROM = "src/file.txt";
    public static final String FILE_TO = "src/file.json";
    public static void main(String[] args) {
    Converter test = new Converter();
    test.converter(FILE_FROM);

    }
}
