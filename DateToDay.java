import java.util.Scanner;

class Calender {
    Scanner input = new Scanner(System.in);
    int day, month, year;

    Calender() {
        day = getDayValue();
        month = getMonthValue();
        year = getYearValue();
    }

    int getDayValue() {
        System.out.print("Enter day : ");
        day = input.nextInt();
        if (day < 1 || day > 31) {
            System.out.println("Day Value must be between 1 and 31");
            getDayValue();
        }
        return day;
    }

    int getMonthValue() {
        System.out.print("Enter month : ");
        month = input.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Month Value must be between 1 and 12");
            getMonthValue();
        }
        return month;
    }

    int getYearValue() {
        System.out.print("Enter year : ");
        year = input.nextInt();
        if (year < 0) {
            System.out.println("year Value must be positive number");
            getYearValue();
        }
        return year;
    }

    boolean isLeapYear() {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            }
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}

class DateToDay {
    public static void main(String[] args) {
        System.out.print("\t\tDay Finder\n\n");
        String[] monthsOfYear = new String[] { "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep",
                "Oct", "Nov", "Dec" };
        int[] daysInMonthOfYear = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        final String[] weekdays = new String[] { "Sun", "Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur" };
        Calender cal = new Calender();
        if (cal.isLeapYear()) {
            daysInMonthOfYear[1]++;
            // System.out.println("Warning : This is a leap year");
        }
        final int month = cal.month - 1;
        if (daysInMonthOfYear[month] < cal.day) {
            final String monthName = monthsOfYear[month];
            System.out.println();
            System.out.println("Error : MonthOverflowError");
            System.out.println("Damn! It looks like " + cal.day + " exceeds " + monthName + "'s capacity");
            System.out.println("You should give it another shot.....");
            return;
        }
        int oddDays = 0, yearsLeft = (cal.year - 1) % 400;

        if (yearsLeft >= 300) {
            oddDays = 1;
        } else if (yearsLeft >= 200) {
            oddDays = 3;
        } else if (yearsLeft >= 100) {
            oddDays = 5;
        }
        yearsLeft = yearsLeft % 100;

        oddDays += (yearsLeft / 4) * 2 + (yearsLeft - yearsLeft / 4);

        for (int index = 0; index < month; index++) {
            oddDays += daysInMonthOfYear[index];
        }
        oddDays = (oddDays + cal.day) % 7;
        System.out.println(
                "It's " + weekdays[oddDays] + "day on " + cal.day + " " + monthsOfYear[month] + " " + cal.year);
    }
}