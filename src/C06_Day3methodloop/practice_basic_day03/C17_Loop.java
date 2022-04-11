package C06_Day3methodloop.practice_basic_day03;

import java.util.Scanner;

public class C17_Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String cümle1 = scan.nextLine();
        System.out.println("bir kelime giriniz");
        String kelime = scan.nextLine();
        int index = cümle1.indexOf(kelime);

        if (index < 0) {//-1 ile yapalım
            System.out.println("girdiginiz kelime cümlede hiç kullanılmamıştır");
        } else if (cümle1.indexOf(kelime, index + 1) < 0) {
            System.out.println("girdiginiz kelime cümlede bir kere kullanılmıştır");
        } else {
            System.out.println("girdiginiz kelime birden fazla kullanılmıştır");
            //bu soruyu bi de lastındex yapalım

        }
    }

    }
