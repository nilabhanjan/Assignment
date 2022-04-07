package bnb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateClass {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMMyyyy");


    private DayType getDayOfTheWeek(String date) {
        try {
            LocalDate date1 = LocalDate.parse(date.trim(), dtf);
            if (date1.getDayOfWeek().getValue() < 6) {
                return DayType.WEEKDAY;
            } else {
                return DayType.WEEKEND;
            }
        } catch (Exception e) {
            System.out.println("Invalid Date format");
        }

        return null;
    }

    public TDays getTotalDays(String[] dateArray) {
        int weekend = 0, weekday = 0;
        for (String date : dateArray) {
            DayType day = getDayOfTheWeek(date);
            if (DayType.WEEKEND == day) {
                weekend++;
            } else {
                weekday++;
            }
        }
        return new TDays(weekday, weekend);
    }
}
