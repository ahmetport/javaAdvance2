package Projeler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lambda01 {
    public static void main(String[] args) {
            List<String> yemek = new ArrayList<>(Arrays.asList("küşleme", "adana", "Wrileçe", "havuçdilim", "büryan", "yaglama",
                    "kokoreç", "arabaşı", "güvex"));
            System.out.print("\n ****** ");
            alfabtkbykharf(yemek);
            System.out.print("\n ****");
            terssırala(yemek);
            System.out.print("\n ****");
            karakterbykkçk(yemek);
            System.out.print("\n ****");
            sonharfterssırala(yemek);
            System.out.print("\n ****");
            çiftsaykrktkareleritekrsz(yemek);
            System.out.print("\n ****");
            krkter7denazolma(yemek);
            System.out.print("\n ****");
            wbaşlayanlar(yemek);
            System.out.print("\n ****");
            xbitenler(yemek);
            System.out.print("\n ****");
            krktsayısıenbykeleman(yemek);
            System.out.print("\n ****");
            sonharfegöreılkelemanhrc( yemek);


        }

        //list elemanlarını alfabetik büyükharf ve tekrarsız print ediniz
        public static void alfabtkbykharf(List<String> yemek) {
            yemek.
                    stream().map(t -> t.toUpperCase()).//büyükharf update edildi
                    sorted().distinct().//tekrarsız hale geldi,sıralama yapıldı
                    forEach(t -> System.out.print(t + " "));
        }

        //karakter sayısını ters sıralayınız
        public static void terssırala(List<String> yemek) {
            yemek.stream().map(t -> t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(t-> System.out.println(t+" "));
        }

        //list elemanlarını karakter sayısına göre küçükten büyüge sıralayıp print ediniz
        public static void karakterbykkçk(List<String> yemek) {
            yemek.stream().sorted(Comparator.comparing(String::length)).forEach(t -> System.out.print(t + " "));
        }

        //list elemanlarını son harfine göre ters sıralı print ediniz
        public static void sonharfterssırala(List<String> yemek) {
            yemek.
                    stream().
                    sorted(Comparator.comparing(t -> t.toString().//son harfe göre karşılaştır,to string yaparak null ı hiçlige çeviriyoruz
                            //ve stringe çeviriyoruz stringe çevirirsek char at gelir bu özel bi trick
                                    charAt(t.toString().length() - 1)).//son harfe göre karşılaşitırır
                            reversed()).forEach(t -> System.out.print(t + " "));//ters çevirip yazdırır
        }

        // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz
        public static void çiftsaykrktkareleritekrsz(List<String> yemek) {
            yemek.stream().
                    filter(t -> t.length() % 2 == 0).//çiftleri filtrele
                    map(t -> t.length() * t.length()).//karesini al
                    sorted(Comparator.comparing(t -> t.toString())).//karşılaştır ve sırala to string methoduna göre
                    distinct().//tekrarasız
                    forEach(t-> System.out.println(t+" "));
        }

        // Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
        public static void krkter7denazolma(List<String> yemek) {
            yemek.
                    stream().
                    filter(t -> t.length() <= 7).
                    forEach(t -> System.out.print(t + " "));
        }

        //Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
        public static void wbaşlayanlar(List<String> yemek) {
            yemek.
                    stream().
                    map(t -> t.toUpperCase()).
                    filter(t -> t.startsWith("W")).
                    forEach(t -> System.out.print(t + " "));
        }
        // Task : List elelmanlarinin "x" ile biten en az bir elemaı kontrol ediniz.

        public static void xbitenler(List<String> yemek) {
            yemek.
                    stream().
                    filter(t -> t.endsWith("x")).
                    forEach(t -> System.out.print(t + " "));
        }
        // Task : Karakter sayisi en buyuk elemani yazdiriniz.
        public static void krktsayısıenbykeleman(List<String> yemek){
            yemek.
                    stream().
                    sorted(Comparator.comparing(String::length)).
                    skip(yemek.size()-1).
                    forEach(t -> System.out.print(t + " "));
        }
        // Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
        public static void sonharfegöreılkelemanhrc(List<String> yemek){
            yemek.
                    stream().
                    sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                    skip(1).
                    forEach(t -> System.out.print(t + " "));
        }

    }


