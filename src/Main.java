public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        System.out.println("Задание 1");
        int target = 2_459_000;
        int put_money_aside = 15_000;
        int total = 0;
        int months = 0;

        while (total < target) {
            total += put_money_aside;
            months += 1;
        }
        System.out.printf("It will take %d months to accumulate %d amount if you set aside %d rubles each month%n%n", months, target, put_money_aside);
    }

    private static void task2() {
        System.out.println("Задание 2");
        int i = 0;

        while (i < 10) {
            i += 1;
            System.out.printf("%d ", i);
        }

        System.out.println();

        for (; i > 0; i--) {
            System.out.printf("%d ", i);
        }
    }

    private static void task3() {
        System.out.println("Задание 3");
        int currentPopulation = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int year = 0;

        while (year < 10) {
            double growth = (birthRate - deathRate) * currentPopulation / 1000.0;
            currentPopulation += (int) growth;
            year++;
        }
        System.out.printf("Year %d, population is %d people%n%n", year, currentPopulation);
    }

    private static void task4() {
        System.out.println("Задание 4");
        double initialDepositAmount = 15_000;
        int monthPercent = 7;
        int target = 12_000_000;
        int month = 0;

        while (initialDepositAmount < target) {
            double monthAmount = (initialDepositAmount * monthPercent) / 100.0;
            initialDepositAmount += monthAmount;
            month++;
            System.out.printf("For the %d month, the accumulation under %d%% is equal to %.0f%n", month, monthPercent, initialDepositAmount);
        }
        System.out.println();
    }

    private static void task5() {
        System.out.println("Задание 5");
        double initialDepositAmount = 15_000;
        int monthPercent = 7;
        int target = 12_000_000;
        int month = 0;

        while (initialDepositAmount < target) {
            double monthAmount = (initialDepositAmount * monthPercent) / 100.0;
            initialDepositAmount += monthAmount;
            month++;
            if (month % 6 == 0) {
                System.out.printf("For the %d month, the accumulation under %d%% is equal to %.0f rubles%n", month, monthPercent, initialDepositAmount);
            }
        }
        System.out.println();
    }

    private static void task6() {
        System.out.println("Задание 6");
        double initialDepositAmount = 15_000;
        int monthPercent = 7;
        int targetYear = 9;
        int month = 0;

        while (month < targetYear * 12) {
            double monthAmount = (initialDepositAmount * monthPercent) / 100.0;
            initialDepositAmount += monthAmount;
            month++;
            if (month % 6 == 0) {
                System.out.printf("For the %d month, the accumulation under %d%% is equal to %.0f rubles%n", month, monthPercent, initialDepositAmount);
            }
        }
        System.out.printf("Total amount for %d years: %.0f rubles", targetYear, initialDepositAmount);
        System.out.println();
    }

    private static void task7() {
        System.out.println("Задание 7");
        int fridayDayReport = 5;
        int totalMonthDays = 31;
        int startDay = 1;

        while (startDay < totalMonthDays) {
            startDay++;
            if (startDay == fridayDayReport) {
                fridayDayReport += 7;
                System.out.printf("Today is Friday, %d-th number. It is necessary to prepare a report.%n", startDay);
            }
        }
        // or like this way
        int firstFriday = 5;

        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.printf("Today is Friday, %d-th number. It is necessary to prepare a report.%n", day);
        }
        System.out.println();
    }

    private static void task8() {
        System.out.println("Задание 8");
        int cometFliesYear = 79;
        int startYear = 0;
        int lastPeriod = 200;
        int nextPeriod = 100;
        int nowYear = 2023;

        while (startYear < nowYear + nextPeriod) { // while 0 < 2123
            startYear++; // increase year +1
            if (startYear == cometFliesYear) { // check year of flies comet
                cometFliesYear += 79; // increase flies year +79
                if (startYear >= nowYear - lastPeriod) { // sorted data only 200 year before nowadays
                    System.out.println("Comet flies! " + startYear + " year"); // print message about flying comet
                }
            }
        }

        // or like that way with for loop
        int currentYear = 2023; // Текущий год
        int endYear = currentYear + 100; // Конечный год для периода

        for (int year = 0; year <= endYear; year+=79) {
            if (year >= currentYear - 200) {
                System.out.println("Comet flies again with for loop! " + year + " year"); // print message about flying comet
            }
        }
    }
}