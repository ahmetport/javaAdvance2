package Projeler;

import java.util.Scanner;

public class user {




    public static class User {
        private int ıd;
        private String username;
        private String password;//şifre her girdigimde null degeri veriyor neden?
        private boolean active;
        private boolean signedIn;

        public User(){//biz parametreli constructur oluşturunca java nın oluşturdugu constructur ölür onun yerine elle
            //parameteresiz constructur oluştururuz

        }

        public User(int ıd, String username, String password, boolean active, boolean signedIn) {
            this.ıd = ıd;
            this.username = username;
            this.password = password;
            this.active = active;
            this.signedIn = signedIn;
        }

        public int getId() {
            return ıd;
        }

        public void setId(int ıd) {
            this.ıd = ıd;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword() {
            Scanner scan=new Scanner(System.in);
            while(true) {
                System.out.println("password:" );
                int şifre=scan.nextInt();
                String şifreStr=String.valueOf(şifre);//string olab şifreyi volueof ile integer e çevirdik
                if(şifreStr.length()>=6){
                    this.password = password;
                    break;
                }else{
                    System.out.println("şifre en az 6 haneli olmalı");
                }
            }
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }

        public boolean isSignedIn() {
            return signedIn;
        }

        public void setSignedIn(boolean signedIn) {
            this.signedIn = signedIn;
        }
    }


}
