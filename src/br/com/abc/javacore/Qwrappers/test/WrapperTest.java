package br.com.abc.javacore.Qwrappers.test;

public class WrapperTest {

    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 1;
        float floatPrimitivo = 1.0f;
        double doublePrimitivo = 1.0d;
        long longPrimitivo =  1;
        char charPrimitivo = 'c';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer intWrapper = 1;
        Float floatWrapper  = 1.0f;
        Double doubleWrapper = 1.0d;
        Long longWrapper = 1L ;
        Character charWrapper = 'c';
        Boolean booleanWrapper = true;

        String valor ="10";
        Float f = Float.parseFloat(valor);
        System.out.println(f);

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toLowerCase('A'));

    }
}
