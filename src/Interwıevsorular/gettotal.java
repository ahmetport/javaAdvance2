package Interwıevsorular;

import java.util.Scanner;

public class gettotal {


    public class getTotal {


      /*

        Given three positive Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;

        NOTE : if the output less then 0 change output to -1

     */


        /*
        3 tane pozitif String verildiğinde
        sayısal olmayan tüm karakterleri kaldırın.
        Stringleri int e çevirin
        ve total print edin

            Ornek:
           String num1 = "$15";
           String num2 = "$20";
           String num3 = "$30";
           output ----> 65; olmali

           NOT : Eğer output 0 dan küçük ise outputu -1 e cevir
*/
        public void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String num1 = "$15";
            String num2 = "$20";
            String num3 = "$50";//- girdiginizde sonuç -1 oluyor

            int i1 = Integer.parseInt(num1.replaceAll("[$A-Za-z]", ""));
            int i2 = Integer.parseInt(num2.replaceAll("[$A-Za-z]", ""));
            int i3 = Integer.parseInt(num3.replaceAll("[$A-Za-z]", ""));
            int toplam = (i1 + i2 + i3);
            if (toplam >= 0) {
                System.out.println(toplam);

            } else {
                System.out.println(-1);
            }

        }
    }
}

