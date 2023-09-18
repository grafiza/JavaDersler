package day10LoopsArrays;

public class ForEachLoops {
    public static void main(String[] args) {
        String cities[]=new String[5];
        cities[0]="Ankara";
        cities[1]="İstanbul";
        cities[2]="İzmir";
        cities[3]="Bursa";
        cities[4]="Çanakkale";
        
        int toplam=0;
        for(String w:cities){
            toplam+=w.length();
        }
        System.out.println("toplam = " + toplam);
    }
}
