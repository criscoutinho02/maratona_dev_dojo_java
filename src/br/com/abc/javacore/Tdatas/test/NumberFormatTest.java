package br.com.abc.javacore.Tdatas.test;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    public static void main(String[] args) {

        float valor = 123.456789123f;
        Locale locJP = new Locale("jp");
        Locale locFR = new Locale("fr");
        Locale locIT = new Locale("it");
        Locale locBR = new Locale("br");
        NumberFormat[] numberFormats = new NumberFormat[4];

        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(locBR);
        numberFormats[2] = NumberFormat.getCurrencyInstance();
        numberFormats[3] = NumberFormat.getCurrencyInstance(locBR);

        for(NumberFormat nf : numberFormats){
            System.out.println(nf.format(valor));
        }

        NumberFormat nf = NumberFormat.getInstance();
        System.out.println("getMaximumFractionDigits");
        System.out.println(nf.getMaximumFractionDigits());
        nf.setMaximumFractionDigits(1);
        System.out.println(nf.format(valor));


        String valorString = "123,45dfg6789123f";
        try {
            System.out.println(nf.parse(valorString));
            nf.setParseIntegerOnly(true);
            System.out.println(nf.parse(valorString));

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
