package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month == 4 || month == 6 || month == 7 || month == 9 || month == 11) {
            System.out.println("30");
        } else if (month == 2) {
            System.out.println("28");
        } else if (month == 1 || month == 3 || month == 5 || month == 8 || month == 10 || month == 12) {
            System.out.println("31");
        } else {
            System.out.println("wrong number!");
        }
    }
}
