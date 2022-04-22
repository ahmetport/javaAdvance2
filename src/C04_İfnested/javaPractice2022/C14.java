package C04_İfnested.javaPractice2022;

import java.util.ArrayList;
import java.util.List;

public class C14 {
    public static void main(String[] args) {


                //iki strıng array oluşturunuzve bu arraylerdeki ortak elemanlarıfor each loop kullanarak bulunuz
                //ortak eleman yoksa ortak eleman yok yazdırın
                String arr1[]={"ali","ayşe","fatma"};
                String arr2[]={"can","evren","emsal","fatma","emre"};

                List<String> ortakelemanlar=new ArrayList<>();
                for (String each1:arr1
                ) {
                    for (String each2:arr2
                    ) {
                        if(each1.equals(each2)){
                            ortakelemanlar.add(each1);
                        }
                    }
                }
                if(ortakelemanlar.isEmpty()){
                    System.out.println("ortak eleman yok");
                }else{
                    System.out.println("iki arraydeki ortak elemanlar:" +ortakelemanlar);
                }
            }
        }




