package br.com.abc.javacore.Sstrings.test;

public class StringBuilderTest {

    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuilder sb = new StringBuilder(16);
        sb.append("Uma ");
        sb.append("frase ");
        sb.append("comum.");

        s= sb.toString();
        System.out.println(sb.delete(0,2));
        System.out.println(sb);
        System.out.println(sb.insert(1 , "##"));

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.append("defender"));
        System.out.println(sb2.insert(2,"#"));
        System.out.println(sb2.reverse());
        System.out.println(sb2.delete(2,4));

    }
}
