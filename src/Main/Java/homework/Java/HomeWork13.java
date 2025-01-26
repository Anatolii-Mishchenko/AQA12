package Main.Java.homework.Java;

import java.util.HashMap;
import java.util.Map;

public class HomeWork13 {
    public static void main(String[] args) {
        String[] words = {"morning", "evening", "afternoon", "morning", "noon", "night", "day", "week", "month", "year"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);

        System.out.println(map.keySet());


        System.out.println();
        PhoneBook pb = new PhoneBook();

        pb.add("Smith", "+375938583758");
        pb.add("Bond", "+375867452839");
        pb.add("Depp", "+375638592756");
        pb.add("Hemsworth", "+375253752653");
        pb.add("DiCaprio", "+375648628485");
        pb.add("Da Vinci", "+37562985967");

        String lastName = "Smith";
        System.out.println(pb.get(lastName));
    }
}
