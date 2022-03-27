package C05_Basıc_day2.practice_basic_day02;

import java.util.Scanner;

public class Q08_StringManipulation02 {

		 //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("string 1:");
        String str1=scan.nextLine();
        System.out.println("string 2:");
        String str2=scan.nextLine();
        System.out.println("stringlerin birinci method ile yazımı:" +str1+" "+str2);
        System.out.println("stringlerin ikinci method ile yazımı:" +str1.concat(" "+str2));

        String ilkharfsiz=str1.substring(1);
        String ilkharfsiz1=str2.substring(1);
        System.out.println("stringlerin ilk harfsiztoplamı:" +ilkharfsiz.concat(" "+ilkharfsiz1));





    }
}
