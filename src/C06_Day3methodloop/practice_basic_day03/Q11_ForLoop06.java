package C06_Day3methodloop.practice_basic_day03;

import java.util.Scanner;

public class Q11_ForLoop06 {
    /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ıkı sayı giriniz");
        int sayı1=3;
        int sayı2=5;
        int sayı=scan.nextInt();
        for (int i = 1; i <=sayı1 ; i++) {
            for (int j = 0; j <sayı2 ; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }


    }



}
