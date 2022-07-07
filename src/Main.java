public class Main {
    public static void main(String[] args) {
        int startAmount = 100;
        int addSum = 900;
        int amount = startAmount + addSum;
        int bonus = amount / 100;
        int totalMoney = amount + bonus;
        if (amount > 1000) {
            System.out.println(totalMoney);
            System.out.println(bonus);
        } else {
            System.out.println(amount);
        }
    }
}