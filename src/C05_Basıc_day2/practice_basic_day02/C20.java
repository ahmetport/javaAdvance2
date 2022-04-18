package C05_Basıc_day2.practice_basic_day02;

import java.util.Scanner;

public class C20 {




    public class Q03_CountFactors {
        /*
          Type java code by using while loop,
         Write a program to count the factors of an integer which is entered by user.
         Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
         Factors of 8  = 1, 2, 4, 8 ==> 4
    */
        public void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("carpanlarini bulmak istediginiz sayiyi giriniz :");
            int sayı=Math.abs(scan.nextInt());//kullanıcıdan aldıgımız sayının mutlak degerinş aldık

            int i=1;//en küçük çarpan
            int sayaç=0;
            while(i<=sayı){
                if(sayı %i==0){
                    sayaç++;
                    System.out.print(i+" ");
                }
                i++;//çarpan sayısını arttırmak gerek yoksa hep 1 olarak döngü de kalır
            }
            System.out.println("sayının pozitif çarpanlarının sayısı :" + sayaç);
            System.out.println("sayının negatif çarpanlarının sayısı :" + sayaç);
            System.out.println("sayının tüm çarpanlarının sayısı :" + sayaç);


        }
    }
}
