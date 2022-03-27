package C05_Basıc_day2.practice_basic_day02;

import java.util.Scanner;

public class Q15_StringManipulation09 {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scanner.nextLine();
        char ortakarakter=kelime.charAt((kelime.length()-1)/2);

        if(kelime.length()%2==1 && kelime.length()>=3){
            System.out.println("kelimenin ortasındaki karakter:" +ortakarakter);

        }




    }
}