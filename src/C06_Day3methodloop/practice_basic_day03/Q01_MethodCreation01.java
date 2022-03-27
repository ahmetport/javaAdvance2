package C06_Day3methodloop.practice_basic_day03;

import java.util.Scanner;

public class Q01_MethodCreation01 {

    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yapacagınız işlemi * + - / olarak seçınız");
        char işlemi = scan.next().charAt(0);
        System.out.println("birinci sayı:");
        double sayı1 = scan.nextDouble();
        System.out.println("ikinci sayı:");
        double sayı2 = scan.nextDouble();
        double sayı3 = scan.nextDouble();
        double sayı4 = scan.nextDouble();

        hesapmakınesi(işlemi, sayı1, sayı2);

    }

    private static void hesapmakınesi(char işlemi, double sayı1, double sayı2) {
        if (işlemi == '+' || işlemi == '-' || işlemi == '*' || işlemi == '/') {

            switch (işlemi) {

                case '+':
                    System.out.println(sayı1 + "+" + sayı2 + "=" + (sayı1 + sayı2));
                    break;
                case '-':
                    System.out.println(sayı1 + "-" + sayı2 + "=" + (sayı1 - sayı2));
                    break;

                case '/':
                    System.out.println(sayı1 + "/" + sayı2 + "=" + (sayı1 / sayı2));
                    break;
                case '*':
                    System.out.println(sayı1 + "*" + sayı2 + "=" + (sayı1 * sayı2));
                    break;
            }


        }else System.out.println("hatalı giriş");

    }

}






