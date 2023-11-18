public class LeapYearChecker {
    public static void main(String[] args) {
        int year = 2024; // Replace with the year you want to check

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        // Leap year condition: divisible by 4 but not by 100, except if it's divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
