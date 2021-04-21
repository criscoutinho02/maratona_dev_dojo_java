package br.com.abc.javacore.Tdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] dateFormats = new DateFormat[6];

        dateFormats[0] = DateFormat.getInstance();
        dateFormats[1] = DateFormat.getDateInstance();
        dateFormats[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dateFormats[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateFormats[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormats[5] = DateFormat.getDateInstance(DateFormat.FULL);

        for(DateFormat df : dateFormats){
            System.out.println(df.format(c.getTime()));
        }
    }

}
