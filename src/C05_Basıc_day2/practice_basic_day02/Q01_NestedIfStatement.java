package C05_Basıc_day2.practice_basic_day02;

import java.util.Scanner;

public class Q01_NestedIfStatement {
    /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yaşınızı giriniz");
        int yaş = scan.nextInt();

        if (yaş >= 18) {
            System.out.println("oy kullanabilirsin");
            if (yaş >= 70) {
                System.out.println("üç kez oy kullanabilir");
            } else if (yaş >= 50) {



                System.out.println("iki kez oy kullanabilir");
            }else {
                System.out.println("bir kez oy kullanabilirsin");
            }
            }else if(yaş>0 && yaş<18) {
                System.out.println("yaş oy kullanmaya uygun degil");

                }else{
        System.out.println  ("hatalı giriş yaptınız");
                }





            }


        }




