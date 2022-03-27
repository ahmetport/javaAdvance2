package C05_Basıc_day2.practice_basic_day02;

import java.util.Scanner;

public class Q19_StringManipulation13 {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime= scan.nextLine();

        if(kelime.length()<=4){
           char c1= kelime.charAt(0);
            char c2= kelime.charAt(1);
            char c3= kelime.charAt(2);
            char c4= kelime.charAt(3);
            System.out.println("tersten:"+ c4+c3+c2+c1);

        }


    }
}
