public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int refill = 1001;


        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;

        } else {
            bonus = 0;
        }


        System.out.println("Бонус равен: " + bonus + " руб.");
        System.out.println("Итоговая сумма на счету: " + (startBalance + refill + bonus) + " руб.");


    }
}
