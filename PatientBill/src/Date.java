public class Date {
    // Variables
    private int month;
    private int day;
    private int year;

    // Default Constructor
    Date(){
        month = 0;
        day = 0;
        year = 0;
    }

    // Constructor
    Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Accessors
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setYear(int year){
        this.year = year;
    }

    // Getters
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // Print the date
    public String printDate(){
        return (month + "-" + day + "-" + year);
    }
}
