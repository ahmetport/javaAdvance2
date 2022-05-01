package Projeler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class soruveçözüm {







        // TreeMap kullanarak bir cümlenin içindeki harflerin frekansını method ile bulunuz.

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("cumle giriniz :");
            String cumle = scan.nextLine().toLowerCase();

            frekansbul(cumle);
            Map<String,Integer> cmap= frekans2(cumle);

        }

        private static Map<String, Integer> frekans2(String cumle) {

            String harfler[]=cumle.split("");
            Map<String,Integer>cmap=new HashMap<>();
            for (String each:harfler
            ) {
                if(!cmap.containsKey(each)){  //daha önceden map içinde bu harf yoksa
                    cmap.put(each,1);  //sayısı bir olsun
                }else cmap.put(each,cmap.get(each)+1);
            }
            return cmap;
        }

        private static void frekansbul(String cumle) {
            TreeMap<Character,Integer> frekans1=new TreeMap<>(); //conteıner oluşturduk boş bi tane
            for (int i = 0; i <cumle.length() ; i++) {
                if(frekans1.containsKey(cumle.charAt(i))){
                    frekans1.replace(cumle.charAt(i),frekans1.get(cumle.charAt(i))+1);
                    //karakterkeri saydırma varsa bir arttır
                }else{
                    frekans1.put(cumle.charAt(i),1);  //bu karakter önceden burda yoksa
                }
            }
            System.out.println(frekans1);

        }
    }


