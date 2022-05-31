package Interwıevsorular;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class C09_soru {

//  Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.
    // Input1={1,2,3,4}
    // Input2={5,6}
    // Output={1,2,3,4,5,6}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]={1,2,3,4};
        int arr1[]={5,6};
        int yeniarr[]=new int[arr.length+arr1.length];
        for (int i=0; i<arr.length+arr1.length; i++) {
            if(i<arr.length){
                yeniarr[i]=arr[i];
            }else{
                yeniarr[i]=arr1[i-arr.length];
            }
        }
        System.out.println(Arrays.toString(yeniarr));
    }
}
