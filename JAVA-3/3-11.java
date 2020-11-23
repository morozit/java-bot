public class ChatBot {
    public static int calculateMonthCount(int dreamCost, int professionSalary) {
         //Пишите ваш код под этой строкой
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
}
