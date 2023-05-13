import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
    }

    public static void task1() {
        System.out.println("Task1");
        int total = 0;
        int initialSavings = 15_000;
        int demandSavings = 2_459_000;
        int month = 0;

        while (total < demandSavings) {
            total = total + initialSavings;
            month++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей %n", month, total);
        }
    }

    public static void task2() {
        System.out.println("Task2");
        int number = 1;
        int maxNumber = 10;
        while (number <= maxNumber) {
            System.out.print(number + " ");
            number++;
        }

        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("Task3");
        long popularity = 12_000_000;
        double birthrate = 17.0 / 1000;
        double mortality = 8.0 / 1000;
        int maxYear = 10;

        double popularityInTime = popularity;
        int currYear = 0;

        while (currYear < maxYear) {
            currYear++;
            popularityInTime = popularityInTime + birthrate * popularityInTime - mortality * popularityInTime;
            System.out.printf("Год %d, численность населения составляет %.2f + %n", currYear, popularityInTime);
        }
    }

    public static void task4() {
        System.out.println("Task4");
        double rate = 0.07;
        int initialDeposit = 15_000;
        long demDeposit = 12_000_000;
        double depositInTime = initialDeposit;
        int month = 0;
        while (depositInTime <= demDeposit) {
            depositInTime = depositInTime + depositInTime * rate;
            month++;
            System.out.printf(Locale.US, "Месяц %d, сумма накоплений %,.2f %n", month, depositInTime);
        }
    }

    public static void task5() {
        System.out.println("Task5");
        double rate = 0.07;
        int initialDeposit = 15_000;
        long demDeposit = 12_000_000;
        double depositInTime = initialDeposit;
        int month = 0;
        while (depositInTime <= demDeposit) {
            depositInTime = depositInTime + depositInTime * rate;
            month++;
            if (month % 6 == 0) {
                System.out.printf(Locale.US, "Месяц %d, сумма накоплений %,.2f %n", month, depositInTime);
            }
        }
    }

    public static void task6() {
        System.out.println("Task6");
        int countYear = 9;
        int countMonth = 9 * 12;

        double rate = 0.07;
        int initialDeposit = 15_000;
        double depositInTime = initialDeposit;
        int month = 0;
        while (month <= countMonth) {
            depositInTime = depositInTime + depositInTime * rate;
            month++;
            if (month % 6 == 0) {
                System.out.printf(Locale.US, "Месяц %d, сумма накоплений %,.2f %n", month, depositInTime);
            }
        }
    }

    public static void task7() {
        System.out.println("Task7");
        int firstFridayInJanuary = 6;
        int countDaysInJanuary = 31;
        int friday = firstFridayInJanuary;
        while (friday < countDaysInJanuary) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет %n", friday);
            friday += 7;
        }
    }

    public static void task8() {
        System.out.println("Task8");
        int firstYear = 0;
        int countYearsInPeriod = 79;

        int initialYear = 2023 - 200;
        int lastYear = 2023 + 100;
        int year = initialYear;

        while (year < lastYear) {
            if (year % countYearsInPeriod == 0) {
                System.out.print(year + " ");
            }
            year++;
        }
    }

}