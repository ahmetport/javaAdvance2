package Interwıevsorular;

import java.util.Scanner;

public class C01 {



    public class Q03_OddIndexNumber {
        // indexi tek sayi olan karakterleri yazdiran bir code create ediniz
        public  void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //1 yol for ile
            System.out.println("bir metin giriniz");
            String metin = scanner.next();
            for (int i = 0; i <metin.length();  i++) {
                if(i%2==1){
                    System.out.print(metin.charAt(i));
                }

            }
            //2 yol do while
            System.out.println("bir metin giriniz");
            String str = scanner.next();
            int index = 0;
            do{
                if(index%2==1){ //indexi tek sayi olan
                    System.out.print(str.charAt(index) +" "); //tek sayiya sahip olan indexdeki karakterleri yana yana yazdirir
                }
                index++;
            }while(index< str.length()); //index,str nin uzunlugundan kucuk oldugu surece

        }
    }

}
