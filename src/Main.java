import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2023;
        System.out.println("Задача №1");//..............................// task1
        printInfoAboutYear(year);
        System.out.println("Задача №2");//..............................// task2
        printInfoAboutVersion(1, 2022);
        System.out.println("Задача №3");//..............................// task3
        int deliveryDistance = 105;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days == -1) {
            System.out.println("Доставка не возможна на расстояние " + deliveryDistance);
        } else {
            System.out.println("Время доставки "+days+" дн.");
        }
    }

    private static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    private static void printInfoAboutVersion(int os, int productionYear) {
        if (os < 0 || os > 1) {
            System.out.println("OC долдна быть ровна 0 или 1 ");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        StringBuilder result = new StringBuilder("Установите ");
        if (productionYear < currentYear) {
            result.append("облегченную версию для ");
        } else {
            result.append(" версию для ");
        }
        if (os == 0) {
            result.append("iOS");
        } else {
            result.append("Android");
        }
        System.out.println(result);
    }

    private static void printInfoAboutYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }
}



