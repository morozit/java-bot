public class ChatBot {
    public static String process(String message) {
        if (isHelloMessage(message)) {
            String botName = "GoITeensChatBot";
            return "Приветствую, я - " +  botName;//Пишите ваш код в этой строке
        }
        return "Я вас не понимаю";
    }

    private static boolean isHelloMessage(String message) {
        message = message.toLowerCase();
        String helloWord1 = "здравствуй";
        String helloWord2 = "привет";
        return message.contains(helloWord1) || message.contains(helloWord2);
    }
}