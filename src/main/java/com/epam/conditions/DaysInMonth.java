package com.epam.conditions;

import java.time.YearMonth;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (month < 1 || month > 12 || year <= 0) {
            System.out.println("invalid date");
            return;
        }
        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();
        System.out.println(daysInMonth);
    }

}
