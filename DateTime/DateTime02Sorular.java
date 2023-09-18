package DateTime;

import java.time.LocalTime;

public class DateTime02Sorular {
    public static void main(String[] args) {
        /*
        Eger saat
!) 24:00 !le 05:00 arasında !se konsola 'Uyku zamanı' yazdırınız.
!!) 08:00 !le 16:00 arasında !se konsola 'Çalısma zamanı' yazdırınız.
!!!) 19:00 !le 22:00 arasında !se konsola 'A!le zamanı' yazdırınız.
!v) D!gerler! !ç!n konsolda 'K!s!sel zaman' yazdırınız.
         */

        LocalTime bugununTarihi=   LocalTime.now();
        int saat=bugununTarihi.getHour();
        System.out.println("saat = " + saat);
        if(saat<=5)
            System.out.println("Uyku Zamanı");
        else if(saat>8 && saat<16)
            System.out.println("Çalışma Zamanı");
        else if(saat>19 && saat<22)
            System.out.println("Aile Zamanı");
        else System.out.println("Kişisel zaman");
    }
}
