package Projeler;

public class arrays {


    public static void main(String[] args) {
        //verilen bir cümlede ıstenılen bır harfin kac defa kullanıldıgını yazdıran method oluşturun
        String cümle = "nerede o hello world yazdıramayan ogrencıler";
        String harf = "e";

        harfkaçkerekullanılmış(cümle, harf);
    }

    private static void harfkaçkerekullanılmış(String cümle, String harf) {
        int sayac = 0;
        String karakterler[] = cümle.split("");
        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(harf)) {
                sayac++;
            }
        }
        System.out.println("aradıgınız"   + harf +   "cumlede"  +sayac+  " adet kullanılmış");
    }
}




