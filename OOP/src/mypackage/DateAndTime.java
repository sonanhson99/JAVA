package mypackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate datenow = LocalDate.now();
        LocalTime timenow = LocalTime.now();
        LocalDateTime dateAndTimeNow = LocalDateTime.now();
        System.out.println(timenow);
        System.out.println(datenow);
        System.out.println(dateAndTimeNow);
        DateTimeFormatter a =  DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String time = dateAndTimeNow.format(a); 
        System.out.println(time);
    }
}
// yyyy-MM-dd	"1988-09-29"	
// dd/MM/yyyy	"29/09/1988"	
// dd-MMM-yyyy	"29-Sep-1988"	
// E, MMM dd yyyy	"Thu, Sep 29 1988"