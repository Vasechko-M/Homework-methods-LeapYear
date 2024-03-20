public class Main {
    public static void printLeapYear(int year) {
        if (year>1584 && (year%4 == 0 || year%400 == 0) && year%100 != 0) {
            System.out.println(year + " год является високосным.");
        }else {
            System.out.println(year + " год не является високосным.");
        }
    }
    public static void main(String[] args) {
            printLeapYear(2023);
    }
}