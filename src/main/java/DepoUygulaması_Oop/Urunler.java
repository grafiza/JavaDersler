package DepoUygulaması_Oop;

public enum Urunler {
    KALEM(1,"Kalem","FABER CASTEL","Adet"),
    DEFTER(2,"Defter","MOPAK","Kg"),
    KITAP(3,"Kitap","PEGASUS","Adet"),
    CIKOLATA(4,"Çikolata","ETİ","Koli"),
    SAKIZ(5,"Sakız","FALIM","Koli"),
    HALLEY(6,"Halley","ÜLKER","Adet"),
    HANIMELLER(7,"Hanımeller","ÜLKER","Adet"),
    SODA(8,"Beypazarı","BEYPAZARI","Palet");


    private final int urunKodu;
    private final String urunAdi;
    private final String uretici;
    private final String birim;

    public int getUrunKodu() {
        return urunKodu;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public String getUretici() {
        return uretici;
    }

    public String getBirim() {
        return birim;
    }

    Urunler(int urunKodu, String urunAdi, String uretici , String birim){
        this.urunKodu = urunKodu;
        this.urunAdi = urunAdi;
        this.uretici=uretici;
        this.birim=birim;
    }
}
