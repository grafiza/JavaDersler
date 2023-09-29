package DepoUygulaması_Oop;

public enum Menu {
    OLUSTUR(1,"Ürün Oluştur"),
    LISTELE(2,"Ürünleri Listele"),
    STOKEKLE(3,"Stok Ekle"),
    STOKSIL(4,"Stok Sil"),
    RAFAKOY(5,"Rafa Koy"),
    CIKIS(0,"Çıkış");

    int menuId;
    String menuAdi;

    public int getMenuId() {
        return menuId;
    }

    public String getMenuAdi() {
        return menuAdi;
    }

    Menu(int menuId, String menuAdi) {
        this.menuId = menuId;
        this.menuAdi = menuAdi;
    }
}

