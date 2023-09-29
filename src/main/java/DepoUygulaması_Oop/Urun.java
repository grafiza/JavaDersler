package DepoUygulaması_Oop;

public class Urun {
    private int urunId;
    private String urunAdi;
    private String uretici;
    private int miktar;
    private String birim;
    private String raf;

    public Urun() {
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
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

    public Urun(int urunId, String urunAdi, String uretici, String birim) {
        this.urunId = urunId;
        this.urunAdi = urunAdi;
        this.uretici = uretici;
        this.birim = birim;
        this.miktar=0;
        this.raf="-";
    }
}
