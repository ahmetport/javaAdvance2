package Interwıevsorular;

import java.util.Scanner;

public class ınterwıevsoru {


    public class Q05_ExponentialNumber {
        //Get 2 numbers from the user.
        //first number base
        //second number Top
        //Write a code that calculates the prime of a number.
        // 2, 3 --> 2^3 = 2*2*2= 8

        // 4, 3 --> 4^3= 4*4*4 = 64
        public  void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("lütfen iki tane sayı giriniz biri taban biri üs olsun");
            int taban = scan.nextInt();
            int üs = scan.nextInt();
            int sonuç = 1;
            while (üs != 0) {
                sonuç *= taban;
                üs--;
            }
            System.out.println(sonuç);


            //2 yol ile çözüm
            System.out.println("sayı1 giriniz");
            int sayı1 = scan.nextInt();
            scan.nextLine();
            System.out.println("sayı2 giriniz");
            int sayı2 = scan.nextInt();
            System.out.println(Math.pow(sayı1, sayı2));

            //3 yol ile çözüm


            for (int i = 0; i < üs; i++) {
                sonuç *= taban;
            }
            System.out.println("for ile sonuç :" + sonuç);
        }

    }
}

