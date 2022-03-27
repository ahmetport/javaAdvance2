package C05_Basıc_day2.practice_basic_day02;

import java.util.Scanner;

public class
Q05_SwitchCase03 {

    // Girilen üç haneli bir sayının onlar basamağının değerini yazı ile yazdırınız.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("üç haneli bir sayı giriniz");
        int sayı=scan.nextInt();
        int onlarbasamagı=(sayı/10)%10;
        switch(onlarbasamagı){
            case 0:
                System.out.println("sıfır");break;
            case 1:
                System.out.println("bir");break;
            case 2:
                System.out.println("iki");break;
            case 3:
                System.out.println("üç");break;
            case 4:
                System.out.println("dört");break;
            case 5:
                System.out.println("beş");break;
            case 6:
                System.out.println("altı");break;
            case 7:
                System.out.println("yedi");break;
            case 8:
                System.out.println("sekiz");break;
            case 9:
                System.out.println("dokuz");break;

            default:
                System.out.println("hatalı sayı");break;



















        }

    }
}
