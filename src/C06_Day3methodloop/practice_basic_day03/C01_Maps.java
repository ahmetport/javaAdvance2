package C06_Day3methodloop.practice_basic_day03;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        Map<Integer, String> sınıflist = new HashMap<>();
        //bir sınıfta ogrenci no ve isim  soyisim branş olarak yazalım
        //key tek bie unıque degerdir
        //ama value yani deger birden fazla bilginin birleşiminden oluşabilir bu durumda daha sonra istedşgimiz bilgilere
        //ulaşabilmek için value aynı biçimde oluşturulmalıdır veri sıralaması ve şekilsel açıdan
        sınıflist.put(101, "ali,can,dev");
        sınıflist.put(102, "veli,yan,qa");
        sınıflist.put(103, "ali,yan,dev");

        System.out.println(sınıflist);
        System.out.println(sınıflist.keySet());//[101, 102, 103]
        System.out.println(sınıflist.values());//[ali,can,dev, veli,yan,qa, ali,yan,dev]
        System.out.println(sınıflist.size());//3

        //genel bilgi
        //  List<Integer> list=new ArrayList<>();//ben bu hali ile String bi şey ekleyemem ama object yaparsam eklerim
        List<Object> list = new ArrayList<>();
        list.add("ahmet");
        list.add(20);
        list.add("portakal");
        System.out.println(list);//[ahmet, 20, portakal]
        //20 degerini 10 arttıralım
        list.set(1, (Integer) (list.get(1)) + 10);//ekleriz ama çok zor olur sürekli casting yapmamız lazım
        //o yuzden maps lerdede casting çok yapacagız.burda Integer ile casting yaptık


    }
}