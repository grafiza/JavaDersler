package Sorular.KahveMakinesiApp;

public class Kahve {
    public Kahve() {
    }



    public void setMilk(boolean milk) {
        isMilk = milk;
    }



    public void setTypeOfCoffee(String typeOfCoffee) {
        this.typeOfCoffee = typeOfCoffee;
    }



    public void setSugar(boolean sugar) {
        isSugar = sugar;
    }



    public void setCountOfSugar(int countOfSugar) {
        this.countOfSugar = countOfSugar;
    }



    public void setSizeOfCoffee(String sizeOfCoffee) {
        this.sizeOfCoffee = sizeOfCoffee;
    }


    public boolean isMilk;
    public String typeOfCoffee;
    public boolean isSugar;
    public int countOfSugar;
    public String sizeOfCoffee;

    public void printCoffee(){
        String sugar=this.isSugar==true?this.countOfSugar+" şekerli":"şekersiz";
        String milk=this.isMilk==true?"Sütlü":"Süt ilavesiz";

        System.out.println(
                "Seçiminiz : \n"    +
                this.typeOfCoffee+"\n"   +
                sugar+"\n"+
                milk+"\n"+
                this.sizeOfCoffee+"\n"+
                "Hazırlanıyor\nAfiyet olsun..."
                );
    }

}
