package DepoApp;

public class Urun {
    private String id;
    private String urunAdi;
    private String uretici;
    private int miktar;
    private String birim;
    private String raf;

    public Urun() {
    }

    public Urun(String id, String urunAdi, String uretici, int miktar, String birim, String raf) {
        this.id = id;
        this.urunAdi = urunAdi;
        this.uretici = uretici;
        this.birim = birim;
        this.miktar=0;
        this.raf="-";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
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
        return id +"\t"+ urunAdi +"\t\t"+ uretici +"\t\t\t"+ miktar +"\t\t"+birim +"\t\t"+ raf +"\n";
    }
}
