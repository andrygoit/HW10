package task3;

import java.io.File;

public class CountWordsTests { public static void main(String[] args) {
    File file = new File("src/words.txt");
    CountWords countWords = new CountWords();
    countWords.wordsCount(file);

}
}
