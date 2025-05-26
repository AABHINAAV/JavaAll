package b_java_se_8.h_date_time_api;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class a {

  public static void main(String[] args) {
    LocalDate todayDate = LocalDate.now();
    System.out.println("todayDate : " + todayDate);

    LocalDate specificDate = LocalDate.of(1998, 06, 03);
    System.out.println("specificDate : " + specificDate);

    //
    //
    //

    LocalTime currentTime = LocalTime.now();
    System.out.println("currentTime : " + currentTime);

    LocalTime specificTime = LocalTime.of(10, 30); // 24hrs time
    System.out.println("specificTime : " + specificTime);

    //
    //
    //

    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("currentDateTime : " + currentDateTime);

    LocalDateTime specificDateTime = LocalDateTime.of(2025, 1, 4, 10, 15, 30);
    System.out.println("specificDateTime : " + specificDateTime);

    //
    //
    //

    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println("zoneDateTime : " + zonedDateTime);

    ZonedDateTime zonedDateTimeInNYC = ZonedDateTime.now(
      ZoneId.of("America/New_York")
    );
    System.out.println("zoneDateTime NYC : " + zonedDateTimeInNYC);

    //
    //
    //

    Instant timestamp = Instant.now(); // Current timestamp
    System.out.println("timestamp : " + timestamp);

    //
    //
    //

    Duration duration = Duration.ofDays(5); // Duration of 5 days
    System.out.println("duration : " + duration);

    //
    //
    //

    LocalDate startDate = LocalDate.of(2020, 1, 1);
    LocalDate endDate = LocalDate.of(2025, 3, 6);
    Period period = Period.between(startDate, endDate);
    System.out.println(
      "duration between " + startDate + " and " + endDate + " : " + period
    );

    //
    //
    //
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate today = LocalDate.now();
    String formattedDate = today.format(formatter);
    System.out.println("formatted today date : " + formattedDate);

    LocalDate parsedDate = LocalDate.parse("04/01/2025", formatter); // Parsing string to date
    System.out.println("parsing string to date : " + parsedDate);
  }
}
