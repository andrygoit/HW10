package task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhoneValidator {
    public void validator(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        while (in.hasNextLine()){
            String s = in.nextLine();
            if (s.matches("^\\(\\d{3}\\)\\s\\d{3}\\-\\d{4}") || s.matches("^\\d{3}\\-\\d{3}\\-\\d{4}")){
                System.out.println(s);
            }
        }
        in.close();
    }

}
