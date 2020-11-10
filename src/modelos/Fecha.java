package modelos;

public class Fecha {
    
    private int day;
    private int month;
    private int year;

    public Fecha() {
    }

    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }
    
    public String getYearString() {
        return String.valueOf(year);
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Fecha{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }
    
}
