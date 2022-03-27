package C05_Basıc_day2.practice_basic_day02;

import java.util.Scanner;

public class Q17_StringManipulation11 {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("soyisminizi giriniz");
        String soyisim=scan.nextLine();

        if(isim.length()>soyisim.length()){
            System.out.println("isim daha uzun");
        }else if(isim.length()<soyisim.length()){
            System.out.println("soyisim uzun");

        }else
            System.out.println("ikiside eşit");



    }

}
