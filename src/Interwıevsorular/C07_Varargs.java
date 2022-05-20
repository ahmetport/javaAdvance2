package Interwıevsorular;

public class C07_Varargs {
    public static void main(String[] args) {
        //parametre olarak bir ınteger ve istedigimiz kadar string alan en uzun kelimenin harf sayısı ile ınteger
        //parametre degerini çarpıp sonucu yazdıran bir method oluşturun
        int sayı = 5;
        String str1 = "zulal";
        String str2 = "zeynep";
        String str3="ali";
        //bir methodda varargs dışında parametre kullanacakisek diger parametreleri yazıp varargs en sona yazmalıyız
        çarpım(sayı, str1, str2,str3);
    }
    private static void çarpım(int sayı, String... str) { //bir methodda birden fazla method olamaz

        String enuzunStr = "";
        for (String each : str
        ) {
            if (each.length() > enuzunStr.length()) {
                enuzunStr = each;
            }
        }
        System.out.println("istenen deger: " +sayı*enuzunStr.length());
    }
}

