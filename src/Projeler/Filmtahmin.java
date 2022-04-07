package Projeler;

import java.util.*;

public class Filmtahmin {

    public class FilmTahmin {

        List<String> film = new ArrayList<>(Arrays.asList("JOKER","INCEPTION","PIYANIST","GREENMILE","LEON","GODFATHER","JURASSICPARK","TITANIC"));


        public void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

            System.out.println("1-"+(film.size())+" arasinda bir sayi giriniz");//benim film sayım 8 1 ile 8 arasında film seç
            System.out.println("(*filmin harf sayisinin 2 kati kadar tahmin hakkiniz var)"); //

            int index = scan.nextInt(); //listeden index i kullanarak film seçtim integer olacak

            try{
                filmGetir(film, index-1);

            }catch(IndexOutOfBoundsException e) {
                Random r = new Random();
                System.out.println("1-"+(film.size())+" arasinda bir sayi girmediniz!\nRastgele bir film seciliyor...");
                int random =1+ r.nextInt(film.size());
                filmGetir(film, random-1); //film ile index i method yaptık ve gönderdik
            }
        }

        private void filmGetir(List<String> film, int index) { //film git şu inedxli filmi getir

            Scanner scan = new Scanner(System.in);
            System.out.println(film.get(index).length()+" harfli yabanci film\nTahmin etmek icin harf giriniz:");
            //kullnıcının seçtigi filmin harf sayısını verir harf gir diyoruz
            System.out.println(film.get(index).replaceAll("\\w", "-")); //seçilen film harf sayısı kadar----
            StringBuilder isim = new StringBuilder(film.get(index).replaceAll("\\w", "-"));

            char harf =' ';
            int tahmin=0;
            int dogru=0;
            String str="";
            do {
                str="";
                System.out.println("yanlis tahmin sayisi: "+(tahmin-dogru)+"/"+(2*(film.get(index).length())));
                harf=scan.next().toUpperCase().charAt(0);
                str+=harf;

                if (!isim.toString().contains(str)) {
                    tahmin++;
                }else {
                    System.out.println(str+" harfi zaten acilmis!");
                }

                for (int i = 0; i < isim.length(); i++) {

                    if (film.get(index).charAt(i)==harf ) { //tahmin edilen harf list deki filmde var ise if çalışır
                        if (!isim.toString().contains(film.get(index).substring(i, i+1))) { //tahmin edilen harf listdeki filmde var ama
                            //tahminedilecekfilmde yoksa dogru tahmin ettin
                            dogru++;
                        }
                        isim.setCharAt(i, harf); //dogru tahmin edilen harf tahminedilecekfilme indexe göre atandı
                    }
                }

                if (isim.toString().equalsIgnoreCase(film.get(index))) { //
                    System.out.println("~~~TEBRIKLER KAZANDIN~~~");
                    System.out.println("FILMIN ADI: "+isim);
                    break;
                }

                System.out.println(isim);

            } while ((tahmin-dogru)!=2*(film.get(index).length())); //yanlış sayısı verilen hakka ulaşana kadar do body çalışır

            if ((tahmin-dogru)==2*(film.get(index).length())) {
                System.out.println("yanlis tahmin sayisi: "+(tahmin-dogru)+"/"+(2*(film.get(index).length())));
                //kaybettin yanlış tahmin sayın verilen hakka eşit oldu hakkın bitti
                System.out.println("KAYBETTIN\nFILMIN ADI: "+film.get(index));
            }
        }
    }

}
