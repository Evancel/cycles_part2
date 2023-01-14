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

    public static void task1(){
        System.out.println("Task1");
        int total=0;
        int to_savings = 15_000;
        int demand_savings = 2_459_000;
        int month=0;

        while (total < demand_savings){
            total=total+to_savings;
            month++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей %n", month, total);
        }
    }

    public static void task2(){
        System.out.println("Task2");
        int number=1;
        int max_number=10;
        while(number<=max_number){
            System.out.print(number + " ");
            number++;
        }

        System.out.println();

        for(int i=10;i>0;i--){
            System.out.print(i + " ");
        }
    }

    public static void task3(){
        System.out.println("Task3");
        long popularity = 12_000_000;
        double birthrate = 17.0/1000;
        double mortality = 8.0/1000;
        int max_year = 10;

        double popularity_in_time = popularity;
        int curr_year=0;

        while(curr_year < max_year){
            curr_year++;
            popularity_in_time = popularity_in_time+ birthrate*popularity_in_time -mortality*popularity_in_time;
            System.out.printf("Год %d, численность населения составляет %.2f + %n",curr_year,popularity_in_time);
        }
    }

    public static void task4(){
        System.out.println("Task4");
        double rate=0.07;
        int initial_deposit = 15_000;
        long dem_deposit = 12_000_000;
        double deposit_in_time=initial_deposit;
        int month=0;
        while (deposit_in_time<=dem_deposit){
            deposit_in_time = deposit_in_time + deposit_in_time*rate;
            month++;
            System.out.printf(Locale.US,"Месяц %d, сумма накоплений %,.2f %n",month, deposit_in_time);
        }
    }

    public static void task5(){
        System.out.println("Task5");
        double rate=0.07;
        int initial_deposit = 15_000;
        long dem_deposit = 12_000_000;
        double deposit_in_time=initial_deposit;
        int month=0;
        while (deposit_in_time<=dem_deposit){
            deposit_in_time = deposit_in_time + deposit_in_time*rate;
            month++;
            if (month%6==0) {
                System.out.printf(Locale.US, "Месяц %d, сумма накоплений %,.2f %n", month, deposit_in_time);
            }
        }
    }

    public static void task6(){
        System.out.println("Task6");
        int countYear=9;
        int countMonth=9*12;

        double rate=0.07;
        int initial_deposit = 15_000;
        double deposit_in_time=initial_deposit;
        int month=0;
        while (month <=countMonth){
            deposit_in_time = deposit_in_time + deposit_in_time*rate;
            month++;
            if (month%6==0) {
                System.out.printf(Locale.US, "Месяц %d, сумма накоплений %,.2f %n", month, deposit_in_time);
            }
        }
    }

    public static void task7(){
        System.out.println("Task7");
        int firstFridayInJanuary = 6;
        int countDaysInJanuary = 31;
        int friday = firstFridayInJanuary;
        while (friday<countDaysInJanuary){
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет %n",friday);
            friday+=7;
        }
    }

    public static void task8(){
        System.out.println("Task8");
        int firstYear = 0;
        int countYearsInPeriod = 79;

        int initialYear=2023-200;
        int lastYear=2023+100;
        int year = initialYear;

        while (year<lastYear){
            if (year%countYearsInPeriod == 0){
                System.out.print(year + " ");
            }
            year++;
        }
    }

}