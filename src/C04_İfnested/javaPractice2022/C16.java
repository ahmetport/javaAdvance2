package C04_İfnested.javaPractice2022;

import java.util.Arrays;

public class C16 {


    public static void main(String[] args) {
        //verilen bir arrayı büyükten küçüge sıralayıp bize döndüren method oluşturun

        int arr[]={3,5,6,1,9,45,25,4,9,0};

        arr=terstensırala(arr);//burdan array ı döndürdük
        System.out.println(Arrays.toString(arr));//artık burda 45 den başlayarak 0 kadar yazdırır
        System.out.println("en büyük element: "+ arr[0]);//artık dödürdüğümüz için 45 yazar
    }

    public static int[] terstensırala(int[] arr) {//burayı ınt çevirdik artık döndürebiliriz void yerine ınt yazdık
        Arrays.sort(arr);                         //burda arr yazdırmadıgımız için yukarı atadık bu method artık bizim oldu
        //method içinde yazdırsaydık burda kalırdı bi daha kullanamazdık
        int tersarr[]=new int[arr.length];
        for (int i=0; i<arr.length; i++){
            tersarr[i]=arr[arr.length-1-i];
        }
        return tersarr;//void yerıne ınt atadıgımız için return yaptık  tersten sırala dedigi için böyle yaptık

    }
}
