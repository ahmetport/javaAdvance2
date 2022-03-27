package C05_Basıc_day2.practice_basic_day02;

public class Q16_StringManipulation10 {

    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {
        String str1="  java ögrenmek123 çok güzel@";

        str1=str1.trim().replaceAll("\\d" , "").replace("C", "c").replaceAll("\\W", "");
        System.out.println(str1);



    }
}
