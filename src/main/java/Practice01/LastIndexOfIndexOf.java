package Practice01;

public class LastIndexOfIndexOf {
    public static void main(String[] args) {
        String text="accessories";
        int ilk=0;
        int son=0;

        String yaz="";
for(int i=0;i<text.length();i++){
    String s=text.substring(i,i+1);
    if(text.indexOf(s)!=text.lastIndexOf(s))
        if(!yaz.contains(s))
            yaz+=s;

}
        System.out.println(yaz);
    }
}
