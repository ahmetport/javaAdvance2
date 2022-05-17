package C04_İfnested.javaPractice2022;

import java.util.Scanner;

public class C015Whıleloop {





        public static void main(String[] args) {

            //kullanıcıdan toplamak üzere pozıtıf sayılar isteyin
            //işlemi bitirmek için 0 basmasını söyleyin
            //kullanıcı yanlışlılkla negatıv sayı girerse o sayıyı dikkate almayın
            //ve "negativ sayı giremezsınız" yazdırıp başa donun
            //kullanıcı 0 bastıgında toplam kaç pozıtıf sayı girdigini
            //yanlışlıkla kaç tane negativ sayı girdigini
            //ve girdigi pozitif saayıların toplamının kaçoldugunu yazdırın
            Scanner scan=new Scanner(System.in);
            int sayı=0;//ben atıyorum hiç bir önemi yok
            int toplam=0;//toplamları koyacagım bir conteynıra ihtıyacım var
            int sayacpozıtıf=0;
            int sayacnegatif=0;

            do {
                System.out.println("lütfen pozitif sayı giriniz\n işlemi bitirmek için 0 basınız");
                sayı= scan.nextInt();
                if(sayı<0){
                    System.out.println("negatif sayı giremezsınız");
                    sayacnegatif++;
                }else if(sayı>0){
                    toplam+=sayı;//sayıyı toplama ekledik
                    sayacpozıtıf++;
                }
            }while (sayı!=0);//sayı 0 a eşit olmadıgı müddetçe burası dönüp duracak negatıf ve pozıtıfde üstteki şartalar saglanır

            System.out.println("yanlışlıkla girilen negatif sayı adedi: "+sayacnegatif);
            System.out.println("girilen pozıtıf sayı adedi: "+sayacpozıtıf);
            System.out.println("girilen pozıtıf sayıların toplamı:" +toplam);

        }
    }


