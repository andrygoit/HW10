package task1;

import java.io.File;
import java.io.FileNotFoundException;

public class PhoneValidatorTests {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/phoneNumbers.txt");
        PhoneValidator phoneValidator = new PhoneValidator();
        phoneValidator.validator(file);
    }
}
