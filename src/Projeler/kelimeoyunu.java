package Projeler;

import java.util.Scanner;

public class kelimeoyunu {


    static Scanner sc = new Scanner(System.in);
    static int oyuncu = 1;
    //static int oyuncu2=2;
    static String kelime;
    static String ekleme;
    static int puan1;
    static int puan2;

    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1.Adım- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2.Adım- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * 2. oyuncu Eger kelimeyi kabul ederse  1.oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve hangi  oyuncunun
     *        kazandigini yazip oyunu bitirin.
     *
     * 3.Adım- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */

    public static void main(String[] args) {
        System.out.println(oyuncu+".oyuncu lütfen kelime giriniz");
        kelime= sc.next();//oyuncunun verdigi kelimeyi "kelime" degişkenine atadım
        //oyuncuyu degiştirmek için bir method yazınız
        oyuncudegiştir();
        onaysor();
    }

    public static void onaysor() {
        System.out.println("girilen kelime:" +kelime);//oyuna başlama kelimesini 2 oyuncuya gösterdik
        System.out.println(oyuncu +".oyuncu girilen kelimeyi kabul ediyormusun? \n1: evet \n0: hayır");

        int kabul=sc.nextInt();
        if(kabul==1){ //girilen kelimeyi kabul ediyor
            if(oyuncu==1) { //işlemi yapan 1 nci oyuncu ise
                puan2 += kelime.length();// puanı ikinci oyuncuya kelıme harf saysı kadar ekledik
            }else puan1 +=kelime.length();//puan birinci oyuncuya gidecek
            oyunadevamedecekmi();
        }else oyunubitir(); //0 girilirse kelimeyi kabul etmiyor demektir
    }
    public static void oyunadevamedecekmi() {
        System.out.println("oyuna devam etmek istiyormusun?"+"\n1: evet \n0: hayır");
        int tercih= sc.nextInt();
        if(tercih==1){ //oyuna devam etmek istiyorsa
            kelimeekle();
        }else{
            System.out.println("oyun bitti");
            System.out.println("1 nci oyuncu puanı :" + puan1);
            System.out.println("2 nci oyuncu puanı :" + puan2);
            if(puan1>puan2){
                System.out.println("1 nci oyuncu kazandı");
            }else if(puan2>puan1){
                System.out.println("2 nci oyuncu kazandı");
            }else System.out.println("oyun barabara bitti");
        }
    }
    public static void kelimeekle() {
        System.out.println("eski kelimeye yeni bir kelime ekleyiniz");
        ekleme= sc.next();
        System.out.println("yeni kelimeyi başamı eklemek istersiniz sona mı" +"\n 1:başa \n 2: sona");
        int tercih= sc.nextInt();
        if(tercih==1){
            kelime=kelime+ekleme;
        }else kelime=kelime+ekleme;
        oyuncudegiştir();
        onaysor();
    }
    private static void oyunubitir() {
        System.out.println("oyunu" + oyuncu + ". oyuncu oyunu kazandı.çünkü diger oyuncu yanlış kelime girdi");
    }
    public static void oyuncudegiştir() {
        if(oyuncu==1)
            oyuncu=2;
        else
            oyuncu=1;
    }

}




