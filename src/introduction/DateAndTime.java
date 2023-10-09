package introduction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
month = 8
day = 14
year = 2017

The method should return MONDAY as the day on that date

Function Description

Complete the findDay function in the editor below.

findDay has the following parameters:

int: month
int: day
int: year
Returns

string: the day of the week in capital letters
Input Format

A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY   format.
 * 
 */
public class DateAndTime {

    public static String findDay2(int month, int day, int year) {

        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.name();
    }

    public static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        DateFormat df = new SimpleDateFormat("EEEE");
        return df.format(calendar.getTime()).toUpperCase();

    }

    public static void main(String[] args) {
        System.out.println(findDay(8, 14, 2017));
        System.out.println(findDay2(8, 14, 2017));
    }
}
