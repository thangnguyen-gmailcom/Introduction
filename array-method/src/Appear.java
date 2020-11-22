import java.util.Scanner;

public class Appear {
    public static void main(String[] args) {
        String s = "Babe come on" ;
        int count = 0;
        char kytu = 'e' ;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == kytu) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua ky tu " +
                kytu + " trong chuoi " + s + " la " + count);
    }
}
