package Interwıevsorular;

import java.util.Scanner;

public class replit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int x = scan.nextInt();
        int sayınınküpününyarısı = (x * x * x) / 2;
        System.out.println(sayınınküpününyarısı);


        // Dikdortgenin alanini ve cevresini hesaplayan java kodunu yaziniz.

        // Ipucu:
        //  Dikdortgenin Cevresi : 2*(A+B);
        // Dikdortgenin Alani : A * B ;
        System.out.println("dikdörtgenin kısa kenarını giriniz");
        int a = scan.nextInt();
        System.out.println("dikdörtgenin uzun kenarını giriniz");
        int b = scan.nextInt();
        int dikdörtgençevre = 2 * (a + b);
        System.out.println(dikdörtgençevre);
        int dikdörgenalan = a * b;
        System.out.println(dikdörgenalan);


        // Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)

        int sayı1 = 3;
        int sayı2 = 5;
        // Ornek Cikti:
        // sayı1=5
        // sayı2=3
        System.out.println("değişmeden önceki hali: sayı1 " + sayı1 + "sayı2" + sayı2);
        sayı1 = sayı1 + sayı2;
        sayı2 = sayı1 - sayı2;
        sayı1 = sayı1 - sayı2;
        System.out.println("değiştiktensonraki  hali: sayı1 " + sayı1 + "sayı2" + sayı2);


        // Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
        // 1 şeker = 1.7 gr
        // Örnek Çıktı:
        // Yılda 12.41 kg şeker kullanıyor.

        System.out.println("günde kaç bardak çay içiyorsunuz");
        double bardak = scan.nextDouble();
        System.out.println("bir bardaga ne kadar şeker atıyorsunuz");
        double şekergr = scan.nextDouble();
        double yıldakullandıgışekergr = (bardak * şekergr);
        double toplamşekerkg = yıldakullandıgışekergr * 365;
        System.out.println(toplamşekerkg);


        // Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
        float sayı3 = 27.27f;
        short sayı4 = (short) sayı3;
        System.out.println(sayı4);

        // Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
        double rakam1 = 25.6;
        int rakam2 = (int) rakam1;
        System.out.println(rakam2);

        // Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
        System.out.println("üç basamaklı bir tam sayı giriniz");
        int sayı = scan.nextInt();
        int rakam = 0;
        int rakamlartoplamı = 0;

        rakam = sayı % 10;
        rakamlartoplamı += rakam;
        sayı /= 10;

        rakam = sayı % 10;
        rakamlartoplamı += rakam;
        sayı /= 10;

        rakam = sayı % 10;
        rakamlartoplamı += rakam;
        sayı /= 10;

        System.out.println("girilen sayının rakamlartoplamı : " + rakamlartoplamı);


        // Girilen zamanı saniyeye çeviren bir program yazınız.
        System.out.println("lütfen bir saniye giriniz");//4250saniye
        int saniye = scan.nextInt();
        int dakika = saniye / 60;
        int saat = dakika / 60;

        dakika = dakika % 60;
        saniye = saniye % 60;


        System.out.printf("%02d:%02d:%02d", saat, dakika, saniye);//01:10:50
        System.out.println("de");


        // Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
//  INPUT:
// Dakika sayısı: 3456789
// OUTPUT :
// 3456789 dakika yaklaşık 6 yıl 210 gündür
        System.out.println("dakika giriniz");
        int dakika1=3456789;
        int saat1=dakika1/60; //saat

        int gün =saat1/24;
        int kgün= gün%365;
        int yıl= gün/ 365;


        System.out.println(yıl +"\n" +kgün);














    }
}



