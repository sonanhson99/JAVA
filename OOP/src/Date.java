class Date {
    private int day, month, year;
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void display() {
        if (day < 10) {
            System.out.printf("0%d/", day);
        }
        else System.out.printf("%d/", day);
        if (month < 10) {
            System.out.printf("0%d/", month);
        }
        else System.out.printf("%d/", month);
        System.out.println(year);
    }
}
