package C06_Day3methodloop.practice_basic_day03;

import java.util.Scanner;

public class Q05_MethodCreation05 {
    /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("47 den küçük bir pozıtıf tam sayı giriniz");
        int sayı=scan.nextInt();
        fibonacci(sayı);

    }
    public static void fibonacci(int sayı){
        int sayı1=0;
        int sayı2=1;
        int sayı3 ;
        System.out.println(sayı1+ " -");
        System.out.println(sayı2+ "-" );
        if(sayı<47){
            for (int i = 2; i <sayı; i++) {
                sayı3=sayı1+sayı2;
                System.out.println(sayı3+ "-");
                sayı1=sayı2;
                sayı2=sayı3;


            }
        }else System.out.println("47 den küçük sayı giriniz");

    }



}
