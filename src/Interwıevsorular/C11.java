package Interwıevsorular;

import java.util.Scanner;

public class C11 {


    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("aldıgınız ürünün fiyatını giriniz");
        double fiyat= scan.nextDouble();
        System.out.println("aldıgınız ürünün adedini giriniz");
        int adet= scan.nextInt();
        System.out.println("müşteri kartınız var mı:(varsa :E, yoksa:H)");
        String kart=scan.next().toLowerCase();

        if(kart.equals("e")|| kart.equals("h")){
            if(adet>10 && kart.equals("e")) System.out.println("yüzde 20 indirim kazandınız.ödemeniz gereken tutar:"
                    +(adet*fiyat*0.80));
            else if(adet>10 && kart.equals("h")) System.out.println("yüzde 15 indirim kazandınız.ödemeniz gereken tutar:"
                    +(adet*fiyat*0.85));
            else if(adet<10 && kart.equals("e")) System.out.println("yüzde 15 indirim kazandınız.ödemeniz gereken tutar:"
                    +(adet*fiyat*0.85));
            else System.out.println("yüzde 10 indirim kazandınız.ödemeniz gereken tutar:"+(adet*fiyat*0.90));
        }
        else System.out.println("hatalı giriş");
    }
}

