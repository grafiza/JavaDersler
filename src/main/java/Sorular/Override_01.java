package Sorular;

public class Override_01 {
    private void go(){
        System.out.println("good");
    }
    private class Test extends Override_01{

        public void go(){
            System.out.println("bad"    );
        }
    }


}
