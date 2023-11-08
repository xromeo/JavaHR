import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeZoneConversion {
    public static Date convertToTimeZone(String eventTime, String timeZoneId) {
        try {
            // Analizar la fecha y hora en UTC-0
            Instant instant = Instant.parse(eventTime);

            // Crear un objeto ZonedDateTime con la zona horaria deseada
            ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of(timeZoneId));

            // Convertir ZonedDateTime a Date
            Date resultDate = Date.from(zonedDateTime.toInstant());

            return resultDate;
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Manejo de errores
        }
    }

    public static Date convertToTimeZone(long timestamp, String timeZoneId) {
        try {
            // Crear un objeto Instant desde el timestamp
            Instant instant = Instant.ofEpochMilli(timestamp);

            // Crear un objeto ZonedDateTime con la zona horaria deseada
            ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of(timeZoneId));

            // Convertir ZonedDateTime a Date
            Date resultDate = Date.from(zonedDateTime.toInstant());

            return resultDate;
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Manejo de errores
        }
    }

    public static void main(String[] args) {
        String eventTime = "2023-10-23T20:23:01.938Z";

        // Convertir a America/La_Paz (UTC-4)
        Date dateInLaPaz = convertToTimeZone(eventTime, "America/La_Paz");
        System.out.println("Fecha en America/La_Paz: " + dateInLaPaz);

        // Convertir a UTC-4
        Date dateInUtcMinus4 = convertToTimeZone(eventTime, "UTC-4");
        System.out.println("Fecha en UTC-4: " + dateInUtcMinus4);

        long timestamp = 1698092581938L; // Timestamp proporcionado

        // Convertir a America/La_Paz (UTC-4)
        Date dateInLaPaza = convertToTimeZone(timestamp, "America/La_Paz");
        System.out.println("Fecha en America/La_Paz: " + dateInLaPaza);

        // Convertir a UTC-4
        Date dateInUtcMinus4a = convertToTimeZone(timestamp, "UTC-4");
        System.out.println("Fecha en UTC-4: " + dateInUtcMinus4a);
    }
}
