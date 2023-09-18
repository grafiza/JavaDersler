package KitaptanSorular;

public class DoWhile01 {
    public static void main(String[] args) {
        /*
        Do-wh!le döngüsünü kullanarak konsolda 'C' !le 'A' arasındak! karakterler! yazdırmak !ç!n
kod yazınız.
         */
        char ch = 'C';
        String result = "";
        do{
            result = result + ch;
            ch--;
        }while(ch>='A');
        System.out.println(result);


        /*
        B!r Str!ng de, !lk 'm' karakter!nden öncek! tüm karakterler! yazınız.
         */
        String metin="Bu paragrafta bazı harfler yazılmamıştır.";
        String yeni="";
        for (int i = 0; i < metin.length(); i++) {

            if(metin.charAt(i)=='m') {
                yeni = metin.substring(0, i );
                break;
            }
        }
        System.out.println(yeni);

    }
}
