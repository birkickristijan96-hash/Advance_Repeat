package com.itacademy.one.oop;

public class Printer extends Product{
    boolean color;



    public Printer(String brand, String model, double price, boolean color) {
        //poziv roditeljskog konstruktora, koji mora tocno biti na ovom mjestu ovdje
        //jer super naredba uvijek ide prva, uvijek je prvo ono sto se naljeduje od roditeljske klase
        //tek onda idu polja kao parametar konstruktora od klase u kojoj se nalazimo
        //bitan je redoslijed -> presudan!!!
        //ako super nije prva naredba nece proci izvrsavanje ni u compile timeu
        super(brand, model, price);
        this.color = color;
    }

    @Override
    public int checkStock() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " Color : " + color;
    }
}
