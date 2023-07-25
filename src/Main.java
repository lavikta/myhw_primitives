public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int ballance = 100; // изначальная сумма на счету
        int addAccount = 300; // сумма пополнения
        int bonus = (addAccount / 100);

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        if (addAccount > 1000) {
            // Вычисляем сумму бонуса
            bonus = (addAccount / 100);
        } else {
            bonus = 0;
        }
        int totalBalance = ballance + addAccount + bonus; // итоговая сумма на счету клиента

        System.out.println("Итоговая сумма на счету клиента: " + totalBalance + " рублей");
        System.out.println("Сумма бонуса: " + bonus + " рублей");
    }
}
