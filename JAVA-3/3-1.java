public class ChatBot {
    private static boolean isHelloMessage(String message) {
        message = message.toLowerCase();

        String helloWord1 = "привет";
        String helloWord2 = "здравствуй"; //Пишите код в этой строке

        return message.contains(helloWord1) || message.contains(helloWord2);
    }
}