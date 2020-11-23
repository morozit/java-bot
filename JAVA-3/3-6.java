import java.util.*;
 
public class ChatBot {

    public static int find(String message, Map<String, Integer> data) {
        message = message.toLowerCase();

        for(String word: data.keySet()) {
             String lowerCasedWord = word.toLowerCase();   //Пишите код в этой строке

            if (message.contains(lowerCasedWord)) {
                return data.get(word);
            }
        }

        return -1;
    }
}