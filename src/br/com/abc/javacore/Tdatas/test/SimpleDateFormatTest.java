package br.com.abc.javacore.Tdatas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "'Atlanta , ' dd 'de' MMMMM 'de' yyyy 'às' HH:mm:ss z";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));

    }
}
