package Interwıevsorular;

public class C05<gizlenmişisimsoyisim, gizlenmişKKNo> {
    public static void main(String[] args) {



    String isim = "yasemin yalçın";
    String soyisim = "sarı";
    String kKno = "123456789012";
    String gizlenmişisimsoyisim = isimsoyisimgizle(isim, soyisim);
        System.out.println(gizlenmişisimsoyisim);
    String gizlenmişKKNo = kredikartıgizle(kKno);
        System.out.println(gizlenmişKKNo);

    //BİR METHODDAN İŞLEM YAPMASINI İSTERSENİZ return type void degil bize getirecegi sonucun data turunde olmalıdır


}




    public static String isimsoyisimgizle(String isim, String soyisim) {//string yaptık voıd yerine
        String yeniisim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).replaceAll("\\S", "*");//EGER İKİ İSİMLİ İSE \\S : KULLANILIR
        String yenisoyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\S", "*");
        return yeniisim + " " + yenisoyisim;
    }

    public static String kredikartıgizle(String kKno) {
        String yenikKno = "**** **** **** 1234" + kKno.substring(12);
        return yenikKno;

    }
}


