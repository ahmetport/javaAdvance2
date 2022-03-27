package C06_Day3methodloop.practice_basic_day03;

import java.util.Scanner;

public class Q09_ForLoop04 {
    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
 değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
 Sesli harfler: a,e,i,o,u

 Test Data:
 a
 Beklenen Çıktı:
 a harfi sesli harfdir.

 Test Data:
 d
 Beklenen Çıktı:
 d harfi sesiz harftir.

 Test Data:
 we  yada  %

 Beklenen Çıktı:
 Yanlis karakter girdiniz!

  */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        String harf=scan.nextLine().toLowerCase();

        if(harf.length()>1)System.out.println("lutfen tek haneli karakter giriniz");
            else if(harf.charAt(0)<='z' || harf.charAt(0)>='a'){
                if(harf.charAt(0)=='a' ||    harf.charAt(0)=='e' || harf.charAt(0)=='ı' || harf.charAt(0)=='i' ||
                        harf.charAt(0)=='o' || harf.charAt(0)=='ö' || harf.charAt(0)=='u' || harf.charAt(0)=='ü'){
                    System.out.println(harf.charAt(0)+ "sesli harftir");
                }else System.out.println("sessiz harftır");
            }else System.out.println("girdiginiz karakter harf degildir");

    }

}
