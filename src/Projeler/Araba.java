package Projeler;

public class Araba {


         //biz bu classlara POJO classı diyoruz yani ana class depo class
        private String model;
        private String renk;
        private int motor;
        private int yıl;

        public Araba(){ //parametresiz cons biz oluşturduk java default constructur yerine

        }

        public Araba(String model, String renk, int motor, int yıl) { //parametreli cons oluşturduk
            this.model = model;
            this.renk = renk;
            // this.motor = motor;
            // this.yıl = yıl;
            setMotor(motor);//obj create etmek için parametre olarak giren motor datası
            setYıl(yıl);//setmotor()methodunaparametre olarak çalıştı degerini aldı
        }

        public Araba(String model, int yıl) {//iki parametreli cons create ettik
            this.model = model;
            this.yıl = yıl;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getRenk() {
            return renk;
        }

        public void setRenk(String renk) {
            this.renk = renk;
        }

        public int getMotor() {
            return motor;
        }

        public void setMotor(int motor) {//5 madde yi burda yapıyoruz
            if(motor<1000){
                System.out.println("motor 1000cc nın altında olamaz");
            }else
                this.motor = motor;
        }


        public int getYıl() {
            return yıl;
        }

        public void setYıl(int yıl) {//- yıl girerse düzeltsin yılı korumaya aldık encapsulatıon ettik
            if(yıl<=0){
                this.yıl = (-1)*yıl;
                System.out.println("milattan önce araba olmaz");
            }else
                this.yıl = yıl;
        }


        @Override
        public String toString() {
            return "Araba{" +
                    "model='" + model + '\'' +
                    ", renk='" + renk + '\'' +
                    ", motor=" + motor +
                    ", yıl=" + yıl +
                    '}';
        }
    }



