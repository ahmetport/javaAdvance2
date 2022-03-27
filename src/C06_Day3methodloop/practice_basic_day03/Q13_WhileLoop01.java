package C06_Day3methodloop.practice_basic_day03;

import java.util.Scanner;

public class Q13_WhileLoop01 {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayı = scan.nextInt();
        bsamaklartoplamı(sayı);
        System.out.println(bsamaklartoplamı(sayı));

    }

    public static int bsamaklartoplamı(int sayı) {
        int toplam = 0;
        while (sayı != 0) {
            toplam += sayı % 10;
            sayı /= 10;
        }
        return toplam;



}
}


