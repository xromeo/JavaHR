import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneConversion2 {
    public static void main(String[] args) {
        // Timestamp en UTC-0
        long timestampInUtc0 = 1698628055000L;

        // TimeZone de la tienda (por ejemplo, America/La_Paz)
        ZoneId storeTimeZone = ZoneId.of("America/La_Paz");

        // Convertir el timestamp a ZonedDateTime en el TimeZone de la tienda
        ZonedDateTime zonedDateTimeInStore = Instant.ofEpochMilli(timestampInUtc0)
                .atZone(ZoneOffset.UTC) // Convierte a UTC
                .withZoneSameInstant(storeTimeZone); // Convierte al TimeZone de la tienda

        // Formatear la fecha como yyyyMMdd
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String storeDate = dateFormat.format(Date.from(zonedDateTimeInStore.toInstant()));

        // Establecer la hora, minuto, segundo y milisegundo en 0
        ZonedDateTime startOfDay = zonedDateTimeInStore
                .withHour(0)
                .withMinute(0)
                .withSecond(0)
                .withNano(0);

        // Convertir a Date
        Date startOfDayDate = Date.from(startOfDay.toInstant());

        // Guardar storeDate y startOfDayDate en MongoDB
        // ...

        System.out.println("Store Date (yyyyMMdd): " + storeDate);
        System.out.println("Start of Day (TimeZone de la tienda): " + startOfDayDate);
    }
}
