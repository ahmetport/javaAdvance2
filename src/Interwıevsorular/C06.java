package Interwıevsorular;

import java.util.Scanner;

public class C06 {


    /*Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:
  yanıt a ise,
"Talebiniz işleniyor" mesajı yazdırılır
yanıt b ise,
"yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır yanıt c ise,
"Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır
 başka herhangi bir yanıt değeri için,
"Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
   }
   }
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf = scanner.next().toLowerCase().charAt(0);


        switch (harf){
            case 'a':
                System.out.println("talebiniz işleniyor");
                break;
            case 'b':
                System.out.println("yinede ilgilendiginiz için teşekkür ederiz");
                break;
            case 'c':
                System.out.println("üzgünüz şu anda herhangi bir yardım yok");
                break;
            default:
                System.out.println("geçersiz giriş");
                break;



        }
    }


}
