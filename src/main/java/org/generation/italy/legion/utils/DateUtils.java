package org.generation.italy.legion.utils;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateUtils {
    private static DateTimeFormatter italianFormatter=DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
    private DateUtils(){}
    public static DateTimeFormatter getDateFormatter(){
        return italianFormatter;
    }
    public static String format(LocalDate ld){
        return ld.format(italianFormatter);
    }
}
