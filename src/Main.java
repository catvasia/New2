public class Main {
    public static void main(String[] args) {
        int nextCheck = 200;
        int replenishment = 100;

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Количество бонусных рублей: " + bonus);

        int total;
        if (replenishment <= 1000) {
            total = nextCheck + replenishment;
        } else {
            total = nextCheck + replenishment + bonus;
        }
        System.out.println("Итоговый счёт: " + total);
    }
}