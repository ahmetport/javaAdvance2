package C06_Day3methodloop.practice_basic_day03;

import java.util.Scanner;

public class Q03_MethodCreation03 {
    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("çevrim yapacagınız işlemi giriniz");
        String işlemi = scanner.next();
        System.out.println("çevirim yapacagınız mıktarı gırınız");
        double miktar=scanner.nextInt();
        dönüştür(işlemi,miktar);


    }

    private static void dönüştür(String işlemi, double miktar) {
        switch (işlemi){
            case"cm":
                System.out.println("merak ettiginiz cm" +miktar/100+ "metredir");break;
            case"cm1":
                System.out.println("merak ettiginiz cm" +miktar/100000+ "kilometredir");break;
            case"metre":
            System.out.println("merak ettiginiz metre" +miktar/100+ "kilometredir");break;
            case "km":
                System.out.println("merak ettiginiz km"  +miktar*100000+  " cm dir");break;
            default:
                System.out.println("girdiginiz işlem degerleri hatalı");


        }
    }


}