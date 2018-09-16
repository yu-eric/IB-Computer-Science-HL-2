package chapter2;

import java.time.LocalDate;

public class DatePrinter {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate piDay = LocalDate.of(now.getYear(), 3, 14);

        //This long list of string methods is to format the date properly, as it is originally returned in all caps
        System.out.println("This year, Pi Day is on "+ piDay.getDayOfWeek().toString().charAt(0) + piDay.getDayOfWeek().toString()
                .substring(1, piDay.getDayOfWeek().toString().length()).toLowerCase() + ".");

        LocalDate programmersDay = LocalDate.ofYearDay(now.getYear(), 256);
        System.out.println("This year, Programmer's day is on " + programmersDay + ", which is a " +
                programmersDay.getDayOfWeek().toString().charAt(0) + programmersDay.getDayOfWeek().toString()
                .substring(1, programmersDay.getDayOfWeek().toString().length()).toLowerCase() + ".");

        LocalDate tenThousandDaysAgo = now.minusDays(10000);

        System.out.println("10,000 days ago from today, it was " + tenThousandDaysAgo + ", which was a " +
                tenThousandDaysAgo.getDayOfWeek().toString().charAt(0) + tenThousandDaysAgo.getDayOfWeek().toString()
                .substring(1, tenThousandDaysAgo.getDayOfWeek().toString().length()).toLowerCase() + ".");
    }
}
