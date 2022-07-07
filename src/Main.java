public class Main {
    public static void main(String[] args) {
        int firstAmount = 200;
        int depositAmount = 1100;
        int scale = 100;
        int bonus;
        if (depositAmount >= 1000) {
            bonus = depositAmount / scale;
        } else {
            bonus = 0;
        }
            int totalAmount = firstAmount + depositAmount + bonus;
            System.out.println(" Вы пополнили счет на " + depositAmount + " руб.");
            System.out.println(" Ваш бонус составляет " + bonus + " руб.");
            System.out.println(" Ваш баланс " + totalAmount + " руб.");
    }
}
