package C06_Day3methodloop.practice_basic_day03;

import java.util.Scanner;

public class Q16_DoWhileLoop02 {
    /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String kelime="";

        do {
            System.out.println("bir strıng giriniz");
            kelime=scan.nextLine();
            if(kelime.length()<3){
                System.out.println("girdiginiz kelime 3 karakterden az");
            }
            if(kelime.length()%2==1 && kelime.length()>=3) {
                System.out.println("girdiginiz kelımenın orta karakteri:" + kelime.charAt(kelime.length() / 2));
            }
            else {
                System.out.println("girdiginiz karakter tek hanelidir");
            }
        }while(!(kelime.length()%2==1 && kelime.length()>=3));



        }
    }



