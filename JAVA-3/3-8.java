 import java.util.*;
 
public class ChatBot {
    public static String process(String message) {
        if (isHelloMessage(message)) {
            String botName = "GoITeensChatBot";
            return "Приветствую, я - " + botName;
        }

        int professionSalary = find(message, professions);
        int dreamCost = find(message, dreams);

        if (professionSalary < 0) {
            return "Я не нашел в твоем сообщении названия профессии";
        }

        //Пишите код под этой строкой         
        if (dreamCost < 0) {
            return "Я не нашел в твоем сообщении описания мечты";
        }          

        return "Заработная плата - " + professionSalary + ", стоимость осуществления мечты - " + dreamCost;
    }

    public static int find(String message, Map<String, Integer> data) {
        message = message.toLowerCase();

        for(String word: data.keySet()) {
            String lowerCasedWord = word.toLowerCase();

            if (message.contains(lowerCasedWord)) {
                return data.get(word);
            }
        }

        return -1;
    }

    private static boolean isHelloMessage(String message) {
        message = message.toLowerCase();

        String helloWord1 = "здравствуй";
        String helloWord2 = "привет";

        return message.contains(helloWord1) || message.contains(helloWord2);
    }

    private static Map<String, Integer> dreams = new HashMap<>();
    private static Map<String, Integer> professions = new HashMap<>();

    static {
        dreams.put("iPhoNe", 27000);
        dreams.put("Машин", 100000);

        professions.put("Designer", 20000);
        professions.put("Java", 55000);
        professions.put("Frontend", 40000);
    }
}
