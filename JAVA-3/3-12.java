import java.util.*;
 
public class ChatBot {
    private static Map<String, Integer> professions;
    private static Map<String, Integer> dreams;
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
 
        initProfessions();
        initDreams();

        //Пишите код под этой строкой
        String botAnswer = process(message);
        System.out.println(botAnswer);
    }
 
    private static void initProfessions() {
        professions = new LinkedHashMap<>();
 
        professions.put("Designer", 20000);
        professions.put("Java", 55000);
        professions.put("Frontend", 40000);
    }
 
    private static void initDreams() {
        dreams = new LinkedHashMap<>();
 
        dreams.put("Машин", 260000);
        dreams.put("iPhone", 27000);
    }
 
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
 
        if (dreamCost < 0) {
            return "Я не нашел в твоем сообщении описания мечты";
        }
 
        int monthCount = calculateMonthCount(dreamCost, professionSalary);
 
        return "Чтобы осуществить свою мечту, нужно работать месяцев: " + monthCount;
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
 
    public static int calculateMonthCount(int dreamCost, int professionSalary) {
        int monthCount = dreamCost / professionSalary;
        monthCount = validateMonthCount(monthCount);
        return monthCount;
    }
 
    public static int validateMonthCount(int monthCount) {
        if (monthCount == 0) {
            return 1;
        }
 
        return monthCount;
    }
 
    private static boolean isHelloMessage(String message) {
        message = message.toLowerCase();
 
        String helloWord1 = "здравствуй";
        String helloWord2 = "привет";
 
        return message.contains(helloWord1) || message.contains(helloWord2);
    }
}