package Practice05ForLoops;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */

        ArrayList <String> gunler=new ArrayList<>();
        
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        ArrayList<Double> gunlukKazanclar=new ArrayList<Double>();
        int i=0;
        Scanner scan=new Scanner(System.in);
        
        while (i<7){
            System.out.println(gunler.get(i)+" günü kazancını giriniz :");
            gunlukKazanclar.add(scan.nextDouble());  
            i++;
        }
        System.out.println("Ortalama Kazanç : "+getOrtalamaKazanc(gunlukKazanclar));
        System.out.println("---------------------------------");
        Double ortalamaKazanc=getOrtalamaKazanc(gunlukKazanclar);

        ArrayList<String> ortalamaUstu=getOrtalamaninUstundeKazancGünleri(ortalamaKazanc,gunlukKazanclar,gunler);
        System.out.println("Ortalamanın üstündeki günler :"+ortalamaUstu);


        ArrayList<String> ortalamaAlti=getOrtalamaninAltindaKazancGünleri(ortalamaKazanc,gunlukKazanclar,gunler);
        System.out.println("Ortalamanın altındaki günler :"+ortalamaAlti);

    }
    public static double getOrtalamaKazanc(ArrayList<Double> a){
        double sum=0;
        for (double w : a ) {
            sum=sum+w;
        }
        double ortalama=sum/a.size();
        return  ortalama;
    }
    public static ArrayList<String> getOrtalamaninUstundeKazancGünleri(double ort,ArrayList<Double> kazanc, ArrayList<String> days){
        int i=0;
        ArrayList<String> liste=new ArrayList<>();
        for (Double w:kazanc) {
            if(w>ort)
                liste.add(days.get(i));

            i++;
        }
        return liste;
    }
    public static ArrayList<String> getOrtalamaninAltindaKazancGünleri(double ort,ArrayList<Double> kazanc,ArrayList<String> days ){
        int i=0;
        ArrayList<String> liste=new ArrayList<>();
        for (Double w:kazanc) {
            if(w<ort)
                liste.add(days.get(i));

            i++;
        }
        return liste;
    }
    
}
