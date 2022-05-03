package Interwıevsorular;

import java.util.Arrays;
import java.util.Scanner;

public class C03 {


    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        Scanner scan = new Scanner(System.in);
        int Input[] = {1, 2, 9, 4, 5, 6, 7, 8};
        System.out.println("kaç max deger istiyorsunuz");
        int n = scan.nextInt();
        Arrays.sort(Input);
        System.out.println("arrayın:" + n + "max rakamları:");
        for (int i = Input.length - 1; i > (Input.length - 1 - n); i--) {   //sort yaptıktan sonra en büyük "n" elemanını alıyoruz
            System.out.println(Input[i] + " ");

        }
    }
}
