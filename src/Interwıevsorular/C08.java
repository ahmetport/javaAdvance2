package Interwıevsorular;

import java.util.Scanner;

public class C08 {



    public static void main(String[] args) {
        //kullanıcıdan toplamak istedigi sayıları alın ve kullanıcı sıfır a basıncaya kadar devam edin
        //kullanıcı sıfıra bastıgında girdigi tüm sayıların toplamını yazdırın
        Scanner scan=new Scanner(System.in);
        int sayı=0;
        int toplam=0;
        /*
        for (int i = 1; i <1000 ; i++) {//sayı afaki girildi
            System.out.println("lütfen bir sayı giriniz");
            sayı=scan.nextInt();

            if(sayı==0){
                break;
            }else{
                toplam+=sayı;
            }
        }

         */
        System.out.println(toplam);

        sayı=1;//0 atarsak direk ölü dogar o yuzden bir atadık çünkü aşagıda sayı!=0 oldugu için
        toplam=0;
        while (sayı!=0){//sayı 0 eşit olmadıgı muddetçe toplayacak
            System.out.println("lütfen bir sayı giriniz");
            sayı=scan.nextInt();
            toplam+=sayı;//sayıyı toplayarak gidecek kullanıcının girdigi
        }
        System.out.println(toplam);
    }
}


