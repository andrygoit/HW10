package task3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public void wordsCount(File file){
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line = reader.readLine();
            ArrayList<String> list = new ArrayList<>();
            Map<String, Integer> map = new HashMap<>();
            while(line != null){
                String[] words;
                words = line.split(" ");
                for (int i = 0; i < words.length; i++){
                    list.add(words[i]);
                }
                line = reader.readLine();
            }
            for (String words : list){
                if (map.containsKey(words)){
                    map.put(words,map.get(words) + 1);
                    continue;
                }
                map.put(words, 1);
            }
            map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).forEach(s ->
                    System.out.println(s.getKey() + " " + s.getValue()));
        } catch (IOException e){
            System.out.println(" ");
        }
    }

}
