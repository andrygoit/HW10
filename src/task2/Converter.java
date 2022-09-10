package task2;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Converter {
    ArrayList<User> users = new ArrayList<User>();
    String to = "src/file.json";
    public void converter(String from) {
        File file = new File(from);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                if (line.equals("name age")) {
                    line = reader.readLine();
                }
                String[] lineArray = line.split(" ");
                String name = lineArray[0];
                int age = Integer.parseInt(lineArray[1]);
                User user = new User(name, age);
                users.add(user);
                line = reader.readLine();


            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String userJson = gson.toJson(users);
        File fileJson = new File(to);
        try (FileWriter write = new FileWriter(fileJson)) {
            write.write(userJson);
            write.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

