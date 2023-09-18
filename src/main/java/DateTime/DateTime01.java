package DateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//13:21:44.655568800

/*
DateTime.DateTime01.DateTime Class ta kullanilan tarih saat formatlari
    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
    hh : mm a ==> 12'li saat sistemi AM, PM
    HH : mm : ss==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */

        //time objesini formatladik
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH : mm");
        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println("formattedTime = " + formattedTime);

        //Date objesini formatlayalim
        LocalDate date1 = LocalDate.of(2022, 8, 28);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate = dtf2.format(date1);
        System.out.println("formattedDate = " + formattedDate);//formattedDate = Ağustos/28/2022

        //28/Ağustos/2023
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd - MMMM - yyyy");
        System.out.println(dtf3.format(date1));

        //Baska bir zaman dilimindeki tarih ve zamin nasil aliriz?

        //Tokyo da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Amsterdam da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        //Tokyo saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);


        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2023-08-29T11:10:58.291583900

        //29 * Aug * 2023 - 11 : 15
        DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("dd * MMM * yyyy - hh : mm" );
        String formattedLdt =dtf4.format(ldt);
        System.out.println(formattedLdt);

    }

    public static class DateTime {
        public static void main(String[] args) {
            /*
            Al!'n!n kaç gün yasadıgını bulan kodu yazınız.
    Al!'n!n dogum tar!h! 12 Mayıs 2002'd!r.
             */
            LocalDate dogumGunu=LocalDate.of(1980,12,9);
            LocalDate bugun=LocalDate.now();
            long gunSayisi= ChronoUnit.DAYS.between(dogumGunu,bugun);
            System.out.println("gunSayisi = " + gunSayisi);

            /*
            Al!'n!n kaç ay yasadıgını bulan kodu yazınız.
    Al!'n!n dogum tar!h! 4 Haz!ran 1997'd!r.
             */
            LocalDate dogumGunu1 = LocalDate.of(1997, 06, 04);
            LocalDate bugun1= LocalDate.now();
            long aySayisi=ChronoUnit.MONTHS.between(dogumGunu1,bugun1);
            System.out.println("aySayisi = " + aySayisi);
    /*
    Al!'n!n dogum tar!h!nden 2 yıl, 3 ay ve 12 gün
    sonrak! tam tar!h! bulmak !ç!n kodu yazınız.
     */
            LocalDate sonTarih=dogumGunu1.plusYears(2).plusMonths(3).plusDays(12);
            System.out.println("sonTarih = " + sonTarih);


            /*
            Al!, 29 Ek!m 1923'ten 45 yıl 8 ay 5 gün sonra dogmustur.
    Vel!, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce dogmustur.
    Al! ve Vel!'n!n kes!n dogum tar!h!n! hesaplamak !ç!n kodu yazınız.
    Al! ve Vel!'n!n dogum tar!h!n!n aynı olup olmadıgını kontrol etmek !ç!n kodu yazınız.
             */
            LocalDate tarih1=LocalDate.of(1923,10,29);
            LocalDate tarih2=LocalDate.of(1993,9,15);
            LocalDate alininDogumTarihi=tarih1.plusYears(45).plusMonths(8).plusDays(5);
            LocalDate velininDogumTarihi=tarih2.minusYears(24).minusMonths(2).minusDays(11);
            System.out.println("alininDogumTarihi = " + alininDogumTarihi);
            System.out.println("velininDogumTarihi = " + velininDogumTarihi);


            /*
            Vel!, Al!'den 3 yıl 11 gün sonra dogmustur.
    Al! s!ze dogum tar!h! b!lg!s!n! 24 Kasım 2012 olarak verm!st!r.
    Vel!'n!n dogum tar!h!n! hesaplamak !ç!n gerekl! kodu yazınız.
             */
            LocalDate aliDT=LocalDate.of(2012,11,24);
            LocalDate veliDT=aliDT.plusYears(3).plusDays(11);
            System.out.println("veliDT = " + veliDT);


            /*
            Kend!n!z!n ve çocugunuzun dogum tar!h! !ç!n Tar!h Degerler! olusturup, ardından farkı gün
    olarak hesaplayınız.
             */

            LocalDate dt=LocalDate.of(1980,12,9);
            LocalDate dtHarun=LocalDate.of(2007,11,8);
            long fark=ChronoUnit.DAYS.between(dt,dtHarun);
            System.out.println("fark = " + fark);


            /*
            Bel!rl! b!r tar!hte yılın son 2 hanes!n! alınız.
             */
            int sonIkiRakam=dt.getYear()%100;
            System.out.println("sonIkiRakam = " + sonIkiRakam);
    /*
    Bel!rl! b!r yılın "Artık yıl" olup olmadıgını kontrol etmek !ç!n kodu yazınız.
    Artık Yıl:
    i) Bir yıl 100'e ve 400'e tam bölünüyorsa buna artık yıl denir. Örnegin; 2000 artık yıl, 1900
    degildir.
    ii) Bir yıl 100'e ve 4'e tam bölünemiyorsa artık yıl olarak adlandırılır. Örnegin; 2004 artık yıl, 2007
    degildir.
     */

            LocalDate artikMi=LocalDate.of(2000,10,10);
            int yil=artikMi.getYear();
            if(yil%100==0 && yil%400==0)
                System.out.println(artikMi+" artık yıldır");
            else
                System.out.println(artikMi+ " artık yıl değildir.");

    /*

    Ik! farklı tar!h!n ay numaralarının toplamını bulunuz.
     */
            LocalDate tarih11 = LocalDate.of(1996, 8, 21);
            LocalDate tarih12 = LocalDate.of(2015, 3, 12);
            System.out.println(""+tarih11.getMonth()+tarih12.getMonth());
    /*
    Ik! farklı tar!h !ç!n saat farkını bulunuz.
     */

            long saatFarki=ChronoUnit.HOURS.between(tarih11,tarih12);
            System.out.println("saatFarki = " + saatFarki);
        }
    }
}

