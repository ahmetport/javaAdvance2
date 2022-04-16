package C06_Day3methodloop.practice_basic_day03;

import java.util.Scanner;

public class C18 {






    public class Q04_PrintVowelsOfString {
        //Get String from user and print just vowels(aeiou) inside String on the console
        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir string giriniz: ");
            String str = scanner.nextLine().toLowerCase();//küçük harf yaptık
            //1.nci yol:
            int index=0;//whle için start
            while(index < str.length()) {
                char c = str.charAt(index);//str nin her bir indexindeki karakteri char olarak c variablena atadık
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    System.out.print(c);
                }
                index++;
            }
            // 2.nci yol
            System.out.println();
            System.out.println("2.yol ile replace All methodu");
            //2.yol
            String s = str.replaceAll("[^aeiou]", "");
            //[]: icerisindeki butun karakterlere islem yapar
            // ^ : yanindaki karakterlerin disindakileri alir
            System.out.println(s);
        }
    }
}
