public class Main {
    public static void main(String[] args) {

        // Задача №1
        System.out.println("Задача №1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2459000) {
            i++;
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }

        // Задача №2
        System.out.println("\nЗадача №2");
        int num = 0;
        while (num < 10) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (num = 10; num >= 1; num--) {
            System.out.print(num + " ");

        }
        // Задача №3
        System.out.println("\nЗадача №3");
        int population = 12000000;
        int fertilityPerYear = 17 * (12000000 / 1000);
        int deathPerYear = 8 * (12000000 / 1000);
        for (int year = 1; year <= 10; year++) {
            population = population + fertilityPerYear - deathPerYear;
            System.out.println("Год " + year +
                    ", численность населения составляет " + population + " человек.");

        }

        // Задача №4
        System.out.println("\nЗадача №4");
        int totalVas = 15000;
        int month = 0;
        while (totalVas <= 12000000) {
            month++;
            totalVas = totalVas + (totalVas * 7 / 100);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalVas);

        }

        // Задача №5
        System.out.println("\nЗадача №5");
        int totalVas1 = 15000;
        int month1 = 0;
        while (totalVas1 <= 12000000) {
            month1++;
            totalVas1 = totalVas1 + (totalVas1 * 7 / 100);
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + ", сумма накоплений равна " + totalVas1);
            }
        }

        // Задача №5
        System.out.println("\nЗадача №5");
        int totalVas2 = 15000;
        int totalMonth = 9 * 12;
        for (int month2 = 1; month2 <= totalMonth; month2++) {
            totalVas2 = totalVas2 + (totalVas2 * 7 / 100);
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + totalVas2);
            }
        }

        // Задача №6
        System.out.println("\nЗадача №6");
        int friday = 2;
        for (int day = 0; day <= 31; day++) {
            if (day == friday){
                System.out.println(day + " декабря. Сегодня пятница, необходимо подготовить отчет.");
                friday = friday +7;
            } else {
                System.out.println(day + " декабря.");
            }
        }

        // Задача №7
        System.out.println("\nЗадача №7");
        int nowYear = 2022;
        for (int cometYear = 0; cometYear <= 2122; cometYear = cometYear + 79) {
            if (cometYear >= (nowYear - 200)) {
                System.out.println(cometYear);
            }

        }

        // Задача №8
        System.out.println("\nЗадача №8");
        for (int num1 = 1; num1 <= 10; num1++) {
            System.out.println("2 * " + num1 + " = " + 2*num1);
        }
    }
}