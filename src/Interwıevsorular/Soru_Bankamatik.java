package Interwıevsorular;

import java.util.Scanner;

public class Soru_Bankamatik {
    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */
    public static void main(String[] args) {
        System.out.println("**** atm ye hoşgeldiniz****");
        Scanner scan = new Scanner(System.in);
        System.out.println("bakiye sorgulama:1\n para çekme:2\n para yatırma:3\n çıkış:4\n");
        int işlem = scan.nextInt();
        int bakıye = 1000;

        switch (işlem) {
            case 1:
                System.out.println("mevcut bakıyeniz: " + bakıye);
                break;
            case 2:
                System.out.println("çekeceginiz mıktarıgiriniz");
                int çekılenmıktar = scan.nextInt();
                if (çekılenmıktar > bakıye) {
                    System.out.println("yuru gıt lan işine");

                } else {
                    bakıye -= çekılenmıktar;
                    System.out.println("bakıyenızın guncel halı:" + bakıye);
                }
                break;


            case 3:
                System.out.println("yatıracagınız mıktarı girin");
                int yatırılanmıktar = scan.nextInt();
                bakıye += yatırılanmıktar;
                System.out.println("bakıyenızın guncel halı:" + bakıye);
                break;
            case 4:
                System.out.println("yine bekleriz");
                break;


        }
    }

        }




