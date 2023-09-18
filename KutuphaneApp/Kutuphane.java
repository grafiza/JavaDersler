package KutuphaneApp;

import java.util.Arrays;
import java.util.List;

public class Kutuphane {
    public List<Kitap> kitap;
    public Kutuphane(){};

    public List<Kitap> getKitap() {
        return kitap;
    }

    public void setKitap(List<Kitap> kitap) {
        this.kitap = kitap;
    }

    public void printBooks(){
            for (Kitap w:this.kitap                 ) {
                System.out.println(w);
            }
        }

}
