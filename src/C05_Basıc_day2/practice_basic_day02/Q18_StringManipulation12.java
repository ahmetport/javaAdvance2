package C05_Basıc_day2.practice_basic_day02;

import java.util.Scanner;

public class Q18_StringManipulation12 {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir strıng giriniz");
        String str= scan.nextLine();

        int boşluk=str.indexOf(" ");
        if ((boşluk==-1) && (!str.isEmpty())) {
            System.out.println("boşluk yoktur");



        }else
            System.out.println("boşluk vardır");


    }

}