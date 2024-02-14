package java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateQuestions {
    public static void main(String[] args) {
        String date = "08-09-2024";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yy-MM-dd");
        System.out.println(LocalDate.parse(date,format).format(format1));
    }
}
