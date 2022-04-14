package Projeler;

public class Arabamain {



        public static void main(String[] args) {
            Araba honda=new Araba();
            //hondaya buradan set methodunu çagırarak elle parametreli  yapabiliriz
            honda.setModel("cıvıc");
            honda.setRenk("mavi");
            honda.setYıl(2000);
            //motor a atama yapmadım default deger yazdırır

            Araba toyota=new Araba("corolla","beyaz",300,-2022);//parametreli cons create ettik
            Araba volvo=new Araba("sc90","kırmızı",3000,2020);//parametreli cons create ettik
            Araba hacımurat=new Araba("porti",1984);
            System.out.println(hacımurat);

            System.out.println(honda);//parametresiz oldugu için default degerler atar
            System.out.println("seçtiginiz araç toyota>>>"+" modeli :" +toyota.getModel() +"renk:"  +toyota.getRenk()+
                    "motor gücü:" + toyota.getMotor()+ "yılı:" + toyota.getYıl()); //elle yazdık tostring olmazsa böylede yapabiliriz
            System.out.println("volvo aracı:"  + volvo);//volvo aracı:Araba{model='sc90', renk='kırmızı', motor=3000, yıl=2020}
            //tostring methoduna göre yazdırdı
        }
    }

