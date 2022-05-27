package Interwıevsorular;

import java.util.Arrays;

public class Hellosorusu {
    public static void main(String[] args) {

        String str = "Hellooo";
        String arr[] = str.split("");
        // System.out.println(Arrays.toString(arr));//[H, e, l, l, o, o, o]

        int sayaç=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i-1].equals(arr[i])){
                sayaç++;
            }else{
                System.out.print(arr[i-1]  +  "sayısı" +  (sayaç+1));
                sayaç=0;
            }
            if(i==arr.length-1){
                System.out.print(arr[i]  +  "sayısı" +  (sayaç+1));
            }


        }

    }
}
