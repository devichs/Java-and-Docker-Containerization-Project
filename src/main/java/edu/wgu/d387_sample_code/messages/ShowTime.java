package edu.wgu.d387_sample_code.messages;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ShowTime {
    public static String  getTimeZone(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime et = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime mt = zonedDateTime.withZoneSameInstant(ZoneId.of("America/Phoenix"));
        ZonedDateTime utc = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));

        String presentationTimeZones = et.format(dateTimeFormatter) + " ET - " + mt.format(dateTimeFormatter) + " MT - " + utc.format(dateTimeFormatter) + " UTC";

        return presentationTimeZones;
    }
}

