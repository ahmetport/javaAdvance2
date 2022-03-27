package C06_Day3methodloop.practice_basic_day03;

import java.util.Scanner;

public class Q14_WhileLoop02 {
    public static void main(String[] args) {
         /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
        Scanner scan=new Scanner(System.in);
        String okunan="";

        do {
            System.out.println("harf giriniz: ");
            okunan=scan.next();
            System.out.println("program çalışıyor");

        }while (okunan.equalsIgnoreCase("x"));
        System.out.println("program bitti");


        }
    }




