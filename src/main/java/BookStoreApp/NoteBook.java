package BookStoreApp;

public class NoteBook extends Product{
    private String brand;
    private String sheet;
    private String code;

    public NoteBook(){

    }
    public NoteBook(String name, double price, int stock, String brand, String sheet, String code) {
        super(name, price, stock);
        this.brand = brand;
        this.sheet = sheet;
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSheet() {
        return sheet;
    }

    public void setSheet(String sheet) {
        this.sheet = sheet;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
