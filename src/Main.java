public class Main {
    public static void intercalaryYear(int issueCount) {
        System.out.println(issueCount + " год является високосным");
    }

    public static void notIntercalaryYear(int issueCount) {
        System.out.println(issueCount + " год не является високосным");
    }

    public static void main(String[] args) {

        task1();

    }

    public static void task1() {
        System.out.println("_______________________________________Задача №1________________________________________");
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            intercalaryYear(year);
        } else {
            notIntercalaryYear(year);
        }

    }


}

