package com.itacademy.one.oop;

public class Monitor extends Product{
    double diagonal;

    public Monitor(String brand, String model, double price, double diagonal) {
        super(brand, model, price);
        this.diagonal = diagonal;
    }


    //redefinisanje metode, jer je prvi put definisana u printer klasi, tamo je imala logiku 0
    //@override ukazuje na polimorfizam
    //on nasljeduje product ali ne nasljeduje printer, zato je morala ici logika
    @Override
    public int checkStock() {
        //Math.random - > static metoda - > Math je  biblioteka u kojoj su definirane skoro sve matematicke operacije
        //random je metoda koja generise slucajan broj
        //generise pseudorandom broj  opsegu od 00 do 1.0
        return (int) (Math.random()*100);

    }

    @Override
    public String toString() {
        return super.toString() + " Diagonal : " + diagonal;
    }
}
