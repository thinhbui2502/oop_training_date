public class Date {
    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int newDay) {
        this.day = newDay;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int newMonth) {
        this.month = newMonth;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public String toString() {
        return "Date {day: " + day + ", month: " + month + ", year" + year + "}";
    }

    public boolean isLeapYear() {
        if (this.year % 400 == 0) {
            return true;
        }
        if (this.year % 4 == 0 && this.year % 100 != 0) {
            return true;
        }
        return false;
    }
}
