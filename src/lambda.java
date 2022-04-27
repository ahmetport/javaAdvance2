import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambda {


        public static void main(String[] args) {

            List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));
            printElStuructured(sayi);
            System.out.println("   ******   ");
            printElFunctional(sayi);
            System.out.println("   ******   ");
            printElFunctional1(sayi);
            System.out.println("   ******   ");
            printçiftelstuructured(sayi);
            System.out.println("   ******   ");
            printçiftelfunctıonal(sayi);
            System.out.println("   ******   ");
            printçiftelfunctıonal1(sayi);
            System.out.println("   ******   ");
            printçift34denküçükelfunctıonal(sayi);
            System.out.println("   ///////////////////   ");
            printçift34denbüyükelfunctıonal(sayi);

        }


        //Task : Structured Programming kullanarak list elemanlarını aralarında bosluk olacak sekilde print ediniz.
        public static void printElStuructured(List<Integer> sayi) {
            for (Integer w : sayi) {
                System.out.print(w + "  ");
            }
        }

        //Task : "functıonal Programming kullanarak list elemanlarını aralarında bosluk olacak sekilde print ediniz.
        public static void printElFunctional(List<Integer> sayi) {
            sayi.stream().forEach(t -> System.out.print(t + " "));     //t lambda operatoru stream akışa sunmak
            sayi.stream().forEach(System.out::print);  //METHOD REFERENCE ->System.out yapısında print methodu refere et
        }

        public static void yazdır(int a) {  //verilen int degeri aynı satırda yazdırma actıon yapan seed(tohum)method create edildi
            System.out.print(a + " ");
        }

        public static void printElFunctional1(List<Integer> sayi) {
            sayi.stream().forEach(lambda::yazdır);
        }

        //Task : Structured Programming  list elemanlarının çift olanlarını aynı satırda aralarında bosluk olacak sekilde print ediniz.
        public static void printçiftelstuructured(List<Integer> sayi) {
            for (Integer w : sayi) {
                if (w % 2 == 0) {
                    System.out.print(w + " ");
                }
            }
        }
        //Task : functıonal Programming  list elemanlarının çift olanlarını aynı satırda aralarında bosluk olacak sekilde print ediniz.

        public static void printçiftelfunctıonal(List<Integer> sayi) {
            sayi.stream().filter(t -> t % 2 == 0).forEach(lambda::yazdır);  //fılter if görevi görüyor
        }

        public static boolean çiftbul(int a) {     //seed(tohum) method kendisine verilen int degerin çift olmasını kontrol eder
            return a % 2 == 0;
        }

        public static void printçiftelfunctıonal1(List<Integer> sayi) {
            sayi.
                    stream().//yazma stiti yazılımcı stili
                    filter(lambda::çiftbul).
                    forEach(lambda::yazdır); //aynı soruda method kullandık
        }

        //Task : functıonal Programming  list elemanlarının 34den küçük çift olanlarını aynı satırda aralarında bosluk olacak sekilde print ediniz.
        public static void printçift34denküçükelfunctıonal(List<Integer> sayi) {
            sayi.
                    stream().
                    filter(t -> t % 2 == 0 && t < 34).
                    forEach(lambda::yazdır);
        }
        //Task : functıonal Programming  list elemanlarının 34den büyük veya çift olanlarını aynı satırda aralarında bosluk olacak sekilde print edini

        public static void printçift34denbüyükelfunctıonal(List<Integer> sayi) {
            sayi.stream().
                    filter(t-> t % 2==0 || t>34).
                    forEach(lambda::yazdır);//34 22 16 35 20 63 65 44 66 64 81 38  34 den küçük çiftsayıları aldı 34 büyük sayıları aldı

        }
    }


