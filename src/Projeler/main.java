package Projeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;




    public class main {
        public static void main(String[] args) {
            Random rnd = new Random();
            Scanner scan = new Scanner(System.in);
            List<user.User> userlist = new ArrayList<>();
            System.out.println("kaç adet obje oluşturacaksın");
            int objeadeti = scan.nextInt();

            for (int i = 0; i < objeadeti; i++) { //kaç adet obje girecekse döngüye soktuk

                user.User user = new user.User();//yeni bir user objesi oluşturdum
                user.setId(rnd.nextInt(100));//random dan sınırı 100 olan  rastgele ıd atamasını istedik
                System.out.println("username: ");

                user.setUsername(scan.next());
                user.setPassword();

                user.setActive(rnd.nextBoolean());

                user.setSignedIn(rnd.nextBoolean());
                userlist.add(user);
            }
            for (int i = 0; i < userlist.size(); i++) { //arraylist for döngüsüne soktuk
                //arraylist den parametrelerin hepsini getirmesini istedigim förmül
                System.out.println("ID:" + userlist.get(i).getId() + ",username :" + userlist.get(i).getUsername() +
                        " , password : " + userlist.get(i).getPassword() + " , active : " + userlist.get(i).isActive() + ", signedIn: " +
                        userlist.get(i).isSignedIn());


            }
        }
    }