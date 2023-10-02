package BiletRezervasyonApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Otobus {
    Map<Integer,String> koltuklar=new HashMap<>();
    String plaka;

    public Otobus() {
    }

    public Otobus(String plaka) {
        this.plaka = plaka;
        for (int i = 1; i < 33; i++) {
            this.koltuklar.put(i,"Boş");
        }
    }

}
