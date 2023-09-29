package Constructor01;

public class C01Constructor {
    static int sayac = 100;
    int x;
    int y;

    public C01Constructor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int id;

    public int idAtama() {
        id = sayac;
        sayac++;
        return id;
    }

}
