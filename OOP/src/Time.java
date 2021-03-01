class Time {
    private int hour, minute, second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void nextSecond() {
        if (hour == 23 && minute == 59 && second == 59) {
            hour = minute = second = 0;
            return;
        }
        if (minute == 59 && second == 59) {
            hour ++;
            minute = second = 0;
            return;
        }
        if (second == 59) {
            minute ++;
            second = 0;
            return;
        }
        second ++;
    }
    public void previousSecond() {
        if (hour == 0 && minute == 0 && second == 0) {
            hour = 23;
            minute = second = 59;
            return;
        }
        if (minute == 0 && second == 0) {
            hour --;
            minute = second = 59;
            return;
        }
        if (second == 0) {
            minute --;
            second = 59;
            return;
        }
        second --;
    }
    public void display() {
        if (hour < 10) {
            System.out.print("0" + hour + ":");
        }
        else System.out.print(hour + ":");
        if (minute < 10) {
            System.out.print("0" + minute + ":");
        }
        else System.out.print(minute + ":");
        if (second < 10) {
            System.out.println("0" + second);
        }
        else System.out.println(second);
    }
}
