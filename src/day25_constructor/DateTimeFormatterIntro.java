package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("EEEE,MM/DD/Y");
        LocalDate today=LocalDate.now();
        System.out.println(today.format(df));
LocalDate date1=LocalDate.of(2022,7,1);
        System.out.println(date1.format(df));//JULY-01-22
DateTimeFormatter tf=DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1=LocalTime.of(17,30);
        System.out.println(time1.format(tf));
DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE, MM/dd/y h:mm a");
        LocalDateTime starts=LocalDateTime.now();
        System.out.println(starts.format(dtf));
            LocalDateTime s=LocalDateTime.of(2020,11,24,13,00);
DateTimeFormatter a=DateTimeFormatter.ofPattern("EEEE,h:mm a, MMM/dd/Y");
        System.out.println(s.format(a));
    }
}
