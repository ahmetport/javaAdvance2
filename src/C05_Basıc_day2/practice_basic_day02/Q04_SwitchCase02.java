package C05_Basıc_day2.practice_basic_day02;

import java.util.Scanner;

public class Q04_SwitchCase02 {
        /*
		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */
        public static void main(String[] args) {
                Scanner scan=new Scanner(System.in);
                System.out.println("lütfen harflerden birini seçiniz: \nA \nB \nC");
                char seçenek=scan.next().toUpperCase().charAt(0);
                switch (seçenek){
                        case 'A':
                                System.out.println("java güzel");break;
                        case 'B':
                                System.out.println("java neşeli");break;
                        case 'C':
                                System.out.println("java zor");break;
                        default:
                                System.out.println("hatalı giriş yaptınız");

                }

        }
}
