package C06_Day3methodloop.practice_basic_day03;

public class C015 {
    public static void main(String[] args) {


                StringBuilder sb1=new StringBuilder("yaşasın java");
                System.out.println(sb1.indexOf("java"));//8
                System.out.println(sb1.lastIndexOf("s"));//4
                System.out.println(sb1.indexOf("s"));//2
                System.out.println(sb1.replace(0,7,"ne güzel"));
                System.out.println(sb1.toString().toUpperCase());// NE GÜZEL JAVA
                System.out.println(sb1); // ne güzel java
                System.out.println(sb1.delete(0,3));//güzel java
                System.out.println(sb1.deleteCharAt(5));//güzeljava

            }

            }


