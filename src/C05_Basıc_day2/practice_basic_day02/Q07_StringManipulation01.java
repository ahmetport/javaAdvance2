package C05_Basıc_day2.practice_basic_day02;

import java.util.Scanner;

public class Q07_StringManipulation01 {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {




        // 2 Strings olusturun -> string1 = "01234" and string2 = "56789"
        // 1.yol: concat() function ile concatenate string1 and string2
        // 2.yol: operator kullanarak concatenate string1 and string2
        // konsolda yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi ve soyisminizi giriniz");
        String isim= scan.nextLine();
        String soyisim= scan.nextLine();
        String tamisim=isim.concat(" "+soyisim).toUpperCase();
        System.out.println("senin full name: "+tamisim);



    }
}
