package com.example.java8.growing.jdk8;

import java.time.*;

public class DateTimeApi {
    public static void main(String[] args) {
        // Get the system clock as UTC offset
        final Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.getZone());
        System.out.println(clock.millis());

        // Get local date/time
        final LocalDate date          = LocalDate.now();
        final LocalDate dateFromClock = LocalDate.now(clock);
        System.out.println(date);
        System.out.println(dateFromClock);

        // Get local date/time
        final LocalTime time          = LocalTime.now();
        final LocalTime timeFromClock = LocalTime.now(clock);
        System.out.println(time);
        System.out.println(timeFromClock);

        //
        final ZonedDateTime zonedDateTime          = ZonedDateTime.now();
        final ZonedDateTime zonedDateTimeFromClock = ZonedDateTime.now(clock);
        final ZonedDateTime zoneDatetimeFromZone   = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTimeFromClock);
        System.out.println(zoneDatetimeFromZone);

        final LocalDateTime from     = LocalDateTime.of(2020, Month.NOVEMBER, 15, 5, 4);
        final LocalDateTime to       = LocalDateTime.of(2021, Month.AUGUST, 15, 5, 6);
        final Duration      duration = Duration.between(from, to);
        System.out.println("days: "+duration.toDays());
        System.out.println("days: "+duration.toHours());


    }
}
