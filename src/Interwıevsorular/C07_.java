package Interwıevsorular;

public class C07_ {
    public static void main(String[] args) {
        /* TASK :
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Faktöriyeli: 720

        Bir sayı giriniz: 3*2*1
        Faktöriyeli 6
     */
        int input = 5;
        int foktorıyel = 1;//faktöriyel oldugu için 1 alınır
        String faktorıyelaçıkyazım = "";
        for (int i = input; i >= 1; i--) {
            foktorıyel *=i;

            if (i == input) {
                faktorıyelaçıkyazım = faktorıyelaçıkyazım + i;

            } else
                faktorıyelaçıkyazım=faktorıyelaçıkyazım + "*" + i;
        }
        System.out.print(input+"! =" + faktorıyelaçıkyazım + " =" +foktorıyel);

    }

}

