package C05_Basıc_day2.practice_basic_day02;

import java.util.Scanner;

public class Q06_NestedIfandTernary {
    /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayı = 9;
        String sonuc = "";
        if (sayı >= 0 && sayı <= 9) {
            if (sayı == 9)
                System.out.println("sonuc");

            else if (sayı == 8)
                System.out.println("eigth");
            else if (sayı == 7)
                System.out.println("seven");
            else if (sayı == 6)
                System.out.println("sıx");
            else if (sayı == 5) ;
            System.out.println("five");
              if (sayı == 4)
                System.out.println("four");
            else if (sayı == 3) ;
            System.out.println("three");
                if (sayı == 2) {
                System.out.println("two");
                if (sayı == 1) {
                    System.out.println("bir");
                } else {
                    System.out.println("sıfır");
                }
            }
        }
    }
}





