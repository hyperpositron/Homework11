public class Main {
    public static void main(String[] args) {
        int year = 2023;
         printInfoAboutYear(year);

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



