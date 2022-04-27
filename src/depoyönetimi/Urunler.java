package depoyönetimi;

public class Urunler {


    private String urunIsmi;
    private String üretici;
    private int miktar;
    private String birim;
    private String raf;

    public Urunler(){
        //ELLE boş cons oluşturdum
    }

    public Urunler(String urunIsmi, String üretici, int miktar, String birim, String raf) {
        this.urunIsmi = urunIsmi;
        this.üretici = üretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getÜretici() {
        return üretici;
    }

    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "Urunler{" +
                "urunIsmi='" + urunIsmi + '\'' +
                ", üretici='" + üretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +"\n";

    }
}


