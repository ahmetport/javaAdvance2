package Interwıevsorular;

import java.util.Scanner;

public class C10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vize = 0;
        int finalnotu = 0;

        while (true) {
            try {
                System.out.println("vize notunuzu giriniz");
                vize = scanner.nextInt();
                if (vize < 0 || vize > 100) {
                    throw new ArithmeticException();
                } else break;
            } catch (ArithmeticException e) {
                System.out.println("notunuz 0 ile 100 arasında olamlıdır");
            }
        }
        while (true) {
            try {
                System.out.println("final notunuzu giriniz");
                finalnotu = scanner.nextInt();
                if (finalnotu < 0 || finalnotu > 100) {
                    throw new ArithmeticException();
                } else break;
            } catch (ArithmeticException e) {
                System.out.println("notunuz 0 ile 100 arasında olamlıdır");

            }
        }
        ortalamabul( vize, finalnotu);
    }

    private static void ortalamabul(int vize, int finalnotu) {
        double ortalama=(vize*0.40+finalnotu*0.60);
        System.out.println("ortalama notunuz :" + ortalama);
        if(ortalama>=60){
            System.out.println("başarılı");
        }else System.out.println("başarısız");
    }
}


