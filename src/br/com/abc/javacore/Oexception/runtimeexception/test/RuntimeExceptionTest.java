package br.com.abc.javacore.Oexception.runtimeexception.test;

public class RuntimeExceptionTest {

    public static void main(String[] args) {

//        Object o = null ;
//        System.out.println(o.toString());


//        int a = 10;
//        int b = 0;
//        if(b!=0) {
//            int c = a / b;
//            System.out.println(c);
//        }
        try{
            int[] a = new int[2];
            System.out.println(a[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Após bloco catch");



    }


}
