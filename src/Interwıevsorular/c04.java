package Interwıevsorular;

public class c04 {

        public static void main(String[] args) {

            //aşagıdakı multı dımensionel arraylerın iç arreylerindeki son elemanların çarpımını ekrana yazdıran bir program yazın

            int arr[][]={ {1,2,3}, {4,5}, {6} };
            int çarpım=1;
            for (int i = 0; i <arr.length ; i++) {//dış loop
                çarpım *=arr[i][arr[i].length-1];//iç loop olay burda dönüyor
            }
            System.out.println("son elementlerin çarpımı:"+çarpım);


        }
}
