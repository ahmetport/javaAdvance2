package C06_Day3methodloop.practice_basic_day03;

import java.util.Scanner;

public class Q10_ForLoop05 {
   /*        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	         hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("bir tam sayı giriniz");
       int sayı=scan.nextInt();
       int toplam=0;
       if(sayı<=0) System.out.println("hatalı giriş");
       else{
       for (int i = 1; i<=sayı ; i++) {
           toplam=i*i+toplam;
       }
           System.out.println("1 den sonra girilen sayıların kareleri toplamı:" +toplam);

           }
       }

   }


