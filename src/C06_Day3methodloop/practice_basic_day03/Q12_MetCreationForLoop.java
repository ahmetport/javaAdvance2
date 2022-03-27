package C06_Day3methodloop.practice_basic_day03;

import java.util.Scanner;

public class Q12_MetCreationForLoop {

		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */
        public static void main(String[] args) {

          Scanner scan=new Scanner(System.in);
                System.out.println("bir strıng giriniz");
                String str=scan.nextLine();
                tersstrıng(str);
                System.out.println("girilen strıng ifadenin tersi:" +tersstrıng(str));
        }

        private static String tersstrıng(String str) {
                String ters="";
                for (int i = str.length() - 1; i >= 0; i--) {//son karakterden başlayıp geriye giderek butun karakterleri yazdırı
                  ters+=str.charAt(i);
                }
                return ters;//string ifadenin tersini döderir
        }


}


