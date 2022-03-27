package C05_Basıc_day2.practice_basic_day02;

import java.util.Scanner;

public class Q03_SwitchCase01 {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gün giriniz");
        System.out.println("pazartesi 1\n salı 2\n çarşamba 3\n perşembe 4\n cuma 5\n cumartesi 6\n pazar7 \n");
        int sayı= scan.nextInt();

        switch (sayı){
            case 1:
            case 2:
                System.out.println("java ders günleri");break;
            case 4:
            case 5:
                System.out.println("selenyum ders günleri");break;
            case 3:
            case 6:
                System.out.println("SQL ders günleri");break;
            default:
                System.out.println("izin günü");break;

        }













    }
}
