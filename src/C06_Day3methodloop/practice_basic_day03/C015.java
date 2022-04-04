package C06_Day3methodloop.practice_basic_day03;

public class C015 {
    public class Q02_ForEach02 {
        // String[] list = {"fruits", "vegetables", "meat", "milk"};
        // print array with for each loop TÜM ELEMENTLERİN UZUNLUGUNU YAZDIR EACH KULLANARAK
        // print length of each element

        // Part 2:
        // Print all the elements from array using for eachLoop
        // If an element starts with 'v' then quit the loop V İLE BAŞLAYAN KELİMEYİ DÖNGÜDEN ÇIKAR
        public void main(String[] args) {


            //ilk sorunun cevabı

            String[] list = {"fruits", "vegetables", "meat", "milk"};


            for (String each : list
            ) {
                System.out.print(each.length() + " ");
            }
            for (String each : list

            ) {
                System.out.print(each + " ");
            }


            String arr[]={"fruits", "vegetables", "meat", "milk"};
            for (String each : arr
            ) {
                if (!each.startsWith("v")){ //döngüden varitables çıkarttık
                    System.out.print(each +" ");
                }

            }



        }


    }


}
