package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        // LocalDate myObj = LocalDate.now();
        // System.out.println(myObj);

        // LocalTime myObj = LocalTime.now();
        // System.out.println(myObj);

        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
