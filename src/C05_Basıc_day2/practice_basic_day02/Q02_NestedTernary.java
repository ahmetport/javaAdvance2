package C05_Basıc_day2.practice_basic_day02;

import java.util.Scanner;

public class Q02_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char finalnotu='H';

        String sonuc=(finalnotu=='A') ? "gayet başarılı" :(finalnotu=='B') ? "başarılı" : (finalnotu=='C') ? " ha gayret":
                "digerleri";
        System.out.println(sonuc);

    }
}
