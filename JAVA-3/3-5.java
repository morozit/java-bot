import java.util.*;
 
public class ChatBot {
    public static void main(String[] args) {
        Map<String, Integer> population = new LinkedHashMap<>();
        population.put("Kyiv", 2965000);
        population.put("Kharkiv", 1443000);
        population.put("Lviv", 724000);
        population.put("Vinnytsia", 370000);
 
        for(String city: population.keySet()) {
            int amount = population.get(city);
            String record = city + " - " + amount;
            //Пишите ваш код под этой строкой, выведите record 
            System.out.println(record);
        }
    }
}